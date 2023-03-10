/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webbanga.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TAIKHOAN")
public class Taikhoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tenDN")
    private String tenDN;
    @Basic(optional = false)
    @Column(name = "matKhau")
    private String matKhau;
    @Basic(optional = false)
    
    @Column(name = "trangThaiNghi")
    private boolean trangThaiNghi;
    @JoinColumn(name = "maQuyen", referencedColumnName = "maQuyen")
    @ManyToOne(optional = false)
    private Quyen maQuyen;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tenDN")
    private Khachhang khachhang;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tenDN")
    private Nhanvien nhanvien;

    public Taikhoan() {
    }

    public Taikhoan(String tenDN) {
        this.tenDN = tenDN;
    }

    public Taikhoan(String tenDN, String matKhau, boolean trangThaiNghi) {
        this.tenDN = tenDN;
        this.matKhau = matKhau;
        this.trangThaiNghi = trangThaiNghi;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean getTrangThaiNghi() {
        return trangThaiNghi;
    }

    public void setTrangThaiNghi(boolean trangThaiNghi) {
        this.trangThaiNghi = trangThaiNghi;
    }

    public Quyen getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(Quyen maQuyen) {
        this.maQuyen = maQuyen;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenDN != null ? tenDN.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taikhoan)) {
            return false;
        }
        Taikhoan other = (Taikhoan) object;
        if ((this.tenDN == null && other.tenDN != null) || (this.tenDN != null && !this.tenDN.equals(other.tenDN))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Taikhoan[ tenDN=" + tenDN + " ]";
    }
    
}
