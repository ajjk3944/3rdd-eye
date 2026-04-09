package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4912r3 {

    /* renamed from: a, reason: collision with root package name */
    public final C4887q3 f41528a;

    /* renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f41529b;

    public C4912r3() {
        this(new C4887q3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C4887q3 c4887q3 = this.f41528a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c4887q3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f41529b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C4912r3(C4887q3 c4887q3, GZIPCompressor gZIPCompressor) {
        this.f41528a = c4887q3;
        this.f41529b = gZIPCompressor;
    }
}
