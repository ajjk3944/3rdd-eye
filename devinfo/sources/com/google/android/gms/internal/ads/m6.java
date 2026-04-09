package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m6 extends l6 {

    /* renamed from: n, reason: collision with root package name */
    public g f13769n;

    /* renamed from: o, reason: collision with root package name */
    public int f13770o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13771p;

    /* renamed from: q, reason: collision with root package name */
    public k2 f13772q;

    /* renamed from: r, reason: collision with root package name */
    public mx0 f13773r;

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f13769n = null;
            this.f13772q = null;
            this.f13773r = null;
        }
        this.f13770o = 0;
        this.f13771p = false;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final long b(sk0 sk0Var) {
        byte b10 = sk0Var.f16446a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        g gVar = this.f13769n;
        gVar.getClass();
        k2 k2Var = (k2) gVar.f11325b;
        int i4 = !((s5[]) gVar.f11328e)[(b10 >> 1) & (255 >>> (8 - gVar.f11324a))].f15871b ? k2Var.f12987e : k2Var.f12988f;
        int i10 = this.f13771p ? (this.f13770o + i4) / 4 : 0;
        byte[] bArr = sk0Var.f16446a;
        int length = bArr.length;
        int i11 = sk0Var.f16448c;
        if (length < i11 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + 4);
            sk0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            sk0Var.C(i11 + 4);
        }
        long j = i10;
        byte[] bArr2 = sk0Var.f16446a;
        int i12 = sk0Var.f16448c;
        bArr2[i12 - 4] = (byte) (j & 255);
        bArr2[i12 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j >>> 24) & 255);
        this.f13771p = true;
        this.f13770o = i4;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final boolean c(sk0 sk0Var, long j, ce1 ce1Var) throws ua {
        g gVar;
        int i4;
        k2 k2Var;
        long jFloor;
        if (this.f13769n != null) {
            ((mx1) ce1Var.f10094b).getClass();
            return false;
        }
        k2 k2Var2 = this.f13772q;
        int i10 = 4;
        if (k2Var2 == null) {
            nn1.t(1, sk0Var, false);
            sk0Var.i();
            int iK = sk0Var.K();
            int i11 = sk0Var.i();
            int iC = sk0Var.c();
            if (iC <= 0) {
                iC = -1;
            }
            int iC2 = sk0Var.c();
            int i12 = iC2 <= 0 ? -1 : iC2;
            sk0Var.c();
            int iK2 = sk0Var.K();
            int iPow = (int) Math.pow(2.0d, iK2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iK2 & 240) >> 4);
            sk0Var.K();
            byte[] bArrCopyOf = Arrays.copyOf(sk0Var.f16446a, sk0Var.f16448c);
            k2 k2Var3 = new k2();
            k2Var3.f12983a = iK;
            k2Var3.f12984b = i11;
            k2Var3.f12985c = iC;
            k2Var3.f12986d = i12;
            k2Var3.f12987e = iPow;
            k2Var3.f12988f = iPow2;
            k2Var3.g = bArrCopyOf;
            this.f13772q = k2Var3;
        } else {
            mx0 mx0Var = this.f13773r;
            if (mx0Var == null) {
                this.f13773r = nn1.j(sk0Var, true, true);
            } else {
                int i13 = sk0Var.f16448c;
                byte[] bArr = new byte[i13];
                System.arraycopy(sk0Var.f16446a, 0, bArr, 0, i13);
                int i14 = k2Var2.f12983a;
                int i15 = 5;
                nn1.t(5, sk0Var, false);
                int iK3 = sk0Var.K() + 1;
                w2 w2Var = new w2(sk0Var.f16446a);
                int i16 = 8;
                w2Var.e(sk0Var.f16447b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = i16;
                    int i20 = 16;
                    if (i17 >= iK3) {
                        k2 k2Var4 = k2Var2;
                        int i21 = 6;
                        int iC3 = w2Var.c(6) + 1;
                        for (int i22 = 0; i22 < iC3; i22++) {
                            if (w2Var.c(16) != 0) {
                                throw ua.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i23 = 1;
                        int iC4 = w2Var.c(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < iC4) {
                                int iC5 = w2Var.c(i20);
                                if (iC5 == 0) {
                                    int i26 = i19;
                                    w2Var.e(i26);
                                    w2Var.e(16);
                                    w2Var.e(16);
                                    w2Var.e(6);
                                    w2Var.e(i26);
                                    int iC6 = w2Var.c(4) + 1;
                                    int i27 = 0;
                                    while (i27 < iC6) {
                                        w2Var.e(i26);
                                        i27++;
                                        i26 = 8;
                                    }
                                } else {
                                    if (iC5 != i23) {
                                        StringBuilder sb2 = new StringBuilder(r5.c.e(iC5, 41));
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iC5);
                                        throw ua.a(null, sb2.toString());
                                    }
                                    int iC7 = w2Var.c(5);
                                    int[] iArr = new int[iC7];
                                    int i28 = -1;
                                    for (int i29 = 0; i29 < iC7; i29++) {
                                        int iC8 = w2Var.c(4);
                                        iArr[i29] = iC8;
                                        if (iC8 > i28) {
                                            i28 = iC8;
                                        }
                                    }
                                    int i30 = i28 + 1;
                                    int[] iArr2 = new int[i30];
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        iArr2[i31] = w2Var.c(i25) + 1;
                                        int iC9 = w2Var.c(2);
                                        if (iC9 > 0) {
                                            i4 = i19;
                                            w2Var.e(i4);
                                        } else {
                                            i4 = i19;
                                        }
                                        int i32 = i30;
                                        int i33 = 0;
                                        for (int i34 = 1; i33 < (i34 << iC9); i34 = 1) {
                                            w2Var.e(i4);
                                            i33++;
                                            i4 = 8;
                                        }
                                        i31++;
                                        i30 = i32;
                                        i19 = 8;
                                        i25 = 3;
                                    }
                                    w2Var.e(2);
                                    int iC10 = w2Var.c(4);
                                    int i35 = 0;
                                    int i36 = 0;
                                    for (int i37 = 0; i37 < iC7; i37++) {
                                        i35 += iArr2[iArr[i37]];
                                        while (i36 < i35) {
                                            w2Var.e(iC10);
                                            i36++;
                                        }
                                    }
                                }
                                i24++;
                                i19 = 8;
                                i21 = 6;
                                i23 = 1;
                                i20 = 16;
                            } else {
                                int iC11 = w2Var.c(i21) + 1;
                                int i38 = 0;
                                while (i38 < iC11) {
                                    if (w2Var.c(16) > 2) {
                                        throw ua.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    w2Var.e(24);
                                    w2Var.e(24);
                                    w2Var.e(24);
                                    int iC12 = w2Var.c(i21) + 1;
                                    int i39 = 8;
                                    w2Var.e(8);
                                    int[] iArr3 = new int[iC12];
                                    for (int i40 = 0; i40 < iC12; i40++) {
                                        iArr3[i40] = ((w2Var.b() ? w2Var.c(5) : 0) * 8) + w2Var.c(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < iC12) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (1 << i42)) != 0) {
                                                w2Var.e(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i21 = 6;
                                }
                                int iC13 = w2Var.c(i21) + 1;
                                for (int i43 = 0; i43 < iC13; i43++) {
                                    int iC14 = w2Var.c(16);
                                    if (iC14 != 0) {
                                        StringBuilder sb3 = new StringBuilder(r5.c.e(iC14, 41));
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iC14);
                                        ls.D("VorbisUtil", sb3.toString());
                                    } else {
                                        int iC15 = w2Var.b() ? w2Var.c(4) + 1 : 1;
                                        if (w2Var.b()) {
                                            int iC16 = w2Var.c(8) + 1;
                                            for (int i44 = 0; i44 < iC16; i44++) {
                                                int i45 = i14 - 1;
                                                int i46 = i45;
                                                int i47 = 0;
                                                while (i46 > 0) {
                                                    i46 >>>= 1;
                                                    i47++;
                                                }
                                                w2Var.e(i47);
                                                int i48 = 0;
                                                while (i45 > 0) {
                                                    i45 >>>= 1;
                                                    i48++;
                                                }
                                                w2Var.e(i48);
                                            }
                                        }
                                        if (w2Var.c(2) != 0) {
                                            throw ua.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iC15 > 1) {
                                            for (int i49 = 0; i49 < i14; i49++) {
                                                w2Var.e(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < iC15; i50++) {
                                            w2Var.e(8);
                                            w2Var.e(8);
                                            w2Var.e(8);
                                        }
                                    }
                                }
                                int iC17 = w2Var.c(6);
                                int i51 = iC17 + 1;
                                s5[] s5VarArr = new s5[i51];
                                for (int i52 = 0; i52 < i51; i52++) {
                                    boolean zB = w2Var.b();
                                    w2Var.c(16);
                                    w2Var.c(16);
                                    w2Var.c(8);
                                    s5VarArr[i52] = new s5(1, zB);
                                }
                                if (!w2Var.b()) {
                                    throw ua.a(null, "framing bit after modes not set as expected");
                                }
                                int i53 = 0;
                                while (iC17 > 0) {
                                    iC17 >>>= 1;
                                    i53++;
                                }
                                gVar = new g(k2Var4, mx0Var, bArr, s5VarArr, i53);
                            }
                        }
                    } else {
                        if (w2Var.c(24) != 5653314) {
                            int i54 = (w2Var.f17846c * 8) + w2Var.f17847d;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i54).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(i54);
                            throw ua.a(null, sb4.toString());
                        }
                        int iC18 = w2Var.c(16);
                        int iC19 = w2Var.c(24);
                        if (w2Var.b()) {
                            w2Var.e(i15);
                            int iC20 = 0;
                            while (iC20 < iC19) {
                                int i55 = iC19 - iC20;
                                int i56 = 0;
                                while (i55 > 0) {
                                    i55 >>>= 1;
                                    i56++;
                                }
                                iC20 += w2Var.c(i56);
                            }
                        } else {
                            boolean zB2 = w2Var.b();
                            for (int i57 = 0; i57 < iC19; i57++) {
                                if (!zB2) {
                                    w2Var.e(i15);
                                } else if (w2Var.b()) {
                                    w2Var.e(i15);
                                }
                            }
                        }
                        int iC21 = w2Var.c(i10);
                        if (iC21 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iC21).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iC21);
                            throw ua.a(null, sb5.toString());
                        }
                        if (iC21 != 1) {
                            if (iC21 != 2) {
                                k2Var = k2Var2;
                            }
                            i17++;
                            i16 = i19;
                            k2Var2 = k2Var;
                            i10 = 4;
                            i15 = 5;
                        } else {
                            i18 = iC21;
                        }
                        w2Var.e(32);
                        w2Var.e(32);
                        int iC22 = w2Var.c(i10) + 1;
                        w2Var.e(1);
                        if (i18 != 1) {
                            k2Var = k2Var2;
                            jFloor = iC19 * iC18;
                        } else if (iC18 != 0) {
                            k2Var = k2Var2;
                            jFloor = (long) Math.floor(Math.pow(iC19, 1.0d / iC18));
                        } else {
                            k2Var = k2Var2;
                            jFloor = 0;
                        }
                        w2Var.e((int) (jFloor * iC22));
                        i17++;
                        i16 = i19;
                        k2Var2 = k2Var;
                        i10 = 4;
                        i15 = 5;
                    }
                }
            }
        }
        gVar = null;
        this.f13769n = gVar;
        if (gVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        k2 k2Var5 = (k2) gVar.f11325b;
        arrayList.add((byte[]) k2Var5.g);
        arrayList.add((byte[]) gVar.f11327d);
        v8 v8VarQ = nn1.q(x41.r((String[]) ((mx0) gVar.f11326c).f14041b));
        lw1 lw1Var = new lw1();
        lw1Var.d("audio/ogg");
        lw1Var.e("audio/vorbis");
        lw1Var.g = k2Var5.f12986d;
        lw1Var.f13658h = k2Var5.f12985c;
        lw1Var.D = k2Var5.f12983a;
        lw1Var.E = k2Var5.f12984b;
        lw1Var.f13664o = arrayList;
        lw1Var.j = v8VarQ;
        ce1Var.f10094b = new mx1(lw1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void d(long j) {
        this.g = j;
        this.f13771p = j != 0;
        k2 k2Var = this.f13772q;
        this.f13770o = k2Var != null ? k2Var.f12987e : 0;
    }
}
