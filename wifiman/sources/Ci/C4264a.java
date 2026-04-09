package ci;

import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import kotlin.reflect.jvm.internal.impl.types.error.l;
import pi.AbstractC7346d0;
import pi.B0;
import pi.r0;
import ri.InterfaceC7613d;

/* renamed from: ci.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4264a extends AbstractC7346d0 implements InterfaceC7613d {

    /* renamed from: b, reason: collision with root package name */
    private final B0 f34024b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4265b f34025c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34026d;

    /* renamed from: e, reason: collision with root package name */
    private final r0 f34027e;

    public /* synthetic */ C4264a(B0 b02, InterfaceC4265b interfaceC4265b, boolean z10, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? new C4266c(b02) : interfaceC4265b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? r0.f58162b.j() : r0Var);
    }

    @Override // pi.S
    public List L0() {
        return AbstractC3689v.l();
    }

    @Override // pi.S
    public r0 M0() {
        return this.f34027e;
    }

    @Override // pi.S
    public boolean O0() {
        return this.f34026d;
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new C4264a(this.f34024b, N0(), O0(), newAttributes);
    }

    @Override // pi.S
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4265b N0() {
        return this.f34025c;
    }

    @Override // pi.AbstractC7346d0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C4264a R0(boolean z10) {
        return z10 == O0() ? this : new C4264a(this.f34024b, N0(), z10, M0());
    }

    @Override // pi.M0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C4264a X0(g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0B = this.f34024b.b(kotlinTypeRefiner);
        AbstractC6492s.h(b0B, "refine(...)");
        return new C4264a(b0B, N0(), O0(), M0());
    }

    @Override // pi.S
    public InterfaceC6164k r() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // pi.AbstractC7346d0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f34024b);
        sb2.append(')');
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }

    public C4264a(B0 typeProjection, InterfaceC4265b constructor, boolean z10, r0 attributes) {
        AbstractC6492s.i(typeProjection, "typeProjection");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(attributes, "attributes");
        this.f34024b = typeProjection;
        this.f34025c = constructor;
        this.f34026d = z10;
        this.f34027e = attributes;
    }
}
