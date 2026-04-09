package com.bytedance.adsdk.ugeno.zz.dg;

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
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.emc.msw;
import com.bytedance.adsdk.ugeno.emc.uym;

/* loaded from: classes.dex */
public class emc extends ImageView implements IAnimation, uym {
    static final /* synthetic */ boolean ypw = true;
    private ImageView.ScaleType aa;
    private final float[] bw;
    private int cf;
    private Drawable gbl;
    private float msw;
    private boolean qh;
    private boolean ru;
    private Shader.TileMode sba;
    private boolean sup;
    private boolean sz;
    private dg ul;
    private ColorStateList uym;
    private int vk;
    private float xq;
    private Drawable ycc;
    private msw ylm;
    private Shader.TileMode yzg;
    private ColorFilter zz;
    public static final Shader.TileMode emc = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] dg = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.bytedance.adsdk.ugeno.zz.dg.emc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            emc = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                emc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public emc(Context context) {
        super(context);
        this.bw = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.uym = ColorStateList.valueOf(-16777216);
        this.msw = 0.0f;
        this.zz = null;
        this.ru = false;
        this.sup = false;
        this.sz = false;
        this.qh = false;
        Shader.TileMode tileMode = emc;
        this.sba = tileMode;
        this.yzg = tileMode;
        this.ylm = new msw(this);
    }

    private void dg() {
        Drawable drawable = this.gbl;
        if (drawable == null || !this.ru) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.gbl = drawableMutate;
        if (this.sup) {
            drawableMutate.setColorFilter(this.zz);
        }
    }

    private Drawable emc() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.cf;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e6) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.cf, e6);
                this.cf = 0;
            }
        }
        return ypw.emc(drawable);
    }

    private void xq() {
        emc(this.gbl, this.aa);
    }

    private Drawable ypw() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.vk;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e6) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.vk, e6);
                this.vk = 0;
            }
        }
        return ypw.emc(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.ypw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.uym.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.uym;
    }

    public float getBorderRadius() {
        return this.ylm.emc();
    }

    public float getBorderWidth() {
        return this.msw;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f2 : this.bw) {
            fMax = Math.max(f2, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.emc.uym
    public float getRipple() {
        return this.xq;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRubIn() {
        return this.ylm.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.aa;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getShine() {
        return this.ylm.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getStretch() {
        return this.ylm.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.sba;
    }

    public Shader.TileMode getTileModeY() {
        return this.yzg;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.emc(canvas, this);
            this.ul.emc(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.emc(i, i3, i6, i7);
        }
        super.onLayout(z6, i, i3, i6, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.ul;
        if (dgVar == null) {
            super.onMeasure(i, i3);
        } else {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.ul;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i6);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.ycc = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.ycc = drawable;
        emc(true);
        super.setBackgroundDrawable(this.ycc);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) throws Resources.NotFoundException {
        if (this.vk != i) {
            this.vk = i;
            Drawable drawableYpw = ypw();
            this.ycc = drawableYpw;
            setBackgroundDrawable(drawableYpw);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderRadius(float f2) {
        msw mswVar = this.ylm;
        if (mswVar != null) {
            mswVar.emc(f2);
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.zz != colorFilter) {
            this.zz = colorFilter;
            this.sup = true;
            this.ru = true;
            dg();
            invalidate();
        }
    }

    public void setCornerRadius(float f2) {
        emc(f2, f2, f2, f2);
    }

    public void setCornerRadiusDimen(int i) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i);
        emc(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.cf = 0;
        this.gbl = ypw.emc(bitmap);
        xq();
        super.setImageDrawable(this.gbl);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.cf = 0;
        this.gbl = ypw.emc(drawable);
        xq();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.cf != i) {
            this.cf = i;
            this.gbl = emc();
            xq();
            super.setImageDrawable(this.gbl);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z6) {
        this.sz = z6;
        xq();
        emc(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f2) {
        this.xq = f2;
        msw mswVar = this.ylm;
        if (mswVar != null) {
            mswVar.ypw(f2);
        }
        postInvalidate();
    }

    public void setRubIn(float f2) {
        msw mswVar = this.ylm;
        if (mswVar != null) {
            mswVar.bw(f2);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!ypw && scaleType == null) {
            throw new AssertionError();
        }
        if (this.aa != scaleType) {
            this.aa = scaleType;
            int i = AnonymousClass1.emc[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            xq();
            emc(false);
            invalidate();
        }
    }

    public void setShine(float f2) {
        msw mswVar = this.ylm;
        if (mswVar != null) {
            mswVar.xq(f2);
        }
    }

    public void setStretch(float f2) {
        msw mswVar = this.ylm;
        if (mswVar != null) {
            mswVar.dg(f2);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.sba == tileMode) {
            return;
        }
        this.sba = tileMode;
        xq();
        emc(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.yzg == tileMode) {
            return;
        }
        this.yzg = tileMode;
        xq();
        emc(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.uym.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.uym = colorStateList;
        xq();
        emc(false);
        if (this.msw > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f2) {
        if (this.msw == f2) {
            return;
        }
        this.msw = f2;
        xq();
        emc(false);
        invalidate();
    }

    private void emc(boolean z6) {
        if (this.qh) {
            if (z6) {
                this.ycc = ypw.emc(this.ycc);
            }
            emc(this.ycc, ImageView.ScaleType.FIT_XY);
        }
    }

    private void emc(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ypw) {
            ypw ypwVar = (ypw) drawable;
            ypwVar.emc(scaleType).emc(this.msw).emc(this.uym).emc(this.sz).emc(this.sba).ypw(this.yzg);
            float[] fArr = this.bw;
            if (fArr != null) {
                ypwVar.emc(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            dg();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                emc(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    public void emc(float f2, float f5, float f6, float f7) {
        float[] fArr = this.bw;
        if (fArr[0] == f2 && fArr[1] == f5 && fArr[2] == f7 && fArr[3] == f6) {
            return;
        }
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[3] = f6;
        fArr[2] = f7;
        xq();
        emc(false);
        invalidate();
    }

    public void emc(dg dgVar) {
        this.ul = dgVar;
    }
}
