package com.lefan.signal.ui.wifi;

import B3.f;
import B3.l;
import B3.v;
import B4.h;
import B4.r;
import D4.c;
import F4.d;
import K4.g;
import N4.b;
import Y4.RunnableC0222b;
import Y4.ViewOnClickListenerC0223c;
import a4.p;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.tracroute.e;
import com.lefan.signal.ui.wifi.PingActivity;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import q5.i;

/* loaded from: classes.dex */
public final class PingActivity extends AbstractActivityC2349g {
    public static final /* synthetic */ int b0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public g f19346O;

    /* renamed from: P, reason: collision with root package name */
    public final C0410g f19347P = new C0410g(new c(8, this));

    /* renamed from: Q, reason: collision with root package name */
    public MaterialButton f19348Q;

    /* renamed from: R, reason: collision with root package name */
    public MaterialButton f19349R;

    /* renamed from: S, reason: collision with root package name */
    public AppCompatTextView f19350S;

    /* renamed from: T, reason: collision with root package name */
    public v f19351T;

    /* renamed from: U, reason: collision with root package name */
    public AppCompatTextView f19352U;

    /* renamed from: V, reason: collision with root package name */
    public AppCompatTextView f19353V;

    /* renamed from: W, reason: collision with root package name */
    public AppCompatTextView f19354W;

    /* renamed from: X, reason: collision with root package name */
    public AppCompatTextView f19355X;

    /* renamed from: Y, reason: collision with root package name */
    public AppCompatImageView f19356Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f19357Z;

    /* renamed from: a0, reason: collision with root package name */
    public Process f19358a0;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        final int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_ping, (ViewGroup) null, false);
        int i3 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i3 = R.id.avage_delay;
            AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.avage_delay, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.bottom_layout;
                NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.bottom_layout, viewInflate);
                if (nestedScrollView != null) {
                    i3 = R.id.log_t;
                    if (((AppCompatTextView) p.e(R.id.log_t, viewInflate)) != null) {
                        i3 = R.id.log_text;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.log_text, viewInflate);
                        if (appCompatTextView2 != null) {
                            i3 = R.id.loss_perm;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) p.e(R.id.loss_perm, viewInflate);
                            if (appCompatTextView3 != null) {
                                i3 = R.id.mdev_num;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) p.e(R.id.mdev_num, viewInflate);
                                if (appCompatTextView4 != null) {
                                    i3 = R.id.ping_history;
                                    MaterialButton materialButton = (MaterialButton) p.e(R.id.ping_history, viewInflate);
                                    if (materialButton != null) {
                                        i3 = R.id.ping_input;
                                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) p.e(R.id.ping_input, viewInflate);
                                        if (appCompatAutoCompleteTextView != null) {
                                            i3 = R.id.ping_input_layout;
                                            if (((TextInputLayout) p.e(R.id.ping_input_layout, viewInflate)) != null) {
                                                i3 = R.id.result_copy;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.result_copy, viewInflate);
                                                if (appCompatImageView != null) {
                                                    i3 = R.id.send_num;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) p.e(R.id.send_num, viewInflate);
                                                    if (appCompatTextView5 != null) {
                                                        i3 = R.id.start_ping;
                                                        MaterialButton materialButton2 = (MaterialButton) p.e(R.id.start_ping, viewInflate);
                                                        if (materialButton2 != null) {
                                                            i3 = R.id.toolbar;
                                                            Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                                            if (toolbar != null) {
                                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                this.f19346O = new g(linearLayoutCompat, appBarLayout, appCompatTextView, nestedScrollView, appCompatTextView2, appCompatTextView3, appCompatTextView4, materialButton, appCompatAutoCompleteTextView, appCompatImageView, appCompatTextView5, materialButton2, toolbar);
                                                                setContentView(linearLayoutCompat);
                                                                g gVar = this.f19346O;
                                                                if (gVar == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                AppBarLayout appBarLayout2 = gVar.f2257c;
                                                                if (gVar == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                d.a(appBarLayout2, gVar.f2262h);
                                                                g gVar2 = this.f19346O;
                                                                if (gVar2 == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                Toolbar toolbar2 = gVar2.i;
                                                                B(toolbar2);
                                                                com.bumptech.glide.d dVarR = r();
                                                                final int i6 = 1;
                                                                if (dVarR != null) {
                                                                    dVarR.S(true);
                                                                }
                                                                toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Y4.a

                                                                    /* renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ PingActivity f4446b;

                                                                    {
                                                                        this.f4446b = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        int i7 = i;
                                                                        PingActivity pingActivity = this.f4446b;
                                                                        switch (i7) {
                                                                            case 0:
                                                                                int i8 = PingActivity.b0;
                                                                                pingActivity.finish();
                                                                                return;
                                                                            default:
                                                                                int i9 = PingActivity.b0;
                                                                                k0.K kS = pingActivity.s();
                                                                                AppCompatTextView appCompatTextView6 = pingActivity.f19350S;
                                                                                if (appCompatTextView6 == null) {
                                                                                    q5.i.g("pingLog");
                                                                                    throw null;
                                                                                }
                                                                                String string = appCompatTextView6.getText().toString();
                                                                                if (kS == null) {
                                                                                    return;
                                                                                }
                                                                                B4.A a6 = new B4.A();
                                                                                a6.f687A0 = string;
                                                                                a6.f688B0 = "Ping";
                                                                                a6.e0(kS, "share_copy_dialog");
                                                                                return;
                                                                        }
                                                                    }
                                                                });
                                                                g gVar3 = this.f19346O;
                                                                if (gVar3 == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) gVar3.f2267n;
                                                                ArrayList arrayList = new ArrayList();
                                                                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);
                                                                appCompatAutoCompleteTextView2.setAdapter(arrayAdapter);
                                                                g gVar4 = this.f19346O;
                                                                if (gVar4 == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                this.f19349R = (MaterialButton) gVar4.f2265l;
                                                                ((e) this.f19347P.getValue()).a().e(this, new b(new S4.c(arrayList, arrayAdapter, this, 3), 5));
                                                                appCompatAutoCompleteTextView2.postDelayed(new RunnableC0222b(arrayList, appCompatAutoCompleteTextView2, i), 1200L);
                                                                MaterialButton materialButton3 = this.f19349R;
                                                                if (materialButton3 == null) {
                                                                    i.g("pingHistoryBtn");
                                                                    throw null;
                                                                }
                                                                materialButton3.setOnClickListener(new ViewOnClickListenerC0223c(arrayList, this, appCompatAutoCompleteTextView2, i));
                                                                g gVar5 = this.f19346O;
                                                                if (gVar5 == null) {
                                                                    i.g("binding");
                                                                    throw null;
                                                                }
                                                                this.f19356Y = gVar5.f2261g;
                                                                this.f19348Q = (MaterialButton) gVar5.f2266m;
                                                                this.f19350S = gVar5.f2259e;
                                                                this.f19352U = (AppCompatTextView) gVar5.f2264k;
                                                                this.f19353V = (AppCompatTextView) gVar5.f2263j;
                                                                this.f19354W = gVar5.f2260f;
                                                                this.f19355X = gVar5.f2258d;
                                                                l lVar = new l(this, null, 0, R.style.CircularProgressIndicator_Small);
                                                                int i7 = v.f664E;
                                                                this.f19351T = v.g(this, lVar, new f(lVar));
                                                                MaterialButton materialButton4 = this.f19348Q;
                                                                if (materialButton4 == null) {
                                                                    i.g("startBtn");
                                                                    throw null;
                                                                }
                                                                materialButton4.setOnClickListener(new r(appCompatAutoCompleteTextView2, 12, this));
                                                                AppCompatImageView appCompatImageView2 = this.f19356Y;
                                                                if (appCompatImageView2 != null) {
                                                                    appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: Y4.a

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ PingActivity f4446b;

                                                                        {
                                                                            this.f4446b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i72 = i6;
                                                                            PingActivity pingActivity = this.f4446b;
                                                                            switch (i72) {
                                                                                case 0:
                                                                                    int i8 = PingActivity.b0;
                                                                                    pingActivity.finish();
                                                                                    return;
                                                                                default:
                                                                                    int i9 = PingActivity.b0;
                                                                                    k0.K kS = pingActivity.s();
                                                                                    AppCompatTextView appCompatTextView6 = pingActivity.f19350S;
                                                                                    if (appCompatTextView6 == null) {
                                                                                        q5.i.g("pingLog");
                                                                                        throw null;
                                                                                    }
                                                                                    String string = appCompatTextView6.getText().toString();
                                                                                    if (kS == null) {
                                                                                        return;
                                                                                    }
                                                                                    B4.A a6 = new B4.A();
                                                                                    a6.f687A0 = string;
                                                                                    a6.f688B0 = "Ping";
                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    return;
                                                                } else {
                                                                    i.g("copyBtn");
                                                                    throw null;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
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
        Process process = this.f19358a0;
        if (process != null) {
            process.destroy();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            h hVar = new h();
            hVar.g0(R.string.ping_detection_tip, getString(R.string.ping_detection));
            hVar.e0(s(), "ping_help");
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
