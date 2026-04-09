package com.phuongpn.whousemywifi.networkscanner;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a30;
import defpackage.e3;
import defpackage.i30;
import defpackage.i5;
import defpackage.m54;
import defpackage.o00;
import defpackage.p00;
import defpackage.p21;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class HelpActivity extends i5 {
    public static final /* synthetic */ int F = 0;
    public p21 C;
    public e3 D;
    public boolean E;

    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_help, (ViewGroup) null, false);
        int i = R.id.adPreLoad;
        FrameLayout frameLayout = (FrameLayout) a30.e(viewInflate, R.id.adPreLoad);
        if (frameLayout != null) {
            i = R.id.adViewContainer;
            FrameLayout frameLayout2 = (FrameLayout) a30.e(viewInflate, R.id.adViewContainer);
            if (frameLayout2 != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) a30.e(viewInflate, R.id.toolbar);
                if (toolbar != null) {
                    i = R.id.tv_solution_3;
                    TextView textView = (TextView) a30.e(viewInflate, R.id.tv_solution_3);
                    if (textView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                        this.C = new p21(coordinatorLayout, frameLayout, frameLayout2, toolbar, textView);
                        i30.l(coordinatorLayout, "getRoot(...)");
                        setContentView(coordinatorLayout);
                        p21 p21Var = this.C;
                        if (p21Var == null) {
                            i30.S("binding");
                            throw null;
                        }
                        w((Toolbar) p21Var.h);
                        m54 m54VarN = n();
                        if (m54VarN != null) {
                            m54VarN.y(true);
                        }
                        e3 e3Var = new e3(this);
                        this.D = e3Var;
                        p21 p21Var2 = this.C;
                        if (p21Var2 == null) {
                            i30.S("binding");
                            throw null;
                        }
                        ((FrameLayout) p21Var2.g).addView(e3Var);
                        p21 p21Var3 = this.C;
                        if (p21Var3 == null) {
                            i30.S("binding");
                            throw null;
                        }
                        int i2 = 0;
                        ((FrameLayout) p21Var3.g).getViewTreeObserver().addOnGlobalLayoutListener(new o00(this, i2));
                        new Handler(Looper.getMainLooper()).postDelayed(new p00(this, i2), 5000L);
                        p21 p21Var4 = this.C;
                        if (p21Var4 != null) {
                            ((TextView) p21Var4.i).setText(getString(R.string.txt_solution_1_summary_c, getString(R.string.action_router_password)));
                            return;
                        } else {
                            i30.S("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onDestroy() {
        e3 e3Var = this.D;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i30.m(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        i().c();
        return true;
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onPause() {
        e3 e3Var = this.D;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.c();
        super.onPause();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onResume() {
        super.onResume();
        e3 e3Var = this.D;
        if (e3Var != null) {
            e3Var.d();
        } else {
            i30.S("adView");
            throw null;
        }
    }
}
