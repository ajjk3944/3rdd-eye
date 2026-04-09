package h9;

/* loaded from: classes.dex */
public final class e extends b5.m {
    public e(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int Y(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return -1;
        }
        return i10 - 87;
    }

    public final String Z() {
        int iY;
        if (v()) {
            return null;
        }
        char cCharAt = ((String) this.f2460r).charAt(this.f2457a);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f2457a++;
        int iIntValue = A().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = A().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = A().intValue();
                    } else {
                        int iY2 = Y(iIntValue);
                        if (iY2 != -1) {
                            for (int i10 = 1; i10 <= 5 && (iY = Y((iIntValue = A().intValue()))) != -1; i10++) {
                                iY2 = (iY2 * 16) + iY;
                            }
                            sb2.append((char) iY2);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = A().intValue();
        }
        return sb2.toString();
    }

    public final String a0() {
        int i10;
        int i11;
        String str = (String) this.f2460r;
        if (v()) {
            i11 = this.f2457a;
        } else {
            int i12 = this.f2457a;
            int iCharAt = str.charAt(i12);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i12;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i10 = this.f2457a;
            }
            this.f2457a = i12;
            i11 = i10;
        }
        int i13 = this.f2457a;
        if (i11 == i13) {
            return null;
        }
        String strSubstring = str.substring(i13, i11);
        this.f2457a = i11;
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Type inference failed for: r10v11, types: [h9.n] */
    /* JADX WARN: Type inference failed for: r10v12, types: [h9.j] */
    /* JADX WARN: Type inference failed for: r10v13, types: [h9.j] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [androidx.media3.common.i0] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v28, types: [h9.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [h9.j] */
    /* JADX WARN: Type inference failed for: r10v31, types: [h9.m] */
    /* JADX WARN: Type inference failed for: r10v35, types: [h9.m] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v7, types: [h9.n] */
    /* JADX WARN: Type inference failed for: r11v12, types: [h9.d] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [h9.f] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v13, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v14, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v15, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v21, types: [h9.r] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [h9.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b0() {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.b0():java.util.ArrayList");
    }
}
