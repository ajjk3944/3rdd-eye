package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.m22;
import com.yandex.mobile.ads.impl.ti2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class si2 extends m22 {

    /* renamed from: n, reason: collision with root package name */
    private a f33077n;

    /* renamed from: o, reason: collision with root package name */
    private int f33078o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33079p;

    /* renamed from: q, reason: collision with root package name */
    private ti2.c f33080q;

    /* renamed from: r, reason: collision with root package name */
    private ti2.a f33081r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ti2.c f33082a;

        /* renamed from: b, reason: collision with root package name */
        public final ti2.a f33083b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f33084c;

        /* renamed from: d, reason: collision with root package name */
        public final ti2.b[] f33085d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33086e;

        public a(ti2.c cVar, ti2.a aVar, byte[] bArr, ti2.b[] bVarArr, int i) {
            this.f33082a = cVar;
            this.f33083b = aVar;
            this.f33084c = bArr;
            this.f33085d = bVarArr;
            this.f33086e = i;
        }
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final long a(uf1 uf1Var) {
        if ((uf1Var.c()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = uf1Var.c()[0];
        a aVar = this.f33077n;
        if (aVar == null) {
            throw new IllegalStateException();
        }
        int i = !aVar.f33085d[(b10 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - aVar.f33086e))].f33627a ? aVar.f33082a.f33632e : aVar.f33082a.f33633f;
        long j4 = this.f33079p ? (this.f33078o + i) / 4 : 0;
        if (uf1Var.b() < uf1Var.e() + 4) {
            uf1Var.a(Arrays.copyOf(uf1Var.c(), uf1Var.e() + 4));
        } else {
            uf1Var.d(uf1Var.e() + 4);
        }
        byte[] bArrC = uf1Var.c();
        bArrC[uf1Var.e() - 4] = (byte) (j4 & 255);
        bArrC[uf1Var.e() - 3] = (byte) ((j4 >>> 8) & 255);
        bArrC[uf1Var.e() - 2] = (byte) ((j4 >>> 16) & 255);
        bArrC[uf1Var.e() - 1] = (byte) ((j4 >>> 24) & 255);
        this.f33079p = true;
        this.f33078o = i;
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final void c(long j4) {
        super.c(j4);
        this.f33079p = j4 != 0;
        ti2.c cVar = this.f33080q;
        this.f33078o = cVar != null ? cVar.f33632e : 0;
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final boolean a(uf1 uf1Var, long j4, m22.a aVar) throws IOException {
        a aVar2;
        int i;
        int i10;
        int i11;
        if (this.f33077n != null) {
            aVar.f30181a.getClass();
            return false;
        }
        ti2.c cVar = this.f33080q;
        int i12 = 1;
        if (cVar == null) {
            this.f33080q = ti2.a(uf1Var);
        } else {
            ti2.a aVar3 = this.f33081r;
            if (aVar3 == null) {
                this.f33081r = ti2.a(uf1Var, true, true);
            } else {
                byte[] bArr = new byte[uf1Var.e()];
                System.arraycopy(uf1Var.c(), 0, bArr, 0, uf1Var.e());
                int i13 = cVar.f33628a;
                int i14 = 5;
                ti2.a(5, uf1Var, false);
                int iT = uf1Var.t() + 1;
                pi2 pi2Var = new pi2(uf1Var.c());
                pi2Var.b(uf1Var.d() * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 < iT) {
                        int i17 = i12;
                        if (pi2Var.a(24) == 5653314) {
                            int iA = pi2Var.a(16);
                            int iA2 = pi2Var.a(24);
                            long[] jArr = new long[iA2];
                            long jFloor = 0;
                            if (!pi2Var.b()) {
                                boolean zB = pi2Var.b();
                                int i18 = 0;
                                while (i18 < iA2) {
                                    if (zB) {
                                        if (pi2Var.b()) {
                                            i11 = iT;
                                            jArr[i18] = pi2Var.a(i14) + 1;
                                        } else {
                                            i11 = iT;
                                            jArr[i18] = 0;
                                        }
                                        i10 = 5;
                                    } else {
                                        i10 = i14;
                                        i11 = iT;
                                        jArr[i18] = pi2Var.a(i10) + 1;
                                    }
                                    i18++;
                                    i14 = i10;
                                    iT = i11;
                                }
                                i = iT;
                            } else {
                                i = iT;
                                int iA3 = pi2Var.a(i14) + 1;
                                int i19 = 0;
                                while (i19 < iA2) {
                                    int i20 = 0;
                                    for (int i21 = iA2 - i19; i21 > 0; i21 >>>= 1) {
                                        i20++;
                                    }
                                    int iA4 = pi2Var.a(i20);
                                    int i22 = 0;
                                    while (i22 < iA4 && i19 < iA2) {
                                        jArr[i19] = iA3;
                                        i19++;
                                        i22++;
                                        cVar = cVar;
                                        aVar3 = aVar3;
                                    }
                                    iA3++;
                                    cVar = cVar;
                                    aVar3 = aVar3;
                                }
                            }
                            ti2.c cVar2 = cVar;
                            ti2.a aVar4 = aVar3;
                            int iA5 = pi2Var.a(4);
                            if (iA5 > 2) {
                                throw yf1.a("lookup type greater than 2 not decodable: " + iA5, (Exception) null);
                            }
                            if (iA5 == i17 || iA5 == 2) {
                                pi2Var.b(32);
                                pi2Var.b(32);
                                int iA6 = pi2Var.a(4) + i17;
                                pi2Var.b(i17);
                                if (iA5 != i17) {
                                    jFloor = iA2 * iA;
                                } else if (iA != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / iA));
                                }
                                pi2Var.b((int) (iA6 * jFloor));
                            }
                            i15++;
                            cVar = cVar2;
                            iT = i;
                            aVar3 = aVar4;
                            i14 = 5;
                            i12 = 1;
                        } else {
                            throw yf1.a("expected code book to start with [0x56, 0x43, 0x42] at " + pi2Var.a(), (Exception) null);
                        }
                    } else {
                        ti2.c cVar3 = cVar;
                        ti2.a aVar5 = aVar3;
                        int i23 = 6;
                        int iA7 = pi2Var.a(6) + 1;
                        for (int i24 = 0; i24 < iA7; i24++) {
                            if (pi2Var.a(16) != 0) {
                                throw yf1.a("placeholder of time domain transforms not zeroed out", (Exception) null);
                            }
                        }
                        int i25 = 1;
                        int iA8 = pi2Var.a(6) + 1;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < iA8) {
                                int iA9 = pi2Var.a(i16);
                                if (iA9 == 0) {
                                    int i28 = 8;
                                    pi2Var.b(8);
                                    pi2Var.b(16);
                                    pi2Var.b(16);
                                    pi2Var.b(6);
                                    pi2Var.b(8);
                                    int iA10 = pi2Var.a(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iA10) {
                                        pi2Var.b(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iA9 != i25) {
                                        throw yf1.a("floor type greater than 1 not decodable: " + iA9, (Exception) null);
                                    }
                                    int iA11 = pi2Var.a(5);
                                    int[] iArr = new int[iA11];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iA11; i31++) {
                                        int iA12 = pi2Var.a(4);
                                        iArr[i31] = iA12;
                                        if (iA12 > i30) {
                                            i30 = iA12;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = pi2Var.a(i27) + 1;
                                        int iA13 = pi2Var.a(2);
                                        int i34 = 8;
                                        if (iA13 > 0) {
                                            pi2Var.b(8);
                                        }
                                        int i35 = 0;
                                        for (int i36 = 1; i35 < (i36 << iA13); i36 = 1) {
                                            pi2Var.b(i34);
                                            i35++;
                                            i34 = 8;
                                        }
                                        i33++;
                                        i27 = 3;
                                    }
                                    pi2Var.b(2);
                                    int iA14 = pi2Var.a(4);
                                    int i37 = 0;
                                    int i38 = 0;
                                    for (int i39 = 0; i39 < iA11; i39++) {
                                        i37 += iArr2[iArr[i39]];
                                        while (i38 < i37) {
                                            pi2Var.b(iA14);
                                            i38++;
                                        }
                                    }
                                }
                                i26++;
                                i23 = 6;
                                i25 = 1;
                                i16 = 16;
                            } else {
                                int iA15 = pi2Var.a(i23) + 1;
                                int i40 = 0;
                                while (i40 < iA15) {
                                    if (pi2Var.a(16) <= 2) {
                                        pi2Var.b(24);
                                        pi2Var.b(24);
                                        pi2Var.b(24);
                                        int iA16 = pi2Var.a(i23) + 1;
                                        int i41 = 8;
                                        pi2Var.b(8);
                                        int[] iArr3 = new int[iA16];
                                        for (int i42 = 0; i42 < iA16; i42++) {
                                            iArr3[i42] = ((pi2Var.b() ? pi2Var.a(5) : 0) * 8) + pi2Var.a(3);
                                        }
                                        int i43 = 0;
                                        while (i43 < iA16) {
                                            int i44 = 0;
                                            while (i44 < i41) {
                                                if ((iArr3[i43] & (1 << i44)) != 0) {
                                                    pi2Var.b(i41);
                                                }
                                                i44++;
                                                i41 = 8;
                                            }
                                            i43++;
                                            i41 = 8;
                                        }
                                        i40++;
                                        i23 = 6;
                                    } else {
                                        throw yf1.a("residueType greater than 2 is not decodable", (Exception) null);
                                    }
                                }
                                int iA17 = pi2Var.a(i23) + 1;
                                for (int i45 = 0; i45 < iA17; i45++) {
                                    int iA18 = pi2Var.a(16);
                                    if (iA18 != 0) {
                                        rs0.b("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                                    } else {
                                        int iA19 = pi2Var.b() ? pi2Var.a(4) + 1 : 1;
                                        if (pi2Var.b()) {
                                            int iA20 = pi2Var.a(8) + 1;
                                            for (int i46 = 0; i46 < iA20; i46++) {
                                                int i47 = i13 - 1;
                                                int i48 = 0;
                                                for (int i49 = i47; i49 > 0; i49 >>>= 1) {
                                                    i48++;
                                                }
                                                pi2Var.b(i48);
                                                int i50 = 0;
                                                while (i47 > 0) {
                                                    i50++;
                                                    i47 >>>= 1;
                                                }
                                                pi2Var.b(i50);
                                            }
                                        }
                                        if (pi2Var.a(2) != 0) {
                                            throw yf1.a("to reserved bits must be zero after mapping coupling steps", (Exception) null);
                                        }
                                        if (iA19 > 1) {
                                            for (int i51 = 0; i51 < i13; i51++) {
                                                pi2Var.b(4);
                                            }
                                        }
                                        for (int i52 = 0; i52 < iA19; i52++) {
                                            pi2Var.b(8);
                                            pi2Var.b(8);
                                            pi2Var.b(8);
                                        }
                                    }
                                }
                                int iA21 = pi2Var.a(6);
                                int i53 = iA21 + 1;
                                ti2.b[] bVarArr = new ti2.b[i53];
                                for (int i54 = 0; i54 < i53; i54++) {
                                    boolean zB2 = pi2Var.b();
                                    pi2Var.a(16);
                                    pi2Var.a(16);
                                    pi2Var.a(8);
                                    bVarArr[i54] = new ti2.b(zB2);
                                }
                                if (pi2Var.b()) {
                                    int i55 = 0;
                                    while (iA21 > 0) {
                                        i55++;
                                        iA21 >>>= 1;
                                    }
                                    aVar2 = new a(cVar3, aVar5, bArr, bVarArr, i55);
                                } else {
                                    throw yf1.a("framing bit after modes not set as expected", (Exception) null);
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.f33077n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ti2.c cVar4 = aVar2.f33082a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar4.f33634g);
        arrayList.add(aVar2.f33084c);
        aVar.f30181a = new dc0.a().e("audio/vorbis").b(cVar4.f33631d).j(cVar4.f33630c).c(cVar4.f33628a).l(cVar4.f33629b).a(arrayList).a(ti2.a(xj0.b(aVar2.f33083b.f33626a))).a();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f33077n = null;
            this.f33080q = null;
            this.f33081r = null;
        }
        this.f33078o = 0;
        this.f33079p = false;
    }
}
