package K4;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes.dex */
public final class g implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2255a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f2256b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f2257c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f2258d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f2259e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f2260f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f2261g;

    /* renamed from: h, reason: collision with root package name */
    public final NestedScrollView f2262h;
    public final Toolbar i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f2263j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2264k;

    /* renamed from: l, reason: collision with root package name */
    public final View f2265l;

    /* renamed from: m, reason: collision with root package name */
    public final View f2266m;

    /* renamed from: n, reason: collision with root package name */
    public final View f2267n;

    public g(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, AppCompatTextView appCompatTextView, SwitchMaterial switchMaterial, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, NestedScrollView nestedScrollView, Toolbar toolbar) {
        this.f2256b = linearLayoutCompat;
        this.f2257c = appBarLayout;
        this.f2258d = appCompatTextView;
        this.f2263j = switchMaterial;
        this.f2259e = appCompatTextView2;
        this.f2260f = appCompatTextView3;
        this.f2261g = appCompatImageView;
        this.f2264k = linearLayoutCompat2;
        this.f2265l = linearLayoutCompat3;
        this.f2266m = linearLayoutCompat4;
        this.f2267n = linearLayoutCompat5;
        this.f2262h = nestedScrollView;
        this.i = toolbar;
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f2255a) {
        }
        return this.f2256b;
    }

    public g(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, AppCompatTextView appCompatTextView, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, MaterialButton materialButton, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, MaterialButton materialButton2, Toolbar toolbar) {
        this.f2256b = linearLayoutCompat;
        this.f2257c = appBarLayout;
        this.f2258d = appCompatTextView;
        this.f2262h = nestedScrollView;
        this.f2259e = appCompatTextView2;
        this.f2260f = appCompatTextView3;
        this.f2263j = appCompatTextView4;
        this.f2265l = materialButton;
        this.f2267n = appCompatAutoCompleteTextView;
        this.f2261g = appCompatImageView;
        this.f2264k = appCompatTextView5;
        this.f2266m = materialButton2;
        this.i = toolbar;
    }
}
