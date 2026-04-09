package com.bytedance.adsdk.ugeno.bly.yu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends ImageView implements IAnimation, ra {

    /* renamed from: lh, reason: collision with root package name */
    static final /* synthetic */ boolean f6834lh = true;
    private float bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f6835cf;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f6836jg;
    private boolean ko;

    /* renamed from: le, reason: collision with root package name */
    private final float[] f6837le;
    private boolean mwh;
    private ColorStateList pno;
    private Shader.TileMode qbp;
    private Drawable ra;
    private int rn;
    private Drawable ryl;

    /* renamed from: th, reason: collision with root package name */
    private Shader.TileMode f6838th;
    private ColorFilter tlj;
    private ImageView.ScaleType vm;
    yu vt;
    private float yu;
    private int zih;
    private pno zin;
    public static final Shader.TileMode ouw = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] fkw = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.bly.yu.ouw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ouw(Context context) {
        super(context);
        this.f6837le = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.pno = ColorStateList.valueOf(-16777216);
        this.bly = 0.0f;
        this.tlj = null;
        this.f6835cf = false;
        this.mwh = false;
        this.f6836jg = false;
        this.ko = false;
        Shader.TileMode tileMode = ouw;
        this.f6838th = tileMode;
        this.qbp = tileMode;
        this.zin = new pno(this);
    }

    private void lh() {
        ouw(this.ryl, this.vm);
    }

    private Drawable ouw() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i4 = this.rn;
        if (i4 != 0) {
            try {
                drawable = resources.getDrawable(i4);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.rn, e2);
                this.rn = 0;
            }
        }
        return vt.ouw(drawable);
    }

    private Drawable vt() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i4 = this.zih;
        if (i4 != 0) {
            try {
                drawable = resources.getDrawable(i4);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.zih, e2);
                this.zih = 0;
            }
        }
        return vt.ouw(drawable);
    }

    private void yu() {
        Drawable drawable = this.ryl;
        if (drawable == null || !this.f6835cf) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.ryl = drawableMutate;
        if (this.mwh) {
            drawableMutate.setColorFilter(this.tlj);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.pno.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.pno;
    }

    public float getBorderRadius() {
        return this.zin.ouw;
    }

    public float getBorderWidth() {
        return this.bly;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f6837le) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ouw.ra
    public float getRipple() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getRubIn() {
        return this.zin.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.vm;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getShine() {
        return this.zin.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getStretch() {
        return this.zin.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.f6838th;
    }

    public Shader.TileMode getTileModeY() {
        return this.qbp;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ouw(canvas, this);
            this.vt.ouw(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.fkw();
        }
        super.onLayout(z3, i4, i10, i11, i12);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i10) {
        yu yuVar = this.vt;
        if (yuVar == null) {
            super.onMeasure(i4, i10);
        } else {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        ColorDrawable colorDrawable = new ColorDrawable(i4);
        this.ra = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.ra = drawable;
        ouw(true);
        super.setBackgroundDrawable(this.ra);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) throws Resources.NotFoundException {
        if (this.zih != i4) {
            this.zih = i4;
            Drawable drawableVt = vt();
            this.ra = drawableVt;
            setBackgroundDrawable(drawableVt);
        }
    }

    public void setBorderColor(int i4) {
        setBorderColor(ColorStateList.valueOf(i4));
    }

    public void setBorderRadius(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.ouw(f10);
        }
    }

    public void setBorderWidth(int i4) {
        setBorderWidth(getResources().getDimension(i4));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.tlj != colorFilter) {
            this.tlj = colorFilter;
            this.mwh = true;
            this.f6835cf = true;
            yu();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        ouw(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i4) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i4);
        ouw(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.rn = 0;
        this.ryl = vt.ouw(bitmap);
        lh();
        super.setImageDrawable(this.ryl);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.rn = 0;
        this.ryl = vt.ouw(drawable);
        lh();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        if (this.rn != i4) {
            this.rn = i4;
            this.ryl = ouw();
            lh();
            super.setImageDrawable(this.ryl);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z3) {
        this.f6836jg = z3;
        lh();
        ouw(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.yu = f10;
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f6834lh && scaleType == null) {
            throw new AssertionError();
        }
        if (this.vm != scaleType) {
            this.vm = scaleType;
            int i4 = AnonymousClass1.ouw[scaleType.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            lh();
            ouw(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public void setStretch(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f6838th == tileMode) {
            return;
        }
        this.f6838th = tileMode;
        lh();
        ouw(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.qbp == tileMode) {
            return;
        }
        this.qbp = tileMode;
        lh();
        ouw(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.pno.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.pno = colorStateList;
        lh();
        ouw(false);
        if (this.bly > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.bly == f10) {
            return;
        }
        this.bly = f10;
        lh();
        ouw(false);
        invalidate();
    }

    private void ouw(boolean z3) {
        if (this.ko) {
            if (z3) {
                this.ra = vt.ouw(this.ra);
            }
            ouw(this.ra, ImageView.ScaleType.FIT_XY);
        }
    }

    private void ouw(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof vt) {
            vt vtVar = (vt) drawable;
            vt vtVarOuw = vtVar.ouw(scaleType).ouw(this.bly).ouw(this.pno);
            vtVarOuw.ouw = this.f6836jg;
            vtVarOuw.ouw(this.f6838th).vt(this.qbp);
            float[] fArr = this.f6837le;
            if (fArr != null) {
                vtVar.ouw(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            yu();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                ouw(layerDrawable.getDrawable(i4), scaleType);
            }
        }
    }

    private void ouw(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f6837le;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        lh();
        ouw(false);
        invalidate();
    }
}
