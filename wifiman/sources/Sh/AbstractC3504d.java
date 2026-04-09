package Sh;

import Bh.g0;
import Sh.A;
import Sh.x;
import di.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import li.AbstractC6611N;
import li.EnumC6626d;
import li.InterfaceC6627e;
import mh.InterfaceC6839p;
import pi.S;
import yh.C8673a;

/* renamed from: Sh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3504d extends AbstractC3505e implements InterfaceC6627e {

    /* renamed from: c, reason: collision with root package name */
    private final oi.g f20730c;

    /* renamed from: Sh.d$a */
    public static final class a implements x.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f20732b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f20733c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f20734d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f20735e;

        /* renamed from: Sh.d$a$a, reason: collision with other inner class name */
        public final class C0761a extends b implements x.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f20736d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0761a(a aVar, A signature) {
                super(aVar, signature);
                AbstractC6492s.i(signature, "signature");
                this.f20736d = aVar;
            }

            @Override // Sh.x.e
            public x.a c(int i10, Zh.b classId, g0 source) {
                AbstractC6492s.i(classId, "classId");
                AbstractC6492s.i(source, "source");
                A aE = A.f20700b.e(d(), i10);
                List arrayList = (List) this.f20736d.f20732b.get(aE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f20736d.f20732b.put(aE, arrayList);
                }
                return AbstractC3504d.this.y(classId, source, arrayList);
            }
        }

        /* renamed from: Sh.d$a$b */
        public class b implements x.c {

            /* renamed from: a, reason: collision with root package name */
            private final A f20737a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList f20738b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f20739c;

            public b(a aVar, A signature) {
                AbstractC6492s.i(signature, "signature");
                this.f20739c = aVar;
                this.f20737a = signature;
                this.f20738b = new ArrayList();
            }

            @Override // Sh.x.c
            public void a() {
                if (this.f20738b.isEmpty()) {
                    return;
                }
                this.f20739c.f20732b.put(this.f20737a, this.f20738b);
            }

            @Override // Sh.x.c
            public x.a b(Zh.b classId, g0 source) {
                AbstractC6492s.i(classId, "classId");
                AbstractC6492s.i(source, "source");
                return AbstractC3504d.this.y(classId, source, this.f20738b);
            }

            protected final A d() {
                return this.f20737a;
            }
        }

        a(HashMap map, x xVar, HashMap map2, HashMap map3) {
            this.f20732b = map;
            this.f20733c = xVar;
            this.f20734d = map2;
            this.f20735e = map3;
        }

        @Override // Sh.x.d
        public x.e a(Zh.f name, String desc) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            A.a aVar = A.f20700b;
            String strB = name.b();
            AbstractC6492s.h(strB, "asString(...)");
            return new C0761a(this, aVar.d(strB, desc));
        }

        @Override // Sh.x.d
        public x.c b(Zh.f name, String desc, Object obj) {
            Object objI;
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            A.a aVar = A.f20700b;
            String strB = name.b();
            AbstractC6492s.h(strB, "asString(...)");
            A a10 = aVar.a(strB, desc);
            if (obj != null && (objI = AbstractC3504d.this.I(desc, obj)) != null) {
                this.f20735e.put(a10, objI);
            }
            return new b(this, a10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3504d(oi.n storageManager, v kotlinClassFinder) {
        super(kotlinClassFinder);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        this.f20730c = storageManager.e(new C3501a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(C3507g loadConstantFromProperty, A it) {
        AbstractC6492s.i(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC6492s.i(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final C3507g H(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.c(new a(map, xVar, map3, map2), r(xVar));
        return new C3507g(map, map2, map3);
    }

    private final Object J(AbstractC6611N abstractC6611N, Uh.n nVar, EnumC6626d enumC6626d, S s10, InterfaceC6839p interfaceC6839p) {
        Object objInvoke;
        x xVarP = p(abstractC6611N, AbstractC3505e.f20740b.a(abstractC6611N, true, true, Wh.b.f23922B.d(nVar.k1()), Yh.i.f(nVar), v(), u()));
        if (xVarP == null) {
            return null;
        }
        A aS = s(nVar, abstractC6611N.b(), abstractC6611N.d(), enumC6626d, xVarP.a().d().d(n.f20777b.a()));
        if (aS == null || (objInvoke = interfaceC6839p.invoke(this.f20730c.invoke(xVarP), aS)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.builtins.s.d(s10) ? M(objInvoke) : objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(C3507g loadConstantFromProperty, A it) {
        AbstractC6492s.i(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC6492s.i(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3507g L(AbstractC3504d abstractC3504d, x kotlinClass) {
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        return abstractC3504d.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sh.AbstractC3505e
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3507g q(x binaryClass) {
        AbstractC6492s.i(binaryClass, "binaryClass");
        return (C3507g) this.f20730c.invoke(binaryClass);
    }

    protected final boolean F(Zh.b annotationClassId, Map arguments) {
        AbstractC6492s.i(annotationClassId, "annotationClassId");
        AbstractC6492s.i(arguments, "arguments");
        if (!AbstractC6492s.d(annotationClassId, C8673a.f66778a.a())) {
            return false;
        }
        Object obj = arguments.get(Zh.f.h("value"));
        di.s sVar = obj instanceof di.s ? (di.s) obj : null;
        if (sVar == null) {
            return false;
        }
        Object objB = sVar.b();
        s.b.C1725b c1725b = objB instanceof s.b.C1725b ? (s.b.C1725b) objB : null;
        if (c1725b == null) {
            return false;
        }
        return w(c1725b.b());
    }

    protected abstract Object I(String str, Object obj);

    protected abstract Object M(Object obj);

    @Override // li.InterfaceC6627e
    public Object c(AbstractC6611N container, Uh.n proto, S expectedType) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(expectedType, "expectedType");
        return J(container, proto, EnumC6626d.PROPERTY_GETTER, expectedType, C3502b.f20728a);
    }

    @Override // li.InterfaceC6627e
    public Object e(AbstractC6611N container, Uh.n proto, S expectedType) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(expectedType, "expectedType");
        return J(container, proto, EnumC6626d.PROPERTY, expectedType, C3503c.f20729a);
    }
}
