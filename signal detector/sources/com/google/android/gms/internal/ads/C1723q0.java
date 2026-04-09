package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723q0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16264a;

    public C1723q0() {
        this.f16264a = new LinkedHashMap();
    }

    public void a(C1669p0 c1669p0) {
        long[] jArr = c1669p0.f16094e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f16264a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), c1669p0);
        }
    }

    public void b(String str, InterfaceC2069wN interfaceC2069wN) {
        Cr.l(interfaceC2069wN, "provider");
        this.f16264a.put(str, interfaceC2069wN);
    }

    public void c(String str, InterfaceC2069wN interfaceC2069wN) {
        b(str, interfaceC2069wN);
    }

    public C1961uN d() {
        return new C1961uN(this.f16264a);
    }

    public C1723q0(int i) {
        this.f16264a = AbstractC0582Jp.H(i);
    }
}
