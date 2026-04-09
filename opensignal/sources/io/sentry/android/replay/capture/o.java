package io.sentry.android.replay.capture;

import lq.b0;

/* loaded from: classes.dex */
public final class o extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11897d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(1);
        this.f11897d = i10;
        this.f11898g = pVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f11897d) {
            case 0:
                l lVar = (l) obj;
                br.l.e(lVar, "segment");
                if (lVar instanceof j) {
                    j jVar = (j) lVar;
                    p pVar = this.f11898g;
                    j.a(jVar, pVar.f11900s);
                    pVar.k(pVar.i() + 1);
                    pVar.m(jVar.f11890a.Q);
                }
                break;
            default:
                l lVar2 = (l) obj;
                br.l.e(lVar2, "segment");
                if (lVar2 instanceof j) {
                    p pVar2 = this.f11898g;
                    j.a((j) lVar2, pVar2.f11900s);
                    pVar2.k(pVar2.i() + 1);
                }
                break;
        }
        return b0.f15562a;
    }
}
