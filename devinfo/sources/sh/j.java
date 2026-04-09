package sh;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.liuzho.lib.appinfo.AppInfoActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33695f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f33696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f33697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i4, Object obj, Object obj2) {
        super(1);
        this.f33695f = i4;
        this.f33697i = obj;
        this.f33696h = obj2;
        this.g = 0;
    }

    @Override // pi.e, cm.g
    public final void A() {
        int i4 = this.f33695f;
        Object obj = this.f33697i;
        switch (i4) {
            case 0:
                l lVar = (l) obj;
                if (!lVar.c0()) {
                    lVar.i0();
                    lVar.W();
                    int i10 = ah.b.f372a;
                    boolean z3 = mg.d.f29372a;
                    break;
                }
                break;
            case 1:
                int i11 = AppInfoActivity.I;
                a.a.f3c.getClass();
                int i12 = ah.b.f372a;
                boolean z10 = mg.d.f29372a;
                ((AppInfoActivity) obj).A();
                break;
            default:
                j0();
                ((o7.d) this.f33696h).getClass();
                int i13 = ah.b.f372a;
                boolean z11 = mg.d.f29372a;
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void B(String str) {
        switch (this.f33695f) {
            case 0:
                pd.b.g((CardView) this.f33696h);
                pk.a.r("ad_tab_dashboard", str);
                if (!((l) this.f33697i).c0()) {
                    bi.d.b(new ig.l(16, this));
                    break;
                }
                break;
            case 1:
                break;
            default:
                ((o7.d) this.f33696h).getClass();
                nk.k.e(str, "errorMsg");
                pk.a.r("ad_app_ana", str);
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void D(n.a aVar) {
        int i4 = this.f33695f;
        Object obj = this.f33696h;
        Object obj2 = this.f33697i;
        switch (i4) {
            case 0:
                CardView cardView = (CardView) obj;
                l lVar = (l) obj2;
                if (!lVar.c0()) {
                    com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                    if (!com.liuzh.deviceinfo.utilities.f.g()) {
                        n.a aVar2 = lVar.f33725i0;
                        if (aVar2 != null && aVar2 != aVar) {
                            aVar2.b();
                        }
                        lVar.f33725i0 = aVar;
                        cardView.setVisibility(0);
                        cardView.removeAllViews();
                        View viewA = aVar.a();
                        cardView.addView(viewA);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewA.getLayoutParams();
                        layoutParams.gravity = 17;
                        viewA.setLayoutParams(layoutParams);
                        break;
                    } else {
                        aVar.b();
                        lVar.i0();
                        break;
                    }
                } else {
                    aVar.b();
                    break;
                }
            case 1:
                AppInfoActivity appInfoActivity = (AppInfoActivity) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.removeAllViews();
                a.a.f3c.getClass();
                if (!com.liuzh.deviceinfo.utilities.f.g() && !t6.i0.l(appInfoActivity)) {
                    n.a aVar3 = appInfoActivity.H;
                    if (aVar3 != null && aVar3 != aVar) {
                        aVar3.b();
                    }
                    appInfoActivity.H = aVar;
                    if (aVar.a().getLayoutParams() != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(aVar.a().getLayoutParams());
                        layoutParams2.gravity = 17;
                        viewGroup.addView(appInfoActivity.H.a(), layoutParams2);
                        break;
                    } else {
                        viewGroup.addView(appInfoActivity.H.a(), new FrameLayout.LayoutParams(-2, -2, 17));
                        break;
                    }
                } else {
                    aVar.b();
                    break;
                }
            default:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) obj2;
                int i10 = appsAnalyzeActivity.L;
                if (!t6.i0.l(appsAnalyzeActivity)) {
                    ((o7.d) obj).getClass();
                    if (!ah.o.f400d.c() && !com.liuzh.deviceinfo.utilities.f.g()) {
                        n.a aVar4 = appsAnalyzeActivity.K;
                        if (aVar4 != null && aVar4 != aVar) {
                            aVar4.b();
                        }
                        appsAnalyzeActivity.K = aVar;
                        km.o oVar = appsAnalyzeActivity.F;
                        if (oVar != null && !((ArrayList) oVar.f28445a).isEmpty()) {
                            ((ArrayList) appsAnalyzeActivity.F.f28445a).add(i10, new wj.g(appsAnalyzeActivity, -1));
                            appsAnalyzeActivity.D.notifyItemInserted(i10);
                            break;
                        }
                    }
                }
                aVar.b();
                break;
        }
    }

    public void j0() {
        AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) this.f33697i;
        km.o oVar = appsAnalyzeActivity.F;
        if (oVar == null || ((ArrayList) oVar.f28445a).isEmpty()) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= ((ArrayList) appsAnalyzeActivity.F.f28445a).size()) {
                i4 = -1;
                break;
            } else if (((wj.g) ((ArrayList) appsAnalyzeActivity.F.f28445a).get(i4)).f36779b == -1) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            ((ArrayList) appsAnalyzeActivity.F.f28445a).remove(i4);
            appsAnalyzeActivity.D.notifyItemRemoved(i4);
        }
    }

    @Override // pi.e, cm.g
    public final void w() {
        int i4 = this.f33695f;
        Object obj = this.f33697i;
        switch (i4) {
            case 0:
                int i10 = this.g + 1;
                this.g = i10;
                if (i10 > 3) {
                    ((l) obj).i0();
                    break;
                }
                break;
            case 1:
                int i11 = this.g + 1;
                this.g = i11;
                if (i11 > 3) {
                    int i12 = AppInfoActivity.I;
                    ((AppInfoActivity) obj).A();
                    break;
                }
                break;
            default:
                int i13 = this.g + 1;
                this.g = i13;
                nk.k.b(ii.a.f26002b);
                if (i13 >= 3) {
                    j0();
                    break;
                }
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f33695f) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            case 1:
                a.a.f3c.getClass();
                cg.a.f2848b.d(bVar);
                break;
            default:
                ((o7.d) this.f33696h).getClass();
                cg.a.f2848b.d(bVar);
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void y() {
        switch (this.f33695f) {
            case 0:
                cg.a.f2848b.f(r5.c.g("action", "show"), "ad_tab_dashboard");
                break;
            case 1:
                break;
            default:
                ((o7.d) this.f33696h).getClass();
                Bundle bundle = new Bundle();
                bundle.putString("action", "show");
                cg.a.f2848b.f(bundle, "ad_app_ana");
                break;
        }
    }

    private final void h0() {
    }

    private final void i0(String str) {
    }
}
