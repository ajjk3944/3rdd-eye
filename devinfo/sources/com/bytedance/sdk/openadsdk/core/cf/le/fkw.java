package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    JSONObject bly;

    /* renamed from: cf, reason: collision with root package name */
    boolean f8120cf;
    com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* renamed from: jg, reason: collision with root package name */
    JSONArray f8121jg;

    /* renamed from: le, reason: collision with root package name */
    final vpp f8122le;

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.adsdk.ugeno.vt.lh f8123lh;
    boolean mwh;
    com.bytedance.sdk.openadsdk.core.widget.fkw pno;
    final String ra;
    private final Context rn;
    boolean ryl;
    final JSONObject tlj;
    com.bytedance.adsdk.ugeno.vt.lh yu;
    int ouw = -1;
    int vt = -1;
    private final String ko = "UGenSwiperEvent";

    public fkw(Context context, vpp vppVar, String str, JSONObject jSONObject) {
        this.rn = context;
        this.f8122le = vppVar;
        this.ra = str;
        this.tlj = jSONObject;
    }

    public final void ouw(boolean z3, boolean z10, boolean z11) {
        com.bytedance.adsdk.ugeno.vt.lh lhVar;
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.f8123lh;
        if (lhVar2 == null || (lhVar = this.yu) == null) {
            return;
        }
        T t10 = lhVar2.fkw;
        T t11 = lhVar.fkw;
        JSONArray jSONArray = this.f8121jg;
        if (jSONArray != null && jSONArray.length() == 1) {
            t10.setVisibility(8);
            t11.setVisibility(8);
            return;
        }
        if (z3) {
            return;
        }
        if (z10) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 90);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 255);
                return;
            }
            return;
        }
        if (z11) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 255);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 90);
                return;
            }
            return;
        }
        if (t10 instanceof TextView) {
            ouw((TextView) t10, 255);
        }
        if (t11 instanceof TextView) {
            ouw((TextView) t11, 255);
        }
    }

    private static void ouw(TextView textView, int i4) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i4, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0021, B:14:0x0031, B:17:0x0039, B:20:0x006a, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:31:0x009b, B:50:0x00d2, B:52:0x00d8, B:53:0x00da, B:38:0x00b5, B:40:0x00bb, B:43:0x00c2, B:46:0x00c9), top: B:60:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0021, B:14:0x0031, B:17:0x0039, B:20:0x006a, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:31:0x009b, B:50:0x00d2, B:52:0x00d8, B:53:0x00da, B:38:0x00b5, B:40:0x00bb, B:43:0x00c2, B:46:0x00c9), top: B:60:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0021, B:14:0x0031, B:17:0x0039, B:20:0x006a, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:31:0x009b, B:50:0x00d2, B:52:0x00d8, B:53:0x00da, B:38:0x00b5, B:40:0x00bb, B:43:0x00c2, B:46:0x00c9), top: B:60:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ouw(com.bytedance.adsdk.ugeno.core.mwh r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.fkw.ouw(com.bytedance.adsdk.ugeno.core.mwh):boolean");
    }
}
