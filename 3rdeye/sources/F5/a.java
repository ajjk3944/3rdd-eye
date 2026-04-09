package F5;

import A2.l;
import A9.I;
import G5.i;
import I5.d;
import I5.g;
import I5.j;
import I5.k;
import L5.c;
import T1.B;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import t4.C5606d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1654a = new b();

    public static void a(Context context) {
        b bVar = f1654a;
        Context applicationContext = context.getApplicationContext();
        C5606d.e(applicationContext, "Application Context cannot be null");
        if (bVar.f1655a) {
            return;
        }
        bVar.f1655a = true;
        j jVarB = j.b();
        B b10 = jVarB.f2512b;
        jVarB.f2513c = new H5.a(new Handler(), applicationContext, new l(8), jVarB);
        I5.b bVar2 = I5.b.f2495e;
        boolean z10 = applicationContext instanceof Application;
        if (z10) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar2);
        }
        I.f190b = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = L5.a.f4064a;
        L5.a.f4066c = applicationContext.getResources().getDisplayMetrics().density;
        L5.a.f4064a = (WindowManager) applicationContext.getSystemService("window");
        i iVar = c.f4068a;
        applicationContext.registerReceiver(new L5.b(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        g.f2503b.f2504a = applicationContext.getApplicationContext();
        I5.a aVar = I5.a.f2489f;
        if (!aVar.f2492c) {
            d dVar = aVar.f2493d;
            dVar.getClass();
            if (z10) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(dVar);
            }
            dVar.f2501d = aVar;
            dVar.f2499b = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            dVar.f2500c = runningAppProcessInfo.importance == 100;
            aVar.f2494e = dVar.f2500c;
            aVar.f2492c = true;
        }
        I5.l.f2515d.f2516a = new WeakReference<>(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new k(), intentFilter);
    }
}
