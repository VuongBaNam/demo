package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Address implements Serializable {
    private int idaddress;
    private String tenDuong;
    private String tenPhuong;
    private String tenQuan;
    private String tenTp;

    @Id
    @Column(name = "idaddress")
    public int getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(int idaddress) {
        this.idaddress = idaddress;
    }

    @Basic
    @Column(name = "ten_duong")
    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    @Basic
    @Column(name = "ten_phuong")
    public String getTenPhuong() {
        return tenPhuong;
    }

    public void setTenPhuong(String tenPhuong) {
        this.tenPhuong = tenPhuong;
    }

    @Basic
    @Column(name = "ten_quan")
    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    @Basic
    @Column(name = "ten_tp")
    public String getTenTp() {
        return tenTp;
    }

    public void setTenTp(String tenTp) {
        this.tenTp = tenTp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (idaddress != address.idaddress) return false;
        if (tenDuong != null ? !tenDuong.equals(address.tenDuong) : address.tenDuong != null) return false;
        if (tenPhuong != null ? !tenPhuong.equals(address.tenPhuong) : address.tenPhuong != null) return false;
        if (tenQuan != null ? !tenQuan.equals(address.tenQuan) : address.tenQuan != null) return false;
        if (tenTp != null ? !tenTp.equals(address.tenTp) : address.tenTp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idaddress;
        result = 31 * result + (tenDuong != null ? tenDuong.hashCode() : 0);
        result = 31 * result + (tenPhuong != null ? tenPhuong.hashCode() : 0);
        result = 31 * result + (tenQuan != null ? tenQuan.hashCode() : 0);
        result = 31 * result + (tenTp != null ? tenTp.hashCode() : 0);
        return result;
    }
}
