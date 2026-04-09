package ni;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.g0;
import Dh.C2603i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ni.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6971c extends C2603i implements InterfaceC6970b {

    /* renamed from: F, reason: collision with root package name */
    private final Uh.d f54737F;

    /* renamed from: G, reason: collision with root package name */
    private final Wh.c f54738G;

    /* renamed from: H, reason: collision with root package name */
    private final Wh.g f54739H;

    /* renamed from: I, reason: collision with root package name */
    private final Wh.h f54740I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC6987s f54741J;

    public /* synthetic */ C6971c(InterfaceC2495e interfaceC2495e, InterfaceC2502l interfaceC2502l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, InterfaceC2492b.a aVar, Uh.d dVar, Wh.c cVar, Wh.g gVar, Wh.h hVar2, InterfaceC6987s interfaceC6987s, g0 g0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2495e, interfaceC2502l, hVar, z10, aVar, dVar, cVar, gVar, hVar2, interfaceC6987s, (i10 & 1024) != 0 ? null : g0Var);
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean O() {
        return false;
    }

    @Override // ni.InterfaceC6988t
    public Wh.g R() {
        return this.f54739H;
    }

    @Override // ni.InterfaceC6988t
    public Wh.c X() {
        return this.f54738G;
    }

    @Override // ni.InterfaceC6988t
    public InterfaceC6987s Z() {
        return this.f54741J;
    }

    @Override // Dh.AbstractC2612s, Bh.C
    public boolean isExternal() {
        return false;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean isInline() {
        return false;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.C2603i
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C6971c L0(InterfaceC2503m newOwner, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a kind, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, g0 source) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(source, "source");
        C6971c c6971c = new C6971c((InterfaceC2495e) newOwner, (InterfaceC2502l) interfaceC2515z, annotations, this.f3461E, kind, F(), X(), R(), u1(), Z(), source);
        c6971c.Y0(Q0());
        return c6971c;
    }

    @Override // ni.InterfaceC6988t
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public Uh.d F() {
        return this.f54737F;
    }

    public Wh.h u1() {
        return this.f54740I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6971c(InterfaceC2495e containingDeclaration, InterfaceC2502l interfaceC2502l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, boolean z10, InterfaceC2492b.a kind, Uh.d proto, Wh.c nameResolver, Wh.g typeTable, Wh.h versionRequirementTable, InterfaceC6987s interfaceC6987s, g0 g0Var) {
        super(containingDeclaration, interfaceC2502l, annotations, z10, kind, g0Var == null ? g0.f1784a : g0Var);
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        this.f54737F = proto;
        this.f54738G = nameResolver;
        this.f54739H = typeTable;
        this.f54740I = versionRequirementTable;
        this.f54741J = interfaceC6987s;
    }
}
