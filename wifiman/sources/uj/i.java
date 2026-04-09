package uj;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import org.kodein.di.e;
import uj.e;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final q f63200a;

    /* renamed from: b, reason: collision with root package name */
    private final org.kodein.type.q f63201b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63202c;

    /* renamed from: d, reason: collision with root package name */
    private final org.kodein.type.q f63203d;

    /* renamed from: e, reason: collision with root package name */
    private final org.kodein.type.q f63204e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f63205f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6839p f63206g;

    /* renamed from: h, reason: collision with root package name */
    private final o f63207h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f63208i;

    /* renamed from: j, reason: collision with root package name */
    private final e.a f63209j;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(e.a it) {
            AbstractC6492s.i(it, "it");
            return new i(i.this.c(), i.this.b(), i.this.f63202c, i.this.d(), i.this.j(), i.this.f63207h, i.this.p(), i.this.f63206g);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f63211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f63212b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ uj.b f63213c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f63214a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ uj.b f63215b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f63216c;

            /* renamed from: uj.i$b$a$a, reason: collision with other inner class name */
            static final class C2239a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f63217a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ uj.b f63218b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f63219c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2239a(i iVar, uj.b bVar, Object obj) {
                    super(0);
                    this.f63217a = iVar;
                    this.f63218b = bVar;
                    this.f63219c = obj;
                }

                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return this.f63217a.f63206g.invoke(this.f63218b, this.f63219c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, uj.b bVar, Object obj) {
                super(0);
                this.f63214a = iVar;
                this.f63215b = bVar;
                this.f63216c = obj;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke() {
                return this.f63214a.f63207h.a(new C2239a(this.f63214a, this.f63215b, this.f63216c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, i iVar, uj.b bVar) {
            super(1);
            this.f63211a = n10;
            this.f63212b = iVar;
            this.f63213c = bVar;
        }

        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            s sVarA = (s) this.f63211a.f51689a;
            if (sVarA == null) {
                sVarA = this.f63212b.c().a(this.f63213c.getContext());
                this.f63211a.f51689a = sVarA;
            }
            Object objA = sVarA.a(new r(this.f63212b.f63208i, obj), this.f63212b.p(), new a(this.f63212b, this.f63213c, obj));
            AbstractC6492s.g(objA, "null cannot be cast to non-null type T of org.kodein.di.bindings.Multiton");
            return objA;
        }
    }

    public i(q scope, org.kodein.type.q contextType, boolean z10, org.kodein.type.q argType, org.kodein.type.q createdType, o oVar, boolean z11, InterfaceC6839p creator) {
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(contextType, "contextType");
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(createdType, "createdType");
        AbstractC6492s.i(creator, "creator");
        this.f63200a = scope;
        this.f63201b = contextType;
        this.f63202c = z10;
        this.f63203d = argType;
        this.f63204e = createdType;
        this.f63205f = z11;
        this.f63206g = creator;
        this.f63207h = oVar == null ? v.f63248a : oVar;
        this.f63208i = new Object();
        this.f63209j = e.a.f63186a.a(new a());
    }

    private final String o(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("multiton");
        if (!list.isEmpty()) {
            sb2.append(AbstractC3689v.z0(list, ", ", "(", ")", 0, null, null, 56, null));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // uj.e
    public String a() {
        return e.b.b(this);
    }

    @Override // uj.e
    public org.kodein.type.q b() {
        return this.f63201b;
    }

    @Override // uj.e
    public q c() {
        return this.f63200a;
    }

    @Override // uj.e
    public org.kodein.type.q d() {
        return this.f63203d;
    }

    @Override // uj.e
    public String e() {
        ArrayList arrayList = new ArrayList(2);
        if (!AbstractC6492s.d(this.f63207h, v.f63248a)) {
            arrayList.add("ref = " + org.kodein.type.s.c(this.f63207h).h());
        }
        return o(arrayList);
    }

    @Override // uj.e
    public String f() {
        return e.b.c(this);
    }

    @Override // uj.e
    public boolean g() {
        return e.b.e(this);
    }

    @Override // uj.e
    public String h() {
        ArrayList arrayList = new ArrayList(2);
        if (!AbstractC6492s.d(this.f63207h, v.f63248a)) {
            arrayList.add("ref = " + org.kodein.type.s.c(this.f63207h).i());
        }
        return o(arrayList);
    }

    @Override // uj.a
    public InterfaceC6835l i(DI.e key, uj.b di2) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(di2, "di");
        N n10 = new N();
        if (!this.f63202c) {
            di2 = di2.a();
        }
        return new b(n10, this, di2);
    }

    @Override // uj.e
    public org.kodein.type.q j() {
        return this.f63204e;
    }

    public final boolean p() {
        return this.f63205f;
    }
}
