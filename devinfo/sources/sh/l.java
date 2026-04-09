package sh;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.card.CpuStatusCard;
import com.liuzh.deviceinfo.card.PercentCardGroup;
import com.liuzh.deviceinfo.card.RamUsageCard;
import com.liuzh.deviceinfo.card.SensorAppCard;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class l extends a implements ah.n {

    /* renamed from: a0, reason: collision with root package name */
    public RamUsageCard f33717a0;

    /* renamed from: b0, reason: collision with root package name */
    public CpuStatusCard f33718b0;

    /* renamed from: c0, reason: collision with root package name */
    public PercentCardGroup f33719c0;

    /* renamed from: f0, reason: collision with root package name */
    public View f33722f0;

    /* renamed from: g0, reason: collision with root package name */
    public SensorAppCard f33723g0;

    /* renamed from: h0, reason: collision with root package name */
    public zg.b f33724h0;

    /* renamed from: i0, reason: collision with root package name */
    public n.a f33725i0;
    public final Handler Z = new Handler();

    /* renamed from: d0, reason: collision with root package name */
    public boolean f33720d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    public final o1 f33721e0 = new o1(4, this);

    /* renamed from: j0, reason: collision with root package name */
    public boolean f33726j0 = false;

    public static void j0(String str) {
        cg.a.f2848b.f(r5.c.g("card", str), "dash_card_cli");
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f33724h0 = zg.c.g(W(), this, new h(this));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, Resources.NotFoundException, SecurityException {
        int i4 = 1;
        if (this.f33722f0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_dashboard, viewGroup, false);
            this.f33722f0 = viewInflate;
            View viewFindViewById = viewInflate.findViewById(R.id.tools_container);
            viewFindViewById.findViewById(R.id.tool_widget).setOnClickListener(new e(this, i4));
            viewFindViewById.findViewById(R.id.tool_monitor).setOnClickListener(new e(this, 2));
            viewFindViewById.findViewById(R.id.tool_test).setOnClickListener(new e(this, 3));
            ScrollView scrollView = (ScrollView) this.f33722f0;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m(scrollView, com.liuzh.deviceinfo.utilities.f.d());
        }
        this.f33726j0 = false;
        h0();
        bi.d.c(new g(this, i4));
        return this.f33722f0;
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        n.a aVar = this.f33725i0;
        if (aVar != null) {
            aVar.b();
            this.f33725i0 = null;
        }
    }

    @Override // b5.z
    public final void I() {
        this.F = true;
        ah.o.f400d.h(this);
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        this.Z.removeCallbacks(this.f33721e0);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        Handler handler = this.Z;
        o1 o1Var = this.f33721e0;
        handler.removeCallbacks(o1Var);
        o1Var.run();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            i0();
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ah.o.f400d.b(this);
        int i4 = 0;
        k kVar = new k(i4, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, kVar);
        if (this.f33717a0 == null) {
            this.f33717a0 = (RamUsageCard) view.findViewById(R.id.card_ram_usage);
        }
        if (this.f33718b0 == null) {
            this.f33718b0 = (CpuStatusCard) view.findViewById(R.id.card_cpu_status);
        }
        if (this.f33719c0 == null) {
            this.f33719c0 = (PercentCardGroup) view.findViewById(R.id.percent_card_container);
        }
        if (this.f33723g0 == null) {
            SensorAppCard sensorAppCard = (SensorAppCard) view.findViewById(R.id.sensor_app_card);
            this.f33723g0 = sensorAppCard;
            sensorAppCard.setSensorCardClick(new e(this, i4));
            this.f33723g0.setAppCardClick(new h(this));
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_soc_name);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_soc_icon);
        p6.i iVarQ = ii.a.q();
        if (iVarQ == null) {
            imageView.setImageDrawable(z2.k.a());
            textView.setText(R.string.cpu_status);
            bi.d.c(new rh.d(textView, imageView));
            return;
        }
        textView.setText(ii.a.C(iVarQ.K() + " " + iVarQ.F()));
        int iD = iVarQ.D();
        if (iD == R.drawable.ic_cpu) {
            imageView.setImageDrawable(z2.k.a());
        } else {
            imageView.setImageResource(iD);
        }
    }

    public final void h0() throws Resources.NotFoundException {
        TimeUnit timeUnit;
        PackageManager packageManager;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
        long j = jCurrentTimeMillis - sharedPreferences.getLong("dev_first_run_time", 0L);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        if (j > timeUnit2.toMillis(1L)) {
            com.liuzh.deviceinfo.utilities.f.l(sharedPreferences.getInt("check_show_dashboard_recommend_card_count", 0) + 1, "check_show_dashboard_recommend_card_count");
            int i4 = sharedPreferences.getInt("check_show_dashboard_recommend_card_count", 0);
            int iNextInt = sharedPreferences.getInt("can_show_dashboard_recommend_card_count", 0);
            if (iNextInt == 0) {
                iNextInt = new Random().nextInt(3) + 3;
                com.liuzh.deviceinfo.utilities.f.l(iNextInt, "can_show_dashboard_recommend_card_count");
            }
            if (i4 >= iNextInt) {
                com.liuzh.deviceinfo.utilities.f.l(new Random().nextInt(3) + 3, "can_show_dashboard_recommend_card_count");
                com.liuzh.deviceinfo.utilities.f.l(0, "check_show_dashboard_recommend_card_count");
                final ViewGroup viewGroup = (ViewGroup) this.f33722f0.findViewById(R.id.ad_container);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - sharedPreferences.getLong("last_show_dashboard_recommend_card_time_".concat("storageana"), 0L) >= timeUnit2.toMillis(2L)) {
                    Context contextW = W();
                    vg.c cVar = new vg.c();
                    cVar.f36221a = contextW.getApplicationContext();
                    cVar.d();
                    timeUnit = timeUnit2;
                    double d10 = cVar.f36225e;
                    if (d10 >= 50.0d) {
                        final boolean z3 = d10 >= 70.0d;
                        viewGroup.removeAllViews();
                        LayoutInflater.from(W()).inflate(R.layout.card_recommend_storage_ana, viewGroup);
                        ((TextView) viewGroup.findViewById(R.id.title)).setTextColor(com.liuzh.deviceinfo.utilities.f.d());
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sh.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean zD = zg.c.d(view.getContext());
                                l lVar = this.f33691a;
                                if (zD) {
                                    lVar.k0();
                                } else if (zg.c.i(lVar)) {
                                    lVar.f33724h0.e();
                                    zg.c.e();
                                } else {
                                    rg.f.j0(R.string.storage_analyze_permission_summary, lVar);
                                }
                                Bundle bundleG = r5.c.g("card", "storageana");
                                bundleG.putString("style", z3 ? "high" : "low");
                                cg.a.f2848b.f(bundleG, "rec_card_click");
                            }
                        };
                        viewGroup.findViewById(R.id.recommend_card_container).setOnClickListener(onClickListener);
                        View viewFindViewById = viewGroup.findViewById(R.id.btn);
                        viewFindViewById.setBackground(wb.e.M(viewFindViewById.getBackground(), com.liuzh.deviceinfo.utilities.f.d()));
                        viewFindViewById.setOnClickListener(onClickListener);
                        final int i10 = 0;
                        viewGroup.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener(this) { // from class: sh.f

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ l f33677b;

                            {
                                this.f33677b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i11 = i10;
                                ViewGroup viewGroup2 = viewGroup;
                                l lVar = this.f33677b;
                                switch (i11) {
                                    case 0:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                    case 1:
                                        Context contextW2 = lVar.W();
                                        int i12 = AppsAnalyzeActivity.S;
                                        Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                                        intent.putExtra("type", 2);
                                        contextW2.startActivity(intent);
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        lVar.f33720d0 = false;
                                        cg.a.f2848b.f(r5.c.g("card", "appana"), "rec_card_click");
                                        break;
                                    default:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                }
                            }
                        });
                        TextView textView = (TextView) viewGroup.findViewById(R.id.summary);
                        String strJ = r5.c.j((int) cVar.f36225e, "%", new StringBuilder());
                        String string = t().getString(z3 ? R.string.recommend_summary_storageana1 : R.string.recommend_summary_storageana, strJ);
                        SpannableString spannableString = new SpannableString(string);
                        int iIndexOf = string.indexOf(strJ);
                        int length = strJ.length() + iIndexOf;
                        spannableString.setSpan(new ForegroundColorSpan(-65536), iIndexOf, length, 34);
                        spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 34);
                        spannableString.setSpan(new AbsoluteSizeSpan(z3 ? 17 : 15, true), iIndexOf, length, 34);
                        textView.setText(spannableString);
                        com.liuzh.deviceinfo.utilities.f.j("storageana");
                        viewGroup.setVisibility(0);
                        Bundle bundle = new Bundle();
                        bundle.putString("card", "storageana");
                        bundle.putString("style", z3 ? "high" : "low");
                        cg.a.f2848b.f(bundle, "rec_card_show");
                    }
                    this.f33720d0 = true;
                    return;
                }
                timeUnit = timeUnit2;
                if (jCurrentTimeMillis2 - sharedPreferences.getLong("last_show_dashboard_recommend_card_time_".concat("appana"), 0L) >= timeUnit.toMillis(2L) && (packageManager = W().getPackageManager()) != null) {
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                    int size = installedApplications == null ? 0 : installedApplications.size();
                    if (size > 168) {
                        com.liuzh.deviceinfo.utilities.f.j("appana");
                        viewGroup.removeAllViews();
                        LayoutInflater.from(W()).inflate(R.layout.card_recommend_storage_ana, viewGroup);
                        ((TextView) viewGroup.findViewById(R.id.title)).setTextColor(com.liuzh.deviceinfo.utilities.f.d());
                        TextView textView2 = (TextView) viewGroup.findViewById(R.id.summary);
                        final int i11 = 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: sh.f

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ l f33677b;

                            {
                                this.f33677b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i112 = i11;
                                ViewGroup viewGroup2 = viewGroup;
                                l lVar = this.f33677b;
                                switch (i112) {
                                    case 0:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                    case 1:
                                        Context contextW2 = lVar.W();
                                        int i12 = AppsAnalyzeActivity.S;
                                        Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                                        intent.putExtra("type", 2);
                                        contextW2.startActivity(intent);
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        lVar.f33720d0 = false;
                                        cg.a.f2848b.f(r5.c.g("card", "appana"), "rec_card_click");
                                        break;
                                    default:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                }
                            }
                        };
                        String strValueOf = String.valueOf(size);
                        String string2 = t().getString(R.string.recommend_summary_appaana, strValueOf);
                        SpannableString spannableString2 = new SpannableString(string2);
                        int iIndexOf2 = string2.indexOf(strValueOf);
                        int length2 = strValueOf.length() + iIndexOf2;
                        spannableString2.setSpan(new ForegroundColorSpan(-65536), iIndexOf2, length2, 34);
                        spannableString2.setSpan(new StyleSpan(1), iIndexOf2, length2, 34);
                        spannableString2.setSpan(new AbsoluteSizeSpan(17, true), iIndexOf2, length2, 34);
                        textView2.setText(spannableString2);
                        final int i12 = 2;
                        viewGroup.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener(this) { // from class: sh.f

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ l f33677b;

                            {
                                this.f33677b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i112 = i12;
                                ViewGroup viewGroup2 = viewGroup;
                                l lVar = this.f33677b;
                                switch (i112) {
                                    case 0:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                    case 1:
                                        Context contextW2 = lVar.W();
                                        int i122 = AppsAnalyzeActivity.S;
                                        Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                                        intent.putExtra("type", 2);
                                        contextW2.startActivity(intent);
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        lVar.f33720d0 = false;
                                        cg.a.f2848b.f(r5.c.g("card", "appana"), "rec_card_click");
                                        break;
                                    default:
                                        lVar.f33720d0 = false;
                                        viewGroup2.removeAllViews();
                                        viewGroup2.setVisibility(8);
                                        break;
                                }
                            }
                        });
                        viewGroup.findViewById(R.id.recommend_card_container).setOnClickListener(onClickListener2);
                        View viewFindViewById2 = viewGroup.findViewById(R.id.btn);
                        viewFindViewById2.setBackground(wb.e.M(viewFindViewById2.getBackground(), com.liuzh.deviceinfo.utilities.f.d()));
                        viewFindViewById2.setOnClickListener(onClickListener2);
                        viewGroup.setVisibility(0);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("card", "appana");
                        cg.a.f2848b.f(bundle2, "rec_card_show");
                        this.f33720d0 = true;
                        return;
                    }
                }
            }
        }
        this.f33720d0 = false;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            return;
        }
        pi.a aVarC = ag.a.c(R.layout.ad_native_dashboard);
        cg.a.f2848b.f(r5.c.g("action", "load"), "ad_tab_dashboard");
        CardView cardView = (CardView) this.f33722f0.findViewById(R.id.ad_container);
        pd.b.p(cardView, false);
        je.u.k(W(), new j(0, this, cardView), aVarC);
    }

    @Override // ah.n
    public final void i(boolean z3) throws Resources.NotFoundException {
        if (z3) {
            i0();
        } else {
            h0();
        }
    }

    public final void i0() {
        if (c0() || this.f33720d0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f33722f0.findViewById(R.id.ad_container);
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        n.a aVar = this.f33725i0;
        if (aVar != null) {
            aVar.b();
            this.f33725i0 = null;
        }
    }

    public final void k0() {
        Context contextW = W();
        String str = com.liuzh.deviceinfo.utilities.c.f21249b;
        int i4 = StorageAnalyzeActivity.C;
        Intent intent = new Intent(contextW, (Class<?>) StorageAnalyzeActivity.class);
        intent.putExtra("analyze_path", str);
        contextW.startActivity(intent);
        ViewGroup viewGroup = (ViewGroup) this.f33722f0.findViewById(R.id.ad_container);
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        this.f33720d0 = false;
    }
}
