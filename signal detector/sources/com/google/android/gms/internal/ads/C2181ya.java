package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2181ya implements InterfaceC0803Wp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17723a;

    public /* synthetic */ C2181ya(Context context) {
        this.f17723a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0803Wp
    /* renamed from: a */
    public Object mo8a() {
        C1778r2 c1778r2 = AbstractC0709Rg.f10942z;
        if (c1778r2.f16455b) {
            return Boolean.TRUE;
        }
        Context applicationContext = this.f17723a.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!c1778r2.f16455b) {
            c1778r2.f16455b = true;
            C1340iw c1340iwA = C1340iw.a();
            c1340iwA.getClass();
            c1340iwA.f14827b = new Zv(new Handler(), applicationContext, c1340iwA);
            boolean z6 = applicationContext instanceof Application;
            if (z6) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(C0962bw.f13501d);
            }
            Cr.f7677b = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = AbstractC1718pw.f16256a;
            AbstractC1718pw.f16258c = applicationContext.getResources().getDisplayMetrics().density;
            AbstractC1718pw.f16256a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new C1772qw(0 == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            C1288hw.f14618c.f14620b = applicationContext.getApplicationContext();
            C0907aw c0907aw = C0907aw.f13263e;
            if (!c0907aw.f13264a) {
                C1125ew c1125ew = (C1125ew) c0907aw.f13267d;
                if (z6) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(c1125ew);
                }
                c1125ew.f13999c = c0907aw;
                c1125ew.f13997a = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                c1125ew.f13998b = runningAppProcessInfo.importance == 100;
                c0907aw.f13265b = c1125ew.f13998b;
                c0907aw.f13264a = true;
            }
            C1394jw.f15017d.f15018a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new A1.t(), intentFilter);
        }
        return Boolean.valueOf(c1778r2.f16455b);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.JP b(com.google.android.gms.internal.ads.C1726q3 r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2181ya.b(com.google.android.gms.internal.ads.q3):com.google.android.gms.internal.ads.JP");
    }
}
