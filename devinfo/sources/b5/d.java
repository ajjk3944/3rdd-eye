package b5;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f1764c;

    public /* synthetic */ d(n nVar, g1 g1Var, int i4) {
        this.f1762a = i4;
        this.f1763b = nVar;
        this.f1764c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1762a) {
            case 0:
                n nVar = this.f1763b;
                nk.k.e(nVar, "this$0");
                g1 g1Var = this.f1764c;
                nk.k.e(g1Var, "$operation");
                nVar.a(g1Var);
                break;
            case 1:
                n nVar2 = this.f1763b;
                ArrayList arrayList = nVar2.f1838b;
                g1 g1Var2 = this.f1764c;
                if (arrayList.contains(g1Var2)) {
                    int i4 = g1Var2.f1799a;
                    View view = g1Var2.f1801c.H;
                    nk.k.d(view, "operation.fragment.mView");
                    a0.g.d(i4, view, nVar2.f1837a);
                    break;
                }
                break;
            default:
                n nVar3 = this.f1763b;
                ArrayList arrayList2 = nVar3.f1838b;
                g1 g1Var3 = this.f1764c;
                arrayList2.remove(g1Var3);
                nVar3.f1839c.remove(g1Var3);
                break;
        }
    }
}
