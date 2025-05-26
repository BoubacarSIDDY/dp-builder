package sn.isi.model;

public class User {
    private Long userId;
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private String email;
    private String telephone;
    private String nationalite;
    private String profession;
    private boolean abonneNewsletter;
    private boolean estActif;
    public User(){}
    // Constructeur avec tous les paramètres (peu lisible)
    public User(Long userId,String nom, String prenom, String adresse, int age,
                       String email, String telephone, String nationalite,
                       String profession, boolean abonneNewsletter,boolean estActif) {
        this.userId = userId;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.nationalite = nationalite;
        this.profession = profession;
        this.abonneNewsletter = abonneNewsletter;
        this.estActif = estActif;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setAbonneNewsletter(boolean abonneNewsletter) {
        this.abonneNewsletter = abonneNewsletter;
    }

    public void setEstActif(boolean estActif) {
        this.estActif = estActif;
    }

    public Long getUserId() {
        return userId;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getProfession() {
        return profession;
    }

    public boolean isAbonneNewsletter() {
        return abonneNewsletter;
    }

    public boolean isEstActif() {
        return estActif;
    }
    public static UserBuilder builder(){
        return new UserBuilder();
    }
    public static class UserBuilder{
        private User user = new User();
        public UserBuilder userId(Long userId){
            user.userId = userId;
            return this;
        }
        public UserBuilder nom(String nom){
            user.nom = nom;
            return this;
        }
        public UserBuilder prenom(String prenom){
            user.prenom = prenom;
            return this;
        }
        public User build(){
            return this.user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", profession='" + profession + '\'' +
                ", abonneNewsletter=" + abonneNewsletter +
                ", estActif=" + estActif +
                '}';
    }
}
