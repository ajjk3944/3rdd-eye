package b5;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public u0 f1843a;

    @Override // f.b
    public void k(Object obj) {
        f.a aVar = (f.a) obj;
        u0 u0Var = this.f1843a;
        p0 p0Var = (p0) u0Var.G.pollLast();
        if (p0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = p0Var.f1849a;
        int i4 = p0Var.f1850b;
        z zVarX = u0Var.f1879c.x(str);
        if (zVarX != null) {
            zVarX.D(i4, aVar.f23581a, aVar.f23582b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }
}
