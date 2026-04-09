package com.bytedance.sdk.component.ycc.emc.emc.emc.emc;

import android.content.Context;
import com.bytedance.sdk.component.ycc.emc.msw;

/* loaded from: classes.dex */
public class ycc extends uym {
    public ycc(Context context, com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        super(context, emcVar);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym
    public byte emc() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym
    public byte xq() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym, com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public String ypw() {
        return msw.uym().dg().bw();
    }

    public static String emc(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
