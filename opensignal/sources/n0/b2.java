package n0;

/* loaded from: classes.dex */
public abstract class b2 extends x0.u implements x0.m {

    /* renamed from: d, reason: collision with root package name */
    public final c2 f17137d;

    /* renamed from: g, reason: collision with root package name */
    public a2 f17138g;

    public b2(Object obj, c2 c2Var) {
        this.f17137d = c2Var;
        x0.f fVarK = x0.l.k();
        a2 a2Var = new a2(obj, fVarK.g());
        if (!(fVarK instanceof x0.a)) {
            a2Var.f24752b = new a2(obj, 1);
        }
        this.f17138g = a2Var;
    }

    @Override // x0.t
    public final void d(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f17138g = (a2) vVar;
    }

    @Override // x0.t
    public final x0.v e() {
        return this.f17138g;
    }

    @Override // n0.g2
    public final Object getValue() {
        return ((a2) x0.l.t(this.f17138g, this)).f17133c;
    }

    @Override // x0.m
    public final c2 i() {
        return this.f17137d;
    }

    @Override // x0.t
    public final x0.v j(x0.v vVar, x0.v vVar2, x0.v vVar3) {
        if (this.f17137d.a(((a2) vVar2).f17133c, ((a2) vVar3).f17133c)) {
            return vVar2;
        }
        return null;
    }

    @Override // n0.x0
    public final void setValue(Object obj) {
        x0.f fVarK;
        a2 a2Var = (a2) x0.l.i(this.f17138g);
        if (this.f17137d.a(a2Var.f17133c, obj)) {
            return;
        }
        a2 a2Var2 = this.f17138g;
        synchronized (x0.l.f24717c) {
            fVarK = x0.l.k();
            ((a2) x0.l.o(a2Var2, this, fVarK, a2Var)).f17133c = obj;
        }
        x0.l.n(fVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a2) x0.l.i(this.f17138g)).f17133c + ")@" + hashCode();
    }
}
