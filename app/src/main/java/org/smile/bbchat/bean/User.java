package org.smile.bbchat.bean;

/**
 * Created by aihaitao on 13/9/2017.
 */

import java.util.Date;

public class User {
    private Long userid;

    private Long digital;

    private String usernickname;

    private String useremail;

    private String userpassword;

    private Byte usertype;

    private Byte certificatetype;

    private String realname;

    private String identitycard;

    private String sex;

    private String selfintroduce;

    private String usertag;

    private String university;

    private String collegeyear;

    private String universitytwo;

    private String collegeyeartwo;

    private String company;

    private String address;

    private String country;

    private String registerdate; //这个在我帮助的人列表时，临时存储帮助的时间

    private Integer msgpubcount;

    private Integer boxcount;

    private Integer fanscount;

    private Integer followcount;

    private Byte notsay;

    private String notsaytime;

    private String cansaytime;

    private String userphoto;

    private Byte photoupload;

    private String backupone;

    private String backuptwo;

    private String backupthree;

    private String backupfour;

    private Integer backupfive;

    private Integer backupsix;
    //以下是修改表后新添加的字段
    private Integer userhelpsman;

    private Integer userdonate;

    private Integer  amountaccept;

    private Integer acceptmoney;

    private  String  behelptime;

    private Integer behelpedtype;
    //以下是修改表后新添加的字段
    private String backupseven;

    private String backupeight;

    private String backupnine;

    private String backupten;

    private Integer tobeuseone; //用户是否捐钱了

    private Integer tobeusetwo; //查看我帮助的人，或者帮助我的人，这个存储具体的钱数

    private Integer tobeusethree;

    private String cityname; //用户所在的城市

    private String openid; //公众号id

    private String useruuid; //用户的uuid

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getDigital() {
        return digital;
    }

    public void setDigital(Long digital) {
        this.digital = digital;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Byte getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(Byte certificatetype) {
        this.certificatetype = certificatetype;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSelfintroduce() {
        return selfintroduce;
    }

    public void setSelfintroduce(String selfintroduce) {
        this.selfintroduce = selfintroduce;
    }

    public String getUsertag() {
        return usertag;
    }

    public void setUsertag(String usertag) {
        this.usertag = usertag;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCollegeyear() {
        return collegeyear;
    }

    public void setCollegeyear(String collegeyear) {
        this.collegeyear = collegeyear;
    }

    public String getUniversitytwo() {
        return universitytwo;
    }

    public void setUniversitytwo(String universitytwo) {
        this.universitytwo = universitytwo;
    }

    public String getCollegeyeartwo() {
        return collegeyeartwo;
    }

    public void setCollegeyeartwo(String collegeyeartwo) {
        this.collegeyeartwo = collegeyeartwo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    public Integer getMsgpubcount() {
        return msgpubcount;
    }

    public void setMsgpubcount(Integer msgpubcount) {
        this.msgpubcount = msgpubcount;
    }

    public Integer getBoxcount() {
        return boxcount;
    }

    public void setBoxcount(Integer boxcount) {
        this.boxcount = boxcount;
    }

    public Integer getFanscount() {
        return fanscount;
    }

    public void setFanscount(Integer fanscount) {
        this.fanscount = fanscount;
    }

    public Integer getFollowcount() {
        return followcount;
    }

    public void setFollowcount(Integer followcount) {
        this.followcount = followcount;
    }

    public Byte getNotsay() {
        return notsay;
    }

    public void setNotsay(Byte notsay) {
        this.notsay = notsay;
    }

    public String getNotsaytime() {
        return notsaytime;
    }

    public void setNotsaytime(String notsaytime) {
        this.notsaytime = notsaytime;
    }

    public String getCansaytime() {
        return cansaytime;
    }

    public void setCansaytime(String cansaytime) {
        this.cansaytime = cansaytime;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    public Byte getPhotoupload() {
        return photoupload;
    }

    public void setPhotoupload(Byte photoupload) {
        this.photoupload = photoupload;
    }

    public String getBackupone() {
        return backupone;
    }

    public void setBackupone(String backupone) {
        this.backupone = backupone;
    }

    public String getBackuptwo() {
        return backuptwo;
    }

    public void setBackuptwo(String backuptwo) {
        this.backuptwo = backuptwo;
    }

    public String getBackupthree() {
        return backupthree;
    }

    public void setBackupthree(String backupthree) {
        this.backupthree = backupthree;
    }

    public String getBackupfour() {
        return backupfour;
    }

    public void setBackupfour(String backupfour) {
        this.backupfour = backupfour;
    }

    public Integer getBackupfive() {
        return backupfive;
    }

    public void setBackupfive(Integer backupfive) {
        this.backupfive = backupfive;
    }

    public Integer getBackupsix() {
        return backupsix;
    }

    public void setBackupsix(Integer backupsix) {
        this.backupsix = backupsix;
    }

    public Integer getUserhelpsman() {
        return userhelpsman;
    }

    public void setUserhelpsman(Integer userhelpsman) {
        this.userhelpsman = userhelpsman;
    }

    public Integer getUserdonate() {
        return userdonate;
    }

    public void setUserdonate(Integer userdonate) {
        this.userdonate = userdonate;
    }

    public Integer getAmountaccept() {
        return amountaccept;
    }

    public void setAmountaccept(Integer amountaccept) {
        this.amountaccept = amountaccept;
    }

    public Integer getAcceptmoney() {
        return acceptmoney;
    }

    public void setAcceptmoney(Integer acceptmoney) {
        this.acceptmoney = acceptmoney;
    }

    public String getBehelptime() {
        return behelptime;
    }

    public void setBehelptime(String behelptime) {
        this.behelptime = behelptime;
    }

    public Integer getBehelpedtype() {
        return behelpedtype;
    }

    public void setBehelpedtype(Integer behelpedtype) {
        this.behelpedtype = behelpedtype;
    }

    public String getBackupseven() {
        return backupseven;
    }

    public void setBackupseven(String backupseven) {
        this.backupseven = backupseven;
    }

    public String getBackupeight() {
        return backupeight;
    }

    public void setBackupeight(String backupeight) {
        this.backupeight = backupeight;
    }

    public String getBackupnine() {
        return backupnine;
    }

    public void setBackupnine(String backupnine) {
        this.backupnine = backupnine;
    }

    public String getBackupten() {
        return backupten;
    }

    public void setBackupten(String backupten) {
        this.backupten = backupten;
    }

    public Integer getTobeuseone() {
        return tobeuseone;
    }

    public void setTobeuseone(Integer tobeuseone) {
        this.tobeuseone = tobeuseone;
    }

    public Integer getTobeusetwo() {
        return tobeusetwo;
    }

    public void setTobeusetwo(Integer tobeusetwo) {
        this.tobeusetwo = tobeusetwo;
    }

    public Integer getTobeusethree() {
        return tobeusethree;
    }

    public void setTobeusethree(Integer tobeusethree) {
        this.tobeusethree = tobeusethree;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid;
    }
}