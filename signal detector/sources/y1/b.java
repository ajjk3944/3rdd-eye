package y1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends Drawable implements e, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final M0.e f24213a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24215c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24216d;

    /* renamed from: f, reason: collision with root package name */
    public int f24218f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24220h;
    public Paint i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f24221j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24217e = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f24219g = -1;

    public b(M0.e eVar) {
        this.f24213a = eVar;
    }

    public final void a() {
        H1.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f24216d);
        f fVar = (f) this.f24213a.f2634b;
        if (fVar.f24230a.f21771l.f21749c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f24214b) {
            return;
        }
        this.f24214b = true;
        ArrayList arrayList = fVar.f24232c;
        if (fVar.f24238j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !fVar.f24235f) {
            fVar.f24235f = true;
            fVar.f24238j = false;
            fVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f24216d) {
            return;
        }
        if (this.f24220h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f24221j == null) {
                this.f24221j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f24221j);
            this.f24220h = false;
        }
        f fVar = (f) this.f24213a.f2634b;
        d dVar = fVar.i;
        Bitmap bitmap = dVar != null ? dVar.f24229g : fVar.f24240l;
        if (this.f24221j == null) {
            this.f24221j = new Rect();
        }
        Rect rect = this.f24221j;
        if (this.i == null) {
            this.i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f24213a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((f) this.f24213a.f2634b).f24244p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((f) this.f24213a.f2634b).f24243o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f24214b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24220h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        H1.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f24216d);
        this.f24217e = z6;
        if (!z6) {
            this.f24214b = false;
            f fVar = (f) this.f24213a.f2634b;
            ArrayList arrayList = fVar.f24232c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f24235f = false;
            }
        } else if (this.f24215c) {
            a();
        }
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f24215c = true;
        this.f24218f = 0;
        if (this.f24217e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f24215c = false;
        this.f24214b = false;
        f fVar = (f) this.f24213a.f2634b;
        ArrayList arrayList = fVar.f24232c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f24235f = false;
        }
    }
}
