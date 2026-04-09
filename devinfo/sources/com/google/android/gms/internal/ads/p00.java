package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p00 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f14823a;

    /* renamed from: b, reason: collision with root package name */
    public Context f14824b;

    /* renamed from: c, reason: collision with root package name */
    public Context f14825c;

    public final void a(Intent intent) {
        if (this.f14823a == null) {
            intent.setFlags(268435456);
            this.f14824b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 63);
        sb2.append("Starting activity for result with intent: ");
        sb2.append(strValueOf);
        sb2.append(" and requestCode: 236");
        ya.a0.m(sb2.toString());
        this.f14823a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f14825c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14824b = applicationContext;
        this.f14823a = context instanceof Activity ? (Activity) context : null;
        this.f14825c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f14823a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f14824b.startActivity(intent);
        }
    }
}
