package io.sentry.android.replay.capture;

import lq.b0;

/* loaded from: classes.dex */
public final class f extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11883d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f11884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f11883d = i10;
        this.f11884g = gVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f11883d) {
            case 0:
                l lVar = (l) obj;
                br.l.e(lVar, "segment");
                if (lVar instanceof j) {
                    g gVar = this.f11884g;
                    gVar.f11889v.add(lVar);
                    gVar.k(gVar.i() + 1);
                }
                break;
            default:
                l lVar2 = (l) obj;
                br.l.e(lVar2, "segment");
                if (lVar2 instanceof j) {
                    g gVar2 = this.f11884g;
                    gVar2.f11889v.add(lVar2);
                    gVar2.k(gVar2.i() + 1);
                }
                break;
        }
        return b0.f15562a;
    }
}
