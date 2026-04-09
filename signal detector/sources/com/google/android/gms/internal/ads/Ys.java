package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import org.json.JSONObject;
import q2.C2841s;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Ys implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12717a;

    public Ys(Context context) {
        this.f12717a = C0969c3.e(context, C2951a.a());
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.hd)).booleanValue() ? AbstractC1984ut.e(Xs.f12508a) : AbstractC1984ut.e(new C2145xs(2, this));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 46;
    }
}
