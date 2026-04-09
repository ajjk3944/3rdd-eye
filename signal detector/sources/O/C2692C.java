package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.apm.insight.R;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2692C extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C2693D f22361a;

    public C2692C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        W0.a(getContext(), this);
        C2693D c2693d = new C2693D(this);
        this.f22361a = c2693d;
        c2693d.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2693D c2693d = this.f22361a;
        C2692C c2692c = c2693d.f22362e;
        Drawable drawable = c2693d.f22363f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c2692c.getDrawableState())) {
            c2692c.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22361a.f22363f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f22361a.g(canvas);
    }
}
