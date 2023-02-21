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
@Table(name = "MONAN")
public class Monan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maMonAn")
    private String maMonAn;
    @Basic(optional = false)

    @Column(name = "tenMonAn")
    private String tenMonAn;
    @Basic(optional = false)
    
    @Column(name = "trangThai")
    private boolean trangThai;
    @Basic(optional = false)

    @Column(name = "hinhAnh")
    private String hinhAnh;
    @Basic(optional = false)

    @Column(name = "moTa")
    private String moTa;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maMonAn")
    private List<Ctdh> ctdhList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maMonAn")
    private List<Ctkm> ctkmList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maMonAn")
    private List<Ctgia> ctgiaList;

    @JsonIgnore
    @JoinColumn(name = "maDM", referencedColumnName = "maDM")
    @ManyToOne(optional = false)
    private Danhmuc maDM;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maMonAn")
    private List<Ctgiohang> ctgiohangList;

    public Monan() {
    }

    public Monan(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public Monan(String maMonAn, String tenMonAn, boolean trangThai, String hinhAnh, String moTa) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public List<Ctdh> getCtdhList() {
        return ctdhList;
    }

    public void setCtdhList(List<Ctdh> ctdhList) {
        this.ctdhList = ctdhList;
    }

    public List<Ctkm> getCtkmList() {
        return ctkmList;
    }

    public void setCtkmList(List<Ctkm> ctkmList) {
        this.ctkmList = ctkmList;
    }

    public List<Ctgia> getCtgiaList() {
        return ctgiaList;
    }

    public void setCtgiaList(List<Ctgia> ctgiaList) {
        this.ctgiaList = ctgiaList;
    }

    public Danhmuc getMaDM() {
        return maDM;
    }

    public void setMaDM(Danhmuc maDM) {
        this.maDM = maDM;
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
        hash += (maMonAn != null ? maMonAn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monan)) {
            return false;
        }
        Monan other = (Monan) object;
        if ((this.maMonAn == null && other.maMonAn != null) || (this.maMonAn != null && !this.maMonAn.equals(other.maMonAn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Monan[ maMonAn=" + maMonAn + " ]";
    }
    
}
