package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: AppCompatRatingBar.java */
/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5398p extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final C5397o f44705b;

    public C5398p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        S.a(this, getContext());
        C5397o c5397o = new C5397o(this);
        this.f44705b = c5397o;
        c5397o.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        Bitmap bitmap = this.f44705b.f44704b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
