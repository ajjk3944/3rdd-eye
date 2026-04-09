package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class un0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17264b;

    public un0(int i4, int i10) {
        this.f17263a = i4;
        this.f17264b = i10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        int i4;
        Bundle bundle = ((t50) obj).f16705a;
        int i10 = this.f17263a;
        if (i10 == -1 || (i4 = this.f17264b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i10);
        bundle.putInt("crashes_without_flags", i4);
        va.r rVar = va.r.g;
        if (va.s.f36163e.f36166c.j) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
