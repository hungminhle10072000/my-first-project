package com.dtdm.qlsv.controller;

import com.dtdm.qlsv.model.SinhVien;
import com.dtdm.qlsv.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/sinhvien")
public class SinhVienController {
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @GetMapping("/listsinhviens")
    public List<SinhVien> getAllsinhViens(){
        return sinhVienRepository.findAll();
    }

    @GetMapping("/listsinhviens/{id}")
    public ResponseEntity<SinhVien> getSinhVienId(@PathVariable(value = "id") Integer sinhvienId)
            throws ResourceNotFoundException {
        SinhVien sinhVien=sinhVienRepository.findById(sinhvienId).
                orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy sinh viên với mã :: " + sinhvienId));
        return ResponseEntity.ok().body(sinhVien);
    }

    @PostMapping("/createsinhvien")
    public SinhVien createSinhvien(@Valid @RequestBody SinhVien sinhVien){
        return sinhVienRepository.save(sinhVien);
    }

    @PutMapping("/listsinhviens/{id}")
    public ResponseEntity<SinhVien> updateSinhVien(@PathVariable(value = "id") Integer sinhVienId,
                                                   @Valid @RequestBody SinhVien sinhVienDetails) throws ResourceNotFoundException{
        SinhVien sinhVien=sinhVienRepository.findById(sinhVienId).
                orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy sinh viên với mã :: " + sinhVienId));
        sinhVien.setMa_SV(sinhVienDetails.getMa_SV());
        sinhVien.setTen_SV(sinhVienDetails.getTen_SV());
        sinhVien.setNgay_Sinh(sinhVienDetails.getNgay_Sinh());
        sinhVien.setTen_Lop(sinhVienDetails.getTen_Lop());
        sinhVien.setTen_Khoa(sinhVienDetails.getTen_Khoa());
        final SinhVien updateSinhVien=sinhVienRepository.save(sinhVien);
        return ResponseEntity.ok(updateSinhVien);
    }

    @DeleteMapping("/deletesinhvien/{id}")
    public Map<String, Boolean> deleteSinhVien(@PathVariable(value = "id") Integer sinhVienId)
            throws ResourceNotFoundException{
        SinhVien sinhVien=sinhVienRepository.findById(sinhVienId).
                orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy sinh viên với mã :: " + sinhVienId));
        sinhVienRepository.delete(sinhVien);
        Map<String, Boolean> response= new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
