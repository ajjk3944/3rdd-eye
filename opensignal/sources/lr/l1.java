package lr;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class l1 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15634d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1 f15635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(m1 m1Var, int i10) {
        super(0);
        this.f15634d = i10;
        this.f15635g = m1Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15634d) {
            case 0:
                r1 r1Var = this.f15635g.f15645d;
                Type type = r1Var != null ? (Type) r1Var.c() : null;
                br.l.b(type);
                return xr.d.c(type);
            default:
                m1 m1Var = this.f15635g;
                return m1Var.a(m1Var.f15644a);
        }
    }
}
