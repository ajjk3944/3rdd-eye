package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o.C7010a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v1.k;
import w1.h;
import x1.AbstractC8416a;

/* loaded from: classes.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f32557k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private h f32558b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f32559c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f32560d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32561e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32562f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f32563g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f32564h;

    /* renamed from: i, reason: collision with root package name */
    private final Matrix f32565i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f32566j;

    private static class b extends AbstractC1134f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f32593b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f32592a = w1.h.d(string2);
            }
            this.f32594c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC1134f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32530d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f32613a;

        /* renamed from: b, reason: collision with root package name */
        g f32614b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f32615c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f32616d;

        /* renamed from: e, reason: collision with root package name */
        boolean f32617e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f32618f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f32619g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f32620h;

        /* renamed from: i, reason: collision with root package name */
        int f32621i;

        /* renamed from: j, reason: collision with root package name */
        boolean f32622j;

        /* renamed from: k, reason: collision with root package name */
        boolean f32623k;

        /* renamed from: l, reason: collision with root package name */
        Paint f32624l;

        public h(h hVar) {
            this.f32615c = null;
            this.f32616d = f.f32557k;
            if (hVar != null) {
                this.f32613a = hVar.f32613a;
                g gVar = new g(hVar.f32614b);
                this.f32614b = gVar;
                if (hVar.f32614b.f32601e != null) {
                    gVar.f32601e = new Paint(hVar.f32614b.f32601e);
                }
                if (hVar.f32614b.f32600d != null) {
                    this.f32614b.f32600d = new Paint(hVar.f32614b.f32600d);
                }
                this.f32615c = hVar.f32615c;
                this.f32616d = hVar.f32616d;
                this.f32617e = hVar.f32617e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f32618f.getWidth() && i11 == this.f32618f.getHeight();
        }

        public boolean b() {
            return !this.f32623k && this.f32619g == this.f32615c && this.f32620h == this.f32616d && this.f32622j == this.f32617e && this.f32621i == this.f32614b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f32618f == null || !a(i10, i11)) {
                this.f32618f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f32623k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f32618f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f32624l == null) {
                Paint paint = new Paint();
                this.f32624l = paint;
                paint.setFilterBitmap(true);
            }
            this.f32624l.setAlpha(this.f32614b.getRootAlpha());
            this.f32624l.setColorFilter(colorFilter);
            return this.f32624l;
        }

        public boolean f() {
            return this.f32614b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f32614b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32613a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f32614b.g(iArr);
            this.f32623k |= zG;
            return zG;
        }

        public void i() {
            this.f32619g = this.f32615c;
            this.f32620h = this.f32616d;
            this.f32621i = this.f32614b.getRootAlpha();
            this.f32622j = this.f32617e;
            this.f32623k = false;
        }

        public void j(int i10, int i11) {
            this.f32618f.eraseColor(0);
            this.f32614b.b(new Canvas(this.f32618f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f32615c = null;
            this.f32616d = f.f32557k;
            this.f32614b = new g();
        }
    }

    f() {
        this.f32562f = true;
        this.f32564h = new float[9];
        this.f32565i = new Matrix();
        this.f32566j = new Rect();
        this.f32558b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f32556a = v1.h.e(resources, i10, theme);
        fVar.f32563g = new i(fVar.f32556a.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f32558b;
        g gVar = hVar.f32614b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f32604h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32580b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f32612p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f32613a = cVar.f32595d | hVar.f32613a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32580b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f32612p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f32613a = bVar.f32595d | hVar.f32613a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32580b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f32612p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f32613a = dVar2.f32589k | hVar.f32613a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && AbstractC8416a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f32558b;
        g gVar = hVar.f32614b;
        hVar.f32616d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f32615c = colorStateListC;
        }
        hVar.f32617e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f32617e);
        gVar.f32607k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f32607k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f32608l);
        gVar.f32608l = f10;
        if (gVar.f32607k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f32605i = typedArray.getDimension(3, gVar.f32605i);
        float dimension = typedArray.getDimension(2, gVar.f32606j);
        gVar.f32606j = dimension;
        if (gVar.f32605i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f32610n = string;
            gVar.f32612p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f32558b.f32614b.f32612p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f32556a;
        if (drawable == null) {
            return false;
        }
        AbstractC8416a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f32566j);
        if (this.f32566j.width() <= 0 || this.f32566j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f32560d;
        if (colorFilter == null) {
            colorFilter = this.f32559c;
        }
        canvas.getMatrix(this.f32565i);
        this.f32565i.getValues(this.f32564h);
        float fAbs = Math.abs(this.f32564h[0]);
        float fAbs2 = Math.abs(this.f32564h[4]);
        float fAbs3 = Math.abs(this.f32564h[1]);
        float fAbs4 = Math.abs(this.f32564h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f32566j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f32566j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f32566j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f32566j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f32566j.offsetTo(0, 0);
        this.f32558b.c(iMin, iMin2);
        if (!this.f32562f) {
            this.f32558b.j(iMin, iMin2);
        } else if (!this.f32558b.b()) {
            this.f32558b.j(iMin, iMin2);
            this.f32558b.i();
        }
        this.f32558b.d(canvas, colorFilter, this.f32566j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f32562f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.d(drawable) : this.f32558b.f32614b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f32558b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.e(drawable) : this.f32560d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f32556a != null) {
            return new i(this.f32556a.getConstantState());
        }
        this.f32558b.f32613a = getChangingConfigurations();
        return this.f32558b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f32558b.f32614b.f32606j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f32558b.f32614b.f32605i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.h(drawable) : this.f32558b.f32617e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f32558b) != null && (hVar.g() || ((colorStateList = this.f32558b.f32615c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f32561e && super.mutate() == this) {
            this.f32558b = new h(this.f32558b);
            this.f32561e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f32558b;
        ColorStateList colorStateList = hVar.f32615c;
        if (colorStateList == null || (mode = hVar.f32616d) == null) {
            z10 = false;
        } else {
            this.f32559c = i(this.f32559c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f32558b.f32614b.getRootAlpha() != i10) {
            this.f32558b.f32614b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.j(drawable, z10);
        } else {
            this.f32558b.f32617e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f32558b;
        if (hVar.f32615c != colorStateList) {
            hVar.f32615c = colorStateList;
            this.f32559c = i(this.f32559c, colorStateList, hVar.f32616d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.p(drawable, mode);
            return;
        }
        h hVar = this.f32558b;
        if (hVar.f32616d != mode) {
            hVar.f32616d = mode;
            this.f32559c = i(this.f32559c, hVar.f32615c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f32625a;

        public i(Drawable.ConstantState constantState) {
            this.f32625a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f32625a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32625a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f32556a = (VectorDrawable) this.f32625a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f32556a = (VectorDrawable) this.f32625a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f32556a = (VectorDrawable) this.f32625a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32560d = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC1134f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected h.b[] f32592a;

        /* renamed from: b, reason: collision with root package name */
        String f32593b;

        /* renamed from: c, reason: collision with root package name */
        int f32594c;

        /* renamed from: d, reason: collision with root package name */
        int f32595d;

        public AbstractC1134f() {
            super();
            this.f32592a = null;
            this.f32594c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            h.b[] bVarArr = this.f32592a;
            if (bVarArr != null) {
                h.b.h(bVarArr, path);
            }
        }

        public h.b[] getPathData() {
            return this.f32592a;
        }

        public String getPathName() {
            return this.f32593b;
        }

        public void setPathData(h.b[] bVarArr) {
            if (w1.h.b(this.f32592a, bVarArr)) {
                w1.h.k(this.f32592a, bVarArr);
            } else {
                this.f32592a = w1.h.f(bVarArr);
            }
        }

        public AbstractC1134f(AbstractC1134f abstractC1134f) {
            super();
            this.f32592a = null;
            this.f32594c = 0;
            this.f32593b = abstractC1134f.f32593b;
            this.f32595d = abstractC1134f.f32595d;
            this.f32592a = w1.h.f(abstractC1134f.f32592a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f32558b;
        hVar.f32614b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32527a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f32613a = getChangingConfigurations();
        hVar.f32623k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f32559c = i(this.f32559c, hVar.f32615c, hVar.f32616d);
    }

    f(h hVar) {
        this.f32562f = true;
        this.f32564h = new float[9];
        this.f32565i = new Matrix();
        this.f32566j = new Rect();
        this.f32558b = hVar;
        this.f32559c = i(this.f32559c, hVar.f32615c, hVar.f32616d);
    }

    private static class c extends AbstractC1134f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f32567e;

        /* renamed from: f, reason: collision with root package name */
        v1.d f32568f;

        /* renamed from: g, reason: collision with root package name */
        float f32569g;

        /* renamed from: h, reason: collision with root package name */
        v1.d f32570h;

        /* renamed from: i, reason: collision with root package name */
        float f32571i;

        /* renamed from: j, reason: collision with root package name */
        float f32572j;

        /* renamed from: k, reason: collision with root package name */
        float f32573k;

        /* renamed from: l, reason: collision with root package name */
        float f32574l;

        /* renamed from: m, reason: collision with root package name */
        float f32575m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f32576n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f32577o;

        /* renamed from: p, reason: collision with root package name */
        float f32578p;

        c() {
            this.f32569g = 0.0f;
            this.f32571i = 1.0f;
            this.f32572j = 1.0f;
            this.f32573k = 0.0f;
            this.f32574l = 1.0f;
            this.f32575m = 0.0f;
            this.f32576n = Paint.Cap.BUTT;
            this.f32577o = Paint.Join.MITER;
            this.f32578p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f32567e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f32593b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f32592a = w1.h.d(string2);
                }
                this.f32570h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f32572j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f32572j);
                this.f32576n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f32576n);
                this.f32577o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f32577o);
                this.f32578p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f32578p);
                this.f32568f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f32571i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f32571i);
                this.f32569g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f32569g);
                this.f32574l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f32574l);
                this.f32575m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f32575m);
                this.f32573k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f32573k);
                this.f32594c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f32594c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f32570h.i() || this.f32568f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f32568f.j(iArr) | this.f32570h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32529c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f32572j;
        }

        int getFillColor() {
            return this.f32570h.e();
        }

        float getStrokeAlpha() {
            return this.f32571i;
        }

        int getStrokeColor() {
            return this.f32568f.e();
        }

        float getStrokeWidth() {
            return this.f32569g;
        }

        float getTrimPathEnd() {
            return this.f32574l;
        }

        float getTrimPathOffset() {
            return this.f32575m;
        }

        float getTrimPathStart() {
            return this.f32573k;
        }

        void setFillAlpha(float f10) {
            this.f32572j = f10;
        }

        void setFillColor(int i10) {
            this.f32570h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f32571i = f10;
        }

        void setStrokeColor(int i10) {
            this.f32568f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f32569g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f32574l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f32575m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f32573k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f32569g = 0.0f;
            this.f32571i = 1.0f;
            this.f32572j = 1.0f;
            this.f32573k = 0.0f;
            this.f32574l = 1.0f;
            this.f32575m = 0.0f;
            this.f32576n = Paint.Cap.BUTT;
            this.f32577o = Paint.Join.MITER;
            this.f32578p = 4.0f;
            this.f32567e = cVar.f32567e;
            this.f32568f = cVar.f32568f;
            this.f32569g = cVar.f32569g;
            this.f32571i = cVar.f32571i;
            this.f32570h = cVar.f32570h;
            this.f32594c = cVar.f32594c;
            this.f32572j = cVar.f32572j;
            this.f32573k = cVar.f32573k;
            this.f32574l = cVar.f32574l;
            this.f32575m = cVar.f32575m;
            this.f32576n = cVar.f32576n;
            this.f32577o = cVar.f32577o;
            this.f32578p = cVar.f32578p;
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f32596q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f32597a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f32598b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f32599c;

        /* renamed from: d, reason: collision with root package name */
        Paint f32600d;

        /* renamed from: e, reason: collision with root package name */
        Paint f32601e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f32602f;

        /* renamed from: g, reason: collision with root package name */
        private int f32603g;

        /* renamed from: h, reason: collision with root package name */
        final d f32604h;

        /* renamed from: i, reason: collision with root package name */
        float f32605i;

        /* renamed from: j, reason: collision with root package name */
        float f32606j;

        /* renamed from: k, reason: collision with root package name */
        float f32607k;

        /* renamed from: l, reason: collision with root package name */
        float f32608l;

        /* renamed from: m, reason: collision with root package name */
        int f32609m;

        /* renamed from: n, reason: collision with root package name */
        String f32610n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f32611o;

        /* renamed from: p, reason: collision with root package name */
        final C7010a f32612p;

        public g() {
            this.f32599c = new Matrix();
            this.f32605i = 0.0f;
            this.f32606j = 0.0f;
            this.f32607k = 0.0f;
            this.f32608l = 0.0f;
            this.f32609m = 255;
            this.f32610n = null;
            this.f32611o = null;
            this.f32612p = new C7010a();
            this.f32604h = new d();
            this.f32597a = new Path();
            this.f32598b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f32579a.set(matrix);
            dVar.f32579a.preConcat(dVar.f32588j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f32580b.size(); i12++) {
                e eVar = (e) dVar.f32580b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f32579a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC1134f) {
                    d(dVar, (AbstractC1134f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC1134f abstractC1134f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f32607k;
            float f11 = i11 / this.f32608l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f32579a;
            this.f32599c.set(matrix);
            this.f32599c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC1134f.d(this.f32597a);
            Path path = this.f32597a;
            this.f32598b.reset();
            if (abstractC1134f.c()) {
                this.f32598b.setFillType(abstractC1134f.f32594c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f32598b.addPath(path, this.f32599c);
                canvas.clipPath(this.f32598b);
                return;
            }
            c cVar = (c) abstractC1134f;
            float f12 = cVar.f32573k;
            if (f12 != 0.0f || cVar.f32574l != 1.0f) {
                float f13 = cVar.f32575m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f32574l + f13) % 1.0f;
                if (this.f32602f == null) {
                    this.f32602f = new PathMeasure();
                }
                this.f32602f.setPath(this.f32597a, false);
                float length = this.f32602f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f32602f.getSegment(f16, length, path, true);
                    this.f32602f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f32602f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f32598b.addPath(path, this.f32599c);
            if (cVar.f32570h.l()) {
                v1.d dVar2 = cVar.f32570h;
                if (this.f32601e == null) {
                    Paint paint = new Paint(1);
                    this.f32601e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f32601e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f32599c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f32572j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f32572j));
                }
                paint2.setColorFilter(colorFilter);
                this.f32598b.setFillType(cVar.f32594c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f32598b, paint2);
            }
            if (cVar.f32568f.l()) {
                v1.d dVar3 = cVar.f32568f;
                if (this.f32600d == null) {
                    Paint paint3 = new Paint(1);
                    this.f32600d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f32600d;
                Paint.Join join = cVar.f32577o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f32576n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f32578p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f32599c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f32571i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f32571i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f32569g * fMin * fE);
                canvas.drawPath(this.f32598b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f32604h, f32596q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f32611o == null) {
                this.f32611o = Boolean.valueOf(this.f32604h.a());
            }
            return this.f32611o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f32604h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f32609m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f32609m = i10;
        }

        public g(g gVar) {
            this.f32599c = new Matrix();
            this.f32605i = 0.0f;
            this.f32606j = 0.0f;
            this.f32607k = 0.0f;
            this.f32608l = 0.0f;
            this.f32609m = 255;
            this.f32610n = null;
            this.f32611o = null;
            C7010a c7010a = new C7010a();
            this.f32612p = c7010a;
            this.f32604h = new d(gVar.f32604h, c7010a);
            this.f32597a = new Path(gVar.f32597a);
            this.f32598b = new Path(gVar.f32598b);
            this.f32605i = gVar.f32605i;
            this.f32606j = gVar.f32606j;
            this.f32607k = gVar.f32607k;
            this.f32608l = gVar.f32608l;
            this.f32603g = gVar.f32603g;
            this.f32609m = gVar.f32609m;
            this.f32610n = gVar.f32610n;
            String str = gVar.f32610n;
            if (str != null) {
                c7010a.put(str, this);
            }
            this.f32611o = gVar.f32611o;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f32579a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f32580b;

        /* renamed from: c, reason: collision with root package name */
        float f32581c;

        /* renamed from: d, reason: collision with root package name */
        private float f32582d;

        /* renamed from: e, reason: collision with root package name */
        private float f32583e;

        /* renamed from: f, reason: collision with root package name */
        private float f32584f;

        /* renamed from: g, reason: collision with root package name */
        private float f32585g;

        /* renamed from: h, reason: collision with root package name */
        private float f32586h;

        /* renamed from: i, reason: collision with root package name */
        private float f32587i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f32588j;

        /* renamed from: k, reason: collision with root package name */
        int f32589k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f32590l;

        /* renamed from: m, reason: collision with root package name */
        private String f32591m;

        public d(d dVar, C7010a c7010a) {
            AbstractC1134f bVar;
            super();
            this.f32579a = new Matrix();
            this.f32580b = new ArrayList();
            this.f32581c = 0.0f;
            this.f32582d = 0.0f;
            this.f32583e = 0.0f;
            this.f32584f = 1.0f;
            this.f32585g = 1.0f;
            this.f32586h = 0.0f;
            this.f32587i = 0.0f;
            Matrix matrix = new Matrix();
            this.f32588j = matrix;
            this.f32591m = null;
            this.f32581c = dVar.f32581c;
            this.f32582d = dVar.f32582d;
            this.f32583e = dVar.f32583e;
            this.f32584f = dVar.f32584f;
            this.f32585g = dVar.f32585g;
            this.f32586h = dVar.f32586h;
            this.f32587i = dVar.f32587i;
            this.f32590l = dVar.f32590l;
            String str = dVar.f32591m;
            this.f32591m = str;
            this.f32589k = dVar.f32589k;
            if (str != null) {
                c7010a.put(str, this);
            }
            matrix.set(dVar.f32588j);
            ArrayList arrayList = dVar.f32580b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f32580b.add(new d((d) obj, c7010a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f32580b.add(bVar);
                    Object obj2 = bVar.f32593b;
                    if (obj2 != null) {
                        c7010a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f32588j.reset();
            this.f32588j.postTranslate(-this.f32582d, -this.f32583e);
            this.f32588j.postScale(this.f32584f, this.f32585g);
            this.f32588j.postRotate(this.f32581c, 0.0f, 0.0f);
            this.f32588j.postTranslate(this.f32586h + this.f32582d, this.f32587i + this.f32583e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f32590l = null;
            this.f32581c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f32581c);
            this.f32582d = typedArray.getFloat(1, this.f32582d);
            this.f32583e = typedArray.getFloat(2, this.f32583e);
            this.f32584f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f32584f);
            this.f32585g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f32585g);
            this.f32586h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f32586h);
            this.f32587i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f32587i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f32591m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f32580b.size(); i10++) {
                if (((e) this.f32580b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f32580b.size(); i10++) {
                zB |= ((e) this.f32580b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32528b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f32591m;
        }

        public Matrix getLocalMatrix() {
            return this.f32588j;
        }

        public float getPivotX() {
            return this.f32582d;
        }

        public float getPivotY() {
            return this.f32583e;
        }

        public float getRotation() {
            return this.f32581c;
        }

        public float getScaleX() {
            return this.f32584f;
        }

        public float getScaleY() {
            return this.f32585g;
        }

        public float getTranslateX() {
            return this.f32586h;
        }

        public float getTranslateY() {
            return this.f32587i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f32582d) {
                this.f32582d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f32583e) {
                this.f32583e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f32581c) {
                this.f32581c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f32584f) {
                this.f32584f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f32585g) {
                this.f32585g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f32586h) {
                this.f32586h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f32587i) {
                this.f32587i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f32579a = new Matrix();
            this.f32580b = new ArrayList();
            this.f32581c = 0.0f;
            this.f32582d = 0.0f;
            this.f32583e = 0.0f;
            this.f32584f = 1.0f;
            this.f32585g = 1.0f;
            this.f32586h = 0.0f;
            this.f32587i = 0.0f;
            this.f32588j = new Matrix();
            this.f32591m = null;
        }
    }
}
