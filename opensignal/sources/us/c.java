package us;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import ht.d1;
import ht.p0;
import ht.x;
import java.util.Collection;
import java.util.List;
import jt.i;
import mq.w;
import or.h;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f23691a;

    /* renamed from: b, reason: collision with root package name */
    public i f23692b;

    public c(p0 p0Var) {
        l.e(p0Var, "projection");
        this.f23691a = p0Var;
        p0Var.a();
        d1 d1Var = d1.INVARIANT;
    }

    @Override // us.b
    public final p0 a() {
        return this.f23691a;
    }

    @Override // ht.m0
    public final h n() {
        h hVarN = this.f23691a.b().Z().n();
        l.d(hVarN, "projection.type.constructor.builtIns");
        return hVarN;
    }

    @Override // ht.m0
    public final List o() {
        return w.f16945a;
    }

    @Override // ht.m0
    public final /* bridge */ /* synthetic */ rr.i p() {
        return null;
    }

    @Override // ht.m0
    public final Collection q() {
        p0 p0Var = this.f23691a;
        x xVarB = p0Var.a() == d1.OUT_VARIANCE ? p0Var.b() : n().o();
        l.d(xVarB, "if (projection.projectio… builtIns.nullableAnyType");
        return e5.H(xVarB);
    }

    @Override // ht.m0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f23691a + ')';
    }
}
