package A1;

import G3.C0152f;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h.AbstractActivityC2349g;

/* loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public static final C0152f f110d = new C0152f(11);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.n f111a;

    /* renamed from: b, reason: collision with root package name */
    public final g f112b;

    /* renamed from: c, reason: collision with root package name */
    public final V2.h f113c = new V2.h(f110d);

    public m() {
        this.f112b = (u1.x.f23771f && u1.x.f23770e) ? new f() : new C0152f(8);
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

    public final com.bumptech.glide.n b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = H1.p.f1779a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC2349g) {
                AbstractActivityC2349g abstractActivityC2349g = (AbstractActivityC2349g) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC2349g.getApplicationContext());
                }
                if (abstractActivityC2349g.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f112b.a(abstractActivityC2349g);
                Activity activityA = a(abstractActivityC2349g);
                return this.f113c.p(abstractActivityC2349g, com.bumptech.glide.b.a(abstractActivityC2349g.getApplicationContext()), abstractActivityC2349g.f1476a, abstractActivityC2349g.s(), activityA == null || !activityA.isFinishing());
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f111a == null) {
            synchronized (this) {
                try {
                    if (this.f111a == null) {
                        this.f111a = new com.bumptech.glide.n(com.bumptech.glide.b.a(context.getApplicationContext()), new C0152f(6), new C0152f(9), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f111a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
