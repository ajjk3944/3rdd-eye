package uj;

import Yg.J;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.di.e;
import uj.e;
import uj.l;

/* loaded from: classes4.dex */
public final class u implements l {

    /* renamed from: a, reason: collision with root package name */
    private final q f63231a;

    /* renamed from: b, reason: collision with root package name */
    private final org.kodein.type.q f63232b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63233c;

    /* renamed from: d, reason: collision with root package name */
    private final org.kodein.type.q f63234d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f63235e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f63236f;

    /* renamed from: g, reason: collision with root package name */
    private final o f63237g;

    /* renamed from: h, reason: collision with root package name */
    private final r f63238h;

    /* renamed from: i, reason: collision with root package name */
    private final e.a f63239i;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(e.a it) {
            AbstractC6492s.i(it, "it");
            return new u(u.this.c(), u.this.b(), u.this.f63233c, u.this.j(), u.this.f63237g, u.this.p(), u.this.o());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f63241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f63242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ uj.b f63243c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f63244a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ uj.b f63245b;

            /* renamed from: uj.u$b$a$a, reason: collision with other inner class name */
            static final class C2240a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ u f63246a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ uj.b f63247b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2240a(u uVar, uj.b bVar) {
                    super(0);
                    this.f63246a = uVar;
                    this.f63247b = bVar;
                }

                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return this.f63246a.o().invoke(new k(this.f63247b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, uj.b bVar) {
                super(0);
                this.f63244a = uVar;
                this.f63245b = bVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke() {
                return this.f63244a.f63237g.a(new C2240a(this.f63244a, this.f63245b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, u uVar, uj.b bVar) {
            super(1);
            this.f63241a = n10;
            this.f63242b = uVar;
            this.f63243c = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10) {
            AbstractC6492s.i(j10, "<anonymous parameter 0>");
            s sVarA = (s) this.f63241a.f51689a;
            if (sVarA == null) {
                sVarA = this.f63242b.c().a(this.f63243c.getContext());
                this.f63241a.f51689a = sVarA;
            }
            Object objA = sVarA.a(this.f63242b.f63238h, this.f63242b.p(), new a(this.f63242b, this.f63243c));
            AbstractC6492s.g(objA, "null cannot be cast to non-null type T of org.kodein.di.bindings.Singleton");
            return objA;
        }
    }

    public u(q scope, org.kodein.type.q contextType, boolean z10, org.kodein.type.q createdType, o oVar, boolean z11, InterfaceC6835l creator) {
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(contextType, "contextType");
        AbstractC6492s.i(createdType, "createdType");
        AbstractC6492s.i(creator, "creator");
        this.f63231a = scope;
        this.f63232b = contextType;
        this.f63233c = z10;
        this.f63234d = createdType;
        this.f63235e = z11;
        this.f63236f = creator;
        this.f63237g = oVar == null ? v.f63248a : oVar;
        this.f63238h = new r(new Object(), J.f24997a);
        this.f63239i = e.a.f63186a.a(new a());
    }

    private final String n(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("singleton");
        if (!list.isEmpty()) {
            sb2.append(AbstractC3689v.z0(list, ", ", "(", ")", 0, null, null, 56, null));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // uj.e
    public String a() {
        return l.a.c(this);
    }

    @Override // uj.e
    public org.kodein.type.q b() {
        return this.f63232b;
    }

    @Override // uj.e
    public q c() {
        return this.f63231a;
    }

    @Override // uj.e
    public org.kodein.type.q d() {
        return l.a.b(this);
    }

    @Override // uj.e
    public String e() {
        ArrayList arrayList = new ArrayList(2);
        if (!AbstractC6492s.d(this.f63237g, v.f63248a)) {
            arrayList.add("ref = " + org.kodein.type.s.c(this.f63237g).h());
        }
        return n(arrayList);
    }

    @Override // uj.e
    public String f() {
        return l.a.d(this);
    }

    @Override // uj.e
    public boolean g() {
        return l.a.f(this);
    }

    @Override // uj.e
    public String h() {
        ArrayList arrayList = new ArrayList(2);
        if (!AbstractC6492s.d(this.f63237g, v.f63248a)) {
            arrayList.add("ref = " + org.kodein.type.s.c(this.f63237g).i());
        }
        return n(arrayList);
    }

    @Override // uj.a
    public InterfaceC6835l i(DI.e key, uj.b di2) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(di2, "di");
        N n10 = new N();
        if (!this.f63233c) {
            di2 = di2.a();
        }
        return new b(n10, this, di2);
    }

    @Override // uj.e
    public org.kodein.type.q j() {
        return this.f63234d;
    }

    public final InterfaceC6835l o() {
        return this.f63236f;
    }

    public final boolean p() {
        return this.f63235e;
    }
}
