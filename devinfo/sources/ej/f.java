package ej;

import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import b5.z;
import com.liuzho.lib.appinfo.NewInstalledAppAnalyzeActivity;
import java.util.ArrayList;
import sh.t0;
import sh.x0;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23499f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f23500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, z zVar) {
        super(1);
        this.f23499f = i4;
        this.f23500h = zVar;
    }

    @Override // pi.e, cm.g
    public void A() {
        int i4 = this.f23499f;
        Object obj = this.f23500h;
        switch (i4) {
            case 0:
                if (h0()) {
                    p6.i iVar = (p6.i) jm.a.f27720a.f1137e;
                    ((i) obj).U();
                    iVar.getClass();
                    int i10 = ah.b.f372a;
                    boolean z3 = mg.d.f29372a;
                    break;
                }
                break;
            case 1:
                ph.e eVar = (ph.e) obj;
                if (!eVar.c0()) {
                    eVar.k0();
                    break;
                }
                break;
            case 2:
                x0 x0Var = (x0) obj;
                if (!x0Var.c0()) {
                    x0Var.i0();
                    x0Var.W();
                    int i11 = ah.b.f372a;
                    boolean z10 = mg.d.f29372a;
                    break;
                }
                break;
            default:
                super.A();
                break;
        }
    }

    @Override // pi.e, cm.g
    public void B(String str) {
        switch (this.f23499f) {
            case 1:
                pk.a.r("ad_sensor_detail", str);
                break;
            case 2:
                pk.a.r("ad_tab_test", str);
                break;
            case 3:
                a4.d dVar = a.a.f3c;
                CardView cardView = ((NewInstalledAppAnalyzeActivity) this.f23500h).D;
                dVar.getClass();
                break;
            default:
                super.B(str);
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void D(n.a aVar) {
        FrameLayout.LayoutParams layoutParams;
        switch (this.f23499f) {
            case 0:
                i iVar = (i) this.f23500h;
                if (i0.l(iVar.n()) || iVar.C || !((p6.i) jm.a.f27720a.f1137e).B()) {
                    aVar.b();
                    return;
                }
                n.a aVar2 = iVar.f23509e0;
                if (aVar2 != aVar && aVar2 != null) {
                    aVar2.b();
                }
                iVar.f23509e0 = aVar;
                if (iVar.f23508d0 == null) {
                    return;
                }
                ArrayList arrayList = iVar.c0().f28363c;
                nk.k.d(arrayList, "getAnalyzeResultItemList(...)");
                int size = arrayList.size();
                int i4 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (((kj.h) obj).f28371d != 4) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                if (i4 < 0 || i4 >= iVar.c0().f28363c.size()) {
                    return;
                }
                e eVar = iVar.f23507c0;
                if (eVar != null) {
                    eVar.notifyItemChanged(i4);
                    return;
                } else {
                    nk.k.k("mAdapter");
                    throw null;
                }
            case 1:
                ph.e eVar2 = (ph.e) this.f23500h;
                if (eVar2.c0()) {
                    aVar.b();
                    return;
                }
                n.a aVar3 = eVar2.f31979a0;
                if (aVar3 != null) {
                    aVar3.b();
                }
                eVar2.f31979a0 = aVar;
                View viewA = aVar.a();
                nk.k.d(viewA, "adView(...)");
                qg.e eVar3 = eVar2.f31980b0;
                if (eVar3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((CardView) eVar3.f32346c).removeAllViews();
                if (viewA.getLayoutParams() != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewA.getLayoutParams());
                    layoutParams2.gravity = 17;
                    viewA.setLayoutParams(layoutParams2);
                    qg.e eVar4 = eVar2.f31980b0;
                    if (eVar4 == null) {
                        nk.k.k("binding");
                        throw null;
                    }
                    ((CardView) eVar4.f32346c).addView(viewA);
                } else {
                    qg.e eVar5 = eVar2.f31980b0;
                    if (eVar5 == null) {
                        nk.k.k("binding");
                        throw null;
                    }
                    ((CardView) eVar5.f32346c).addView(viewA, new FrameLayout.LayoutParams(-2, -2, 17));
                }
                qg.e eVar6 = eVar2.f31980b0;
                if (eVar6 != null) {
                    ((CardView) eVar6.f32346c).setVisibility(0);
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
            case 2:
                x0 x0Var = (x0) this.f23500h;
                ArrayList arrayList2 = x0Var.f33783b0;
                if (x0Var.c0()) {
                    aVar.b();
                    return;
                }
                n.a aVar4 = x0Var.f33788g0;
                if (aVar4 != null && aVar4 != aVar) {
                    aVar4.b();
                }
                x0Var.f33788g0 = aVar;
                x0Var.f33785d0 = aVar.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        i11 = -1;
                    } else if (!(arrayList2.get(i11) instanceof t0)) {
                        i11++;
                    }
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                x0Var.f33786e0.notifyItemChanged(i11);
                return;
            default:
                NewInstalledAppAnalyzeActivity newInstalledAppAnalyzeActivity = (NewInstalledAppAnalyzeActivity) this.f23500h;
                if (!i0.l(newInstalledAppAnalyzeActivity)) {
                    a.a.f3c.getClass();
                    if (!com.liuzh.deviceinfo.utilities.f.g()) {
                        n.a aVar5 = newInstalledAppAnalyzeActivity.E;
                        if (aVar5 != null && aVar5 != aVar) {
                            aVar5.b();
                        }
                        newInstalledAppAnalyzeActivity.E = aVar;
                        newInstalledAppAnalyzeActivity.D.removeAllViews();
                        newInstalledAppAnalyzeActivity.D.setVisibility(0);
                        View viewA2 = newInstalledAppAnalyzeActivity.E.a();
                        if (viewA2.getLayoutParams() != null) {
                            layoutParams = new FrameLayout.LayoutParams(viewA2.getLayoutParams());
                            layoutParams.gravity = 17;
                        } else {
                            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
                        }
                        newInstalledAppAnalyzeActivity.D.addView(viewA2, layoutParams);
                        return;
                    }
                }
                aVar.b();
                return;
        }
    }

    public boolean h0() {
        i iVar = (i) this.f23500h;
        if (!i0.l(iVar.n())) {
            ArrayList arrayList = iVar.c0().f28363c;
            nk.k.d(arrayList, "getAnalyzeResultItemList(...)");
            int size = arrayList.size();
            int i4 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i4 = -1;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                if (((kj.h) obj).f28371d == 4) {
                    break;
                }
                i4++;
            }
            if (i4 >= 0) {
                ArrayList arrayList2 = iVar.c0().f28363c;
                if (i4 < (arrayList2 != null ? arrayList2.size() : 0)) {
                    iVar.f23513i0 = true;
                    n.a aVar = iVar.f23509e0;
                    if (aVar != null) {
                        aVar.b();
                    }
                    iVar.f23509e0 = null;
                    e eVar = iVar.f23507c0;
                    if (eVar != null) {
                        eVar.notifyItemChanged(i4);
                        return true;
                    }
                    nk.k.k("mAdapter");
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // pi.e, cm.g
    public final void w() {
        switch (this.f23499f) {
            case 0:
                int i4 = this.g + 1;
                this.g = i4;
                ((p6.i) jm.a.f27720a.f1137e).getClass();
                if (i4 >= 3) {
                    h0();
                    break;
                }
                break;
            case 1:
                int i10 = this.g + 1;
                this.g = i10;
                if (i10 > 3) {
                    ((ph.e) this.f23500h).k0();
                    break;
                }
                break;
            case 2:
                int i11 = this.g + 1;
                this.g = i11;
                if (i11 > 3) {
                    ((x0) this.f23500h).i0();
                    break;
                }
                break;
            default:
                NewInstalledAppAnalyzeActivity newInstalledAppAnalyzeActivity = (NewInstalledAppAnalyzeActivity) this.f23500h;
                int i12 = this.g + 1;
                this.g = i12;
                if (i12 > 3) {
                    newInstalledAppAnalyzeActivity.D.removeAllViews();
                    newInstalledAppAnalyzeActivity.D.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f23499f) {
            case 0:
                ((p6.i) jm.a.f27720a.f1137e).getClass();
                cg.a.f2848b.d(bVar);
                break;
            case 1:
                cg.a.f2848b.d(bVar);
                break;
            case 2:
                cg.a.f2848b.d(bVar);
                break;
            default:
                a.a.f3c.getClass();
                cg.a.f2848b.d(bVar);
                break;
        }
    }

    @Override // pi.e, cm.g
    public void y() {
        switch (this.f23499f) {
            case 1:
                cg.a.f2848b.f(r5.c.g("action", "show"), "ad_sensor_detail");
                break;
            case 2:
                cg.a.f2848b.f(r5.c.g("action", "show"), "ad_tab_test");
                break;
            default:
                super.y();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, Object obj) {
        super(1);
        this.f23499f = i4;
        this.f23500h = obj;
        this.g = 0;
    }
}
