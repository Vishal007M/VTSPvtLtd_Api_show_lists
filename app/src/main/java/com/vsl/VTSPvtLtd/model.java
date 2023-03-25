package com.vsl.VTSPvtLtd;

public class model {

    String No, Customer_No,Customer_Name,Customer_PO_No_, Posting_Date,Transporter_Name,Scanned,Document_Status,QC_Remarks;

    public model() {
    }

    public model(String no, String customer_No, String customer_Name, String customer_PO_No_, String posting_Date, String transporter_Name, String scanned, String document_Status, String QC_Remarks) {
        this.No = no;
        this.Customer_No = customer_No;
        this.Customer_Name = customer_Name;
        this.Customer_PO_No_ = customer_PO_No_;
        this.Posting_Date = posting_Date;
        this.Transporter_Name = transporter_Name;
        this.Scanned = scanned;
        this.Document_Status = document_Status;
        this.QC_Remarks = QC_Remarks;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getCustomer_No() {
        return Customer_No;
    }

    public void setCustomer_No(String customer_No) {
        Customer_No = customer_No;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getCustomer_PO_No_() {
        return Customer_PO_No_;
    }

    public void setCustomer_PO_No_(String customer_PO_No_) {
        Customer_PO_No_ = customer_PO_No_;
    }

    public String getPosting_Date() {
        return Posting_Date;
    }

    public void setPosting_Date(String posting_Date) {
        Posting_Date = posting_Date;
    }

    public String getTransporter_Name() {
        return Transporter_Name;
    }

    public void setTransporter_Name(String transporter_Name) {
        Transporter_Name = transporter_Name;
    }

    public String getScanned() {
        return Scanned;
    }

    public void setScanned(String scanned) {
        Scanned = scanned;
    }

    public String getDocument_Status() {
        return Document_Status;
    }

    public void setDocument_Status(String document_Status) {
        Document_Status = document_Status;
    }

    public String getQC_Remarks() {
        return QC_Remarks;
    }

    public void setQC_Remarks(String QC_Remarks) {
        this.QC_Remarks = QC_Remarks;
    }
}
