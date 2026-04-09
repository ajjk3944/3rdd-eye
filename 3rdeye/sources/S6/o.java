package s6;

import android.net.Uri;
import b9.C1992A;
import c9.C2097r;
import d7.C4280c;
import h7.C4420a;
import j6.C5195A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: VariableControllerImpl.kt */
/* loaded from: classes.dex */
public final class o implements k {

    /* renamed from: b, reason: collision with root package name */
    public final k f46112b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f46113c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46114d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f46115e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f46116f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f46117g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final b f46118h = new b();
    public final a i = new a();

    /* compiled from: VariableControllerImpl.kt */
    public static final class a implements InterfaceC5580a {
    }

    /* compiled from: VariableControllerImpl.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Z6.d, C1992A> {
        public b() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Z6.d dVar) {
            Z6.d v10 = dVar;
            kotlin.jvm.internal.l.f(v10, "v");
            o.this.c(v10);
            return C1992A.f18074a;
        }
    }

    /* compiled from: VariableControllerImpl.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Z6.d, C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f46121h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p9.l<? super Z6.d, C1992A> lVar) {
            super(1);
            this.f46121h = (kotlin.jvm.internal.m) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // p9.l
        public final C1992A invoke(Z6.d dVar) {
            Z6.d it = dVar;
            kotlin.jvm.internal.l.f(it, "it");
            if (o.this.f46113c.get(it.a()) == null) {
                this.f46121h.invoke(it);
            }
            return C1992A.f18074a;
        }
    }

    public o(k kVar) {
        this.f46112b = kVar;
    }

    @Override // s6.k
    public final Z6.d a(String name) {
        Z6.d dVarA;
        kotlin.jvm.internal.l.f(name, "name");
        Z6.d dVar = (Z6.d) this.f46113c.get(name);
        if (dVar != null) {
            return dVar;
        }
        k kVar = this.f46112b;
        if (kVar != null && (dVarA = kVar.a(name)) != null) {
            return dVarA;
        }
        Iterator it = this.f46114d.iterator();
        while (it.hasNext()) {
            Z6.d dVarA2 = ((p) it.next()).a(name);
            if (dVarA2 != null) {
                return dVarA2;
            }
        }
        return null;
    }

    @Override // s6.k
    public final j6.d b(final List names, final p9.l observer) {
        kotlin.jvm.internal.l.f(names, "names");
        kotlin.jvm.internal.l.f(observer, "observer");
        final ArrayList arrayList = new ArrayList();
        Iterator it = names.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.f46113c.containsKey(str)) {
                k kVar = this.f46112b;
                if ((kVar != null ? kVar.a(str) : null) != null) {
                    arrayList.add(kVar.o(str, null, false, observer));
                }
            }
            d(str, null, false, observer);
        }
        return new j6.d(names, arrayList, this, observer) { // from class: s6.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f46108b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ArrayList f46109c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f46110d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.m f46111e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f46111e = (kotlin.jvm.internal.m) observer;
            }

            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() throws Exception {
                List names2 = this.f46108b;
                kotlin.jvm.internal.l.f(names2, "$names");
                ArrayList arrayList2 = this.f46109c;
                o this$0 = this.f46110d;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                kotlin.jvm.internal.m observer2 = this.f46111e;
                kotlin.jvm.internal.l.f(observer2, "$observer");
                Iterator it2 = names2.iterator();
                while (it2.hasNext()) {
                    C5195A c5195a = (C5195A) this$0.f46115e.get((String) it2.next());
                    if (c5195a != null) {
                        c5195a.c(observer2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((j6.d) it3.next()).close();
                }
            }
        };
    }

    public final void c(Z6.d dVar) {
        C4420a.a();
        Iterator it = C2097r.G0(this.f46117g.values()).iterator();
        while (it.hasNext()) {
            ((p9.l) it.next()).invoke(dVar);
        }
        C5195A c5195a = (C5195A) this.f46115e.get(dVar.a());
        if (c5195a != null) {
            C5195A.a aVar = new C5195A.a();
            while (aVar.hasNext()) {
                ((p9.l) aVar.next()).invoke(dVar);
            }
        }
    }

    public final void d(String str, Q6.c cVar, boolean z10, p9.l<? super Z6.d, C1992A> lVar) {
        Z6.d dVarA = a(str);
        LinkedHashMap linkedHashMap = this.f46115e;
        if (dVarA != null) {
            if (z10) {
                C4420a.a();
                lVar.invoke(dVarA);
            }
            Object c5195a = linkedHashMap.get(str);
            if (c5195a == null) {
                c5195a = new C5195A();
                linkedHashMap.put(str, c5195a);
            }
            ((C5195A) c5195a).b(lVar);
            return;
        }
        if (cVar != null) {
            z7.d dVar = z7.e.f48479a;
            cVar.a(new z7.d(z7.f.MISSING_VARIABLE, "No variable could be resolved for '".concat(str), null, null, null, 24));
        }
        Object c5195a2 = linkedHashMap.get(str);
        if (c5195a2 == null) {
            c5195a2 = new C5195A();
            linkedHashMap.put(str, c5195a2);
        }
        ((C5195A) c5195a2).b(lVar);
    }

    @Override // s6.k
    public final void e(Z6.d variable) throws Z6.e {
        kotlin.jvm.internal.l.f(variable, "variable");
        LinkedHashMap linkedHashMap = this.f46113c;
        Z6.d dVar = (Z6.d) linkedHashMap.put(variable.a(), variable);
        if (dVar == null) {
            b observer = this.f46118h;
            kotlin.jvm.internal.l.f(observer, "observer");
            variable.f14034a.b(observer);
            c(variable);
            return;
        }
        linkedHashMap.put(variable.a(), dVar);
        throw new Z6.e("Variable '" + variable.a() + "' already declared!", null);
    }

    @Override // s6.k
    public final void g() {
        Iterator it = this.f46114d.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            pVar.e(this.f46118h);
            pVar.f(this.i);
        }
        this.f46117g.clear();
    }

    @Override // a7.u
    /* renamed from: get */
    public final Object mo0get(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        Z6.d dVarA = a(name);
        Object objB = dVarA != null ? dVarA.b() : null;
        if (objB instanceof Uri) {
            String value = objB.toString();
            kotlin.jvm.internal.l.f(value, "value");
            objB = new C4280c(value);
        }
        if (objB != null) {
            return objB;
        }
        k kVar = this.f46112b;
        if (kVar != null) {
            return kVar.mo0get(name);
        }
        return null;
    }

    @Override // s6.k
    public final List<Z6.d> h() {
        return C2097r.G0(this.f46113c.values());
    }

    @Override // s6.k
    public final void k() {
        Iterator it = this.f46114d.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            b bVar = this.f46118h;
            pVar.b(bVar);
            pVar.c(bVar);
            pVar.d(this.i);
        }
    }

    @Override // s6.k
    public final void l(A7.d owner, p9.l<? super Z6.d, C1992A> lVar) {
        kotlin.jvm.internal.l.f(owner, "owner");
        this.f46117g.put(owner, lVar);
        k kVar = this.f46112b;
        if (kVar != null) {
            kVar.l(owner, new c(lVar));
        }
    }

    @Override // s6.k
    public final j6.d o(final String name, Q6.c cVar, boolean z10, final p9.l<? super Z6.d, C1992A> observer) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(observer, "observer");
        if (!this.f46113c.containsKey(name)) {
            k kVar = this.f46112b;
            if ((kVar != null ? kVar.a(name) : null) != null) {
                return kVar.o(name, cVar, z10, observer);
            }
        }
        d(name, cVar, z10, observer);
        return new j6.d(name, observer) { // from class: s6.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f46103c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.m f46104d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f46104d = (kotlin.jvm.internal.m) observer;
            }

            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                o this$0 = this.f46102b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                String name2 = this.f46103c;
                kotlin.jvm.internal.l.f(name2, "$name");
                kotlin.jvm.internal.m observer2 = this.f46104d;
                kotlin.jvm.internal.l.f(observer2, "$observer");
                C5195A c5195a = (C5195A) this$0.f46115e.get(name2);
                if (c5195a != null) {
                    c5195a.c(observer2);
                }
            }
        };
    }
}
