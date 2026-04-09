package zd;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import o.o;

/* loaded from: classes.dex */
public final class b extends FrameLayout implements h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27288a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27289d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27290g;

    @Override // o.z
    public final void a(o oVar) {
        b();
    }

    public final void b() {
        setVisibility((!this.f27290g || (!this.f27288a && this.f27289d)) ? 8 : 0);
    }

    @Override // o.z
    public o getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setDividersEnabled(boolean z10) {
        this.f27290g = z10;
        b();
    }

    @Override // zd.h
    public void setExpanded(boolean z10) {
        this.f27288a = z10;
        b();
    }

    @Override // zd.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f27289d = z10;
        b();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
