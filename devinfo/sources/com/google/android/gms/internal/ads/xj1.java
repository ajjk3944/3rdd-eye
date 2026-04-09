package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xj1 implements u91 {

    /* renamed from: a, reason: collision with root package name */
    public final ud1 f18404a;

    public xj1(ud1 ud1Var) {
        this.f18404a = ud1Var;
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f18404a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((wj1) it.next()).f18041a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
