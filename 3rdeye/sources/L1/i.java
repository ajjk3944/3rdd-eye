package L1;

import C0.g;
import D0.a;
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
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import m0.C5308a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class i extends L1.h {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3969k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public g f3970c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f3971d;

    /* renamed from: e, reason: collision with root package name */
    public ColorFilter f3972e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3973f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3974g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3975h;
    public final Matrix i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3976j;

    /* compiled from: VectorDrawableCompat.java */
    public static class a extends e {
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public B0.d f3977d;

        /* renamed from: f, reason: collision with root package name */
        public B0.d f3979f;

        /* renamed from: e, reason: collision with root package name */
        public float f3978e = 0.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f3980g = 1.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f3981h = 1.0f;
        public float i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f3982j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f3983k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public Paint.Cap f3984l = Paint.Cap.BUTT;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Join f3985m = Paint.Join.MITER;

        /* renamed from: n, reason: collision with root package name */
        public float f3986n = 4.0f;

        @Override // L1.i.d
        public final boolean a() {
            return this.f3979f.b() || this.f3977d.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // L1.i.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                B0.d r0 = r6.f3979f
                boolean r1 = r0.b()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f343b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f344c
                if (r1 == r4) goto L1c
                r0.f344c = r1
                r0 = r3
                goto L1d
            L1c:
                r0 = r2
            L1d:
                B0.d r1 = r6.f3977d
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f343b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f344c
                if (r7 == r4) goto L36
                r1.f344c = r7
                r2 = r3
            L36:
                r7 = r0 | r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: L1.i.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f3981h;
        }

        public int getFillColor() {
            return this.f3979f.f344c;
        }

        public float getStrokeAlpha() {
            return this.f3980g;
        }

        public int getStrokeColor() {
            return this.f3977d.f344c;
        }

        public float getStrokeWidth() {
            return this.f3978e;
        }

        public float getTrimPathEnd() {
            return this.f3982j;
        }

        public float getTrimPathOffset() {
            return this.f3983k;
        }

        public float getTrimPathStart() {
            return this.i;
        }

        public void setFillAlpha(float f10) {
            this.f3981h = f10;
        }

        public void setFillColor(int i) {
            this.f3979f.f344c = i;
        }

        public void setStrokeAlpha(float f10) {
            this.f3980g = f10;
        }

        public void setStrokeColor(int i) {
            this.f3977d.f344c = i;
        }

        public void setStrokeWidth(float f10) {
            this.f3978e = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f3982j = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f3983k = f10;
        }

        public void setTrimPathStart(float f10) {
            this.i = f10;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f4015a;

        /* renamed from: b, reason: collision with root package name */
        public f f4016b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f4017c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f4018d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4019e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f4020f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f4021g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f4022h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4023j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f4024k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f4025l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4015a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    public i() {
        this.f3974g = true;
        this.f3975h = new float[9];
        this.i = new Matrix();
        this.f3976j = new Rect();
        g gVar = new g();
        gVar.f4017c = null;
        gVar.f4018d = f3969k;
        gVar.f4016b = new f();
        this.f3970c = gVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3968b;
        if (drawable == null) {
            return false;
        }
        a.C0009a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f3976j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3972e;
        if (colorFilter == null) {
            colorFilter = this.f3971d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3975h;
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
        if (isAutoMirrored() && a.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f3970c;
        Bitmap bitmap = gVar.f4020f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gVar.f4020f.getHeight()) {
            gVar.f4020f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gVar.f4024k = true;
        }
        if (this.f3974g) {
            g gVar2 = this.f3970c;
            if (gVar2.f4024k || gVar2.f4021g != gVar2.f4017c || gVar2.f4022h != gVar2.f4018d || gVar2.f4023j != gVar2.f4019e || gVar2.i != gVar2.f4016b.getRootAlpha()) {
                g gVar3 = this.f3970c;
                gVar3.f4020f.eraseColor(0);
                Canvas canvas2 = new Canvas(gVar3.f4020f);
                f fVar = gVar3.f4016b;
                fVar.a(fVar.f4007g, f.f4000p, canvas2, iMin, iMin2);
                g gVar4 = this.f3970c;
                gVar4.f4021g = gVar4.f4017c;
                gVar4.f4022h = gVar4.f4018d;
                gVar4.i = gVar4.f4016b.getRootAlpha();
                gVar4.f4023j = gVar4.f4019e;
                gVar4.f4024k = false;
            }
        } else {
            g gVar5 = this.f3970c;
            gVar5.f4020f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar5.f4020f);
            f fVar2 = gVar5.f4016b;
            fVar2.a(fVar2.f4007g, f.f4000p, canvas3, iMin, iMin2);
        }
        g gVar6 = this.f3970c;
        if (gVar6.f4016b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar6.f4025l == null) {
                Paint paint2 = new Paint();
                gVar6.f4025l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f4025l.setAlpha(gVar6.f4016b.getRootAlpha());
            gVar6.f4025l.setColorFilter(colorFilter);
            paint = gVar6.f4025l;
        }
        canvas.drawBitmap(gVar6.f4020f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getAlpha() : this.f3970c.f4016b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3970c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3968b;
        return drawable != null ? a.C0009a.c(drawable) : this.f3972e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3968b != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f3968b.getConstantState());
        }
        this.f3970c.f4015a = getChangingConfigurations();
        return this.f3970c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3970c.f4016b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3970c.f4016b.f4008h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.isAutoMirrored() : this.f3970c.f4019e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.f3970c;
        if (gVar == null) {
            return false;
        }
        f fVar = gVar.f4016b;
        if (fVar.f4013n == null) {
            fVar.f4013n = Boolean.valueOf(fVar.f4007g.a());
        }
        if (fVar.f4013n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f3970c.f4017c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3973f && super.mutate() == this) {
            g gVar = this.f3970c;
            g gVar2 = new g();
            gVar2.f4017c = null;
            gVar2.f4018d = f3969k;
            if (gVar != null) {
                gVar2.f4015a = gVar.f4015a;
                f fVar = new f(gVar.f4016b);
                gVar2.f4016b = fVar;
                if (gVar.f4016b.f4005e != null) {
                    fVar.f4005e = new Paint(gVar.f4016b.f4005e);
                }
                if (gVar.f4016b.f4004d != null) {
                    gVar2.f4016b.f4004d = new Paint(gVar.f4016b.f4004d);
                }
                gVar2.f4017c = gVar.f4017c;
                gVar2.f4018d = gVar.f4018d;
                gVar2.f4019e = gVar.f4019e;
            }
            this.f3970c = gVar2;
            this.f3973f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f3970c;
        ColorStateList colorStateList = gVar.f4017c;
        if (colorStateList == null || (mode = gVar.f4018d) == null) {
            z10 = false;
        } else {
            this.f3971d = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = gVar.f4016b;
        if (fVar.f4013n == null) {
            fVar.f4013n = Boolean.valueOf(fVar.f4007g.a());
        }
        if (fVar.f4013n.booleanValue()) {
            boolean zB = gVar.f4016b.f4007g.b(iArr);
            gVar.f4024k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3970c.f4016b.getRootAlpha() != i) {
            this.f3970c.f4016b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f3970c.f4019e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3972e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            D0.a.a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            a.C0009a.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f3970c;
        if (gVar.f4017c != colorStateList) {
            gVar.f4017c = colorStateList;
            this.f3971d = a(colorStateList, gVar.f4018d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            a.C0009a.i(drawable, mode);
            return;
        }
        g gVar = this.f3970c;
        if (gVar.f4018d != mode) {
            gVar.f4018d = mode;
            this.f3971d = a(gVar.f4017c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f4026a;

        public h(Drawable.ConstantState constantState) {
            this.f4026a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f4026a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4026a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f3968b = (VectorDrawable) this.f4026a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f3968b = (VectorDrawable) this.f4026a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f3968b = (VectorDrawable) this.f4026a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public g.a[] f3997a;

        /* renamed from: b, reason: collision with root package name */
        public String f3998b;

        /* renamed from: c, reason: collision with root package name */
        public int f3999c;

        public e() {
            this.f3997a = null;
            this.f3999c = 0;
        }

        public g.a[] getPathData() {
            return this.f3997a;
        }

        public String getPathName() {
            return this.f3998b;
        }

        public void setPathData(g.a[] aVarArr) {
            if (!C0.g.a(this.f3997a, aVarArr)) {
                this.f3997a = C0.g.e(aVarArr);
                return;
            }
            g.a[] aVarArr2 = this.f3997a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f806a = aVarArr[i].f806a;
                int i10 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].f807b;
                    if (i10 < fArr.length) {
                        aVarArr2[i].f807b[i10] = fArr[i10];
                        i10++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f3997a = null;
            this.f3999c = 0;
            this.f3998b = eVar.f3998b;
            this.f3997a = C0.g.e(eVar.f3997a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar;
        int i;
        int i10;
        char c10;
        boolean z10;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            a.C0009a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f3970c;
        gVar.f4016b = new f();
        TypedArray typedArrayE = B0.i.e(resources, theme, attributeSet, L1.a.f3940a);
        g gVar2 = this.f3970c;
        f fVar2 = gVar2.f4016b;
        int i12 = !B0.i.d(xmlPullParser, "tintMode") ? -1 : typedArrayE.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i12 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i12 != 5) {
            if (i12 != 9) {
                switch (i12) {
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
        gVar2.f4018d = mode;
        boolean z11 = false;
        int i13 = 1;
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayE.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i14 >= 28 && i14 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayE.getResources();
                int resourceId = typedArrayE.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = B0.c.f341a;
                try {
                    colorStateListA = B0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            gVar2.f4017c = colorStateList;
        }
        boolean z12 = gVar2.f4019e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z12 = typedArrayE.getBoolean(5, z12);
        }
        gVar2.f4019e = z12;
        float f10 = fVar2.f4009j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayE.getFloat(7, f10);
        }
        fVar2.f4009j = f10;
        float f11 = fVar2.f4010k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayE.getFloat(8, f11);
        }
        fVar2.f4010k = f11;
        if (fVar2.f4009j <= 0.0f) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            fVar2.f4008h = typedArrayE.getDimension(3, fVar2.f4008h);
            float dimension = typedArrayE.getDimension(2, fVar2.i);
            fVar2.i = dimension;
            if (fVar2.f4008h <= 0.0f) {
                throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayE.getFloat(4, alpha);
                }
                fVar2.setAlpha(alpha);
                String string = typedArrayE.getString(0);
                if (string != null) {
                    fVar2.f4012m = string;
                    fVar2.f4014o.put(string, fVar2);
                }
                typedArrayE.recycle();
                gVar.f4015a = getChangingConfigurations();
                gVar.f4024k = true;
                g gVar3 = this.f3970c;
                f fVar3 = gVar3.f4016b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(fVar3.f4007g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C5308a<String, Object> c5308a = fVar3.f4014o;
                        fVar = fVar3;
                        i = depth;
                        if (zEquals) {
                            b bVar = new b();
                            TypedArray typedArrayE2 = B0.i.e(resources, theme, attributeSet, L1.a.f3942c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayE2.getString(0);
                                if (string2 != null) {
                                    bVar.f3998b = string2;
                                }
                                String string3 = typedArrayE2.getString(2);
                                if (string3 != null) {
                                    bVar.f3997a = C0.g.c(string3);
                                }
                                bVar.f3979f = B0.i.b(typedArrayE2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = bVar.f3981h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayE2.getFloat(12, f12);
                                }
                                bVar.f3981h = f12;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayE2.getInt(8, -1) : -1;
                                Paint.Cap cap2 = bVar.f3984l;
                                if (i15 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap2 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                bVar.f3984l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayE2.getInt(9, -1) : -1;
                                Paint.Join join2 = bVar.f3985m;
                                if (i16 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join2 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                bVar.f3985m = join;
                                float f13 = bVar.f3986n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayE2.getFloat(10, f13);
                                }
                                bVar.f3986n = f13;
                                bVar.f3977d = B0.i.b(typedArrayE2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = bVar.f3980g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayE2.getFloat(11, f14);
                                }
                                bVar.f3980g = f14;
                                float f15 = bVar.f3978e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayE2.getFloat(4, f15);
                                }
                                bVar.f3978e = f15;
                                float f16 = bVar.f3982j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayE2.getFloat(6, f16);
                                }
                                bVar.f3982j = f16;
                                float f17 = bVar.f3983k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayE2.getFloat(7, f17);
                                }
                                bVar.f3983k = f17;
                                float f18 = bVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayE2.getFloat(5, f18);
                                }
                                bVar.i = f18;
                                int i17 = bVar.f3999c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = typedArrayE2.getInt(13, i17);
                                }
                                bVar.f3999c = i17;
                            }
                            typedArrayE2.recycle();
                            cVar.f3988b.add(bVar);
                            if (bVar.getPathName() != null) {
                                c5308a.put(bVar.getPathName(), bVar);
                            }
                            gVar3.f4015a = gVar3.f4015a;
                            z10 = false;
                            i11 = 1;
                            z13 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                a aVar = new a();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayE3 = B0.i.e(resources, theme, attributeSet, L1.a.f3943d);
                                    String string4 = typedArrayE3.getString(0);
                                    if (string4 != null) {
                                        aVar.f3998b = string4;
                                    }
                                    String string5 = typedArrayE3.getString(1);
                                    if (string5 != null) {
                                        aVar.f3997a = C0.g.c(string5);
                                    }
                                    aVar.f3999c = !B0.i.d(xmlPullParser, "fillType") ? 0 : typedArrayE3.getInt(2, 0);
                                    typedArrayE3.recycle();
                                }
                                cVar.f3988b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    c5308a.put(aVar.getPathName(), aVar);
                                }
                                gVar3.f4015a = gVar3.f4015a;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray typedArrayE4 = B0.i.e(resources, theme, attributeSet, L1.a.f3941b);
                                float f19 = cVar2.f3989c;
                                if (B0.i.d(xmlPullParser, "rotation")) {
                                    f19 = typedArrayE4.getFloat(5, f19);
                                }
                                cVar2.f3989c = f19;
                                i11 = 1;
                                cVar2.f3990d = typedArrayE4.getFloat(1, cVar2.f3990d);
                                cVar2.f3991e = typedArrayE4.getFloat(2, cVar2.f3991e);
                                float f20 = cVar2.f3992f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayE4.getFloat(3, f20);
                                }
                                cVar2.f3992f = f20;
                                float f21 = cVar2.f3993g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayE4.getFloat(4, f21);
                                }
                                cVar2.f3993g = f21;
                                float f22 = cVar2.f3994h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayE4.getFloat(6, f22);
                                }
                                cVar2.f3994h = f22;
                                float f23 = cVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayE4.getFloat(7, f23);
                                }
                                cVar2.i = f23;
                                z10 = false;
                                String string6 = typedArrayE4.getString(0);
                                if (string6 != null) {
                                    cVar2.f3996k = string6;
                                }
                                cVar2.c();
                                typedArrayE4.recycle();
                                cVar.f3988b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    c5308a.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar3.f4015a = gVar3.f4015a;
                            }
                            z10 = false;
                            i11 = 1;
                        }
                        i10 = i11;
                    } else {
                        fVar = fVar3;
                        i = depth;
                        i10 = i13;
                        c10 = '\b';
                        z10 = z11;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z11 = z10;
                    i13 = i10;
                    fVar3 = fVar;
                    depth = i;
                }
                if (!z13) {
                    this.f3971d = a(gVar.f4017c, gVar.f4018d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f3987a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f3988b;

        /* renamed from: c, reason: collision with root package name */
        public float f3989c;

        /* renamed from: d, reason: collision with root package name */
        public float f3990d;

        /* renamed from: e, reason: collision with root package name */
        public float f3991e;

        /* renamed from: f, reason: collision with root package name */
        public float f3992f;

        /* renamed from: g, reason: collision with root package name */
        public float f3993g;

        /* renamed from: h, reason: collision with root package name */
        public float f3994h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f3995j;

        /* renamed from: k, reason: collision with root package name */
        public String f3996k;

        public c() {
            this.f3987a = new Matrix();
            this.f3988b = new ArrayList<>();
            this.f3989c = 0.0f;
            this.f3990d = 0.0f;
            this.f3991e = 0.0f;
            this.f3992f = 1.0f;
            this.f3993g = 1.0f;
            this.f3994h = 0.0f;
            this.i = 0.0f;
            this.f3995j = new Matrix();
            this.f3996k = null;
        }

        @Override // L1.i.d
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.f3988b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // L1.i.d
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean zB = false;
            while (true) {
                ArrayList<d> arrayList = this.f3988b;
                if (i >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i).b(iArr);
                i++;
            }
        }

        public final void c() {
            Matrix matrix = this.f3995j;
            matrix.reset();
            matrix.postTranslate(-this.f3990d, -this.f3991e);
            matrix.postScale(this.f3992f, this.f3993g);
            matrix.postRotate(this.f3989c, 0.0f, 0.0f);
            matrix.postTranslate(this.f3994h + this.f3990d, this.i + this.f3991e);
        }

        public String getGroupName() {
            return this.f3996k;
        }

        public Matrix getLocalMatrix() {
            return this.f3995j;
        }

        public float getPivotX() {
            return this.f3990d;
        }

        public float getPivotY() {
            return this.f3991e;
        }

        public float getRotation() {
            return this.f3989c;
        }

        public float getScaleX() {
            return this.f3992f;
        }

        public float getScaleY() {
            return this.f3993g;
        }

        public float getTranslateX() {
            return this.f3994h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3990d) {
                this.f3990d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3991e) {
                this.f3991e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3989c) {
                this.f3989c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3992f) {
                this.f3992f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3993g) {
                this.f3993g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3994h) {
                this.f3994h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.i) {
                this.i = f10;
                c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(c cVar, C5308a<String, Object> c5308a) {
            a aVar;
            this.f3987a = new Matrix();
            this.f3988b = new ArrayList<>();
            this.f3989c = 0.0f;
            this.f3990d = 0.0f;
            this.f3991e = 0.0f;
            this.f3992f = 1.0f;
            this.f3993g = 1.0f;
            this.f3994h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3995j = matrix;
            this.f3996k = null;
            this.f3989c = cVar.f3989c;
            this.f3990d = cVar.f3990d;
            this.f3991e = cVar.f3991e;
            this.f3992f = cVar.f3992f;
            this.f3993g = cVar.f3993g;
            this.f3994h = cVar.f3994h;
            this.i = cVar.i;
            String str = cVar.f3996k;
            this.f3996k = str;
            if (str != null) {
                c5308a.put(str, this);
            }
            matrix.set(cVar.f3995j);
            ArrayList<d> arrayList = cVar.f3988b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.f3988b.add(new c((c) dVar, c5308a));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f3978e = 0.0f;
                        bVar2.f3980g = 1.0f;
                        bVar2.f3981h = 1.0f;
                        bVar2.i = 0.0f;
                        bVar2.f3982j = 1.0f;
                        bVar2.f3983k = 0.0f;
                        bVar2.f3984l = Paint.Cap.BUTT;
                        bVar2.f3985m = Paint.Join.MITER;
                        bVar2.f3986n = 4.0f;
                        bVar2.f3977d = bVar.f3977d;
                        bVar2.f3978e = bVar.f3978e;
                        bVar2.f3980g = bVar.f3980g;
                        bVar2.f3979f = bVar.f3979f;
                        bVar2.f3999c = bVar.f3999c;
                        bVar2.f3981h = bVar.f3981h;
                        bVar2.i = bVar.i;
                        bVar2.f3982j = bVar.f3982j;
                        bVar2.f3983k = bVar.f3983k;
                        bVar2.f3984l = bVar.f3984l;
                        bVar2.f3985m = bVar.f3985m;
                        bVar2.f3986n = bVar.f3986n;
                        aVar = bVar2;
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3988b.add(aVar);
                    String str2 = aVar.f3998b;
                    if (str2 != null) {
                        c5308a.put(str2, aVar);
                    }
                }
            }
        }
    }

    public i(g gVar) {
        this.f3974g = true;
        this.f3975h = new float[9];
        this.i = new Matrix();
        this.f3976j = new Rect();
        this.f3970c = gVar;
        this.f3971d = a(gVar.f4017c, gVar.f4018d);
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class f {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f4000p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f4001a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f4002b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f4003c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f4004d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f4005e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f4006f;

        /* renamed from: g, reason: collision with root package name */
        public final c f4007g;

        /* renamed from: h, reason: collision with root package name */
        public float f4008h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f4009j;

        /* renamed from: k, reason: collision with root package name */
        public float f4010k;

        /* renamed from: l, reason: collision with root package name */
        public int f4011l;

        /* renamed from: m, reason: collision with root package name */
        public String f4012m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f4013n;

        /* renamed from: o, reason: collision with root package name */
        public final C5308a<String, Object> f4014o;

        public f() {
            this.f4003c = new Matrix();
            this.f4008h = 0.0f;
            this.i = 0.0f;
            this.f4009j = 0.0f;
            this.f4010k = 0.0f;
            this.f4011l = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f4012m = null;
            this.f4013n = null;
            this.f4014o = new C5308a<>();
            this.f4007g = new c();
            this.f4001a = new Path();
            this.f4002b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i, int i10) {
            char c10;
            float f10;
            float f11;
            int i11;
            c cVar2 = cVar;
            char c11 = 1;
            cVar2.f3987a.set(matrix);
            Matrix matrix2 = cVar2.f3995j;
            Matrix matrix3 = cVar2.f3987a;
            matrix3.preConcat(matrix2);
            canvas.save();
            char c12 = 0;
            int i12 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar2.f3988b;
                if (i12 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, matrix3, canvas, i, i10);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f12 = i / this.f4009j;
                    float f13 = i10 / this.f4010k;
                    float fMin = Math.min(f12, f13);
                    Matrix matrix4 = this.f4003c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c12], fArr[c11]);
                    boolean z10 = c11;
                    boolean z11 = c12;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[z11 ? 1 : 0] * fArr[3]) - (fArr[z10 ? 1 : 0] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        eVar.getClass();
                        Path path = this.f4001a;
                        path.reset();
                        g.a[] aVarArr = eVar.f3997a;
                        if (aVarArr != null) {
                            g.a.b(aVarArr, path);
                        }
                        Path path2 = this.f4002b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.f3999c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f15 = bVar.i;
                            if (f15 != 0.0f || bVar.f3982j != 1.0f) {
                                float f16 = bVar.f3983k;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (bVar.f3982j + f16) % 1.0f;
                                if (this.f4006f == null) {
                                    this.f4006f = new PathMeasure();
                                }
                                this.f4006f.setPath(path, z11);
                                float length = this.f4006f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f4006f.getSegment(f19, length, path, z10);
                                    f10 = 0.0f;
                                    this.f4006f.getSegment(0.0f, f20, path, z10);
                                } else {
                                    f10 = 0.0f;
                                    this.f4006f.getSegment(f19, f20, path, z10);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            B0.d dVar2 = bVar.f3979f;
                            if ((dVar2.f342a == null && dVar2.f344c == 0) ? false : true) {
                                if (this.f4005e == null) {
                                    i11 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f4005e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i11 = 16777215;
                                }
                                Paint paint2 = this.f4005e;
                                Shader shader = dVar2.f342a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f3981h * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i13 = dVar2.f344c;
                                    float f21 = bVar.f3981h;
                                    PorterDuff.Mode mode = i.f3969k;
                                    f11 = 255.0f;
                                    paint2.setColor((i13 & i11) | (((int) (Color.alpha(i13) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.f3999c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i11 = 16777215;
                            }
                            B0.d dVar3 = bVar.f3977d;
                            if (dVar3.f342a != null || dVar3.f344c != 0) {
                                if (this.f4004d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f4004d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f4004d;
                                Paint.Join join = bVar.f3985m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f3984l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f3986n);
                                Shader shader2 = dVar3.f342a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f3980g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i14 = dVar3.f344c;
                                    float f22 = bVar.f3980g;
                                    PorterDuff.Mode mode2 = i.f3969k;
                                    paint4.setColor((i14 & i11) | (((int) (Color.alpha(i14) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f3978e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c10 = 1;
                    i12++;
                    cVar2 = cVar;
                    c11 = c10;
                    c12 = 0;
                }
                c10 = c11;
                i12++;
                cVar2 = cVar;
                c11 = c10;
                c12 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4011l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4011l = i;
        }

        public f(f fVar) {
            this.f4003c = new Matrix();
            this.f4008h = 0.0f;
            this.i = 0.0f;
            this.f4009j = 0.0f;
            this.f4010k = 0.0f;
            this.f4011l = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f4012m = null;
            this.f4013n = null;
            C5308a<String, Object> c5308a = new C5308a<>();
            this.f4014o = c5308a;
            this.f4007g = new c(fVar.f4007g, c5308a);
            this.f4001a = new Path(fVar.f4001a);
            this.f4002b = new Path(fVar.f4002b);
            this.f4008h = fVar.f4008h;
            this.i = fVar.i;
            this.f4009j = fVar.f4009j;
            this.f4010k = fVar.f4010k;
            this.f4011l = fVar.f4011l;
            this.f4012m = fVar.f4012m;
            String str = fVar.f4012m;
            if (str != null) {
                c5308a.put(str, this);
            }
            this.f4013n = fVar.f4013n;
        }
    }
}
