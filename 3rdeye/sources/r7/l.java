package r7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import g0.C4356c;
import z0.C5848a;

/* compiled from: SeparatorView.kt */
/* loaded from: classes.dex */
public class l extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f45805b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f45806c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45807d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45808e;

    /* renamed from: f, reason: collision with root package name */
    public int f45809f;

    /* renamed from: g, reason: collision with root package name */
    public int f45810g;

    public l(Context context) {
        super(context, null, 0);
        Paint paint = new Paint();
        paint.setColor(0);
        this.f45805b = paint;
        this.f45806c = new Rect();
        this.f45808e = true;
        this.f45810g = 17;
    }

    public final int getDividerColor() {
        return this.f45805b.getColor();
    }

    public final int getDividerGravity() {
        return this.f45810g;
    }

    public final int getDividerThickness() {
        return this.f45809f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.f45805b;
        if (Color.alpha(paint.getColor()) > 0) {
            boolean z10 = this.f45807d;
            Rect rect = this.f45806c;
            if (z10) {
                int paddingTop = this.f45808e ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.f45808e ? getPaddingBottom() : getPaddingRight();
                int height = this.f45808e ? getHeight() : getWidth();
                int i = (height - paddingTop) - paddingBottom;
                int i10 = this.f45810g;
                if (i10 == 17) {
                    paddingTop = C4356c.c(i, this.f45809f, 2, paddingTop);
                } else if (i10 != 8388611) {
                    paddingTop = i10 != 8388613 ? 0 : (height - paddingBottom) - this.f45809f;
                }
                if (this.f45808e) {
                    rect.top = paddingTop;
                    rect.bottom = Math.min(i, this.f45809f) + paddingTop;
                    rect.left = getPaddingLeft();
                    rect.right = getWidth() - getPaddingRight();
                } else {
                    rect.left = paddingTop;
                    rect.right = Math.min(i, this.f45809f) + paddingTop;
                    rect.top = getPaddingTop();
                    rect.bottom = getHeight() - getPaddingBottom();
                }
                this.f45807d = false;
            }
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f45808e) {
            paddingBottom += this.f45809f;
        } else {
            paddingRight += this.f45809f;
        }
        int iMax = Math.max(paddingRight, getSuggestedMinimumWidth());
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            iMax = Math.min(iMax, size);
        } else if (mode == 1073741824) {
            iMax = size;
        }
        int iMax2 = Math.max(paddingBottom, getSuggestedMinimumHeight());
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            iMax2 = Math.min(iMax2, size2);
        } else if (mode2 == 1073741824) {
            iMax2 = size2;
        }
        setMeasuredDimension(iMax, iMax2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f45807d = true;
    }

    public final void setDividerColor(int i) {
        Paint paint = this.f45805b;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i) {
        setDividerColor(C5848a.getColor(getContext(), i));
    }

    public final void setDividerGravity(int i) {
        if (this.f45810g != i) {
            this.f45810g = i;
            this.f45807d = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public final void setDividerThickness(int i) {
        if (this.f45809f != i) {
            this.f45809f = i;
            this.f45807d = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z10) {
        if (this.f45808e != z10) {
            this.f45808e = z10;
            this.f45807d = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
        super.setPadding(i, i10, i11, i12);
        this.f45807d = true;
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }
}
