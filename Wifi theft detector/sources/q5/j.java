package q5;

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
    public static j f24077d = new j();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f24078a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24079b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24080c = false;

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
                z10 = jVar.f24080c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f24080c;
                z11 = false;
            }
            jVar.c(z11, z10);
            j.this.f24079b = z11;
        }
    }

    public static j f() {
        return f24077d;
    }

    public void a() {
        Context context = (Context) this.f24078a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        c(this.f24079b, zIsDeviceLocked);
        this.f24080c = zIsDeviceLocked;
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        this.f24078a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void c(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f24080c || this.f24079b)) {
            return;
        }
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).t().q(z11 || z10);
        }
    }
}
