package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pl1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15042b;

    public /* synthetic */ pl1(int i4, Object obj) {
        this.f15041a = i4;
        this.f15042b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        switch (this.f15041a) {
            case 0:
                try {
                    ml1 ml1Var = ml1.f13939c;
                    wb wbVar = (wb) this.f15042b;
                    Mac mac = (Mac) ml1Var.f13943a.g((String) wbVar.f17959c);
                    mac.init((SecretKeySpec) wbVar.f17960d);
                    return mac;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            default:
                return new kj.c(((kj.e) this.f15042b).f28357e);
        }
    }
}
