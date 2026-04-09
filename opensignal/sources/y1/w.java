package y1;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class w extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25788d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f25789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i10) {
        super(1);
        this.f25788d = i10;
        this.f25789g = xVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f25788d) {
            case 0:
                x xVar = this.f25789g;
                return Boolean.valueOf(xVar.f25792d.getParent().requestSendAccessibilityEvent(xVar.f25792d, (AccessibilityEvent) obj));
            default:
                p1 p1Var = (p1) obj;
                if (p1Var.f25762c.contains(p1Var)) {
                    x xVar2 = this.f25789g;
                    xVar2.f25792d.getSnapshotObserver().a(p1Var, xVar2.M, new pp.c(p1Var, xVar2));
                }
                return lq.b0.f15562a;
        }
    }
}
