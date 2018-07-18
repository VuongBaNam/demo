package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Job implements Serializable {
    private int idjob;
    private String viTri;
    private String tenCongty;

    @Id
    @Column(name = "idjob")
    public int getIdjob() {
        return idjob;
    }

    public void setIdjob(int idjob) {
        this.idjob = idjob;
    }

    @Basic
    @Column(name = "vi_tri")
    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Basic
    @Column(name = "ten_congty")
    public String getTenCongty() {
        return tenCongty;
    }

    public void setTenCongty(String tenCongty) {
        this.tenCongty = tenCongty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (idjob != job.idjob) return false;
        if (viTri != null ? !viTri.equals(job.viTri) : job.viTri != null) return false;
        if (tenCongty != null ? !tenCongty.equals(job.tenCongty) : job.tenCongty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idjob;
        result = 31 * result + (viTri != null ? viTri.hashCode() : 0);
        result = 31 * result + (tenCongty != null ? tenCongty.hashCode() : 0);
        return result;
    }
}
