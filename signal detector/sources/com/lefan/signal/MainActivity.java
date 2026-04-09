package com.lefan.signal;

import A2.C0115c;
import D4.c;
import J3.k;
import R.F;
import R.O;
import R3.d;
import R3.e;
import R3.f;
import V2.h;
import V3.a;
import a4.p;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import c.AbstractC0391p;
import c1.g;
import c3.j;
import c5.C0410g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.play.core.install.zza;
import com.lefan.signal.MainActivity;
import d5.v;
import d5.y;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import i4.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.AbstractComponentCallbacksC2617v;
import p4.C2778e;
import p4.C2779f;
import p4.C2780g;
import q0.z;
import q4.C2857a;
import q5.i;
import q5.l;
import t0.C2902a;
import t0.C2903b;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC2349g {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f18804V = 0;

    /* renamed from: P, reason: collision with root package name */
    public d f18806P;

    /* renamed from: S, reason: collision with root package name */
    public g f18809S;

    /* renamed from: T, reason: collision with root package name */
    public h f18810T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f18811U;

    /* renamed from: O, reason: collision with root package name */
    public final C0410g f18805O = new C0410g(new c(13, this));

    /* renamed from: Q, reason: collision with root package name */
    public final C2779f f18807Q = new a() { // from class: p4.f
        @Override // V3.a
        public final void a(Object obj) {
            int i = MainActivity.f18804V;
            if (((zza) obj).f18619a == 11) {
                this.f22885a.C();
            }
        }
    };

    /* renamed from: R, reason: collision with root package name */
    public final C2291h f18808R = (C2291h) p(new C2314a(4), new b(3));

    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232 A[RETURN] */
    @Override // h.AbstractActivityC2349g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.MainActivity.A():boolean");
    }

    public final void C() {
        k kVarF = k.f(findViewById(R.id.content), getString(com.apm.insight.R.string.update_tip), -2);
        kVarF.g(kVarF.f2117h.getText(com.apm.insight.R.string.restart), new H4.d(this, 1));
        kVarF.h();
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f fVar;
        g gVar;
        TextView textView;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(com.apm.insight.R.layout.activity_main, (ViewGroup) null, false);
        int i3 = com.apm.insight.R.id.app_bar_main;
        View viewE = p.e(com.apm.insight.R.id.app_bar_main, viewInflate);
        if (viewE != null) {
            int i6 = com.apm.insight.R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p.e(com.apm.insight.R.id.app_bar, viewE);
            if (appBarLayout != null) {
                i6 = com.apm.insight.R.id.bottom_view;
                BottomNavigationView bottomNavigationView = (BottomNavigationView) p.e(com.apm.insight.R.id.bottom_view, viewE);
                if (bottomNavigationView != null) {
                    i6 = com.apm.insight.R.id.nav_host_fragment_activity_main;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) p.e(com.apm.insight.R.id.nav_host_fragment_activity_main, viewE);
                    if (fragmentContainerView != null) {
                        Toolbar toolbar = (Toolbar) p.e(com.apm.insight.R.id.toolbar, viewE);
                        if (toolbar != null) {
                            C0115c c0115c = new C0115c((ConstraintLayout) viewE, appBarLayout, bottomNavigationView, fragmentContainerView, toolbar, 2);
                            DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
                            NavigationView navigationView = (NavigationView) p.e(com.apm.insight.R.id.nav_view, viewInflate);
                            if (navigationView != null) {
                                this.f18809S = new g(drawerLayout, c0115c, drawerLayout, navigationView, 4);
                                setContentView(drawerLayout);
                                g gVar2 = this.f18809S;
                                if (gVar2 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                AppBarLayout appBarLayout2 = (AppBarLayout) ((C0115c) gVar2.f5897c).f236c;
                                F4.b bVar = new F4.b(2);
                                WeakHashMap weakHashMap = O.f3270a;
                                F.k(appBarLayout2, bVar);
                                g gVar3 = this.f18809S;
                                if (gVar3 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                F.k((FragmentContainerView) ((C0115c) gVar3.f5897c).f238e, new F4.b(3));
                                g gVar4 = this.f18809S;
                                if (gVar4 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                F.k((NavigationView) gVar4.f5899e, new F4.b(4));
                                synchronized (R3.b.class) {
                                    try {
                                        if (R3.b.f3397a == null) {
                                            Context applicationContext = getApplicationContext();
                                            if (applicationContext == null) {
                                                applicationContext = this;
                                            }
                                            R3.b.f3397a = new f(new e(applicationContext, i));
                                        }
                                        fVar = R3.b.f3397a;
                                    } finally {
                                    }
                                }
                                d dVar = (d) fVar.f3410a.a();
                                this.f18806P = dVar;
                                if (dVar == null) {
                                    i.g("appUpdateManager");
                                    throw null;
                                }
                                dVar.b(this.f18807Q);
                                d dVar2 = this.f18806P;
                                if (dVar2 == null) {
                                    i.g("appUpdateManager");
                                    throw null;
                                }
                                j jVarA = dVar2.a();
                                i.d(jVarA, "getAppUpdateInfo(...)");
                                jVarA.f5912b.i(new c3.h(c3.g.f5903a, new F4.c(22, new C2778e(this, 1))));
                                jVarA.j();
                                com.bumptech.glide.e.r(this);
                                g gVar5 = this.f18809S;
                                if (gVar5 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                B((Toolbar) ((C0115c) gVar5.f5897c).f239f);
                                g gVar6 = this.f18809S;
                                if (gVar6 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                DrawerLayout drawerLayout2 = (DrawerLayout) gVar6.f5898d;
                                i.d(drawerLayout2, "drawerLayout");
                                g gVar7 = this.f18809S;
                                if (gVar7 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                BottomNavigationView bottomNavigationView2 = (BottomNavigationView) ((C0115c) gVar7.f5897c).f237d;
                                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vB = s().B(com.apm.insight.R.id.nav_host_fragment_activity_main);
                                i.b(abstractComponentCallbacksC2617vB);
                                z zVarL = I5.b.l(abstractComponentCallbacksC2617vB);
                                Integer[] numArr = {Integer.valueOf(com.apm.insight.R.id.navigation_phone), Integer.valueOf(com.apm.insight.R.id.navigation_wifi), Integer.valueOf(com.apm.insight.R.id.navigation_other)};
                                LinkedHashSet linkedHashSet = new LinkedHashSet(v.J(3));
                                for (int i7 = 0; i7 < 3; i7++) {
                                    linkedHashSet.add(numArr[i7]);
                                }
                                HashSet hashSet = new HashSet();
                                hashSet.addAll(linkedHashSet);
                                h hVar = new h(hashSet, drawerLayout2, new H4.e());
                                this.f18810T = hVar;
                                i.e(zVarL, "navController");
                                zVarL.b(new C2902a(this, hVar));
                                bottomNavigationView2.setOnItemSelectedListener(new F4.c(25, zVarL));
                                zVarL.b(new C2903b(new WeakReference(bottomNavigationView2), zVarL));
                                y.a(o(), new H4.c(drawerLayout2, i, this));
                                g gVar8 = this.f18809S;
                                if (gVar8 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                ((NavigationView) gVar8.f5899e).setItemIconTintList(null);
                                g gVar9 = this.f18809S;
                                if (gVar9 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                ((TextView) ((NavigationView) gVar9.f5899e).i.f24145b.getChildAt(0).findViewById(com.apm.insight.R.id.app_version)).setText("1.10.90");
                                g gVar10 = this.f18809S;
                                if (gVar10 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                View actionView = ((NavigationView) gVar10.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_language).getActionView();
                                TextView textView2 = actionView != null ? (TextView) actionView.findViewById(com.apm.insight.R.id.menu_language_text) : null;
                                Locale locale = F4.e.f1457a;
                                Locale localeC = F4.e.c(getResources());
                                if (textView2 != null) {
                                    textView2.setText(localeC.getDisplayName());
                                }
                                g gVar11 = this.f18809S;
                                if (gVar11 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                View actionView2 = ((NavigationView) gVar11.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_mode).getActionView();
                                if (actionView2 != null && (textView = (TextView) actionView2.findViewById(com.apm.insight.R.id.menu_language_text)) != null) {
                                    int i8 = h.k.f20347b;
                                    textView.setText(i8 != -1 ? i8 != 1 ? i8 != 2 ? getString(com.apm.insight.R.string.auto_mode) : getString(com.apm.insight.R.string.dark_mode) : getString(com.apm.insight.R.string.light_mode) : getString(com.apm.insight.R.string.auto_mode));
                                }
                                try {
                                    gVar = this.f18809S;
                                } catch (Throwable th) {
                                    R2.a.d(th);
                                }
                                if (gVar == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                ((NavigationView) gVar.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_vip).setVisible(true);
                                g gVar12 = this.f18809S;
                                if (gVar12 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                MenuItem menuItemFindItem = ((NavigationView) gVar12.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_privacy_settings);
                                if (menuItemFindItem != null) {
                                    menuItemFindItem.setVisible(((C2857a) this.f18805O.getValue()).f23280a.b() == 3);
                                }
                                g gVar13 = this.f18809S;
                                if (gVar13 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                ((NavigationView) gVar13.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_record).setVisible(false);
                                g gVar14 = this.f18809S;
                                if (gVar14 == null) {
                                    i.g("binding");
                                    throw null;
                                }
                                MenuItem menuItemFindItem2 = ((NavigationView) gVar14.f5899e).getMenu().findItem(com.apm.insight.R.id.nav_num_locale);
                                menuItemFindItem2.setVisible(!String.format(localeC, "%d", Arrays.copyOf(new Object[]{1}, 1)).equals("1"));
                                View actionView3 = menuItemFindItem2.getActionView();
                                SwitchMaterial switchMaterial = actionView3 != null ? (SwitchMaterial) actionView3.findViewById(com.apm.insight.R.id.main_switch) : null;
                                l lVar = new l();
                                boolean zK = com.bumptech.glide.e.k(this, "number_locale", true);
                                lVar.f23296a = zK;
                                R2.a.f3390d = zK;
                                if (switchMaterial != null) {
                                    switchMaterial.setChecked(zK);
                                }
                                g gVar15 = this.f18809S;
                                if (gVar15 != null) {
                                    ((NavigationView) gVar15.f5899e).setNavigationItemSelectedListener(new H4.b(this, lVar, switchMaterial));
                                    return;
                                } else {
                                    i.g("binding");
                                    throw null;
                                }
                            }
                            i3 = com.apm.insight.R.id.nav_view;
                        } else {
                            i6 = com.apm.insight.R.id.toolbar;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i6)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        d dVar = this.f18806P;
        if (dVar == null) {
            i.g("appUpdateManager");
            throw null;
        }
        C2780g c2780g = new C2780g();
        synchronized (dVar) {
            dVar.f3406b.b(c2780g);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        d dVar = this.f18806P;
        if (dVar == null) {
            i.g("appUpdateManager");
            throw null;
        }
        j jVarA = dVar.a();
        F4.c cVar = new F4.c(21, new C2778e(this, 0));
        jVarA.getClass();
        jVarA.f5912b.i(new c3.h(c3.g.f5903a, cVar));
        jVarA.j();
    }
}
