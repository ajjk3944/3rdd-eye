package a3;

import E.u;
import T1.B;
import a3.k;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.ActivityC1762o;
import androidx.lifecycle.AbstractC1781n;
import m0.C5308a;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14123f = new a();

    /* renamed from: b, reason: collision with root package name */
    public volatile com.bumptech.glide.l f14124b;

    /* renamed from: c, reason: collision with root package name */
    public final b f14125c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14126d;

    /* renamed from: e, reason: collision with root package name */
    public final k f14127e;

    /* compiled from: RequestManagerRetriever.java */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
    }

    public m() {
        new C5308a();
        a aVar = f14123f;
        this.f14125c = aVar;
        this.f14127e = new k(aVar);
        this.f14126d = (U2.r.f12430f && U2.r.f12429e) ? new e() : new B();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.l b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = h3.l.f38217a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof ActivityC1762o) {
                ActivityC1762o activityC1762o = (ActivityC1762o) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(activityC1762o.getApplicationContext());
                }
                if (activityC1762o.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f14126d.a(activityC1762o);
                Activity activityA = a(activityC1762o);
                boolean z10 = activityA == null || !activityA.isFinishing();
                com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(activityC1762o.getApplicationContext());
                AbstractC1781n lifecycle = activityC1762o.getLifecycle();
                activityC1762o.getSupportFragmentManager();
                k kVar = this.f14127e;
                kVar.getClass();
                h3.l.a();
                h3.l.a();
                com.bumptech.glide.l lVar = (com.bumptech.glide.l) kVar.f14121a.get(lifecycle);
                if (lVar != null) {
                    return lVar;
                }
                h hVar = new h(lifecycle);
                k.a aVar = new k.a();
                ((a) kVar.f14122b).getClass();
                com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(bVarA, hVar, aVar, activityC1762o);
                kVar.f14121a.put(lifecycle, lVar2);
                hVar.g(new j(kVar, lifecycle));
                if (z10) {
                    lVar2.onStart();
                }
                return lVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f14124b == null) {
            synchronized (this) {
                try {
                    if (this.f14124b == null) {
                        com.bumptech.glide.b bVarA2 = com.bumptech.glide.b.a(context.getApplicationContext());
                        b bVar = this.f14125c;
                        A2.l lVar3 = new A2.l(24);
                        u uVar = new u(16);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f14124b = new com.bumptech.glide.l(bVarA2, lVar3, uVar, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.f14124b;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
