package Bi;

import kotlin.text.AbstractC6512f;

/* loaded from: classes4.dex */
abstract class d extends c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, int i10) {
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i10 + (i11 * 2);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = AbstractC6512f.i()[(int) (255 & j10)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }
}
