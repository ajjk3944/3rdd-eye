package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dk1 extends ck1 {
    public pj4 n;
    public int o;
    public boolean p;
    public xf1 q;
    public ug0 r;

    @Override // defpackage.ck1
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // defpackage.ck1
    public final long b(kz2 kz2Var) {
        byte b = kz2Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        pj4 pj4Var = this.n;
        pj4Var.getClass();
        xf1 xf1Var = (xf1) pj4Var.g;
        int i = !((kj1[]) pj4Var.j)[(b >> 1) & (255 >>> (8 - pj4Var.f))].g ? xf1Var.e : xf1Var.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = kz2Var.a;
        int length = bArr.length;
        int i3 = kz2Var.c;
        if (length < i3 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3 + 4);
            kz2Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            kz2Var.C(i3 + 4);
        }
        long j = i2;
        byte[] bArr2 = kz2Var.a;
        int i4 = kz2Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v61, types: [byte[], java.io.Serializable] */
    @Override // defpackage.ck1
    public final boolean c(kz2 kz2Var, long j, l92 l92Var) throws lq1 {
        pj4 pj4Var;
        int i;
        xf1 xf1Var;
        long jFloor;
        if (this.n != null) {
            ((ph4) l92Var.f).getClass();
            return false;
        }
        xf1 xf1Var2 = this.q;
        int i2 = 4;
        if (xf1Var2 == null) {
            pu1.F(1, kz2Var, false);
            kz2Var.i();
            int iK = kz2Var.K();
            int i3 = kz2Var.i();
            int iC = kz2Var.c();
            if (iC <= 0) {
                iC = -1;
            }
            int iC2 = kz2Var.c();
            int i4 = iC2 <= 0 ? -1 : iC2;
            kz2Var.c();
            int iK2 = kz2Var.K();
            int iPow = (int) Math.pow(2.0d, iK2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iK2 & 240) >> 4);
            kz2Var.K();
            ?? CopyOf = Arrays.copyOf(kz2Var.a, kz2Var.c);
            xf1 xf1Var3 = new xf1();
            xf1Var3.a = iK;
            xf1Var3.b = i3;
            xf1Var3.c = iC;
            xf1Var3.d = i4;
            xf1Var3.e = iPow;
            xf1Var3.f = iPow2;
            xf1Var3.g = CopyOf;
            this.q = xf1Var3;
        } else {
            ug0 ug0Var = this.r;
            if (ug0Var == null) {
                this.r = pu1.v(kz2Var, true, true);
            } else {
                int i5 = kz2Var.c;
                byte[] bArr = new byte[i5];
                System.arraycopy(kz2Var.a, 0, bArr, 0, i5);
                int i6 = xf1Var2.a;
                int i7 = 5;
                pu1.F(5, kz2Var, false);
                int iK3 = kz2Var.K() + 1;
                byte[] bArr2 = kz2Var.a;
                lg1 lg1Var = new lg1();
                lg1Var.a = bArr2;
                lg1Var.b = bArr2.length;
                int i8 = 8;
                lg1Var.g(kz2Var.b * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = i8;
                    int i12 = 16;
                    if (i9 >= iK3) {
                        xf1 xf1Var4 = xf1Var2;
                        int i13 = 6;
                        int iD = lg1Var.d(6) + 1;
                        for (int i14 = 0; i14 < iD; i14++) {
                            if (lg1Var.d(16) != 0) {
                                throw lq1.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iD2 = lg1Var.d(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < iD2) {
                                int iD3 = lg1Var.d(i12);
                                if (iD3 == 0) {
                                    int i18 = i11;
                                    lg1Var.g(i18);
                                    lg1Var.g(16);
                                    lg1Var.g(16);
                                    lg1Var.g(6);
                                    lg1Var.g(i18);
                                    int iD4 = lg1Var.d(4) + 1;
                                    int i19 = 0;
                                    while (i19 < iD4) {
                                        lg1Var.g(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (iD3 != i15) {
                                        StringBuilder sb = new StringBuilder(ga1.f(iD3, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(iD3);
                                        throw lq1.a(null, sb.toString());
                                    }
                                    int iD5 = lg1Var.d(5);
                                    int[] iArr = new int[iD5];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < iD5; i21++) {
                                        int iD6 = lg1Var.d(4);
                                        iArr[i21] = iD6;
                                        if (iD6 > i20) {
                                            i20 = iD6;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = lg1Var.d(i17) + 1;
                                        int iD7 = lg1Var.d(2);
                                        if (iD7 > 0) {
                                            i = i11;
                                            lg1Var.g(i);
                                        } else {
                                            i = i11;
                                        }
                                        int i24 = i22;
                                        int i25 = 0;
                                        for (int i26 = 1; i25 < (i26 << iD7); i26 = 1) {
                                            lg1Var.g(i);
                                            i25++;
                                            i = 8;
                                        }
                                        i23++;
                                        i22 = i24;
                                        i11 = 8;
                                        i17 = 3;
                                    }
                                    lg1Var.g(2);
                                    int iD8 = lg1Var.d(4);
                                    int i27 = 0;
                                    int i28 = 0;
                                    for (int i29 = 0; i29 < iD5; i29++) {
                                        i27 += iArr2[iArr[i29]];
                                        while (i28 < i27) {
                                            lg1Var.g(iD8);
                                            i28++;
                                        }
                                    }
                                }
                                i16++;
                                i11 = 8;
                                i13 = 6;
                                i15 = 1;
                                i12 = 16;
                            } else {
                                int iD9 = lg1Var.d(i13) + 1;
                                int i30 = 0;
                                while (i30 < iD9) {
                                    if (lg1Var.d(16) > 2) {
                                        throw lq1.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    lg1Var.g(24);
                                    lg1Var.g(24);
                                    lg1Var.g(24);
                                    int iD10 = lg1Var.d(i13) + 1;
                                    int i31 = 8;
                                    lg1Var.g(8);
                                    int[] iArr3 = new int[iD10];
                                    for (int i32 = 0; i32 < iD10; i32++) {
                                        iArr3[i32] = ((lg1Var.c() ? lg1Var.d(5) : 0) * 8) + lg1Var.d(3);
                                    }
                                    int i33 = 0;
                                    while (i33 < iD10) {
                                        int i34 = 0;
                                        while (i34 < i31) {
                                            if ((iArr3[i33] & (1 << i34)) != 0) {
                                                lg1Var.g(i31);
                                            }
                                            i34++;
                                            i31 = 8;
                                        }
                                        i33++;
                                        i31 = 8;
                                    }
                                    i30++;
                                    i13 = 6;
                                }
                                int iD11 = lg1Var.d(i13) + 1;
                                for (int i35 = 0; i35 < iD11; i35++) {
                                    int iD12 = lg1Var.d(16);
                                    if (iD12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(ga1.f(iD12, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iD12);
                                        a30.A("VorbisUtil", sb2.toString());
                                    } else {
                                        int iD13 = lg1Var.c() ? lg1Var.d(4) + 1 : 1;
                                        if (lg1Var.c()) {
                                            int iD14 = lg1Var.d(8) + 1;
                                            for (int i36 = 0; i36 < iD14; i36++) {
                                                int i37 = i6 - 1;
                                                int i38 = i37;
                                                int i39 = 0;
                                                while (i38 > 0) {
                                                    i38 >>>= 1;
                                                    i39++;
                                                }
                                                lg1Var.g(i39);
                                                int i40 = 0;
                                                while (i37 > 0) {
                                                    i37 >>>= 1;
                                                    i40++;
                                                }
                                                lg1Var.g(i40);
                                            }
                                        }
                                        if (lg1Var.d(2) != 0) {
                                            throw lq1.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iD13 > 1) {
                                            for (int i41 = 0; i41 < i6; i41++) {
                                                lg1Var.g(4);
                                            }
                                        }
                                        for (int i42 = 0; i42 < iD13; i42++) {
                                            lg1Var.g(8);
                                            lg1Var.g(8);
                                            lg1Var.g(8);
                                        }
                                    }
                                }
                                int iD15 = lg1Var.d(6);
                                int i43 = iD15 + 1;
                                kj1[] kj1VarArr = new kj1[i43];
                                for (int i44 = 0; i44 < i43; i44++) {
                                    boolean zC = lg1Var.c();
                                    lg1Var.d(16);
                                    lg1Var.d(16);
                                    lg1Var.d(8);
                                    kj1VarArr[i44] = new kj1(2, zC);
                                }
                                if (!lg1Var.c()) {
                                    throw lq1.a(null, "framing bit after modes not set as expected");
                                }
                                int i45 = 0;
                                while (iD15 > 0) {
                                    iD15 >>>= 1;
                                    i45++;
                                }
                                pj4Var = new pj4(xf1Var4, ug0Var, bArr, kj1VarArr, i45);
                            }
                        }
                    } else {
                        if (lg1Var.d(24) != 5653314) {
                            int i46 = (lg1Var.c * 8) + lg1Var.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i46).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i46);
                            throw lq1.a(null, sb3.toString());
                        }
                        int iD16 = lg1Var.d(16);
                        int iD17 = lg1Var.d(24);
                        if (lg1Var.c()) {
                            lg1Var.g(i7);
                            int iD18 = 0;
                            while (iD18 < iD17) {
                                int i47 = iD17 - iD18;
                                int i48 = 0;
                                while (i47 > 0) {
                                    i47 >>>= 1;
                                    i48++;
                                }
                                iD18 += lg1Var.d(i48);
                            }
                        } else {
                            boolean zC2 = lg1Var.c();
                            for (int i49 = 0; i49 < iD17; i49++) {
                                if (!zC2) {
                                    lg1Var.g(i7);
                                } else if (lg1Var.c()) {
                                    lg1Var.g(i7);
                                }
                            }
                        }
                        int iD19 = lg1Var.d(i2);
                        if (iD19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iD19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iD19);
                            throw lq1.a(null, sb4.toString());
                        }
                        if (iD19 != 1) {
                            if (iD19 != 2) {
                                xf1Var = xf1Var2;
                            }
                            i9++;
                            i8 = i11;
                            xf1Var2 = xf1Var;
                            i2 = 4;
                            i7 = 5;
                        } else {
                            i10 = iD19;
                        }
                        lg1Var.g(32);
                        lg1Var.g(32);
                        int iD20 = lg1Var.d(i2) + 1;
                        lg1Var.g(1);
                        if (i10 != 1) {
                            xf1Var = xf1Var2;
                            jFloor = iD17 * iD16;
                        } else if (iD16 != 0) {
                            xf1Var = xf1Var2;
                            jFloor = (long) Math.floor(Math.pow(iD17, 1.0d / iD16));
                        } else {
                            xf1Var = xf1Var2;
                            jFloor = 0;
                        }
                        lg1Var.g((int) (jFloor * iD20));
                        i9++;
                        i8 = i11;
                        xf1Var2 = xf1Var;
                        i2 = 4;
                        i7 = 5;
                    }
                }
            }
        }
        pj4Var = null;
        this.n = pj4Var;
        if (pj4Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        xf1 xf1Var5 = (xf1) pj4Var.g;
        arrayList.add((byte[]) xf1Var5.g);
        arrayList.add((byte[]) pj4Var.i);
        wn1 wn1VarA = pu1.A(xm3.n((String[]) ((ug0) pj4Var.h).g));
        gg4 gg4Var = new gg4();
        gg4Var.d("audio/ogg");
        gg4Var.e("audio/vorbis");
        gg4Var.g = xf1Var5.d;
        gg4Var.h = xf1Var5.c;
        gg4Var.D = xf1Var5.a;
        gg4Var.E = xf1Var5.b;
        gg4Var.o = arrayList;
        gg4Var.j = wn1VarA;
        l92Var.f = new ph4(gg4Var);
        return true;
    }

    @Override // defpackage.ck1
    public final void d(long j) {
        this.g = j;
        this.p = j != 0;
        xf1 xf1Var = this.q;
        this.o = xf1Var != null ? xf1Var.e : 0;
    }
}
