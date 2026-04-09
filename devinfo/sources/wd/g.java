package wd;

import androidx.lifecycle.f1;
import de.q;
import java.util.concurrent.Executor;
import nk.k;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements de.d {

    /* renamed from: b, reason: collision with root package name */
    public static final g f36622b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f36623c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f36624d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f36625e = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36626a;

    public /* synthetic */ g(int i4) {
        this.f36626a = i4;
    }

    @Override // de.d
    public final Object c(f1 f1Var) {
        switch (this.f36626a) {
            case 0:
                Object objL = f1Var.l(new q(ce.a.class, Executor.class));
                k.d(objL, "get(...)");
                return x.l((Executor) objL);
            case 1:
                Object objL2 = f1Var.l(new q(ce.c.class, Executor.class));
                k.d(objL2, "get(...)");
                return x.l((Executor) objL2);
            case 2:
                Object objL3 = f1Var.l(new q(ce.b.class, Executor.class));
                k.d(objL3, "get(...)");
                return x.l((Executor) objL3);
            default:
                Object objL4 = f1Var.l(new q(ce.d.class, Executor.class));
                k.d(objL4, "get(...)");
                return x.l((Executor) objL4);
        }
    }
}
