package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import com.bytedance.sdk.component.le.ouw.pno;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ra {
    public le(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context, ouwVar);
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra
    public final byte lh() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra, com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final String ouw() {
        return pno.vt().ra.fkw();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra
    public final byte vt() {
        return (byte) 1;
    }

    public static String ouw(String str) {
        return h.t("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
