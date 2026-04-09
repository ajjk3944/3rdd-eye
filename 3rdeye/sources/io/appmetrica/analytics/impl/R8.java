package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class R8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f40040a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f40041b;

    public R8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f40040a = stateSerializer;
        this.f40041b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f40040a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f40041b.encrypt(this.f40040a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f40040a.toState(this.f40041b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
