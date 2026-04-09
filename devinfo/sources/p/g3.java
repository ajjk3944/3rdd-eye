package p;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f30703b;

    public /* synthetic */ g3(Toolbar toolbar, int i4) {
        this.f30702a = i4;
        this.f30703b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30702a) {
            case 0:
                i3 i3Var = this.f30703b.M;
                o.o oVar = i3Var == null ? null : i3Var.f30717b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f30703b.m();
                break;
        }
    }
}
