package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class r22 {

    /* renamed from: a, reason: collision with root package name */
    private final nj f32437a;

    public /* synthetic */ r22() {
        this(new nj());
    }

    public final String a(Context context, String body) {
        g50 g50VarV;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(body, "body");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA == null || (g50VarV = du1VarA.v()) == null) {
            g50VarV = g50.f27540c;
        }
        l01 l01Var = new l01(g50VarV.c(), g50VarV.b());
        byte[] bytes = body.getBytes(C5819a.f48359b);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        byte[] bArrA = l01Var.a(bytes);
        if (bArrA == null) {
            return null;
        }
        this.f32437a.getClass();
        return nj.a(bArrA);
    }

    public r22(nj base64Encoder) {
        kotlin.jvm.internal.l.f(base64Encoder, "base64Encoder");
        this.f32437a = base64Encoder;
    }
}
