package h;

import R.O;
import R.S;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f20355b;

    public /* synthetic */ l(v vVar, int i) {
        this.f20354a = i;
        this.f20355b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f20354a) {
            case 0:
                v vVar = this.f20355b;
                if ((vVar.f20425n0 & 1) != 0) {
                    vVar.A(0);
                }
                if ((vVar.f20425n0 & 4096) != 0) {
                    vVar.A(108);
                }
                vVar.f20423m0 = false;
                vVar.f20425n0 = 0;
                break;
            default:
                v vVar2 = this.f20355b;
                vVar2.f20393K.showAtLocation(vVar2.f20392J, 55, 0, 0);
                S s5 = vVar2.M;
                if (s5 != null) {
                    s5.b();
                }
                if (!vVar2.f20395N || (viewGroup = vVar2.f20396O) == null || !viewGroup.isLaidOut()) {
                    vVar2.f20392J.setAlpha(1.0f);
                    vVar2.f20392J.setVisibility(0);
                    break;
                } else {
                    vVar2.f20392J.setAlpha(0.0f);
                    S sA = O.a(vVar2.f20392J);
                    sA.a(1.0f);
                    vVar2.M = sA;
                    sA.d(new n(0, this));
                    break;
                }
                break;
        }
    }
}
