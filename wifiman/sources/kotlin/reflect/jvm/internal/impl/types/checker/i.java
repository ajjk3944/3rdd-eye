package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.l0;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.B0;
import pi.M0;
import pi.r0;
import ri.EnumC7611b;
import ri.InterfaceC7613d;

/* loaded from: classes4.dex */
public final class i extends AbstractC7346d0 implements InterfaceC7613d {

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7611b f52148b;

    /* renamed from: c, reason: collision with root package name */
    private final n f52149c;

    /* renamed from: d, reason: collision with root package name */
    private final M0 f52150d;

    /* renamed from: e, reason: collision with root package name */
    private final r0 f52151e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f52152f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f52153g;

    public /* synthetic */ i(EnumC7611b enumC7611b, n nVar, M0 m02, r0 r0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC7611b, nVar, m02, (i10 & 8) != 0 ? r0.f58162b.j() : r0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // pi.S
    public List L0() {
        return AbstractC3689v.l();
    }

    @Override // pi.S
    public r0 M0() {
        return this.f52151e;
    }

    @Override // pi.S
    public boolean O0() {
        return this.f52152f;
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new i(this.f52148b, N0(), this.f52150d, newAttributes, O0(), this.f52153g);
    }

    public final EnumC7611b W0() {
        return this.f52148b;
    }

    @Override // pi.S
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public n N0() {
        return this.f52149c;
    }

    public final M0 Y0() {
        return this.f52150d;
    }

    public final boolean Z0() {
        return this.f52153g;
    }

    @Override // pi.AbstractC7346d0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public i R0(boolean z10) {
        return new i(this.f52148b, N0(), this.f52150d, M0(), z10, false, 32, null);
    }

    @Override // pi.M0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i X0(g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC7611b enumC7611b = this.f52148b;
        n nVarB = N0().b(kotlinTypeRefiner);
        M0 m02 = this.f52150d;
        return new i(enumC7611b, nVarB, m02 != null ? kotlinTypeRefiner.a(m02).Q0() : null, M0(), O0(), false, 32, null);
    }

    @Override // pi.S
    public InterfaceC6164k r() {
        return kotlin.reflect.jvm.internal.impl.types.error.l.a(kotlin.reflect.jvm.internal.impl.types.error.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(EnumC7611b captureStatus, n constructor, M0 m02, r0 attributes, boolean z10, boolean z11) {
        AbstractC6492s.i(captureStatus, "captureStatus");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(attributes, "attributes");
        this.f52148b = captureStatus;
        this.f52149c = constructor;
        this.f52150d = m02;
        this.f52151e = attributes;
        this.f52152f = z10;
        this.f52153g = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(EnumC7611b captureStatus, M0 m02, B0 projection, l0 typeParameter) {
        this(captureStatus, new n(projection, null, null, typeParameter, 6, null), m02, null, false, false, 56, null);
        AbstractC6492s.i(captureStatus, "captureStatus");
        AbstractC6492s.i(projection, "projection");
        AbstractC6492s.i(typeParameter, "typeParameter");
    }
}
