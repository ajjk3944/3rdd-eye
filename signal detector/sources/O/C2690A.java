package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.apm.insight.R;

/* renamed from: o.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690A extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C2748y f22333a;

    public C2690A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        W0.a(getContext(), this);
        C2748y c2748y = new C2748y(this);
        this.f22333a = c2748y;
        c2748y.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        Bitmap bitmap = (Bitmap) this.f22333a.f22657c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
