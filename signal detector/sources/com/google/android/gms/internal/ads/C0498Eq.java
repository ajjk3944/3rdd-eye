package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498Eq implements InterfaceC1064dq {

    /* renamed from: a, reason: collision with root package name */
    public final C0563In f8013a;

    public C0498Eq(C0563In c0563In) {
        this.f8013a = c0563In;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1064dq
    public final C1119eq a(String str, JSONObject jSONObject) {
        return new C1119eq(this.f8013a.a(str, jSONObject), new BinderC2251zq(), str);
    }
}
