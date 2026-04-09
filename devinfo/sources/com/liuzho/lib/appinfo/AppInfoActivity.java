package com.liuzho.lib.appinfo;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import b5.s;
import b5.u0;
import com.google.android.material.tabs.TabLayout;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import eg.d;
import i.b;
import i.g;
import i0.f;
import java.util.HashMap;
import java.util.WeakHashMap;
import je.u;
import km.i;
import o.e;
import sh.j;
import t7.m;
import ui.y;
import z2.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AppInfoActivity extends g {
    public static final /* synthetic */ int I = 0;
    public e A;
    public y B;
    public ti.a C;
    public ViewPager D;
    public int E;
    public f F;
    public final k G = (k) a.a.f3c.f189b;
    public n.a H;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a extends s {

        /* renamed from: p0, reason: collision with root package name */
        public String f21397p0;

        /* renamed from: q0, reason: collision with root package name */
        public boolean f21398q0;

        public static a j0(u0 u0Var, String str) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("progress", str);
            aVar.Z(bundle);
            aVar.h0(u0Var, aVar.toString());
            aVar.f0(false);
            return aVar;
        }

        @Override // b5.s, b5.z
        public final void O(Bundle bundle) {
            super.O(bundle);
            bundle.putString("progress", this.f21397p0);
        }

        @Override // b5.s
        public final Dialog e0(Bundle bundle) {
            Bundle bundle2 = this.g;
            if (bundle2 != null) {
                this.f21397p0 = bundle2.getString("progress");
            }
            if (bundle != null) {
                String string = bundle.getString("progress");
                if (!TextUtils.isEmpty(string)) {
                    this.f21397p0 = string;
                }
            }
            m mVar = new m(W());
            b bVar = (b) mVar.f34474c;
            mVar.y(R.string.appi_exporting_apk_file);
            bVar.f25235f = this.f21397p0;
            mVar.w(R.string.appi_stop, new d(9, this));
            bVar.f25240m = false;
            i.e eVarF = mVar.f();
            eVarF.setOnShowListener(new eg.e(eVarF, 3));
            return eVarF;
        }
    }

    public static void B(Context context, int i4, String str) {
        Intent intent = new Intent(context, (Class<?>) AppInfoActivity.class);
        intent.putExtra("pkg", str);
        intent.putExtra("index", i4);
        context.startActivity(intent);
    }

    public final void A() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad_container);
        viewGroup.setVisibility(8);
        viewGroup.removeAllViews();
        findViewById(R.id.top_shadow).setVisibility(8);
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        a4.d dVar = a.a.f3c;
        dVar.getClass();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
        if (!sharedPreferences.getBoolean("can_show_rate_dialog", true) || sharedPreferences.getInt("enter_appinfo_count", 0) != 3 || dVar.f188a) {
            super.onBackPressed();
        } else {
            new i(15, this).z("appinfo_back");
            dVar.f188a = true;
        }
    }

    @Override // i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchFieldException, SecurityException {
        super.onCreate(bundle);
        int i4 = d.m.f21627a;
        d.m.a(this);
        String stringExtra = getIntent().getStringExtra("pkg");
        if (!nh.a.l(this, stringExtra)) {
            Toast.makeText(this, R.string.appi_activity_not_found, 0).show();
            finish();
            return;
        }
        this.F = new f(this, this);
        this.E = getIntent().getIntExtra("index", -1);
        setContentView(R.layout.appi_app_info_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a.a.f3c.getClass();
        if (toolbar != null) {
            zh.i.e(toolbar);
        }
        z(toolbar);
        wd.b bVarR = r();
        int i10 = 1;
        if (bVarR != null) {
            bVarR.Q(true);
        }
        new Thread(new k1.b(20, this, stringExtra)).start();
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.D = viewPager;
        HashMap map = dj.b.f22274a;
        nk.k.e(viewPager, "vp");
        k kVar = this.G;
        nk.k.e(kVar, "handler");
        viewPager.getContext();
        dj.b.r(viewPager, com.liuzh.deviceinfo.utilities.f.d());
        this.C = new ti.a(this, s(), 0);
        dj.b.j((ProgressBar) findViewById(R.id.progressBar), kVar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        Object obj = a.a.f3c.f189b;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        tabLayout.setBackgroundColor(com.liuzh.deviceinfo.utilities.f.d());
        tabLayout.setSelectedTabIndicatorColor(com.liuzh.deviceinfo.utilities.f.a());
        tabLayout.setTabTextColors(TabLayout.d(-1996488705, -1));
        tabLayout.setBackgroundColor(0);
        tabLayout.setTabTextColors(TabLayout.d(cm.g.m(android.R.attr.textColorSecondary, this).getDefaultColor(), cm.g.m(android.R.attr.textColorPrimary, this).getDefaultColor()));
        tabLayout.setElevation(0.0f);
        tabLayout.k(this.D, false);
        a.a.f3c.getClass();
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            A();
        } else {
            a.a.f3c.getClass();
            pi.a aVar = ag.a.f359b;
            if (aVar == null) {
                A();
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad_container);
                a.a.f3c.getClass();
                pd.b.p(viewGroup, false);
                u.k(this, new j(i10, this, viewGroup), aVar);
            }
        }
        a.a.f3c.getClass();
        SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
        int i11 = sharedPreferences.getInt("enter_appinfo_count", 0);
        if (i11 < Integer.MAX_VALUE) {
            i11++;
        }
        sharedPreferences.edit().putInt("enter_appinfo_count", i11).apply();
        View viewFindViewById = findViewById(R.id.container);
        ah.d dVar = new ah.d(this, toolbar, tabLayout, 19);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById, dVar);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 1, R.string.appi_view_in_sys_settings).setShowAsAction(0);
        menu.add(0, 2, 2, R.string.appi_share_apk).setShowAsAction(0);
        menu.add(0, 3, 3, R.string.appi_export_apk).setShowAsAction(0);
        menu.add(0, 4, 4, R.string.appi_view_manifest).setShowAsAction(0);
        menu.add(0, 5, 5, R.string.appi_save_icon).setShowAsAction(0);
        menu.add(0, 6, 6, R.string.appi_show_in_gp).setShowAsAction(0);
        a.a.f3c.getClass();
        if (mg.d.f29373b) {
            menu.add(0, 7, 7, R.string.appi_uninstall).setShowAsAction(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.H;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        y yVar = this.B;
        if (yVar == null || !nh.a.l(this, yVar.f35480b)) {
            Toast.makeText(this, R.string.appi_failed, 0).show();
            finish();
            return true;
        }
        if (itemId == 1) {
            nh.a.j(this, this.B.f35480b);
            return true;
        }
        if (itemId == 6) {
            ci.b.r(this, this.B.f35480b);
            return true;
        }
        if (itemId == 2) {
            f.S(this, this.B.f35488l);
            return true;
        }
        if (itemId == 3) {
            this.F.getClass();
            a aVarJ0 = a.j0(s(), "0/" + this.B.f35492p);
            y yVar2 = this.B;
            String strD = f.D(yVar2.f35480b, yVar2.f35489m, yVar2.f35483e);
            f fVar = this.F;
            y yVar3 = this.B;
            com.liuzho.lib.appinfo.a aVar = new com.liuzho.lib.appinfo.a(this, aVarJ0, strD);
            fVar.getClass();
            fVar.f25417c = new com.applovin.impl.sdk.ad.f(24, yVar3, aVar);
            try {
                ((f.d) fVar.f25418d).a(strD);
                return true;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText((Context) fVar.f25416b, R.string.appi_failed, 0).show();
                return true;
            }
        }
        if (itemId == 4) {
            y yVar4 = this.B;
            String str = yVar4.f35480b;
            String str2 = "manifest_" + str + "_" + yVar4.f35483e + ".xml";
            Intent intent = new Intent(this, (Class<?>) ManifestActivity.class);
            intent.putExtra("pkg", str);
            intent.putExtra("fileName", str2);
            startActivity(intent);
            return true;
        }
        if (itemId == 5) {
            y yVar5 = this.B;
            Drawable drawable = yVar5.f35495s;
            if (drawable == null) {
                Toast.makeText(this, R.string.appi_failed, 0).show();
                return true;
            }
            String str3 = "icon_" + yVar5.f35480b + "_" + yVar5.f35483e + ".png";
            f fVar2 = this.F;
            km.y yVar6 = new km.y(this, str3);
            fVar2.getClass();
            fVar2.f25417c = new ah.d(fVar2, drawable, yVar6, 21);
            try {
                ((f.d) fVar2.f25418d).a(str3);
            } catch (ActivityNotFoundException unused2) {
                Toast.makeText((Context) fVar2.f25416b, R.string.appi_failed, 0).show();
            }
        } else {
            if (itemId != 7) {
                return super.onOptionsItemSelected(menuItem);
            }
            String str4 = this.B.f35480b;
            Intent intent2 = new Intent("android.intent.action.DELETE");
            intent2.setData(Uri.parse("package:".concat(str4)));
            intent2.addFlags(268435456);
            try {
                startActivity(intent2);
                return true;
            } catch (ActivityNotFoundException unused3) {
                Toast.makeText(this, R.string.bu_activity_not_found, 0).show();
            } catch (SecurityException unused4) {
                Toast.makeText(this, R.string.bu_permission_denied, 0).show();
            }
        }
        return true;
    }
}
