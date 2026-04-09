package se;

import bf.u;
import br.l;
import h9.r2;
import java.util.concurrent.Executor;
import wt.m0;

/* loaded from: classes.dex */
public final class g implements bf.f {

    /* renamed from: d, reason: collision with root package name */
    public static final g f22016d = new g(0);

    /* renamed from: g, reason: collision with root package name */
    public static final g f22017g = new g(1);

    /* renamed from: r, reason: collision with root package name */
    public static final g f22018r = new g(2);

    /* renamed from: x, reason: collision with root package name */
    public static final g f22019x = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22020a;

    public /* synthetic */ g(int i10) {
        this.f22020a = i10;
    }

    @Override // bf.f
    public final Object f(r2 r2Var) {
        switch (this.f22020a) {
            case 0:
                Object objI = r2Var.i(new u(ye.a.class, Executor.class));
                l.d(objI, "get(...)");
                return new m0((Executor) objI);
            case 1:
                Object objI2 = r2Var.i(new u(ye.c.class, Executor.class));
                l.d(objI2, "get(...)");
                return new m0((Executor) objI2);
            case 2:
                Object objI3 = r2Var.i(new u(ye.b.class, Executor.class));
                l.d(objI3, "get(...)");
                return new m0((Executor) objI3);
            default:
                Object objI4 = r2Var.i(new u(ye.d.class, Executor.class));
                l.d(objI4, "get(...)");
                return new m0((Executor) objI4);
        }
    }
}
