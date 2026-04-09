package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kj1 {

    /* renamed from: c, reason: collision with root package name */
    public static final kj1 f13172c = new kj1("NIST_P256", oc1.f14668a);

    /* renamed from: d, reason: collision with root package name */
    public static final kj1 f13173d = new kj1("NIST_P384", oc1.f14669b);

    /* renamed from: e, reason: collision with root package name */
    public static final kj1 f13174e = new kj1("NIST_P521", oc1.f14670c);

    /* renamed from: a, reason: collision with root package name */
    public final String f13175a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f13176b;

    public kj1(String str, ECParameterSpec eCParameterSpec) {
        this.f13175a = str;
        this.f13176b = eCParameterSpec;
    }

    public final String toString() {
        return this.f13175a;
    }
}
