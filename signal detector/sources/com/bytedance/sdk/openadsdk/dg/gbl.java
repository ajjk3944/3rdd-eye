package com.bytedance.sdk.openadsdk.dg;

/* loaded from: classes.dex */
public class gbl extends dg {
    public static String dg() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }

    public static String xq() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
