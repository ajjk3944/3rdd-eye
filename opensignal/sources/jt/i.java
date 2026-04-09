package jt;

import ht.p0;
import ht.x;
import java.util.Collection;
import java.util.List;
import mq.w;
import rr.r0;

/* loaded from: classes.dex */
public final class i implements us.b {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f13850a;

    /* renamed from: b, reason: collision with root package name */
    public ar.a f13851b;

    /* renamed from: c, reason: collision with root package name */
    public final i f13852c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f13853d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13854e;

    public i(p0 p0Var, ar.a aVar, i iVar, r0 r0Var) {
        br.l.e(p0Var, "projection");
        this.f13850a = p0Var;
        this.f13851b = aVar;
        this.f13852c = iVar;
        this.f13853d = r0Var;
        this.f13854e = kc.f.E(lq.j.PUBLICATION, new ht.g(12, this));
    }

    @Override // us.b
    public final p0 a() {
        return this.f13850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.f13852c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        i iVar3 = iVar.f13852c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        return iVar2 == iVar;
    }

    public final int hashCode() {
        i iVar = this.f13852c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    @Override // ht.m0
    public final or.h n() {
        x xVarB = this.f13850a.b();
        br.l.d(xVarB, "projection.type");
        return se.b.A(xVarB);
    }

    @Override // ht.m0
    public final List o() {
        return w.f16945a;
    }

    @Override // ht.m0
    public final rr.i p() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ht.m0
    public final Collection q() {
        List list = (List) this.f13854e.getValue();
        return list == null ? w.f16945a : list;
    }

    @Override // ht.m0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.f13850a + ')';
    }

    public /* synthetic */ i(p0 p0Var, ft.d dVar, r0 r0Var, int i10) {
        this(p0Var, (i10 & 2) != 0 ? null : dVar, (i) null, (i10 & 8) != 0 ? null : r0Var);
    }
}
