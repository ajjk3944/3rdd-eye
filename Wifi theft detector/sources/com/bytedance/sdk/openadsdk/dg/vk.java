package com.bytedance.sdk.openadsdk.dg;

/* loaded from: classes.dex */
public class vk {
    public static String emc() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String ypw() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
