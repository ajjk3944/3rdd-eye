package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends w implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f30719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f30719d = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        pd.b.s(this, getContentDescription());
        setOnTouchListener(new o.b(this, this));
    }

    @Override // p.l
    public final boolean b() {
        return false;
    }

    @Override // p.l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f30719d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i4, i10, i11, i12);
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
