package Sh;

import Bh.g0;
import Sh.A;
import Sh.x;
import Uh.c;
import Xh.a;
import Yh.d;
import Zg.AbstractC3689v;
import Zh.b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gi.C5922d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import li.AbstractC6611N;
import li.EnumC6626d;
import li.InterfaceC6630h;
import yh.C8673a;

/* renamed from: Sh.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3505e implements InterfaceC6630h {

    /* renamed from: b, reason: collision with root package name */
    public static final b f20740b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final v f20741a;

    /* renamed from: Sh.e$a */
    public static abstract class a {
        public abstract Map a();
    }

    /* renamed from: Sh.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(AbstractC6611N container, boolean z10, boolean z11, Boolean bool, boolean z12, v kotlinClassFinder, Yh.e jvmMetadataVersion) {
            AbstractC6611N.a aVarH;
            AbstractC6492s.i(container, "container");
            AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
            AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof AbstractC6611N.a) {
                    AbstractC6611N.a aVar = (AbstractC6611N.a) container;
                    if (aVar.g() == c.EnumC0834c.INTERFACE) {
                        Zh.b bVarE = aVar.e();
                        Zh.f fVarH = Zh.f.h("DefaultImpls");
                        AbstractC6492s.h(fVarH, "identifier(...)");
                        return w.b(kotlinClassFinder, bVarE.d(fVarH), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof AbstractC6611N.b)) {
                    g0 g0VarC = container.c();
                    r rVar = g0VarC instanceof r ? (r) g0VarC : null;
                    C5922d c5922dF = rVar != null ? rVar.f() : null;
                    if (c5922dF != null) {
                        b.a aVar2 = Zh.b.f25401d;
                        String strF = c5922dF.f();
                        AbstractC6492s.h(strF, "getInternalName(...)");
                        return w.b(kotlinClassFinder, aVar2.c(new Zh.c(kotlin.text.t.K(strF, '/', '.', false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof AbstractC6611N.a)) {
                AbstractC6611N.a aVar3 = (AbstractC6611N.a) container;
                if (aVar3.g() == c.EnumC0834c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == c.EnumC0834c.CLASS || aVarH.g() == c.EnumC0834c.ENUM_CLASS || (z12 && (aVarH.g() == c.EnumC0834c.INTERFACE || aVarH.g() == c.EnumC0834c.ANNOTATION_CLASS)))) {
                    g0 g0VarC2 = aVarH.c();
                    z zVar = g0VarC2 instanceof z ? (z) g0VarC2 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof AbstractC6611N.b) || !(container.c() instanceof r)) {
                return null;
            }
            g0 g0VarC3 = container.c();
            AbstractC6492s.g(g0VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            r rVar2 = (r) g0VarC3;
            x xVarG = rVar2.g();
            return xVarG == null ? w.b(kotlinClassFinder, rVar2.d(), jvmMetadataVersion) : xVarG;
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Sh.e$c */
    private static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c PROPERTY = new c("PROPERTY", 0);
        public static final c BACKING_FIELD = new c("BACKING_FIELD", 1);
        public static final c DELEGATE_FIELD = new c("DELEGATE_FIELD", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{PROPERTY, BACKING_FIELD, DELEGATE_FIELD};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: Sh.e$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20742a;

        static {
            int[] iArr = new int[EnumC6626d.values().length];
            try {
                iArr[EnumC6626d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6626d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6626d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20742a = iArr;
        }
    }

    /* renamed from: Sh.e$e, reason: collision with other inner class name */
    public static final class C0762e implements x.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f20744b;

        C0762e(ArrayList arrayList) {
            this.f20744b = arrayList;
        }

        @Override // Sh.x.c
        public void a() {
        }

        @Override // Sh.x.c
        public x.a b(Zh.b classId, g0 source) {
            AbstractC6492s.i(classId, "classId");
            AbstractC6492s.i(source, "source");
            return AbstractC3505e.this.y(classId, source, this.f20744b);
        }
    }

    public AbstractC3505e(v kotlinClassFinder) {
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        this.f20741a = kotlinClassFinder;
    }

    private final x A(AbstractC6611N.a aVar) {
        g0 g0VarC = aVar.c();
        z zVar = g0VarC instanceof z ? (z) g0VarC : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(AbstractC6611N abstractC6611N, kotlin.reflect.jvm.internal.impl.protobuf.n nVar) {
        if (nVar instanceof Uh.i) {
            if (!Wh.f.g((Uh.i) nVar)) {
                return 0;
            }
        } else if (nVar instanceof Uh.n) {
            if (!Wh.f.h((Uh.n) nVar)) {
                return 0;
            }
        } else {
            if (!(nVar instanceof Uh.d)) {
                throw new UnsupportedOperationException("Unsupported message: " + nVar.getClass());
            }
            AbstractC6492s.g(abstractC6611N, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC6611N.a aVar = (AbstractC6611N.a) abstractC6611N;
            if (aVar.g() == c.EnumC0834c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        }
        return 1;
    }

    private final List n(AbstractC6611N abstractC6611N, A a10, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List list;
        x xVarP = p(abstractC6611N, f20740b.a(abstractC6611N, z10, z11, bool, z12, this.f20741a, u()));
        return (xVarP == null || (list = (List) q(xVarP).a().get(a10)) == null) ? AbstractC3689v.l() : list;
    }

    static /* synthetic */ List o(AbstractC3505e abstractC3505e, AbstractC6611N abstractC6611N, A a10, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return abstractC3505e.n(abstractC6611N, a10, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ A t(AbstractC3505e abstractC3505e, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, Wh.c cVar, Wh.g gVar, EnumC6626d enumC6626d, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC3505e.s(nVar, cVar, gVar, enumC6626d, z10);
    }

    private final List z(AbstractC6611N abstractC6611N, Uh.n nVar, c cVar) {
        Boolean boolD = Wh.b.f23922B.d(nVar.k1());
        AbstractC6492s.h(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = Yh.i.f(nVar);
        if (cVar == c.PROPERTY) {
            A aB = AbstractC3506f.b(nVar, abstractC6611N.b(), abstractC6611N.d(), false, true, false, 40, null);
            return aB == null ? AbstractC3689v.l() : o(this, abstractC6611N, aB, true, false, boolD, zF, 8, null);
        }
        A aB2 = AbstractC3506f.b(nVar, abstractC6611N.b(), abstractC6611N.d(), true, false, false, 48, null);
        if (aB2 == null) {
            return AbstractC3689v.l();
        }
        return kotlin.text.t.W(aB2.a(), "$delegate", false, 2, null) != (cVar == c.DELEGATE_FIELD) ? AbstractC3689v.l() : n(abstractC6611N, aB2, true, true, boolD, zF);
    }

    @Override // li.InterfaceC6630h
    public List a(AbstractC6611N.a container) {
        AbstractC6492s.i(container, "container");
        x xVarA = A(container);
        if (xVarA != null) {
            ArrayList arrayList = new ArrayList(1);
            xVarA.d(new C0762e(arrayList), r(xVarA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // li.InterfaceC6630h
    public List b(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, EnumC6626d kind, int i10, Uh.u proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(callableProto, "callableProto");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(proto, "proto");
        A aT = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (aT == null) {
            return AbstractC3689v.l();
        }
        return o(this, container, A.f20700b.e(aT, i10 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // li.InterfaceC6630h
    public List d(AbstractC6611N container, Uh.g proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        return o(this, container, A.f20700b.a(container.b().getString(proto.K0()), Yh.b.b(((AbstractC6611N.a) container).e().b())), false, false, null, false, 60, null);
    }

    @Override // li.InterfaceC6630h
    public List f(AbstractC6611N container, Uh.n proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        return z(container, proto, c.DELEGATE_FIELD);
    }

    @Override // li.InterfaceC6630h
    public List g(AbstractC6611N container, Uh.n proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        return z(container, proto, c.BACKING_FIELD);
    }

    @Override // li.InterfaceC6630h
    public List h(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n proto, EnumC6626d kind) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(kind, "kind");
        if (kind == EnumC6626d.PROPERTY) {
            return z(container, (Uh.n) proto, c.PROPERTY);
        }
        A aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return aT == null ? AbstractC3689v.l() : o(this, container, aT, false, false, null, false, 60, null);
    }

    @Override // li.InterfaceC6630h
    public List i(Uh.s proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        Object objJ = proto.J(Xh.a.f24349h);
        AbstractC6492s.h(objJ, "getExtension(...)");
        Iterable<Uh.b> iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
        for (Uh.b bVar : iterable) {
            AbstractC6492s.f(bVar);
            arrayList.add(l(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List j(Uh.q proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        Object objJ = proto.J(Xh.a.f24347f);
        AbstractC6492s.h(objJ, "getExtension(...)");
        Iterable<Uh.b> iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
        for (Uh.b bVar : iterable) {
            AbstractC6492s.f(bVar);
            arrayList.add(l(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List k(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n proto, EnumC6626d kind) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(kind, "kind");
        A aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return aT != null ? o(this, container, A.f20700b.e(aT, 0), false, false, null, false, 60, null) : AbstractC3689v.l();
    }

    @Override // li.InterfaceC6630h
    public abstract Object l(Uh.b bVar, Wh.c cVar);

    protected final x p(AbstractC6611N container, x xVar) {
        AbstractC6492s.i(container, "container");
        if (xVar != null) {
            return xVar;
        }
        if (container instanceof AbstractC6611N.a) {
            return A((AbstractC6611N.a) container);
        }
        return null;
    }

    protected abstract a q(x xVar);

    protected byte[] r(x kotlinClass) {
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        return null;
    }

    protected final A s(kotlin.reflect.jvm.internal.impl.protobuf.n proto, Wh.c nameResolver, Wh.g typeTable, EnumC6626d kind, boolean z10) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(kind, "kind");
        if (proto instanceof Uh.d) {
            A.a aVar = A.f20700b;
            d.b bVarB = Yh.i.f25057a.b((Uh.d) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof Uh.i) {
            A.a aVar2 = A.f20700b;
            d.b bVarE = Yh.i.f25057a.e((Uh.i) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (!(proto instanceof Uh.n)) {
            return null;
        }
        h.f propertySignature = Xh.a.f24345d;
        AbstractC6492s.h(propertySignature, "propertySignature");
        a.d dVar = (a.d) Wh.e.a((h.d) proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        int i10 = d.f20742a[kind.ordinal()];
        if (i10 == 1) {
            if (!dVar.M0()) {
                return null;
            }
            A.a aVar3 = A.f20700b;
            a.c cVarQ0 = dVar.q0();
            AbstractC6492s.h(cVarQ0, "getGetter(...)");
            return aVar3.c(nameResolver, cVarQ0);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractC3506f.a((Uh.n) proto, nameResolver, typeTable, true, true, z10);
        }
        if (!dVar.N0()) {
            return null;
        }
        A.a aVar4 = A.f20700b;
        a.c cVarC0 = dVar.C0();
        AbstractC6492s.h(cVarC0, "getSetter(...)");
        return aVar4.c(nameResolver, cVarC0);
    }

    public abstract Yh.e u();

    protected final v v() {
        return this.f20741a;
    }

    protected final boolean w(Zh.b classId) {
        x xVarB;
        AbstractC6492s.i(classId, "classId");
        return classId.e() != null && AbstractC6492s.d(classId.h().b(), "Container") && (xVarB = w.b(this.f20741a, classId, u())) != null && C8673a.f66778a.c(xVarB);
    }

    protected abstract x.a x(Zh.b bVar, g0 g0Var, List list);

    protected final x.a y(Zh.b annotationClassId, g0 source, List result) {
        AbstractC6492s.i(annotationClassId, "annotationClassId");
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(result, "result");
        if (C8673a.f66778a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }
}
