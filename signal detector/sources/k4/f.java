package K4;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class f implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f2251b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f2252c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2253d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f2254e;

    public f(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.f2251b = linearLayoutCompat;
        this.f2252c = appBarLayout;
        this.f2253d = recyclerView;
        this.f2254e = toolbar;
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f2250a) {
        }
        return this.f2251b;
    }

    public f(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, Toolbar toolbar, RecyclerView recyclerView) {
        this.f2251b = linearLayoutCompat;
        this.f2252c = appBarLayout;
        this.f2254e = toolbar;
        this.f2253d = recyclerView;
    }
}
