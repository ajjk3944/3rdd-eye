package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import h.AbstractC5927a;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3897w extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C3895u f27464a;

    public C3897w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47933E);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f27464a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C3897w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        X.a(this, getContext());
        C3895u c3895u = new C3895u(this);
        this.f27464a = c3895u;
        c3895u.c(attributeSet, i10);
    }
}
