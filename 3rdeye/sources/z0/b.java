package Z0;

import A6.g;
import A9.E;
import E.u;
import I6.t;
import X0.o;
import android.content.Context;
import java.util.List;
import p9.l;
import w9.i;

/* compiled from: PreferenceDataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f13982a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.b<a1.d> f13983b;

    /* renamed from: c, reason: collision with root package name */
    public final l<Context, List<X0.d<a1.d>>> f13984c;

    /* renamed from: d, reason: collision with root package name */
    public final E f13985d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13986e;

    /* renamed from: f, reason: collision with root package name */
    public volatile a1.c f13987f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String name, Y0.b<a1.d> bVar, l<? super Context, ? extends List<? extends X0.d<a1.d>>> lVar, E e4) {
        kotlin.jvm.internal.l.f(name, "name");
        this.f13982a = name;
        this.f13983b = bVar;
        this.f13984c = lVar;
        this.f13985d = e4;
        this.f13986e = new Object();
    }

    public final Object a(Object obj, i property) {
        a1.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.l.f(thisRef, "thisRef");
        kotlin.jvm.internal.l.f(property, "property");
        a1.c cVar2 = this.f13987f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f13986e) {
            try {
                if (this.f13987f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Y0.b<a1.d> bVar = this.f13983b;
                    l<Context, List<X0.d<a1.d>>> lVar = this.f13984c;
                    kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
                    List<X0.d<a1.d>> migrations = lVar.invoke(applicationContext);
                    E e4 = this.f13985d;
                    t tVar = new t(1, applicationContext, this);
                    kotlin.jvm.internal.l.f(migrations, "migrations");
                    this.f13987f = new a1.c(new o(new g(tVar, 5), a1.f.f14094a, u.G(new X0.e(migrations, null)), bVar, e4));
                }
                cVar = this.f13987f;
                kotlin.jvm.internal.l.c(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
