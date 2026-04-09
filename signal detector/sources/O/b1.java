package o;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f22484b;

    public /* synthetic */ b1(Toolbar toolbar, int i) {
        this.f22483a = i;
        this.f22484b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22483a) {
            case 0:
                d1 d1Var = this.f22484b.f5011d0;
                n.m mVar = d1Var == null ? null : d1Var.f22503b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f22484b.m();
                break;
        }
    }
}
