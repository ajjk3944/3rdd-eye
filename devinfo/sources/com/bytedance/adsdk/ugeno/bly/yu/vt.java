package com.bytedance.adsdk.ugeno.bly.yu;

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
import com.applovin.shadow.okio.a;
import java.util.HashSet;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends Drawable {
    private final RectF bly;

    /* renamed from: cf, reason: collision with root package name */
    private final Matrix f6839cf;
    private final Bitmap fkw;

    /* renamed from: jg, reason: collision with root package name */
    private Shader.TileMode f6840jg;
    private boolean ko;

    /* renamed from: le, reason: collision with root package name */
    private final Paint f6841le;
    private Shader.TileMode mwh;
    boolean ouw;
    private final int pno;
    private ImageView.ScaleType qbp;
    private final int ra;
    private float rn;
    private final RectF ryl;

    /* renamed from: th, reason: collision with root package name */
    private ColorStateList f6843th;
    private final Paint tlj;
    private float vm;
    private final RectF yu;
    private final boolean[] zih;
    private final RectF vt = new RectF();

    /* renamed from: lh, reason: collision with root package name */
    private final RectF f6842lh = new RectF();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.bly.yu.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private vt(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.yu = rectF;
        this.bly = new RectF();
        this.f6839cf = new Matrix();
        this.ryl = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mwh = tileMode;
        this.f6840jg = tileMode;
        this.ko = true;
        this.rn = 0.0f;
        this.zih = new boolean[]{true, true, true, true};
        this.ouw = false;
        this.vm = 0.0f;
        this.f6843th = ColorStateList.valueOf(-16777216);
        this.qbp = ImageView.ScaleType.FIT_CENTER;
        this.fkw = bitmap;
        int width = bitmap.getWidth();
        this.ra = width;
        int height = bitmap.getHeight();
        this.pno = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f6841le = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.tlj = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f6843th.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.vm);
    }

    public static vt ouw(Bitmap bitmap) {
        if (bitmap != null) {
            return new vt(bitmap);
        }
        return null;
    }

    private static Bitmap vt(Drawable drawable) {
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
        } catch (Throwable th2) {
            th2.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        if (this.ko) {
            BitmapShader bitmapShader = new BitmapShader(this.fkw, this.mwh, this.f6840jg);
            Shader.TileMode tileMode = this.mwh;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f6840jg == tileMode2) {
                bitmapShader.setLocalMatrix(this.f6839cf);
            }
            this.f6841le.setShader(bitmapShader);
            this.ko = false;
        }
        if (this.ouw) {
            if (this.vm <= 0.0f) {
                canvas.drawOval(this.f6842lh, this.f6841le);
                return;
            } else {
                canvas.drawOval(this.f6842lh, this.f6841le);
                canvas.drawOval(this.bly, this.tlj);
                return;
            }
        }
        if (!ouw(this.zih)) {
            canvas.drawRect(this.f6842lh, this.f6841le);
            if (this.vm > 0.0f) {
                canvas.drawRect(this.bly, this.tlj);
                return;
            }
            return;
        }
        float f12 = this.rn;
        if (this.vm <= 0.0f) {
            canvas.drawRoundRect(this.f6842lh, f12, f12, this.f6841le);
            ouw(canvas);
            return;
        }
        canvas.drawRoundRect(this.f6842lh, f12, f12, this.f6841le);
        canvas.drawRoundRect(this.bly, f12, f12, this.tlj);
        ouw(canvas);
        if (vt(this.zih) || this.rn == 0.0f) {
            return;
        }
        RectF rectF = this.f6842lh;
        float f13 = rectF.left;
        float f14 = rectF.top;
        float fWidth = rectF.width() + f13;
        float fHeight = this.f6842lh.height() + f14;
        float f15 = this.rn;
        float f16 = this.vm / 2.0f;
        if (this.zih[0]) {
            f10 = f14;
        } else {
            canvas.drawLine(f13 - f16, f14, f13 + f15, f14, this.tlj);
            f10 = f14;
            canvas.drawLine(f13, f10 - f16, f13, f10 + f15, this.tlj);
        }
        if (!this.zih[1]) {
            float f17 = f10;
            canvas.drawLine((fWidth - f15) - f16, f17, fWidth, f10, this.tlj);
            canvas.drawLine(fWidth, f17 - f16, fWidth, f17 + f15, this.tlj);
            fWidth = fWidth;
        }
        if (this.zih[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f15) - f16, fHeight, fWidth + f16, fHeight, this.tlj);
            float f18 = fWidth;
            canvas.drawLine(f18, fHeight - f15, fWidth, fHeight, this.tlj);
            f11 = fHeight;
        }
        if (this.zih[3]) {
            return;
        }
        float f19 = f11;
        canvas.drawLine(f13 - f16, f11, f13 + f15, f19, this.tlj);
        canvas.drawLine(f13, f11 - f15, f13, f19, this.tlj);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6841le.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f6841le.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.pno;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.ra;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f6843th.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.vt.set(rect);
        ouw();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f6843th.getColorForState(iArr, 0);
        if (this.tlj.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.tlj.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f6841le.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6841le.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f6841le.setDither(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f6841le.setFilterBitmap(z3);
        invalidateSelf();
    }

    public static Drawable ouw(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof vt) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.i(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i4), ouw(layerDrawable.getDrawable(i4)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapVt = vt(drawable);
        return bitmapVt != null ? new vt(bitmapVt) : drawable;
    }

    public final vt vt(Shader.TileMode tileMode) {
        if (this.f6840jg != tileMode) {
            this.f6840jg = tileMode;
            this.ko = true;
            invalidateSelf();
        }
        return this;
    }

    private void ouw() {
        float fWidth;
        float fHeight;
        int i4 = AnonymousClass1.ouw[this.qbp.ordinal()];
        if (i4 == 1) {
            this.bly.set(this.vt);
            RectF rectF = this.bly;
            float f10 = this.vm;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f6839cf.reset();
            this.f6839cf.setTranslate((int) c.c(this.bly.width(), this.ra, 0.5f, 0.5f), (int) c.c(this.bly.height(), this.pno, 0.5f, 0.5f));
        } else if (i4 == 2) {
            this.bly.set(this.vt);
            RectF rectF2 = this.bly;
            float f11 = this.vm;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f6839cf.reset();
            float fWidth2 = 0.0f;
            if (this.bly.height() * this.ra > this.bly.width() * this.pno) {
                fWidth = this.bly.height() / this.pno;
                fHeight = 0.0f;
                fWidth2 = (this.bly.width() - (this.ra * fWidth)) * 0.5f;
            } else {
                fWidth = this.bly.width() / this.ra;
                fHeight = (this.bly.height() - (this.pno * fWidth)) * 0.5f;
            }
            this.f6839cf.setScale(fWidth, fWidth);
            Matrix matrix = this.f6839cf;
            float f12 = this.vm;
            matrix.postTranslate((f12 / 2.0f) + ((int) (fWidth2 + 0.5f)), (f12 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i4 == 3) {
            this.f6839cf.reset();
            float fMin = (((float) this.ra) > this.vt.width() || ((float) this.pno) > this.vt.height()) ? Math.min(this.vt.width() / this.ra, this.vt.height() / this.pno) : 1.0f;
            float fWidth3 = (int) (((this.vt.width() - (this.ra * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.vt.height() - (this.pno * fMin)) * 0.5f) + 0.5f);
            this.f6839cf.setScale(fMin, fMin);
            this.f6839cf.postTranslate(fWidth3, fHeight2);
            this.bly.set(this.yu);
            this.f6839cf.mapRect(this.bly);
            RectF rectF3 = this.bly;
            float f13 = this.vm;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f6839cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i4 == 5) {
            this.bly.set(this.yu);
            this.f6839cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.END);
            this.f6839cf.mapRect(this.bly);
            RectF rectF4 = this.bly;
            float f14 = this.vm;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f6839cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i4 == 6) {
            this.bly.set(this.yu);
            this.f6839cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.START);
            this.f6839cf.mapRect(this.bly);
            RectF rectF5 = this.bly;
            float f15 = this.vm;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f6839cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i4 != 7) {
            this.bly.set(this.yu);
            this.f6839cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.CENTER);
            this.f6839cf.mapRect(this.bly);
            RectF rectF6 = this.bly;
            float f16 = this.vm;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f6839cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else {
            this.bly.set(this.vt);
            RectF rectF7 = this.bly;
            float f17 = this.vm;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f6839cf.reset();
            this.f6839cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        }
        this.f6842lh.set(this.bly);
        this.ko = true;
    }

    private static boolean vt(boolean[] zArr) {
        for (boolean z3 : zArr) {
            if (z3) {
                return false;
            }
        }
        return true;
    }

    private void ouw(Canvas canvas) {
        if (vt(this.zih) || this.rn == 0.0f) {
            return;
        }
        RectF rectF = this.f6842lh;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f6842lh.height() + f11;
        float f12 = this.rn;
        if (!this.zih[0]) {
            this.ryl.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.ryl, this.f6841le);
        }
        if (!this.zih[1]) {
            this.ryl.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.ryl, this.f6841le);
        }
        if (!this.zih[2]) {
            this.ryl.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.ryl, this.f6841le);
        }
        if (this.zih[3]) {
            return;
        }
        this.ryl.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.ryl, this.f6841le);
    }

    public final vt ouw(float f10, float f11, float f12, float f13) {
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
                    this.rn = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.rn = 0.0f;
            }
            boolean[] zArr = this.zih;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public final vt ouw(float f10) {
        this.vm = f10;
        this.tlj.setStrokeWidth(f10);
        return this;
    }

    public final vt ouw(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f6843th = colorStateList;
        this.tlj.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public final vt ouw(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.qbp != scaleType) {
            this.qbp = scaleType;
            ouw();
        }
        return this;
    }

    public final vt ouw(Shader.TileMode tileMode) {
        if (this.mwh != tileMode) {
            this.mwh = tileMode;
            this.ko = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ouw(boolean[] zArr) {
        for (boolean z3 : zArr) {
            if (z3) {
                return true;
            }
        }
        return false;
    }
}
