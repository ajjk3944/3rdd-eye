package xe;

import P7.a;
import android.os.Bundle;
import f2.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class v0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    private final P7.a f66022a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f66023b;

    public v0(P7.a analytics) {
        AbstractC6492s.i(analytics, "analytics");
        this.f66022a = analytics;
        this.f66023b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(v0 v0Var, f2.n nVar, f2.r destination, Bundle bundle) {
        P7.b bVar;
        AbstractC6492s.i(nVar, "<unused var>");
        AbstractC6492s.i(destination, "destination");
        String strW = destination.w();
        if (strW == null || (bVar = (P7.b) v0Var.f66023b.get(strW)) == null) {
            return;
        }
        v0Var.a(bVar);
    }

    @Override // xe.r0
    public void a(P7.b screen) {
        AbstractC6492s.i(screen, "screen");
        Z7.b.h("Analytics screen: " + screen, null, 2, null);
        a.C0633a.a(this.f66022a, screen, null, 2, null);
    }

    @Override // xe.r0
    public void b(Ae.p destination) {
        AbstractC6492s.i(destination, "destination");
        P7.b bVarE = t0.e(destination);
        if (bVarE != null) {
            this.f66023b.put(destination.a(), bVarE);
        }
    }

    public void d(f2.n navController) {
        AbstractC6492s.i(navController, "navController");
        navController.r(new n.c() { // from class: xe.u0
            @Override // f2.n.c
            public final void a(f2.n nVar, f2.r rVar, Bundle bundle) {
                v0.e(this.f66018a, nVar, rVar, bundle);
            }
        });
    }
}
