package R3;

import A1.t;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import p4.C2779f;
import p4.C2780g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final B2.a f3400a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f3401b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3402c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f3403d;

    /* renamed from: e, reason: collision with root package name */
    public t f3404e;

    public c(Context context) {
        B2.a aVar = new B2.a("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f3403d = new HashSet();
        this.f3404e = null;
        this.f3400a = aVar;
        this.f3401b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f3402c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(C2779f c2779f) {
        this.f3400a.f("registerListener", new Object[0]);
        if (c2779f == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.f3403d.add(c2779f);
        c();
    }

    public final synchronized void b(C2780g c2780g) {
        this.f3400a.f("unregisterListener", new Object[0]);
        this.f3403d.remove(c2780g);
        c();
    }

    public final void c() {
        t tVar;
        HashSet hashSet = this.f3403d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f3402c;
        if (!zIsEmpty && this.f3404e == null) {
            t tVar2 = new t(1, this);
            this.f3404e = tVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f3401b;
            if (i >= 33) {
                context.registerReceiver(tVar2, intentFilter, 2);
            } else {
                context.registerReceiver(tVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (tVar = this.f3404e) == null) {
            return;
        }
        context.unregisterReceiver(tVar);
        this.f3404e = null;
    }
}
