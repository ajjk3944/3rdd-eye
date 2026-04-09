package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r3 implements x1 {

    /* renamed from: b, reason: collision with root package name */
    public z1 f15511b;

    /* renamed from: c, reason: collision with root package name */
    public int f15512c;

    /* renamed from: d, reason: collision with root package name */
    public int f15513d;

    /* renamed from: e, reason: collision with root package name */
    public int f15514e;
    public t3 g;

    /* renamed from: h, reason: collision with root package name */
    public y1 f15516h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.d f15517i;
    public v5 j;

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f15510a = new sk0(2);

    /* renamed from: f, reason: collision with root package name */
    public long f15515f = -1;

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    public final void b() {
        z1 z1Var = this.f15511b;
        z1Var.getClass();
        z1Var.i();
        this.f15511b.o(new d2(-9223372036854775807L, 0L));
        this.f15512c = 6;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        String strM;
        t1 t1Var = (t1) y1Var;
        sk0 sk0Var = this.f15510a;
        sk0Var.y(2);
        t1Var.O1(sk0Var.f16446a, 0, 2, false);
        if (sk0Var.L() == 65496) {
            while (true) {
                sk0Var.y(2);
                t1Var.O1(sk0Var.f16446a, 0, 2, false);
                int iL = sk0Var.L();
                this.f15513d = iL;
                if (iL == 65498) {
                    break;
                }
                sk0Var.y(2);
                t1Var.M1(0, 2, sk0Var.f16446a);
                int iL2 = sk0Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.f15513d != 65505) {
                    t1Var.e(iL2, false);
                } else {
                    sk0Var.y(iL2);
                    t1Var.O1(sk0Var.f16446a, 0, iL2, false);
                    if (Objects.equals(sk0Var.m(), "http://ns.adobe.com/xap/1.0/") && (strM = sk0Var.m()) != null) {
                        String[] strArr = jz.f12886h;
                        for (int i4 = 0; i4 < 4; i4++) {
                            if (strM.contains(String.valueOf(strArr[i4]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f15511b = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        if (j == 0) {
            this.f15512c = 0;
            this.j = null;
        } else if (this.f15512c == 5) {
            v5 v5Var = this.j;
            v5Var.getClass();
            v5Var.f(j, j8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026f  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r34, com.google.android.gms.internal.ads.c2 r35) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r3.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
