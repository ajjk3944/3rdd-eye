package ni;

import Bh.AbstractC2510u;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.g0;
import Bh.k0;
import Bh.p0;
import Dh.AbstractC2601g;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.F0;
import pi.G0;
import pi.N0;
import pi.W;

/* renamed from: ni.P, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6965P extends AbstractC2601g implements InterfaceC6988t {

    /* renamed from: k, reason: collision with root package name */
    private final Uh.r f54722k;

    /* renamed from: l, reason: collision with root package name */
    private final Wh.c f54723l;

    /* renamed from: m, reason: collision with root package name */
    private final Wh.g f54724m;

    /* renamed from: n, reason: collision with root package name */
    private final Wh.h f54725n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6987s f54726o;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC7346d0 f54727p;

    /* renamed from: q, reason: collision with root package name */
    private AbstractC7346d0 f54728q;

    /* renamed from: r, reason: collision with root package name */
    private List f54729r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC7346d0 f54730s;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6965P(oi.n storageManager, InterfaceC2503m containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, AbstractC2510u visibility, Uh.r proto, Wh.c nameResolver, Wh.g typeTable, Wh.h versionRequirementTable, InterfaceC6987s interfaceC6987s) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(visibility, "visibility");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f54722k = proto;
        this.f54723l = nameResolver;
        this.f54724m = typeTable;
        this.f54725n = versionRequirementTable;
        this.f54726o = interfaceC6987s;
    }

    @Override // ni.InterfaceC6988t
    public Wh.g R() {
        return this.f54724m;
    }

    @Override // Dh.AbstractC2601g
    protected List R0() {
        List list = this.f54729r;
        if (list != null) {
            return list;
        }
        AbstractC6492s.v("typeConstructorParameters");
        return null;
    }

    @Override // Bh.k0
    public AbstractC7346d0 U() {
        AbstractC7346d0 abstractC7346d0 = this.f54728q;
        if (abstractC7346d0 != null) {
            return abstractC7346d0;
        }
        AbstractC6492s.v("expandedType");
        return null;
    }

    @Override // ni.InterfaceC6988t
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Uh.r F() {
        return this.f54722k;
    }

    public Wh.h V0() {
        return this.f54725n;
    }

    public final void W0(List declaredTypeParameters, AbstractC7346d0 underlyingType, AbstractC7346d0 expandedType) {
        AbstractC6492s.i(declaredTypeParameters, "declaredTypeParameters");
        AbstractC6492s.i(underlyingType, "underlyingType");
        AbstractC6492s.i(expandedType, "expandedType");
        S0(declaredTypeParameters);
        this.f54727p = underlyingType;
        this.f54728q = expandedType;
        this.f54729r = p0.g(this);
        this.f54730s = M0();
    }

    @Override // ni.InterfaceC6988t
    public Wh.c X() {
        return this.f54723l;
    }

    @Override // Bh.i0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public k0 c(G0 substitutor) {
        AbstractC6492s.i(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        oi.n nVarG0 = g0();
        InterfaceC2503m interfaceC2503mB = b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = getAnnotations();
        AbstractC6492s.h(annotations, "<get-annotations>(...)");
        Zh.f name = getName();
        AbstractC6492s.h(name, "getName(...)");
        C6965P c6965p = new C6965P(nVarG0, interfaceC2503mB, annotations, name, getVisibility(), F(), X(), R(), V0(), Z());
        List listW = w();
        AbstractC7346d0 abstractC7346d0F0 = f0();
        N0 n02 = N0.INVARIANT;
        pi.S sN = substitutor.n(abstractC7346d0F0, n02);
        AbstractC6492s.h(sN, "safeSubstitute(...)");
        AbstractC7346d0 abstractC7346d0A = F0.a(sN);
        pi.S sN2 = substitutor.n(U(), n02);
        AbstractC6492s.h(sN2, "safeSubstitute(...)");
        c6965p.W0(listW, abstractC7346d0A, F0.a(sN2));
        return c6965p;
    }

    @Override // ni.InterfaceC6988t
    public InterfaceC6987s Z() {
        return this.f54726o;
    }

    @Override // Bh.k0
    public AbstractC7346d0 f0() {
        AbstractC7346d0 abstractC7346d0 = this.f54727p;
        if (abstractC7346d0 != null) {
            return abstractC7346d0;
        }
        AbstractC6492s.v("underlyingType");
        return null;
    }

    @Override // Bh.k0
    public InterfaceC2495e t() {
        if (W.a(U())) {
            return null;
        }
        InterfaceC2498h interfaceC2498hC = U().N0().c();
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hC;
        }
        return null;
    }

    @Override // Bh.InterfaceC2498h
    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0 = this.f54730s;
        if (abstractC7346d0 != null) {
            return abstractC7346d0;
        }
        AbstractC6492s.v("defaultTypeImpl");
        return null;
    }
}
