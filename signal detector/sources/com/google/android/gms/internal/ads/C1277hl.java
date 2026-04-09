package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lefan.signal.ui.wifi.WifiSafeView;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277hl implements O0.a {

    /* renamed from: C, reason: collision with root package name */
    public final Object f14540C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f14541D;

    /* renamed from: E, reason: collision with root package name */
    public Object f14542E;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14543a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14544b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14545c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14546d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14547e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14548f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14549g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f14550h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14551j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f14552k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14553l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14554m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14555n;

    public /* synthetic */ C1277hl(K4.e eVar) {
        this.f14544b = (HashSet) eVar.f2239c;
        this.f14545c = (HashSet) eVar.f2240d;
        this.f14547e = (HashSet) eVar.f2242f;
        this.f14548f = (HashSet) eVar.f2243g;
        this.f14546d = (HashSet) eVar.f2241e;
        this.f14549g = (HashSet) eVar.f2244h;
        this.f14550h = (HashSet) eVar.f2237a;
        this.i = (HashSet) eVar.i;
        this.f14551j = (HashSet) eVar.f2247l;
        this.f14552k = (HashSet) eVar.f2245j;
        this.f14553l = (HashSet) eVar.f2246k;
        this.f14554m = (HashSet) eVar.f2248m;
        this.f14541D = (C1391jt) eVar.f2236C;
        this.f14555n = (HashSet) eVar.f2249n;
        this.f14540C = (HashSet) eVar.f2238b;
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f14543a) {
            case 1:
                return (LinearLayoutCompat) this.f14544b;
            default:
                return (CoordinatorLayout) this.f14544b;
        }
    }

    public C1277hl(CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, WifiSafeView wifiSafeView, WifiSafeView wifiSafeView2, WifiSafeView wifiSafeView3, WifiSafeView wifiSafeView4, WifiSafeView wifiSafeView5, WifiSafeView wifiSafeView6, WifiSafeView wifiSafeView7, WifiSafeView wifiSafeView8, Group group, CircularProgressIndicator circularProgressIndicator, MaterialButton materialButton, Toolbar toolbar, CollapsingToolbarLayout collapsingToolbarLayout, AppCompatImageView appCompatImageView) {
        this.f14544b = coordinatorLayout;
        this.f14545c = nestedScrollView;
        this.f14546d = appCompatTextView;
        this.f14547e = wifiSafeView;
        this.f14548f = wifiSafeView2;
        this.f14549g = wifiSafeView3;
        this.f14550h = wifiSafeView4;
        this.i = wifiSafeView5;
        this.f14551j = wifiSafeView6;
        this.f14552k = wifiSafeView7;
        this.f14553l = wifiSafeView8;
        this.f14554m = group;
        this.f14555n = circularProgressIndicator;
        this.f14540C = materialButton;
        this.f14541D = toolbar;
        this.f14542E = collapsingToolbarLayout;
    }

    public C1277hl(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, NestedScrollView nestedScrollView, TextView textView6, TextView textView7, TextView textView8, MaterialButton materialButton, Toolbar toolbar) {
        this.f14544b = linearLayoutCompat;
        this.f14545c = appBarLayout;
        this.f14546d = constraintLayout;
        this.f14547e = frameLayout;
        this.f14548f = appCompatImageView;
        this.f14549g = textView;
        this.f14550h = textView2;
        this.i = textView3;
        this.f14551j = textView4;
        this.f14552k = textView5;
        this.f14553l = nestedScrollView;
        this.f14554m = textView6;
        this.f14555n = textView7;
        this.f14540C = textView8;
        this.f14541D = materialButton;
        this.f14542E = toolbar;
    }
}
