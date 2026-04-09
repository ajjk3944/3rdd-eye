package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813Xi implements InterfaceC0812Xh {

    /* renamed from: b, reason: collision with root package name */
    public int f12437b;

    /* renamed from: c, reason: collision with root package name */
    public float f12438c;

    /* renamed from: d, reason: collision with root package name */
    public float f12439d;

    /* renamed from: e, reason: collision with root package name */
    public C1703ph f12440e;

    /* renamed from: f, reason: collision with root package name */
    public C1703ph f12441f;

    /* renamed from: g, reason: collision with root package name */
    public C1703ph f12442g;

    /* renamed from: h, reason: collision with root package name */
    public C1703ph f12443h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C0677Pi f12444j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f12445k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f12446l;

    /* renamed from: m, reason: collision with root package name */
    public long f12447m;

    /* renamed from: n, reason: collision with root package name */
    public long f12448n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12449o;

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C0677Pi c0677Pi = this.f12444j;
            c0677Pi.getClass();
            this.f12447m += byteBuffer.remaining();
            InterfaceC1973ui interfaceC1973ui = c0677Pi.i;
            int iRemaining = byteBuffer.remaining();
            int iA = iRemaining / (interfaceC1973ui.a() * c0677Pi.f10467b);
            interfaceC1973ui.c(iA);
            interfaceC1973ui.i(byteBuffer, iRemaining);
            c0677Pi.f10474j += iA;
            c0677Pi.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void b() {
        C0677Pi c0677Pi = this.f12444j;
        if (c0677Pi != null) {
            int i = c0677Pi.f10474j;
            int i3 = c0677Pi.f10479o;
            int i6 = c0677Pi.f10475k;
            float f2 = c0677Pi.f10468c;
            float f5 = c0677Pi.f10469d;
            int i7 = i6 + ((int) (((((((i - i3) / (f2 / f5)) + i3) + c0677Pi.f10481q) + c0677Pi.f10476l) / (c0677Pi.f10470e * f5)) + 0.5d));
            c0677Pi.f10481q = 0.0d;
            int i8 = c0677Pi.f10473h;
            int i9 = i8 + i8;
            InterfaceC1973ui interfaceC1973ui = c0677Pi.i;
            interfaceC1973ui.c(i + i9);
            interfaceC1973ui.n(i * c0677Pi.f10467b, i9);
            c0677Pi.f10474j += i9;
            c0677Pi.b();
            if (c0677Pi.f10475k > i7) {
                c0677Pi.f10475k = Math.max(i7, 0);
            }
            c0677Pi.f10474j = 0;
            c0677Pi.f10479o = 0;
            c0677Pi.f10476l = 0;
        }
        this.f12449o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final C1703ph c(C1703ph c1703ph) throws C0625Mh {
        int i = c1703ph.f16199c;
        if (i != 2 && i != 4) {
            throw new C0625Mh("Unhandled input format:", c1703ph);
        }
        int i3 = this.f12437b;
        if (i3 == -1) {
            i3 = c1703ph.f16197a;
        }
        this.f12440e = c1703ph;
        C1703ph c1703ph2 = new C1703ph(i3, c1703ph.f16198b, i);
        this.f12441f = c1703ph2;
        this.i = true;
        return c1703ph2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final ByteBuffer d() {
        C0677Pi c0677Pi = this.f12444j;
        if (c0677Pi != null) {
            InterfaceC1973ui interfaceC1973ui = c0677Pi.i;
            int i = c0677Pi.f10467b;
            AbstractC0582Jp.h0(c0677Pi.f10475k >= 0);
            int iA = interfaceC1973ui.a() * c0677Pi.f10475k * i;
            if (iA > 0) {
                if (this.f12445k.capacity() < iA) {
                    this.f12445k = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                } else {
                    this.f12445k.clear();
                }
                ByteBuffer byteBuffer = this.f12445k;
                AbstractC0582Jp.h0(c0677Pi.f10475k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (interfaceC1973ui.a() * i), c0677Pi.f10475k);
                interfaceC1973ui.h(byteBuffer, iMin);
                c0677Pi.f10475k -= iMin;
                System.arraycopy(interfaceC1973ui.l(), iMin * i, interfaceC1973ui.l(), 0, c0677Pi.f10475k * i);
                this.f12445k.flip();
                this.f12448n += iA;
                this.f12446l = this.f12445k;
            }
        }
        ByteBuffer byteBuffer2 = this.f12446l;
        this.f12446l = InterfaceC0812Xh.f12436a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final boolean e() {
        if (this.f12449o) {
            C0677Pi c0677Pi = this.f12444j;
            if (c0677Pi != null) {
                AbstractC0582Jp.h0(c0677Pi.f10475k >= 0);
                if (c0677Pi.i.a() * c0677Pi.f10475k * c0677Pi.f10467b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final boolean f() {
        if (this.f12441f.f16197a != -1) {
            return Math.abs(this.f12438c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f12439d + (-1.0f)) >= 1.0E-4f || this.f12441f.f16197a != this.f12440e.f16197a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final long g(long j6) {
        if (this.f12448n < 1024) {
            return (long) (j6 / this.f12438c);
        }
        long j7 = this.f12447m;
        this.f12444j.getClass();
        long jA = j7 - (r2.i.a() * (r2.f10474j * r2.f10467b));
        int i = this.f12443h.f16197a;
        int i3 = this.f12442g.f16197a;
        return i == i3 ? Vt.u(j6, this.f12448n, jA, RoundingMode.DOWN) : Vt.u(j6, this.f12448n * i3, jA * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void h() {
        this.f12438c = 1.0f;
        this.f12439d = 1.0f;
        C1703ph c1703ph = C1703ph.f16196e;
        this.f12440e = c1703ph;
        this.f12441f = c1703ph;
        this.f12442g = c1703ph;
        this.f12443h = c1703ph;
        ByteBuffer byteBuffer = InterfaceC0812Xh.f12436a;
        this.f12445k = byteBuffer;
        this.f12446l = byteBuffer;
        this.f12437b = -1;
        this.i = false;
        this.f12444j = null;
        this.f12447m = 0L;
        this.f12448n = 0L;
        this.f12449o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void j() {
        if (f()) {
            C1703ph c1703ph = this.f12440e;
            this.f12442g = c1703ph;
            C1703ph c1703ph2 = this.f12441f;
            this.f12443h = c1703ph2;
            if (this.i) {
                this.f12444j = new C0677Pi(c1703ph.f16197a, c1703ph.f16198b, this.f12438c, this.f12439d, c1703ph2.f16197a, c1703ph.f16199c == 4);
            } else {
                C0677Pi c0677Pi = this.f12444j;
                if (c0677Pi != null) {
                    c0677Pi.f10474j = 0;
                    c0677Pi.f10475k = 0;
                    c0677Pi.f10476l = 0;
                    c0677Pi.f10477m = 0;
                    c0677Pi.f10478n = 0;
                    c0677Pi.f10479o = 0;
                    c0677Pi.f10480p = 0;
                    c0677Pi.f10481q = 0.0d;
                    c0677Pi.i.e();
                }
            }
        }
        this.f12446l = InterfaceC0812Xh.f12436a;
        this.f12447m = 0L;
        this.f12448n = 0L;
        this.f12449o = false;
    }
}
