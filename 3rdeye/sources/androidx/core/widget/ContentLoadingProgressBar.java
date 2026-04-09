package androidx.core.widget;

import B.b;
import C.V;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15501d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final b f15502b;

    /* renamed from: c, reason: collision with root package name */
    public final V f15503c;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15502b = new b(this, 7);
        this.f15503c = new V(this, 3);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f15502b);
        removeCallbacks(this.f15503c);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f15502b);
        removeCallbacks(this.f15503c);
    }
}
