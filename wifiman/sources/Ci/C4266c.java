package ci;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.n;
import pi.B0;
import pi.N0;
import pi.S;

/* renamed from: ci.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4266c implements InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f34028a;

    /* renamed from: b, reason: collision with root package name */
    private n f34029b;

    public C4266c(B0 projection) {
        AbstractC6492s.i(projection, "projection");
        this.f34028a = projection;
        e().a();
        N0 n02 = N0.INVARIANT;
    }

    @Override // pi.v0
    public Collection a() {
        S type = e().a() == N0.OUT_VARIANCE ? e().getType() : q().I();
        AbstractC6492s.f(type);
        return AbstractC3689v.e(type);
    }

    @Override // pi.v0
    public /* bridge */ /* synthetic */ InterfaceC2498h c() {
        return (InterfaceC2498h) f();
    }

    @Override // pi.v0
    public boolean d() {
        return false;
    }

    @Override // ci.InterfaceC4265b
    public B0 e() {
        return this.f34028a;
    }

    public Void f() {
        return null;
    }

    public final n g() {
        return this.f34029b;
    }

    @Override // pi.v0
    public List getParameters() {
        return AbstractC3689v.l();
    }

    @Override // pi.v0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4266c b(g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0B = e().b(kotlinTypeRefiner);
        AbstractC6492s.h(b0B, "refine(...)");
        return new C4266c(b0B);
    }

    public final void i(n nVar) {
        this.f34029b = nVar;
    }

    @Override // pi.v0
    public i q() {
        i iVarQ = e().getType().N0().q();
        AbstractC6492s.h(iVarQ, "getBuiltIns(...)");
        return iVarQ;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + e() + ')';
    }
}
