package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f26950b;

    public /* synthetic */ q0(t0 t0Var, int i4) {
        this.f26949a = i4;
        this.f26950b = t0Var;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f26949a) {
            case 0:
                i0.j jVar = (i0.j) this.f26950b.f26978o.invoke();
                int iC = jVar.c();
                int i4 = 0;
                while (true) {
                    if (i4 >= iC) {
                        i4 = -1;
                    } else if (!jVar.d(i4).equals(obj)) {
                        i4++;
                    }
                }
                return Integer.valueOf(i4);
            default:
                int iIntValue = ((Integer) obj).intValue();
                t0 t0Var = this.f26950b;
                i0.j jVar2 = (i0.j) t0Var.f26978o.invoke();
                if (iIntValue < 0 || iIntValue >= jVar2.c()) {
                    StringBuilder sbW = je.u.w(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbW.append(jVar2.c());
                    sbW.append(')');
                    f0.a.a(sbW.toString());
                }
                xk.x.v(t0Var.b0(), null, null, new s0(t0Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
