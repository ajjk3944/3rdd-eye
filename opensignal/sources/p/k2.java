package p;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20091a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f20092d;

    public /* synthetic */ k2(Toolbar toolbar, int i10) {
        this.f20091a = i10;
        this.f20092d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20091a) {
            case 0:
                n2 n2Var = this.f20092d.f1025l0;
                o.o oVar = n2Var == null ? null : n2Var.f20121d;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f20092d.m();
                break;
        }
    }
}
