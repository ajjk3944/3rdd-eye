package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1404k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15066a;

    static {
        int i = (((((~349517445) & 1770783991) | 1585637523) + ((349517445 & 828130404) | 441534467)) - 1774508070) ^ (1876855542 % 1069755936);
        int i3 = (((((~396473730) & 280003019) | 1560841089) + ((396473730 & 581959754) | 705178672)) - (-2122415827)) ^ (1447267605 % 1369321801);
        int i6 = (((((~990892921) & 1764437056) | 26530608) + ((990892921 & 2050981056) | 378852004)) - 524777631) ^ (168002245 % 150122846);
        int i7 = (((((~783368690) & 1480833986) | 1027924228) + ((783368690 & 1108040386) | 324812860)) - (-2032723989)) ^ (1189641421 % 1025202362);
        int i8 = (((((~1662981776) & 570576705) | 1321849157) + ((1662981776 & (-264073600)) | (-599138066))) - 1910740440) ^ (882160379 % 11614769);
        int[] iArr = new int[i7];
        iArr[0] = i6;
        iArr[1] = i3;
        iArr[i] = i8;
        iArr[(((((~12260289) & 18423941) | 1391147552) + ((12260289 & 286296197) | 2093276674)) - (-1077194409)) ^ (1503885238 % 1219407971)] = (((((~1204275569) & 228665354) | 424906800) + ((1204275569 & (-1801127910)) | (-1190276491))) - 1826404452) ^ (2069110699 % 712633417);
        f15066a = iArr;
    }

    public static String a(String str) {
        int i;
        int i3 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[8];
        int i6 = 0;
        while (i6 < bArrDecode.length) {
            int i7 = i6 % 8;
            if (i7 == 0) {
                int i8 = i6 >>> 3;
                int i9 = i3;
                int i10 = i9;
                int i11 = i10;
                int i12 = i11;
                int i13 = i12;
                int i14 = i13;
                int i15 = i14;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                i = i25;
                int i26 = 1821351989;
                while (true) {
                    if (i26 == 91464932) {
                        int i27 = 751433995 + i26;
                        i26 += 1234789214;
                        if (i9 >= i10) {
                            i26 = i27;
                        }
                    } else if (i26 == 1326254146) {
                        int i28 = i12 >>> i14;
                        int[] iArr = f15066a;
                        i11 += ((i12 << i13) ^ (i28 + i12)) ^ (i15 + iArr[i15 & i16]);
                        i15 += i17;
                        i12 += ((i11 << i13) ^ (i28 + i11)) ^ (i15 + iArr[(i15 >> i18) & i16]);
                        i9++;
                        i26 -= 1234789214;
                    } else {
                        if (i26 != 1821351989) {
                            break;
                        }
                        i26 -= 1729887057;
                        i16 = 3;
                        i14 = 5;
                        i19 = 255;
                        i22 = 2;
                        i18 = 11;
                        i17 = 1340169305;
                        i13 = 4;
                        i10 = 64;
                        i11 = -236335227;
                        i23 = 16;
                        i24 = 6;
                        i25 = 7;
                        i21 = 8;
                        i20 = 24;
                        i12 = i8;
                        i9 = i;
                        i15 = i9;
                    }
                }
                bArr[i] = (byte) (((i11 & i19) << i20) >> i20);
                bArr[1] = (byte) ((((i11 >> i21) & i19) << i20) >> i20);
                bArr[i22] = (byte) ((((i11 >> i23) & i19) << i20) >> i20);
                bArr[i16] = (byte) (i11 >> i20);
                bArr[i13] = (byte) (((i12 & i19) << i20) >> i20);
                bArr[i14] = (byte) ((((i12 >> i21) & i19) << i20) >> i20);
                bArr[i24] = (byte) ((((i12 >> i23) & i19) << i20) >> i20);
                bArr[i25] = (byte) (i12 >> i20);
                i7 = i;
            } else {
                i = i3;
            }
            bArrDecode[i6] = (byte) (((bArrDecode[i6] ^ bArr[i7]) << 24) >> 24);
            i6++;
            i3 = i;
        }
        return new String(bArrDecode, Charset.defaultCharset());
    }
}
