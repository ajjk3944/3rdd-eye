package ni;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.f0;
import Bh.g0;
import Dh.AbstractC2612s;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ni.O, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6964O extends Dh.O implements InterfaceC6970b {

    /* renamed from: E, reason: collision with root package name */
    private final Uh.i f54717E;

    /* renamed from: F, reason: collision with root package name */
    private final Wh.c f54718F;

    /* renamed from: G, reason: collision with root package name */
    private final Wh.g f54719G;

    /* renamed from: H, reason: collision with root package name */
    private final Wh.h f54720H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC6987s f54721I;

    public /* synthetic */ C6964O(InterfaceC2503m interfaceC2503m, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, InterfaceC2492b.a aVar, Uh.i iVar, Wh.c cVar, Wh.g gVar, Wh.h hVar2, InterfaceC6987s interfaceC6987s, g0 g0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2503m, f0Var, hVar, fVar, aVar, iVar, cVar, gVar, hVar2, interfaceC6987s, (i10 & 1024) != 0 ? null : g0Var);
    }

    @Override // Dh.O, Dh.AbstractC2612s
    protected AbstractC2612s L0(InterfaceC2503m newOwner, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a kind, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, g0 source) {
        Zh.f fVar2;
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(source, "source");
        f0 f0Var = (f0) interfaceC2515z;
        if (fVar == null) {
            Zh.f name = getName();
            AbstractC6492s.h(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C6964O c6964o = new C6964O(newOwner, f0Var, annotations, fVar2, kind, F(), X(), R(), q1(), Z(), source);
        c6964o.Y0(Q0());
        return c6964o;
    }

    @Override // ni.InterfaceC6988t
    public Wh.g R() {
        return this.f54719G;
    }

    @Override // ni.InterfaceC6988t
    public Wh.c X() {
        return this.f54718F;
    }

    @Override // ni.InterfaceC6988t
    public InterfaceC6987s Z() {
        return this.f54721I;
    }

    @Override // ni.InterfaceC6988t
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Uh.i F() {
        return this.f54717E;
    }

    public Wh.h q1() {
        return this.f54720H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6964O(InterfaceC2503m containingDeclaration, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, InterfaceC2492b.a kind, Uh.i proto, Wh.c nameResolver, Wh.g typeTable, Wh.h versionRequirementTable, InterfaceC6987s interfaceC6987s, g0 g0Var) {
        super(containingDeclaration, f0Var, annotations, name, kind, g0Var == null ? g0.f1784a : g0Var);
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        this.f54717E = proto;
        this.f54718F = nameResolver;
        this.f54719G = typeTable;
        this.f54720H = versionRequirementTable;
        this.f54721I = interfaceC6987s;
    }
}
