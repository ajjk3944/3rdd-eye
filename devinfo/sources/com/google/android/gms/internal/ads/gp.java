package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gp implements pb.c, ix, p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx f11570a;

    public /* synthetic */ gp(gx gxVar) {
        this.f11570a = gxVar;
    }

    @Override // pb.c
    public void O(nb.b bVar) {
        this.f11570a.d(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.ix
    public /* synthetic */ void c(Object obj) {
        this.f11570a.b((jq) obj);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        qz qzVar = (qz) obj;
        gx gxVar = this.f11570a;
        if (qzVar == null) {
            gxVar.d(new qj0(1, "Missing webview from video view future."));
            return;
        }
        qzVar.Z("/video", new co(7, new rq(gxVar)));
        qzVar.a0();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        za.i.e("Failed to load media data due to video view load failure.");
        this.f11570a.d(th2);
    }

    public gp(hp hpVar, gx gxVar) {
        this.f11570a = gxVar;
    }

    public gp(nb0 nb0Var, gx gxVar) {
        this.f11570a = gxVar;
        Objects.requireNonNull(nb0Var);
    }
}
