import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ApiResponse } from '../model/api.response';
import {Observable} from "rxjs/index";
import { SinhVien } from '../model/sinhvien.model';
@Injectable({
  providedIn: 'root'
})
export class SinhVienService {

  constructor(private http: HttpClient) { }
  private baseUrl  = "http://localhost:8080/qlsv/api/sinhvien/listsinhviens/";

  

  getSinhVien() : Observable<SinhVien[]> {
    return this.http.get<SinhVien[]>(this.baseUrl);
  }

  getSinhVienBymaSV(id: number): Observable<any> {
    return this.http.get(this.baseUrl + id);
  }

  createSinhVien(sinhvien: SinhVien): Observable<object> {
    return this.http.post<object>("http://localhost:8080/qlsv/api/sinhvien/createsinhvien", sinhvien);
  }

  updateSinhVien(ma_SV: number, sinhvien: SinhVien): Observable<object> {
    return this.http.put<object>(this.baseUrl + sinhvien.ma_SV, sinhvien);
  }

  deleteSinhVien(ma_SV: number): Observable<any> {
    return this.http.delete<any>("http://localhost:8080/qlsv/api/sinhvien/deletesinhvien/" + ma_SV);
  }
}
