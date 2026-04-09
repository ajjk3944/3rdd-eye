package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jm implements c80, vh0, l31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12784a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12785b;

    public /* synthetic */ jm(Context context, int i4) {
        this.f12784a = i4;
        this.f12785b = context;
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public Object b() {
        n nVar;
        switch (this.f12784a) {
            case 2:
                s5 s5Var = jz.f12903z;
                if (s5Var.f15871b) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f12785b.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!s5Var.f15871b) {
                    s5Var.f15871b = true;
                    nu0 nu0VarA = nu0.a();
                    nu0VarA.getClass();
                    nu0VarA.f14440b = new eu0(new Handler(), applicationContext, nu0VarA);
                    gu0 gu0Var = gu0.f11610d;
                    boolean z3 = applicationContext instanceof Application;
                    if (z3) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(gu0Var);
                    }
                    al0.f9348b = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = uu0.f17342a;
                    uu0.f17344c = applicationContext.getResources().getDisplayMetrics().density;
                    uu0.f17342a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new vu0(0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    mu0.f14020c.f14022b = applicationContext.getApplicationContext();
                    fu0 fu0Var = fu0.f11260e;
                    if (!fu0Var.f11261a) {
                        ju0 ju0Var = (ju0) fu0Var.f11264d;
                        if (z3) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(ju0Var);
                        }
                        ju0Var.f12836c = fu0Var;
                        ju0Var.f12834a = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        ju0Var.f12835b = runningAppProcessInfo.importance == 100;
                        fu0Var.f11262b = ju0Var.f12835b;
                        fu0Var.f11261a = true;
                    }
                    ou0.f14802d.f14803a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new kf(), intentFilter);
                }
                return Boolean.valueOf(s5Var.f15871b);
            default:
                Context context = this.f12785b;
                u51 u51Var = n.f14078n;
                synchronized (n.class) {
                    try {
                        if (n.f14084t == null) {
                            Context applicationContext2 = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            n.f14084t = new n(applicationContext2, map);
                        }
                        nVar = n.f14084t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return nVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        ((r60) obj).k(this.f12785b);
    }
}
