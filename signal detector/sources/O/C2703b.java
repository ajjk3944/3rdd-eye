package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2703b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f22482a;

    public C2703b(ActionBarContainer actionBarContainer) {
        this.f22482a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f22482a;
        if (actionBarContainer.f4794g) {
            Drawable drawable = actionBarContainer.f4793f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4791d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4792e;
        if (drawable3 == null || !actionBarContainer.f4795h) {
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
        ActionBarContainer actionBarContainer = this.f22482a;
        if (actionBarContainer.f4794g) {
            if (actionBarContainer.f4793f != null) {
                actionBarContainer.f4791d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4791d;
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
