package j0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import g1.r;

/* loaded from: classes.dex */
public final class i extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13041a;

    /* renamed from: d, reason: collision with root package name */
    public r f13042d;

    /* renamed from: g, reason: collision with root package name */
    public Integer f13043g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13044r;

    public i(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f13041a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f13041a) {
            this.f13044r = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f13044r = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f13044r;
    }
}
