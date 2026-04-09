package ja;

import android.util.Pair;
import com.google.android.exoplayer2.y0;
import qb.v;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13443a;

    static {
        int i10 = v.f20828a;
        f13443a = "OpusHead".getBytes(ne.g.f17524c);
    }

    public static Pair a(int i10, fb.f fVar) {
        fVar.y(i10 + 12);
        fVar.z(1);
        b(fVar);
        fVar.z(2);
        int iO = fVar.o();
        if ((iO & 128) != 0) {
            fVar.z(2);
        }
        if ((iO & 64) != 0) {
            fVar.z(fVar.t());
        }
        if ((iO & 32) != 0) {
            fVar.z(2);
        }
        fVar.z(1);
        b(fVar);
        String strD = qb.m.d(fVar.o());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return Pair.create(strD, null);
        }
        fVar.z(12);
        fVar.z(1);
        int iB = b(fVar);
        byte[] bArr = new byte[iB];
        fVar.c(bArr, 0, iB);
        return Pair.create(strD, bArr);
    }

    public static int b(fb.f fVar) {
        int iO = fVar.o();
        int i10 = iO & 127;
        while ((iO & 128) == 128) {
            iO = fVar.o();
            i10 = (i10 << 7) | (iO & 127);
        }
        return i10;
    }

    public static Pair c(fb.f fVar, int i10, int i11) throws y0 {
        Integer num;
        r rVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = fVar.f8801b;
        while (i14 - i10 < i11) {
            fVar.y(i14);
            int iD = fVar.d();
            dr.a.f("childAtomSize must be positive", iD > 0);
            if (fVar.d() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strM = null;
                while (i15 - i14 < iD) {
                    fVar.y(i15);
                    int iD2 = fVar.d();
                    int iD3 = fVar.d();
                    if (iD3 == 1718775137) {
                        numValueOf = Integer.valueOf(fVar.d());
                    } else if (iD3 == 1935894637) {
                        fVar.z(4);
                        strM = fVar.m(4, ne.g.f17524c);
                    } else if (iD3 == 1935894633) {
                        i17 = i15;
                        i16 = iD2;
                    }
                    i15 += iD2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM) || "cbc1".equals(strM) || "cens".equals(strM) || "cbcs".equals(strM)) {
                    dr.a.f("frma atom is mandatory", numValueOf != null);
                    dr.a.f("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = numValueOf;
                            rVar = null;
                            break;
                        }
                        fVar.y(i18);
                        int iD4 = fVar.d();
                        if (fVar.d() == 1952804451) {
                            int iN = c5.a.n(fVar.d());
                            fVar.z(1);
                            if (iN == 0) {
                                fVar.z(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iO = fVar.o();
                                i12 = iO & 15;
                                i13 = (iO & 240) >> 4;
                            }
                            if (fVar.o() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iO2 = fVar.o();
                            byte[] bArr2 = new byte[16];
                            fVar.c(bArr2, 0, 16);
                            if (z10 && iO2 == 0) {
                                int iO3 = fVar.o();
                                byte[] bArr3 = new byte[iO3];
                                fVar.c(bArr3, 0, iO3);
                                bArr = bArr3;
                            }
                            num = num2;
                            rVar = new r(z10, strM, iO2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iD4;
                        }
                    }
                    dr.a.f("tenc atom is mandatory", rVar != null);
                    int i19 = v.f20828a;
                    pairCreate = Pair.create(num, rVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iD;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f A[ADDED_TO_REGION, LOOP:12: B:99:0x028f->B:103:0x029a, LOOP_START, PHI: r17
  0x028f: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:98:0x028d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ja.t d(ja.q r42, ja.a r43, ca.r r44) throws com.google.android.exoplayer2.y0 {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.d(ja.q, ja.a, ca.r):ja.t");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(ja.a r64, ca.r r65, long r66, com.google.android.exoplayer2.drm.DrmInitData r68, boolean r69, boolean r70, ne.h r71) {
        /*
            Method dump skipped, instructions count: 3211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.e(ja.a, ca.r, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, ne.h):java.util.ArrayList");
    }
}
