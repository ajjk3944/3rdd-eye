package com.bytedance.sdk.openadsdk.dg;

/* loaded from: classes.dex */
public class dg {
    public static String emc() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }

    public static String ypw() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
