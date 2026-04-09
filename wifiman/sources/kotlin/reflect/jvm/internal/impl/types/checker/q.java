package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import pi.C7351g;
import pi.M0;
import pi.S;
import pi.u0;

/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: c, reason: collision with root package name */
    private final g f52167c;

    /* renamed from: d, reason: collision with root package name */
    private final f f52168d;

    /* renamed from: e, reason: collision with root package name */
    private final bi.o f52169e;

    public q(g kotlinTypeRefiner, f kotlinTypePreparator) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC6492s.i(kotlinTypePreparator, "kotlinTypePreparator");
        this.f52167c = kotlinTypeRefiner;
        this.f52168d = kotlinTypePreparator;
        bi.o oVarM = bi.o.m(d());
        AbstractC6492s.h(oVarM, "createWithTypeRefiner(...)");
        this.f52169e = oVarM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    public bi.o a() {
        return this.f52169e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean b(S a10, S b10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return e(AbstractC6506a.b(false, false, null, f(), d(), 6, null), a10.Q0(), b10.Q0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean c(S subtype, S supertype) {
        AbstractC6492s.i(subtype, "subtype");
        AbstractC6492s.i(supertype, "supertype");
        return g(AbstractC6506a.b(true, false, null, f(), d(), 6, null), subtype.Q0(), supertype.Q0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    public g d() {
        return this.f52167c;
    }

    public final boolean e(u0 u0Var, M0 a10, M0 b10) {
        AbstractC6492s.i(u0Var, "<this>");
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return C7351g.f58125a.m(u0Var, a10, b10);
    }

    public f f() {
        return this.f52168d;
    }

    public final boolean g(u0 u0Var, M0 subType, M0 superType) {
        AbstractC6492s.i(u0Var, "<this>");
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return C7351g.v(C7351g.f58125a, u0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f52145a : fVar);
    }
}
