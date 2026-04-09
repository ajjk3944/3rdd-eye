package u7;

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
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode F = PorterDuff.Mode.SRC_IN;
    public final float[] B;
    public final Matrix D;
    public final Rect E;

    /* renamed from: d, reason: collision with root package name */
    public n f23438d;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuffColorFilter f23439g;

    /* renamed from: r, reason: collision with root package name */
    public ColorFilter f23440r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23441x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23442y;

    public p() {
        this.f23442y = true;
        this.B = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        n nVar = new n();
        nVar.f23429c = null;
        nVar.f23430d = F;
        nVar.f23428b = new m();
        this.f23438d = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f23391a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.E;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f23440r;
        if (colorFilter == null) {
            colorFilter = this.f23439g;
        }
        Matrix matrix = this.D;
        canvas.getMatrix(matrix);
        float[] fArr = this.B;
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
        n nVar = this.f23438d;
        Bitmap bitmap = nVar.f23432f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f23432f.getHeight()) {
            nVar.f23432f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.k = true;
        }
        if (this.f23442y) {
            n nVar2 = this.f23438d;
            if (nVar2.k || nVar2.f23433g != nVar2.f23429c || nVar2.f23434h != nVar2.f23430d || nVar2.j != nVar2.f23431e || nVar2.f23435i != nVar2.f23428b.getRootAlpha()) {
                n nVar3 = this.f23438d;
                nVar3.f23432f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f23432f);
                m mVar = nVar3.f23428b;
                mVar.a(mVar.f23420g, m.f23413p, canvas2, iMin, iMin2);
                n nVar4 = this.f23438d;
                nVar4.f23433g = nVar4.f23429c;
                nVar4.f23434h = nVar4.f23430d;
                nVar4.f23435i = nVar4.f23428b.getRootAlpha();
                nVar4.j = nVar4.f23431e;
                nVar4.k = false;
            }
        } else {
            n nVar5 = this.f23438d;
            nVar5.f23432f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f23432f);
            m mVar2 = nVar5.f23428b;
            mVar2.a(mVar2.f23420g, m.f23413p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f23438d;
        if (nVar6.f23428b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f23436l == null) {
                Paint paint2 = new Paint();
                nVar6.f23436l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f23436l.setAlpha(nVar6.f23428b.getRootAlpha());
            nVar6.f23436l.setColorFilter(colorFilter);
            paint = nVar6.f23436l;
        }
        canvas.drawBitmap(nVar6.f23432f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.getAlpha() : this.f23438d.f23428b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23438d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.getColorFilter() : this.f23440r;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f23391a != null) {
            return new o(this.f23391a.getConstantState());
        }
        this.f23438d.f23427a = getChangingConfigurations();
        return this.f23438d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f23438d.f23428b.f23422i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f23438d.f23428b.f23421h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.isAutoMirrored() : this.f23438d.f23431e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f23438d;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f23428b;
        if (mVar.f23425n == null) {
            mVar.f23425n = Boolean.valueOf(mVar.f23420g.a());
        }
        if (mVar.f23425n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f23438d.f23429c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f23441x && super.mutate() == this) {
            n nVar = this.f23438d;
            n nVar2 = new n();
            nVar2.f23429c = null;
            nVar2.f23430d = F;
            if (nVar != null) {
                nVar2.f23427a = nVar.f23427a;
                m mVar = new m(nVar.f23428b);
                nVar2.f23428b = mVar;
                if (nVar.f23428b.f23418e != null) {
                    mVar.f23418e = new Paint(nVar.f23428b.f23418e);
                }
                if (nVar.f23428b.f23417d != null) {
                    nVar2.f23428b.f23417d = new Paint(nVar.f23428b.f23417d);
                }
                nVar2.f23429c = nVar.f23429c;
                nVar2.f23430d = nVar.f23430d;
                nVar2.f23431e = nVar.f23431e;
            }
            this.f23438d = nVar2;
            this.f23441x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f23438d;
        ColorStateList colorStateList = nVar.f23429c;
        if (colorStateList == null || (mode = nVar.f23430d) == null) {
            z10 = false;
        } else {
            this.f23439g = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        m mVar = nVar.f23428b;
        if (mVar.f23425n == null) {
            mVar.f23425n = Boolean.valueOf(mVar.f23420g.a());
        }
        if (mVar.f23425n.booleanValue()) {
            boolean zB = nVar.f23428b.f23420g.b(iArr);
            nVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f23438d.f23428b.getRootAlpha() != i10) {
            this.f23438d.f23428b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f23438d.f23431e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23440r = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            ba.m.R(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f23438d;
        if (nVar.f23429c != colorStateList) {
            nVar.f23429c = colorStateList;
            this.f23439g = a(colorStateList, nVar.f23430d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f23438d;
        if (nVar.f23430d != mode) {
            nVar.f23430d = mode;
            this.f23439g = a(nVar.f23429c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23391a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f23391a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f23438d;
        nVar.f23428b = new m();
        TypedArray typedArrayG = j3.b.g(resources, theme, attributeSet, a.f23372a);
        n nVar2 = this.f23438d;
        m mVar = nVar2.f23428b;
        int i14 = !j3.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (i14 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i14 != 5) {
            if (i14 != 9) {
                switch (i14) {
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
        nVar2.f23430d = mode;
        ColorStateList colorStateListB = j3.b.b(typedArrayG, xmlPullParser, theme);
        if (colorStateListB != null) {
            nVar2.f23429c = colorStateListB;
        }
        boolean z10 = nVar2.f23431e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayG.getBoolean(5, z10);
        }
        nVar2.f23431e = z10;
        float f10 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayG.getFloat(7, f10);
        }
        mVar.j = f10;
        float f11 = mVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayG.getFloat(8, f11);
        }
        mVar.k = f11;
        if (mVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            mVar.f23421h = typedArrayG.getDimension(3, mVar.f23421h);
            int i16 = 2;
            float dimension = typedArrayG.getDimension(2, mVar.f23422i);
            mVar.f23422i = dimension;
            if (mVar.f23421h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    mVar.f23424m = string;
                    mVar.f23426o.put(string, mVar);
                }
                typedArrayG.recycle();
                nVar.f23427a = getChangingConfigurations();
                int i17 = 1;
                nVar.k = true;
                n nVar3 = this.f23438d;
                m mVar2 = nVar3.f23428b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f23420g;
                u.e eVar = mVar2.f23426o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
                    if (eventType == i16) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.f23393e = 0.0f;
                            iVar.f23395g = 1.0f;
                            iVar.f23396h = 1.0f;
                            iVar.f23397i = 0.0f;
                            iVar.j = 1.0f;
                            iVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f23398l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f23399m = join2;
                            iVar.f23400n = 4.0f;
                            TypedArray typedArrayG2 = j3.b.g(resources, theme, attributeSet, a.f23374c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    iVar.f23411b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    iVar.f23410a = ba.m.r(string3);
                                }
                                iVar.f23394f = j3.b.c(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = iVar.f23396h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayG2.getFloat(12, f12);
                                }
                                iVar.f23396h = f12;
                                int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f23398l;
                                if (i18 == 0) {
                                    cap = cap2;
                                } else if (i18 != 1) {
                                    cap = i18 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f23398l = cap;
                                int i19 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f23399m;
                                if (i19 == 0) {
                                    join = join2;
                                } else if (i19 != 1) {
                                    join = i19 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f23399m = join;
                                float f13 = iVar.f23400n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayG2.getFloat(10, f13);
                                }
                                iVar.f23400n = f13;
                                iVar.f23392d = j3.b.c(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = iVar.f23395g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayG2.getFloat(11, f14);
                                }
                                iVar.f23395g = f14;
                                float f15 = iVar.f23393e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayG2.getFloat(4, f15);
                                }
                                iVar.f23393e = f15;
                                float f16 = iVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayG2.getFloat(6, f16);
                                }
                                iVar.j = f16;
                                float f17 = iVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayG2.getFloat(7, f17);
                                }
                                iVar.k = f17;
                                float f18 = iVar.f23397i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayG2.getFloat(5, f18);
                                }
                                iVar.f23397i = f18;
                                int i20 = iVar.f23412c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i20 = typedArrayG2.getInt(13, i20);
                                }
                                iVar.f23412c = i20;
                            }
                            typedArrayG2.recycle();
                            jVar2.f23402b.add(iVar);
                            if (iVar.getPathName() != null) {
                                eVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f23427a = nVar3.f23427a;
                            i13 = 1;
                            z11 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = j3.b.g(resources, theme, attributeSet, a.f23375d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        hVar.f23411b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        hVar.f23410a = ba.m.r(string5);
                                    }
                                    hVar.f23412c = !j3.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                jVar2.f23402b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    eVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f23427a = nVar3.f23427a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray typedArrayG4 = j3.b.g(resources, theme, attributeSet, a.f23373b);
                                float f19 = jVar3.f23403c;
                                if (j3.b.d(xmlPullParser, "rotation")) {
                                    f19 = typedArrayG4.getFloat(5, f19);
                                }
                                jVar3.f23403c = f19;
                                i13 = 1;
                                jVar3.f23404d = typedArrayG4.getFloat(1, jVar3.f23404d);
                                jVar3.f23405e = typedArrayG4.getFloat(2, jVar3.f23405e);
                                float f20 = jVar3.f23406f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayG4.getFloat(3, f20);
                                }
                                jVar3.f23406f = f20;
                                float f21 = jVar3.f23407g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayG4.getFloat(4, f21);
                                }
                                jVar3.f23407g = f21;
                                float f22 = jVar3.f23408h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayG4.getFloat(6, f22);
                                }
                                jVar3.f23408h = f22;
                                float f23 = jVar3.f23409i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayG4.getFloat(7, f23);
                                }
                                jVar3.f23409i = f23;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    jVar3.k = string6;
                                }
                                jVar3.c();
                                typedArrayG4.recycle();
                                jVar2.f23402b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    eVar.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f23427a = nVar3.f23427a;
                            }
                            i13 = 1;
                        }
                        i12 = i13;
                        i11 = 3;
                    } else {
                        i10 = depth;
                        i11 = i15;
                        i12 = 1;
                        if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i15 = i11;
                    i17 = i12;
                    depth = i10;
                    i16 = 2;
                }
                if (!z11) {
                    this.f23439g = a(nVar.f23429c, nVar.f23430d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f23442y = true;
        this.B = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        this.f23438d = nVar;
        this.f23439g = a(nVar.f23429c, nVar.f23430d);
    }
}
