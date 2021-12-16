/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.obs.services.model;

/**
 * 桶或对象的访问权限（Access Control List， ACL）
 * 
 * @since 3.20.3
 */
public class SetObjectAclRequest extends BaseObjectRequest {

    {
        httpMethod = HttpMethodEnum.PUT;
    }

    private AccessControlList acl;

    private String cannedACL;

    private String versionId;
    
    public SetObjectAclRequest(String bucketName, String objectKey, AccessControlList acl) {
        this.bucketName = bucketName;
        this.objectKey = objectKey;
        this.acl = acl;
    }
    
    public SetObjectAclRequest(String bucketName, String objectKey, AccessControlList acl, String versionId) {
        this.bucketName = bucketName;
        this.objectKey = objectKey;
        this.versionId = versionId;
        this.acl = acl;
    }

    public AccessControlList getAcl() {
        return acl;
    }

    public void setAcl(AccessControlList acl) {
        this.acl = acl;
    }

    public String getCannedACL() {
        return cannedACL;
    }

    public void setCannedACL(String cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * 获取对象版本号
     *
     * @return 对象版本号
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * 设置对象版本号
     *
     * @param versionId
     *            对象版本号
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "SetObjectAclRequest [acl=" + acl + ", cannedACL=" + cannedACL + ", getBucketName()=" + getBucketName()
                + ", getObjectKey()=" + getObjectKey() + ", getVersionId()=" + getVersionId() + ", isRequesterPays()="
                + isRequesterPays() + "]";
    }
}
