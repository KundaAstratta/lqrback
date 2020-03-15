package com.spring.qrback.domaine;

import javax.persistence.*;

@Entity
public class Questionreponse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column
    private String application;

    @Column
    private String auteurdelaquestion;

    @Column
    private String format;

    @Column
    private String datedelaquestion;

    @Column
    private String severite;

    @Column
    private String objet;

    @Column
    private String version;

    @Column
    private String libelledelaquestion;

    @Column
    private String datedelareponse;

    @Column
    private float ecart;

    @Column
    private String auteurdelareponse;

    @Column
    private String libelledelareponse;

    @Column
    private String statutquestion;

    public Questionreponse() {
    }

    public Questionreponse(Long id, String application, String auteurdelaquestion, String format, String datedelaquestion, String severite, String objet, String version, String libelledelaquestion, String datedelareponse, float ecart, String auteurdelareponse, String libelledelareponse, String statutquestion) {
        this.id = id;
        this.application = application;
        this.auteurdelaquestion = auteurdelaquestion;
        this.format = format;
        this.datedelaquestion = datedelaquestion;
        this.severite = severite;
        this.objet = objet;
        this.version = version;
        this.libelledelaquestion = libelledelaquestion;
        this.datedelareponse = datedelareponse;
        this.ecart = ecart;
        this.auteurdelareponse = auteurdelareponse;
        this.libelledelareponse = libelledelareponse;
        this.statutquestion = statutquestion;
    }

    public Long getId() {
        return id;
    }

    public String getApplication() {
        return application;
    }

    public String getAuteurdelaquestion() {
        return auteurdelaquestion;
    }

    public String getFormat() {
        return format;
    }


    public String getDatedelaquestion() {
        return datedelaquestion;
    }

    public String getSeverite() {
        return severite;
    }

    public String getObjet() {
        return objet;
    }

    public String getVersion() {
        return version;
    }

    public String getLibelledelaquestion() {
        return libelledelaquestion;
    }

    public String getDatedelareponse() {
        return datedelareponse;
    }

    public float getEcart() {
        return ecart;
    }

    public String getAuteurdelareponse() {
        return auteurdelareponse;
    }

    public String getLibelledelareponse() {
        return libelledelareponse;
    }

    public String getStatutquestion() {
        return statutquestion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Questionreponse{");
        sb.append("id=").append(id);
        sb.append(", application='").append(application).append('\'');
        sb.append(", auteurdelaquestion='").append(auteurdelaquestion).append('\'');
        sb.append(", format='").append(format).append('\'');
        sb.append(", datedelaquestion='").append(datedelaquestion).append('\'');
        sb.append(", severite='").append(severite).append('\'');
        sb.append(", objet='").append(objet).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", libelledelaquestion='").append(libelledelaquestion).append('\'');
        sb.append(", datedelareponse='").append(datedelareponse).append('\'');
        sb.append(", ecart=").append(ecart);
        sb.append(", auteurdelareponse='").append(auteurdelareponse).append('\'');
        sb.append(", libelledelareponse='").append(libelledelareponse).append('\'');
        sb.append(", statutquestion='").append(statutquestion).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
