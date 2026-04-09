package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public final class r extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final C5400s f44706b;

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S.a(this, getContext());
        C5400s c5400s = new C5400s(this);
        this.f44706b = c5400s;
        c5400s.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5400s c5400s = this.f44706b;
        Drawable drawable = c5400s.f44708e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        r rVar = c5400s.f44707d;
        if (drawable.setState(rVar.getDrawableState())) {
            rVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f44706b.f44708e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f44706b.d(canvas);
    }
}
