package zg;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f27382u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f27383a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f27384b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f27385c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f27386d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f27387e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27388f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27389g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f27390h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f27391i;
    public final Matrix j;
    public final RectF k;

    /* renamed from: l, reason: collision with root package name */
    public Shader.TileMode f27392l;

    /* renamed from: m, reason: collision with root package name */
    public Shader.TileMode f27393m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27394n;

    /* renamed from: o, reason: collision with root package name */
    public float f27395o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f27396p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27397q;

    /* renamed from: r, reason: collision with root package name */
    public float f27398r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f27399s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f27400t;

    public c(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f27385c = rectF;
        this.f27390h = new RectF();
        this.j = new Matrix();
        this.k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27392l = tileMode;
        this.f27393m = tileMode;
        this.f27394n = true;
        this.f27395o = 0.0f;
        this.f27396p = new boolean[]{true, true, true, true};
        this.f27397q = false;
        this.f27398r = 0.0f;
        this.f27399s = ColorStateList.valueOf(-16777216);
        this.f27400t = ImageView.ScaleType.FIT_CENTER;
        this.f27386d = bitmap;
        int width = bitmap.getWidth();
        this.f27388f = width;
        int height = bitmap.getHeight();
        this.f27389g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f27387e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f27391i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f27399s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f27398r);
    }

    public static Drawable a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null || (drawable instanceof c)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), a(layerDrawable.getDrawable(i10)));
            }
            return layerDrawable;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            } catch (Exception e4) {
                e4.printStackTrace();
                e0.p("RoundedDrawable", "Failed to create bitmap from drawable!");
                bitmapCreateBitmap = null;
            }
        }
        return bitmapCreateBitmap != null ? new c(bitmapCreateBitmap) : drawable;
    }

    public final void b(Canvas canvas) {
        boolean[] zArr = this.f27396p;
        for (boolean z10 : zArr) {
            if (z10) {
                if (this.f27395o == 0.0f) {
                    return;
                }
                RectF rectF = this.f27384b;
                float f10 = rectF.left;
                float f11 = rectF.top;
                float fWidth = rectF.width() + f10;
                float fHeight = rectF.height() + f11;
                float f12 = this.f27395o;
                boolean z11 = zArr[0];
                Paint paint = this.f27387e;
                RectF rectF2 = this.k;
                if (!z11) {
                    rectF2.set(f10, f11, f10 + f12, f11 + f12);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[1]) {
                    rectF2.set(fWidth - f12, f11, fWidth, f12);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[2]) {
                    rectF2.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
                    canvas.drawRect(rectF2, paint);
                }
                if (zArr[3]) {
                    return;
                }
                rectF2.set(f10, fHeight - f12, f12 + f10, fHeight);
                canvas.drawRect(rectF2, paint);
                return;
            }
        }
    }

    public final void c() {
        float fWidth;
        float fHeight;
        int i10 = b.f27381a[this.f27400t.ordinal()];
        int i11 = this.f27389g;
        int i12 = this.f27388f;
        RectF rectF = this.f27383a;
        Matrix matrix = this.j;
        RectF rectF2 = this.f27390h;
        if (i10 == 1) {
            rectF2.set(rectF);
            float f10 = this.f27398r;
            rectF2.inset(f10 / 2.0f, f10 / 2.0f);
            matrix.reset();
            matrix.setTranslate((int) c7.a.a(rectF2.width(), i12, 0.5f, 0.5f), (int) c7.a.a(rectF2.height(), i11, 0.5f, 0.5f));
        } else if (i10 != 2) {
            RectF rectF3 = this.f27385c;
            if (i10 == 3) {
                matrix.reset();
                float fMin = (((float) i12) > rectF.width() || ((float) i11) > rectF.height()) ? Math.min(rectF.width() / i12, rectF.height() / i11) : 1.0f;
                float fWidth2 = (int) (((rectF.width() - (i12 * fMin)) * 0.5f) + 0.5f);
                float fHeight2 = (int) (((rectF.height() - (i11 * fMin)) * 0.5f) + 0.5f);
                matrix.setScale(fMin, fMin);
                matrix.postTranslate(fWidth2, fHeight2);
                rectF2.set(rectF3);
                matrix.mapRect(rectF2);
                float f11 = this.f27398r;
                rectF2.inset(f11 / 2.0f, f11 / 2.0f);
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
            } else if (i10 == 5) {
                rectF2.set(rectF3);
                matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.END);
                matrix.mapRect(rectF2);
                float f12 = this.f27398r;
                rectF2.inset(f12 / 2.0f, f12 / 2.0f);
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
            } else if (i10 == 6) {
                rectF2.set(rectF3);
                matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.START);
                matrix.mapRect(rectF2);
                float f13 = this.f27398r;
                rectF2.inset(f13 / 2.0f, f13 / 2.0f);
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
            } else if (i10 != 7) {
                rectF2.set(rectF3);
                matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectF2);
                float f14 = this.f27398r;
                rectF2.inset(f14 / 2.0f, f14 / 2.0f);
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
            } else {
                rectF2.set(rectF);
                float f15 = this.f27398r;
                rectF2.inset(f15 / 2.0f, f15 / 2.0f);
                matrix.reset();
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
            }
        } else {
            rectF2.set(rectF);
            float f16 = this.f27398r;
            rectF2.inset(f16 / 2.0f, f16 / 2.0f);
            matrix.reset();
            float f17 = 0.0f;
            if (rectF2.height() * i12 > rectF2.width() * i11) {
                fWidth = rectF2.height() / i11;
                float fWidth3 = (rectF2.width() - (i12 * fWidth)) * 0.5f;
                fHeight = 0.0f;
                f17 = fWidth3;
            } else {
                fWidth = rectF2.width() / i12;
                fHeight = (rectF2.height() - (i11 * fWidth)) * 0.5f;
            }
            matrix.setScale(fWidth, fWidth);
            float f18 = (int) (f17 + 0.5f);
            float f19 = this.f27398r;
            matrix.postTranslate((f19 / 2.0f) + f18, (f19 / 2.0f) + ((int) (fHeight + 0.5f)));
        }
        this.f27384b.set(rectF2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f27394n;
        Paint paint = this.f27387e;
        if (z10) {
            BitmapShader bitmapShader = new BitmapShader(this.f27386d, this.f27392l, this.f27393m);
            Shader.TileMode tileMode = this.f27392l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f27393m == tileMode2) {
                bitmapShader.setLocalMatrix(this.j);
            }
            paint.setShader(bitmapShader);
            this.f27394n = false;
        }
        boolean z11 = this.f27397q;
        RectF rectF = this.f27390h;
        Paint paint2 = this.f27391i;
        RectF rectF2 = this.f27384b;
        if (z11) {
            if (this.f27398r <= 0.0f) {
                canvas.drawOval(rectF2, paint);
                return;
            } else {
                canvas.drawOval(rectF2, paint);
                canvas.drawOval(rectF, paint2);
                return;
            }
        }
        boolean[] zArr = this.f27396p;
        for (boolean z12 : zArr) {
            if (z12) {
                float f13 = this.f27395o;
                if (this.f27398r <= 0.0f) {
                    canvas.drawRoundRect(rectF2, f13, f13, paint);
                    b(canvas);
                    return;
                }
                canvas.drawRoundRect(rectF2, f13, f13, paint);
                canvas.drawRoundRect(rectF, f13, f13, paint2);
                b(canvas);
                for (boolean z13 : zArr) {
                    if (z13) {
                        if (this.f27395o == 0.0f) {
                            return;
                        }
                        float f14 = rectF2.left;
                        float f15 = rectF2.top;
                        float fWidth = rectF2.width() + f14;
                        float fHeight = rectF2.height() + f15;
                        float f16 = this.f27395o;
                        float f17 = this.f27398r / 2.0f;
                        if (zArr[0]) {
                            canvas2 = canvas;
                            f10 = f14;
                            f11 = f15;
                        } else {
                            canvas2 = canvas;
                            canvas2.drawLine(f14 - f17, f15, f14 + f16, f15, paint2);
                            f11 = f15;
                            canvas2.drawLine(f14, f11 - f17, f14, f11 + f16, paint2);
                            f10 = f14;
                        }
                        if (!zArr[1]) {
                            float f18 = f11;
                            canvas2.drawLine((fWidth - f16) - f17, f18, fWidth, f11, paint2);
                            canvas2.drawLine(fWidth, f18 - f17, fWidth, f18 + f16, paint2);
                            fWidth = fWidth;
                        }
                        if (zArr[2]) {
                            f12 = fHeight;
                        } else {
                            canvas2.drawLine((fWidth - f16) - f17, fHeight, fWidth + f17, fHeight, paint2);
                            canvas2.drawLine(fWidth, fHeight - f16, fWidth, fHeight, paint2);
                            f12 = fHeight;
                        }
                        if (zArr[3]) {
                            return;
                        }
                        float f19 = f12;
                        canvas2.drawLine(f10 - f17, f12, f10 + f16, f19, paint2);
                        canvas2.drawLine(f10, f12 - f16, f10, f19, paint2);
                        return;
                    }
                }
                return;
            }
        }
        canvas.drawRect(rectF2, paint);
        if (this.f27398r > 0.0f) {
            canvas.drawRect(rectF, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f27387e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f27387e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f27389g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f27388f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f27399s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27383a.set(rect);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f27399s.getColorForState(iArr, 0);
        Paint paint = this.f27391i;
        if (paint.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f27387e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27387e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f27387e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f27387e.setFilterBitmap(z10);
        invalidateSelf();
    }
}
