package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.apm.insight.R;
import n.C2668b;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2719j extends AppCompatImageView implements InterfaceC2725m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2723l f22536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2719j(C2723l c2723l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f22536d = c2723l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        d5.y.r(this, getContentDescription());
        setOnTouchListener(new C2668b(this, this));
    }

    @Override // o.InterfaceC2725m
    public final boolean b() {
        return false;
    }

    @Override // o.InterfaceC2725m
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f22536d.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i3, int i6, int i7) {
        boolean frame = super.setFrame(i, i3, i6, i7);
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
