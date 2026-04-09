package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2026vh extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f17316a;

    /* renamed from: b, reason: collision with root package name */
    public Context f17317b;

    /* renamed from: c, reason: collision with root package name */
    public Context f17318c;

    public final void a(Intent intent) {
        if (this.f17316a == null) {
            intent.setFlags(268435456);
            this.f17317b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(strValueOf);
        sb.append(" and requestCode: 236");
        AbstractC2907C.m(sb.toString());
        this.f17316a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f17318c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17317b = applicationContext;
        this.f17316a = context instanceof Activity ? (Activity) context : null;
        this.f17318c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f17316a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f17317b.startActivity(intent);
        }
    }
}
