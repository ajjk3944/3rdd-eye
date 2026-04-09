package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.cK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986cK extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1728q5 f13549a;

    public C0986cK(C1728q5 c1728q5) {
        this.f13549a = c1728q5;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        try {
            YJ yj = YJ.f12627c;
            C1728q5 c1728q5 = this.f13549a;
            Mac mac = (Mac) yj.f12632a.c((String) c1728q5.f16319c);
            mac.init((SecretKeySpec) c1728q5.f16320d);
            return mac;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
