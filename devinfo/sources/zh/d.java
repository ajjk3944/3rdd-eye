package zh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38289c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f38290d = new Path();

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f38291e = new Matrix();

    public d(Context context) {
        Paint paint = new Paint();
        this.f38287a = paint;
        paint.setAntiAlias(true);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        paint.setColor(com.liuzh.deviceinfo.utilities.f.a());
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.f38288b = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_start);
        this.f38289c = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_end);
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14) {
        path.arcTo(f10 - f12, f11 - f12, f10 + f12, f11 + f12, f13, f14, false);
    }

    public final void b() {
        Path path = this.f38290d;
        path.reset();
        float fWidth = getBounds().width();
        float fHeight = r6.height() / 2.0f;
        float fSqrt = (float) Math.sqrt(2.0d);
        float f10 = fSqrt * fHeight;
        float fMax = Math.max(fHeight + f10, fWidth);
        a(path, fHeight, fHeight, fHeight, 90.0f, 180.0f);
        float f11 = fMax - f10;
        a(path, f11, fHeight, fHeight, -90.0f, 45.0f);
        float f12 = fHeight / 5.0f;
        a(path, fMax - (fSqrt * f12), fHeight, f12, -45.0f, 90.0f);
        a(path, f11, fHeight, fHeight, 45.0f, 45.0f);
        path.close();
        int layoutDirection = getLayoutDirection();
        Matrix matrix = this.f38291e;
        if (layoutDirection == 1) {
            matrix.setScale(-1.0f, 1.0f, fMax / 2.0f, 0.0f);
        } else {
            matrix.reset();
        }
        matrix.postTranslate(r6.left, r6.top);
        path.transform(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f38290d, this.f38287a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i4 = Build.VERSION.SDK_INT;
        Path path = this.f38290d;
        if (i4 >= 29 || path.isConvex()) {
            outline.setConvexPath(path);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int layoutDirection = getLayoutDirection();
        int i4 = this.f38288b;
        int i10 = this.f38289c;
        if (layoutDirection == 1) {
            rect.set(i10, 0, i4, 0);
        } else {
            rect.set(i4, 0, i10, 0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
