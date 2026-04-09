package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5014v3 extends Z2 {
    public C5014v3(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final int b() {
        return this.f40456a;
    }

    @Override // io.appmetrica.analytics.impl.Fn
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f40456a;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f40458c.warning("\"%s\" %s exceeded limit of %d bytes", this.f40457b, bArr, Integer.valueOf(this.f40456a));
                return bArr2;
            }
        }
        return bArr;
    }

    public final String a() {
        return this.f40457b;
    }
}
