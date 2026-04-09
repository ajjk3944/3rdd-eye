package c2;

import android.view.MotionEvent;
import i2.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g3.x f2584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g3.x xVar, int i4) {
        super(1);
        this.f2583a = i4;
        this.f2584b = xVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f2583a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                g3.x xVar = this.f2584b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = xVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = xVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                break;
            case 1:
                m1 m1Var = (m1) obj;
                j2.r rVar = m1Var instanceof j2.r ? (j2.r) m1Var : null;
                g3.x xVar2 = this.f2584b;
                if (rVar != null) {
                    rVar.getAndroidViewsHandler$ui().removeViewInLayout(xVar2);
                    nk.x.c(rVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(rVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(xVar2));
                    xVar2.setImportantForAccessibility(0);
                }
                xVar2.removeAllViewsInLayout();
                break;
            default:
                this.f2584b.f24492q = (mk.c) obj;
                break;
        }
        return yj.u.f37649a;
    }
}
