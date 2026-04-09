package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n52;

/* loaded from: classes3.dex */
public final class j52 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28976b;

    /* renamed from: c, reason: collision with root package name */
    public final n52.a f28977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28978d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28979e;

    public j52(boolean z10, String str, int i, byte[] bArr, int i10, int i11, byte[] bArr2) {
        zf.a((bArr2 == null) ^ (i == 0));
        this.f28975a = z10;
        this.f28976b = str;
        this.f28978d = i;
        this.f28979e = bArr2;
        this.f28977c = new n52.a(a(str), i10, i11, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                rs0.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
