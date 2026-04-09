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
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.HashSet;
import w1.a;

/* loaded from: classes.dex */
public class ypw extends Drawable {
    private boolean aa;
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
        this.aa = false;
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
        if (this.aa) {
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
        float f2 = this.cf;
        if (this.sba <= 0.0f) {
            canvas.drawRoundRect(this.ypw, f2, f2, this.bw);
            emc(canvas);
        } else {
            canvas.drawRoundRect(this.ypw, f2, f2, this.bw);
            canvas.drawRoundRect(this.msw, f2, f2, this.zz);
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
    public void setAlpha(int i) {
        this.bw.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.bw.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.bw.setDither(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.bw.setFilterBitmap(z6);
        invalidateSelf();
    }

    public static Drawable emc(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof ypw) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), emc(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapYpw = ypw(drawable);
        return bitmapYpw != null ? new ypw(bitmapYpw) : drawable;
    }

    private void ypw(Canvas canvas) {
        float f2;
        float f5;
        if (ypw(this.vk) || this.cf == 0.0f) {
            return;
        }
        RectF rectF = this.ypw;
        float f6 = rectF.left;
        float f7 = rectF.top;
        float fWidth = rectF.width() + f6;
        float fHeight = this.ypw.height() + f7;
        float f8 = this.cf;
        float f9 = this.sba / 2.0f;
        if (this.vk[0]) {
            f2 = f7;
        } else {
            f2 = f7;
            canvas.drawLine(f6 - f9, f7, f6 + f8, f2, this.zz);
            canvas.drawLine(f6, f2 - f9, f6, f2 + f8, this.zz);
        }
        if (!this.vk[1]) {
            float f10 = f2;
            canvas.drawLine((fWidth - f8) - f9, f10, fWidth, f2, this.zz);
            canvas.drawLine(fWidth, f10 - f9, fWidth, f10 + f8, this.zz);
            fWidth = fWidth;
        }
        if (this.vk[2]) {
            f5 = fHeight;
        } else {
            canvas.drawLine((fWidth - f8) - f9, fHeight, fWidth + f9, fHeight, this.zz);
            float f11 = fWidth;
            canvas.drawLine(f11, fHeight - f8, fWidth, fHeight, this.zz);
            f5 = fHeight;
        }
        if (this.vk[3]) {
            return;
        }
        canvas.drawLine(f6 - f9, f5, f6 + f8, f5, this.zz);
        canvas.drawLine(f6, f5 - f8, f6, f5, this.zz);
    }

    private void emc() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.emc[this.ul.ordinal()];
        if (i == 1) {
            this.msw.set(this.emc);
            RectF rectF = this.msw;
            float f2 = this.sba;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            this.ru.reset();
            this.ru.setTranslate((int) AbstractC1135f5.h(this.msw.width(), this.ycc, 0.5f, 0.5f), (int) AbstractC1135f5.h(this.msw.height(), this.uym, 0.5f, 0.5f));
        } else if (i == 2) {
            this.msw.set(this.emc);
            RectF rectF2 = this.msw;
            float f5 = this.sba;
            rectF2.inset(f5 / 2.0f, f5 / 2.0f);
            this.ru.reset();
            float fWidth2 = 0.0f;
            if (this.msw.height() * this.ycc > this.msw.width() * this.uym) {
                fWidth = this.msw.height() / this.uym;
                fHeight = 0.0f;
                fWidth2 = (this.msw.width() - (this.ycc * fWidth)) * 0.5f;
            } else {
                fWidth = this.msw.width() / this.ycc;
                fHeight = (this.msw.height() - (this.uym * fWidth)) * 0.5f;
            }
            this.ru.setScale(fWidth, fWidth);
            Matrix matrix = this.ru;
            float f6 = this.sba;
            matrix.postTranslate((f6 / 2.0f) + ((int) (fWidth2 + 0.5f)), (f6 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i == 3) {
            this.ru.reset();
            float fMin = (((float) this.ycc) > this.emc.width() || ((float) this.uym) > this.emc.height()) ? Math.min(this.emc.width() / this.ycc, this.emc.height() / this.uym) : 1.0f;
            float fWidth3 = (int) (((this.emc.width() - (this.ycc * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.emc.height() - (this.uym * fMin)) * 0.5f) + 0.5f);
            this.ru.setScale(fMin, fMin);
            this.ru.postTranslate(fWidth3, fHeight2);
            this.msw.set(this.xq);
            this.ru.mapRect(this.msw);
            RectF rectF3 = this.msw;
            float f7 = this.sba;
            rectF3.inset(f7 / 2.0f, f7 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.END);
            this.ru.mapRect(this.msw);
            RectF rectF4 = this.msw;
            float f8 = this.sba;
            rectF4.inset(f8 / 2.0f, f8 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.START);
            this.ru.mapRect(this.msw);
            RectF rectF5 = this.msw;
            float f9 = this.sba;
            rectF5.inset(f9 / 2.0f, f9 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.msw.set(this.xq);
            this.ru.setRectToRect(this.xq, this.emc, Matrix.ScaleToFit.CENTER);
            this.ru.mapRect(this.msw);
            RectF rectF6 = this.msw;
            float f10 = this.sba;
            rectF6.inset(f10 / 2.0f, f10 / 2.0f);
            this.ru.setRectToRect(this.xq, this.msw, Matrix.ScaleToFit.FILL);
        } else {
            this.msw.set(this.emc);
            RectF rectF7 = this.msw;
            float f11 = this.sba;
            rectF7.inset(f11 / 2.0f, f11 / 2.0f);
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
        for (boolean z6 : zArr) {
            if (z6) {
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
        float f2 = rectF.left;
        float f5 = rectF.top;
        float fWidth = rectF.width() + f2;
        float fHeight = this.ypw.height() + f5;
        float f6 = this.cf;
        if (!this.vk[0]) {
            this.gbl.set(f2, f5, f2 + f6, f5 + f6);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (!this.vk[1]) {
            this.gbl.set(fWidth - f6, f5, fWidth, f6);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (!this.vk[2]) {
            this.gbl.set(fWidth - f6, fHeight - f6, fWidth, fHeight);
            canvas.drawRect(this.gbl, this.bw);
        }
        if (this.vk[3]) {
            return;
        }
        this.gbl.set(f2, fHeight - f6, f6 + f2, fHeight);
        canvas.drawRect(this.gbl, this.bw);
    }

    public ypw emc(float f2, float f5, float f6, float f7) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f5));
        hashSet.add(Float.valueOf(f6));
        hashSet.add(Float.valueOf(f7));
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
            zArr[0] = f2 > 0.0f;
            zArr[1] = f5 > 0.0f;
            zArr[2] = f6 > 0.0f;
            zArr[3] = f7 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public ypw emc(float f2) {
        this.sba = f2;
        this.zz.setStrokeWidth(f2);
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

    public ypw emc(boolean z6) {
        this.aa = z6;
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
        for (boolean z6 : zArr) {
            if (z6) {
                return true;
            }
        }
        return false;
    }
}
