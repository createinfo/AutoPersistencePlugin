package com.taobao.autopersistence.vo;

/**
 * 
 * ��ConfigVO.java��ʵ�����������ò�����ʵ����
 * @author zhanzui.ldh 2013-5-20 ����04:25:47
 */
public class ConfigVO {
    /**���ݿ�����**/
    private String driver = "com.mysql.jdbc.Driver";
    /**���ݿ�����**/
    private String url;
    /**���ݿ��û���**/
    private String userName = "root";
    /**���ݿ�����**/
    private String password = "123456";
    /**��������**/
    private String author = "zhanzui.ldh";
    /**��Ŀ����**/
    private String charset = "UTF-8";
    /**����Ŀ¼**/
    private String javadir = "./src/main/java";
    /**���Դ���Ŀ¼**/
    private String javaTestDir = "./src/test/java";
    /**��Դ�ļ�Ŀ¼**/
    private String resource = "./src/main/resources";
    /**java ��ǰ׺**/
    private String pjpackage = "com.taobao";
    /**��Ŀ·��**/
    private String pjPath;
    
    public ConfigVO(String pjPath){
       this.pjPath = pjPath;
    }
    
    public String getDriver() {
        return driver;
    }
    
    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getCharset() {
        return charset;
    }
    
    public void setCharset(String charset) {
        this.charset = charset;
    }
    
    public String getJavadir() {
        return javadir;
    }
    
    public void setJavadir(String javadir) {
        this.javadir = javadir;
    }
    
    public String getJavaTestDir() {
        return javaTestDir;
    }
    
    public void setJavaTestDir(String javaTestDir) {
        this.javaTestDir = javaTestDir;
    }
    
    public String getResource() {
        return resource;
    }
    
    public void setResource(String resource) {
        this.resource = resource;
    }
    
    public String getPjpackage() {
        return pjpackage;
    }
    
    public void setPjpackage(String pjpackage) {
        this.pjpackage = pjpackage;
    }

    
    public String getPjPath() {
        return pjPath;
    }
    
    public void setPjPath(String pjPath) {
        this.pjPath = pjPath;
    }
}
