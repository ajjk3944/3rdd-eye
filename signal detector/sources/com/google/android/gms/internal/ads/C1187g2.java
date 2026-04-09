package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187g2 implements J2 {

    /* renamed from: a, reason: collision with root package name */
    public long f14186a;

    /* renamed from: b, reason: collision with root package name */
    public long f14187b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14188c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14189d;

    public C1187g2(String str, byte[] bArr, long j6, long j7) {
        this.f14188c = str;
        this.f14189d = bArr;
        this.f14186a = j6;
        this.f14187b = j7;
    }

    public static C1187g2 a(P.g gVar, byte[] bArr) {
        gVar.h();
        ((A5) gVar.f3118b).f6933c.f16318b = C1458l5.e(bArr);
        List list = (List) gVar.k(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        gVar.m(jLongValue, Optional.empty());
        byte[] bArrJ = AbstractC1114el.j();
        String strConcat = "3.825731049.".concat(C2166yC.f17691d.g(bArrJ.length, bArrJ));
        C1187g2 c1187g2 = new C1187g2();
        c1187g2.f14189d = gVar;
        c1187g2.f14186a = jLongValue2;
        c1187g2.f14187b = jLongValue3;
        c1187g2.f14188c = strConcat;
        return c1187g2;
    }

    @Override // com.google.android.gms.internal.ads.J2
    public long b(InterfaceC2046w0 interfaceC2046w0) {
        long j6 = this.f14187b;
        if (j6 < 0) {
            return -1L;
        }
        this.f14187b = -1L;
        return -(j6 + 2);
    }

    @Override // com.google.android.gms.internal.ads.J2
    public void e(long j6) {
        long[] jArr = (long[]) ((C0697Ql) this.f14189d).f10691b;
        this.f14187b = jArr[Vt.q(jArr, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.J2
    public L0 f() {
        AbstractC0582Jp.h0(this.f14186a != -1);
        return new B0((C0) this.f14188c, this.f14186a, 0);
    }

    public C1187g2(long j6) {
        AbstractC0582Jp.h0(((C1238h) this.f14188c) == null);
        this.f14186a = j6;
        this.f14187b = j6 + 65536;
    }
}
