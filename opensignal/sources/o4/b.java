package o4;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18776a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f18777d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0 f18778g;

    public /* synthetic */ b(k kVar, s0 s0Var, int i10) {
        this.f18776a = i10;
        this.f18777d = kVar;
        this.f18778g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18776a) {
            case 0:
                k kVar = this.f18777d;
                br.l.e(kVar, "this$0");
                s0 s0Var = this.f18778g;
                br.l.e(s0Var, "$operation");
                kVar.a(s0Var);
                break;
            case 1:
                k kVar2 = this.f18777d;
                ArrayList arrayList = kVar2.f18807b;
                s0 s0Var2 = this.f18778g;
                if (arrayList.contains(s0Var2)) {
                    w0 w0Var = s0Var2.f18850a;
                    View view = s0Var2.f18852c.f1413e0;
                    br.l.d(view, "operation.fragment.mView");
                    w0Var.applyState(view, kVar2.f18806a);
                    break;
                }
                break;
            default:
                k kVar3 = this.f18777d;
                ArrayList arrayList2 = kVar3.f18807b;
                s0 s0Var3 = this.f18778g;
                arrayList2.remove(s0Var3);
                kVar3.f18808c.remove(s0Var3);
                break;
        }
    }
}
