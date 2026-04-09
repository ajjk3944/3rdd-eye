package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.widget.ImageView;
import g4.j;
import io.sentry.android.core.e0;
import java.util.HashSet;
import zg.a;
import zg.c;
import zg.d;

/* loaded from: classes.dex */
public class RoundedImageView extends ImageView {
    public static final Shader.TileMode L = Shader.TileMode.CLAMP;
    public static final ImageView.ScaleType[] M = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Drawable B;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public int H;
    public ImageView.ScaleType I;
    public Shader.TileMode J;
    public Shader.TileMode K;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5844a;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f5845d;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f5846g;

    /* renamed from: r, reason: collision with root package name */
    public float f5847r;

    /* renamed from: x, reason: collision with root package name */
    public ColorFilter f5848x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5849y;

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f5844a = fArr;
        this.f5846g = ColorStateList.valueOf(-16777216);
        this.f5847r = 0.0f;
        this.f5848x = null;
        this.f5849y = false;
        this.D = false;
        this.E = false;
        this.F = false;
        Shader.TileMode tileMode = L;
        this.J = tileMode;
        this.K = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.RoundedImageView, 0, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(a.RoundedImageView_android_scaleType, -1);
        if (i10 >= 0) {
            setScaleType(M[i10]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_corner_radius_bottom_left, -1);
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            float[] fArr2 = this.f5844a;
            if (fArr2[i11] < 0.0f) {
                fArr2[i11] = 0.0f;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length = this.f5844a.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f5844a[i12] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.RoundedImageView_riv_border_width, -1);
        this.f5847r = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f5847r = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(a.RoundedImageView_riv_border_color);
        this.f5846g = colorStateList;
        if (colorStateList == null) {
            this.f5846g = ColorStateList.valueOf(-16777216);
        }
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(a.RoundedImageView_riv_mutate_background, false);
        this.F = z11;
        this.E = typedArrayObtainStyledAttributes.getBoolean(a.RoundedImageView_riv_oval, false);
        int i13 = typedArrayObtainStyledAttributes.getInt(a.RoundedImageView_riv_tile_mode, -2);
        if (i13 != -2) {
            setTileModeX(a(i13));
            setTileModeY(a(i13));
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(a.RoundedImageView_riv_tile_mode_x, -2);
        if (i14 != -2) {
            setTileModeX(a(i14));
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(a.RoundedImageView_riv_tile_mode_y, -2);
        if (i15 != -2) {
            setTileModeY(a(i15));
        }
        e();
        d(true);
        if (z11) {
            super.setBackgroundDrawable(this.f5845d);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static Shader.TileMode a(int i10) {
        if (i10 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f5844a;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        e();
        d(false);
        invalidate();
    }

    public final void c(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (!(drawable instanceof c)) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    c(layerDrawable.getDrawable(i10), scaleType);
                }
                return;
            }
            return;
        }
        c cVar = (c) drawable;
        Paint paint = cVar.f27391i;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (cVar.f27400t != scaleType) {
            cVar.f27400t = scaleType;
            cVar.c();
        }
        float f10 = this.f5847r;
        cVar.f27398r = f10;
        paint.setStrokeWidth(f10);
        ColorStateList colorStateListValueOf = this.f5846g;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        cVar.f27399s = colorStateListValueOf;
        paint.setColor(colorStateListValueOf.getColorForState(cVar.getState(), -16777216));
        cVar.f27397q = this.E;
        Shader.TileMode tileMode = this.J;
        if (cVar.f27392l != tileMode) {
            cVar.f27392l = tileMode;
            cVar.f27394n = true;
            cVar.invalidateSelf();
        }
        Shader.TileMode tileMode2 = this.K;
        if (cVar.f27393m != tileMode2) {
            cVar.f27393m = tileMode2;
            cVar.f27394n = true;
            cVar.invalidateSelf();
        }
        float[] fArr = this.f5844a;
        if (fArr != null) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            HashSet hashSet = new HashSet(4);
            hashSet.add(Float.valueOf(f11));
            hashSet.add(Float.valueOf(f12));
            hashSet.add(Float.valueOf(f13));
            hashSet.add(Float.valueOf(f14));
            hashSet.remove(Float.valueOf(0.0f));
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
            }
            if (hashSet.isEmpty()) {
                cVar.f27395o = 0.0f;
            } else {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                    throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
                }
                cVar.f27395o = fFloatValue;
            }
            boolean[] zArr = cVar.f27396p;
            zArr[0] = f11 > 0.0f;
            zArr[1] = f12 > 0.0f;
            zArr[2] = f13 > 0.0f;
            zArr[3] = f14 > 0.0f;
        }
        Drawable drawable2 = this.B;
        if (drawable2 == null || !this.f5849y) {
            return;
        }
        Drawable drawableMutate = drawable2.mutate();
        this.B = drawableMutate;
        if (this.D) {
            drawableMutate.setColorFilter(this.f5848x);
        }
    }

    public final void d(boolean z10) {
        if (this.F) {
            if (z10) {
                this.f5845d = c.a(this.f5845d);
            }
            c(this.f5845d, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void e() {
        c(this.B, this.I);
    }

    @ColorInt
    public int getBorderColor() {
        return this.f5846g.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f5846g;
    }

    public float getBorderWidth() {
        return this.f5847r;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f5844a) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.I;
    }

    public Shader.TileMode getTileModeX() {
        return this.J;
    }

    public Shader.TileMode getTileModeY() {
        return this.K;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f5845d = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f5845d = drawable;
        d(true);
        super.setBackgroundDrawable(this.f5845d);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) throws Resources.NotFoundException {
        if (this.H != i10) {
            this.H = i10;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i11 = this.H;
                if (i11 != 0) {
                    try {
                        drawable = resources.getDrawable(i11);
                    } catch (Exception e4) {
                        e0.q("RoundedImageView", "Unable to find resource: " + this.H, e4);
                        this.H = 0;
                    }
                }
                drawable = c.a(drawable);
            }
            this.f5845d = drawable;
            setBackgroundDrawable(drawable);
        }
    }

    public void setBorderColor(@ColorInt int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderWidth(@DimenRes int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5848x != colorFilter) {
            this.f5848x = colorFilter;
            this.D = true;
            this.f5849y = true;
            Drawable drawable = this.B;
            if (drawable != null) {
                Drawable drawableMutate = drawable.mutate();
                this.B = drawableMutate;
                if (this.D) {
                    drawableMutate.setColorFilter(this.f5848x);
                }
            }
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        b(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(@DimenRes int i10) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i10);
        b(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c cVar;
        this.G = 0;
        if (bitmap != null) {
            cVar = new c(bitmap);
        } else {
            int i10 = c.f27382u;
            cVar = null;
        }
        this.B = cVar;
        e();
        super.setImageDrawable(this.B);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.G = 0;
        this.B = c.a(drawable);
        e();
        super.setImageDrawable(this.B);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) throws Resources.NotFoundException {
        if (this.G != i10) {
            this.G = i10;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i11 = this.G;
                if (i11 != 0) {
                    try {
                        drawable = resources.getDrawable(i11);
                    } catch (Exception e4) {
                        e0.q("RoundedImageView", "Unable to find resource: " + this.G, e4);
                        this.G = 0;
                    }
                }
                drawable = c.a(drawable);
            }
            this.B = drawable;
            e();
            super.setImageDrawable(this.B);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.E = z10;
        e();
        d(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.I != scaleType) {
            this.I = scaleType;
            switch (d.f27401a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case j.STRING_FIELD_NUMBER /* 5 */:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            e();
            d(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.J == tileMode) {
            return;
        }
        this.J = tileMode;
        e();
        d(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.K == tileMode) {
            return;
        }
        this.K = tileMode;
        e();
        d(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f5846g.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f5846g = colorStateList;
        e();
        d(false);
        if (this.f5847r > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.f5847r == f10) {
            return;
        }
        this.f5847r = f10;
        e();
        d(false);
        invalidate();
    }
}
