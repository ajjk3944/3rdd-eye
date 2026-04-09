package com.lefan.signal.ui.wifi;

import B3.l;
import B3.v;
import B4.h;
import B4.r;
import C0.A;
import D4.c;
import F4.d;
import K4.k;
import N4.b;
import N4.j;
import Y4.RunnableC0222b;
import Y4.ViewOnClickListenerC0223c;
import a4.p;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.MyApplication;
import com.lefan.signal.tracroute.e;
import com.lefan.signal.tracroute.f;
import com.lefan.signal.tracroute.g;
import com.lefan.signal.view.DelayCureView;
import com.lefan.signal.view.DiagnosisLevelView;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import q5.i;

/* loaded from: classes.dex */
public final class TraceRouteActivity extends AbstractActivityC2349g {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f19379c0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public k f19380O;

    /* renamed from: P, reason: collision with root package name */
    public MaterialButton f19381P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0410g f19382Q = new C0410g(new c(10, this));

    /* renamed from: R, reason: collision with root package name */
    public final j f19383R;

    /* renamed from: S, reason: collision with root package name */
    public final g f19384S;

    /* renamed from: T, reason: collision with root package name */
    public DelayCureView f19385T;

    /* renamed from: U, reason: collision with root package name */
    public v f19386U;

    /* renamed from: V, reason: collision with root package name */
    public DiagnosisLevelView f19387V;

    /* renamed from: W, reason: collision with root package name */
    public DiagnosisLevelView f19388W;

    /* renamed from: X, reason: collision with root package name */
    public AppCompatTextView f19389X;

    /* renamed from: Y, reason: collision with root package name */
    public AppCompatTextView f19390Y;

    /* renamed from: Z, reason: collision with root package name */
    public AppCompatImageView f19391Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19392a0;
    public final ArrayList b0;

    public TraceRouteActivity() {
        j jVar = new j(2);
        jVar.q(0, R.layout.item_trace);
        jVar.q(1, R.layout.item_trace2);
        this.f19383R = jVar;
        this.f19384S = new g();
        this.b0 = new ArrayList();
    }

    public final void C(f fVar) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        runOnUiThread(new A(fVar, 4, this));
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_trace_route, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.bottom_layout;
            NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.bottom_layout, viewInflate);
            if (nestedScrollView != null) {
                i = R.id.curve_t;
                if (((AppCompatTextView) p.e(R.id.curve_t, viewInflate)) != null) {
                    i = R.id.inner_net_level;
                    DiagnosisLevelView diagnosisLevelView = (DiagnosisLevelView) p.e(R.id.inner_net_level, viewInflate);
                    if (diagnosisLevelView != null) {
                        i = R.id.inner_net_qulity;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.inner_net_qulity, viewInflate);
                        if (appCompatTextView != null) {
                            i = R.id.log_recycler;
                            RecyclerView recyclerView = (RecyclerView) p.e(R.id.log_recycler, viewInflate);
                            if (recyclerView != null) {
                                i = R.id.log_t;
                                if (((AppCompatTextView) p.e(R.id.log_t, viewInflate)) != null) {
                                    i = R.id.outer_net_level;
                                    DiagnosisLevelView diagnosisLevelView2 = (DiagnosisLevelView) p.e(R.id.outer_net_level, viewInflate);
                                    if (diagnosisLevelView2 != null) {
                                        i = R.id.outer_net_qulity;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.outer_net_qulity, viewInflate);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.result_copy;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.result_copy, viewInflate);
                                            if (appCompatImageView != null) {
                                                i = R.id.start_trace;
                                                MaterialButton materialButton = (MaterialButton) p.e(R.id.start_trace, viewInflate);
                                                if (materialButton != null) {
                                                    i = R.id.trace_history;
                                                    MaterialButton materialButton2 = (MaterialButton) p.e(R.id.trace_history, viewInflate);
                                                    if (materialButton2 != null) {
                                                        i = R.id.trace_input;
                                                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) p.e(R.id.trace_input, viewInflate);
                                                        if (appCompatAutoCompleteTextView != null) {
                                                            i = R.id.trace_input_layout;
                                                            if (((TextInputLayout) p.e(R.id.trace_input_layout, viewInflate)) != null) {
                                                                i = R.id.trace_toolbar;
                                                                Toolbar toolbar = (Toolbar) p.e(R.id.trace_toolbar, viewInflate);
                                                                if (toolbar != null) {
                                                                    i = R.id.traceroute_curve_view;
                                                                    DelayCureView delayCureView = (DelayCureView) p.e(R.id.traceroute_curve_view, viewInflate);
                                                                    if (delayCureView != null) {
                                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                        this.f19380O = new k(linearLayoutCompat, appBarLayout, nestedScrollView, diagnosisLevelView, appCompatTextView, recyclerView, diagnosisLevelView2, appCompatTextView2, appCompatImageView, materialButton, materialButton2, appCompatAutoCompleteTextView, toolbar, delayCureView);
                                                                        setContentView(linearLayoutCompat);
                                                                        k kVar = this.f19380O;
                                                                        if (kVar == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        AppBarLayout appBarLayout2 = kVar.f2326b;
                                                                        if (kVar == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        d.a(appBarLayout2, kVar.f2327c);
                                                                        k kVar2 = this.f19380O;
                                                                        if (kVar2 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        Toolbar toolbar2 = kVar2.f2336m;
                                                                        B(toolbar2);
                                                                        com.bumptech.glide.d dVarR = r();
                                                                        int i3 = 1;
                                                                        if (dVarR != null) {
                                                                            dVarR.S(true);
                                                                        }
                                                                        toolbar2.setNavigationOnClickListener(new B4.g(24, this));
                                                                        g gVar = this.f19384S;
                                                                        gVar.getClass();
                                                                        gVar.f18877g = this;
                                                                        k kVar3 = this.f19380O;
                                                                        if (kVar3 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        DelayCureView delayCureView2 = kVar3.f2337n;
                                                                        this.f19385T = delayCureView2;
                                                                        delayCureView2.setYMaxCoordinate(40);
                                                                        l lVar = new l(this, null, 0, R.style.CircularProgressIndicator_Small);
                                                                        int i6 = v.f664E;
                                                                        this.f19386U = v.g(this, lVar, new B3.f(lVar));
                                                                        k kVar4 = this.f19380O;
                                                                        if (kVar4 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        DiagnosisLevelView diagnosisLevelView3 = kVar4.f2328d;
                                                                        this.f19387V = diagnosisLevelView3;
                                                                        ImageView imageView = diagnosisLevelView3.f19534g;
                                                                        if (imageView != null) {
                                                                            imageView.setVisibility(8);
                                                                        }
                                                                        k kVar5 = this.f19380O;
                                                                        if (kVar5 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        DiagnosisLevelView diagnosisLevelView4 = kVar5.f2331g;
                                                                        this.f19388W = diagnosisLevelView4;
                                                                        ImageView imageView2 = diagnosisLevelView4.f19534g;
                                                                        if (imageView2 != null) {
                                                                            imageView2.setVisibility(8);
                                                                        }
                                                                        k kVar6 = this.f19380O;
                                                                        if (kVar6 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        this.f19389X = kVar6.f2329e;
                                                                        this.f19390Y = kVar6.f2332h;
                                                                        this.f19391Z = kVar6.i;
                                                                        String str = getString(R.string.tools_traceroute_hop_count) + "\u3000\u3000\u3000IP" + getString(R.string.celluer_network_deley) + "\u3000\u3000\u3000" + getString(R.string.tools_traceroute_ip_location);
                                                                        AppCompatImageView appCompatImageView2 = this.f19391Z;
                                                                        if (appCompatImageView2 == null) {
                                                                            i.g("copyBtn");
                                                                            throw null;
                                                                        }
                                                                        appCompatImageView2.setOnClickListener(new r(str, this));
                                                                        k kVar7 = this.f19380O;
                                                                        if (kVar7 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = kVar7.f2335l;
                                                                        ArrayList arrayList = new ArrayList();
                                                                        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);
                                                                        appCompatAutoCompleteTextView2.setAdapter(arrayAdapter);
                                                                        k kVar8 = this.f19380O;
                                                                        if (kVar8 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        MaterialButton materialButton3 = kVar8.f2334k;
                                                                        ((e) this.f19382Q.getValue()).a().e(this, new b(new S4.c(arrayList, arrayAdapter, materialButton3, 4), 6));
                                                                        appCompatAutoCompleteTextView2.postDelayed(new RunnableC0222b(arrayList, appCompatAutoCompleteTextView2, 1), 1200L);
                                                                        materialButton3.setOnClickListener(new ViewOnClickListenerC0223c(arrayList, this, appCompatAutoCompleteTextView2, i3));
                                                                        k kVar9 = this.f19380O;
                                                                        if (kVar9 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        MaterialButton materialButton4 = kVar9.f2333j;
                                                                        this.f19381P = materialButton4;
                                                                        materialButton4.setOnClickListener(new r(appCompatAutoCompleteTextView2, 15, this));
                                                                        k kVar10 = this.f19380O;
                                                                        if (kVar10 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        kVar10.f2330f.setAdapter(this.f19383R);
                                                                        boolean z6 = MyApplication.f18812d;
                                                                        return;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.activity_help, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f19384S;
        gVar.f18875e = true;
        Process process = gVar.f18876f;
        if (process != null) {
            process.destroy();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            h hVar = new h();
            hVar.g0(R.string.tracert_tip, getString(R.string.tracert));
            hVar.e0(s(), "trace_route_help");
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
