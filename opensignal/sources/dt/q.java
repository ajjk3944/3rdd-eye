package dt;

import java.io.Serializable;
import java.util.List;
import ls.g0;

/* loaded from: classes.dex */
public final class q extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7525d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7526g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7527r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Serializable f7528x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, boolean z10, g0 g0Var) {
        super(0);
        this.f7527r = tVar;
        this.f7526g = z10;
        this.f7528x = g0Var;
    }

    @Override // ar.a
    public final Object c() {
        List listQ0;
        switch (this.f7525d) {
            case 0:
                t tVar = (t) this.f7527r;
                al.b bVar = tVar.f7538a;
                k kVar = (k) bVar.f810b;
                w wVarA = tVar.a((rr.l) bVar.f812d);
                if (wVarA != null) {
                    boolean z10 = this.f7526g;
                    g0 g0Var = (g0) this.f7528x;
                    listQ0 = z10 ? mq.o.Q0(kVar.f7497e.j(wVarA, g0Var)) : mq.o.Q0(kVar.f7497e.o(wVarA, g0Var));
                } else {
                    listQ0 = null;
                }
                return listQ0 == null ? mq.w.f16945a : listQ0;
            default:
                if (this.f7526g) {
                    io.sentry.t tVar2 = (io.sentry.t) this.f7527r;
                    String str = (String) this.f7528x;
                    n7.b bVar2 = (n7.b) tVar2.f12736a;
                    synchronized (bVar2.f17390c) {
                    }
                }
                return lq.b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z10, io.sentry.t tVar, String str) {
        super(0);
        this.f7526g = z10;
        this.f7527r = tVar;
        this.f7528x = str;
    }
}
