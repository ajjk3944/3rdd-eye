package p4;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import l4.C5287f;
import l4.C5290i;

/* compiled from: CutoutDrawable.java */
/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5454d extends C5287f {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f45130A = 0;

    /* renamed from: z, reason: collision with root package name */
    public a f45131z;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    /* renamed from: p4.d$b */
    public static class b extends C5454d {
        @Override // l4.C5287f
        public final void f(Canvas canvas) {
            if (this.f45131z.f45132r.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f45131z.f45132r);
            } else {
                canvas.clipRect(this.f45131z.f45132r, Region.Op.DIFFERENCE);
            }
            super.f(canvas);
            canvas.restore();
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f45131z = new a(this.f45131z);
        return this;
    }

    public final void o(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f45131z.f45132r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* compiled from: CutoutDrawable.java */
    /* renamed from: p4.d$a */
    public static final class a extends C5287f.b {

        /* renamed from: r, reason: collision with root package name */
        public final RectF f45132r;

        public a(C5290i c5290i, RectF rectF) {
            super(c5290i);
            this.f45132r = rectF;
        }

        @Override // l4.C5287f.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.f45131z = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f45132r = aVar.f45132r;
        }
    }
}
