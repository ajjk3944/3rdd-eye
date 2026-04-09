package k6;

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
    public static j f21883d = new j();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f21884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21885b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21886c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z10 = jVar.f21886c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f21886c;
                z11 = false;
            }
            jVar.c(z11, z10);
            j.this.f21885b = z11;
        }
    }

    public static j f() {
        return f21883d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f21884a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        c(this.f21885b, zIsDeviceLocked);
        this.f21886c = zIsDeviceLocked;
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        this.f21884a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void c(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f21886c || this.f21885b)) {
            return;
        }
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((i6.h) it.next()).k().n(z11 || z10);
        }
    }
}
