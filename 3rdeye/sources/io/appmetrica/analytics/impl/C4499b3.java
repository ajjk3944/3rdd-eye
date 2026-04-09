package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4499b3 implements InterfaceC4878pk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40573a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f40574b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f40575c;

    /* renamed from: d, reason: collision with root package name */
    public final Z5 f40576d;

    public C4499b3(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f40573a.add(consumer);
        return this.f40574b;
    }

    public final void b() {
        this.f40574b = null;
        Z5 z52 = this.f40576d;
        Context context = this.f40575c;
        synchronized (z52) {
            if (z52.f40460b) {
                try {
                    context.unregisterReceiver(z52.f40459a);
                    z52.f40460b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f40574b = intentA;
        Iterator it = this.f40573a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final synchronized void onDestroy() {
        this.f40574b = null;
        b();
        Iterator it = this.f40573a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C4499b3(Context context, ICommonExecutor iCommonExecutor, int i) {
        this.f40573a = new ArrayList();
        this.f40574b = null;
        this.f40575c = context;
        this.f40576d = Y5.a(new F2(new C4473a3(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Z5 z52 = this.f40576d;
        Context context = this.f40575c;
        synchronized (z52) {
            try {
                intentRegisterReceiver = context.registerReceiver(z52.f40459a, intentFilter);
                try {
                    z52.f40460b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
