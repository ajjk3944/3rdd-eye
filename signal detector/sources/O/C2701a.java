package o;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2701a implements R.T {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22475a;

    /* renamed from: b, reason: collision with root package name */
    public int f22476b;

    /* renamed from: c, reason: collision with root package name */
    public final View f22477c;

    public C2701a(FloatingActionButton floatingActionButton) {
        this.f22475a = false;
        this.f22476b = 0;
        this.f22477c = floatingActionButton;
    }

    @Override // R.T
    public void a() {
        this.f22475a = true;
    }

    @Override // R.T
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f22475a = false;
    }

    @Override // R.T
    public void c() {
        if (this.f22475a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f22477c;
        actionBarContextView.f4807f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f22476b);
    }

    public C2701a(ActionBarContextView actionBarContextView) {
        this.f22477c = actionBarContextView;
        this.f22475a = false;
    }
}
