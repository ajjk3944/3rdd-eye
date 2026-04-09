package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.AbstractC5927a;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3899y extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C3900z f27465a;

    public C3899y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47934F);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f27465a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f27465a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27465a.g(canvas);
    }

    public C3899y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        X.a(this, getContext());
        C3900z c3900z = new C3900z(this);
        this.f27465a = c3900z;
        c3900z.c(attributeSet, i10);
    }
}
