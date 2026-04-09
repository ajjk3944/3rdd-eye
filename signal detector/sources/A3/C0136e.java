package A3;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* renamed from: A3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136e extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f368a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f369b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f370c;

    @Override // n.x
    public final void a(n.m mVar) {
        b();
    }

    public final void b() {
        setVisibility((!this.f370c || (!this.f368a && this.f369b)) ? 8 : 0);
    }

    @Override // n.x
    public n.m getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    public void setDividersEnabled(boolean z6) {
        this.f370c = z6;
        b();
    }

    @Override // A3.n
    public void setExpanded(boolean z6) {
        this.f368a = z6;
        b();
    }

    @Override // A3.n
    public void setOnlyShowWhenExpanded(boolean z6) {
        this.f369b = z6;
        b();
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
