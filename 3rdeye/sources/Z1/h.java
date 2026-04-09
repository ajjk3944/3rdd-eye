package Z1;

import android.content.Context;
import b9.C1992A;
import c9.C2097r;
import java.util.LinkedHashSet;

/* compiled from: ConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e2.c f13995a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13996b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13997c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<X1.a<T>> f13998d;

    /* renamed from: e, reason: collision with root package name */
    public T f13999e;

    public h(Context context, e2.c cVar) {
        this.f13995a = cVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
        this.f13996b = applicationContext;
        this.f13997c = new Object();
        this.f13998d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t10) {
        synchronized (this.f13997c) {
            T t11 = this.f13999e;
            if (t11 == null || !t11.equals(t10)) {
                this.f13999e = t10;
                this.f13995a.f37703d.execute(new B.c(8, C2097r.G0(this.f13998d), this));
                C1992A c1992a = C1992A.f18074a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
