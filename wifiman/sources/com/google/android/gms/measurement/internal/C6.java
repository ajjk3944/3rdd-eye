package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class C6 {

    /* renamed from: a, reason: collision with root package name */
    private long f35819a;

    /* renamed from: b, reason: collision with root package name */
    protected long f35820b;

    /* renamed from: c, reason: collision with root package name */
    private final A f35821c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4987w6 f35822d;

    public C6(C4987w6 c4987w6) {
        this.f35822d = c4987w6;
        this.f35821c = new B6(this, c4987w6.f36331a);
        long jC = c4987w6.zzb().c();
        this.f35819a = jC;
        this.f35820b = jC;
    }

    static /* synthetic */ void c(C6 c62) {
        c62.f35822d.j();
        c62.d(false, false, c62.f35822d.zzb().c());
        c62.f35822d.k().s(c62.f35822d.zzb().c());
    }

    final long a(long j10) {
        long j11 = j10 - this.f35820b;
        this.f35820b = j10;
        return j11;
    }

    final void b() {
        this.f35821c.a();
        if (this.f35822d.a().p(N.f36069c1)) {
            this.f35819a = this.f35822d.zzb().c();
        } else {
            this.f35819a = 0L;
        }
        this.f35820b = this.f35819a;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f35822d.j();
        this.f35822d.u();
        if (this.f35822d.f36331a.n()) {
            this.f35822d.e().f36278r.b(this.f35822d.zzb().a());
        }
        long jA = j10 - this.f35819a;
        if (!z10 && jA < 1000) {
            this.f35822d.zzj().G().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jA));
            return false;
        }
        if (!z11) {
            jA = a(j10);
        }
        this.f35822d.zzj().G().b("Recording user engagement, ms", Long.valueOf(jA));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jA);
        x7.T(this.f35822d.p().z(!this.f35822d.a().T()), bundle, true);
        if (!z11) {
            this.f35822d.n().c1("auto", "_e", bundle);
        }
        this.f35819a = j10;
        this.f35821c.a();
        this.f35821c.b(((Long) N.f36107p0.a(null)).longValue());
        return true;
    }

    final void e(long j10) {
        this.f35821c.a();
    }

    final void f(long j10) {
        this.f35822d.j();
        this.f35821c.a();
        this.f35819a = j10;
        this.f35820b = j10;
    }
}
