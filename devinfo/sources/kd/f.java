package kd;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends ed.h {

    /* renamed from: s, reason: collision with root package name */
    public final RectF f28157s;

    public f(ed.o oVar, RectF rectF) {
        super(oVar);
        this.f28157s = rectF;
    }

    @Override // ed.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.H = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f28157s = fVar.f28157s;
    }
}
