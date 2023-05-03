package com.th520.empower.entity;

import lombok.Data;

/**
 * @program: empower
 * @description: RSA公私钥类
 * @author: 天痕
 * @create: 2023/5/4
 **/
@Data
public class RsaKey {
    private String privateKey;
    private String publicKey;

}
