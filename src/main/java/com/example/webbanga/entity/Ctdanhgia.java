/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.webbanga.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "CTDANHGIA")
public class Ctdanhgia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "idDanhGia")
    private Long idDanhGia;
    @Basic(optional = false)
    @Column(name = "soSao")
    private int soSao;
    @Basic(optional = false)
    @Column(name = "ngayDanhGia")
    @Temporal(TemporalType.DATE)
    private Date ngayDanhGia;
    @Basic(optional = false)
    @Column(name = "nhanXet")
    private String nhanXet;
    @JoinColumn(name = "idCTDH", referencedColumnName = "idCTDH")
    @ManyToOne(optional = false)
    private Ctdh idCTDH;
    @JoinColumn(name = "maKH", referencedColumnName = "maKH")
    @ManyToOne(optional = false)
    private Khachhang maKH;

    public Ctdanhgia() {
    }

    public Ctdanhgia(Long idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public Ctdanhgia(Long idDanhGia, int soSao, Date ngayDanhGia, String nhanXet) {
        this.idDanhGia = idDanhGia;
        this.soSao = soSao;
        this.ngayDanhGia = ngayDanhGia;
        this.nhanXet = nhanXet;
    }

    public Long getIdDanhGia() {
        return idDanhGia;
    }

    public void setIdDanhGia(Long idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public int getSoSao() {
        return soSao;
    }

    public void setSoSao(int soSao) {
        this.soSao = soSao;
    }

    public Date getNgayDanhGia() {
        return ngayDanhGia;
    }

    public void setNgayDanhGia(Date ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    public Ctdh getIdCTDH() {
        return idCTDH;
    }

    public void setIdCTDH(Ctdh idCTDH) {
        this.idCTDH = idCTDH;
    }

    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDanhGia != null ? idDanhGia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctdanhgia)) {
            return false;
        }
        Ctdanhgia other = (Ctdanhgia) object;
        if ((this.idDanhGia == null && other.idDanhGia != null) || (this.idDanhGia != null && !this.idDanhGia.equals(other.idDanhGia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Ctdanhgia[ idDanhGia=" + idDanhGia + " ]";
    }
    
}
