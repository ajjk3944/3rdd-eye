package z1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import com.mbridge.msdk.MBridgeConstans;
import j0.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xbill.DNS.KEYRecord;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h extends z1.g {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f25248k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0509h f25249b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f25250c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f25251d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25252e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25253f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f25254g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f25255h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f25256i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f25257j;

    public static class b extends f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f25284b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f25283a = j0.d.d(string2);
            }
            this.f25285c = i0.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // z1.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (i0.i.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = i0.i.k(resources, theme, attributeSet, z1.a.f25219d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: z1.h$h, reason: collision with other inner class name */
    public static class C0509h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f25304a;

        /* renamed from: b, reason: collision with root package name */
        public g f25305b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f25306c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f25307d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f25308e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f25309f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f25310g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f25311h;

        /* renamed from: i, reason: collision with root package name */
        public int f25312i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f25313j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f25314k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f25315l;

        public C0509h(C0509h c0509h) {
            this.f25306c = null;
            this.f25307d = h.f25248k;
            if (c0509h != null) {
                this.f25304a = c0509h.f25304a;
                g gVar = new g(c0509h.f25305b);
                this.f25305b = gVar;
                if (c0509h.f25305b.f25292e != null) {
                    gVar.f25292e = new Paint(c0509h.f25305b.f25292e);
                }
                if (c0509h.f25305b.f25291d != null) {
                    this.f25305b.f25291d = new Paint(c0509h.f25305b.f25291d);
                }
                this.f25306c = c0509h.f25306c;
                this.f25307d = c0509h.f25307d;
                this.f25308e = c0509h.f25308e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f25309f.getWidth() && i11 == this.f25309f.getHeight();
        }

        public boolean b() {
            return !this.f25314k && this.f25310g == this.f25306c && this.f25311h == this.f25307d && this.f25313j == this.f25308e && this.f25312i == this.f25305b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f25309f == null || !a(i10, i11)) {
                this.f25309f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f25314k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f25309f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f25315l == null) {
                Paint paint = new Paint();
                this.f25315l = paint;
                paint.setFilterBitmap(true);
            }
            this.f25315l.setAlpha(this.f25305b.getRootAlpha());
            this.f25315l.setColorFilter(colorFilter);
            return this.f25315l;
        }

        public boolean f() {
            return this.f25305b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f25305b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25304a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f25305b.g(iArr);
            this.f25314k |= zG;
            return zG;
        }

        public void i() {
            this.f25310g = this.f25306c;
            this.f25311h = this.f25307d;
            this.f25312i = this.f25305b.getRootAlpha();
            this.f25313j = this.f25308e;
            this.f25314k = false;
        }

        public void j(int i10, int i11) {
            this.f25309f.eraseColor(0);
            this.f25305b.b(new Canvas(this.f25309f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0509h() {
            this.f25306c = null;
            this.f25307d = h.f25248k;
            this.f25305b = new g();
        }
    }

    public h() {
        this.f25253f = true;
        this.f25255h = new float[9];
        this.f25256i = new Matrix();
        this.f25257j = new Rect();
        this.f25249b = new C0509h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static h b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f25247a = androidx.core.content.res.a.e(resources, i10, theme);
            hVar.f25254g = new i(hVar.f25247a.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
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

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25247a;
        if (drawable == null) {
            return false;
        }
        k0.a.b(drawable);
        return false;
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f25249b.f25305b.f25303p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f25257j);
        if (this.f25257j.width() <= 0 || this.f25257j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f25251d;
        if (colorFilter == null) {
            colorFilter = this.f25250c;
        }
        canvas.getMatrix(this.f25256i);
        this.f25256i.getValues(this.f25255h);
        float fAbs = Math.abs(this.f25255h[0]);
        float fAbs2 = Math.abs(this.f25255h[4]);
        float fAbs3 = Math.abs(this.f25255h[1]);
        float fAbs4 = Math.abs(this.f25255h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(KEYRecord.Flags.FLAG4, (int) (this.f25257j.width() * fAbs));
        int iMin2 = Math.min(KEYRecord.Flags.FLAG4, (int) (this.f25257j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f25257j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f25257j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f25257j.offsetTo(0, 0);
        this.f25249b.c(iMin, iMin2);
        if (!this.f25253f) {
            this.f25249b.j(iMin, iMin2);
        } else if (!this.f25249b.b()) {
            this.f25249b.j(iMin, iMin2);
            this.f25249b.i();
        }
        this.f25249b.d(canvas, colorFilter, this.f25257j);
        canvas.restoreToCount(iSave);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0509h c0509h = this.f25249b;
        g gVar = c0509h.f25305b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f25295h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (MBridgeConstans.DYNAMIC_VIEW_WX_PATH.equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25271b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f25303p.put(cVar.getPathName(), cVar);
                    }
                    c0509h.f25304a = cVar.f25286d | c0509h.f25304a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25271b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f25303p.put(bVar.getPathName(), bVar);
                    }
                    c0509h.f25304a = bVar.f25286d | c0509h.f25304a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25271b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f25303p.put(dVar2.getGroupName(), dVar2);
                    }
                    c0509h.f25304a = dVar2.f25280k | c0509h.f25304a;
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

    public final boolean f() {
        return isAutoMirrored() && k0.a.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.d(drawable) : this.f25249b.f25305b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f25249b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.e(drawable) : this.f25251d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25247a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f25247a.getConstantState());
        }
        this.f25249b.f25304a = getChangingConfigurations();
        return this.f25249b;
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f25249b.f25305b.f25297j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f25249b.f25305b.f25296i;
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void h(boolean z10) {
        this.f25253f = z10;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0509h c0509h = this.f25249b;
        g gVar = c0509h.f25305b;
        c0509h.f25307d = g(i0.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = i0.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0509h.f25306c = colorStateListC;
        }
        c0509h.f25308e = i0.i.a(typedArray, xmlPullParser, "autoMirrored", 5, c0509h.f25308e);
        gVar.f25298k = i0.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f25298k);
        float f10 = i0.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f25299l);
        gVar.f25299l = f10;
        if (gVar.f25298k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f25296i = typedArray.getDimension(3, gVar.f25296i);
        float dimension = typedArray.getDimension(2, gVar.f25297j);
        gVar.f25297j = dimension;
        if (gVar.f25296i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(i0.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f25301n = string;
            gVar.f25303p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.h(drawable) : this.f25249b.f25308e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0509h c0509h = this.f25249b;
        if (c0509h == null) {
            return false;
        }
        if (c0509h.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f25249b.f25306c;
        return colorStateList != null && colorStateList.isStateful();
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f25252e && super.mutate() == this) {
            this.f25249b = new C0509h(this.f25249b);
            this.f25252e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0509h c0509h = this.f25249b;
        ColorStateList colorStateList = c0509h.f25306c;
        if (colorStateList == null || (mode = c0509h.f25307d) == null) {
            z10 = false;
        } else {
            this.f25250c = j(this.f25250c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!c0509h.g() || !c0509h.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f25249b.f25305b.getRootAlpha() != i10) {
            this.f25249b.f25305b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.j(drawable, z10);
        } else {
            this.f25249b.f25308e = z10;
        }
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.o(drawable, colorStateList);
            return;
        }
        C0509h c0509h = this.f25249b;
        if (c0509h.f25306c != colorStateList) {
            c0509h.f25306c = colorStateList;
            this.f25250c = j(this.f25250c, colorStateList, c0509h.f25307d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.p(drawable, mode);
            return;
        }
        C0509h c0509h = this.f25249b;
        if (c0509h.f25307d != mode) {
            c0509h.f25307d = mode;
            this.f25250c = j(this.f25250c, c0509h.f25306c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f25316a;

        public i(Drawable.ConstantState constantState) {
            this.f25316a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f25316a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25316a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f25247a = (VectorDrawable) this.f25316a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f25247a = (VectorDrawable) this.f25316a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f25247a = (VectorDrawable) this.f25316a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f25251d = colorFilter;
            invalidateSelf();
        }
    }

    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public d.b[] f25283a;

        /* renamed from: b, reason: collision with root package name */
        public String f25284b;

        /* renamed from: c, reason: collision with root package name */
        public int f25285c;

        /* renamed from: d, reason: collision with root package name */
        public int f25286d;

        public f() {
            super();
            this.f25283a = null;
            this.f25285c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f25283a;
            if (bVarArr != null) {
                d.b.i(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f25283a;
        }

        public String getPathName() {
            return this.f25284b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (j0.d.b(this.f25283a, bVarArr)) {
                j0.d.k(this.f25283a, bVarArr);
            } else {
                this.f25283a = j0.d.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f25283a = null;
            this.f25285c = 0;
            this.f25284b = fVar.f25284b;
            this.f25286d = fVar.f25286d;
            this.f25283a = j0.d.f(fVar.f25283a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0509h c0509h = this.f25249b;
        c0509h.f25305b = new g();
        TypedArray typedArrayK = i0.i.k(resources, theme, attributeSet, z1.a.f25216a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        c0509h.f25304a = getChangingConfigurations();
        c0509h.f25314k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f25250c = j(this.f25250c, c0509h.f25306c, c0509h.f25307d);
    }

    public h(C0509h c0509h) {
        this.f25253f = true;
        this.f25255h = new float[9];
        this.f25256i = new Matrix();
        this.f25257j = new Rect();
        this.f25249b = c0509h;
        this.f25250c = j(this.f25250c, c0509h.f25306c, c0509h.f25307d);
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public int[] f25258e;

        /* renamed from: f, reason: collision with root package name */
        public i0.d f25259f;

        /* renamed from: g, reason: collision with root package name */
        public float f25260g;

        /* renamed from: h, reason: collision with root package name */
        public i0.d f25261h;

        /* renamed from: i, reason: collision with root package name */
        public float f25262i;

        /* renamed from: j, reason: collision with root package name */
        public float f25263j;

        /* renamed from: k, reason: collision with root package name */
        public float f25264k;

        /* renamed from: l, reason: collision with root package name */
        public float f25265l;

        /* renamed from: m, reason: collision with root package name */
        public float f25266m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Cap f25267n;

        /* renamed from: o, reason: collision with root package name */
        public Paint.Join f25268o;

        /* renamed from: p, reason: collision with root package name */
        public float f25269p;

        public c() {
            this.f25260g = 0.0f;
            this.f25262i = 1.0f;
            this.f25263j = 1.0f;
            this.f25264k = 0.0f;
            this.f25265l = 1.0f;
            this.f25266m = 0.0f;
            this.f25267n = Paint.Cap.BUTT;
            this.f25268o = Paint.Join.MITER;
            this.f25269p = 4.0f;
        }

        @Override // z1.h.e
        public boolean a() {
            return this.f25261h.i() || this.f25259f.i();
        }

        @Override // z1.h.e
        public boolean b(int[] iArr) {
            return this.f25259f.j(iArr) | this.f25261h.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = i0.i.k(resources, theme, attributeSet, z1.a.f25218c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        public float getFillAlpha() {
            return this.f25263j;
        }

        @ColorInt
        public int getFillColor() {
            return this.f25261h.e();
        }

        public float getStrokeAlpha() {
            return this.f25262i;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f25259f.e();
        }

        public float getStrokeWidth() {
            return this.f25260g;
        }

        public float getTrimPathEnd() {
            return this.f25265l;
        }

        public float getTrimPathOffset() {
            return this.f25266m;
        }

        public float getTrimPathStart() {
            return this.f25264k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f25258e = null;
            if (i0.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f25284b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f25283a = j0.d.d(string2);
                }
                this.f25261h = i0.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f25263j = i0.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f25263j);
                this.f25267n = e(i0.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f25267n);
                this.f25268o = f(i0.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f25268o);
                this.f25269p = i0.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f25269p);
                this.f25259f = i0.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f25262i = i0.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f25262i);
                this.f25260g = i0.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f25260g);
                this.f25265l = i0.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f25265l);
                this.f25266m = i0.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f25266m);
                this.f25264k = i0.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f25264k);
                this.f25285c = i0.i.g(typedArray, xmlPullParser, "fillType", 13, this.f25285c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f25263j = f10;
        }

        public void setFillColor(int i10) {
            this.f25261h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f25262i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f25259f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f25260g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f25265l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f25266m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f25264k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f25260g = 0.0f;
            this.f25262i = 1.0f;
            this.f25263j = 1.0f;
            this.f25264k = 0.0f;
            this.f25265l = 1.0f;
            this.f25266m = 0.0f;
            this.f25267n = Paint.Cap.BUTT;
            this.f25268o = Paint.Join.MITER;
            this.f25269p = 4.0f;
            this.f25258e = cVar.f25258e;
            this.f25259f = cVar.f25259f;
            this.f25260g = cVar.f25260g;
            this.f25262i = cVar.f25262i;
            this.f25261h = cVar.f25261h;
            this.f25285c = cVar.f25285c;
            this.f25263j = cVar.f25263j;
            this.f25264k = cVar.f25264k;
            this.f25265l = cVar.f25265l;
            this.f25266m = cVar.f25266m;
            this.f25267n = cVar.f25267n;
            this.f25268o = cVar.f25268o;
            this.f25269p = cVar.f25269p;
        }
    }

    public static class g {

        /* renamed from: q, reason: collision with root package name */
        public static final Matrix f25287q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f25288a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f25289b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f25290c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f25291d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f25292e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f25293f;

        /* renamed from: g, reason: collision with root package name */
        public int f25294g;

        /* renamed from: h, reason: collision with root package name */
        public final d f25295h;

        /* renamed from: i, reason: collision with root package name */
        public float f25296i;

        /* renamed from: j, reason: collision with root package name */
        public float f25297j;

        /* renamed from: k, reason: collision with root package name */
        public float f25298k;

        /* renamed from: l, reason: collision with root package name */
        public float f25299l;

        /* renamed from: m, reason: collision with root package name */
        public int f25300m;

        /* renamed from: n, reason: collision with root package name */
        public String f25301n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f25302o;

        /* renamed from: p, reason: collision with root package name */
        public final r.a f25303p;

        public g() {
            this.f25290c = new Matrix();
            this.f25296i = 0.0f;
            this.f25297j = 0.0f;
            this.f25298k = 0.0f;
            this.f25299l = 0.0f;
            this.f25300m = 255;
            this.f25301n = null;
            this.f25302o = null;
            this.f25303p = new r.a();
            this.f25295h = new d();
            this.f25288a = new Path();
            this.f25289b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f25295h, f25287q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f25270a.set(matrix);
            dVar2.f25270a.preConcat(dVar2.f25279j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f25271b.size()) {
                e eVar = (e) dVar2.f25271b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f25270a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f25298k;
            float f11 = i11 / this.f25299l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f25270a;
            this.f25290c.set(matrix);
            this.f25290c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f25288a);
            Path path = this.f25288a;
            this.f25289b.reset();
            if (fVar.c()) {
                this.f25289b.setFillType(fVar.f25285c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f25289b.addPath(path, this.f25290c);
                canvas.clipPath(this.f25289b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f25264k;
            if (f12 != 0.0f || cVar.f25265l != 1.0f) {
                float f13 = cVar.f25266m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f25265l + f13) % 1.0f;
                if (this.f25293f == null) {
                    this.f25293f = new PathMeasure();
                }
                this.f25293f.setPath(this.f25288a, false);
                float length = this.f25293f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f25293f.getSegment(f16, length, path, true);
                    this.f25293f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f25293f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f25289b.addPath(path, this.f25290c);
            if (cVar.f25261h.l()) {
                i0.d dVar2 = cVar.f25261h;
                if (this.f25292e == null) {
                    Paint paint = new Paint(1);
                    this.f25292e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f25292e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f25290c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f25263j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f25263j));
                }
                paint2.setColorFilter(colorFilter);
                this.f25289b.setFillType(cVar.f25285c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f25289b, paint2);
            }
            if (cVar.f25259f.l()) {
                i0.d dVar3 = cVar.f25259f;
                if (this.f25291d == null) {
                    Paint paint3 = new Paint(1);
                    this.f25291d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f25291d;
                Paint.Join join = cVar.f25268o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f25267n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f25269p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f25290c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f25262i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f25262i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f25260g * fMin * fE);
                canvas.drawPath(this.f25289b, paint4);
            }
        }

        public final float e(Matrix matrix) {
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

        public boolean f() {
            if (this.f25302o == null) {
                this.f25302o = Boolean.valueOf(this.f25295h.a());
            }
            return this.f25302o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f25295h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f25300m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f25300m = i10;
        }

        public g(g gVar) {
            this.f25290c = new Matrix();
            this.f25296i = 0.0f;
            this.f25297j = 0.0f;
            this.f25298k = 0.0f;
            this.f25299l = 0.0f;
            this.f25300m = 255;
            this.f25301n = null;
            this.f25302o = null;
            r.a aVar = new r.a();
            this.f25303p = aVar;
            this.f25295h = new d(gVar.f25295h, aVar);
            this.f25288a = new Path(gVar.f25288a);
            this.f25289b = new Path(gVar.f25289b);
            this.f25296i = gVar.f25296i;
            this.f25297j = gVar.f25297j;
            this.f25298k = gVar.f25298k;
            this.f25299l = gVar.f25299l;
            this.f25294g = gVar.f25294g;
            this.f25300m = gVar.f25300m;
            this.f25301n = gVar.f25301n;
            String str = gVar.f25301n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f25302o = gVar.f25302o;
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f25270a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f25271b;

        /* renamed from: c, reason: collision with root package name */
        public float f25272c;

        /* renamed from: d, reason: collision with root package name */
        public float f25273d;

        /* renamed from: e, reason: collision with root package name */
        public float f25274e;

        /* renamed from: f, reason: collision with root package name */
        public float f25275f;

        /* renamed from: g, reason: collision with root package name */
        public float f25276g;

        /* renamed from: h, reason: collision with root package name */
        public float f25277h;

        /* renamed from: i, reason: collision with root package name */
        public float f25278i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f25279j;

        /* renamed from: k, reason: collision with root package name */
        public int f25280k;

        /* renamed from: l, reason: collision with root package name */
        public int[] f25281l;

        /* renamed from: m, reason: collision with root package name */
        public String f25282m;

        public d(d dVar, r.a aVar) {
            f bVar;
            super();
            this.f25270a = new Matrix();
            this.f25271b = new ArrayList();
            this.f25272c = 0.0f;
            this.f25273d = 0.0f;
            this.f25274e = 0.0f;
            this.f25275f = 1.0f;
            this.f25276g = 1.0f;
            this.f25277h = 0.0f;
            this.f25278i = 0.0f;
            Matrix matrix = new Matrix();
            this.f25279j = matrix;
            this.f25282m = null;
            this.f25272c = dVar.f25272c;
            this.f25273d = dVar.f25273d;
            this.f25274e = dVar.f25274e;
            this.f25275f = dVar.f25275f;
            this.f25276g = dVar.f25276g;
            this.f25277h = dVar.f25277h;
            this.f25278i = dVar.f25278i;
            this.f25281l = dVar.f25281l;
            String str = dVar.f25282m;
            this.f25282m = str;
            this.f25280k = dVar.f25280k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f25279j);
            ArrayList arrayList = dVar.f25271b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f25271b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f25271b.add(bVar);
                    Object obj2 = bVar.f25284b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        @Override // z1.h.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f25271b.size(); i10++) {
                if (((e) this.f25271b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // z1.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f25271b.size(); i10++) {
                zB |= ((e) this.f25271b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = i0.i.k(resources, theme, attributeSet, z1.a.f25217b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public final void d() {
            this.f25279j.reset();
            this.f25279j.postTranslate(-this.f25273d, -this.f25274e);
            this.f25279j.postScale(this.f25275f, this.f25276g);
            this.f25279j.postRotate(this.f25272c, 0.0f, 0.0f);
            this.f25279j.postTranslate(this.f25277h + this.f25273d, this.f25278i + this.f25274e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f25281l = null;
            this.f25272c = i0.i.f(typedArray, xmlPullParser, "rotation", 5, this.f25272c);
            this.f25273d = typedArray.getFloat(1, this.f25273d);
            this.f25274e = typedArray.getFloat(2, this.f25274e);
            this.f25275f = i0.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f25275f);
            this.f25276g = i0.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f25276g);
            this.f25277h = i0.i.f(typedArray, xmlPullParser, "translateX", 6, this.f25277h);
            this.f25278i = i0.i.f(typedArray, xmlPullParser, "translateY", 7, this.f25278i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f25282m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f25282m;
        }

        public Matrix getLocalMatrix() {
            return this.f25279j;
        }

        public float getPivotX() {
            return this.f25273d;
        }

        public float getPivotY() {
            return this.f25274e;
        }

        public float getRotation() {
            return this.f25272c;
        }

        public float getScaleX() {
            return this.f25275f;
        }

        public float getScaleY() {
            return this.f25276g;
        }

        public float getTranslateX() {
            return this.f25277h;
        }

        public float getTranslateY() {
            return this.f25278i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f25273d) {
                this.f25273d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f25274e) {
                this.f25274e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f25272c) {
                this.f25272c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f25275f) {
                this.f25275f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f25276g) {
                this.f25276g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f25277h) {
                this.f25277h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f25278i) {
                this.f25278i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f25270a = new Matrix();
            this.f25271b = new ArrayList();
            this.f25272c = 0.0f;
            this.f25273d = 0.0f;
            this.f25274e = 0.0f;
            this.f25275f = 1.0f;
            this.f25276g = 1.0f;
            this.f25277h = 0.0f;
            this.f25278i = 0.0f;
            this.f25279j = new Matrix();
            this.f25282m = null;
        }
    }
}
