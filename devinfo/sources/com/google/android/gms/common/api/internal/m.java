package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9100a;

    public m(d dVar) {
        this.f9100a = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z3) {
        ac.k kVar = this.f9100a.f9092m;
        kVar.sendMessage(kVar.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
