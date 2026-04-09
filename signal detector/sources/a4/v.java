package a4;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.lefan.base.activity.LanguageActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: j, reason: collision with root package name */
    public static v f4731j;

    /* renamed from: a, reason: collision with root package name */
    public final X3.e f4732a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f4733b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4734c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4735d;

    /* renamed from: e, reason: collision with root package name */
    public A1.t f4736e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4737f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f4738g;

    /* renamed from: h, reason: collision with root package name */
    public final q f4739h;
    public final LinkedHashSet i;

    public v(Context context) {
        q qVar = q.f4715a;
        X3.e eVar = new X3.e("SplitInstallListenerRegistry", 1);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.f4735d = new HashSet();
        this.f4736e = null;
        this.f4737f = false;
        this.f4732a = eVar;
        this.f4733b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f4734c = applicationContext != null ? applicationContext : context;
        this.f4738g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.f4739h = qVar;
    }

    public static synchronized v e(Context context) {
        try {
            if (f4731j == null) {
                q qVar = q.f4715a;
                f4731j = new v(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4731j;
    }

    public final synchronized void a(LanguageActivity languageActivity) {
        this.f4732a.c("registerListener", new Object[0]);
        this.f4735d.add(languageActivity);
        d();
    }

    public final synchronized void b(LanguageActivity languageActivity) {
        this.f4732a.c("unregisterListener", new Object[0]);
        this.f4735d.remove(languageActivity);
        d();
    }

    public final synchronized void c(d dVar) {
        Iterator it = new HashSet(this.f4735d).iterator();
        while (it.hasNext()) {
            ((V3.a) it.next()).a(dVar);
        }
    }

    public final void d() {
        A1.t tVar;
        if ((this.f4737f || !this.f4735d.isEmpty()) && this.f4736e == null) {
            A1.t tVar2 = new A1.t(5, this);
            this.f4736e = tVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f4734c.registerReceiver(tVar2, this.f4733b, 2);
            } else {
                this.f4734c.registerReceiver(tVar2, this.f4733b);
            }
        }
        if (this.f4737f || !this.f4735d.isEmpty() || (tVar = this.f4736e) == null) {
            return;
        }
        this.f4734c.unregisterReceiver(tVar);
        this.f4736e = null;
    }

    public final synchronized void f(d dVar) {
        try {
            Iterator it = new LinkedHashSet(this.i).iterator();
            while (it.hasNext()) {
                ((LanguageActivity) ((c) it.next())).a(dVar);
            }
            c(dVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
