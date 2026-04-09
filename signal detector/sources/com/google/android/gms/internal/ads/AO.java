package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class AO implements InterfaceC1099eO {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6984a;

    /* renamed from: b, reason: collision with root package name */
    public long f6985b;

    /* renamed from: c, reason: collision with root package name */
    public long f6986c;

    /* renamed from: d, reason: collision with root package name */
    public C2159y5 f6987d;

    public final void a(long j6) {
        this.f6985b = j6;
        if (this.f6984a) {
            this.f6986c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final void b(C2159y5 c2159y5) {
        if (this.f6984a) {
            a(e());
        }
        this.f6987d = c2159y5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final long e() {
        long j6 = this.f6985b;
        if (!this.f6984a) {
            return j6;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6986c;
        return (this.f6987d.f17679a == 1.0f ? Vt.s(jElapsedRealtime) : jElapsedRealtime * r4.f17681c) + j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final C2159y5 h() {
        return this.f6987d;
    }
}
