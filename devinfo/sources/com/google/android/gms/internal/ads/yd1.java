package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yd1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18709a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18710b;

    public /* synthetic */ yd1(l90 l90Var) {
        this.f18709a = new HashMap((HashMap) l90Var.f13426b);
        this.f18710b = new HashMap((HashMap) l90Var.f13427c);
    }

    public final Object a(al0 al0Var, Class cls) throws GeneralSecurityException {
        xd1 xd1Var = new xd1(al0Var.getClass(), cls);
        HashMap map = this.f18709a;
        if (map.containsKey(xd1Var)) {
            return ((vd1) map.get(xd1Var)).f17605c.a(al0Var);
        }
        String string = xd1Var.toString();
        throw new GeneralSecurityException(r5.c.m(new StringBuilder(string.length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(av0 av0Var, ed1 ed1Var, Class cls) throws GeneralSecurityException {
        HashMap map = this.f18710b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        ae1 ae1Var = (ae1) map.get(cls);
        return ae1Var.c(av0Var, ed1Var, new ce1(this, false, ae1Var, 24));
    }
}
