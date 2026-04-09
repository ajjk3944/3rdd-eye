package m8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b5.z;
import g8.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final ja.c f28963e = new ja.c();

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.p f28964a;

    /* renamed from: c, reason: collision with root package name */
    public final f f28966c;

    /* renamed from: b, reason: collision with root package name */
    public final x.e f28965b = new x.e(0);

    /* renamed from: d, reason: collision with root package name */
    public final km.n f28967d = new km.n(f28963e);

    public l() {
        this.f28966c = (x.f24602f && x.f24601e) ? new e() : new ja.c();
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

    public static void b(List list, x.e eVar) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar != null && (obj = zVar.H) != null) {
                eVar.put(obj, zVar);
                b(zVar.o().f1879c.B(), eVar);
            }
        }
    }

    public final com.bumptech.glide.p c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = t8.m.f34520a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof i.g) {
                return d((i.g) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f28964a == null) {
            synchronized (this) {
                try {
                    if (this.f28964a == null) {
                        this.f28964a = new com.bumptech.glide.p(com.bumptech.glide.b.a(context.getApplicationContext()), new i7.b(), new i7.b(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f28964a;
    }

    public final com.bumptech.glide.p d(i.g gVar) {
        char[] cArr = t8.m.f34520a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(gVar.getApplicationContext());
        }
        if (gVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f28966c.h(gVar);
        Activity activityA = a(gVar);
        return this.f28967d.m(gVar, com.bumptech.glide.b.a(gVar.getApplicationContext()), gVar.f32744a, gVar.s(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
