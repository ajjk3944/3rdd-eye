package l6;

import a5.d0;
import a5.v;
import android.util.Pair;
import androidx.media3.common.j0;
import androidx.media3.common.k0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14780a;

    static {
        int i10 = d0.f105a;
        f14780a = "OpusHead".getBytes(ne.g.f17524c);
    }

    public static io.sentry.android.replay.gestures.c a(int i10, v vVar) {
        vVar.E(i10 + 12);
        vVar.F(1);
        b(vVar);
        vVar.F(2);
        int iT = vVar.t();
        if ((iT & 128) != 0) {
            vVar.F(2);
        }
        if ((iT & 64) != 0) {
            vVar.F(vVar.t());
        }
        if ((iT & 32) != 0) {
            vVar.F(2);
        }
        vVar.F(1);
        b(vVar);
        String strD = j0.d(vVar.t());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new io.sentry.android.replay.gestures.c(strD, null, -1L, -1L);
        }
        vVar.F(4);
        long jU = vVar.u();
        long jU2 = vVar.u();
        vVar.F(1);
        int iB = b(vVar);
        long j = jU2;
        byte[] bArr = new byte[iB];
        vVar.e(bArr, 0, iB);
        if (j <= 0) {
            j = -1;
        }
        return new io.sentry.android.replay.gestures.c(strD, bArr, j, jU > 0 ? jU : -1L);
    }

    public static int b(v vVar) {
        int iT = vVar.t();
        int i10 = iT & 127;
        while ((iT & 128) == 128) {
            iT = vVar.t();
            i10 = (i10 << 7) | (iT & 127);
        }
        return i10;
    }

    public static Pair c(v vVar, int i10, int i11) throws k0 {
        Integer num;
        p pVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = vVar.f166b;
        while (i14 - i10 < i11) {
            vVar.E(i14);
            int iG = vVar.g();
            u5.b.c("childAtomSize must be positive", iG > 0);
            if (vVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strR = null;
                while (i15 - i14 < iG) {
                    vVar.E(i15);
                    int iG2 = vVar.g();
                    int iG3 = vVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(vVar.g());
                    } else if (iG3 == 1935894637) {
                        vVar.F(4);
                        strR = vVar.r(4, ne.g.f17524c);
                    } else if (iG3 == 1935894633) {
                        i17 = i15;
                        i16 = iG2;
                    }
                    i15 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strR) || "cbc1".equals(strR) || "cens".equals(strR) || "cbcs".equals(strR)) {
                    u5.b.c("frma atom is mandatory", numValueOf != null);
                    u5.b.c("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = numValueOf;
                            pVar = null;
                            break;
                        }
                        vVar.E(i18);
                        int iG4 = vVar.g();
                        if (vVar.g() == 1952804451) {
                            int iO = c5.a.o(vVar.g());
                            vVar.F(1);
                            if (iO == 0) {
                                vVar.F(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iT = vVar.t();
                                i12 = iT & 15;
                                i13 = (iT & 240) >> 4;
                            }
                            if (vVar.t() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iT2 = vVar.t();
                            byte[] bArr2 = new byte[16];
                            vVar.e(bArr2, 0, 16);
                            if (z10 && iT2 == 0) {
                                int iT3 = vVar.t();
                                byte[] bArr3 = new byte[iT3];
                                vVar.e(bArr3, 0, iT3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z10, strR, iT2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iG4;
                        }
                    }
                    u5.b.c("tenc atom is mandatory", pVar != null);
                    int i19 = d0.f105a;
                    pairCreate = Pair.create(num, pVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f A[ADDED_TO_REGION, LOOP:12: B:99:0x028f->B:103:0x029a, LOOP_START, PHI: r17
  0x028f: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:98:0x028d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l6.r d(l6.o r42, l6.a r43, u5.p r44) throws androidx.media3.common.k0 {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.d(l6.o, l6.a, u5.p):l6.r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0ecc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(l6.a r73, u5.p r74, long r75, androidx.media3.common.DrmInitData r77, boolean r78, boolean r79, ne.h r80) {
        /*
            Method dump skipped, instructions count: 3798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.e(l6.a, u5.p, long, androidx.media3.common.DrmInitData, boolean, boolean, ne.h):java.util.ArrayList");
    }
}
