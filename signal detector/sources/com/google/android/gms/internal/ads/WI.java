package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* loaded from: classes.dex */
public final class WI {

    /* renamed from: c, reason: collision with root package name */
    public static final WI f12196c = new WI("NIST_P256", BF.f7322a);

    /* renamed from: d, reason: collision with root package name */
    public static final WI f12197d = new WI("NIST_P384", BF.f7323b);

    /* renamed from: e, reason: collision with root package name */
    public static final WI f12198e = new WI("NIST_P521", BF.f7324c);

    /* renamed from: a, reason: collision with root package name */
    public final String f12199a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f12200b;

    public WI(String str, ECParameterSpec eCParameterSpec) {
        this.f12199a = str;
        this.f12200b = eCParameterSpec;
    }

    public final String toString() {
        return this.f12199a;
    }
}
