/**
 * 
 */
package com.dianping.lion.service;



/**
 * @author danson.liu
 *
 */
public interface PrivilegeDecider {
    
    boolean hasAddConfigPrivilege(int projectId, int envId, Integer userId);

    boolean hasReadConfigPrivilege(int projectId, int envId, int configId, Integer userId);
    
    boolean hasEditConfigPrivilege(int projectId, int envId, int configId, Integer userId);
    
    boolean hasLockConfigPrivilege(Integer userId);
    
    boolean hasReadLogPrivilege(int projectId, Integer userId);

	boolean hasEditAttrPrivilege(int projectId, Integer userId);
	
	boolean hasClearCachePrivilege(Integer userId);
    
}