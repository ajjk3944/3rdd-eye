package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class a extends y1 implements r1, c9.c, j0 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.coroutines.d f22216c;

    public a(kotlin.coroutines.d dVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            n0((r1) dVar.get(r1.H8));
        }
        this.f22216c = dVar.plus(this);
    }

    @Override // kotlinx.coroutines.y1
    public final void A0(Object obj) {
        if (!(obj instanceof c0)) {
            S0(obj);
        } else {
            c0 c0Var = (c0) obj;
            R0(c0Var.f22236a, c0Var.a());
        }
    }

    public void Q0(Object obj) {
        H(obj);
    }

    @Override // kotlinx.coroutines.y1
    public String R() {
        return l0.a(this) + " was cancelled";
    }

    public void R0(Throwable th, boolean z10) {
    }

    public void S0(Object obj) {
    }

    public final void T0(CoroutineStart coroutineStart, Object obj, l9.p pVar) {
        coroutineStart.f(pVar, obj, this);
    }

    @Override // c9.c
    public final kotlin.coroutines.d getContext() {
        return this.f22216c;
    }

    @Override // kotlinx.coroutines.j0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f22216c;
    }

    @Override // kotlinx.coroutines.y1, kotlinx.coroutines.r1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.y1
    public final void m0(Throwable th) {
        h0.a(this.f22216c, th);
    }

    @Override // c9.c
    public final void resumeWith(Object obj) {
        Object objT0 = t0(f0.d(obj, null, 1, null));
        if (objT0 == z1.f22720b) {
            return;
        }
        Q0(objT0);
    }

    @Override // kotlinx.coroutines.y1
    public String v0() {
        String strB = CoroutineContextKt.b(this.f22216c);
        if (strB == null) {
            return super.v0();
        }
        return '\"' + strB + "\":" + super.v0();
    }
}
