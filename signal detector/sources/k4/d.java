package K4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.ui.noise.NoiseTrendView;
import com.lefan.signal.ui.noise.NoiseView;

/* loaded from: classes.dex */
public final class d implements O0.a {

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f2217C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialButton f2218D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f2219E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f2220F;

    /* renamed from: G, reason: collision with root package name */
    public final NoiseTrendView f2221G;

    /* renamed from: H, reason: collision with root package name */
    public final NoiseView f2222H;

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f2223a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f2224b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f2225c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f2226d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f2227e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f2228f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f2229g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayoutCompat f2230h;
    public final MaterialCardView i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayoutCompat f2231j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f2232k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f2233l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f2234m;

    /* renamed from: n, reason: collision with root package name */
    public final Toolbar f2235n;

    public d(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppBarLayout appBarLayout, TextView textView, RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, LinearLayoutCompat linearLayoutCompat2, MaterialCardView materialCardView, LinearLayoutCompat linearLayoutCompat3, TextView textView2, TextView textView3, TextView textView4, Toolbar toolbar, MaterialButton materialButton3, MaterialButton materialButton4, TextView textView5, TextView textView6, NoiseTrendView noiseTrendView, NoiseView noiseView) {
        this.f2223a = linearLayoutCompat;
        this.f2224b = appCompatTextView;
        this.f2225c = appBarLayout;
        this.f2226d = textView;
        this.f2227e = relativeLayout;
        this.f2228f = materialButton;
        this.f2229g = materialButton2;
        this.f2230h = linearLayoutCompat2;
        this.i = materialCardView;
        this.f2231j = linearLayoutCompat3;
        this.f2232k = textView2;
        this.f2233l = textView3;
        this.f2234m = textView4;
        this.f2235n = toolbar;
        this.f2217C = materialButton3;
        this.f2218D = materialButton4;
        this.f2219E = textView5;
        this.f2220F = textView6;
        this.f2221G = noiseTrendView;
        this.f2222H = noiseView;
    }

    @Override // O0.a
    public final View getRoot() {
        return this.f2223a;
    }
}
