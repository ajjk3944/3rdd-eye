package vj;

import Yg.J;
import Yg.s;
import Yg.y;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.D;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import org.kodein.di.e;
import org.kodein.di.h;
import rj.C7719k2;
import rj.N5;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class d implements org.kodein.di.e {

    /* renamed from: a, reason: collision with root package name */
    private final org.kodein.di.h f63650a;

    /* renamed from: b, reason: collision with root package name */
    private final b f63651b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63652c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63653d;

    /* renamed from: e, reason: collision with root package name */
    private volatile InterfaceC6824a f63654e;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f63655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f63656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, d dVar, InterfaceC6824a interfaceC6824a) {
            super(0);
            this.f63655a = obj;
            this.f63656b = dVar;
            this.f63657c = interfaceC6824a;
        }

        public final void a() {
            Object obj = this.f63655a;
            d dVar = this.f63656b;
            InterfaceC6824a interfaceC6824a = this.f63657c;
            if (dVar.e() == null) {
                return;
            }
            if (obj == null) {
                if (dVar.e() == null) {
                    return;
                }
                dVar.f63654e = null;
                interfaceC6824a.invoke();
                return;
            }
            synchronized (obj) {
                if (dVar.e() == null) {
                    J j10 = J.f24997a;
                } else {
                    dVar.f63654e = null;
                    interfaceC6824a.invoke();
                    J j11 = J.f24997a;
                }
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final DI.e f63658a;

        /* renamed from: b, reason: collision with root package name */
        private final int f63659b;

        /* renamed from: c, reason: collision with root package name */
        private final b f63660c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f63661d;

        public b(DI.e key, int i10, b bVar, boolean z10) {
            AbstractC6492s.i(key, "key");
            this.f63658a = key;
            this.f63659b = i10;
            this.f63660c = bVar;
            this.f63661d = z10;
        }

        private final String b(DI.e eVar, int i10) {
            D d10 = this.f63661d ? new D(eVar) { // from class: vj.d.b.a
                @Override // kotlin.jvm.internal.D, th.m
                public Object get() {
                    return ((DI.e) this.receiver).f();
                }
            } : new D(eVar) { // from class: vj.d.b.b
                @Override // kotlin.jvm.internal.D, th.m
                public Object get() {
                    return ((DI.e) this.receiver).e();
                }
            };
            if (i10 == 0) {
                return (String) d10.get();
            }
            return "overridden " + ((String) d10.get());
        }

        private final boolean c(b bVar, DI.e eVar, int i10) {
            do {
                if (AbstractC6492s.d(bVar.f63658a, eVar) && bVar.f63659b == i10) {
                    return false;
                }
                bVar = bVar.f63660c;
            } while (bVar != null);
            return true;
        }

        private final List d(b bVar, DI.e eVar, int i10, List list) {
            while (bVar.f63660c != null && (!AbstractC6492s.d(eVar, bVar.f63658a) || i10 != bVar.f63659b)) {
                b bVar2 = bVar.f63660c;
                list = AbstractC3689v.M0(AbstractC3689v.e(b(bVar.f63658a, bVar.f63659b)), list);
                bVar = bVar2;
            }
            return AbstractC3689v.M0(AbstractC3689v.e(b(bVar.f63658a, bVar.f63659b)), list);
        }

        public final void a(DI.e searchedKey, int i10) {
            AbstractC6492s.i(searchedKey, "searchedKey");
            if (c(this, searchedKey, i10)) {
                return;
            }
            List listN0 = AbstractC3689v.N0(d(this, searchedKey, i10, AbstractC3689v.l()), b(searchedKey, this.f63659b));
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (Object obj : listN0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC3689v.v();
                }
                String str = (String) obj;
                sb2.append("  ");
                if (i11 == 0) {
                    sb2.append("   ");
                } else if (i11 != 1) {
                    sb2.append("  ║");
                    sb2.append(t.H("  ", i11 - 1));
                    sb2.append("╚>");
                } else {
                    sb2.append("  ╔╩>");
                }
                sb2.append(str);
                sb2.append("\n");
                i11 = i12;
            }
            sb2.append("    ╚");
            sb2.append(t.H("══", listN0.size() - 1));
            sb2.append("╝");
            throw new DI.DependencyLoopException("Dependency recursion:\n" + ((Object) sb2));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f63662a = new c();

        c() {
            super(2);
        }

        public final String a(Map map, boolean z10) {
            AbstractC6492s.i(map, "$this$null");
            return org.kodein.di.a.f(map, z10, 0, 2, null);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Map) obj, ((Boolean) obj2).booleanValue());
        }
    }

    /* renamed from: vj.d$d, reason: collision with other inner class name */
    static final class C2266d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2266d f63663a = new C2266d();

        C2266d() {
            super(2);
        }

        public final String a(Map map, boolean z10) {
            AbstractC6492s.i(map, "$this$null");
            return org.kodein.di.a.b(map, z10, 0, 2, null);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Map) obj, ((Boolean) obj2).booleanValue());
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ vj.c f63665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(vj.c cVar) {
            super(0);
            this.f63665b = cVar;
        }

        public final void a() {
            i iVar = new i(d.this, org.kodein.di.d.e());
            Iterator it = this.f63665b.e().iterator();
            while (it.hasNext()) {
                ((InterfaceC6835l) it.next()).invoke(iVar);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    private d(org.kodein.di.h hVar, b bVar, boolean z10, boolean z11) {
        this.f63650a = hVar;
        this.f63651b = bVar;
        this.f63652c = z10;
        this.f63653d = z11;
    }

    private final uj.b d(DI.e eVar, org.kodein.di.f fVar, org.kodein.di.h hVar, int i10) {
        return new vj.a(new i(new d(hVar, new b(eVar, i10, this.f63651b, this.f63652c), this.f63652c, this.f63653d), fVar), eVar, i10);
    }

    @Override // org.kodein.di.e
    public InterfaceC6824a a(DI.e eVar, Object obj, int i10) {
        return e.b.b(this, eVar, obj, i10);
    }

    @Override // org.kodein.di.e
    public InterfaceC6835l b(DI.e key, Object context, int i10) {
        org.kodein.di.f fVarA;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(context, "context");
        List listA = h.a.a(f(), key, i10, false, 4, null);
        if (listA.size() == 1) {
            y yVar = (y) listA.get(0);
            C7719k2 c7719k2 = (C7719k2) yVar.c();
            uj.d dVar = (uj.d) yVar.d();
            b bVar = this.f63651b;
            if (bVar != null) {
                bVar.a(key, i10);
            }
            org.kodein.di.f fVarA2 = org.kodein.di.f.f56931a.a(key.g(), context);
            AbstractC6492s.g(fVarA2, "null cannot be cast to non-null type org.kodein.di.DIContext<kotlin.Any>");
            if (dVar != null && (fVarA = uj.t.a(dVar, new i(this, fVarA2), context)) != null) {
                fVarA2 = fVarA;
            }
            return c7719k2.a().i(key, d(key, fVarA2, c7719k2.c(), i10));
        }
        d(key, org.kodein.di.f.f56931a.a(key.g(), context), f(), i10);
        Iterator it = f().c().iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
        boolean z10 = i10 != 0;
        D d10 = this.f63652c ? new D(key) { // from class: vj.d.e
            @Override // kotlin.jvm.internal.D, th.m
            public Object get() {
                return ((DI.e) this.receiver).i();
            }
        } : new D(key) { // from class: vj.d.f
            @Override // kotlin.jvm.internal.D, th.m
            public Object get() {
                return ((DI.e) this.receiver).h();
            }
        };
        InterfaceC6839p interfaceC6839p = this.f63652c ? c.f63662a : C2266d.f63663a;
        if (!listA.isEmpty()) {
            List<y> list = listA;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (y yVar2 : list) {
                Object objJ = yVar2.j();
                y yVarB = f().b((DI.e) yVar2.j());
                AbstractC6492s.f(yVarB);
                s sVarA = z.a(objJ, yVarB.l());
                linkedHashMap.put(sVarA.h(), sVarA.j());
            }
            Map mapA = f().a();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!linkedHashMap.keySet().contains((DI.e) entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            throw new DI.NotFoundException(key, linkedHashMap.size() + " bindings found that match " + key + ":\n" + ((String) interfaceC6839p.invoke(linkedHashMap, Boolean.valueOf(z10))) + "Other bindings registered in DI:\n" + ((String) interfaceC6839p.invoke(linkedHashMap2, Boolean.valueOf(z10))));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No binding found for " + ((String) d10.get()));
        if (this.f63653d) {
            sb2.append('\n');
            AbstractC6492s.h(sb2, "append('\\n')");
            List listE = f().e(new N5(null, null, key.l(), null, 11, null));
            if (!listE.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Available bindings for this type:\n");
                List<y> list2 = listE;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list2, 10)), 16));
                for (y yVar3 : list2) {
                    s sVarA2 = z.a(yVar3.j(), yVar3.l());
                    linkedHashMap3.put(sVarA2.h(), sVarA2.j());
                }
                sb3.append((String) interfaceC6839p.invoke(linkedHashMap3, Boolean.valueOf(z10)));
                sb2.append(sb3.toString());
            }
            sb2.append("Registered in this DI container:\n" + ((String) interfaceC6839p.invoke(f().a(), Boolean.valueOf(z10))));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        throw new DI.NotFoundException(key, string);
    }

    public final InterfaceC6824a e() {
        return this.f63654e;
    }

    public org.kodein.di.h f() {
        return this.f63650a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(vj.c builder, List externalSources, boolean z10, boolean z11, boolean z12) {
        this(new vj.g(builder.d(), externalSources, builder.f()), null, z10, z11);
        AbstractC6492s.i(builder, "builder");
        AbstractC6492s.i(externalSources, "externalSources");
        g gVar = new g(builder);
        if (z12) {
            gVar.invoke();
        } else {
            this.f63654e = new a(new Object(), this, gVar);
        }
    }
}
