package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4495b implements W8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f40556a;

    public C4495b() {
        this(new C4469a(Ga.j().f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.W8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.P8 a(io.appmetrica.analytics.impl.C4683i6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r1 = r2.f40556a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.setValue(r0)
            io.appmetrica.analytics.impl.P8 r0 = new io.appmetrica.analytics.impl.P8
            io.appmetrica.analytics.impl.Y8 r1 = io.appmetrica.analytics.impl.Y8.AES_VALUE_ENCRYPTION
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4495b.a(io.appmetrica.analytics.impl.i6):io.appmetrica.analytics.impl.P8");
    }

    public C4495b(C4469a c4469a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4469a.b(), c4469a.a()));
    }

    public C4495b(AESEncrypter aESEncrypter) {
        this.f40556a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.W8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f40556a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    public final Y8 a() {
        return Y8.AES_VALUE_ENCRYPTION;
    }
}
