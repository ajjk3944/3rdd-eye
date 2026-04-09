package dt;

import ls.q0;
import rr.o0;

/* loaded from: classes.dex */
public final class c0 extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f7479g = new c0(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7480d = 0;

    public /* synthetic */ c0(int i10) {
        super(i10);
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f7480d) {
            case 0:
                q0 q0Var = (q0) obj;
                br.l.e(q0Var, "it");
                return Integer.valueOf(q0Var.f15860r.size());
            default:
                br.l.e((qs.b) obj, "it");
                return o0.f21696s;
        }
    }

    public c0(et.c cVar) {
        super(1);
    }
}
