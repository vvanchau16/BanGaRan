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

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "GIOHANG")
public class Giohang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maGioHang")
    private String maGioHang;
    @JoinColumn(name = "maKH", referencedColumnName = "maKH")
    @OneToOne(optional = false)
    private Khachhang maKH;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maGioHang")
    private List<Ctgiohang> ctgiohangList;

    public Giohang() {
    }

    public Giohang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }

    public List<Ctgiohang> getCtgiohangList() {
        return ctgiohangList;
    }

    public void setCtgiohangList(List<Ctgiohang> ctgiohangList) {
        this.ctgiohangList = ctgiohangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maGioHang != null ? maGioHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giohang)) {
            return false;
        }
        Giohang other = (Giohang) object;
        if ((this.maGioHang == null && other.maGioHang != null) || (this.maGioHang != null && !this.maGioHang.equals(other.maGioHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Giohang[ maGioHang=" + maGioHang + " ]";
    }
    
}
