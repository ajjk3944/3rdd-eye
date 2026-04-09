package k6;

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
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.z3;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends h {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public o f28031b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f28032c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f28033d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28034e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28035f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f28036h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f28037i;

    public q() {
        this.f28035f = true;
        this.g = new float[9];
        this.f28036h = new Matrix();
        this.f28037i = new Rect();
        o oVar = new o();
        oVar.f28022c = null;
        oVar.f28023d = j;
        oVar.f28021b = new n();
        this.f28031b = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f27984a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f28037i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f28033d;
        if (colorFilter == null) {
            colorFilter = this.f28032c;
        }
        Matrix matrix = this.f28036h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
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
        o oVar = this.f28031b;
        Bitmap bitmap = oVar.f28025f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f28025f.getHeight()) {
            oVar.f28025f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f28028k = true;
        }
        if (this.f28035f) {
            o oVar2 = this.f28031b;
            if (oVar2.f28028k || oVar2.g != oVar2.f28022c || oVar2.f28026h != oVar2.f28023d || oVar2.j != oVar2.f28024e || oVar2.f28027i != oVar2.f28021b.getRootAlpha()) {
                o oVar3 = this.f28031b;
                oVar3.f28025f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f28025f);
                n nVar = oVar3.f28021b;
                nVar.a(nVar.g, n.f28006p, canvas2, iMin, iMin2);
                o oVar4 = this.f28031b;
                oVar4.g = oVar4.f28022c;
                oVar4.f28026h = oVar4.f28023d;
                oVar4.f28027i = oVar4.f28021b.getRootAlpha();
                oVar4.j = oVar4.f28024e;
                oVar4.f28028k = false;
            }
        } else {
            o oVar5 = this.f28031b;
            oVar5.f28025f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f28025f);
            n nVar2 = oVar5.f28021b;
            nVar2.a(nVar2.g, n.f28006p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f28031b;
        if (oVar6.f28021b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f28029l == null) {
                Paint paint2 = new Paint();
                oVar6.f28029l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f28029l.setAlpha(oVar6.f28021b.getRootAlpha());
            oVar6.f28029l.setColorFilter(colorFilter);
            paint = oVar6.f28029l;
        }
        canvas.drawBitmap(oVar6.f28025f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getAlpha() : this.f28031b.f28021b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f28031b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getColorFilter() : this.f28033d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f27984a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f27984a.getConstantState());
        }
        this.f28031b.f28020a = getChangingConfigurations();
        return this.f28031b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f28031b.f28021b.f28014i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f28031b.f28021b.f28013h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.isAutoMirrored() : this.f28031b.f28024e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f28031b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f28021b;
        if (nVar.f28018n == null) {
            nVar.f28018n = Boolean.valueOf(nVar.g.a());
        }
        if (nVar.f28018n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f28031b.f28022c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f28034e && super.mutate() == this) {
            o oVar = this.f28031b;
            o oVar2 = new o();
            oVar2.f28022c = null;
            oVar2.f28023d = j;
            if (oVar != null) {
                oVar2.f28020a = oVar.f28020a;
                n nVar = new n(oVar.f28021b);
                oVar2.f28021b = nVar;
                if (oVar.f28021b.f28011e != null) {
                    nVar.f28011e = new Paint(oVar.f28021b.f28011e);
                }
                if (oVar.f28021b.f28010d != null) {
                    oVar2.f28021b.f28010d = new Paint(oVar.f28021b.f28010d);
                }
                oVar2.f28022c = oVar.f28022c;
                oVar2.f28023d = oVar.f28023d;
                oVar2.f28024e = oVar.f28024e;
            }
            this.f28031b = oVar2;
            this.f28034e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f28031b;
        ColorStateList colorStateList = oVar.f28022c;
        if (colorStateList == null || (mode = oVar.f28023d) == null) {
            z3 = false;
        } else {
            this.f28032c = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        n nVar = oVar.f28021b;
        if (nVar.f28018n == null) {
            nVar.f28018n = Boolean.valueOf(nVar.g.a());
        }
        if (nVar.f28018n.booleanValue()) {
            boolean zB = oVar.f28021b.g.b(iArr);
            oVar.f28028k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f28031b.f28021b.getRootAlpha() != i4) {
            this.f28031b.f28021b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f28031b.f28024e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28033d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            z3.u(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f28031b;
        if (oVar.f28022c != colorStateList) {
            oVar.f28022c = colorStateList;
            this.f28032c = a(colorStateList, oVar.f28023d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f28031b;
        if (oVar.f28023d != mode) {
            oVar.f28023d = mode;
            this.f28032c = a(oVar.f28022c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.setVisible(z3, z10) : super.setVisible(z3, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i4;
        int i10;
        int i11;
        int i12;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f28031b;
        oVar.f28021b = new n();
        TypedArray typedArrayH = u3.b.h(resources, theme, attributeSet, a.f27960a);
        o oVar2 = this.f28031b;
        n nVar = oVar2.f28021b;
        int i13 = !u3.b.e(xmlPullParser, "tintMode") ? -1 : typedArrayH.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i14 = 3;
        if (i13 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i13 != 5) {
            if (i13 != 9) {
                switch (i13) {
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
        oVar2.f28023d = mode;
        ColorStateList colorStateListB = u3.b.b(typedArrayH, xmlPullParser, theme);
        if (colorStateListB != null) {
            oVar2.f28022c = colorStateListB;
        }
        boolean z3 = oVar2.f28024e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = typedArrayH.getBoolean(5, z3);
        }
        oVar2.f28024e = z3;
        float f10 = nVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayH.getFloat(7, f10);
        }
        nVar.j = f10;
        float f11 = nVar.f28015k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayH.getFloat(8, f11);
        }
        nVar.f28015k = f11;
        if (nVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            nVar.f28013h = typedArrayH.getDimension(3, nVar.f28013h);
            int i15 = 2;
            float dimension = typedArrayH.getDimension(2, nVar.f28014i);
            nVar.f28014i = dimension;
            if (nVar.f28013h <= 0.0f) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar.f28017m = string;
                    nVar.f28019o.put(string, nVar);
                }
                typedArrayH.recycle();
                oVar.f28020a = getChangingConfigurations();
                int i16 = 1;
                oVar.f28028k = true;
                o oVar3 = this.f28031b;
                n nVar2 = oVar3.f28021b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.g;
                x.e eVar = nVar2.f28019o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i16 && (xmlPullParser.getDepth() >= depth || eventType != i14)) {
                    if (eventType == i15) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        i4 = depth;
                        if ("path".equals(name)) {
                            j jVar = new j();
                            jVar.f27986e = 0.0f;
                            jVar.g = 1.0f;
                            jVar.f27988h = 1.0f;
                            jVar.f27989i = 0.0f;
                            jVar.j = 1.0f;
                            jVar.f27990k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f27991l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.f27992m = join2;
                            jVar.f27993n = 4.0f;
                            TypedArray typedArrayH2 = u3.b.h(resources, theme, attributeSet, a.f27962c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayH2.getString(0);
                                if (string2 != null) {
                                    jVar.f28004b = string2;
                                }
                                String string3 = typedArrayH2.getString(2);
                                if (string3 != null) {
                                    jVar.f28003a = wb.e.k(string3);
                                }
                                jVar.f27987f = u3.b.c(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = jVar.f27988h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayH2.getFloat(12, f12);
                                }
                                jVar.f27988h = f12;
                                int i17 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.f27991l;
                                if (i17 == 0) {
                                    cap = cap2;
                                } else if (i17 != 1) {
                                    cap = i17 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.f27991l = cap;
                                int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH2.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.f27992m;
                                if (i18 == 0) {
                                    join = join2;
                                } else if (i18 != 1) {
                                    join = i18 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.f27992m = join;
                                float f13 = jVar.f27993n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayH2.getFloat(10, f13);
                                }
                                jVar.f27993n = f13;
                                jVar.f27985d = u3.b.c(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = jVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayH2.getFloat(11, f14);
                                }
                                jVar.g = f14;
                                float f15 = jVar.f27986e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayH2.getFloat(4, f15);
                                }
                                jVar.f27986e = f15;
                                float f16 = jVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayH2.getFloat(6, f16);
                                }
                                jVar.j = f16;
                                float f17 = jVar.f27990k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayH2.getFloat(7, f17);
                                }
                                jVar.f27990k = f17;
                                float f18 = jVar.f27989i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayH2.getFloat(5, f18);
                                }
                                jVar.f27989i = f18;
                                int i19 = jVar.f28005c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i19 = typedArrayH2.getInt(13, i19);
                                }
                                jVar.f28005c = i19;
                            }
                            typedArrayH2.recycle();
                            kVar2.f27995b.add(jVar);
                            if (jVar.getPathName() != null) {
                                eVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f28020a = oVar3.f28020a;
                            i12 = 1;
                            z10 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayH3 = u3.b.h(resources, theme, attributeSet, a.f27963d);
                                    String string4 = typedArrayH3.getString(0);
                                    if (string4 != null) {
                                        iVar.f28004b = string4;
                                    }
                                    String string5 = typedArrayH3.getString(1);
                                    if (string5 != null) {
                                        iVar.f28003a = wb.e.k(string5);
                                    }
                                    iVar.f28005c = !u3.b.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                    typedArrayH3.recycle();
                                }
                                kVar2.f27995b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    eVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f28020a = oVar3.f28020a;
                            } else if ("group".equals(name)) {
                                k kVar3 = new k();
                                TypedArray typedArrayH4 = u3.b.h(resources, theme, attributeSet, a.f27961b);
                                float f19 = kVar3.f27996c;
                                if (u3.b.e(xmlPullParser, "rotation")) {
                                    f19 = typedArrayH4.getFloat(5, f19);
                                }
                                kVar3.f27996c = f19;
                                i12 = 1;
                                kVar3.f27997d = typedArrayH4.getFloat(1, kVar3.f27997d);
                                kVar3.f27998e = typedArrayH4.getFloat(2, kVar3.f27998e);
                                float f20 = kVar3.f27999f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayH4.getFloat(3, f20);
                                }
                                kVar3.f27999f = f20;
                                float f21 = kVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayH4.getFloat(4, f21);
                                }
                                kVar3.g = f21;
                                float f22 = kVar3.f28000h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayH4.getFloat(6, f22);
                                }
                                kVar3.f28000h = f22;
                                float f23 = kVar3.f28001i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayH4.getFloat(7, f23);
                                }
                                kVar3.f28001i = f23;
                                String string6 = typedArrayH4.getString(0);
                                if (string6 != null) {
                                    kVar3.f28002k = string6;
                                }
                                kVar3.c();
                                typedArrayH4.recycle();
                                kVar2.f27995b.add(kVar3);
                                arrayDeque.push(kVar3);
                                if (kVar3.getGroupName() != null) {
                                    eVar.put(kVar3.getGroupName(), kVar3);
                                }
                                oVar3.f28020a = oVar3.f28020a;
                            }
                            i12 = 1;
                        }
                        i11 = i12;
                        i10 = 3;
                    } else {
                        i4 = depth;
                        i10 = i14;
                        i11 = 1;
                        if (eventType == i10 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i14 = i10;
                    i16 = i11;
                    depth = i4;
                    i15 = 2;
                }
                if (!z10) {
                    this.f28032c = a(oVar.f28022c, oVar.f28023d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f28035f = true;
        this.g = new float[9];
        this.f28036h = new Matrix();
        this.f28037i = new Rect();
        this.f28031b = oVar;
        this.f28032c = a(oVar.f28022c, oVar.f28023d);
    }
}
