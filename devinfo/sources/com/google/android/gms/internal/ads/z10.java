package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z10 implements q10 {

    /* renamed from: b, reason: collision with root package name */
    public j00 f18954b;

    /* renamed from: c, reason: collision with root package name */
    public j00 f18955c;

    /* renamed from: d, reason: collision with root package name */
    public j00 f18956d;

    /* renamed from: e, reason: collision with root package name */
    public j00 f18957e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f18958f;
    public ByteBuffer g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18959h;

    public z10() {
        ByteBuffer byteBuffer = q10.f15188a;
        this.f18958f = byteBuffer;
        this.g = byteBuffer;
        j00 j00Var = j00.f12557e;
        this.f18956d = j00Var;
        this.f18957e = j00Var;
        this.f18954b = j00Var;
        this.f18955c = j00Var;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void A1() {
        ByteBuffer byteBuffer = q10.f15188a;
        this.g = byteBuffer;
        this.f18959h = false;
        this.f18958f = byteBuffer;
        j00 j00Var = j00.f12557e;
        this.f18956d = j00Var;
        this.f18957e = j00Var;
        this.f18954b = j00Var;
        this.f18955c = j00Var;
        k();
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void C1() {
        this.g = q10.f15188a;
        this.f18959h = false;
        this.f18954b = this.f18956d;
        this.f18955c = this.f18957e;
        j();
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final j00 b(j00 j00Var) {
        this.f18956d = j00Var;
        this.f18957e = h(j00Var);
        return zzc() ? this.f18957e : j00.f12557e;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void c() {
        this.f18959h = true;
        i();
    }

    @Override // com.google.android.gms.internal.ads.q10
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = q10.f15188a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public boolean e() {
        return this.f18959h && this.g == q10.f15188a;
    }

    public final ByteBuffer f(int i4) {
        if (this.f18958f.capacity() < i4) {
            this.f18958f = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.f18958f.clear();
        }
        ByteBuffer byteBuffer = this.f18958f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public abstract j00 h(j00 j00Var);

    @Override // com.google.android.gms.internal.ads.q10
    public boolean zzc() {
        return this.f18957e != j00.f12557e;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // com.google.android.gms.internal.ads.q10
    public long g(long j) {
        return j;
    }
}
