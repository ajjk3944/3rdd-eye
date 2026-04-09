package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class im0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final w81 f12378a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12379b;

    public im0(Context context, w81 w81Var) {
        this.f12378a = w81Var;
        this.f12379b = context;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        return ((ex) this.f12378a).e(new qe(14, this));
    }

    public final Intent c() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16230mc)).booleanValue();
        Context context = this.f12379b;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }
}
