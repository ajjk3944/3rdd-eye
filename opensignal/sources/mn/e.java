package mn;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewpager.widget.ViewPager;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import ge.j;
import lf.t1;
import qk.i;
import qk.l;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16894a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabCoverage f16895d;

    public /* synthetic */ e(TabCoverage tabCoverage, int i10) {
        this.f16894a = i10;
        this.f16895d = tabCoverage;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws InterruptedException, Resources.NotFoundException {
        i.g gVar;
        switch (this.f16894a) {
            case 0:
                se.b.Y(this.f16895d.n(), i.dialog_operator_not_listed);
                break;
            case 1:
                this.f16895d.A0.dismiss();
                break;
            case 2:
                se.b.Y(this.f16895d.n(), i.dialog_network_rank_info);
                break;
            case 3:
                TabCoverage tabCoverage = this.f16895d;
                t1.e(tabCoverage.f6204y0, tabCoverage.D0, 1, null);
                break;
            case 4:
                TabCoverage tabCoverage2 = this.f16895d;
                ?? r12 = tabCoverage2.N0;
                qm.f fVar = (qm.f) tabCoverage2.M0.getValue();
                Context contextN = tabCoverage2.n();
                fVar.getClass();
                if (!qm.f.a(contextN)) {
                    tabCoverage2.i0();
                    break;
                } else if (u.e(tabCoverage2.n()) && ((gVar = tabCoverage2.A0) == null || !gVar.isShowing())) {
                    ((com.staircase3.opensignal.utils.a) r12.getValue()).c("tab_coverage", "show_network_rank", "zoom" + tabCoverage2.G0);
                    View viewInflate = LayoutInflater.from(tabCoverage2.n()).inflate(i.dialog_network_rank, (ViewGroup) null, false);
                    tabCoverage2.B0 = (ViewPager) viewInflate.findViewById(qk.h.viewPager);
                    tabCoverage2.B0.setAdapter(new sk.h(tabCoverage2.n(), (com.staircase3.opensignal.utils.a) r12.getValue(), null, tabCoverage2.k0()));
                    LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(qk.h.layoutCirclePageIndicator);
                    new zk.a(tabCoverage2.X(), (com.staircase3.opensignal.utils.a) r12.getValue(), linearLayout, tabCoverage2.B0, qk.f.circle_indicator);
                    if (linearLayout != null) {
                        int i10 = 0;
                        while (i10 < linearLayout.getChildCount()) {
                            linearLayout.getChildAt(i10).setSelected(i10 == 0);
                            i10++;
                        }
                    }
                    tabCoverage2.C0 = (ProgressBar) viewInflate.findViewById(qk.h.pbLoadingNetworkRank);
                    i.g gVarCreate = new i.f(tabCoverage2.n()).setView(viewInflate).create();
                    tabCoverage2.A0 = gVarCreate;
                    gVarCreate.show();
                    ((Button) viewInflate.findViewById(qk.h.btOperatorNotListed)).setOnClickListener(new e(tabCoverage2, 0));
                    se.b.S(tabCoverage2.A0, tabCoverage2.l(), 0.9f);
                    viewInflate.findViewById(qk.h.vCloseNetworkRank).setOnClickListener(new e(tabCoverage2, 1));
                    viewInflate.findViewById(qk.h.vShowNetworkRankInfo).setOnClickListener(new e(tabCoverage2, 2));
                    if ((tabCoverage2.E0 == null || tabCoverage2.F0 == null) && !tabCoverage2.p0()) {
                        se.b.a0(tabCoverage2.n(), tabCoverage2.n().getString(l.cannot_refresh_map));
                    }
                    uk.c cVar = new uk.c((el.b) tabCoverage2.O0.getValue(), tabCoverage2.m0(false), true, new a(tabCoverage2));
                    tabCoverage2.H0.add(cVar);
                    cVar.execute(new Void[0]);
                    break;
                } else {
                    try {
                        j.f(view, tabCoverage2.r(l.please_enable_location)).h();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                TabCoverage tabCoverage3 = this.f16895d;
                ((com.staircase3.opensignal.utils.a) tabCoverage3.N0.getValue()).c("tab_coverage", "show_map_legend", "zoom" + tabCoverage3.G0);
                se.b.Y(tabCoverage3.n(), i.dialog_map_legend);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                TabCoverage tabCoverage4 = this.f16895d;
                qm.f fVar2 = (qm.f) tabCoverage4.M0.getValue();
                Context contextN2 = tabCoverage4.n();
                fVar2.getClass();
                if (!qm.f.a(contextN2)) {
                    tabCoverage4.i0();
                    break;
                } else {
                    q3.a aVar = tabCoverage4.f6204y0;
                    if (aVar != null) {
                        aVar.O0();
                    }
                    if (u.e(tabCoverage4.n())) {
                        tabCoverage4.l0();
                        break;
                    } else {
                        try {
                            j.f(view, tabCoverage4.r(l.please_enable_location)).h();
                            break;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((AutoCompleteTextView) this.f16895d.f6203x0.f832b.f14398r).setText("");
                break;
            default:
                TabCoverage tabCoverage5 = this.f16895d;
                tabCoverage5.j0();
                ((AutoCompleteTextView) tabCoverage5.f6203x0.f832b.f14398r).setText("");
                break;
        }
    }
}
