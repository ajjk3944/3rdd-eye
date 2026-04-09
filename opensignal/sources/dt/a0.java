package dt;

import h7.h0;
import ls.q0;
import p.v2;

/* loaded from: classes.dex */
public final class a0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7476d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v2 f7477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(v2 v2Var, int i10) {
        super(1);
        this.f7476d = i10;
        this.f7477g = v2Var;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f7476d) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                al.b bVar = (al.b) this.f7477g.f20201d;
                ns.f fVar = (ns.f) bVar.f811c;
                k kVar = (k) bVar.f810b;
                qs.b bVarT = io.sentry.config.a.T(fVar, iIntValue);
                return bVarT.f21023c ? kVar.b(bVarT) : rr.w.e(kVar.f7494b, bVarT);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                al.b bVar2 = (al.b) this.f7477g.f20201d;
                qs.b bVarT2 = io.sentry.config.a.T((ns.f) bVar2.f811c, iIntValue2);
                if (!bVarT2.f21023c) {
                    rr.a0 a0Var = ((k) bVar2.f810b).f7494b;
                    br.l.e(a0Var, "<this>");
                    rr.i iVarE = rr.w.e(a0Var, bVarT2);
                    if (iVarE instanceof ft.u) {
                        return (ft.u) iVarE;
                    }
                }
                return null;
            default:
                q0 q0Var = (q0) obj;
                br.l.e(q0Var, "it");
                return ba.m.H(q0Var, (h0) ((al.b) this.f7477g.f20201d).f813e);
        }
    }
}
