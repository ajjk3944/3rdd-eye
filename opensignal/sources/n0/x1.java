package n0;

/* loaded from: classes.dex */
public abstract class x1 extends x0.u implements x0.m, x0, g2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17362d;

    /* renamed from: g, reason: collision with root package name */
    public x0.v f17363g;

    public /* synthetic */ x1(int i10) {
        this.f17362d = i10;
    }

    @Override // x0.t
    public final void d(x0.v vVar) {
        switch (this.f17362d) {
            case 0:
                br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
                this.f17363g = (w1) vVar;
                break;
            case 1:
                br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
                this.f17363g = (y1) vVar;
                break;
            default:
                br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
                this.f17363g = (z1) vVar;
                break;
        }
    }

    @Override // x0.t
    public final x0.v e() {
        switch (this.f17362d) {
            case 0:
                return (w1) this.f17363g;
            case 1:
                return (y1) this.f17363g;
            default:
                return (z1) this.f17363g;
        }
    }

    @Override // n0.g2
    public Object getValue() {
        switch (this.f17362d) {
            case 0:
                return Float.valueOf(((w1) x0.l.t((w1) this.f17363g, this)).f17357c);
            case 1:
                return Integer.valueOf(l());
            default:
                return Long.valueOf(((z1) x0.l.t((z1) this.f17363g, this)).f17369c);
        }
    }

    @Override // x0.m
    public final c2 i() {
        switch (this.f17362d) {
        }
        return t0.f17321y;
    }

    @Override // x0.t
    public final x0.v j(x0.v vVar, x0.v vVar2, x0.v vVar3) {
        switch (this.f17362d) {
            case 0:
                if (((w1) vVar2).f17357c == ((w1) vVar3).f17357c) {
                }
                break;
            case 1:
                if (((y1) vVar2).f17366c == ((y1) vVar3).f17366c) {
                }
                break;
            default:
                if (((z1) vVar2).f17369c == ((z1) vVar3).f17369c) {
                }
                break;
        }
        return vVar2;
    }

    public int l() {
        return ((y1) x0.l.t((y1) this.f17363g, this)).f17366c;
    }

    public void m(float f10) {
        x0.f fVarK;
        w1 w1Var = (w1) x0.l.i((w1) this.f17363g);
        if (w1Var.f17357c == f10) {
            return;
        }
        w1 w1Var2 = (w1) this.f17363g;
        synchronized (x0.l.f24717c) {
            fVarK = x0.l.k();
            ((w1) x0.l.o(w1Var2, this, fVarK, w1Var)).f17357c = f10;
        }
        x0.l.n(fVarK, this);
    }

    public void n(int i10) {
        x0.f fVarK;
        y1 y1Var = (y1) x0.l.i((y1) this.f17363g);
        if (y1Var.f17366c != i10) {
            y1 y1Var2 = (y1) this.f17363g;
            synchronized (x0.l.f24717c) {
                fVarK = x0.l.k();
                ((y1) x0.l.o(y1Var2, this, fVarK, y1Var)).f17366c = i10;
            }
            x0.l.n(fVarK, this);
        }
    }

    public void o(long j) {
        x0.f fVarK;
        z1 z1Var = (z1) x0.l.i((z1) this.f17363g);
        if (z1Var.f17369c != j) {
            z1 z1Var2 = (z1) this.f17363g;
            synchronized (x0.l.f24717c) {
                fVarK = x0.l.k();
                ((z1) x0.l.o(z1Var2, this, fVarK, z1Var)).f17369c = j;
            }
            x0.l.n(fVarK, this);
        }
    }

    @Override // n0.x0
    public void setValue(Object obj) {
        switch (this.f17362d) {
            case 0:
                m(((Number) obj).floatValue());
                break;
            case 1:
                n(((Number) obj).intValue());
                break;
            default:
                o(((Number) obj).longValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f17362d) {
            case 0:
                return "MutableFloatState(value=" + ((w1) x0.l.i((w1) this.f17363g)).f17357c + ")@" + hashCode();
            case 1:
                return "MutableIntState(value=" + ((y1) x0.l.i((y1) this.f17363g)).f17366c + ")@" + hashCode();
            default:
                return "MutableLongState(value=" + ((z1) x0.l.i((z1) this.f17363g)).f17369c + ")@" + hashCode();
        }
    }
}
