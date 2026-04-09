package pi;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7369p extends AbstractC7374v {

    /* renamed from: b, reason: collision with root package name */
    private final oi.i f58155b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f58156c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pi.p$a */
    final class a implements v0 {

        /* renamed from: a, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f58157a;

        /* renamed from: b, reason: collision with root package name */
        private final Yg.m f58158b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7369p f58159c;

        public a(AbstractC7369p abstractC7369p, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f58159c = abstractC7369p;
            this.f58157a = kotlinTypeRefiner;
            this.f58158b = Yg.n.a(Yg.q.PUBLICATION, new C7367o(this, abstractC7369p));
        }

        private final List g() {
            return (List) this.f58158b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List i(a aVar, AbstractC7369p abstractC7369p) {
            return kotlin.reflect.jvm.internal.impl.types.checker.h.b(aVar.f58157a, abstractC7369p.a());
        }

        @Override // pi.v0
        public v0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f58159c.b(kotlinTypeRefiner);
        }

        @Override // pi.v0
        public InterfaceC2498h c() {
            return this.f58159c.c();
        }

        @Override // pi.v0
        public boolean d() {
            return this.f58159c.d();
        }

        public boolean equals(Object obj) {
            return this.f58159c.equals(obj);
        }

        @Override // pi.v0
        public List getParameters() {
            List parameters = this.f58159c.getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            return parameters;
        }

        @Override // pi.v0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List a() {
            return g();
        }

        public int hashCode() {
            return this.f58159c.hashCode();
        }

        @Override // pi.v0
        public kotlin.reflect.jvm.internal.impl.builtins.i q() {
            kotlin.reflect.jvm.internal.impl.builtins.i iVarQ = this.f58159c.q();
            AbstractC6492s.h(iVarQ, "getBuiltIns(...)");
            return iVarQ;
        }

        public String toString() {
            return this.f58159c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pi.p$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f58160a;

        /* renamed from: b, reason: collision with root package name */
        private List f58161b;

        public b(Collection allSupertypes) {
            AbstractC6492s.i(allSupertypes, "allSupertypes");
            this.f58160a = allSupertypes;
            this.f58161b = AbstractC3689v.e(kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.l());
        }

        public final Collection a() {
            return this.f58160a;
        }

        public final List b() {
            return this.f58161b;
        }

        public final void c(List list) {
            AbstractC6492s.i(list, "<set-?>");
            this.f58161b = list;
        }
    }

    public AbstractC7369p(oi.n storageManager) {
        AbstractC6492s.i(storageManager, "storageManager");
        this.f58155b = storageManager.h(new C7353h(this), C7355i.f58132a, new C7357j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(AbstractC7369p abstractC7369p) {
        return new b(abstractC7369p.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(AbstractC3689v.e(kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J C(AbstractC7369p abstractC7369p, b supertypes) {
        AbstractC6492s.i(supertypes, "supertypes");
        List listA = abstractC7369p.v().a(abstractC7369p, supertypes.a(), new C7359k(abstractC7369p), new C7361l(abstractC7369p));
        if (listA.isEmpty()) {
            S s10 = abstractC7369p.s();
            List listE = s10 != null ? AbstractC3689v.e(s10) : null;
            if (listE == null) {
                listE = AbstractC3689v.l();
            }
            listA = listE;
        }
        if (abstractC7369p.u()) {
            abstractC7369p.v().a(abstractC7369p, listA, new C7363m(abstractC7369p), new C7365n(abstractC7369p));
        }
        List listI1 = listA instanceof List ? (List) listA : null;
        if (listI1 == null) {
            listI1 = AbstractC3689v.i1(listA);
        }
        supertypes.c(abstractC7369p.x(listI1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(AbstractC7369p abstractC7369p, v0 it) {
        AbstractC6492s.i(it, "it");
        return abstractC7369p.p(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J E(AbstractC7369p abstractC7369p, S it) {
        AbstractC6492s.i(it, "it");
        abstractC7369p.z(it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(AbstractC7369p abstractC7369p, v0 it) {
        AbstractC6492s.i(it, "it");
        return abstractC7369p.p(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J G(AbstractC7369p abstractC7369p, S it) {
        AbstractC6492s.i(it, "it");
        abstractC7369p.y(it);
        return Yg.J.f24997a;
    }

    private final Collection p(v0 v0Var, boolean z10) {
        List listM0;
        AbstractC7369p abstractC7369p = v0Var instanceof AbstractC7369p ? (AbstractC7369p) v0Var : null;
        if (abstractC7369p != null && (listM0 = AbstractC3689v.M0(((b) abstractC7369p.f58155b.invoke()).a(), abstractC7369p.t(z10))) != null) {
            return listM0;
        }
        Collection collectionA = v0Var.a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    @Override // pi.v0
    public v0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected abstract Collection r();

    protected abstract S s();

    protected Collection t(boolean z10) {
        return AbstractC3689v.l();
    }

    protected boolean u() {
        return this.f58156c;
    }

    protected abstract Bh.j0 v();

    @Override // pi.v0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public List a() {
        return ((b) this.f58155b.invoke()).b();
    }

    protected List x(List supertypes) {
        AbstractC6492s.i(supertypes, "supertypes");
        return supertypes;
    }

    protected void y(S type) {
        AbstractC6492s.i(type, "type");
    }

    protected void z(S type) {
        AbstractC6492s.i(type, "type");
    }
}
