package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vl extends lc0 {
    public final RectF s;

    public vl(su0 su0Var, RectF rectF) {
        super(su0Var);
        this.s = rectF;
    }

    @Override // defpackage.lc0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        wl wlVar = new wl(this);
        wlVar.M = this;
        wlVar.invalidateSelf();
        return wlVar;
    }

    public vl(vl vlVar) {
        super(vlVar);
        this.s = vlVar.s;
    }
}
