package z6;

import a0.x0;
import android.content.Context;
import java.util.LinkedHashSet;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f37960a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f37961b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37962c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f37963d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37964e;

    public f(Context context, x0 x0Var) {
        this.f37960a = x0Var;
        Context applicationContext = context.getApplicationContext();
        nk.k.d(applicationContext, "getApplicationContext(...)");
        this.f37961b = applicationContext;
        this.f37962c = new Object();
        this.f37963d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f37962c) {
            Object obj2 = this.f37964e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f37964e = obj;
                ((d7.b) this.f37960a.f147d).execute(new yk.c(1, n.r0(this.f37963d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
