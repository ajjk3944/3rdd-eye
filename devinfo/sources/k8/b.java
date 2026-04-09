package k8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends Drawable implements e, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final k6.d f28075a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28076b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28078d;

    /* renamed from: f, reason: collision with root package name */
    public int f28080f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28081h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f28082i;
    public Rect j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28079e = true;
    public final int g = -1;

    public b(k6.d dVar) {
        this.f28075a = dVar;
    }

    public final void a() {
        t8.f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f28078d);
        f fVar = (f) this.f28075a.f27975b;
        if (fVar.f28090a.f36529l.f36509c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f28076b) {
            return;
        }
        this.f28076b = true;
        ArrayList arrayList = fVar.f28092c;
        if (fVar.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !fVar.f28095f) {
            fVar.f28095f = true;
            fVar.j = false;
            fVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f28078d) {
            return;
        }
        if (this.f28081h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.j == null) {
                this.j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.j);
            this.f28081h = false;
        }
        f fVar = (f) this.f28075a.f27975b;
        d dVar = fVar.f28097i;
        Bitmap bitmap = dVar != null ? dVar.g : fVar.f28099l;
        if (this.j == null) {
            this.j = new Rect();
        }
        Rect rect = this.j;
        if (this.f28082i == null) {
            this.f28082i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f28082i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f28075a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((f) this.f28075a.f27975b).f28103p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((f) this.f28075a.f27975b).f28102o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f28076b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f28081h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f28082i == null) {
            this.f28082i = new Paint(2);
        }
        this.f28082i.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f28082i == null) {
            this.f28082i = new Paint(2);
        }
        this.f28082i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        t8.f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f28078d);
        this.f28079e = z3;
        if (!z3) {
            this.f28076b = false;
            f fVar = (f) this.f28075a.f27975b;
            ArrayList arrayList = fVar.f28092c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f28095f = false;
            }
        } else if (this.f28077c) {
            a();
        }
        return super.setVisible(z3, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f28077c = true;
        this.f28080f = 0;
        if (this.f28079e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f28077c = false;
        this.f28076b = false;
        f fVar = (f) this.f28075a.f27975b;
        ArrayList arrayList = fVar.f28092c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f28095f = false;
        }
    }
}
