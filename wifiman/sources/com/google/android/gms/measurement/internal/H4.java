package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;

/* loaded from: classes.dex */
final class H4 implements com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ K6 f35917a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35918b;

    H4(C4945r4 c4945r4, K6 k62) {
        this.f35917a = k62;
        this.f35918b = c4945r4;
    }

    private final void b() {
        SparseArray sparseArrayH = this.f35918b.e().H();
        K6 k62 = this.f35917a;
        sparseArrayH.put(k62.f35973c, Long.valueOf(k62.f35972b));
        X2 x2E = this.f35918b.e();
        int[] iArr = new int[sparseArrayH.size()];
        long[] jArr = new long[sparseArrayH.size()];
        for (int i10 = 0; i10 < sparseArrayH.size(); i10++) {
            iArr[i10] = sparseArrayH.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayH.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x2E.f36276p.b(bundle);
    }

    @Override // com.google.common.util.concurrent.a
    public final void a(Throwable th2) {
        this.f35918b.j();
        this.f35918b.f36694i = false;
        int iZ = (this.f35918b.a().p(N.f36060Z0) ? C4945r4.z(this.f35918b, th2) : 2) - 1;
        if (iZ == 0) {
            this.f35918b.zzj().H().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", L2.r(this.f35918b.l().C()), L2.r(th2.toString()));
            this.f35918b.f36695j = 1;
            this.f35918b.A0().add(this.f35917a);
            return;
        }
        if (iZ != 1) {
            if (iZ != 2) {
                return;
            }
            this.f35918b.zzj().C().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", L2.r(this.f35918b.l().C()), th2);
            b();
            this.f35918b.f36695j = 1;
            this.f35918b.I0();
            return;
        }
        this.f35918b.A0().add(this.f35917a);
        if (this.f35918b.f36695j > ((Integer) N.f36120v0.a(null)).intValue()) {
            this.f35918b.f36695j = 1;
            this.f35918b.zzj().H().c("registerTriggerAsync failed. May try later. App ID, throwable", L2.r(this.f35918b.l().C()), L2.r(th2.toString()));
            return;
        }
        this.f35918b.zzj().H().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", L2.r(this.f35918b.l().C()), L2.r(String.valueOf(this.f35918b.f36695j)), L2.r(th2.toString()));
        C4945r4 c4945r4 = this.f35918b;
        C4945r4.R0(c4945r4, c4945r4.f36695j);
        this.f35918b.f36695j <<= 1;
    }

    @Override // com.google.common.util.concurrent.a
    public final void onSuccess(Object obj) {
        this.f35918b.j();
        b();
        this.f35918b.f36694i = false;
        this.f35918b.f36695j = 1;
        this.f35918b.zzj().B().b("Successfully registered trigger URI", this.f35917a.f35971a);
        this.f35918b.I0();
    }
}
