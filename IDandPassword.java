/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.util.HashMap;

/**
 *
 * @author Connect
 */
public class IDandPassword {
    HashMap <String,String> loginInfo = new HashMap <String,String>();
    
    IDandPassword(){
    loginInfo.put("java","mohamed111" );
    loginInfo.put("bro","adc123" );
    loginInfo.put("login","password" );
    
    }
    protected HashMap getLoginInfo(){
    return loginInfo;
    }
    
}
