package com.liuzh.deviceinfo;

import ah.n;
import ah.o;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import androidx.viewpager.widget.ViewPager;
import b5.u0;
import com.google.android.material.tabs.TabLayout;
import com.liuzh.deviceinfo.notification.NotificationService;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.y;
import d.m;
import dj.b;
import e4.m0;
import e4.v0;
import hg.a;
import ig.l;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import jd.h;
import km.i;
import nk.v;
import qh.k;
import sh.c0;
import sh.e0;
import zf.e;
import zf.f;
import zf.g;
import zg.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class MainActivity extends a implements n {
    public static final /* synthetic */ int N = 0;
    public ViewPager B;
    public TabLayout C;
    public ti.a D;
    public sh.a F;
    public long M;
    public final ArrayList E = new ArrayList();
    public final f1 G = new f1(v.a(g.class), new e(this, 1), new e(this, 0), new e(this, 2));
    public final k H = new k(this, 1);
    public final f I = new f(this);
    public final int J = 1;
    public final int K = 2;
    public final int L = 3;

    public final g D() {
        return (g) this.G.getValue();
    }

    public final void E(Class cls) {
        ArrayList arrayList = this.E;
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
            if (nk.k.a(((c0) obj).f33652a, cls)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            ViewPager viewPager = this.B;
            if (viewPager == null) {
                nk.k.k("mViewPager");
                throw null;
            }
            viewPager.f1591u = false;
            viewPager.u(i4, 0, true, false);
        }
    }

    public final void F(boolean z3) {
        String string = getString(R.string.app_name);
        nk.k.b(string);
        if (!z3) {
            setTitle(string);
            return;
        }
        setTitle(string + " " + getString(R.string.pro));
    }

    public final void G() {
        boolean zK = d.k();
        TabLayout tabLayout = this.C;
        if (tabLayout == null) {
            nk.k.k("mTabLayout");
            throw null;
        }
        int tabCount = tabLayout.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout tabLayout2 = this.C;
            if (tabLayout2 == null) {
                nk.k.k("mTabLayout");
                throw null;
            }
            h hVarF = tabLayout2.f(i4);
            nk.k.b(hVarF);
            if (zK) {
                y.j(1.12f, hVarF.f27511e);
                hVarF.f27511e.setNextFocusUpId(R.id.toolbar);
            } else {
                hVarF.f27511e.setOnLongClickListener(this.H);
            }
        }
    }

    @Override // ah.n
    public final void i(boolean z3) {
        invalidateOptionsMenu();
        F(z3);
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() throws Resources.NotFoundException {
        sh.a aVar = this.F;
        if (aVar == null || !aVar.d0()) {
            ViewPager viewPager = this.B;
            if (viewPager == null) {
                nk.k.k("mViewPager");
                throw null;
            }
            if (viewPager.getCurrentItem() != 0) {
                ViewPager viewPager2 = this.B;
                if (viewPager2 == null) {
                    nk.k.k("mViewPager");
                    throw null;
                }
                viewPager2.f1591u = false;
                viewPager2.u(0, 0, true, false);
                return;
            }
            if (!D().f38268b) {
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
                if (!sharedPreferences.getBoolean("rate_scene_shown_home_back", false) && System.currentTimeMillis() - sharedPreferences.getLong("last_rate_dialog_shown_time", 0L) >= 172800000 && System.currentTimeMillis() - sharedPreferences.getLong("dev_first_run_time", 0L) >= 14400000) {
                    new i(15, this).z("home_back");
                    D().f38268b = true;
                    return;
                }
            }
            g gVarD = D();
            if (!o.f400d.c() && !gVarD.f38268b && !gVarD.f38269c && gVarD.f38270d != null && System.currentTimeMillis() - gVarD.f38271e <= 10800000) {
                yj.n nVar = kh.a.f28294a;
                mh.a aVar2 = (mh.a) kh.a.b(mh.a.f29378d, "di_confirm_ad");
                if (aVar2.a()) {
                    com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences2 = com.liuzh.deviceinfo.utilities.f.f21257c;
                    long j = jCurrentTimeMillis - sharedPreferences2.getLong("last_inter_ad_show_time", 0L);
                    long j8 = 1000;
                    if (j < aVar2.b() * j8) {
                        long j9 = j / j8;
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - sharedPreferences2.getLong("last_exit_confirm_dialog_show_time", 0L);
                        if (jCurrentTimeMillis2 >= aVar2.c() * j8) {
                            u0 u0VarS = s();
                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                            if (!u0VarS.P() && u0VarS.D("ExitConfirmDialog") == null) {
                                b5.a aVar3 = new b5.a(u0VarS);
                                aVar3.h(0, new tg.g(), "ExitConfirmDialog", 1);
                                aVar3.e();
                                cg.a aVar4 = cg.a.f2848b;
                                Bundle bundle = new Bundle();
                                bundle.putString("action", "show");
                                aVar4.f(bundle, "exitcfm_dialog");
                            }
                            D().f38269c = true;
                            sharedPreferences2.edit().putLong("last_exit_confirm_dialog_show_time", System.currentTimeMillis()).apply();
                            return;
                        }
                        long j10 = jCurrentTimeMillis2 / j8;
                    }
                }
            }
            if (System.currentTimeMillis() - this.M < 3000) {
                super.onBackPressed();
            } else {
                Toast.makeText(this, R.string.press_back_again_exit, 0).show();
                this.M = System.currentTimeMillis();
            }
        }
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchFieldException, SecurityException {
        super.onCreate(bundle);
        m.a(this);
        setContentView(R.layout.activity_device_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setOverflowIcon(jm.a.l(R.drawable.ic_overflow_menu, this));
        z(toolbar);
        View viewFindViewById = findViewById(R.id.topbar);
        ph.d dVar = new ph.d(9, viewFindViewById);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById, dVar);
        F(o.f400d.c());
        ArrayList arrayList = this.E;
        arrayList.clear();
        List listB = e0.b();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listB) {
            if (((c0) obj).f33655d) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = zh.i.f38298a;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        View viewFindViewById2 = findViewById(R.id.view_pager);
        nk.k.d(viewFindViewById2, "findViewById(...)");
        ViewPager viewPager = (ViewPager) viewFindViewById2;
        this.B = viewPager;
        viewPager.setOffscreenPageLimit(1);
        ViewPager viewPager2 = this.B;
        if (viewPager2 == null) {
            nk.k.k("mViewPager");
            throw null;
        }
        b.r(viewPager2, iD);
        ti.a aVar = new ti.a(this, s(), 1);
        this.D = aVar;
        ViewPager viewPager3 = this.B;
        if (viewPager3 == null) {
            nk.k.k("mViewPager");
            throw null;
        }
        viewPager3.setAdapter(aVar);
        ViewPager viewPager4 = this.B;
        if (viewPager4 == null) {
            nk.k.k("mViewPager");
            throw null;
        }
        zf.d dVar2 = new zf.d(this);
        if (viewPager4.Q == null) {
            viewPager4.Q = new ArrayList();
        }
        viewPager4.Q.add(dVar2);
        D().g(0);
        View viewFindViewById3 = findViewById(R.id.tab_layout);
        nk.k.d(viewFindViewById3, "findViewById(...)");
        this.C = (TabLayout) viewFindViewById3;
        int iL = cm.g.l(android.R.attr.textColorSecondary, this);
        int iA = b.a(0.92f, iD, -16777216);
        TabLayout tabLayout = this.C;
        if (tabLayout == null) {
            nk.k.k("mTabLayout");
            throw null;
        }
        tabLayout.setTabTextColors(TabLayout.d(iL, iA));
        TabLayout tabLayout2 = this.C;
        if (tabLayout2 == null) {
            nk.k.k("mTabLayout");
            throw null;
        }
        tabLayout2.setSelectedTabIndicatorColor(iD);
        TabLayout tabLayout3 = this.C;
        if (tabLayout3 == null) {
            nk.k.k("mTabLayout");
            throw null;
        }
        ViewPager viewPager5 = this.B;
        if (viewPager5 == null) {
            nk.k.k("mViewPager");
            throw null;
        }
        tabLayout3.setupWithViewPager(viewPager5);
        G();
        List list = e0.f33672a;
        f fVar2 = this.I;
        nk.k.e(fVar2, "listener");
        e0.f33675d.add(fVar2);
        com.liuzh.deviceinfo.utilities.f.l(com.liuzh.deviceinfo.utilities.f.f21257c.getInt("home_open_count", 0) + 1, "home_open_count");
        o.f400d.b(this);
        ViewPager viewPager6 = this.B;
        if (viewPager6 == null) {
            nk.k.k("mViewPager");
            throw null;
        }
        viewPager6.post(new l(28, this));
        cg.a aVar2 = cg.a.f2848b;
        aVar2.f(null, "home_open");
        aVar2.g();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        nk.k.e(menu, "menu");
        if (!o.f400d.c()) {
            boolean z3 = mg.d.f29372a;
            menu.add(0, this.L, 0, R.string.pro).setShowAsActionFlags(2).setIcon(R.drawable.ic_pro_toolbar);
        }
        menu.add(0, this.J, 9, R.string.settings).setShowAsActionFlags(2).setIcon(R.drawable.ic_settings);
        if (!d.k()) {
            menu.add(0, this.K, 10, R.string.tab_manager).setShowAsActionFlags(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o.f400d.h(this);
        List list = e0.f33672a;
        f fVar = this.I;
        nk.k.e(fVar, "listener");
        e0.f33675d.remove(fVar);
    }

    @Override // hg.a, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        nk.k.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == this.J) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
            return true;
        }
        if (itemId == this.K) {
            u0 u0VarS = s();
            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
            i7.b.y(u0VarS);
            return true;
        }
        if (itemId != this.L) {
            return super.onOptionsItemSelected(menuItem);
        }
        ProActivity.D(this);
        return true;
    }

    @Override // hg.a, i.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("show_overview_notification", true) && c.c()) {
            NotificationService.d(this);
        }
    }
}
