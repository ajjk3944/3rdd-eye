package com.bytedance.sdk.component.le.ouw.vt.vt;

import android.content.Context;
import android.net.Uri;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.component.le.ouw.lh.vt;
import com.bytedance.sdk.component.le.ouw.ouw.ouw.ra;
import com.bytedance.sdk.component.le.ouw.pno;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static le ouw;

    public static le ouw() {
        try {
            vt.ouw();
            if (ouw == null) {
                ouw = pno.vt().bly.fkw();
            }
        } catch (Exception unused) {
        }
        return ouw;
    }

    public static String vt() {
        return h.w(new StringBuilder(), ra.vt, "/ad_log_event/");
    }

    public static void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        try {
            vt.ouw();
            Context context = pno.vt().ouw;
            le leVarOuw = ouw();
            vt.ouw();
            if (leVarOuw != null) {
                Uri uri = Uri.parse(vt() + "adLogDispatch?event=" + com.bytedance.sdk.component.le.ouw.ouw.ouw.le.ouw(ouwVar.le()));
                vt.ouw();
                leVarOuw.ouw(uri);
                vt.ouw();
            }
        } catch (Throwable th2) {
            th2.toString();
            vt.lh();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ouw(android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw(android.net.Uri):java.lang.String");
    }
}
