package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1807nD extends AbstractC0485Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0477Eo A00;

    public abstract Pair<C03187s[], InterfaceC1808nE[]> A0d(C0477Eo c0477Eo, int[][][] iArr, int[] iArr2, C1844no c1844no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Y(com.instagram.common.viewpoint.core.InterfaceC03157p[] r8, com.instagram.common.viewpoint.core.C1959pg r9, int[] r10, boolean r11) throws com.instagram.common.viewpoint.core.AD {
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
            int r0 = com.instagram.common.viewpoint.core.AbstractC03087i.A03(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC1807nD.A0Y(com.facebook.ads.redexgen.X.7p[], com.facebook.ads.redexgen.X.pg, int[], boolean):int");
    }

    public static int[] A0Z(InterfaceC03157p interfaceC03157p, C1959pg c1959pg) throws AD {
        int[] iArr = new int[c1959pg.A01];
        for (int i4 = 0; i4 < c1959pg.A01; i4++) {
            iArr[i4] = interfaceC03157p.AKM(c1959pg.A08(i4));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC03157p[] interfaceC03157pArr) throws AD {
        int[] iArr = new int[interfaceC03157pArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int iAKO = interfaceC03157pArr[i4].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i10 = str.charAt(23);
            if (i10 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i4] = iAKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0485Ew
    public final C0486Ex A0b(InterfaceC03157p[] interfaceC03157pArr, C1826nW c1826nW, C1844no c1844no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC03157pArr.length + 1];
        C1959pg[][] c1959pgArr = new C1959pg[interfaceC03157pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC03157pArr.length + 1][][];
        for (int i4 = 0; i4 < c1959pgArr.length; i4++) {
            c1959pgArr[i4] = new C1959pg[c1826nW.A01];
            iArr2[i4] = new int[c1826nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC03157pArr);
        for (int i10 = 0; i10 < c1826nW.A01; i10++) {
            C1959pg c1959pgA05 = c1826nW.A05(i10);
            int groupIndex = A0Y(interfaceC03157pArr, c1959pgA05, iArr, c1959pgA05.A02 == 5);
            if (groupIndex == interfaceC03157pArr.length) {
                rendererTrackGroupCounts = new int[c1959pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC03157pArr[groupIndex], c1959pgA05);
            }
            int i11 = iArr[groupIndex];
            c1959pgArr[groupIndex][i11] = c1959pgA05;
            iArr2[groupIndex][i11] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C1826nW[] c1826nWArr = new C1826nW[interfaceC03157pArr.length];
        String[] strArr = new String[interfaceC03157pArr.length];
        int[] iArr3 = new int[interfaceC03157pArr.length];
        int i12 = 0;
        while (true) {
            int length = interfaceC03157pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i12 < length) {
                int i13 = iArr[i12];
                c1826nWArr[i12] = new C1826nW((C1959pg[]) C5C.A1I(c1959pgArr[i12], i13));
                iArr2[i12] = (int[][]) C5C.A1I(iArr2[i12], i13);
                strArr[i12] = interfaceC03157pArr[i12].getName();
                iArr3[i12] = interfaceC03157pArr[i12].A9N();
                i12++;
            } else {
                C0477Eo c0477Eo = new C0477Eo(strArr, iArr3, c1826nWArr, iArrA0a, iArr2, new C1826nW((C1959pg[]) C5C.A1I(c1959pgArr[interfaceC03157pArr.length], iArr[interfaceC03157pArr.length])));
                Pair<C03187s[], InterfaceC1808nE[]> pairA0d = A0d(c0477Eo, iArr2, iArrA0a, c1844no, timeline);
                return new C0486Ex((C03187s[]) pairA0d.first, (InterfaceC1808nE[]) pairA0d.second, AbstractC0482Et.A00(c0477Eo, (InterfaceC0479Eq[]) pairA0d.second), c0477Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0485Ew
    public final void A0c(Object obj) {
        this.A00 = (C0477Eo) obj;
    }
}
