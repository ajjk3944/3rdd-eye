package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1166fi implements InterfaceC0812Xh {

    /* renamed from: b, reason: collision with root package name */
    public C1703ph f14117b;

    /* renamed from: c, reason: collision with root package name */
    public C1703ph f14118c;

    /* renamed from: d, reason: collision with root package name */
    public C1703ph f14119d;

    /* renamed from: e, reason: collision with root package name */
    public C1703ph f14120e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f14121f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f14122g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14123h;

    public AbstractC1166fi() {
        ByteBuffer byteBuffer = InterfaceC0812Xh.f12436a;
        this.f14121f = byteBuffer;
        this.f14122g = byteBuffer;
        C1703ph c1703ph = C1703ph.f16196e;
        this.f14119d = c1703ph;
        this.f14120e = c1703ph;
        this.f14117b = c1703ph;
        this.f14118c = c1703ph;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void b() {
        this.f14123h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final C1703ph c(C1703ph c1703ph) {
        this.f14119d = c1703ph;
        this.f14120e = k(c1703ph);
        return f() ? this.f14120e : C1703ph.f16196e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f14122g;
        this.f14122g = InterfaceC0812Xh.f12436a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public boolean e() {
        return this.f14123h && this.f14122g == InterfaceC0812Xh.f12436a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public boolean f() {
        return this.f14120e != C1703ph.f16196e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public long g(long j6) {
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void h() {
        ByteBuffer byteBuffer = InterfaceC0812Xh.f12436a;
        this.f14122g = byteBuffer;
        this.f14123h = false;
        this.f14121f = byteBuffer;
        C1703ph c1703ph = C1703ph.f16196e;
        this.f14119d = c1703ph;
        this.f14120e = c1703ph;
        this.f14117b = c1703ph;
        this.f14118c = c1703ph;
        n();
    }

    public final ByteBuffer i(int i) {
        if (this.f14121f.capacity() < i) {
            this.f14121f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f14121f.clear();
        }
        ByteBuffer byteBuffer = this.f14121f;
        this.f14122g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void j() {
        this.f14122g = InterfaceC0812Xh.f12436a;
        this.f14123h = false;
        this.f14117b = this.f14119d;
        this.f14118c = this.f14120e;
        m();
    }

    public abstract C1703ph k(C1703ph c1703ph);

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }
}
