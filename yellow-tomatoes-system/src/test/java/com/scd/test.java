package com.scd;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

public class test {


    public static void main(String[] args) {

//        String privateKey = "MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEA0vfvyTdGJkdbHkB8mp0f3FE0GYP3AYPaJF7jUd1M0XxFSE2ceK3k2kw20YvQ09NJKk+OMjWQl9WitG9pB6tSCQIDAQABAkA2SimBrWC2/wvauBuYqjCFwLvYiRYqZKThUS3MZlebXJiLB+Ue/gUifAAKIg1avttUZsHBHrop4qfJCwAI0+YRAiEA+W3NK/RaXtnRqmoUUkb59zsZUBLpvZgQPfj1MhyHDz0CIQDYhsAhPJ3mgS64NbUZmGWuuNKp5coY2GIj/zYDMJp6vQIgUueLFXv/eZ1ekgz2Oi67MNCk5jeTF2BurZqNLR3MSmUCIFT3Q6uHMtsB9Eha4u7hS31tj1UWE+D+ADzp59MGnoftAiBeHT7gDMuqeJHPL4b+kC+gzV4FGTfhR9q3tTbklZkD2A==";
//        String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBANL378k3RiZHWx5AfJqdH9xRNBmD9wGD2iRe41HdTNF8RUhNnHit5NpMNtGL0NPTSSpPjjI1kJfVorRvaQerUgkCAwEAAQ==";
//        RSA rsa1 = new RSA(privateKey, null);
//        RSA rsa2 = new RSA(null, publicKey);
//        byte[] pass = rsa2.encrypt("123456", KeyType.PublicKey);
//        String passStr = Base64.encode(pass);
//        System.out.println(passStr);
//
//        byte[] decrypt1 = rsa1.decrypt(passStr, KeyType.PrivateKey);
//        String codeStr = StrUtil.str(decrypt1, CharsetUtil.CHARSET_UTF_8);
//        System.out.println(codeStr);

//        String decodeStr = Base64.decodeStr("$2a$10$fP.426qKaTmix50Oln8L.uav55gELhAd0Eg66Av4oG86u8km7D/Ky");
//        System.out.println(decodeStr);
//
//        byte[] decrypt = rsa.decrypt(decodeStr, KeyType.PrivateKey);

        String bearerToken = "Bearer.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiIiLCJleHAiOjE2MDAxOTc2NDN9.8D7swrwYekwrFrDZpnSAp8NgoZuRvW_DjoiUHoo3seLyYkEP6IsVeYcYlm2KghFwsVV0Vn-QGSmOwTNssL999Q";
        boolean bearer = bearerToken.startsWith("Bearer");
        boolean b = StringUtils.hasText(bearerToken);
        System.out.println(bearer);
        System.out.println(b);

    }
}
