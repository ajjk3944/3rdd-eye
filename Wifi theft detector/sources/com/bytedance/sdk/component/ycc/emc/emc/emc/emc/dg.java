package com.bytedance.sdk.component.ycc.emc.emc.emc.emc;

import android.content.Context;
import com.bytedance.sdk.component.ycc.emc.msw;

/* loaded from: classes.dex */
public class dg extends emc {
    public dg(Context context, com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        super(context, emcVar);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc
    public byte dg() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc
    public byte xq() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public long ycc() {
        return com.bytedance.sdk.component.ycc.emc.uym.emc.ypw();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc, com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public String ypw() {
        com.bytedance.sdk.component.ycc.emc.emc.bw bwVarDg = msw.uym().dg();
        if (bwVarDg != null) {
            return bwVarDg.emc();
        }
        return null;
    }

    public static String xq(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
