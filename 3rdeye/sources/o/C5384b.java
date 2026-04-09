package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: ActionBarBackgroundDrawable.java */
/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5384b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f44623a;

    public C5384b(ActionBarContainer actionBarContainer) {
        this.f44623a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f44623a;
        if (actionBarContainer.i) {
            Drawable drawable = actionBarContainer.f14525h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f14523f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f14524g;
        if (drawable3 == null || !actionBarContainer.f14526j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f44623a;
        if (actionBarContainer.i) {
            if (actionBarContainer.f14525h != null) {
                actionBarContainer.f14523f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f14523f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
