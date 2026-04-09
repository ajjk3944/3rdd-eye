package K4;

import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.view.DelayCureView;
import com.lefan.signal.view.DiagnosisLevelView;

/* loaded from: classes.dex */
public final class k implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f2325a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f2326b;

    /* renamed from: c, reason: collision with root package name */
    public final NestedScrollView f2327c;

    /* renamed from: d, reason: collision with root package name */
    public final DiagnosisLevelView f2328d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f2329e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f2330f;

    /* renamed from: g, reason: collision with root package name */
    public final DiagnosisLevelView f2331g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f2332h;
    public final AppCompatImageView i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialButton f2333j;

    /* renamed from: k, reason: collision with root package name */
    public final MaterialButton f2334k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatAutoCompleteTextView f2335l;

    /* renamed from: m, reason: collision with root package name */
    public final Toolbar f2336m;

    /* renamed from: n, reason: collision with root package name */
    public final DelayCureView f2337n;

    public k(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, DiagnosisLevelView diagnosisLevelView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, DiagnosisLevelView diagnosisLevelView2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, Toolbar toolbar, DelayCureView delayCureView) {
        this.f2325a = linearLayoutCompat;
        this.f2326b = appBarLayout;
        this.f2327c = nestedScrollView;
        this.f2328d = diagnosisLevelView;
        this.f2329e = appCompatTextView;
        this.f2330f = recyclerView;
        this.f2331g = diagnosisLevelView2;
        this.f2332h = appCompatTextView2;
        this.i = appCompatImageView;
        this.f2333j = materialButton;
        this.f2334k = materialButton2;
        this.f2335l = appCompatAutoCompleteTextView;
        this.f2336m = toolbar;
        this.f2337n = delayCureView;
    }

    @Override // O0.a
    public final View getRoot() {
        return this.f2325a;
    }
}
