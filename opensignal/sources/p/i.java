package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class i extends AppCompatImageView implements j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f20073r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.widget.b bVar, Context context) {
        super(context, null, h.a.actionOverflowButtonStyle);
        this.f20073r = bVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        y3.N(this, getContentDescription());
        setOnTouchListener(new o.b(this, this));
    }

    @Override // p.j
    public final boolean b() {
        return false;
    }

    @Override // p.j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f20073r.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
