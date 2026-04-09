package Q2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC3999j;
import o.C7010a;

/* loaded from: classes.dex */
public class o implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final b f19140f = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.j f19141a;

    /* renamed from: b, reason: collision with root package name */
    private final b f19142b;

    /* renamed from: c, reason: collision with root package name */
    private final C7010a f19143c = new C7010a();

    /* renamed from: d, reason: collision with root package name */
    private final i f19144d;

    /* renamed from: e, reason: collision with root package name */
    private final m f19145e;

    class a implements b {
        a() {
        }

        @Override // Q2.o.b
        public com.bumptech.glide.j a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.j(bVar, jVar, pVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.j a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f19140f : bVar;
        this.f19142b = bVar;
        this.f19145e = new m(bVar);
        this.f19144d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (com.bumptech.glide.load.resource.bitmap.p.f34562f && com.bumptech.glide.load.resource.bitmap.p.f34561e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.j f(Context context) {
        if (this.f19141a == null) {
            synchronized (this) {
                try {
                    if (this.f19141a == null) {
                        this.f19141a = this.f19142b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new Q2.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f19141a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.j d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (W2.l.r() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC3999j) {
                return e((AbstractActivityC3999j) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.j e(AbstractActivityC3999j abstractActivityC3999j) {
        if (W2.l.q()) {
            return d(abstractActivityC3999j.getApplicationContext());
        }
        a(abstractActivityC3999j);
        this.f19144d.a(abstractActivityC3999j);
        boolean zG = g(abstractActivityC3999j);
        return this.f19145e.b(abstractActivityC3999j, com.bumptech.glide.b.c(abstractActivityC3999j.getApplicationContext()), abstractActivityC3999j.O(), abstractActivityC3999j.v0(), zG);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
