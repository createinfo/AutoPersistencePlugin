package com.taobao.autopersistence.engine.rule;

/**
 * 
 * ��SwitchRule.java��ʵ��������ת������ӿ�
 * @author zhanzui.ldh 2012-10-10 ����10:18:00
 */
public interface SwitchRule {
    /**
     * ����һ���Ĺ������ݿ���ת����Ŀ��,�罫a_bתΪab
     * @param dbName
     * @return
     */
    public String  dbNameConvertProjectName(String dbName);
    /**
     * ����һ���Ĺ��򽫱���ת��Ϊpojo��,�罫exam_resultתΪExamResult
     * @param tableName
     * @return
     */
    public String  tableNameConvertClassName(String tableName);
    
    
    /**
     * ����һ���Ĺ��򽫱��ֶ�ת��Ϊpojo������,�罫user_nameתΪuserName
     * @param dbElement
     * @return
     */
    public String  dbElementConvertJavaElement(String dbElement);
    
    
    /**
     * �罫com.taobao.a_b.daoתΪcom.taobao.ab.dao
     * @param projectName
     * @param type  vo,dao,service
     * @return package.projectName.dao
     */
    public String  getPackageName(String projectName,String type);
    
}
