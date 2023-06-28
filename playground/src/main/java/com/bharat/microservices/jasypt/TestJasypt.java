package com.bharat.microservices.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 11 September 2023
 */
public class TestJasypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();

        standardPBEStringEncryptor.setPassword("Demo_Pwd!2023");
        standardPBEStringEncryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        standardPBEStringEncryptor.setIvGenerator(new RandomIvGenerator());

        String result = standardPBEStringEncryptor.encrypt("springCloud_Pwd!");
        System.out.println(result);
        System.out.println(standardPBEStringEncryptor.decrypt(result));
    }
}
