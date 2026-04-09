package com.lefan.signal.network.webSpeed;

import C0.t;
import D4.a;
import D4.c;
import F4.b;
import G3.C0152f;
import O4.e;
import R.F;
import R.O;
import R.s0;
import R.t0;
import R.u0;
import R.v0;
import Y2.C0200b;
import a4.p;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.bumptech.glide.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lefan.base.view.NonConsumingCollapsingToolbarLayout;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.i;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class WebSpeedActivity extends AbstractActivityC2349g {

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f18847S = 0;

    /* renamed from: O, reason: collision with root package name */
    public C0200b f18848O;

    /* renamed from: P, reason: collision with root package name */
    public final a f18849P = new a(R.layout.item_web_speed, 4);

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f18850Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public final C0410g f18851R = new C0410g(new c(3, this));

    /* JADX WARN: Finally extract failed */
    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        final int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_web_speed, (ViewGroup) null, false);
        int i3 = R.id.collapsing_toolbar;
        NonConsumingCollapsingToolbarLayout nonConsumingCollapsingToolbarLayout = (NonConsumingCollapsingToolbarLayout) p.e(R.id.collapsing_toolbar, viewInflate);
        if (nonConsumingCollapsingToolbarLayout != null) {
            i3 = R.id.main_load_tip;
            AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.main_load_tip, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.main_percent;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.main_percent, viewInflate);
                if (appCompatTextView2 != null) {
                    i3 = R.id.main_progress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p.e(R.id.main_progress, viewInflate);
                    if (circularProgressIndicator != null) {
                        i3 = R.id.web_speed_add;
                        FloatingActionButton floatingActionButton = (FloatingActionButton) p.e(R.id.web_speed_add, viewInflate);
                        if (floatingActionButton != null) {
                            i3 = R.id.web_speed_recycler;
                            RecyclerView recyclerView = (RecyclerView) p.e(R.id.web_speed_recycler, viewInflate);
                            if (recyclerView != null) {
                                i3 = R.id.web_speed_toolbar;
                                Toolbar toolbar = (Toolbar) p.e(R.id.web_speed_toolbar, viewInflate);
                                if (toolbar != null) {
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                    this.f18848O = new C0200b(coordinatorLayout, nonConsumingCollapsingToolbarLayout, appCompatTextView, appCompatTextView2, circularProgressIndicator, floatingActionButton, recyclerView, toolbar, 1);
                                    setContentView(coordinatorLayout);
                                    Window window = getWindow();
                                    C0152f c0152f = new C0152f(getWindow().getDecorView());
                                    int i6 = Build.VERSION.SDK_INT;
                                    (i6 >= 35 ? new v0(window, c0152f) : i6 >= 30 ? new u0(window, c0152f) : i6 >= 26 ? new t0(window, c0152f) : new s0(window, c0152f)).D(false);
                                    C0200b c0200b = this.f18848O;
                                    if (c0200b == null) {
                                        i.g("binding");
                                        throw null;
                                    }
                                    NonConsumingCollapsingToolbarLayout nonConsumingCollapsingToolbarLayout2 = (NonConsumingCollapsingToolbarLayout) c0200b.f4304c;
                                    b bVar = new b(12);
                                    WeakHashMap weakHashMap = O.f3270a;
                                    F.k(nonConsumingCollapsingToolbarLayout2, bVar);
                                    C0200b c0200b2 = this.f18848O;
                                    if (c0200b2 == null) {
                                        i.g("binding");
                                        throw null;
                                    }
                                    RecyclerView recyclerView2 = (RecyclerView) c0200b2.f4309h;
                                    if (c0200b2 == null) {
                                        i.g("binding");
                                        throw null;
                                    }
                                    Toolbar toolbar2 = (Toolbar) c0200b2.i;
                                    B(toolbar2);
                                    d dVarR = r();
                                    final int i7 = 1;
                                    if (dVarR != null) {
                                        dVarR.S(true);
                                    }
                                    toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: O4.a

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ WebSpeedActivity f3069b;

                                        {
                                            this.f3069b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i8 = i;
                                            WebSpeedActivity webSpeedActivity = this.f3069b;
                                            switch (i8) {
                                                case 0:
                                                    int i9 = WebSpeedActivity.f18847S;
                                                    webSpeedActivity.finish();
                                                    break;
                                                default:
                                                    int i10 = WebSpeedActivity.f18847S;
                                                    l lVar = new l();
                                                    lVar.f3100K0 = new U0.j(7, webSpeedActivity);
                                                    lVar.f0(webSpeedActivity.s(), "web_speed_show");
                                                    break;
                                            }
                                        }
                                    });
                                    recyclerView2.g(new C0314k(this));
                                    a aVar = this.f18849P;
                                    recyclerView2.setAdapter(aVar);
                                    aVar.n(R.layout.empty_no_data2);
                                    e eVar = (e) this.f18851R.getValue();
                                    eVar.getClass();
                                    t tVarA = t.a(0, "SELECT * FROM web_speed");
                                    WebSpeedRoom_Impl webSpeedRoom_Impl = eVar.f3077a;
                                    webSpeedRoom_Impl.b();
                                    Cursor cursorL = webSpeedRoom_Impl.l(tVarA);
                                    try {
                                        int iP = I5.b.p(cursorL, "id");
                                        int iP2 = I5.b.p(cursorL, "url");
                                        int iP3 = I5.b.p(cursorL, "name");
                                        int iP4 = I5.b.p(cursorL, "logo");
                                        ArrayList arrayList = new ArrayList(cursorL.getCount());
                                        while (cursorL.moveToNext()) {
                                            WebSpeedBean webSpeedBean = new WebSpeedBean();
                                            webSpeedBean.setId(cursorL.getInt(iP));
                                            webSpeedBean.setUrl(cursorL.isNull(iP2) ? null : cursorL.getString(iP2));
                                            webSpeedBean.setName(cursorL.isNull(iP3) ? null : cursorL.getString(iP3));
                                            webSpeedBean.setLogo(cursorL.isNull(iP4) ? null : cursorL.getString(iP4));
                                            arrayList.add(webSpeedBean);
                                        }
                                        cursorL.close();
                                        tVarA.b();
                                        ArrayList arrayList2 = this.f18850Q;
                                        arrayList2.addAll(arrayList);
                                        aVar.p(arrayList2);
                                        AbstractC3046w.l(AbstractC3046w.b(), null, new O4.d(this, null), 3);
                                        C0200b c0200b3 = this.f18848O;
                                        if (c0200b3 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        ((FloatingActionButton) c0200b3.f4308g).setOnClickListener(new View.OnClickListener(this) { // from class: O4.a

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ WebSpeedActivity f3069b;

                                            {
                                                this.f3069b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i8 = i7;
                                                WebSpeedActivity webSpeedActivity = this.f3069b;
                                                switch (i8) {
                                                    case 0:
                                                        int i9 = WebSpeedActivity.f18847S;
                                                        webSpeedActivity.finish();
                                                        break;
                                                    default:
                                                        int i10 = WebSpeedActivity.f18847S;
                                                        l lVar = new l();
                                                        lVar.f3100K0 = new U0.j(7, webSpeedActivity);
                                                        lVar.f0(webSpeedActivity.s(), "web_speed_show");
                                                        break;
                                                }
                                            }
                                        });
                                        aVar.f4673g = new O4.b(this);
                                        aVar.f4672f = new O4.b(this);
                                        return;
                                    } catch (Throwable th) {
                                        cursorL.close();
                                        tVarA.b();
                                        throw th;
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
}
