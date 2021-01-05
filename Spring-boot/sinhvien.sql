CREATE TABLE `SINHVIEN` (
  `ma_SV` int(11) NOT NULL,
  `ten_SV` varchar(250) NOT NULL,
  `ngay_Sinh` date NOT NULL,
  `ten_Lop` varchar(250) NOT NULL,
    `ten_Khoa` varchar(250) NOT NULL,
  PRIMARY KEY (`ma_SV`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;