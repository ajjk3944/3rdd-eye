package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p.h2;
import p.z;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final z f968a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        int i10 = h.a.seekBarStyle;
        super(context, attributeSet, i10);
        h2.a(getContext(), this);
        z zVar = new z(this);
        this.f968a = zVar;
        zVar.b(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f968a;
        AppCompatSeekBar appCompatSeekBar = zVar.f20215e;
        Drawable drawable = zVar.f20216f;
        if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBar.getDrawableState())) {
            appCompatSeekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f968a.f20216f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f968a.g(canvas);
    }
}
