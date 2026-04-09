package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class x extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final w f20214a;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(Context context, AttributeSet attributeSet) {
        int i10 = h.a.ratingBarStyle;
        super(context, attributeSet, i10);
        h2.a(getContext(), this);
        w wVar = new w(this);
        this.f20214a = wVar;
        wVar.b(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f20214a.f20209c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
