package Sh;

import Bh.AbstractC2514y;
import Bh.InterfaceC2495e;
import Bh.L;
import Bh.g0;
import Bh.s0;
import Sh.x;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import di.AbstractC5403l;
import di.C5387A;
import di.C5388B;
import di.C5389C;
import di.C5390D;
import di.C5392a;
import di.C5395d;
import di.C5397f;
import di.C5400i;
import di.C5402k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import li.C6629g;
import pi.S;
import xi.AbstractC8534a;

/* renamed from: Sh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3508h extends AbstractC3504d {

    /* renamed from: d, reason: collision with root package name */
    private final Bh.G f20748d;

    /* renamed from: e, reason: collision with root package name */
    private final L f20749e;

    /* renamed from: f, reason: collision with root package name */
    private final C6629g f20750f;

    /* renamed from: g, reason: collision with root package name */
    private Yh.e f20751g;

    /* renamed from: Sh.h$a */
    private abstract class a implements x.a {

        /* renamed from: Sh.h$a$a, reason: collision with other inner class name */
        public static final class C0763a implements x.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x.a f20753a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a f20754b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f20755c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Zh.f f20756d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList f20757e;

            C0763a(x.a aVar, a aVar2, Zh.f fVar, ArrayList arrayList) {
                this.f20754b = aVar;
                this.f20755c = aVar2;
                this.f20756d = fVar;
                this.f20757e = arrayList;
                this.f20753a = aVar;
            }

            @Override // Sh.x.a
            public void a() {
                this.f20754b.a();
                this.f20755c.h(this.f20756d, new C5392a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) AbstractC3689v.R0(this.f20757e)));
            }

            @Override // Sh.x.a
            public void b(Zh.f fVar, C5397f value) {
                AbstractC6492s.i(value, "value");
                this.f20753a.b(fVar, value);
            }

            @Override // Sh.x.a
            public void c(Zh.f fVar, Object obj) {
                this.f20753a.c(fVar, obj);
            }

            @Override // Sh.x.a
            public x.b d(Zh.f fVar) {
                return this.f20753a.d(fVar);
            }

            @Override // Sh.x.a
            public void e(Zh.f fVar, Zh.b enumClassId, Zh.f enumEntryName) {
                AbstractC6492s.i(enumClassId, "enumClassId");
                AbstractC6492s.i(enumEntryName, "enumEntryName");
                this.f20753a.e(fVar, enumClassId, enumEntryName);
            }

            @Override // Sh.x.a
            public x.a f(Zh.f fVar, Zh.b classId) {
                AbstractC6492s.i(classId, "classId");
                return this.f20753a.f(fVar, classId);
            }
        }

        /* renamed from: Sh.h$a$b */
        public static final class b implements x.b {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f20758a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3508h f20759b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Zh.f f20760c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f20761d;

            /* renamed from: Sh.h$a$b$a, reason: collision with other inner class name */
            public static final class C0764a implements x.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ x.a f20762a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ x.a f20763b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f20764c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList f20765d;

                C0764a(x.a aVar, b bVar, ArrayList arrayList) {
                    this.f20763b = aVar;
                    this.f20764c = bVar;
                    this.f20765d = arrayList;
                    this.f20762a = aVar;
                }

                @Override // Sh.x.a
                public void a() {
                    this.f20763b.a();
                    this.f20764c.f20758a.add(new C5392a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) AbstractC3689v.R0(this.f20765d)));
                }

                @Override // Sh.x.a
                public void b(Zh.f fVar, C5397f value) {
                    AbstractC6492s.i(value, "value");
                    this.f20762a.b(fVar, value);
                }

                @Override // Sh.x.a
                public void c(Zh.f fVar, Object obj) {
                    this.f20762a.c(fVar, obj);
                }

                @Override // Sh.x.a
                public x.b d(Zh.f fVar) {
                    return this.f20762a.d(fVar);
                }

                @Override // Sh.x.a
                public void e(Zh.f fVar, Zh.b enumClassId, Zh.f enumEntryName) {
                    AbstractC6492s.i(enumClassId, "enumClassId");
                    AbstractC6492s.i(enumEntryName, "enumEntryName");
                    this.f20762a.e(fVar, enumClassId, enumEntryName);
                }

                @Override // Sh.x.a
                public x.a f(Zh.f fVar, Zh.b classId) {
                    AbstractC6492s.i(classId, "classId");
                    return this.f20762a.f(fVar, classId);
                }
            }

            b(C3508h c3508h, Zh.f fVar, a aVar) {
                this.f20759b = c3508h;
                this.f20760c = fVar;
                this.f20761d = aVar;
            }

            @Override // Sh.x.b
            public void a() {
                this.f20761d.g(this.f20760c, this.f20758a);
            }

            @Override // Sh.x.b
            public void b(C5397f value) {
                AbstractC6492s.i(value, "value");
                this.f20758a.add(new di.s(value));
            }

            @Override // Sh.x.b
            public void c(Zh.b enumClassId, Zh.f enumEntryName) {
                AbstractC6492s.i(enumClassId, "enumClassId");
                AbstractC6492s.i(enumEntryName, "enumEntryName");
                this.f20758a.add(new C5402k(enumClassId, enumEntryName));
            }

            @Override // Sh.x.b
            public void d(Object obj) {
                this.f20758a.add(this.f20759b.O(this.f20760c, obj));
            }

            @Override // Sh.x.b
            public x.a e(Zh.b classId) {
                AbstractC6492s.i(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C3508h c3508h = this.f20759b;
                g0 NO_SOURCE = g0.f1784a;
                AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
                x.a aVarX = c3508h.x(classId, NO_SOURCE, arrayList);
                AbstractC6492s.f(aVarX);
                return new C0764a(aVarX, this, arrayList);
            }
        }

        public a() {
        }

        @Override // Sh.x.a
        public void b(Zh.f fVar, C5397f value) {
            AbstractC6492s.i(value, "value");
            h(fVar, new di.s(value));
        }

        @Override // Sh.x.a
        public void c(Zh.f fVar, Object obj) {
            h(fVar, C3508h.this.O(fVar, obj));
        }

        @Override // Sh.x.a
        public x.b d(Zh.f fVar) {
            return new b(C3508h.this, fVar, this);
        }

        @Override // Sh.x.a
        public void e(Zh.f fVar, Zh.b enumClassId, Zh.f enumEntryName) {
            AbstractC6492s.i(enumClassId, "enumClassId");
            AbstractC6492s.i(enumEntryName, "enumEntryName");
            h(fVar, new C5402k(enumClassId, enumEntryName));
        }

        @Override // Sh.x.a
        public x.a f(Zh.f fVar, Zh.b classId) {
            AbstractC6492s.i(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C3508h c3508h = C3508h.this;
            g0 NO_SOURCE = g0.f1784a;
            AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
            x.a aVarX = c3508h.x(classId, NO_SOURCE, arrayList);
            AbstractC6492s.f(aVarX);
            return new C0763a(aVarX, this, fVar, arrayList);
        }

        public abstract void g(Zh.f fVar, ArrayList arrayList);

        public abstract void h(Zh.f fVar, AbstractC5398g abstractC5398g);
    }

    /* renamed from: Sh.h$b */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f20766b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2495e f20768d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Zh.b f20769e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f20770f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f20771g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2495e interfaceC2495e, Zh.b bVar, List list, g0 g0Var) {
            super();
            this.f20768d = interfaceC2495e;
            this.f20769e = bVar;
            this.f20770f = list;
            this.f20771g = g0Var;
            this.f20766b = new HashMap();
        }

        @Override // Sh.x.a
        public void a() {
            if (C3508h.this.F(this.f20769e, this.f20766b) || C3508h.this.w(this.f20769e)) {
                return;
            }
            this.f20770f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f20768d.u(), this.f20766b, this.f20771g));
        }

        @Override // Sh.C3508h.a
        public void g(Zh.f fVar, ArrayList elements) {
            AbstractC6492s.i(elements, "elements");
            if (fVar == null) {
                return;
            }
            s0 s0VarB = Kh.a.b(fVar, this.f20768d);
            if (s0VarB != null) {
                HashMap map = this.f20766b;
                C5400i c5400i = C5400i.f46097a;
                List listC = AbstractC8534a.c(elements);
                S type = s0VarB.getType();
                AbstractC6492s.h(type, "getType(...)");
                map.put(fVar, c5400i.c(listC, type));
                return;
            }
            if (C3508h.this.w(this.f20769e) && AbstractC6492s.d(fVar.b(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C5392a) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f20770f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C5392a) it.next()).b());
                }
            }
        }

        @Override // Sh.C3508h.a
        public void h(Zh.f fVar, AbstractC5398g value) {
            AbstractC6492s.i(value, "value");
            if (fVar != null) {
                this.f20766b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3508h(Bh.G module, L notFoundClasses, oi.n storageManager, v kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        this.f20748d = module;
        this.f20749e = notFoundClasses;
        this.f20750f = new C6629g(module, notFoundClasses);
        this.f20751g = Yh.e.f25044i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5398g O(Zh.f fVar, Object obj) {
        AbstractC5398g abstractC5398gE = C5400i.f46097a.e(obj, this.f20748d);
        if (abstractC5398gE != null) {
            return abstractC5398gE;
        }
        return AbstractC5403l.f46100b.a("Unsupported annotation argument: " + fVar);
    }

    private final InterfaceC2495e R(Zh.b bVar) {
        return AbstractC2514y.d(this.f20748d, bVar, this.f20749e);
    }

    @Override // Sh.AbstractC3505e, li.InterfaceC6630h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(Uh.b proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        return this.f20750f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sh.AbstractC3504d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC5398g I(String desc, Object initializer) {
        AbstractC6492s.i(desc, "desc");
        AbstractC6492s.i(initializer, "initializer");
        if (kotlin.text.t.W("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return C5400i.f46097a.e(initializer, this.f20748d);
    }

    public void S(Yh.e eVar) {
        AbstractC6492s.i(eVar, "<set-?>");
        this.f20751g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sh.AbstractC3504d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC5398g M(AbstractC5398g constant) {
        AbstractC5398g c5389c;
        AbstractC6492s.i(constant, "constant");
        if (constant instanceof C5395d) {
            c5389c = new C5387A(((Number) ((C5395d) constant).b()).byteValue());
        } else if (constant instanceof di.w) {
            c5389c = new C5390D(((Number) ((di.w) constant).b()).shortValue());
        } else if (constant instanceof di.n) {
            c5389c = new C5388B(((Number) ((di.n) constant).b()).intValue());
        } else {
            if (!(constant instanceof di.t)) {
                return constant;
            }
            c5389c = new C5389C(((Number) ((di.t) constant).b()).longValue());
        }
        return c5389c;
    }

    @Override // Sh.AbstractC3505e
    public Yh.e u() {
        return this.f20751g;
    }

    @Override // Sh.AbstractC3505e
    protected x.a x(Zh.b annotationClassId, g0 source, List result) {
        AbstractC6492s.i(annotationClassId, "annotationClassId");
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(result, "result");
        return new b(R(annotationClassId), annotationClassId, result, source);
    }
}
