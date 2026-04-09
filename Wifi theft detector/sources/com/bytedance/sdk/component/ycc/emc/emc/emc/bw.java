package com.bytedance.sdk.component.ycc.emc.emc.emc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class bw implements com.bytedance.sdk.component.ycc.emc.emc.bw {
    public static final bw emc = new bw();
    private volatile SQLiteDatabase ypw;

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String bw() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String dg() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public SQLiteDatabase emc(Context context) {
        if (this.ypw == null) {
            synchronized (this) {
                try {
                    if (this.ypw == null) {
                        this.ypw = new dg(context).getWritableDatabase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String xq() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String ycc() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String ypw() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.bw
    public String emc() {
        return "loghighpriority";
    }
}
