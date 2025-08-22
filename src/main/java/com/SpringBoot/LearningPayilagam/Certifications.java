package com.SpringBoot.LearningPayilagam;

public class Certifications {

    private String CerificateName;
    private String CerificationAuthority;




    public Certifications(String CerificateName,String CerificationAuthority)
    {
      this.CerificateName =CerificateName;
      this.CerificationAuthority =CerificationAuthority;

    }

    public String getCerificateName() {
        return CerificateName;
    }

    public void setCerificateName(String cerificateName) {
        CerificateName = cerificateName;
    }

    public String getCerificationAuthority() {
        return CerificationAuthority;
    }

    public void setCerificationAuthority(String cerificationAuthority) {
        CerificationAuthority = cerificationAuthority;
    }



}