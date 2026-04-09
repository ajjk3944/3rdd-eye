package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import com.bytedance.sdk.component.le.ouw.pno;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ouw {
    public yu(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context, ouwVar);
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final long fkw() {
        return com.bytedance.sdk.component.le.ouw.ra.ouw.vt();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw
    public final byte lh() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw, com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final String ouw() {
        com.bytedance.sdk.component.le.ouw.ouw.fkw fkwVar = pno.vt().ra;
        if (fkwVar != null) {
            return fkwVar.ouw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw
    public final byte vt() {
        return (byte) 1;
    }

    public static String lh(String str) {
        return h.t("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
