package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4583ea implements W8 {
    @Override // io.appmetrica.analytics.impl.W8
    public final P8 a(C4683i6 c4683i6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.W8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final Y8 a() {
        return Y8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
