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
@Table(name = "DANHMUC")
public class Danhmuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    
    @Column(name = "maDM")
    private String maDM;
    @Basic(optional = false)
    @Column(name = "tenDanhMuc")
    private String tenDanhMuc;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDM")
    private List<Monan> monanList;

    public Danhmuc() {
    }

    public Danhmuc(String maDM) {
        this.maDM = maDM;
    }

    public Danhmuc(String maDM, String tenDanhMuc) {
        this.maDM = maDM;
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public List<Monan> getMonanList() {
        return monanList;
    }

    public void setMonanList(List<Monan> monanList) {
        this.monanList = monanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDM != null ? maDM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhmuc)) {
            return false;
        }
        Danhmuc other = (Danhmuc) object;
        if ((this.maDM == null && other.maDM != null) || (this.maDM != null && !this.maDM.equals(other.maDM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Danhmuc[ maDM=" + maDM + " ]";
    }
    
}
