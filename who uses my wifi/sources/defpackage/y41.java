package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y41 extends p41 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public w41 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public y41() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        w41 w41Var = new w41();
        w41Var.c = null;
        w41Var.d = o;
        w41Var.b = new v41();
        this.g = w41Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return false;
        }
        sp.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.m;
        canvas.getMatrix(matrix);
        float[] fArr = this.l;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && tp.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        w41 w41Var = this.g;
        Bitmap bitmap = w41Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != w41Var.f.getHeight()) {
            w41Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            w41Var.k = true;
        }
        if (this.k) {
            w41 w41Var2 = this.g;
            if (w41Var2.k || w41Var2.g != w41Var2.c || w41Var2.h != w41Var2.d || w41Var2.j != w41Var2.e || w41Var2.i != w41Var2.b.getRootAlpha()) {
                w41 w41Var3 = this.g;
                w41Var3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(w41Var3.f);
                v41 v41Var = w41Var3.b;
                v41Var.a(v41Var.g, v41.p, canvas2, iMin, iMin2);
                w41 w41Var4 = this.g;
                w41Var4.g = w41Var4.c;
                w41Var4.h = w41Var4.d;
                w41Var4.i = w41Var4.b.getRootAlpha();
                w41Var4.j = w41Var4.e;
                w41Var4.k = false;
            }
        } else {
            w41 w41Var5 = this.g;
            w41Var5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(w41Var5.f);
            v41 v41Var2 = w41Var5.b;
            v41Var2.a(v41Var2.g, v41.p, canvas3, iMin, iMin2);
        }
        w41 w41Var6 = this.g;
        if (w41Var6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (w41Var6.l == null) {
                Paint paint2 = new Paint();
                w41Var6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            w41Var6.l.setAlpha(w41Var6.b.getRootAlpha());
            w41Var6.l.setColorFilter(colorFilter);
            paint = w41Var6.l;
        }
        canvas.drawBitmap(w41Var6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.g.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? sp.c(drawable) : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new x41(this.f.getConstantState());
        }
        this.g.a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.g.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.g.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        w41 w41Var = this.g;
        if (w41Var == null) {
            return false;
        }
        v41 v41Var = w41Var.b;
        if (v41Var.n == null) {
            v41Var.n = Boolean.valueOf(v41Var.g.a());
        }
        if (v41Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.g.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.j && super.mutate() == this) {
            w41 w41Var = this.g;
            w41 w41Var2 = new w41();
            w41Var2.c = null;
            w41Var2.d = o;
            if (w41Var != null) {
                w41Var2.a = w41Var.a;
                v41 v41Var = new v41(w41Var.b);
                w41Var2.b = v41Var;
                if (w41Var.b.e != null) {
                    v41Var.e = new Paint(w41Var.b.e);
                }
                if (w41Var.b.d != null) {
                    w41Var2.b.d = new Paint(w41Var.b.d);
                }
                w41Var2.c = w41Var.c;
                w41Var2.d = w41Var.d;
                w41Var2.e = w41Var.e;
            }
            this.g = w41Var2;
            this.j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        w41 w41Var = this.g;
        ColorStateList colorStateList = w41Var.c;
        if (colorStateList == null || (mode = w41Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        v41 v41Var = w41Var.b;
        if (v41Var.n == null) {
            v41Var.n = Boolean.valueOf(v41Var.g.a());
        }
        if (v41Var.n.booleanValue()) {
            boolean zB = w41Var.b.g.b(iArr);
            w41Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.g.b.getRootAlpha() != i) {
            this.g.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            zt0.s(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            sp.h(drawable, colorStateList);
            return;
        }
        w41 w41Var = this.g;
        if (w41Var.c != colorStateList) {
            w41Var.c = colorStateList;
            this.h = a(colorStateList, w41Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            sp.i(drawable, mode);
            return;
        }
        w41 w41Var = this.g;
        if (w41Var.d != mode) {
            w41Var.d = mode;
            this.h = a(w41Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f;
        if (drawable != null) {
            sp.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        w41 w41Var = this.g;
        w41Var.b = new v41();
        TypedArray typedArrayR = gi2.r(resources, theme, attributeSet, yb.f);
        w41 w41Var2 = this.g;
        v41 v41Var = w41Var2.b;
        int i3 = !gi2.p(xmlPullParser, "tintMode") ? -1 : typedArrayR.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        w41Var2.d = mode;
        ColorStateList colorStateListA = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayR.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayR.getResources();
                int resourceId = typedArrayR.getResourceId(1, 0);
                ThreadLocal threadLocal = gg.a;
                try {
                    colorStateListA = gg.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            w41Var2.c = colorStateList;
        }
        boolean z = w41Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayR.getBoolean(5, z);
        }
        w41Var2.e = z;
        float f = v41Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayR.getFloat(7, f);
        }
        v41Var.j = f;
        float f2 = v41Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayR.getFloat(8, f2);
        }
        v41Var.k = f2;
        if (v41Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayR.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            v41Var.h = typedArrayR.getDimension(3, v41Var.h);
            float dimension = typedArrayR.getDimension(2, v41Var.i);
            v41Var.i = dimension;
            if (v41Var.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayR.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = v41Var.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayR.getFloat(4, alpha);
                }
                v41Var.setAlpha(alpha);
                String string = typedArrayR.getString(0);
                if (string != null) {
                    v41Var.m = string;
                    v41Var.o.put(string, v41Var);
                }
                typedArrayR.recycle();
                w41Var.a = getChangingConfigurations();
                w41Var.k = true;
                w41 w41Var3 = this.g;
                v41 v41Var2 = w41Var3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                s41 s41Var = v41Var2.g;
                s8 s8Var = v41Var2.o;
                arrayDeque.push(s41Var);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        s41 s41Var2 = (s41) arrayDeque.peek();
                        if (s41Var2 != null) {
                            ArrayList arrayList = s41Var2.b;
                            i = depth;
                            if ("path".equals(name)) {
                                r41 r41Var = new r41();
                                r41Var.e = 0.0f;
                                r41Var.g = 1.0f;
                                r41Var.h = 1.0f;
                                r41Var.i = 0.0f;
                                r41Var.j = 1.0f;
                                r41Var.k = 0.0f;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                r41Var.l = cap2;
                                Paint.Join join2 = Paint.Join.MITER;
                                r41Var.m = join2;
                                r41Var.n = 4.0f;
                                TypedArray typedArrayR2 = gi2.r(resources, theme, attributeSet, yb.h);
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    String string2 = typedArrayR2.getString(0);
                                    if (string2 != null) {
                                        r41Var.b = string2;
                                    }
                                    String string3 = typedArrayR2.getString(2);
                                    if (string3 != null) {
                                        r41Var.a = zt0.k(string3);
                                    }
                                    r41Var.f = gi2.n(typedArrayR2, xmlPullParser, theme, "fillColor", 1);
                                    float f3 = r41Var.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                        f3 = typedArrayR2.getFloat(12, f3);
                                    }
                                    r41Var.h = f3;
                                    int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayR2.getInt(8, -1) : -1;
                                    Paint.Cap cap3 = r41Var.l;
                                    if (i6 == 0) {
                                        cap = cap2;
                                    } else if (i6 != 1) {
                                        cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                    r41Var.l = cap;
                                    int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayR2.getInt(9, -1) : -1;
                                    Paint.Join join3 = r41Var.m;
                                    if (i7 == 0) {
                                        join = join2;
                                    } else if (i7 != 1) {
                                        join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                    r41Var.m = join;
                                    float f4 = r41Var.n;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                        f4 = typedArrayR2.getFloat(10, f4);
                                    }
                                    r41Var.n = f4;
                                    r41Var.d = gi2.n(typedArrayR2, xmlPullParser, theme, "strokeColor", 3);
                                    float f5 = r41Var.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                        f5 = typedArrayR2.getFloat(11, f5);
                                    }
                                    r41Var.g = f5;
                                    float f6 = r41Var.e;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                        f6 = typedArrayR2.getFloat(4, f6);
                                    }
                                    r41Var.e = f6;
                                    float f7 = r41Var.j;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                        f7 = typedArrayR2.getFloat(6, f7);
                                    }
                                    r41Var.j = f7;
                                    float f8 = r41Var.k;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                        f8 = typedArrayR2.getFloat(7, f8);
                                    }
                                    r41Var.k = f8;
                                    float f9 = r41Var.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                        f9 = typedArrayR2.getFloat(5, f9);
                                    }
                                    r41Var.i = f9;
                                    int i8 = r41Var.c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                        i8 = typedArrayR2.getInt(13, i8);
                                    }
                                    r41Var.c = i8;
                                }
                                typedArrayR2.recycle();
                                arrayList.add(r41Var);
                                if (r41Var.getPathName() != null) {
                                    s8Var.put(r41Var.getPathName(), r41Var);
                                }
                                w41Var3.a = w41Var3.a;
                                z2 = false;
                            } else {
                                c = '\b';
                                if ("clip-path".equals(name)) {
                                    q41 q41Var = new q41();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray typedArrayR3 = gi2.r(resources, theme, attributeSet, yb.i);
                                        String string4 = typedArrayR3.getString(0);
                                        if (string4 != null) {
                                            q41Var.b = string4;
                                        }
                                        String string5 = typedArrayR3.getString(1);
                                        if (string5 != null) {
                                            q41Var.a = zt0.k(string5);
                                        }
                                        q41Var.c = !gi2.p(xmlPullParser, "fillType") ? 0 : typedArrayR3.getInt(2, 0);
                                        typedArrayR3.recycle();
                                    }
                                    arrayList.add(q41Var);
                                    if (q41Var.getPathName() != null) {
                                        s8Var.put(q41Var.getPathName(), q41Var);
                                    }
                                    w41Var3.a = w41Var3.a;
                                } else {
                                    if ("group".equals(name)) {
                                        s41 s41Var3 = new s41();
                                        TypedArray typedArrayR4 = gi2.r(resources, theme, attributeSet, yb.g);
                                        float f10 = s41Var3.c;
                                        if (gi2.p(xmlPullParser, "rotation")) {
                                            f10 = typedArrayR4.getFloat(5, f10);
                                        }
                                        s41Var3.c = f10;
                                        s41Var3.d = typedArrayR4.getFloat(1, s41Var3.d);
                                        s41Var3.e = typedArrayR4.getFloat(2, s41Var3.e);
                                        float f11 = s41Var3.f;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                            f11 = typedArrayR4.getFloat(3, f11);
                                        }
                                        s41Var3.f = f11;
                                        float f12 = s41Var3.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                            f12 = typedArrayR4.getFloat(4, f12);
                                        }
                                        s41Var3.g = f12;
                                        float f13 = s41Var3.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                            f13 = typedArrayR4.getFloat(6, f13);
                                        }
                                        s41Var3.h = f13;
                                        float f14 = s41Var3.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                            f14 = typedArrayR4.getFloat(7, f14);
                                        }
                                        s41Var3.i = f14;
                                        String string6 = typedArrayR4.getString(0);
                                        if (string6 != null) {
                                            s41Var3.k = string6;
                                        }
                                        s41Var3.c();
                                        typedArrayR4.recycle();
                                        arrayList.add(s41Var3);
                                        arrayDeque.push(s41Var3);
                                        if (s41Var3.getGroupName() != null) {
                                            s8Var.put(s41Var3.getGroupName(), s41Var3);
                                        }
                                        w41Var3.a = w41Var3.a;
                                    }
                                    i2 = 1;
                                }
                                i2 = 1;
                            }
                        } else {
                            i = depth;
                        }
                        c = '\b';
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.h = a(w41Var.c, w41Var.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayR.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayR.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public y41(w41 w41Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = w41Var;
        this.h = a(w41Var.c, w41Var.d);
    }
}
