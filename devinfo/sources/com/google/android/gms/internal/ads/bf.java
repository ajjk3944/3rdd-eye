package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bf implements ew0 {

    /* renamed from: a, reason: collision with root package name */
    public final iv0 f9663a;

    /* renamed from: b, reason: collision with root package name */
    public final aw f9664b;

    /* renamed from: c, reason: collision with root package name */
    public final lf f9665c;

    /* renamed from: d, reason: collision with root package name */
    public final af f9666d;

    /* renamed from: e, reason: collision with root package name */
    public final te f9667e;

    /* renamed from: f, reason: collision with root package name */
    public final nf f9668f;
    public final o1 g;

    /* renamed from: h, reason: collision with root package name */
    public final g8 f9669h;

    public bf(iv0 iv0Var, aw awVar, lf lfVar, af afVar, te teVar, nf nfVar, o1 o1Var, g8 g8Var) {
        this.f9663a = iv0Var;
        this.f9664b = awVar;
        this.f9665c = lfVar;
        this.f9666d = afVar;
        this.f9667e = teVar;
        this.f9668f = nfVar;
        this.g = o1Var;
        this.f9669h = g8Var;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap a() {
        return b();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0117 A[Catch: all -> 0x00fb, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fb, blocks: (B:12:0x00ec, B:14:0x00f0, B:16:0x00f7, B:20:0x00fd, B:22:0x0106, B:24:0x010a, B:26:0x0113, B:28:0x0117), top: B:41:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap b() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf.b():java.util.HashMap");
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap f() {
        HashMap mapB = b();
        lf lfVar = this.f9665c;
        if (lfVar.f13483l <= -2) {
            WeakReference weakReference = lfVar.f13480h;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                lfVar.f13483l = -3L;
            }
        }
        mapB.put("lts", Long.valueOf(lfVar.f13483l));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap zzc() {
        HashMap mapB = b();
        g8 g8Var = this.f9669h;
        if (g8Var != null) {
            List list = g8Var.f11399a;
            g8Var.f11399a = Collections.EMPTY_LIST;
            mapB.put("vst", list);
        }
        return mapB;
    }
}
