package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t30 implements q10 {

    /* renamed from: b, reason: collision with root package name */
    public int f16682b;

    /* renamed from: c, reason: collision with root package name */
    public float f16683c;

    /* renamed from: d, reason: collision with root package name */
    public float f16684d;

    /* renamed from: e, reason: collision with root package name */
    public j00 f16685e;

    /* renamed from: f, reason: collision with root package name */
    public j00 f16686f;
    public j00 g;

    /* renamed from: h, reason: collision with root package name */
    public j00 f16687h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16688i;
    public l30 j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f16689k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f16690l;

    /* renamed from: m, reason: collision with root package name */
    public long f16691m;

    /* renamed from: n, reason: collision with root package name */
    public long f16692n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16693o;

    @Override // com.google.android.gms.internal.ads.q10
    public final void A1() {
        this.f16683c = 1.0f;
        this.f16684d = 1.0f;
        j00 j00Var = j00.f12557e;
        this.f16685e = j00Var;
        this.f16686f = j00Var;
        this.g = j00Var;
        this.f16687h = j00Var;
        ByteBuffer byteBuffer = q10.f15188a;
        this.f16689k = byteBuffer;
        this.f16690l = byteBuffer;
        this.f16682b = -1;
        this.f16688i = false;
        this.j = null;
        this.f16691m = 0L;
        this.f16692n = 0L;
        this.f16693o = false;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void C1() {
        if (zzc()) {
            j00 j00Var = this.f16685e;
            this.g = j00Var;
            j00 j00Var2 = this.f16686f;
            this.f16687h = j00Var2;
            if (this.f16688i) {
                this.j = new l30(j00Var.f12558a, j00Var.f12559b, this.f16683c, this.f16684d, j00Var2.f12558a, j00Var.f12560c == 4);
            } else {
                l30 l30Var = this.j;
                if (l30Var != null) {
                    l30Var.j = 0;
                    l30Var.f13359k = 0;
                    l30Var.f13360l = 0;
                    l30Var.f13361m = 0;
                    l30Var.f13362n = 0;
                    l30Var.f13363o = 0;
                    l30Var.f13364p = 0;
                    l30Var.f13365q = 0.0d;
                    l30Var.f13358i.e();
                }
            }
        }
        this.f16690l = q10.f15188a;
        this.f16691m = 0L;
        this.f16692n = 0L;
        this.f16693o = false;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            l30 l30Var = this.j;
            l30Var.getClass();
            this.f16691m += byteBuffer.remaining();
            p20 p20Var = l30Var.f13358i;
            int iRemaining = byteBuffer.remaining();
            int iB = iRemaining / (p20Var.b() * l30Var.f13352b);
            p20Var.a(iB);
            p20Var.g(byteBuffer, iRemaining);
            l30Var.j += iB;
            l30Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final j00 b(j00 j00Var) throws f10 {
        int i4 = j00Var.f12560c;
        if (i4 != 2 && i4 != 4) {
            throw new f10("Unhandled input format:", j00Var);
        }
        int i10 = this.f16682b;
        if (i10 == -1) {
            i10 = j00Var.f12558a;
        }
        this.f16685e = j00Var;
        j00 j00Var2 = new j00(i10, j00Var.f12559b, i4);
        this.f16686f = j00Var2;
        this.f16688i = true;
        return j00Var2;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void c() {
        l30 l30Var = this.j;
        if (l30Var != null) {
            int i4 = l30Var.j;
            int i10 = l30Var.f13363o;
            int i11 = l30Var.f13359k;
            float f10 = l30Var.f13353c;
            float f11 = l30Var.f13354d;
            int i12 = i11 + ((int) (((((((i4 - i10) / (f10 / f11)) + i10) + l30Var.f13365q) + l30Var.f13360l) / (l30Var.f13355e * f11)) + 0.5d));
            l30Var.f13365q = 0.0d;
            int i13 = l30Var.f13357h;
            int i14 = i13 + i13;
            p20 p20Var = l30Var.f13358i;
            p20Var.a(i4 + i14);
            p20Var.j(i4 * l30Var.f13352b, i14);
            l30Var.j += i14;
            l30Var.b();
            if (l30Var.f13359k > i12) {
                l30Var.f13359k = Math.max(i12, 0);
            }
            l30Var.j = 0;
            l30Var.f13363o = 0;
            l30Var.f13360l = 0;
        }
        this.f16693o = true;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final ByteBuffer d() {
        l30 l30Var = this.j;
        if (l30Var != null) {
            p20 p20Var = l30Var.f13358i;
            int i4 = l30Var.f13352b;
            mq0.c0(l30Var.f13359k >= 0);
            int iB = p20Var.b() * l30Var.f13359k * i4;
            if (iB > 0) {
                if (this.f16689k.capacity() < iB) {
                    this.f16689k = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                } else {
                    this.f16689k.clear();
                }
                ByteBuffer byteBuffer = this.f16689k;
                mq0.c0(l30Var.f13359k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (p20Var.b() * i4), l30Var.f13359k);
                p20Var.f(byteBuffer, iMin);
                l30Var.f13359k -= iMin;
                System.arraycopy(p20Var.E1(), iMin * i4, p20Var.E1(), 0, l30Var.f13359k * i4);
                this.f16689k.flip();
                this.f16692n += iB;
                this.f16690l = this.f16689k;
            }
        }
        ByteBuffer byteBuffer2 = this.f16690l;
        this.f16690l = q10.f15188a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final boolean e() {
        if (this.f16693o) {
            l30 l30Var = this.j;
            if (l30Var != null) {
                mq0.c0(l30Var.f13359k >= 0);
                if (l30Var.f13358i.b() * l30Var.f13359k * l30Var.f13352b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final long g(long j) {
        if (this.f16692n < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j / this.f16683c);
        }
        long j8 = this.f16691m;
        this.j.getClass();
        long jB = j8 - (r2.f13358i.b() * (r2.j * r2.f13352b));
        int i4 = this.f16687h.f12558a;
        int i10 = this.g.f12558a;
        return i4 == i10 ? bq0.u(j, this.f16692n, jB, RoundingMode.DOWN) : bq0.u(j, this.f16692n * i10, jB * i4, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final boolean zzc() {
        if (this.f16686f.f12558a != -1) {
            return Math.abs(this.f16683c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f16684d + (-1.0f)) >= 1.0E-4f || this.f16686f.f12558a != this.f16685e.f12558a;
        }
        return false;
    }
}
