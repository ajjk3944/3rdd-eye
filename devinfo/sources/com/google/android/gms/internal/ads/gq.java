package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gq implements ix, hx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq f11575a;

    public gq(hq hqVar) {
        Objects.requireNonNull(hqVar);
        this.f11575a = hqVar;
    }

    @Override // com.google.android.gms.internal.ads.hx
    /* renamed from: b */
    public void mo164b() {
        ya.a0.m("Rejecting reference for JS Engine.");
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.B8)).booleanValue();
        hq hqVar = this.f11575a;
        if (zBooleanValue) {
            hqVar.x("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
        } else {
            hqVar.w();
        }
    }

    @Override // com.google.android.gms.internal.ads.ix
    public /* synthetic */ void c(Object obj) {
        ya.a0.m("Releasing engine reference.");
        this.f11575a.f11939d.z();
    }

    public gq(iq iqVar, hq hqVar) {
        this.f11575a = hqVar;
        Objects.requireNonNull(iqVar);
    }
}
