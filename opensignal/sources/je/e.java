package je;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends ee.g {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f13620r;

    public e(ee.l lVar, RectF rectF) {
        super(lVar);
        this.f13620r = rectF;
    }

    @Override // ee.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.f13622d0 = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(e eVar) {
        super(eVar);
        this.f13620r = eVar.f13620r;
    }
}
