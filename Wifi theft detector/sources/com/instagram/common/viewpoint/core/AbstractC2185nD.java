package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2185nD extends AbstractC0863Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0855Eo A00;

    public abstract Pair<C06967s[], InterfaceC2186nE[]> A0d(C0855Eo c0855Eo, int[][][] iArr, int[] iArr2, C2222no c2222no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Y(com.instagram.common.viewpoint.core.InterfaceC06937p[] r8, com.instagram.common.viewpoint.core.C2337pg r9, int[] r10, boolean r11) throws com.instagram.common.viewpoint.core.AD {
        /*
            int r6 = r8.length
            r5 = 0
            r7 = 1
            r4 = 0
        L4:
            int r0 = r8.length
            if (r4 >= r0) goto L39
            r3 = r8[r4]
            r2 = 0
            r1 = 0
        Lb:
            int r0 = r9.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.redexgen.X.qI r0 = r9.A08(r1)
            int r0 = r3.AKM(r0)
            int r0 = com.instagram.common.viewpoint.core.AbstractC06867i.A03(r0)
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            goto Lb
        L22:
            r0 = r10[r4]
            if (r0 != 0) goto L37
            r0 = 1
        L27:
            if (r2 > r5) goto L31
            if (r2 != r5) goto L34
            if (r11 == 0) goto L34
            if (r7 != 0) goto L34
            if (r0 == 0) goto L34
        L31:
            r6 = r4
            r5 = r2
            r7 = r0
        L34:
            int r4 = r4 + 1
            goto L4
        L37:
            r0 = 0
            goto L27
        L39:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC2185nD.A0Y(com.facebook.ads.redexgen.X.7p[], com.facebook.ads.redexgen.X.pg, int[], boolean):int");
    }

    public static int[] A0Z(InterfaceC06937p interfaceC06937p, C2337pg c2337pg) throws AD {
        int[] iArr = new int[c2337pg.A01];
        for (int i10 = 0; i10 < c2337pg.A01; i10++) {
            iArr[i10] = interfaceC06937p.AKM(c2337pg.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC06937p[] interfaceC06937pArr) throws AD {
        int[] iArr = new int[interfaceC06937pArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iAKO = interfaceC06937pArr[i10].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i11 = str.charAt(23);
            if (i11 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i10] = iAKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0863Ew
    public final C0864Ex A0b(InterfaceC06937p[] interfaceC06937pArr, C2204nW c2204nW, C2222no c2222no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC06937pArr.length + 1];
        C2337pg[][] c2337pgArr = new C2337pg[interfaceC06937pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC06937pArr.length + 1][][];
        for (int i10 = 0; i10 < c2337pgArr.length; i10++) {
            c2337pgArr[i10] = new C2337pg[c2204nW.A01];
            iArr2[i10] = new int[c2204nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC06937pArr);
        for (int i11 = 0; i11 < c2204nW.A01; i11++) {
            C2337pg c2337pgA05 = c2204nW.A05(i11);
            int groupIndex = A0Y(interfaceC06937pArr, c2337pgA05, iArr, c2337pgA05.A02 == 5);
            if (groupIndex == interfaceC06937pArr.length) {
                rendererTrackGroupCounts = new int[c2337pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC06937pArr[groupIndex], c2337pgA05);
            }
            int i12 = iArr[groupIndex];
            c2337pgArr[groupIndex][i12] = c2337pgA05;
            iArr2[groupIndex][i12] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2204nW[] c2204nWArr = new C2204nW[interfaceC06937pArr.length];
        String[] strArr = new String[interfaceC06937pArr.length];
        int[] iArr3 = new int[interfaceC06937pArr.length];
        int i13 = 0;
        while (true) {
            int length = interfaceC06937pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i13 < length) {
                int i14 = iArr[i13];
                c2204nWArr[i13] = new C2204nW((C2337pg[]) C5C.A1I(c2337pgArr[i13], i14));
                iArr2[i13] = (int[][]) C5C.A1I(iArr2[i13], i14);
                strArr[i13] = interfaceC06937pArr[i13].getName();
                iArr3[i13] = interfaceC06937pArr[i13].A9N();
                i13++;
            } else {
                C0855Eo c0855Eo = new C0855Eo(strArr, iArr3, c2204nWArr, iArrA0a, iArr2, new C2204nW((C2337pg[]) C5C.A1I(c2337pgArr[interfaceC06937pArr.length], iArr[interfaceC06937pArr.length])));
                Pair<C06967s[], InterfaceC2186nE[]> pairA0d = A0d(c0855Eo, iArr2, iArrA0a, c2222no, timeline);
                return new C0864Ex((C06967s[]) pairA0d.first, (InterfaceC2186nE[]) pairA0d.second, AbstractC0860Et.A00(c0855Eo, (InterfaceC0857Eq[]) pairA0d.second), c0855Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0863Ew
    public final void A0c(Object obj) {
        this.A00 = (C0855Eo) obj;
    }
}
