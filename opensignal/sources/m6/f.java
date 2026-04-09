package m6;

import a5.u;
import a5.v;
import androidx.media3.common.Metadata;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import ca.y;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Arrays;
import ka.h;
import o2.g;
import oe.h0;
import u5.b0;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: o, reason: collision with root package name */
    public bj.c f16314o;

    /* renamed from: p, reason: collision with root package name */
    public int f16315p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16316q;

    /* renamed from: r, reason: collision with root package name */
    public y f16317r;

    /* renamed from: s, reason: collision with root package name */
    public g f16318s;

    @Override // ka.h
    public final void a(long j) {
        this.f14251d = j;
        this.f16316q = j != 0;
        y yVar = this.f16317r;
        this.f16315p = yVar != null ? yVar.f3521e : 0;
    }

    @Override // ka.h
    public final long b(v vVar) {
        byte b2 = vVar.f165a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        bj.c cVar = this.f16314o;
        a5.a.j(cVar);
        int i10 = cVar.f2794d;
        y yVar = (y) cVar.f2795g;
        int i11 = !((a5.d[]) cVar.f2798y)[(b2 >> 1) & (255 >>> (8 - i10))].f104d ? yVar.f3521e : yVar.f3522f;
        long j = this.f16316q ? (this.f16315p + i11) / 4 : 0;
        byte[] bArr = vVar.f165a;
        int length = bArr.length;
        int i12 = vVar.f167c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            vVar.C(bArrCopyOf.length, bArrCopyOf);
        } else {
            vVar.D(i12);
        }
        byte[] bArr2 = vVar.f165a;
        int i13 = vVar.f167c;
        bArr2[i13 - 4] = (byte) (j & 255);
        bArr2[i13 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j >>> 24) & 255);
        this.f16316q = true;
        this.f16315p = i11;
        return j;
    }

    @Override // ka.h
    public final boolean d(v vVar, long j, t tVar) throws k0 {
        bj.c cVar;
        int i10;
        int i11;
        int i12;
        if (this.f16314o != null) {
            ((r) tVar.f12736a).getClass();
            return false;
        }
        y yVar = this.f16317r;
        int i13 = 1;
        if (yVar == null) {
            b0.c(1, vVar, false);
            vVar.l();
            int iT = vVar.t();
            int iL = vVar.l();
            int i14 = vVar.i();
            int i15 = i14 <= 0 ? -1 : i14;
            int i16 = vVar.i();
            int i17 = i16 <= 0 ? -1 : i16;
            vVar.i();
            int iT2 = vVar.t();
            int iPow = (int) Math.pow(2.0d, iT2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iT2 & 240) >> 4);
            vVar.t();
            this.f16317r = new y(iT, iL, i15, i17, iPow, iPow2, Arrays.copyOf(vVar.f165a, vVar.f167c));
        } else {
            g gVar = this.f16318s;
            if (gVar == null) {
                this.f16318s = b0.b(vVar, true, true);
            } else {
                int i18 = vVar.f167c;
                byte[] bArr = new byte[i18];
                System.arraycopy(vVar.f165a, 0, bArr, 0, i18);
                int i19 = yVar.f3517a;
                int i20 = 5;
                b0.c(5, vVar, false);
                int iT3 = vVar.t() + 1;
                u uVar = new u(6, vVar.f165a);
                int i21 = 8;
                uVar.s(vVar.f166b * 8);
                int i22 = 0;
                while (true) {
                    int i23 = i21;
                    int i24 = 16;
                    if (i22 < iT3) {
                        int i25 = i13;
                        if (uVar.i(24) != 5653314) {
                            throw k0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((uVar.f160d * 8) + uVar.f161e));
                        }
                        int i26 = uVar.i(16);
                        int i27 = uVar.i(24);
                        long[] jArr = new long[i27];
                        long jFloor = 0;
                        if (uVar.h()) {
                            i10 = iT3;
                            int i28 = uVar.i(i20) + 1;
                            int i29 = 0;
                            while (i29 < i27) {
                                int i30 = 0;
                                for (int i31 = i27 - i29; i31 > 0; i31 >>>= 1) {
                                    i30++;
                                }
                                int i32 = uVar.i(i30);
                                int i33 = 0;
                                while (i33 < i32 && i29 < i27) {
                                    int i34 = i29;
                                    jArr[i34] = i28;
                                    i29 = i34 + 1;
                                    i33++;
                                    yVar = yVar;
                                }
                                i28++;
                                i29 = i29;
                                yVar = yVar;
                            }
                        } else {
                            boolean zH = uVar.h();
                            int i35 = 0;
                            while (i35 < i27) {
                                if (zH) {
                                    if (uVar.h()) {
                                        i12 = iT3;
                                        jArr[i35] = uVar.i(i20) + 1;
                                    } else {
                                        i12 = iT3;
                                        jArr[i35] = 0;
                                    }
                                    i11 = 5;
                                } else {
                                    i11 = i20;
                                    i12 = iT3;
                                    jArr[i35] = uVar.i(i11) + 1;
                                }
                                i35++;
                                i20 = i11;
                                iT3 = i12;
                            }
                            i10 = iT3;
                        }
                        y yVar2 = yVar;
                        int i36 = uVar.i(4);
                        if (i36 > 2) {
                            throw k0.a(null, "lookup type greater than 2 not decodable: " + i36);
                        }
                        if (i36 == i25 || i36 == 2) {
                            uVar.s(32);
                            uVar.s(32);
                            int i37 = uVar.i(4) + i25;
                            uVar.s(i25);
                            if (i36 != i25) {
                                jFloor = i27 * i26;
                            } else if (i26 != 0) {
                                jFloor = (long) Math.floor(Math.pow(i27, 1.0d / i26));
                            }
                            uVar.s((int) (i37 * jFloor));
                        }
                        i22++;
                        i21 = i23;
                        iT3 = i10;
                        yVar = yVar2;
                        i13 = 1;
                        i20 = 5;
                    } else {
                        y yVar3 = yVar;
                        int i38 = 6;
                        int i39 = uVar.i(6) + 1;
                        for (int i40 = 0; i40 < i39; i40++) {
                            if (uVar.i(16) != 0) {
                                throw k0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i41 = 1;
                        int i42 = uVar.i(6) + 1;
                        int i43 = 0;
                        while (true) {
                            int i44 = 3;
                            if (i43 < i42) {
                                int i45 = uVar.i(i24);
                                if (i45 == 0) {
                                    int i46 = i23;
                                    uVar.s(i46);
                                    uVar.s(16);
                                    uVar.s(16);
                                    uVar.s(6);
                                    uVar.s(i46);
                                    int i47 = uVar.i(4) + 1;
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        uVar.s(i46);
                                        i48++;
                                        i46 = 8;
                                    }
                                } else {
                                    if (i45 != i41) {
                                        throw k0.a(null, "floor type greater than 1 not decodable: " + i45);
                                    }
                                    int i49 = uVar.i(5);
                                    int[] iArr = new int[i49];
                                    int i50 = -1;
                                    for (int i51 = 0; i51 < i49; i51++) {
                                        int i52 = uVar.i(4);
                                        iArr[i51] = i52;
                                        if (i52 > i50) {
                                            i50 = i52;
                                        }
                                    }
                                    int i53 = i50 + 1;
                                    int[] iArr2 = new int[i53];
                                    int i54 = 0;
                                    while (i54 < i53) {
                                        iArr2[i54] = uVar.i(i44) + 1;
                                        int i55 = uVar.i(2);
                                        int i56 = i23;
                                        if (i55 > 0) {
                                            uVar.s(i56);
                                        }
                                        int i57 = 0;
                                        for (int i58 = 1; i57 < (i58 << i55); i58 = 1) {
                                            uVar.s(i56);
                                            i57++;
                                            i56 = 8;
                                        }
                                        i54++;
                                        i23 = 8;
                                        i44 = 3;
                                    }
                                    uVar.s(2);
                                    int i59 = uVar.i(4);
                                    int i60 = 0;
                                    int i61 = 0;
                                    for (int i62 = 0; i62 < i49; i62++) {
                                        i60 += iArr2[iArr[i62]];
                                        while (i61 < i60) {
                                            uVar.s(i59);
                                            i61++;
                                        }
                                    }
                                }
                                i43++;
                                i23 = 8;
                                i38 = 6;
                                i24 = 16;
                                i41 = 1;
                            } else {
                                int i63 = uVar.i(i38) + 1;
                                int i64 = 0;
                                while (i64 < i63) {
                                    if (uVar.i(16) > 2) {
                                        throw k0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    uVar.s(24);
                                    uVar.s(24);
                                    uVar.s(24);
                                    int i65 = uVar.i(i38) + 1;
                                    int i66 = 8;
                                    uVar.s(8);
                                    int[] iArr3 = new int[i65];
                                    for (int i67 = 0; i67 < i65; i67++) {
                                        iArr3[i67] = ((uVar.h() ? uVar.i(5) : 0) * 8) + uVar.i(3);
                                    }
                                    int i68 = 0;
                                    while (i68 < i65) {
                                        int i69 = 0;
                                        while (i69 < i66) {
                                            if ((iArr3[i68] & (1 << i69)) != 0) {
                                                uVar.s(i66);
                                            }
                                            i69++;
                                            i66 = 8;
                                        }
                                        i68++;
                                        i66 = 8;
                                    }
                                    i64++;
                                    i38 = 6;
                                }
                                int i70 = uVar.i(i38) + 1;
                                for (int i71 = 0; i71 < i70; i71++) {
                                    int i72 = uVar.i(16);
                                    if (i72 != 0) {
                                        a5.a.m("VorbisUtil", "mapping type other than 0 not supported: " + i72);
                                    } else {
                                        int i73 = uVar.h() ? uVar.i(4) + 1 : 1;
                                        if (uVar.h()) {
                                            int i74 = uVar.i(8) + 1;
                                            for (int i75 = 0; i75 < i74; i75++) {
                                                int i76 = i19 - 1;
                                                int i77 = 0;
                                                for (int i78 = i76; i78 > 0; i78 >>>= 1) {
                                                    i77++;
                                                }
                                                uVar.s(i77);
                                                int i79 = 0;
                                                while (i76 > 0) {
                                                    i79++;
                                                    i76 >>>= 1;
                                                }
                                                uVar.s(i79);
                                            }
                                        }
                                        if (uVar.i(2) != 0) {
                                            throw k0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i73 > 1) {
                                            for (int i80 = 0; i80 < i19; i80++) {
                                                uVar.s(4);
                                            }
                                        }
                                        for (int i81 = 0; i81 < i73; i81++) {
                                            uVar.s(8);
                                            uVar.s(8);
                                            uVar.s(8);
                                        }
                                    }
                                }
                                int i82 = uVar.i(6);
                                int i83 = i82 + 1;
                                a5.d[] dVarArr = new a5.d[i83];
                                for (int i84 = 0; i84 < i83; i84++) {
                                    boolean zH2 = uVar.h();
                                    uVar.i(16);
                                    uVar.i(16);
                                    uVar.i(8);
                                    dVarArr[i84] = new a5.d(5, zH2);
                                }
                                if (!uVar.h()) {
                                    throw k0.a(null, "framing bit after modes not set as expected");
                                }
                                int i85 = 0;
                                while (i82 > 0) {
                                    i85++;
                                    i82 >>>= 1;
                                }
                                cVar = new bj.c(yVar3, gVar, bArr, dVarArr, i85, 3);
                            }
                        }
                    }
                }
            }
        }
        cVar = null;
        this.f16314o = cVar;
        if (cVar == null) {
            return true;
        }
        y yVar4 = (y) cVar.f2795g;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar4.f3523g);
        arrayList.add((byte[]) cVar.f2797x);
        Metadata metadataA = b0.a(h0.m((String[]) ((g) cVar.f2796r).f18754d));
        q qVar = new q();
        qVar.k = "audio/vorbis";
        qVar.f1739f = yVar4.f3520d;
        qVar.f1740g = yVar4.f3519c;
        qVar.f1755x = yVar4.f3517a;
        qVar.f1756y = yVar4.f3518b;
        qVar.f1744m = arrayList;
        qVar.f1742i = metadataA;
        tVar.f12736a = new r(qVar);
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f16314o = null;
            this.f16317r = null;
            this.f16318s = null;
        }
        this.f16315p = 0;
        this.f16316q = false;
    }
}
