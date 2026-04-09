package C;

import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.x0;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import v.C5664t;
import v.RunnableC5662q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class F implements H0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f627b;

    public /* synthetic */ F(Object obj, int i) {
        this.f626a = i;
        this.f627b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.impl.H0.d
    public final void a(H0 h02, H0.g gVar) {
        switch (this.f626a) {
            case 0:
                G g10 = (G) this.f627b;
                if (g10.b() == null) {
                    return;
                }
                G.n.a();
                H0.c cVar = g10.f631r;
                if (cVar != null) {
                    cVar.b();
                    g10.f631r = null;
                }
                i0 i0Var = g10.f630q;
                if (i0Var == null) {
                    throw null;
                }
                i0Var.a();
                g10.f630q = null;
                throw null;
            case 1:
                W w10 = (W) this.f627b;
                if (w10.b() == null) {
                    return;
                }
                w10.E((x0) w10.f753f, w10.f754g);
                w10.o();
                return;
            default:
                v.k0 k0Var = (v.k0) this.f627b;
                k0Var.f46727b = k0Var.a();
                B.f fVar = k0Var.f46730e;
                if (fVar != null) {
                    C5664t c5664t = (C5664t) fVar.f317c;
                    c5664t.getClass();
                    try {
                        if (((Boolean) o0.b.a(new B8.b(c5664t, 13)).f44804c.get()).booleanValue()) {
                            v.k0 k0Var2 = c5664t.f46894y;
                            H0 h03 = k0Var2.f46727b;
                            c5664t.f46874d.execute(new RunnableC5662q(c5664t, C5664t.x(k0Var2), h03, k0Var2.f46728c, null, Collections.singletonList(U0.b.METERING_REPEATING), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e4) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e4);
                    }
                }
                return;
        }
    }
}
