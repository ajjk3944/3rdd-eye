package x3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile u f24960e;

    /* renamed from: a, reason: collision with root package name */
    public final h4.a f24961a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.a f24962b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.e f24963c;

    /* renamed from: d, reason: collision with root package name */
    public final e4.o f24964d;

    public t(h4.a aVar, h4.a aVar2, d4.e eVar, e4.o oVar, e4.s sVar) {
        this.f24961a = aVar;
        this.f24962b = aVar2;
        this.f24963c = eVar;
        this.f24964d = oVar;
        sVar.c();
    }

    public static t c() {
        u uVar = f24960e;
        if (uVar != null) {
            return uVar.h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(u3.b.b("proto"));
    }

    public static void f(Context context) {
        if (f24960e == null) {
            synchronized (t.class) {
                try {
                    if (f24960e == null) {
                        f24960e = e.k().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // x3.s
    public void a(n nVar, u3.g gVar) {
        this.f24963c.a(nVar.f().f(nVar.c().c()), b(nVar), gVar);
    }

    public final i b(n nVar) {
        return i.a().i(this.f24961a.a()).k(this.f24962b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public e4.o e() {
        return this.f24964d;
    }

    public u3.f g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
