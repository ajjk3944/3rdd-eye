package Y2;

import Y2.f;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: b, reason: collision with root package name */
    public final a f13728b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13729c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13730d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13731e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13732f;

    /* renamed from: g, reason: collision with root package name */
    public int f13733g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13734h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f13735j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f13736k;

    /* compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final f f13737a;

        public a(f fVar) {
            this.f13737a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f13732f = true;
        this.f13734h = -1;
        this.f13728b = aVar;
    }

    @Override // Y2.f.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f.a aVar = this.f13728b.f13737a.i;
        if ((aVar != null ? aVar.f13756f : -1) == r0.f13739a.f3101l.f3079c - 1) {
            this.f13733g++;
        }
        int i = this.f13734h;
        if (i == -1 || this.f13733g < i) {
            return;
        }
        stop();
    }

    public final void b() {
        C5606d.i("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f13731e);
        f fVar = this.f13728b.f13737a;
        if (fVar.f13739a.f3101l.f3079c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f13729c) {
            return;
        }
        this.f13729c = true;
        if (fVar.f13747j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = fVar.f13741c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !fVar.f13744f) {
            fVar.f13744f = true;
            fVar.f13747j = false;
            fVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f13731e) {
            return;
        }
        if (this.i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f13736k == null) {
                this.f13736k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f13736k);
            this.i = false;
        }
        f fVar = this.f13728b.f13737a;
        f.a aVar = fVar.i;
        Bitmap bitmap = aVar != null ? aVar.f13758h : fVar.f13749l;
        if (this.f13736k == null) {
            this.f13736k = new Rect();
        }
        Rect rect = this.f13736k;
        if (this.f13735j == null) {
            this.f13735j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f13735j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13728b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13728b.f13737a.f13754q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13728b.f13737a.f13753p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f13729c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f13735j == null) {
            this.f13735j = new Paint(2);
        }
        this.f13735j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f13735j == null) {
            this.f13735j = new Paint(2);
        }
        this.f13735j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        C5606d.i("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f13731e);
        this.f13732f = z10;
        if (!z10) {
            this.f13729c = false;
            f fVar = this.f13728b.f13737a;
            ArrayList arrayList = fVar.f13741c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f13744f = false;
            }
        } else if (this.f13730d) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f13730d = true;
        this.f13733g = 0;
        if (this.f13732f) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f13730d = false;
        this.f13729c = false;
        f fVar = this.f13728b.f13737a;
        ArrayList arrayList = fVar.f13741c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f13744f = false;
        }
    }
}
