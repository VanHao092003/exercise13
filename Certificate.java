public class Certificate {
    private String certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificatedDate;
    public Certificate(String certificateID, String certificateName, String certificateRank, String certificatedDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }
    public Certificate(){
        
    }
    public String getCertificateID() {
        return certificateID;
    }
    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }
    public String getCertificateName() {
        return certificateName;
    }
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    public String getCertificateRank() {
        return certificateRank;
    }
    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }
    public String getCertificatedDate() {
        return certificatedDate;
    }
    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
    @Override
    public String toString() {
        return "";
    }
    
}
