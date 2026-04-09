package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(byte[] bArr, int i, int i10, boolean z10) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i10 <= 0 || i + i10 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i10 + 15) / 16) * (z10 ? 75 : 57));
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        while (i11 > 0) {
            if (i12 == 0) {
                if (i10 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i)));
                }
                i13 = i;
            } else if (i12 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i] & 255)));
            i11--;
            i12++;
            if (z10 && (i12 == 16 || i11 == 0)) {
                int i14 = 16 - i12;
                if (i14 > 0) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        sb.append("   ");
                    }
                }
                if (i14 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i16 = 0; i16 < i12; i16++) {
                    char c10 = (char) bArr[i13 + i16];
                    if (c10 < ' ' || c10 > '~') {
                        c10 = '.';
                    }
                    sb.append(c10);
                }
            }
            if (i12 == 16 || i11 == 0) {
                sb.append('\n');
                i12 = 0;
            }
            i++;
        }
        return sb.toString();
    }
}
