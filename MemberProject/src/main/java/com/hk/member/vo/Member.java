package com.hk.member.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
 int mno;
 String email;
 String pwd;
 String mname;
 Date cre_date;
 Date mod_date;
}
