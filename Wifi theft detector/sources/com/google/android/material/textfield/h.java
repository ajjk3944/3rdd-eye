package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes2.dex */
public abstract class h extends MaterialShapeDrawable {
    public b J;

    public static class c extends h {
        public c(b bVar) {
            super(bVar);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void w(Canvas canvas) {
            if (this.J.f11338x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.J.f11338x);
            } else {
                canvas.clipRect(this.J.f11338x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    public static h D0(com.google.android.material.shape.a aVar) {
        if (aVar == null) {
            aVar = new com.google.android.material.shape.a();
        }
        return E0(new b(aVar, new RectF()));
    }

    public static h E0(b bVar) {
        return new c(bVar);
    }

    public boolean F0() {
        return !this.J.f11338x.isEmpty();
    }

    public void G0() {
        H0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void H0(float f10, float f11, float f12, float f13) {
        if (f10 == this.J.f11338x.left && f11 == this.J.f11338x.top && f12 == this.J.f11338x.right && f13 == this.J.f11338x.bottom) {
            return;
        }
        this.J.f11338x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void I0(RectF rectF) {
        H0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.J = new b(this.J);
        return this;
    }

    public static final class b extends MaterialShapeDrawable.c {

        /* renamed from: x, reason: collision with root package name */
        public final RectF f11338x;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarE0 = h.E0(this);
            hVarE0.invalidateSelf();
            return hVarE0;
        }

        public b(com.google.android.material.shape.a aVar, RectF rectF) {
            super(aVar, null);
            this.f11338x = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.f11338x = bVar.f11338x;
        }
    }

    public h(b bVar) {
        super(bVar);
        this.J = bVar;
    }
}
