package g3;

import android.view.WindowInsets;
import e4.c2;
import e4.v0;
import i2.e0;
import i2.m1;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f24460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f24461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(x xVar, e0 e0Var, int i4) {
        super(1);
        this.f24459a = i4;
        this.f24460b = xVar;
        this.f24461c = e0Var;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsG;
        switch (this.f24459a) {
            case 0:
                m1 m1Var = (m1) obj;
                j2.r rVar = m1Var instanceof j2.r ? (j2.r) m1Var : null;
                x xVar = this.f24460b;
                if (rVar != null) {
                    HashMap<j, e0> holderToLayoutNode = rVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    e0 e0Var = this.f24461c;
                    holderToLayoutNode.put(xVar, e0Var);
                    rVar.getAndroidViewsHandler$ui().addView(xVar);
                    rVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(e0Var, xVar);
                    xVar.setImportantForAccessibility(1);
                    v0.o(xVar, new j2.l(rVar, e0Var, rVar));
                }
                if (xVar.getView().getParent() != xVar) {
                    xVar.addView(xVar.getView());
                }
                break;
            case 1:
                k.c(this.f24460b, this.f24461c);
                break;
            default:
                e0 e0Var2 = this.f24461c;
                x xVar2 = this.f24460b;
                k.c(xVar2, e0Var2);
                ((j2.r) xVar2.f24480c).G = true;
                int[] iArr = xVar2.f24489n;
                int i4 = iArr[0];
                int i10 = iArr[1];
                xVar2.getView().getLocationOnScreen(iArr);
                long j = xVar2.f24490o;
                long jM = ((g2.v) obj).m();
                xVar2.f24490o = jM;
                c2 c2Var = xVar2.f24491p;
                if (c2Var != null && ((i4 != iArr[0] || i10 != iArr[1] || !d3.k.a(j, jM)) && (windowInsetsG = xVar2.n(c2Var).g()) != null)) {
                    xVar2.getView().dispatchApplyWindowInsets(windowInsetsG);
                }
                break;
        }
        return yj.u.f37649a;
    }
}
