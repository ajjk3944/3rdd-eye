package com.wifihacker.detector.mvp.view.activity;

import android.app.Dialog;
import android.app.LauncherActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.common.bill.BillingDataSource;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.detector.mvp.view.activity.setting.ProActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.o;
import g8.s;
import java.util.ArrayList;
import l8.q;

/* loaded from: classes3.dex */
public class MainActivity extends BaseActivity<q> implements TabLayout.d {

    /* renamed from: j, reason: collision with root package name */
    public Menu f20346j;

    /* renamed from: k, reason: collision with root package name */
    public s8.c f20347k;

    /* renamed from: l, reason: collision with root package name */
    public int f20348l;

    /* renamed from: m, reason: collision with root package name */
    public int f20349m;

    /* renamed from: o, reason: collision with root package name */
    public long f20351o;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20350n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20352p = false;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20353a;

        public a(Dialog dialog) {
            this.f20353a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20353a.dismiss();
            o.c().n(MainActivity.this, "user_use_times", 8);
            try {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:happyemilyu@outlook.com"));
                intent.putExtra("android.intent.extra.SUBJECT", "WiFi Detector");
                intent.putExtra("android.intent.extra.TEXT", "Send us: ");
                MainActivity.this.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            MainActivity.this.f20350n = true;
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20356a;

        public c(Dialog dialog) {
            this.f20356a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h8.a.f().j(0);
            this.f20356a.dismiss();
            MainActivity.this.finish();
        }
    }

    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20358a;

        public d(Dialog dialog) {
            this.f20358a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20358a.dismiss();
            g8.j.a(MainActivity.this);
        }
    }

    public class e implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20360a;

        public e(Dialog dialog) {
            this.f20360a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20360a.dismiss();
            o.c().n(MainActivity.this, "user_use_times", 8);
            try {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:happyemilyu@outlook.com"));
                intent.putExtra("android.intent.extra.SUBJECT", "WiFi Detector");
                intent.putExtra("android.intent.extra.TEXT", "Send us: ");
                MainActivity.this.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class f implements m8.a {
        public f() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            if (z10 && h8.a.f().d() > 1) {
                h8.a.f().i(3);
            } else if (z10) {
                h8.a.f().i(1);
            } else {
                h8.a.f().i(2);
            }
            MainActivity.this.m0();
        }
    }

    public class g implements m8.a {
        public g() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            if (z10 && h8.a.f().d() > 1) {
                h8.a.f().i(3);
            } else if (z10) {
                h8.a.f().i(1);
            } else {
                h8.a.f().i(2);
            }
            MainActivity.this.m0();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!((t8.a) MainActivity.this.f20347k.a(0)).I() || Build.VERSION.SDK_INT < 30) {
                g8.h.k(MainActivity.this, false, false);
            } else {
                g8.h.k(MainActivity.this, false, true);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) ProActivity.class));
        }
    }

    public class j implements DrawerLayout.e {

        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Dialog f20367a;

            public a(Dialog dialog) {
                this.f20367a = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f20367a.dismiss();
            }
        }

        public class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Dialog f20369a;

            public b(Dialog dialog) {
                this.f20369a = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o.c().n(MainActivity.this, "user_use_times", 8);
                this.f20369a.dismiss();
                g8.j.a(MainActivity.this);
            }
        }

        public class c implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Dialog f20371a;

            public c(Dialog dialog) {
                this.f20371a = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f20371a.dismiss();
                o.c().n(MainActivity.this, "user_use_times", 8);
                try {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:happyemilyu@outlook.com"));
                    intent.putExtra("android.intent.extra.SUBJECT", "WiFi Detector");
                    intent.putExtra("android.intent.extra.TEXT", "Send us: ");
                    MainActivity.this.startActivity(intent);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public j() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            switch (MainActivity.this.f20348l) {
                case 1:
                    MainActivity.this.f20348l = 0;
                    g8.h.m(MainActivity.this);
                    break;
                case 2:
                    MainActivity.this.f20348l = 0;
                    s.s(MainActivity.this);
                    break;
                case 3:
                    MainActivity.this.f20348l = 0;
                    b.a aVar = new b.a(MainActivity.this);
                    View viewInflate = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_rate_us_guide, (ViewGroup) null);
                    aVar.q(viewInflate);
                    androidx.appcompat.app.b bVarA = aVar.a();
                    bVarA.show();
                    viewInflate.findViewById(R.id.im_close).setOnClickListener(new a(bVarA));
                    viewInflate.findViewById(R.id.tv_rate).setOnClickListener(new b(bVarA));
                    viewInflate.findViewById(R.id.tv_tousu).setOnClickListener(new c(bVarA));
                    break;
                case 4:
                    MainActivity.this.f20348l = 0;
                    g8.h.a(MainActivity.this);
                    break;
                case 6:
                    MainActivity.this.f20348l = 0;
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=7040114452287892812")));
                    break;
                case 7:
                    MainActivity.this.f20348l = 0;
                    s.v(MainActivity.this, "com.wifisecurity.whousemywifi.wifirouter.pro");
                    break;
                case 8:
                    MainActivity.this.f20348l = 0;
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://lisyuu.github.io/privacypolicy.html")));
                    break;
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
        }
    }

    public class k implements NavigationView.d {
        public k() {
        }

        @Override // com.google.android.material.navigation.NavigationView.d
        public boolean a(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.menu_about_us /* 2131231336 */:
                    MainActivity.this.f20348l = 4;
                    break;
                case R.id.menu_more_tools /* 2131231338 */:
                    MainActivity.this.f20348l = 6;
                    break;
                case R.id.menu_privacy_policy /* 2131231341 */:
                    MainActivity.this.f20348l = 8;
                    break;
                case R.id.menu_rate_us /* 2131231342 */:
                    MainActivity.this.f20348l = 3;
                    break;
                case R.id.menu_setting /* 2131231344 */:
                    MainActivity.this.f20348l = 1;
                    break;
                case R.id.menu_share /* 2131231345 */:
                    MainActivity.this.f20348l = 2;
                    break;
                case R.id.menu_upgrade /* 2131231347 */:
                    MainActivity.this.f20348l = 7;
                    break;
            }
            ((q) MainActivity.this.f20418i).f23311x.d(8388611);
            return true;
        }
    }

    public class l implements m8.a {
        public l() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            if (z10) {
                MainActivity.this.f20350n = true;
                return;
            }
            MainActivity.super.Y();
            h8.a.f().j(0);
            if (Build.VERSION.SDK_INT >= 30) {
                i8.b.k().q(true);
            }
        }
    }

    public class m implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20375a;

        public m(Dialog dialog) {
            this.f20375a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20375a.dismiss();
        }
    }

    public class n implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20377a;

        public n(Dialog dialog) {
            this.f20377a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.c().n(MainActivity.this, "user_use_times", 8);
            this.f20377a.dismiss();
            g8.j.a(MainActivity.this);
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.app_name);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((q) this.f20418i).A.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_main;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        G().r(false);
        k0();
        l0();
        i0();
        HackerApplication.l().v(System.currentTimeMillis());
        this.f20351o = System.currentTimeMillis();
        int i10 = this.f20349m;
        if (i10 == 1000) {
            s.e(this, new f());
        } else if (i10 == 1001) {
            s.c(this, new g());
        } else {
            m0();
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        j0();
        if (o0()) {
            return;
        }
        if (!this.f20350n && h8.a.f().e() < 3 && System.currentTimeMillis() - this.f20351o > 20000) {
            s.b(this, new l());
            return;
        }
        super.Y();
        h8.a.f().j(0);
        if (Build.VERSION.SDK_INT >= 30) {
            i8.b.k().q(true);
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20349m = getIntent().getIntExtra("adType", 1002);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
        if (BillingDataSource.l(getApplication()).i()) {
            this.f20352p = true;
        }
        ((q) this.f20418i).f23311x.a(new j());
        ((q) this.f20418i).f23312y.setNavigationItemSelectedListener(new k());
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void d(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void f(TabLayout.g gVar) {
        s.l(this, ((q) this.f20418i).A.f23339w, false);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void i(TabLayout.g gVar) {
    }

    public final void i0() {
        int iD = o.c().d(this, "user_use_times", 0);
        if (iD > 10) {
            return;
        }
        o.c().n(this, "user_use_times", iD + 1);
    }

    public final void j0() {
        if (o.c().d(this, "user_use_times", 0) > 3) {
            return;
        }
        if (h8.a.f().e() > 3) {
            o.c().n(this, "user_use_times", 100);
        }
        if (h8.a.f().e() >= 3 || System.currentTimeMillis() - this.f20351o <= 16000) {
            return;
        }
        o.c().n(this, "user_use_times", 3);
    }

    public final void k0() {
        ((q) this.f20418i).f23312y.setItemIconTintList(null);
        ((q) this.f20418i).f23312y.setItemTextColor(ContextCompat.getColorStateList(getApplicationContext(), R.color.navigation_menu_item_color));
        ViewDataBinding viewDataBinding = this.f20418i;
        androidx.appcompat.app.a aVar = new androidx.appcompat.app.a(this, ((q) viewDataBinding).f23311x, ((q) viewDataBinding).A.f23339w, R.string.sliding_open, R.string.sliding_close);
        ((q) this.f20418i).f23311x.a(aVar);
        aVar.i();
    }

    public final void l0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t8.a());
        arrayList.add(new t8.b());
        arrayList.add(new t8.d());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(R.string.tab_device));
        arrayList2.add(getString(R.string.tab_history));
        arrayList2.add(getString(R.string.tab_discover));
        s8.c cVar = new s8.c(z(), arrayList, arrayList2);
        this.f20347k = cVar;
        ((q) this.f20418i).B.setAdapter(cVar);
        ViewDataBinding viewDataBinding = this.f20418i;
        ((q) viewDataBinding).f23313z.setupWithViewPager(((q) viewDataBinding).B);
        ((q) this.f20418i).B.setOffscreenPageLimit(3);
        ((q) this.f20418i).f23313z.h(this);
    }

    public final boolean m0() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            f0.b.d(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 0);
            return false;
        }
        p0();
        return true;
    }

    public void n0() {
        s8.c cVar = this.f20347k;
        if (cVar != null) {
            ((t8.b) cVar.b(1)).j();
        }
    }

    public final boolean o0() {
        if (o.c().d(this, "user_use_times", 0) != 3) {
            return false;
        }
        i0();
        b.a aVar = new b.a(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_rate_us_guide, (ViewGroup) null);
        aVar.q(viewInflate);
        androidx.appcompat.app.b bVarA = aVar.a();
        bVarA.show();
        bVarA.setOnDismissListener(new b());
        viewInflate.findViewById(R.id.im_close).setOnClickListener(new c(bVarA));
        viewInflate.findViewById(R.id.tv_rate).setOnClickListener(new d(bVarA));
        viewInflate.findViewById(R.id.tv_tousu).setOnClickListener(new e(bVarA));
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 2) {
            try {
                ((t8.a) this.f20347k.a(0)).J();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        this.f20346j = menu;
        if (s.t() || !BillingDataSource.l(getApplication()).i()) {
            menu.findItem(R.id.menu_no_ad).setVisible(false);
        } else {
            this.f20352p = true;
            menu.findItem(R.id.menu_no_ad).setVisible(true);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HackerApplication.l().t();
        HackerApplication.l().x(null);
        HackerApplication.l().z(false);
        super.onDestroy();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity, androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_more_tools /* 2131231338 */:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=7040114452287892812")));
                return true;
            case R.id.menu_no_ad /* 2131231339 */:
                g8.h.i(this);
                return true;
            case R.id.menu_phone_cleaner /* 2131231340 */:
                s.v(this, "com.phonecleaner.memorycleaner.fastcharging");
                return true;
            case R.id.menu_privacy_policy /* 2131231341 */:
            case R.id.menu_share /* 2131231345 */:
            case R.id.menu_upgrade /* 2131231347 */:
            default:
                return super.onMenuItemClick(menuItem);
            case R.id.menu_rate_us /* 2131231342 */:
                b.a aVar = new b.a(this);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_rate_us_guide, (ViewGroup) null);
                aVar.q(viewInflate);
                androidx.appcompat.app.b bVarA = aVar.a();
                bVarA.show();
                viewInflate.findViewById(R.id.im_close).setOnClickListener(new m(bVarA));
                viewInflate.findViewById(R.id.tv_rate).setOnClickListener(new n(bVarA));
                viewInflate.findViewById(R.id.tv_tousu).setOnClickListener(new a(bVarA));
                return true;
            case R.id.menu_router_setting /* 2131231343 */:
                g8.h.j(this, true);
                return true;
            case R.id.menu_setting /* 2131231344 */:
                g8.h.m(this);
                return true;
            case R.id.menu_share_us /* 2131231346 */:
                s.s(this);
                return true;
            case R.id.menu_wifi_list /* 2131231348 */:
                s.z(this);
                return true;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) throws Resources.NotFoundException {
        super.onNewIntent(intent);
        ((q) this.f20418i).B.setCurrentItem(0, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (iArr.length <= 0 || iArr[0] != 0) {
            g8.l.f(R.string.wifi_permission);
        } else {
            p0();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o.c().d(this, "user_times", 0);
        if (this.f20346j == null || h8.a.f().e() <= 2) {
            return;
        }
        this.f20346j.findItem(R.id.menu_rate_us).setVisible(false);
        ((q) this.f20418i).f23312y.getMenu().findItem(R.id.menu_rate_us).setVisible(false);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            if (HackerApplication.l().i()) {
                HackerApplication.l().v(System.currentTimeMillis());
                if (!s.t() && !s.o()) {
                    h8.c.d().g();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!this.f20352p || s.t()) {
            return;
        }
        try {
            o.c().n(this, "Pro_Show", o.c().d(this, "Pro_Show", 0) + 1);
            if (o.c().d(this, "Pro_Show", 0) == 3) {
                new Handler().postDelayed(new i(), 500L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            startActivity(new Intent(this, (Class<?>) LauncherActivity.class));
            finish();
        }
    }

    public final void p0() {
        if (s.t()) {
            return;
        }
        new Handler().postDelayed(new h(), 400L);
    }
}
