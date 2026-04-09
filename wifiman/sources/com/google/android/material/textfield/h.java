package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import f4.C5527g;
import f4.C5531k;

/* loaded from: classes3.dex */
abstract class h extends C5527g {

    /* renamed from: z, reason: collision with root package name */
    b f37783z;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // f4.C5527g
        protected void r(Canvas canvas) {
            if (this.f37783z.f37784w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f37783z.f37784w);
            super.r(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h f0(b bVar) {
        return new c(bVar);
    }

    static h g0(C5531k c5531k) {
        if (c5531k == null) {
            c5531k = new C5531k();
        }
        return f0(new b(c5531k, new RectF()));
    }

    boolean h0() {
        return !this.f37783z.f37784w.isEmpty();
    }

    void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void j0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f37783z.f37784w.left && f11 == this.f37783z.f37784w.top && f12 == this.f37783z.f37784w.right && f13 == this.f37783z.f37784w.bottom) {
            return;
        }
        this.f37783z.f37784w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f37783z = new b(this.f37783z);
        return this;
    }

    private static final class b extends C5527g.c {

        /* renamed from: w, reason: collision with root package name */
        private final RectF f37784w;

        @Override // f4.C5527g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarF0 = h.f0(this);
            hVarF0.invalidateSelf();
            return hVarF0;
        }

        private b(C5531k c5531k, RectF rectF) {
            super(c5531k, null);
            this.f37784w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f37784w = bVar.f37784w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.f37783z = bVar;
    }
}
