package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdRequest;
import com.yandex.mobile.ads.impl.dc0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j40 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f28949a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f28950b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f28951c = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static dc0 a(byte[] bArr, String str, String str2) {
        tf1 tf1Var;
        if (bArr[0] == 127) {
            tf1Var = new tf1(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b11 = bArrCopyOf[i];
                    int i10 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i10];
                    bArrCopyOf[i10] = b11;
                }
            }
            tf1Var = new tf1(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                tf1 tf1Var2 = new tf1(bArrCopyOf.length, bArrCopyOf);
                while (tf1Var2.b() >= 16) {
                    tf1Var2.d(2);
                    tf1Var.a(tf1Var2.b(14));
                }
            }
            tf1Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        tf1Var.d(60);
        int i11 = f28949a[tf1Var.b(6)];
        int i12 = f28950b[tf1Var.b(4)];
        int iB = tf1Var.b(5);
        int i13 = iB < 29 ? (f28951c[iB] * 1000) / 2 : -1;
        tf1Var.d(10);
        return new dc0.a().b(str).e("audio/vnd.dts").b(i13).c(i11 + (tf1Var.b(2) > 0 ? 1 : 0)).l(i12).a((a40) null).d(str2).a();
    }
}
