package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@IdClass(UserPK.class)
public class User implements Serializable {
    private int iduser;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private int jobId;
    private int addressId;
    private Job jobByJobId;
    private Address addressByAddressId;

    @Id
    @Column(name = "iduser")
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "ho_ten")
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Basic
    @Column(name = "gioi_tinh")
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "ngay_sinh")
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Id
    @Column(name = "job_id",insertable = false,updatable = false)
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Id
    @Column(name = "address_id", insertable = false,updatable = false)
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (iduser != user.iduser) return false;
        if (jobId != user.jobId) return false;
        if (addressId != user.addressId) return false;
        if (hoTen != null ? !hoTen.equals(user.hoTen) : user.hoTen != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(user.gioiTinh) : user.gioiTinh != null) return false;
        if (ngaySinh != null ? !ngaySinh.equals(user.ngaySinh) : user.ngaySinh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iduser;
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (ngaySinh != null ? ngaySinh.hashCode() : 0);
        result = 31 * result + jobId;
        result = 31 * result + addressId;
        return result;
    }
}
