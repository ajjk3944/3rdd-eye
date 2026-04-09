package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i10, int i11) {
        int i12;
        int i13 = i;
        while (true) {
            i12 = (i10 & (-4)) + i;
            if (i13 >= i12) {
                break;
            }
            int i14 = ((bArr[i13] & KotlinVersion.MAX_COMPONENT_VALUE) | ((bArr[i13 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((bArr[i13 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (bArr[i13 + 3] << 24)) * (-862048943);
            int i15 = i11 ^ (((i14 >>> 17) | (i14 << 15)) * 461845907);
            i11 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i13 += 4;
        }
        int i16 = i10 & 3;
        if (i16 == 1) {
            int i17 = ((bArr[i12] & KotlinVersion.MAX_COMPONENT_VALUE) | i) * (-862048943);
            i11 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        } else {
            if (i16 != 2) {
                i = i16 == 3 ? (bArr[i12 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16 : 0;
            }
            i |= (bArr[i12 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8;
            int i172 = ((bArr[i12] & KotlinVersion.MAX_COMPONENT_VALUE) | i) * (-862048943);
            i11 ^= ((i172 >>> 17) | (i172 << 15)) * 461845907;
        }
        int i18 = i11 ^ i10;
        int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
        int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
        return i20 ^ (i20 >>> 16);
    }
}
