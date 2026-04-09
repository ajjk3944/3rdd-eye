package j2;

import android.content.Context;

/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    public static h f21736e;

    /* renamed from: a, reason: collision with root package name */
    public a f21737a;

    /* renamed from: b, reason: collision with root package name */
    public b f21738b;

    /* renamed from: c, reason: collision with root package name */
    public f f21739c;

    /* renamed from: d, reason: collision with root package name */
    public g f21740d;

    public h(Context context, o2.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21737a = new a(applicationContext, aVar);
        this.f21738b = new b(applicationContext, aVar);
        this.f21739c = new f(applicationContext, aVar);
        this.f21740d = new g(applicationContext, aVar);
    }

    public static synchronized h c(Context context, o2.a aVar) {
        try {
            if (f21736e == null) {
                f21736e = new h(context, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21736e;
    }

    public a a() {
        return this.f21737a;
    }

    public b b() {
        return this.f21738b;
    }

    public f d() {
        return this.f21739c;
    }

    public g e() {
        return this.f21740d;
    }
}
