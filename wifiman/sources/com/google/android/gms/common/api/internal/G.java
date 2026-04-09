package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class G extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f34759a;

    /* renamed from: b, reason: collision with root package name */
    private final F f34760b;

    public G(F f10) {
        this.f34760b = f10;
    }

    public final void a(Context context) {
        this.f34759a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f34759a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f34759a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f34760b.a();
            b();
        }
    }
}
