package com.staircase3.opensignal.viewcontrollers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import bf.n;
import bh.g;
import bh.m;
import bu.t;
import com.google.android.gms.internal.measurement.b4;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.goldstar.testshistory.TestHistoryActivity;
import com.staircase3.opensignal.goldstar.widget.NetworkStatusView;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import com.staircase3.opensignal.views.TestButtonView;
import dn.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import kotlin.Metadata;
import lq.j;
import mn.f;
import mq.b0;
import mq.o;
import qk.h;
import qm.l;
import tt.s;
import zt.o0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/staircase3/opensignal/viewcontrollers/TestsFragment;", "Lqm/l;", "", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestsFragment extends l implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object A0;
    public final Object B0;
    public qm.c C0;
    public dn.d D0;
    public i E0;
    public final kn.a F0;
    public final f G0;
    public fl.b H0;
    public al.c I0;
    public al.c J0;
    public ImageView K0;
    public TextView L0;
    public final Object M0;
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f6313x0;

    /* renamed from: y0, reason: collision with root package name */
    public final Object f6314y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f6315z0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6327a;

        static {
            int[] iArr = new int[bh.c.values().length];
            try {
                iArr[bh.c.NO_INTERNET_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bh.c.POSSIBLE_INTERNET_ISSUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6327a = iArr;
        }
    }

    public TestsFragment() {
        j jVar = j.SYNCHRONIZED;
        this.f6313x0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$1(this));
        this.f6314y0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$2(this));
        this.f6315z0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$3(this));
        this.A0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$4(this));
        this.B0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$5(this));
        int i10 = 2;
        this.F0 = new kn.a(i10, this);
        this.G0 = new f(this, i10);
        this.M0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$6(this));
        this.N0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$7(this));
        this.O0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$8(this));
        this.P0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$9(this));
        this.Q0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$10(this));
        this.R0 = kc.f.E(jVar, new TestsFragment$special$$inlined$inject$default$11(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        b0();
        this.H0 = ((fl.c) this.O0.getValue()).a();
        this.I0 = new al.c(this, new om.f(l(), (com.staircase3.opensignal.utils.a) this.Q0.getValue()), (qm.f) this.M0.getValue(), (ll.c) this.N0.getValue(), (bn.e) this.f6314y0.getValue(), (an.a) this.f6315z0.getValue(), (bl.a) this.A0.getValue(), (kn.d) this.P0.getValue(), (wm.a) this.R0.getValue());
    }

    @Override // androidx.fragment.app.b
    public final void E(Menu menu, MenuInflater menuInflater) {
        br.l.e(menu, "menu");
        br.l.e(menuInflater, "inflater");
        menuInflater.inflate(qk.j.tab_overview_menu, menu);
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewA;
        br.l.e(layoutInflater, "inflater");
        LayoutInflater layoutInflaterJ = this.f1419j0;
        if (layoutInflaterJ == null) {
            layoutInflaterJ = J(null);
            this.f1419j0 = layoutInflaterJ;
        }
        View viewInflate = layoutInflaterJ.inflate(qk.i.fragment_tests, (ViewGroup) null, false);
        int i10 = h.guideline_center_horizontal;
        if (((Guideline) b4.A(viewInflate, i10)) != null) {
            i10 = h.guideline_speed_button_bottom;
            if (((Guideline) b4.A(viewInflate, i10)) != null) {
                i10 = h.guideline_speed_button_top;
                if (((Guideline) b4.A(viewInflate, i10)) != null) {
                    i10 = h.guideline_video_button;
                    if (((Guideline) b4.A(viewInflate, i10)) != null && (viewA = b4.A(viewInflate, (i10 = h.intro))) != null) {
                        bm.d dVarP = bm.d.p(viewA);
                        i10 = h.layoutAssistantButton;
                        TestButtonView testButtonView = (TestButtonView) b4.A(viewInflate, i10);
                        if (testButtonView != null) {
                            i10 = h.layoutSpeedtestButton;
                            TestButtonView testButtonView2 = (TestButtonView) b4.A(viewInflate, i10);
                            if (testButtonView2 != null) {
                                i10 = h.layoutSpeedtestButtonNew;
                                TestButtonView testButtonView3 = (TestButtonView) b4.A(viewInflate, i10);
                                if (testButtonView3 != null) {
                                    i10 = h.layoutVideotestButton;
                                    TestButtonView testButtonView4 = (TestButtonView) b4.A(viewInflate, i10);
                                    if (testButtonView4 != null) {
                                        i10 = h.layoutVideotestButtonNew;
                                        TestButtonView testButtonView5 = (TestButtonView) b4.A(viewInflate, i10);
                                        if (testButtonView5 != null) {
                                            i10 = h.new_test_button_group;
                                            Group group = (Group) b4.A(viewInflate, i10);
                                            if (group != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                i10 = h.speedTestButtonLayout;
                                                if (((ConstraintLayout) b4.A(viewInflate, i10)) != null) {
                                                    i10 = h.test_button_group;
                                                    Group group2 = (Group) b4.A(viewInflate, i10);
                                                    if (group2 != null) {
                                                        i10 = h.testHistoryButton;
                                                        Button button = (Button) b4.A(viewInflate, i10);
                                                        if (button != null) {
                                                            i10 = h.videoTestButtonLayout;
                                                            if (((ConstraintLayout) b4.A(viewInflate, i10)) != null) {
                                                                this.J0 = new al.c(constraintLayout, dVarP, testButtonView, testButtonView2, testButtonView3, testButtonView4, testButtonView5, group, group2, button);
                                                                se.b.W(l(), qk.d.status_bar_background);
                                                                al.c cVar = this.J0;
                                                                br.l.b(cVar);
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) cVar.f820b;
                                                                br.l.d(constraintLayout2, "getRoot(...)");
                                                                return constraintLayout2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void H() {
        this.J0 = null;
        this.L0 = null;
        this.K0 = null;
        fl.b bVar = this.H0;
        if (bVar == null) {
            br.l.l("networkUiStateDataSource");
            throw null;
        }
        bVar.i(t());
        q.c(X()).unregisterOnSharedPreferenceChangeListener(this);
        ((kn.d) this.P0.getValue()).getClass();
        kn.d.c("main_screen");
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final boolean M(MenuItem menuItem) {
        br.l.e(menuItem, "item");
        ((qm.e) this.f6313x0.getValue()).a(l(), menuItem.getItemId());
        return false;
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.f1410c0 = true;
        qm.c cVar = this.C0;
        if (cVar != null) {
            ((pc.a) cVar.f20919g).d((ji.a) cVar.f20920r);
        }
    }

    @Override // qm.l, androidx.fragment.app.b
    public final void O() {
        super.O();
        al.c cVar = this.I0;
        if (cVar == null) {
            br.l.l("presenter");
            throw null;
        }
        cVar.h(X());
        ((TestsFragment) cVar.f820b).i0(((bn.e) cVar.f824f).f2839a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f1410c0 = true;
        if (((xm.a) this.B0.getValue()).a()) {
            ah.e.c(X(), this.G0);
        }
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        ah.e.d(X(), this.G0);
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void S(View view, Bundle bundle) {
        br.l.e(view, "view");
        al.c cVar = this.J0;
        br.l.b(cVar);
        final int i10 = 0;
        ((NetworkStatusView) ((bm.d) cVar.f821c).f2828r).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        al.c cVar2 = this.f16900d.I0;
                        if (cVar2 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar2.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar2.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar2.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar2.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar3 = testsFragment.I0;
                        if (cVar3 != null) {
                            cVar3.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar4 = testsFragment2.I0;
                        if (cVar4 != null) {
                            cVar4.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar5 = testsFragment3.I0;
                        if (cVar5 != null) {
                            cVar5.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar6 = testsFragment4.I0;
                        if (cVar6 != null) {
                            cVar6.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar2 = this.J0;
        br.l.b(cVar2);
        final int i11 = 1;
        ((TestButtonView) cVar2.f823e).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar3 = testsFragment.I0;
                        if (cVar3 != null) {
                            cVar3.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar4 = testsFragment2.I0;
                        if (cVar4 != null) {
                            cVar4.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar5 = testsFragment3.I0;
                        if (cVar5 != null) {
                            cVar5.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar6 = testsFragment4.I0;
                        if (cVar6 != null) {
                            cVar6.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar3 = this.J0;
        br.l.b(cVar3);
        final int i12 = 2;
        ((TestButtonView) cVar3.f824f).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar32 = testsFragment.I0;
                        if (cVar32 != null) {
                            cVar32.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar4 = testsFragment2.I0;
                        if (cVar4 != null) {
                            cVar4.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar5 = testsFragment3.I0;
                        if (cVar5 != null) {
                            cVar5.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar6 = testsFragment4.I0;
                        if (cVar6 != null) {
                            cVar6.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar4 = this.J0;
        br.l.b(cVar4);
        final int i13 = 3;
        ((TestButtonView) cVar4.f825g).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar32 = testsFragment.I0;
                        if (cVar32 != null) {
                            cVar32.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar42 = testsFragment2.I0;
                        if (cVar42 != null) {
                            cVar42.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar5 = testsFragment3.I0;
                        if (cVar5 != null) {
                            cVar5.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar6 = testsFragment4.I0;
                        if (cVar6 != null) {
                            cVar6.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar5 = this.J0;
        br.l.b(cVar5);
        final int i14 = 4;
        ((TestButtonView) cVar5.f826h).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar32 = testsFragment.I0;
                        if (cVar32 != null) {
                            cVar32.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar42 = testsFragment2.I0;
                        if (cVar42 != null) {
                            cVar42.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar52 = testsFragment3.I0;
                        if (cVar52 != null) {
                            cVar52.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar6 = testsFragment4.I0;
                        if (cVar6 != null) {
                            cVar6.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar6 = this.J0;
        br.l.b(cVar6);
        final int i15 = 5;
        ((Button) cVar6.k).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar32 = testsFragment.I0;
                        if (cVar32 != null) {
                            cVar32.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar42 = testsFragment2.I0;
                        if (cVar42 != null) {
                            cVar42.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar52 = testsFragment3.I0;
                        if (cVar52 != null) {
                            cVar52.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar62 = testsFragment4.I0;
                        if (cVar62 != null) {
                            cVar62.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar7 = this.f16900d.I0;
                        if (cVar7 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar7.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        al.c cVar7 = this.J0;
        br.l.b(cVar7);
        final int i16 = 6;
        ((TestButtonView) cVar7.f822d).setOnClickListener(new View.OnClickListener(this) { // from class: mn.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TestsFragment f16900d;

            {
                this.f16900d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        al.c cVar22 = this.f16900d.I0;
                        if (cVar22 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        bn.e eVar = (bn.e) cVar22.f824f;
                        bn.d dVar = eVar.f2839a;
                        if (dVar instanceof bn.b) {
                            ((an.a) cVar22.f825g).c(dVar, 0L, eVar.f2840b, true);
                            ((TestsFragment) cVar22.f820b).g0(xu.l.i((bn.b) dVar, ((ll.c) cVar22.f823e).a()));
                            return;
                        }
                        return;
                    case 1:
                        TestsFragment testsFragment = this.f16900d;
                        al.c cVar32 = testsFragment.I0;
                        if (cVar32 != null) {
                            cVar32.p(testsFragment.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 2:
                        TestsFragment testsFragment2 = this.f16900d;
                        al.c cVar42 = testsFragment2.I0;
                        if (cVar42 != null) {
                            cVar42.p(testsFragment2.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 3:
                        TestsFragment testsFragment3 = this.f16900d;
                        al.c cVar52 = testsFragment3.I0;
                        if (cVar52 != null) {
                            cVar52.t(testsFragment3.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case 4:
                        TestsFragment testsFragment4 = this.f16900d;
                        al.c cVar62 = testsFragment4.I0;
                        if (cVar62 != null) {
                            cVar62.t(testsFragment4.X());
                            return;
                        } else {
                            br.l.l("presenter");
                            throw null;
                        }
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        al.c cVar72 = this.f16900d.I0;
                        if (cVar72 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        om.f fVar = (om.f) cVar72.f821c;
                        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar.f19555g, "tab_speedtest", "button_click", "button_history", 8);
                        Activity activity = (Activity) fVar.f19554d;
                        Intent intent = new Intent(activity, (Class<?>) TestHistoryActivity.class);
                        if (activity != null) {
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        TestsFragment testsFragment5 = this.f16900d;
                        al.c cVar8 = testsFragment5.I0;
                        if (cVar8 == null) {
                            br.l.l("presenter");
                            throw null;
                        }
                        testsFragment5.X();
                        bn.e eVar2 = (bn.e) cVar8.f824f;
                        ((bl.a) cVar8.f826h).getClass();
                        eVar2.f2842d = System.currentTimeMillis();
                        eVar2.f2841c = false;
                        an.a aVar = (an.a) cVar8.f825g;
                        aVar.f882a.d("CATEGORY_OSCA", "osca_manual_button_clicked", b0.Q(new lq.l("connection", aVar.b())));
                        ((TestsFragment) cVar8.f820b).h0();
                        ((wm.a) cVar8.j).a((tl.b) cVar8.k);
                        aVar.d();
                        return;
                }
            }
        });
        this.L0 = (TextView) view.findViewById(h.introTextView);
        this.K0 = (ImageView) view.findViewById(h.networkInfoImageView);
        k0();
        j0(X());
        fl.b bVar = this.H0;
        if (bVar == null) {
            br.l.l("networkUiStateDataSource");
            throw null;
        }
        bVar.d(t(), this.F0);
        q.c(X()).registerOnSharedPreferenceChangeListener(this);
        al.c cVar8 = this.I0;
        if (cVar8 == null) {
            br.l.l("presenter");
            throw null;
        }
        cVar8.h(X());
        ((kn.d) this.P0.getValue()).getClass();
        kn.d.a("main_screen");
    }

    public final void g0(fn.a aVar) {
        Object value;
        if (this.D0 == null) {
            final dn.d dVar = new dn.d();
            dVar.M0 = new dn.b() { // from class: com.staircase3.opensignal.viewcontrollers.TestsFragment$displayAssistantDialogState$1$1
                @Override // dn.b
                public final void a(bn.d dVar2) throws MissingResourceException {
                    int i10;
                    br.l.e(dVar2, "result");
                    TestsFragment testsFragment = this.f6328a;
                    al.c cVar = testsFragment.I0;
                    if (cVar == null) {
                        br.l.l("presenter");
                        throw null;
                    }
                    om.f fVar = (om.f) cVar.f821c;
                    Context contextX = dVar.X();
                    ((an.a) cVar.f825g).a(dVar2.a());
                    if (dVar2 instanceof bn.b) {
                        bh.a aVar2 = ((bn.b) dVar2).f2834a;
                        bh.e eVar = aVar2.f2747d;
                        br.l.e(eVar, "assistantExplanation");
                        switch (tk.a.f22878a[eVar.ordinal()]) {
                            case 1:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_policy;
                                break;
                            case 2:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_carrier;
                                break;
                            case 3:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_thermal;
                                break;
                            case 4:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_airplane_mode_on;
                                break;
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_data_disabled;
                                break;
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_roaming_data_disabled;
                                break;
                            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                i10 = qk.l.connectivity_assistant_connected_to_mobile_network_but_has_internet_issues;
                                break;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                i10 = qk.l.connectivity_assistant_connected_to_wifi_requires_login;
                                break;
                            case 9:
                                i10 = qk.l.connectivity_assistant_connected_to_wifi_but_has_internet_issues;
                                break;
                            case 10:
                                i10 = qk.l.connectivity_assistant_problem_with_internet_connection;
                                break;
                            case 11:
                                i10 = qk.l.connectivity_assistant_poor_wifi_signal;
                                break;
                            case 12:
                                i10 = qk.l.connectivity_assistant_poor_4g_mobile_signal;
                                break;
                            case 13:
                                i10 = qk.l.connectivity_assistant_slow_mobile_connection_data_saver_on;
                                break;
                            case 14:
                                i10 = qk.l.connectivity_assistant_mobile_connection_slow;
                                break;
                            case 15:
                                i10 = qk.l.connectivity_assistant_internet_connection_slower_than_usual;
                                break;
                            case 16:
                                i10 = qk.l.connectivity_assistant_connected_to_2g_network;
                                break;
                            case 17:
                                i10 = qk.l.connectivity_assistant_poor_3g_mobile_signal;
                                break;
                            case 18:
                                i10 = qk.l.connectivity_assistant_poor_5g_mobile_signal;
                                break;
                            case 19:
                                i10 = qk.l.connectivity_assistant_mobile_network_congested;
                                break;
                            default:
                                throw new n();
                        }
                        String string = contextX.getString(i10);
                        br.l.d(string, "getString(...)");
                        List list = aVar2.f2749f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(io.sentry.config.a.P(contextX, (m) it.next(), aVar2.f2745b));
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList.size() == 1) {
                                cVar.l();
                                String str = ((ResolutionCardInfo) o.r0(arrayList)).f6135g;
                                if (str != null) {
                                    if (str.equals("compass_uri")) {
                                        Activity activity = (Activity) fVar.f19554d;
                                        if (activity instanceof MainActivity) {
                                            ((MainActivity) activity).z(new Intent("shortcuts.action.show_compass"));
                                        }
                                    } else if (str.length() > 0) {
                                        Intent intent = new Intent(str);
                                        intent.setFlags(268435456);
                                        try {
                                            Activity activity2 = (Activity) fVar.f19554d;
                                            if (activity2 != null) {
                                                activity2.startActivity(intent);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            } else {
                                TestsFragment testsFragment2 = (TestsFragment) cVar.f820b;
                                String string2 = contextX.getString(qk.l.connectivity_assistant_status_possible_issues);
                                br.l.d(string2, "getString(...)");
                                if (testsFragment2.E0 == null) {
                                    i iVar = new i();
                                    Bundle bundle = new Bundle(0);
                                    bundle.putString("title", string2);
                                    bundle.putString("content", string);
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                    arrayList2.addAll(arrayList);
                                    bundle.putParcelableArrayList("cards", arrayList2);
                                    iVar.a0(bundle);
                                    iVar.P0 = new io.sentry.android.replay.capture.e(17, testsFragment2);
                                    iVar.O0 = new kg.q(testsFragment2, 1, iVar);
                                    testsFragment2.E0 = iVar;
                                    iVar.j0(testsFragment2.m(), "OSCA");
                                }
                            }
                        }
                    }
                    dn.d dVar3 = testsFragment.D0;
                    if (dVar3 != null) {
                        dVar3.g0(false, false);
                    }
                    testsFragment.D0 = null;
                }

                @Override // dn.b
                public final void b() {
                    TestsFragment testsFragment = this.f6328a;
                    dn.d dVar2 = testsFragment.D0;
                    if (dVar2 != null) {
                        dVar2.g0(false, false);
                    }
                    testsFragment.D0 = null;
                    al.c cVar = testsFragment.I0;
                    if (cVar == null) {
                        br.l.l("presenter");
                        throw null;
                    }
                    ((bn.e) cVar.f824f).f2841c = true;
                    an.a aVar2 = (an.a) cVar.f825g;
                    aVar2.f882a.d("CATEGORY_OSCA", "osca_cancel_button_clicked", b0.Q(new lq.l("connection", aVar2.b())));
                }

                @Override // dn.b
                public final void c() throws MissingResourceException {
                    al.c cVar = this.f6328a.I0;
                    if (cVar == null) {
                        br.l.l("presenter");
                        throw null;
                    }
                    dVar.X();
                    bn.e eVar = (bn.e) cVar.f824f;
                    ((bl.a) cVar.f826h).getClass();
                    eVar.f2842d = System.currentTimeMillis();
                    eVar.f2841c = false;
                    cVar.l();
                    an.a aVar2 = (an.a) cVar.f825g;
                    aVar2.f882a.d("CATEGORY_OSCA", "osca_run_again_button_clicked", b0.Q(new lq.l("connection", aVar2.b())));
                    ((TestsFragment) cVar.f820b).h0();
                    ((wm.a) cVar.j).a((tl.b) cVar.k);
                    aVar2.d();
                }

                @Override // dn.b
                public final void d() throws MissingResourceException {
                    TestsFragment testsFragment = this.f6328a;
                    dn.d dVar2 = testsFragment.D0;
                    if (dVar2 != null) {
                        dVar2.g0(false, false);
                    }
                    testsFragment.D0 = null;
                    al.c cVar = testsFragment.I0;
                    if (cVar != null) {
                        cVar.l();
                    } else {
                        br.l.l("presenter");
                        throw null;
                    }
                }
            };
            this.D0 = dVar;
            dVar.j0(m(), "assistant_dialog");
        }
        dn.d dVar2 = this.D0;
        if (dVar2 != null) {
            o0 o0Var = dVar2.N0;
            do {
                value = o0Var.getValue();
                t tVar = au.c.f2321b;
                if (value == null) {
                    value = tVar;
                }
            } while (!o0Var.h(value, aVar));
        }
    }

    public final void h0() {
        g0(new fn.a(qk.l.connectivity_assistant_starting_title, qk.l.connectivity_assistant_starting_status, qk.l.connectivity_assistant_starting_description, null, g.TESTING, null, qk.l.connectivity_assistant_button_cancel_label, null, fn.c.CANCEL, new bn.c("", 0L), 168));
    }

    public final void i0(bn.d dVar) {
        NetworkStatusView.a aVar;
        br.l.e(dVar, "oscaResult");
        if (dVar instanceof bn.a) {
            aVar = null;
        } else if (dVar instanceof bn.b) {
            int i10 = WhenMappings.f6327a[((bn.b) dVar).f2834a.f2746c.ordinal()];
            if (i10 == 1) {
                aVar = NetworkStatusView.a.NOT_CONNECTED;
            } else {
                if (i10 != 2) {
                    throw new n();
                }
                aVar = NetworkStatusView.a.POSSIBLE_ISSUES;
            }
        } else {
            if (!(dVar instanceof bn.c)) {
                throw new n();
            }
            aVar = NetworkStatusView.a.CONNECTED;
        }
        if (aVar == null) {
            al.c cVar = this.J0;
            br.l.b(cVar);
            NetworkStatusView networkStatusView = (NetworkStatusView) ((bm.d) cVar.f821c).f2828r;
            br.l.d(networkStatusView, "networkStatusView");
            networkStatusView.setVisibility(8);
            return;
        }
        al.c cVar2 = this.J0;
        br.l.b(cVar2);
        NetworkStatusView networkStatusView2 = (NetworkStatusView) ((bm.d) cVar2.f821c).f2828r;
        br.l.d(networkStatusView2, "networkStatusView");
        networkStatusView2.setVisibility(0);
        al.c cVar3 = this.J0;
        br.l.b(cVar3);
        ((NetworkStatusView) ((bm.d) cVar3.f821c).f2828r).setCurrentConnectionType(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lq.h] */
    public final void j0(Context context) {
        Context context2;
        if (!((xm.a) this.B0.getValue()).a()) {
            qm.c cVar = this.C0;
            if (cVar != null) {
                ((pc.a) cVar.f20919g).d((ji.a) cVar.f20920r);
                return;
            }
            return;
        }
        qm.c cVarY = qm.c.y();
        this.C0 = cVarY;
        if (cVarY == null || ((pc.a) cVarY.f20919g) != null) {
            context2 = context;
        } else {
            int i10 = tc.a.f22695a;
            context2 = context;
            cVarY.f20919g = new pc.a(context2, null, pc.a.j, ac.b.f322a, ac.e.f324b);
        }
        qm.c cVar2 = this.C0;
        if (cVar2 != null) {
            cVar2.Q(context2, (qm.f) this.M0.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public final void k0() {
        boolean zA = ((xm.a) this.B0.getValue()).a();
        al.c cVar = this.J0;
        br.l.b(cVar);
        ((Group) cVar.j).setVisibility(zA ? 8 : 0);
        int i10 = zA ? 0 : 8;
        al.c cVar2 = this.J0;
        br.l.b(cVar2);
        ((NetworkStatusView) ((bm.d) cVar2.f821c).f2828r).setVisibility(i10);
        al.c cVar3 = this.J0;
        br.l.b(cVar3);
        ((Group) cVar3.f827i).setVisibility(i10);
        String strR = r(qk.l.select_test_intro);
        br.l.d(strR, "getString(...)");
        if (zA) {
            strR = s.l0(strR, "<br />", "");
        }
        TextView textView = this.L0;
        if (textView != null) {
            lq.q qVar = u.f6195a;
            textView.setText(Html.fromHtml(strR, 0));
        }
    }

    @Override // androidx.fragment.app.b
    public final Context n() {
        return l();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (br.l.a(str, "prefs_connectivity_assistant_enabled")) {
            k0();
            j0(X());
        }
    }
}
