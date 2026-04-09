package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fo0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f11245a;

    public fo0(Context context) {
        this.f11245a = b7.f(context, za.a.a());
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        return ((Boolean) va.s.f36163e.f36166c.a(sk.f16186jd)).booleanValue() ? yo0.e(eo0.f10839a) : yo0.e(new um0(2, this));
    }
}
