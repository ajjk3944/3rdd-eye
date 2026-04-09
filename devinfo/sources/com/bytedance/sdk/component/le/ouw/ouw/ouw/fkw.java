package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements com.bytedance.sdk.component.le.ouw.ouw.fkw {
    public static final fkw ouw = new fkw();
    private volatile SQLiteDatabase vt;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String fkw() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String le() {
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String lh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final SQLiteDatabase ouw(Context context) {
        if (this.vt == null) {
            synchronized (this) {
                try {
                    if (this.vt == null) {
                        this.vt = new yu(context).getWritableDatabase();
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String vt() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String yu() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String ouw() {
        return "loghighpriority";
    }
}
