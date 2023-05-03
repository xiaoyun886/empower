package com.th520.empower;

import com.th520.empower.utils.HexUtils;
import com.th520.empower.utils.ZLibUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpowerApplicationTests {

    @Test
    void contextLoads() throws Exception {
/*        RsaKey rsaKey = RSAUtil.generateRsaKey();
        System.out.println("rsaKey  公钥: " + rsaKey.getPublicKey());
        System.out.println("rsaKey  私钥: " + rsaKey.getPrivateKey());
        String data="你好, 天痕";
        String encrypt = RSAUtil.encrypt(data,rsaKey.getPublicKey());
        System.out.println(" 加密数据: " + encrypt);
        String decrypt = RSAUtil.decrypt(encrypt, rsaKey.getPrivateKey());
        System.out.println(" 私钥解密: " + decrypt);*/
        byte[] s1 = ZLibUtils.compress("哈喽你好");
        String s2 = HexUtils.byteToHex(s1);
        System.out.println("加密数据: "+ HexUtils.byteToHex(s1));
        byte[] decompress = ZLibUtils.decompress(s1);
        System.out.println("解压后内容: " + HexUtils.byteToHex(decompress));
    }

}
