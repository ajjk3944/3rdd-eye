package com.google.android.gms.common.api.internal;

import android.util.Log;
import r3.C7564b;

/* loaded from: classes.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7564b f34750a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f34751b;

    C(D d10, C7564b c7564b) {
        this.f34751b = d10;
        this.f34750a = c7564b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d10 = this.f34751b;
        C4296z c4296z = (C4296z) d10.f34757f.f34832j.get(d10.f34753b);
        if (c4296z == null) {
            return;
        }
        if (!this.f34750a.i()) {
            c4296z.H(this.f34750a, null);
            return;
        }
        this.f34751b.f34756e = true;
        if (this.f34751b.f34752a.m()) {
            this.f34751b.i();
            return;
        }
        try {
            D d11 = this.f34751b;
            d11.f34752a.k(null, d11.f34752a.a());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f34751b.f34752a.b("Failed to get service from broker.");
            c4296z.H(new C7564b(10), null);
        }
    }
}
