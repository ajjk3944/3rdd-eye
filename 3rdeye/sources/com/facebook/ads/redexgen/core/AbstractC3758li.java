package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3758li extends EK {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public EC A00;

    public abstract Pair<C7G[], InterfaceC3759lj[]> A0d(EC ec, int[][][] iArr, int[] iArr2, C3796mL c3796mL, Timeline timeline) throws C9Y;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Y(com.facebook.ads.redexgen.core.C7D[] r8, com.facebook.ads.redexgen.core.C3915oH r9, int[] r10, boolean r11) throws com.facebook.ads.redexgen.core.C9Y {
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
            com.facebook.ads.redexgen.X.or r0 = r9.A08(r1)
            int r0 = r3.AJb(r0)
            int r0 = com.facebook.ads.redexgen.core.AnonymousClass76.A03(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC3758li.A0Y(com.facebook.ads.redexgen.X.7D[], com.facebook.ads.redexgen.X.oH, int[], boolean):int");
    }

    public static int[] A0Z(C7D c7d, C3915oH c3915oH) throws C9Y {
        int[] iArr = new int[c3915oH.A01];
        for (int i = 0; i < c3915oH.A01; i++) {
            iArr[i] = c7d.AJb(c3915oH.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(C7D[] c7dArr) throws C9Y {
        int[] iArr = new int[c7dArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int iAJd = c7dArr[i].AJd();
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
            iArr[i] = iAJd;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final EL A0b(C7D[] c7dArr, C3786mA c3786mA, C3796mL c3796mL, Timeline timeline) throws C9Y {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[c7dArr.length + 1];
        C3915oH[][] c3915oHArr = new C3915oH[c7dArr.length + 1][];
        int[][][] iArr2 = new int[c7dArr.length + 1][][];
        for (int i = 0; i < c3915oHArr.length; i++) {
            c3915oHArr[i] = new C3915oH[c3786mA.A01];
            iArr2[i] = new int[c3786mA.A01][];
        }
        int[] iArrA0a = A0a(c7dArr);
        for (int i10 = 0; i10 < c3786mA.A01; i10++) {
            C3915oH c3915oHA05 = c3786mA.A05(i10);
            int groupIndex = A0Y(c7dArr, c3915oHA05, iArr, c3915oHA05.A02 == 5);
            if (groupIndex == c7dArr.length) {
                rendererTrackGroupCounts = new int[c3915oHA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(c7dArr[groupIndex], c3915oHA05);
            }
            int i11 = iArr[groupIndex];
            c3915oHArr[groupIndex][i11] = c3915oHA05;
            iArr2[groupIndex][i11] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C3786mA[] c3786mAArr = new C3786mA[c7dArr.length];
        String[] strArr = new String[c7dArr.length];
        int[] iArr3 = new int[c7dArr.length];
        int i12 = 0;
        while (true) {
            int length = c7dArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i12 < length) {
                int i13 = iArr[i12];
                c3786mAArr[i12] = new C3786mA((C3915oH[]) AbstractC22614a.A1I(c3915oHArr[i12], i13));
                iArr2[i12] = (int[][]) AbstractC22614a.A1I(iArr2[i12], i13);
                strArr[i12] = c7dArr[i12].getName();
                iArr3[i12] = c7dArr[i12].A9F();
                i12++;
            } else {
                EC ec = new EC(strArr, iArr3, c3786mAArr, iArrA0a, iArr2, new C3786mA((C3915oH[]) AbstractC22614a.A1I(c3915oHArr[c7dArr.length], iArr[c7dArr.length])));
                Pair<C7G[], InterfaceC3759lj[]> pairA0d = A0d(ec, iArr2, iArrA0a, c3796mL, timeline);
                return new EL((C7G[]) pairA0d.first, (InterfaceC3759lj[]) pairA0d.second, EH.A00(ec, (EE[]) pairA0d.second), ec);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final void A0c(Object obj) {
        this.A00 = (EC) obj;
    }
}
