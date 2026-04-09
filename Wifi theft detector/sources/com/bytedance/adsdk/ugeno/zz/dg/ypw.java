package com.bytedance.adsdk.ugeno.zz.dg;

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
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* loaded from: classes.dex */
public class ypw extends Drawable {

    /* renamed from: aa, reason: collision with root package name */
    private boolean f9218aa;
    private final Paint bw;
    private float cf;
    private final Bitmap dg;
    private final RectF gbl;
    private final RectF msw;
    private boolean qh;
    private final Matrix ru;
    private float sba;
    private Shader.TileMode sup;
    private Shader.TileMode sz;
    private ImageView.ScaleType ul;
    private final int uym;
    private final boolean[] vk;
    private final RectF xq;
    private final int ycc;
    private ColorStateList yzg;
    private final Paint zz;
    private final RectF emc = new RectF();
    private final RectF ypw = new RectF();

    /* renamed from: com.bytedance.adsdk.ugeno.zz.dg.ypw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            emc = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                emc[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ypw(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.xq = rectF;
        this.msw = new RectF();
        this.ru = new Matrix();
        this.gbl = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.sup = tileMode;
        this.sz = tileMode;
        this.qh = true;
        this.cf = 0.0f;
        this.vk = new boolean[]{true, true, true, true};
        this.f9218aa = false;
        this.sba = 0.0f;
        this.yzg = ColorStateList.valueOf(-16777216);
        this.ul = ImageView.ScaleType.FIT_CENTER;
        this.dg = bitmap;
        int width = bitmap.getWidth();
        this.ycc = width;
        int height = bitmap.getHeight();
        this.uym = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.bw = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.zz = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.yzg.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.sba);
    }

    public static ypw emc(Bitmap bitmap) {
        if (bitmap != null) {
            return new ypw(bitmap);
        }
        return null;
    }

    public static Bitmap ypw(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.qh) {
            BitmapShader bitmapShader = new BitmapShader(this.dg, this.sup, this.sz);
            Shader.TileMode tileMode = this.sup;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.sz == tileMode2) {
                bitmapShader.setLocalMatrix(this.ru);
            }
            this.bw.setShader(bitmapShader);
            this.qh = false;
        }
        if (this.f9218aa) {
            if (this.sba <= 0.0f) {
                canvas.drawOval(this.ypw, this.bw);
                return;
            } else {
                canvas.drawOval(this.ypw, this.bw);
                canvas.drawOval(this.msw, this.zz);
                return;
            }
        }
        if (!emc(this.vk)) {
            canvas.drawRect(this.ypw, this.bw);
            if (this.sba > 0.0f) {
                canvas.drawRect(this.msw, this.zz);
                return;
            }
            return;
        }
        float f10 = this.cf;
        if (this.sba <= 0.0f) {
            canvas.drawRoundRect(this.ypw, f10, f10, this.bw);
            emc(canvas);
        } else {
            canvas.drawRoundRect(this.ypw, f10, f10, this.bw);
            canvas.drawRoundRect(this.msw, f10, f10, this.zz);
            emc(canvas);
            ypw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.bw.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.bw.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.uym;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.ycc;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.yzg.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.emc.set(rect);
        emc();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.yzg.getColorForState(iArr, 0);
        if (this.zz.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.zz.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.bw.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.bw.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.bw.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.bw.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable emc(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof ypw) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), emc(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapYpw = ypw(drawable);
        return bitmapYpw != null ? new ypw(bitmapYpw) : drawable;
    }

    private void ypw(Canvas canvas) {
        float f10;
        float f11;
        if (ypw(this.vk) || this.cf == 0.0f) {
            return;
        }
        RectF rectF = this.ypw;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.ypw.height();
        float f14 = this.cf;
        float f15 = this.sba / 2.0f;
        if (this.vk[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.zz);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.zz);
        }
        if (!this.vk[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.zz);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.zz);
            fWidth = fWidth;
        }
        if (this.vk[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.zz);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.zz);
            f11 = fHeight;
        }
        if (this.vk[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.zz);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.zz);
    }

    private void emc() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.emc[this.ul.ordinal()];
        if (i10 == 1) {
            this.msw.set(this.emc);
            RectF rectF = this.msw;
            float f10 = this.sba;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.ru.reset();
            this.ru.setTranslate((int) (((this.msw.width() - this.ycc) * 0.5f) + 0.5f), (int) (((this.msw.height() - this.uym) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.msw.set(this.emc);
            RectF rectF2 = this.msw;
            float f11 = this.sba;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.ru.reset();
            float fWidth2 = 0.0f;
            if (this.ycc * this.msw.height() > this.msw.width() * this.uym) {
                fWidth = this.msw.height() / this.uym;
                fHeight = 0.0f;
                fWidth2 = (this.msw.width() - (this.ycc * fWidth)) * 0.5f;
            } else {
                fWidth = this.msw.width() / this.ycc;
                fHeight = (this.msw.height() - (this.uym * fWidth)) * 0.5f;
            }
            this.ru.setScale(fWidth, fWidth);
            Matrix matrix = this.ru;
            float f12 = this.sba;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.ru.reset();
            float fMin = (((float) this.ycc) > this.emc.width() || ((float) this.uym) > this.emc.height()) ? Math.min(this.emc.width() / this.ycc, this.emc.height() / this.uym) : 1.0f;
            float fWidth3 = (int) (((this.emc.width() - (this.ycc * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.emc.height() - (this.uym * fMin)) * 0.5f) + 0.5f);
            this.ru.setScale(fMin, fMin);
            this.ru.postTranslate(fWidth3, fHeight2);
            this.msw.set(this.xq);
            this.ru.mapRect(this.msw);
            RectF rectF3 = this.msw;
            float f13 = this.sba;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.END);
            this.ru.mapRect(this.msw);
            RectF rectF4 = this.msw;
            float f14 = this.sba;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.START);
            this.ru.mapRect(this.msw);
            RectF rectF5 = this.msw;
            float f15 = this.sba;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.CENTER);
            this.ru.mapRect(this.msw);
            RectF rectF6 = this.msw;
            float f16 = this.sba;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else {
            this.msw.set(this.emc);
            RectF rectF7 = this.msw;
            float f17 = this.sba;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.ru.reset();
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        }
        this.ypw.set(this.msw);
        this.qh = true;
    }

    public ypw ypw(Shader.TileMode tileMode) {
        if (this.sz != tileMode) {
            this.sz = tileMode;
            this.qh = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ypw(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void emc(Canvas canvas) {
        if (ypw(this.vk) || this.cf == 0.0f) {
            return;
        }
        RectF rectF = this.ypw;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.ypw.height() + f11;
        float f12 = this.cf;
        if (!this.vk[0]) {
            this.gbl.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (!this.vk[1]) {
            this.gbl.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (!this.vk[2]) {
            this.gbl.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (this.vk[3]) {
            return;
        }
        this.gbl.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.gbl, this.bw);
    }

    public ypw emc(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.cf = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.cf = 0.0f;
            }
            boolean[] zArr = this.vk;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public ypw emc(float f10) {
        this.sba = f10;
        this.zz.setStrokeWidth(f10);
        return this;
    }

    public ypw emc(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.yzg = colorStateList;
        this.zz.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public ypw emc(boolean z10) {
        this.f9218aa = z10;
        return this;
    }

    public ypw emc(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.ul != scaleType) {
            this.ul = scaleType;
            emc();
        }
        return this;
    }

    public ypw emc(Shader.TileMode tileMode) {
        if (this.sup != tileMode) {
            this.sup = tileMode;
            this.qh = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean emc(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
