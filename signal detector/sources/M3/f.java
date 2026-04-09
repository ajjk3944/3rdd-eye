package M3;

import G3.C0154h;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends C0154h {

    /* renamed from: s, reason: collision with root package name */
    public final RectF f2846s;

    public f(G3.o oVar, RectF rectF) {
        super(oVar);
        this.f2846s = rectF;
    }

    @Override // G3.C0154h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f2848V = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f2846s = fVar.f2846s;
    }
}
