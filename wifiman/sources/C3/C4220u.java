package c3;

import a3.C3754b;
import android.content.Context;
import c3.AbstractC4208i;
import i3.InterfaceC6069e;
import java.util.Collections;
import java.util.Set;
import m3.InterfaceC6756a;

/* renamed from: c3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4220u implements InterfaceC4219t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile AbstractC4221v f33824e;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6756a f33825a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6756a f33826b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6069e f33827c;

    /* renamed from: d, reason: collision with root package name */
    private final j3.r f33828d;

    C4220u(InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, InterfaceC6069e interfaceC6069e, j3.r rVar, j3.v vVar) {
        this.f33825a = interfaceC6756a;
        this.f33826b = interfaceC6756a2;
        this.f33827c = interfaceC6069e;
        this.f33828d = rVar;
        vVar.c();
    }

    private AbstractC4208i b(AbstractC4214o abstractC4214o) {
        AbstractC4208i.a aVarG = AbstractC4208i.a().i(this.f33825a.a()).o(this.f33826b.a()).n(abstractC4214o.g()).h(new C4207h(abstractC4214o.b(), abstractC4214o.d())).g(abstractC4214o.c().a());
        abstractC4214o.c().e();
        abstractC4214o.c().b();
        return aVarG.d();
    }

    public static C4220u c() {
        AbstractC4221v abstractC4221v = f33824e;
        if (abstractC4221v != null) {
            return abstractC4221v.g();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(InterfaceC4205f interfaceC4205f) {
        return interfaceC4205f instanceof InterfaceC4206g ? Collections.unmodifiableSet(((InterfaceC4206g) interfaceC4205f).a()) : Collections.singleton(C3754b.b("proto"));
    }

    public static void f(Context context) {
        if (f33824e == null) {
            synchronized (C4220u.class) {
                try {
                    if (f33824e == null) {
                        f33824e = AbstractC4204e.a().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // c3.InterfaceC4219t
    public void a(AbstractC4214o abstractC4214o, a3.j jVar) {
        this.f33827c.a(abstractC4214o.f().f(abstractC4214o.c().d()), b(abstractC4214o), jVar);
    }

    public j3.r e() {
        return this.f33828d;
    }

    public a3.i g(InterfaceC4205f interfaceC4205f) {
        return new C4216q(d(interfaceC4205f), AbstractC4215p.a().b(interfaceC4205f.getName()).c(interfaceC4205f.getExtras()).a(), this);
    }
}
