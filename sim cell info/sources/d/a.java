package d;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import d.b;
import d.d;
import java.io.IOException;
import k.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends d.d implements u.b {

    /* renamed from: v, reason: collision with root package name */
    private static final String f2463v = a.class.getSimpleName();

    /* renamed from: q, reason: collision with root package name */
    private c f2464q;

    /* renamed from: r, reason: collision with root package name */
    private g f2465r;

    /* renamed from: s, reason: collision with root package name */
    private int f2466s;

    /* renamed from: t, reason: collision with root package name */
    private int f2467t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2468u;

    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f2469a;

        b(Animatable animatable) {
            super();
            this.f2469a = animatable;
        }

        @Override // d.a.g
        public void c() {
            this.f2469a.start();
        }

        @Override // d.a.g
        public void d() {
            this.f2469a.stop();
        }
    }

    static class c extends d.a {
        k.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            h<Integer> hVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new k.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i2) {
            int iZ = super.z(iArr, drawable);
            this.L.h(iZ, Integer.valueOf(i2));
            return iZ;
        }

        int C(int i2, int i3, Drawable drawable, boolean z2) {
            int iA = super.a(drawable);
            long jD = D(i2, i3);
            long j2 = z2 ? 8589934592L : 0L;
            long j3 = iA;
            this.K.a(jD, Long.valueOf(j3 | j2));
            if (z2) {
                this.K.a(D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return iA;
        }

        int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.f(i2, 0).intValue();
        }

        int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        int G(int i2, int i3) {
            return (int) this.K.g(D(i2, i3), -1L).longValue();
        }

        boolean H(int i2, int i3) {
            return (this.K.g(D(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i2, int i3) {
            return (this.K.g(D(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // d.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // d.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // d.d.a, d.b.c
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f2470a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f2470a = bVar;
        }

        @Override // d.a.g
        public void c() {
            this.f2470a.start();
        }

        @Override // d.a.g
        public void d() {
            this.f2470a.stop();
        }
    }

    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f2471a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2472b;

        e(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z2);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f2472b = z3;
            this.f2471a = objectAnimatorOfInt;
        }

        @Override // d.a.g
        public boolean a() {
            return this.f2472b;
        }

        @Override // d.a.g
        public void b() {
            this.f2471a.reverse();
        }

        @Override // d.a.g
        public void c() {
            this.f2471a.start();
        }

        @Override // d.a.g
        public void d() {
            this.f2471a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f2473a;

        /* renamed from: b, reason: collision with root package name */
        private int f2474b;

        /* renamed from: c, reason: collision with root package name */
        private int f2475c;

        f(AnimationDrawable animationDrawable, boolean z2) {
            b(animationDrawable, z2);
        }

        int a() {
            return this.f2475c;
        }

        int b(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2474b = numberOfFrames;
            int[] iArr = this.f2473a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2473a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2473a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f2475c = i2;
            return i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f2475c) + 0.5f);
            int i3 = this.f2474b;
            int[] iArr = this.f2473a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f2475c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f2466s = -1;
        this.f2467t = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, e.b.f2530h);
        int resourceId = typedArrayK.getResourceId(e.b.f2531i, 0);
        int resourceId2 = typedArrayK.getResourceId(e.b.f2532j, -1);
        Drawable drawableJ = resourceId2 > 0 ? m0.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrK = k(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ != null) {
            return this.f2464q.B(iArrK, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, e.b.f2533k);
        int resourceId = typedArrayK.getResourceId(e.b.f2536n, -1);
        int resourceId2 = typedArrayK.getResourceId(e.b.f2535m, -1);
        int resourceId3 = typedArrayK.getResourceId(e.b.f2534l, -1);
        Drawable drawableJ = resourceId3 > 0 ? m0.h().j(context, resourceId3) : null;
        boolean z2 = typedArrayK.getBoolean(e.b.f2537o, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f2464q.C(resourceId, resourceId2, drawableJ, z2);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean s(int i2) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.f2465r;
        if (gVar == null) {
            iC = c();
        } else {
            if (i2 == this.f2466s) {
                return true;
            }
            if (i2 == this.f2467t && gVar.a()) {
                gVar.b();
                this.f2466s = this.f2467t;
                this.f2467t = i2;
                return true;
            }
            iC = this.f2466s;
            gVar.d();
        }
        this.f2465r = null;
        this.f2467t = -1;
        this.f2466s = -1;
        c cVar = this.f2464q;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i2);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        }
        bVar.c();
        this.f2465r = bVar;
        this.f2467t = iC;
        this.f2466s = i2;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f2464q;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f2494d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(e.b.f2526d, cVar.f2499i));
        cVar.t(typedArray.getBoolean(e.b.f2527e, cVar.f2502l));
        cVar.u(typedArray.getInt(e.b.f2528f, cVar.A));
        cVar.v(typedArray.getInt(e.b.f2529g, cVar.B));
        setDither(typedArray.getBoolean(e.b.f2524b, cVar.f2514x));
    }

    @Override // d.d, d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // d.d, d.b
    void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.f2464q = (c) cVar;
        }
    }

    @Override // d.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // d.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f2465r;
        if (gVar != null) {
            gVar.d();
            this.f2465r = null;
            g(this.f2466s);
            this.f2466s = -1;
            this.f2467t = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // d.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f2464q, this, null);
    }

    @Override // d.d, d.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2468u && super.mutate() == this) {
            this.f2464q.r();
            this.f2468u = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, e.b.f2523a);
        setVisible(typedArrayK.getBoolean(e.b.f2525c, true), true);
        t(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // d.d, d.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iF = this.f2464q.F(iArr);
        boolean z2 = iF != c() && (s(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? z2 | current.setState(iArr) : z2;
    }

    @Override // d.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z2) {
        super.setAutoMirrored(z2);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z2) {
        super.setDither(z2);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // d.b, android.graphics.drawable.Drawable, u.b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // d.b, android.graphics.drawable.Drawable, u.b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // d.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.f2465r;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // d.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
