package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh {
    protected String bly;
    protected Map<String, String> fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f7018le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.yu.le f7019lh;
    public com.bytedance.adsdk.ugeno.yu.cf ouw;
    protected String pno;
    protected String ra;
    protected Context tlj;
    public com.bytedance.adsdk.ugeno.vt.lh vt;
    protected le.ouw yu;

    public lh(Context context) {
        this.tlj = context;
    }

    public final void lh() {
        com.bytedance.adsdk.ugeno.yu.le leVar = this.f7019lh;
        le.ouw ouwVar = leVar.ouw;
        this.yu = ouwVar;
        if (leVar == null) {
            return;
        }
        this.yu = ouwVar;
        if (ouwVar == null) {
            return;
        }
        this.fkw = ouwVar.fkw;
        this.f7018le = ouwVar.yu;
        this.ra = ouwVar.f7010lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
    }

    public abstract boolean ouw(Object... objArr);

    public final String yu() {
        return this.pno;
    }
}
