package M0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.C2936e;

/* loaded from: classes.dex */
public final class r extends i {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f2695j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public p f2696b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f2697c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f2698d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2699e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2700f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2701g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f2702h;
    public final Rect i;

    public r() {
        this.f2700f = true;
        this.f2701g = new float[9];
        this.f2702h = new Matrix();
        this.i = new Rect();
        p pVar = new p();
        pVar.f2685c = null;
        pVar.f2686d = f2695j;
        pVar.f2684b = new o();
        this.f2696b = pVar;
    }

    public static r a(int i, Resources.Theme theme, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            r rVar = new r();
            ThreadLocal threadLocal = I.l.f1870a;
            rVar.f2644a = resources.getDrawable(i, theme);
            new q(rVar.f2644a.getConstantState());
            return rVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            r rVar2 = new r();
            rVar2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
            return rVar2;
        } catch (IOException e6) {
            Log.e("VectorDrawableCompat", "parser error", e6);
            return null;
        } catch (XmlPullParserException e7) {
            Log.e("VectorDrawableCompat", "parser error", e7);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2644a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2698d;
        if (colorFilter == null) {
            colorFilter = this.f2697c;
        }
        Matrix matrix = this.f2702h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2701g;
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        p pVar = this.f2696b;
        Bitmap bitmap = pVar.f2688f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != pVar.f2688f.getHeight()) {
            pVar.f2688f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            pVar.f2692k = true;
        }
        if (this.f2700f) {
            p pVar2 = this.f2696b;
            if (pVar2.f2692k || pVar2.f2689g != pVar2.f2685c || pVar2.f2690h != pVar2.f2686d || pVar2.f2691j != pVar2.f2687e || pVar2.i != pVar2.f2684b.getRootAlpha()) {
                p pVar3 = this.f2696b;
                pVar3.f2688f.eraseColor(0);
                Canvas canvas2 = new Canvas(pVar3.f2688f);
                o oVar = pVar3.f2684b;
                oVar.a(oVar.f2675g, o.f2668p, canvas2, iMin, iMin2);
                p pVar4 = this.f2696b;
                pVar4.f2689g = pVar4.f2685c;
                pVar4.f2690h = pVar4.f2686d;
                pVar4.i = pVar4.f2684b.getRootAlpha();
                pVar4.f2691j = pVar4.f2687e;
                pVar4.f2692k = false;
            }
        } else {
            p pVar5 = this.f2696b;
            pVar5.f2688f.eraseColor(0);
            Canvas canvas3 = new Canvas(pVar5.f2688f);
            o oVar2 = pVar5.f2684b;
            oVar2.a(oVar2.f2675g, o.f2668p, canvas3, iMin, iMin2);
        }
        p pVar6 = this.f2696b;
        if (pVar6.f2684b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (pVar6.f2693l == null) {
                Paint paint2 = new Paint();
                pVar6.f2693l = paint2;
                paint2.setFilterBitmap(true);
            }
            pVar6.f2693l.setAlpha(pVar6.f2684b.getRootAlpha());
            pVar6.f2693l.setColorFilter(colorFilter);
            paint = pVar6.f2693l;
        }
        canvas.drawBitmap(pVar6.f2688f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getAlpha() : this.f2696b.f2684b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2696b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getColorFilter() : this.f2698d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2644a != null && Build.VERSION.SDK_INT >= 24) {
            return new q(this.f2644a.getConstantState());
        }
        this.f2696b.f2683a = getChangingConfigurations();
        return this.f2696b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2696b.f2684b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2696b.f2684b.f2676h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.isAutoMirrored() : this.f2696b.f2687e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        p pVar = this.f2696b;
        if (pVar == null) {
            return false;
        }
        o oVar = pVar.f2684b;
        if (oVar.f2681n == null) {
            oVar.f2681n = Boolean.valueOf(oVar.f2675g.a());
        }
        if (oVar.f2681n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f2696b.f2685c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2699e && super.mutate() == this) {
            p pVar = this.f2696b;
            p pVar2 = new p();
            pVar2.f2685c = null;
            pVar2.f2686d = f2695j;
            if (pVar != null) {
                pVar2.f2683a = pVar.f2683a;
                o oVar = new o(pVar.f2684b);
                pVar2.f2684b = oVar;
                if (pVar.f2684b.f2673e != null) {
                    oVar.f2673e = new Paint(pVar.f2684b.f2673e);
                }
                if (pVar.f2684b.f2672d != null) {
                    pVar2.f2684b.f2672d = new Paint(pVar.f2684b.f2672d);
                }
                pVar2.f2685c = pVar.f2685c;
                pVar2.f2686d = pVar.f2686d;
                pVar2.f2687e = pVar.f2687e;
            }
            this.f2696b = pVar2;
            this.f2699e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p pVar = this.f2696b;
        ColorStateList colorStateList = pVar.f2685c;
        if (colorStateList == null || (mode = pVar.f2686d) == null) {
            z6 = false;
        } else {
            this.f2697c = b(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        o oVar = pVar.f2684b;
        if (oVar.f2681n == null) {
            oVar.f2681n = Boolean.valueOf(oVar.f2675g.a());
        }
        if (oVar.f2681n.booleanValue()) {
            boolean zB = pVar.f2684b.f2675g.b(iArr);
            pVar.f2692k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2696b.f2684b.getRootAlpha() != i) {
            this.f2696b.f2684b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f2696b.f2687e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2698d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            R2.a.G(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        p pVar = this.f2696b;
        if (pVar.f2685c != colorStateList) {
            pVar.f2685c = colorStateList;
            this.f2697c = b(colorStateList, pVar.f2686d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        p pVar = this.f2696b;
        if (pVar.f2686d != mode) {
            pVar.f2686d = mode;
            this.f2697c = b(pVar.f2685c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c6;
        int i3;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        p pVar = this.f2696b;
        pVar.f2684b = new o();
        TypedArray typedArrayG = I.b.g(resources, theme, attributeSet, a.f2616a);
        p pVar2 = this.f2696b;
        o oVar = pVar2.f2684b;
        int i6 = !I.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
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
        pVar2.f2686d = mode;
        ColorStateList colorStateListA = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 >= 28 && i8 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = I.c.f1848a;
                try {
                    colorStateListA = I.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            pVar2.f2685c = colorStateList;
        }
        boolean z6 = pVar2.f2687e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z6 = typedArrayG.getBoolean(5, z6);
        }
        pVar2.f2687e = z6;
        float f2 = oVar.f2677j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f2 = typedArrayG.getFloat(7, f2);
        }
        oVar.f2677j = f2;
        float f5 = oVar.f2678k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f5 = typedArrayG.getFloat(8, f5);
        }
        oVar.f2678k = f5;
        if (oVar.f2677j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > 0.0f) {
            oVar.f2676h = typedArrayG.getDimension(3, oVar.f2676h);
            float dimension = typedArrayG.getDimension(2, oVar.i);
            oVar.i = dimension;
            if (oVar.f2676h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = oVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                oVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    oVar.f2680m = string;
                    oVar.f2682o.put(string, oVar);
                }
                typedArrayG.recycle();
                pVar.f2683a = getChangingConfigurations();
                pVar.f2692k = true;
                p pVar3 = this.f2696b;
                o oVar2 = pVar3.f2684b;
                ArrayDeque arrayDeque = new ArrayDeque();
                l lVar = oVar2.f2675g;
                C2936e c2936e = oVar2.f2682o;
                arrayDeque.push(lVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z7 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        l lVar2 = (l) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            k kVar = new k();
                            kVar.f2646e = 0.0f;
                            kVar.f2648g = 1.0f;
                            kVar.f2649h = 1.0f;
                            kVar.i = 0.0f;
                            kVar.f2650j = 1.0f;
                            kVar.f2651k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f2652l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f2653m = join2;
                            kVar.f2654n = 4.0f;
                            TypedArray typedArrayG2 = I.b.g(resources, theme, attributeSet, a.f2618c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    kVar.f2666b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    kVar.f2665a = com.bumptech.glide.d.n(string3);
                                }
                                kVar.f2647f = I.b.b(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f6 = kVar.f2649h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f6 = typedArrayG2.getFloat(12, f6);
                                }
                                kVar.f2649h = f6;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f2652l;
                                if (i9 == 0) {
                                    cap = cap2;
                                } else if (i9 != 1) {
                                    cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f2652l = cap;
                                int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f2653m;
                                if (i10 == 0) {
                                    join = join2;
                                } else if (i10 != 1) {
                                    join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f2653m = join;
                                float f7 = kVar.f2654n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f7 = typedArrayG2.getFloat(10, f7);
                                }
                                kVar.f2654n = f7;
                                kVar.f2645d = I.b.b(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = kVar.f2648g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f8 = typedArrayG2.getFloat(11, f8);
                                }
                                kVar.f2648g = f8;
                                float f9 = kVar.f2646e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f9 = typedArrayG2.getFloat(4, f9);
                                }
                                kVar.f2646e = f9;
                                float f10 = kVar.f2650j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f10 = typedArrayG2.getFloat(6, f10);
                                }
                                kVar.f2650j = f10;
                                float f11 = kVar.f2651k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f11 = typedArrayG2.getFloat(7, f11);
                                }
                                kVar.f2651k = f11;
                                float f12 = kVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f12 = typedArrayG2.getFloat(5, f12);
                                }
                                kVar.i = f12;
                                int i11 = kVar.f2667c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i11 = typedArrayG2.getInt(13, i11);
                                }
                                kVar.f2667c = i11;
                            }
                            typedArrayG2.recycle();
                            lVar2.f2656b.add(kVar);
                            if (kVar.getPathName() != null) {
                                c2936e.put(kVar.getPathName(), kVar);
                            }
                            pVar3.f2683a = pVar3.f2683a;
                            z7 = false;
                            c6 = '\b';
                        } else {
                            c6 = '\b';
                            if ("clip-path".equals(name)) {
                                j jVar = new j();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = I.b.g(resources, theme, attributeSet, a.f2619d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        jVar.f2666b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        jVar.f2665a = com.bumptech.glide.d.n(string5);
                                    }
                                    jVar.f2667c = !I.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                lVar2.f2656b.add(jVar);
                                if (jVar.getPathName() != null) {
                                    c2936e.put(jVar.getPathName(), jVar);
                                }
                                pVar3.f2683a = pVar3.f2683a;
                            } else if ("group".equals(name)) {
                                l lVar3 = new l();
                                TypedArray typedArrayG4 = I.b.g(resources, theme, attributeSet, a.f2617b);
                                float f13 = lVar3.f2657c;
                                if (I.b.d(xmlPullParser, "rotation")) {
                                    f13 = typedArrayG4.getFloat(5, f13);
                                }
                                lVar3.f2657c = f13;
                                lVar3.f2658d = typedArrayG4.getFloat(1, lVar3.f2658d);
                                lVar3.f2659e = typedArrayG4.getFloat(2, lVar3.f2659e);
                                float f14 = lVar3.f2660f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f14 = typedArrayG4.getFloat(3, f14);
                                }
                                lVar3.f2660f = f14;
                                float f15 = lVar3.f2661g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f15 = typedArrayG4.getFloat(4, f15);
                                }
                                lVar3.f2661g = f15;
                                float f16 = lVar3.f2662h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f16 = typedArrayG4.getFloat(6, f16);
                                }
                                lVar3.f2662h = f16;
                                float f17 = lVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f17 = typedArrayG4.getFloat(7, f17);
                                }
                                lVar3.i = f17;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    lVar3.f2664k = string6;
                                }
                                lVar3.c();
                                typedArrayG4.recycle();
                                lVar2.f2656b.add(lVar3);
                                arrayDeque.push(lVar3);
                                if (lVar3.getGroupName() != null) {
                                    c2936e.put(lVar3.getGroupName(), lVar3);
                                }
                                pVar3.f2683a = pVar3.f2683a;
                            }
                        }
                        i3 = 1;
                    } else {
                        i = depth;
                        c6 = '\b';
                        i3 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i7 = i3;
                    depth = i;
                }
                if (!z7) {
                    this.f2697c = b(pVar.f2685c, pVar.f2686d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public r(p pVar) {
        this.f2700f = true;
        this.f2701g = new float[9];
        this.f2702h = new Matrix();
        this.i = new Rect();
        this.f2696b = pVar;
        this.f2697c = b(pVar.f2685c, pVar.f2686d);
    }
}
