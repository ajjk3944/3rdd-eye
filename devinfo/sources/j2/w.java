package j2;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f27332b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i4) {
        super(1);
        this.f27331a = i4;
        this.f27332b = xVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f27331a) {
            case 0:
                x xVar = this.f27332b;
                return Boolean.valueOf(xVar.f27336d.getParent().requestSendAccessibilityEvent(xVar.f27336d, (AccessibilityEvent) obj));
            default:
                r1 r1Var = (r1) obj;
                if (r1Var.f27304b.contains(r1Var)) {
                    x xVar2 = this.f27332b;
                    i2.o1 snapshotObserver = xVar2.f27336d.getSnapshotObserver();
                    snapshotObserver.f25732a.b(r1Var, xVar2.N, new c2.c(10, r1Var, xVar2));
                }
                return yj.u.f37649a;
        }
    }
}
