package ka;

import a5.u;
import ca.y;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.y0;
import io.sentry.android.core.e0;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Arrays;
import qb.p;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: o, reason: collision with root package name */
    public p f14260o;

    /* renamed from: p, reason: collision with root package name */
    public int f14261p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14262q;

    /* renamed from: r, reason: collision with root package name */
    public y f14263r;

    /* renamed from: s, reason: collision with root package name */
    public b9.c f14264s;

    @Override // ka.h
    public final void a(long j) {
        this.f14251d = j;
        this.f14262q = j != 0;
        y yVar = this.f14263r;
        this.f14261p = yVar != null ? yVar.f3521e : 0;
    }

    @Override // ka.h
    public final long c(fb.f fVar) {
        byte b2 = fVar.f8800a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        p pVar = this.f14260o;
        qb.b.k(pVar);
        int i10 = pVar.f20805a;
        y yVar = (y) pVar.f20806b;
        int i11 = !((a5.d[]) pVar.f20808d)[(b2 >> 1) & (255 >>> (8 - i10))].f104d ? yVar.f3521e : yVar.f3522f;
        long j = this.f14262q ? (this.f14261p + i11) / 4 : 0;
        byte[] bArr = fVar.f8800a;
        int length = bArr.length;
        int i12 = fVar.f8802c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            fVar.w(bArrCopyOf.length, bArrCopyOf);
        } else {
            fVar.x(i12);
        }
        byte[] bArr2 = fVar.f8800a;
        int i13 = fVar.f8802c;
        bArr2[i13 - 4] = (byte) (j & 255);
        bArr2[i13 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j >>> 24) & 255);
        this.f14262q = true;
        this.f14261p = i11;
        return j;
    }

    @Override // ka.h
    public final boolean e(fb.f fVar, long j, t tVar) throws y0 {
        p pVar;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f14260o != null) {
            ((Format) tVar.f12736a).getClass();
            return false;
        }
        y yVar = this.f14263r;
        int i14 = 1;
        int i15 = 4;
        if (yVar == null) {
            io.sentry.config.a.j0(1, fVar, false);
            fVar.h();
            int iO = fVar.o();
            int iH = fVar.h();
            int iF = fVar.f();
            int i16 = iF <= 0 ? -1 : iF;
            int iF2 = fVar.f();
            int i17 = iF2 <= 0 ? -1 : iF2;
            fVar.f();
            int iO2 = fVar.o();
            int iPow = (int) Math.pow(2.0d, iO2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iO2 & 240) >> 4);
            fVar.o();
            this.f14263r = new y(iO, iH, i16, i17, iPow, iPow2, Arrays.copyOf(fVar.f8800a, fVar.f8802c));
        } else if (this.f14264s == null) {
            this.f14264s = io.sentry.config.a.f0(fVar, true, true);
        } else {
            int i18 = fVar.f8802c;
            byte[] bArr = new byte[i18];
            System.arraycopy(fVar.f8800a, 0, bArr, 0, i18);
            int i19 = yVar.f3517a;
            int i20 = 5;
            io.sentry.config.a.j0(5, fVar, false);
            int iO3 = fVar.o() + 1;
            u uVar = new u(1, fVar.f8800a);
            int i21 = 8;
            uVar.s(fVar.f8801b * 8);
            int i22 = 0;
            while (true) {
                int i23 = 16;
                if (i22 < iO3) {
                    int i24 = i21;
                    if (uVar.i(24) != 5653314) {
                        int i25 = (uVar.f160d * 8) + uVar.f161e;
                        StringBuilder sb2 = new StringBuilder(66);
                        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb2.append(i25);
                        throw y0.a(null, sb2.toString());
                    }
                    int i26 = uVar.i(16);
                    int i27 = uVar.i(24);
                    long[] jArr = new long[i27];
                    long jFloor = 0;
                    if (uVar.h()) {
                        i10 = i14;
                        int i28 = uVar.i(i20) + 1;
                        i11 = i27;
                        int i29 = 0;
                        while (i29 < i11) {
                            int i30 = 0;
                            for (int i31 = i11 - i29; i31 > 0; i31 >>>= 1) {
                                i30++;
                            }
                            int i32 = uVar.i(i30);
                            int i33 = 0;
                            while (i33 < i32 && i29 < i11) {
                                jArr[i29] = i28;
                                i29++;
                                i33++;
                                iO3 = iO3;
                            }
                            i28++;
                            iO3 = iO3;
                        }
                        i12 = 4;
                    } else {
                        boolean zH = uVar.h();
                        i10 = i14;
                        int i34 = 0;
                        while (i34 < i27) {
                            if (!zH) {
                                i13 = i27;
                                jArr[i34] = uVar.i(i20) + 1;
                            } else if (uVar.h()) {
                                i13 = i27;
                                jArr[i34] = uVar.i(i20) + 1;
                            } else {
                                i13 = i27;
                                jArr[i34] = 0;
                            }
                            i34++;
                            i27 = i13;
                            i15 = 4;
                        }
                        i12 = i15;
                        i11 = i27;
                    }
                    int i35 = iO3;
                    int i36 = uVar.i(i12);
                    if (i36 > 2) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("lookup type greater than 2 not decodable: ");
                        sb3.append(i36);
                        throw y0.a(null, sb3.toString());
                    }
                    int i37 = i10;
                    if (i36 == i37 || i36 == 2) {
                        uVar.s(32);
                        uVar.s(32);
                        int i38 = uVar.i(i12) + i37;
                        uVar.s(i37);
                        if (i36 != i37) {
                            jFloor = i11 * i26;
                        } else if (i26 != 0) {
                            jFloor = (long) Math.floor(Math.pow(i11, 1.0d / i26));
                        }
                        uVar.s((int) (i38 * jFloor));
                    }
                    i22++;
                    i21 = i24;
                    iO3 = i35;
                    i14 = 1;
                    i15 = 4;
                    i20 = 5;
                } else {
                    int i39 = i21;
                    int i40 = 6;
                    int i41 = uVar.i(6) + 1;
                    for (int i42 = 0; i42 < i41; i42++) {
                        if (uVar.i(16) != 0) {
                            throw y0.a(null, "placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i43 = 1;
                    int i44 = uVar.i(6) + 1;
                    int i45 = 0;
                    while (true) {
                        int i46 = 3;
                        if (i45 < i44) {
                            int i47 = uVar.i(i23);
                            if (i47 == 0) {
                                int i48 = i39;
                                uVar.s(i48);
                                uVar.s(16);
                                uVar.s(16);
                                uVar.s(6);
                                uVar.s(i48);
                                int i49 = uVar.i(4) + 1;
                                int i50 = 0;
                                while (i50 < i49) {
                                    uVar.s(i48);
                                    i50++;
                                    i48 = 8;
                                }
                            } else {
                                if (i47 != i43) {
                                    StringBuilder sb4 = new StringBuilder(52);
                                    sb4.append("floor type greater than 1 not decodable: ");
                                    sb4.append(i47);
                                    throw y0.a(null, sb4.toString());
                                }
                                int i51 = uVar.i(5);
                                int[] iArr = new int[i51];
                                int i52 = -1;
                                for (int i53 = 0; i53 < i51; i53++) {
                                    int i54 = uVar.i(4);
                                    iArr[i53] = i54;
                                    if (i54 > i52) {
                                        i52 = i54;
                                    }
                                }
                                int i55 = i52 + 1;
                                int[] iArr2 = new int[i55];
                                int i56 = 0;
                                while (i56 < i55) {
                                    iArr2[i56] = uVar.i(i46) + 1;
                                    int i57 = uVar.i(2);
                                    int i58 = i39;
                                    if (i57 > 0) {
                                        uVar.s(i58);
                                    }
                                    int i59 = 0;
                                    for (int i60 = 1; i59 < (i60 << i57); i60 = 1) {
                                        uVar.s(i58);
                                        i59++;
                                        i58 = 8;
                                    }
                                    i56++;
                                    i39 = 8;
                                    i46 = 3;
                                }
                                uVar.s(2);
                                int i61 = uVar.i(4);
                                int i62 = 0;
                                int i63 = 0;
                                for (int i64 = 0; i64 < i51; i64++) {
                                    i62 += iArr2[iArr[i64]];
                                    while (i63 < i62) {
                                        uVar.s(i61);
                                        i63++;
                                    }
                                }
                            }
                            i45++;
                            i39 = 8;
                            i40 = 6;
                            i23 = 16;
                            i43 = 1;
                        } else {
                            int i65 = uVar.i(i40) + 1;
                            int i66 = 0;
                            while (i66 < i65) {
                                if (uVar.i(16) > 2) {
                                    throw y0.a(null, "residueType greater than 2 is not decodable");
                                }
                                uVar.s(24);
                                uVar.s(24);
                                uVar.s(24);
                                int i67 = uVar.i(i40) + 1;
                                int i68 = 8;
                                uVar.s(8);
                                int[] iArr3 = new int[i67];
                                for (int i69 = 0; i69 < i67; i69++) {
                                    iArr3[i69] = ((uVar.h() ? uVar.i(5) : 0) * 8) + uVar.i(3);
                                }
                                int i70 = 0;
                                while (i70 < i67) {
                                    int i71 = 0;
                                    while (i71 < i68) {
                                        if ((iArr3[i70] & (1 << i71)) != 0) {
                                            uVar.s(i68);
                                        }
                                        i71++;
                                        i68 = 8;
                                    }
                                    i70++;
                                    i68 = 8;
                                }
                                i66++;
                                i40 = 6;
                            }
                            int i72 = uVar.i(i40) + 1;
                            for (int i73 = 0; i73 < i72; i73++) {
                                int i74 = uVar.i(16);
                                if (i74 != 0) {
                                    StringBuilder sb5 = new StringBuilder(52);
                                    sb5.append("mapping type other than 0 not supported: ");
                                    sb5.append(i74);
                                    e0.d("VorbisUtil", sb5.toString());
                                } else {
                                    int i75 = uVar.h() ? uVar.i(4) + 1 : 1;
                                    if (uVar.h()) {
                                        int i76 = uVar.i(8) + 1;
                                        for (int i77 = 0; i77 < i76; i77++) {
                                            int i78 = i19 - 1;
                                            int i79 = 0;
                                            for (int i80 = i78; i80 > 0; i80 >>>= 1) {
                                                i79++;
                                            }
                                            uVar.s(i79);
                                            int i81 = 0;
                                            while (i78 > 0) {
                                                i81++;
                                                i78 >>>= 1;
                                            }
                                            uVar.s(i81);
                                        }
                                    }
                                    if (uVar.i(2) != 0) {
                                        throw y0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                    }
                                    if (i75 > 1) {
                                        for (int i82 = 0; i82 < i19; i82++) {
                                            uVar.s(4);
                                        }
                                    }
                                    for (int i83 = 0; i83 < i75; i83++) {
                                        uVar.s(8);
                                        uVar.s(8);
                                        uVar.s(8);
                                    }
                                }
                            }
                            int i84 = uVar.i(6);
                            int i85 = i84 + 1;
                            a5.d[] dVarArr = new a5.d[i85];
                            for (int i86 = 0; i86 < i85; i86++) {
                                boolean zH2 = uVar.h();
                                uVar.i(16);
                                uVar.i(16);
                                uVar.i(8);
                                dVarArr[i86] = new a5.d(1, zH2);
                            }
                            if (!uVar.h()) {
                                throw y0.a(null, "framing bit after modes not set as expected");
                            }
                            int i87 = 0;
                            while (i84 > 0) {
                                i87++;
                                i84 >>>= 1;
                            }
                            pVar = new p(yVar, bArr, dVarArr, i87);
                        }
                    }
                }
            }
        }
        pVar = null;
        this.f14260o = pVar;
        if (pVar == null) {
            return true;
        }
        y yVar2 = (y) pVar.f20806b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar2.f3523g);
        arrayList.add((byte[]) pVar.f20807c);
        g0 g0Var = new g0();
        g0Var.k = "audio/vorbis";
        g0Var.f4147f = yVar2.f3520d;
        g0Var.f4148g = yVar2.f3519c;
        g0Var.f4163x = yVar2.f3517a;
        g0Var.f4164y = yVar2.f3518b;
        g0Var.f4152m = arrayList;
        tVar.f12736a = new Format(g0Var);
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f14260o = null;
            this.f14263r = null;
            this.f14264s = null;
        }
        this.f14261p = 0;
        this.f14262q = false;
    }
}
