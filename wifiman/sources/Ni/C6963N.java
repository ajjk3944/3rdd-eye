package ni;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.g0;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ni.N, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6963N extends Dh.K implements InterfaceC6970b {

    /* renamed from: C, reason: collision with root package name */
    private final Uh.n f54712C;

    /* renamed from: D, reason: collision with root package name */
    private final Wh.c f54713D;

    /* renamed from: E, reason: collision with root package name */
    private final Wh.g f54714E;

    /* renamed from: F, reason: collision with root package name */
    private final Wh.h f54715F;

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC6987s f54716G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6963N(InterfaceC2503m containingDeclaration, Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Bh.D modality, AbstractC2510u visibility, boolean z10, Zh.f name, InterfaceC2492b.a kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Uh.n proto, Wh.c nameResolver, Wh.g typeTable, Wh.h versionRequirementTable, InterfaceC6987s interfaceC6987s) {
        super(containingDeclaration, y10, annotations, modality, visibility, z10, name, kind, g0.f1784a, z11, z12, z15, false, z13, z14);
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(modality, "modality");
        AbstractC6492s.i(visibility, "visibility");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        this.f54712C = proto;
        this.f54713D = nameResolver;
        this.f54714E = typeTable;
        this.f54715F = versionRequirementTable;
        this.f54716G = interfaceC6987s;
    }

    @Override // Dh.K
    protected Dh.K P0(InterfaceC2503m newOwner, Bh.D newModality, AbstractC2510u newVisibility, Y y10, InterfaceC2492b.a kind, Zh.f newName, g0 source) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(newModality, "newModality");
        AbstractC6492s.i(newVisibility, "newVisibility");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(newName, "newName");
        AbstractC6492s.i(source, "source");
        return new C6963N(newOwner, y10, getAnnotations(), newModality, newVisibility, h0(), newName, kind, q0(), A(), isExternal(), N(), L(), F(), X(), R(), g1(), Z());
    }

    @Override // ni.InterfaceC6988t
    public Wh.g R() {
        return this.f54714E;
    }

    @Override // ni.InterfaceC6988t
    public Wh.c X() {
        return this.f54713D;
    }

    @Override // ni.InterfaceC6988t
    public InterfaceC6987s Z() {
        return this.f54716G;
    }

    @Override // ni.InterfaceC6988t
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public Uh.n F() {
        return this.f54712C;
    }

    public Wh.h g1() {
        return this.f54715F;
    }

    @Override // Dh.K, Bh.C
    public boolean isExternal() {
        Boolean boolD = Wh.b.f23925E.d(F().k1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }
}
