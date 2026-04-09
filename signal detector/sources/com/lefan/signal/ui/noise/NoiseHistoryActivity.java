package com.lefan.signal.ui.noise;

import C0.t;
import D4.c;
import F4.d;
import G3.C0152f;
import H3.g;
import I5.b;
import K4.f;
import S4.n;
import S4.q;
import a2.AbstractC0271g;
import a4.p;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.List;
import q5.i;

/* loaded from: classes.dex */
public final class NoiseHistoryActivity extends AbstractActivityC2349g {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f19009T = 0;

    /* renamed from: O, reason: collision with root package name */
    public f f19010O;

    /* renamed from: P, reason: collision with root package name */
    public final q f19011P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0410g f19012Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f19013R;

    /* renamed from: S, reason: collision with root package name */
    public int f19014S;

    public NoiseHistoryActivity() {
        q qVar = new q(R.layout.item_noise_history_info);
        qVar.f4676k.add(Integer.valueOf(new int[]{R.id.noise_delete}[0]));
        this.f19011P = qVar;
        this.f19012Q = new C0410g(new c(6, this));
        this.f19013R = new ArrayList();
        this.f19014S = 1;
    }

    /* JADX WARN: Finally extract failed */
    public final void C() {
        n nVar = (n) this.f19012Q.getValue();
        int i = 1;
        int i3 = (this.f19014S - 1) * 10;
        nVar.getClass();
        t tVarA = t.a(2, "select * from noise ORDER BY time DESC limit ? OFFSET ?");
        tVarA.f(1, 10);
        tVarA.f(2, i3);
        NoiseZoom_Impl noiseZoom_Impl = nVar.f3544a;
        noiseZoom_Impl.b();
        Cursor cursorL = noiseZoom_Impl.l(tVarA);
        try {
            int iP = b.p(cursorL, "id");
            int iP2 = b.p(cursorL, "time");
            int iP3 = b.p(cursorL, "minValue");
            int iP4 = b.p(cursorL, "avgValue");
            int iP5 = b.p(cursorL, "maxValue");
            int iP6 = b.p(cursorL, "lat");
            int iP7 = b.p(cursorL, "lon");
            int iP8 = b.p(cursorL, "address");
            int iP9 = b.p(cursorL, "step");
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                NoiseBean noiseBean = new NoiseBean();
                int i6 = i;
                noiseBean.setId(cursorL.getInt(iP));
                noiseBean.setTime(cursorL.getLong(iP2));
                noiseBean.setMinValue(cursorL.getFloat(iP3));
                noiseBean.setAvgValue(cursorL.getFloat(iP4));
                noiseBean.setMaxValue(cursorL.getFloat(iP5));
                List<Float> listP = null;
                noiseBean.setLat(cursorL.isNull(iP6) ? null : Double.valueOf(cursorL.getDouble(iP6)));
                noiseBean.setLon(cursorL.isNull(iP7) ? null : Double.valueOf(cursorL.getDouble(iP7)));
                noiseBean.setAddress(cursorL.isNull(iP8) ? null : cursorL.getString(iP8));
                String string = cursorL.isNull(iP9) ? null : cursorL.getString(iP9);
                if (string != null) {
                    listP = C0152f.p(string);
                }
                noiseBean.setStep(listP);
                arrayList.add(noiseBean);
                i = i6;
            }
            int i7 = i;
            cursorL.close();
            tVarA.b();
            this.f19014S++;
            int size = arrayList.size();
            q qVar = this.f19011P;
            if (size < 10) {
                g gVar = qVar.i;
                if (gVar == null) {
                    throw new IllegalStateException("Please first implements LoadMoreModule");
                }
                AbstractC0271g abstractC0271g = (AbstractC0271g) gVar.f1799d;
                if (gVar.d()) {
                    gVar.f1798c = 4;
                    abstractC0271g.notifyItemChanged(gVar.c());
                }
            } else {
                g gVar2 = qVar.i;
                if (gVar2 == null) {
                    throw new IllegalStateException("Please first implements LoadMoreModule");
                }
                if (gVar2.d()) {
                    gVar2.f1798c = i7;
                    ((AbstractC0271g) gVar2.f1799d).notifyItemChanged(gVar2.c());
                }
            }
            this.f19013R.addAll(arrayList);
        } catch (Throwable th) {
            cursorL.close();
            tVarA.b();
            throw th;
        }
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_noise_history, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.noise_history_toolbar;
            Toolbar toolbar = (Toolbar) p.e(R.id.noise_history_toolbar, viewInflate);
            if (toolbar != null) {
                i = R.id.noise_recycler;
                RecyclerView recyclerView = (RecyclerView) p.e(R.id.noise_recycler, viewInflate);
                if (recyclerView != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    this.f19010O = new f(linearLayoutCompat, appBarLayout, toolbar, recyclerView);
                    setContentView(linearLayoutCompat);
                    f fVar = this.f19010O;
                    if (fVar == null) {
                        i.g("binding");
                        throw null;
                    }
                    AppBarLayout appBarLayout2 = fVar.f2252c;
                    if (fVar == null) {
                        i.g("binding");
                        throw null;
                    }
                    d.a(appBarLayout2, fVar.f2253d);
                    f fVar2 = this.f19010O;
                    if (fVar2 == null) {
                        i.g("binding");
                        throw null;
                    }
                    Toolbar toolbar2 = fVar2.f2254e;
                    B(toolbar2);
                    com.bumptech.glide.d dVarR = r();
                    if (dVarR != null) {
                        dVarR.S(true);
                    }
                    toolbar2.setNavigationOnClickListener(new B4.g(15, this));
                    f fVar3 = this.f19010O;
                    if (fVar3 == null) {
                        i.g("binding");
                        throw null;
                    }
                    RecyclerView recyclerView2 = fVar3.f2253d;
                    recyclerView2.g(new C0314k(this));
                    q qVar = this.f19011P;
                    recyclerView2.setAdapter(qVar);
                    qVar.n(R.layout.empty_no_data2);
                    qVar.p(this.f19013R);
                    qVar.f4672f = new S4.p(this);
                    qVar.f4674h = new S4.p(this);
                    g gVar = qVar.i;
                    if (gVar == null) {
                        throw new IllegalStateException("Please first implements LoadMoreModule");
                    }
                    gVar.f1800e = new S4.p(this);
                    gVar.e();
                    C();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
