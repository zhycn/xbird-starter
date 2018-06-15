/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.zhycn.id.factory.support;

import java.util.List;

/**
 * @author zhycn
 * @since 2.2.0 2018-06-15
 */
public class TOTP {

  private String secretKey;
  private String code;
  private List<Integer> scratchCodes;
  private long timestamp;

  public TOTP() {}

  public TOTP(String secretKey, String code, List<Integer> scratchCodes, long timestamp) {
    this.secretKey = secretKey;
    this.code = code;
    this.scratchCodes = scratchCodes;
    this.timestamp = timestamp;
  }

  public String getCode() {
    return code;
  }
  
  public int getCodeAsInt() {
    return Integer.parseInt(code);
  }

  public List<Integer> getScratchCodes() {
    return scratchCodes;
  }

  public String getSecretKey() {
    return secretKey;
  }


  public long getTimestamp() {
    return timestamp;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setScratchCodes(List<Integer> scratchCodes) {
    this.scratchCodes = scratchCodes;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "TOTP [secretKey=" + secretKey + ", code=" + code + ", scratchCodes=" + scratchCodes
        + ", timestamp=" + timestamp + "]";
  }

}
