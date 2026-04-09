package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ri0 implements og<jj0> {

    /* renamed from: a, reason: collision with root package name */
    private final q22 f32667a;

    public /* synthetic */ ri0() {
        this(new q22());
    }

    @Override // com.yandex.mobile.ads.impl.og
    public final boolean a(jj0 value) {
        kotlin.jvm.internal.l.f(value, "value");
        String strF = value.f();
        if (strF == null) {
            return false;
        }
        this.f32667a.getClass();
        return strF.length() > 0 && !"null".equals(strF);
    }

    public ri0(q22 stringAssetValueValidator) {
        kotlin.jvm.internal.l.f(stringAssetValueValidator, "stringAssetValueValidator");
        this.f32667a = stringAssetValueValidator;
    }
}
