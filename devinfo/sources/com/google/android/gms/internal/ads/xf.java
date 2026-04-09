package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final lf f18380h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18381i;

    public xf(ff ffVar, zc zcVar, int i4, lf lfVar) {
        super(ffVar, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", zcVar, i4, 53);
        this.f18380h = lfVar;
        if (lfVar != null) {
            if (lfVar.f13483l <= -2) {
                WeakReference weakReference = lfVar.f13480h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    lfVar.f13483l = -3L;
                }
            }
            this.f18381i = lfVar.f13483l;
        }
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        if (this.f18380h != null) {
            long jLongValue = ((Long) this.f19076e.invoke(null, Long.valueOf(this.f18381i))).longValue();
            zc zcVar = this.f19075d;
            zcVar.b();
            ((md) zcVar.f14755b).S(jLongValue);
        }
    }
}
