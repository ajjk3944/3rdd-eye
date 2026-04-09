package K4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.ui.satellite.SatelliteView;
import com.lefan.signal.ui.speed.CompassView2;
import com.lefan.signal.ui.speed.SpeedTrendView;
import com.lefan.signal.ui.speed.SpeedView;

/* loaded from: classes.dex */
public final class i implements O0.a {

    /* renamed from: C, reason: collision with root package name */
    public final CompassView2 f2293C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f2294D;

    /* renamed from: E, reason: collision with root package name */
    public final SatelliteView f2295E;

    /* renamed from: F, reason: collision with root package name */
    public final SpeedView f2296F;

    /* renamed from: G, reason: collision with root package name */
    public final SpeedTrendView f2297G;

    /* renamed from: H, reason: collision with root package name */
    public final Toolbar f2298H;

    /* renamed from: I, reason: collision with root package name */
    public final LinearLayout f2299I;

    /* renamed from: J, reason: collision with root package name */
    public final LinearLayout f2300J;

    /* renamed from: K, reason: collision with root package name */
    public final LinearLayout f2301K;

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f2303b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2304c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f2305d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f2306e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f2307f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f2308g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialCardView f2309h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f2310j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f2311k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f2312l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f2313m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f2314n;

    public i(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, MaterialCardView materialCardView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, CompassView2 compassView2, TextView textView11, SatelliteView satelliteView, SpeedView speedView, SpeedTrendView speedTrendView, Toolbar toolbar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f2302a = linearLayoutCompat;
        this.f2303b = appBarLayout;
        this.f2304c = view;
        this.f2305d = textView;
        this.f2306e = textView2;
        this.f2307f = textView3;
        this.f2308g = textView4;
        this.f2309h = materialCardView;
        this.i = textView5;
        this.f2310j = textView6;
        this.f2311k = textView7;
        this.f2312l = textView8;
        this.f2313m = textView9;
        this.f2314n = textView10;
        this.f2293C = compassView2;
        this.f2294D = textView11;
        this.f2295E = satelliteView;
        this.f2296F = speedView;
        this.f2297G = speedTrendView;
        this.f2298H = toolbar;
        this.f2299I = linearLayout;
        this.f2300J = linearLayout2;
        this.f2301K = linearLayout3;
    }

    @Override // O0.a
    public final View getRoot() {
        return this.f2302a;
    }
}
