package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469lG {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15376a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15377b;

    public /* synthetic */ C1469lG(C1879sw c1879sw) {
        this.f15376a = new HashMap((HashMap) c1879sw.f16823b);
        this.f15377b = new HashMap((HashMap) c1879sw.f16824c);
    }

    public final Object a(Cr cr, Class cls) throws GeneralSecurityException {
        C1415kG c1415kG = new C1415kG(cr.getClass(), cls);
        HashMap map = this.f15376a;
        if (map.containsKey(c1415kG)) {
            return ((C1309iG) map.get(c1415kG)).f14691c.c(cr);
        }
        String string = c1415kG.toString();
        throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(C2041vw c2041vw, RF rf, Class cls) throws GeneralSecurityException {
        HashMap map = this.f15377b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        InterfaceC1577nG interfaceC1577nG = (InterfaceC1577nG) map.get(cls);
        return interfaceC1577nG.b(c2041vw, rf, new Vu(this, interfaceC1577nG));
    }
}
