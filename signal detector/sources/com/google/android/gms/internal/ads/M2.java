package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class M2 extends L2 {

    /* renamed from: n, reason: collision with root package name */
    public C1184g f9796n;

    /* renamed from: o, reason: collision with root package name */
    public int f9797o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9798p;

    /* renamed from: q, reason: collision with root package name */
    public J0 f9799q;

    /* renamed from: r, reason: collision with root package name */
    public Rx f9800r;

    @Override // com.google.android.gms.internal.ads.L2
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f9796n = null;
            this.f9799q = null;
            this.f9800r = null;
        }
        this.f9797o = 0;
        this.f9798p = false;
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final long b(C2036vr c2036vr) {
        byte b5 = c2036vr.f17354a[0];
        if ((b5 & 1) == 1) {
            return -1L;
        }
        C1184g c1184g = this.f9796n;
        c1184g.getClass();
        J0 j02 = (J0) c1184g.f14180b;
        int i = !((C1778r2[]) c1184g.f14183e)[(b5 >> 1) & (255 >>> (8 - c1184g.f14179a))].f16455b ? j02.f9212e : j02.f9213f;
        int i3 = this.f9798p ? (this.f9797o + i) / 4 : 0;
        byte[] bArr = c2036vr.f17354a;
        int length = bArr.length;
        int i6 = c2036vr.f17356c;
        if (length < i6 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i6 + 4);
            c2036vr.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            c2036vr.C(i6 + 4);
        }
        long j6 = i3;
        byte[] bArr2 = c2036vr.f17354a;
        int i7 = c2036vr.f17356c;
        bArr2[i7 - 4] = (byte) (j6 & 255);
        bArr2[i7 - 3] = (byte) ((j6 >>> 8) & 255);
        bArr2[i7 - 2] = (byte) ((j6 >>> 16) & 255);
        bArr2[i7 - 1] = (byte) ((j6 >>> 24) & 255);
        this.f9798p = true;
        this.f9797o = i;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final boolean c(C2036vr c2036vr, long j6, C0697Ql c0697Ql) throws P4 {
        C1184g c1184g;
        int i;
        J0 j02;
        long jFloor;
        if (this.f9796n != null) {
            ((TP) c0697Ql.f10691b).getClass();
            return false;
        }
        J0 j03 = this.f9799q;
        int i3 = 4;
        if (j03 == null) {
            AbstractC2022vd.B(1, c2036vr, false);
            c2036vr.i();
            int iK = c2036vr.K();
            int i6 = c2036vr.i();
            int iC = c2036vr.c();
            if (iC <= 0) {
                iC = -1;
            }
            int iC2 = c2036vr.c();
            int i7 = iC2 <= 0 ? -1 : iC2;
            c2036vr.c();
            int iK2 = c2036vr.K();
            int iPow = (int) Math.pow(2.0d, iK2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iK2 & 240) >> 4);
            c2036vr.K();
            byte[] bArrCopyOf = Arrays.copyOf(c2036vr.f17354a, c2036vr.f17356c);
            J0 j04 = new J0();
            j04.f9208a = iK;
            j04.f9209b = i6;
            j04.f9210c = iC;
            j04.f9211d = i7;
            j04.f9212e = iPow;
            j04.f9213f = iPow2;
            j04.f9214g = bArrCopyOf;
            this.f9799q = j04;
        } else {
            Rx rx = this.f9800r;
            if (rx == null) {
                this.f9800r = AbstractC2022vd.n(c2036vr, true, true);
            } else {
                int i8 = c2036vr.f17356c;
                byte[] bArr = new byte[i8];
                System.arraycopy(c2036vr.f17354a, 0, bArr, 0, i8);
                int i9 = j03.f9208a;
                int i10 = 5;
                AbstractC2022vd.B(5, c2036vr, false);
                int iK3 = c2036vr.K() + 1;
                V0 v0 = new V0(c2036vr.f17354a);
                int i11 = 8;
                v0.e(c2036vr.f17355b * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = i11;
                    int i15 = 16;
                    if (i12 >= iK3) {
                        J0 j05 = j03;
                        int i16 = 6;
                        int iC3 = v0.c(6) + 1;
                        for (int i17 = 0; i17 < iC3; i17++) {
                            if (v0.c(16) != 0) {
                                throw P4.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i18 = 1;
                        int iC4 = v0.c(6) + 1;
                        int i19 = 0;
                        while (true) {
                            int i20 = 3;
                            if (i19 < iC4) {
                                int iC5 = v0.c(i15);
                                if (iC5 == 0) {
                                    int i21 = i14;
                                    v0.e(i21);
                                    v0.e(16);
                                    v0.e(16);
                                    v0.e(6);
                                    v0.e(i21);
                                    int iC6 = v0.c(4) + 1;
                                    int i22 = 0;
                                    while (i22 < iC6) {
                                        v0.e(i21);
                                        i22++;
                                        i21 = 8;
                                    }
                                } else {
                                    if (iC5 != i18) {
                                        StringBuilder sb = new StringBuilder(AbstractC2763b.a(iC5, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(iC5);
                                        throw P4.a(null, sb.toString());
                                    }
                                    int iC7 = v0.c(5);
                                    int[] iArr = new int[iC7];
                                    int i23 = -1;
                                    for (int i24 = 0; i24 < iC7; i24++) {
                                        int iC8 = v0.c(4);
                                        iArr[i24] = iC8;
                                        if (iC8 > i23) {
                                            i23 = iC8;
                                        }
                                    }
                                    int i25 = i23 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = v0.c(i20) + 1;
                                        int iC9 = v0.c(2);
                                        if (iC9 > 0) {
                                            i = i14;
                                            v0.e(i);
                                        } else {
                                            i = i14;
                                        }
                                        int i27 = i25;
                                        int i28 = 0;
                                        for (int i29 = 1; i28 < (i29 << iC9); i29 = 1) {
                                            v0.e(i);
                                            i28++;
                                            i = 8;
                                        }
                                        i26++;
                                        i25 = i27;
                                        i14 = 8;
                                        i20 = 3;
                                    }
                                    v0.e(2);
                                    int iC10 = v0.c(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < iC7; i32++) {
                                        i30 += iArr2[iArr[i32]];
                                        while (i31 < i30) {
                                            v0.e(iC10);
                                            i31++;
                                        }
                                    }
                                }
                                i19++;
                                i14 = 8;
                                i16 = 6;
                                i18 = 1;
                                i15 = 16;
                            } else {
                                int iC11 = v0.c(i16) + 1;
                                int i33 = 0;
                                while (i33 < iC11) {
                                    if (v0.c(16) > 2) {
                                        throw P4.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    v0.e(24);
                                    v0.e(24);
                                    v0.e(24);
                                    int iC12 = v0.c(i16) + 1;
                                    int i34 = 8;
                                    v0.e(8);
                                    int[] iArr3 = new int[iC12];
                                    for (int i35 = 0; i35 < iC12; i35++) {
                                        iArr3[i35] = ((v0.b() ? v0.c(5) : 0) * 8) + v0.c(3);
                                    }
                                    int i36 = 0;
                                    while (i36 < iC12) {
                                        int i37 = 0;
                                        while (i37 < i34) {
                                            if ((iArr3[i36] & (1 << i37)) != 0) {
                                                v0.e(i34);
                                            }
                                            i37++;
                                            i34 = 8;
                                        }
                                        i36++;
                                        i34 = 8;
                                    }
                                    i33++;
                                    i16 = 6;
                                }
                                int iC13 = v0.c(i16) + 1;
                                for (int i38 = 0; i38 < iC13; i38++) {
                                    int iC14 = v0.c(16);
                                    if (iC14 != 0) {
                                        StringBuilder sb2 = new StringBuilder(AbstractC2763b.a(iC14, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iC14);
                                        AbstractC2022vd.F("VorbisUtil", sb2.toString());
                                    } else {
                                        int iC15 = v0.b() ? v0.c(4) + 1 : 1;
                                        if (v0.b()) {
                                            int iC16 = v0.c(8) + 1;
                                            for (int i39 = 0; i39 < iC16; i39++) {
                                                int i40 = i9 - 1;
                                                int i41 = i40;
                                                int i42 = 0;
                                                while (i41 > 0) {
                                                    i41 >>>= 1;
                                                    i42++;
                                                }
                                                v0.e(i42);
                                                int i43 = 0;
                                                while (i40 > 0) {
                                                    i40 >>>= 1;
                                                    i43++;
                                                }
                                                v0.e(i43);
                                            }
                                        }
                                        if (v0.c(2) != 0) {
                                            throw P4.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iC15 > 1) {
                                            for (int i44 = 0; i44 < i9; i44++) {
                                                v0.e(4);
                                            }
                                        }
                                        for (int i45 = 0; i45 < iC15; i45++) {
                                            v0.e(8);
                                            v0.e(8);
                                            v0.e(8);
                                        }
                                    }
                                }
                                int iC17 = v0.c(6);
                                int i46 = iC17 + 1;
                                C1778r2[] c1778r2Arr = new C1778r2[i46];
                                for (int i47 = 0; i47 < i46; i47++) {
                                    boolean zB = v0.b();
                                    v0.c(16);
                                    v0.c(16);
                                    v0.c(8);
                                    c1778r2Arr[i47] = new C1778r2(1, zB);
                                }
                                if (!v0.b()) {
                                    throw P4.a(null, "framing bit after modes not set as expected");
                                }
                                int i48 = 0;
                                while (iC17 > 0) {
                                    iC17 >>>= 1;
                                    i48++;
                                }
                                c1184g = new C1184g(j05, rx, bArr, c1778r2Arr, i48);
                            }
                        }
                    } else {
                        if (v0.c(24) != 5653314) {
                            int i49 = (v0.f11860c * 8) + v0.f11861d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i49).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i49);
                            throw P4.a(null, sb3.toString());
                        }
                        int iC18 = v0.c(16);
                        int iC19 = v0.c(24);
                        if (v0.b()) {
                            v0.e(i10);
                            int iC20 = 0;
                            while (iC20 < iC19) {
                                int i50 = iC19 - iC20;
                                int i51 = 0;
                                while (i50 > 0) {
                                    i50 >>>= 1;
                                    i51++;
                                }
                                iC20 += v0.c(i51);
                            }
                        } else {
                            boolean zB2 = v0.b();
                            for (int i52 = 0; i52 < iC19; i52++) {
                                if (!zB2) {
                                    v0.e(i10);
                                } else if (v0.b()) {
                                    v0.e(i10);
                                }
                            }
                        }
                        int iC21 = v0.c(i3);
                        if (iC21 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iC21).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iC21);
                            throw P4.a(null, sb4.toString());
                        }
                        if (iC21 != 1) {
                            if (iC21 != 2) {
                                j02 = j03;
                            }
                            i12++;
                            i11 = i14;
                            j03 = j02;
                            i3 = 4;
                            i10 = 5;
                        } else {
                            i13 = iC21;
                        }
                        v0.e(32);
                        v0.e(32);
                        int iC22 = v0.c(i3) + 1;
                        v0.e(1);
                        if (i13 != 1) {
                            j02 = j03;
                            jFloor = iC19 * iC18;
                        } else if (iC18 != 0) {
                            j02 = j03;
                            jFloor = (long) Math.floor(Math.pow(iC19, 1.0d / iC18));
                        } else {
                            j02 = j03;
                            jFloor = 0;
                        }
                        v0.e((int) (jFloor * iC22));
                        i12++;
                        i11 = i14;
                        j03 = j02;
                        i3 = 4;
                        i10 = 5;
                    }
                }
            }
        }
        c1184g = null;
        this.f9796n = c1184g;
        if (c1184g == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        J0 j06 = (J0) c1184g.f14180b;
        arrayList.add((byte[]) j06.f9214g);
        arrayList.add((byte[]) c1184g.f14182d);
        U3 u3U = AbstractC2022vd.u(LB.n((String[]) ((Rx) c1184g.f14181c).f11090b));
        C1855sP c1855sP = new C1855sP();
        c1855sP.d("audio/ogg");
        c1855sP.e("audio/vorbis");
        c1855sP.f16728g = j06.f9211d;
        c1855sP.f16729h = j06.f9210c;
        c1855sP.f16714D = j06.f9208a;
        c1855sP.f16715E = j06.f9209b;
        c1855sP.f16735o = arrayList;
        c1855sP.f16730j = u3U;
        c0697Ql.f10691b = new TP(c1855sP);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final void d(long j6) {
        this.f9604g = j6;
        this.f9798p = j6 != 0;
        J0 j02 = this.f9799q;
        this.f9797o = j02 != null ? j02.f9212e : 0;
    }
}
