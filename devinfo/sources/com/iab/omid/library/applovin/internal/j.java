package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static j f20955d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f20956a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20957b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20958c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z3;
            boolean z10;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z3 = jVar.f20958c;
                z10 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z3 = jVar.f20958c;
                z10 = false;
            }
            jVar.a(z10, z3);
            j.this.f20957b = z10;
        }
    }

    public static j b() {
        return f20955d;
    }

    public void a() {
        Context context = this.f20956a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f20957b, zIsDeviceLocked);
        this.f20958c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f20956a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z3, boolean z10) {
        if ((z10 || z3) == (this.f20958c || this.f20957b)) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z10 || z3);
        }
    }
}
