/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webbanga.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "KHACHHANG")
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maKH")
    private String maKH;
    @Basic(optional = false)

    @Column(name = "hoKH")
    private String hoKH;
    @Basic(optional = false)

    @Column(name = "tenKH")
    private String tenKH;
    @Basic(optional = false)
    
    @Column(name = "gioiTinh")
    private boolean gioiTinh;
    @Basic(optional = false)

    @Column(name = "SDT")
    private String sdt;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)

    @Column(name = "email")
    private String email;
    @Basic(optional = false)

    @Column(name = "diaChi")
    private String diaChi;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKH")
    private List<Donhang> donhangList;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "maKH")
    private Giohang giohang;
    @JsonIgnore
    @JoinColumn(name = "tenDN", referencedColumnName = "tenDN")
    @OneToOne(optional = false)
    private Taikhoan tenDN;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKH")
    private List<Ctdanhgia> ctdanhgiaList;

    public Khachhang() {
    }

    public Khachhang(String maKH) {
        this.maKH = maKH;
    }

    public Khachhang(String maKH, String hoKH, String tenKH, boolean gioiTinh, String sdt, String email, String diaChi) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<Donhang> getDonhangList() {
        return donhangList;
    }

    public void setDonhangList(List<Donhang> donhangList) {
        this.donhangList = donhangList;
    }

    public Giohang getGiohang() {
        return giohang;
    }

    public void setGiohang(Giohang giohang) {
        this.giohang = giohang;
    }

    public Taikhoan getTenDN() {
        return tenDN;
    }

    public void setTenDN(Taikhoan tenDN) {
        this.tenDN = tenDN;
    }

    public List<Ctdanhgia> getCtdanhgiaList() {
        return ctdanhgiaList;
    }

    public void setCtdanhgiaList(List<Ctdanhgia> ctdanhgiaList) {
        this.ctdanhgiaList = ctdanhgiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maKH != null ? maKH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.maKH == null && other.maKH != null) || (this.maKH != null && !this.maKH.equals(other.maKH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Khachhang[ maKH=" + maKH + " ]";
    }
    
}
