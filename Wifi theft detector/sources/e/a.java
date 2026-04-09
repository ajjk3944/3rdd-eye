package e;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.q0;
import e.b;
import e.d;
import i0.i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.h;
import r.l;

/* loaded from: classes.dex */
public class a extends e.d {

    /* renamed from: o, reason: collision with root package name */
    public c f20817o;

    /* renamed from: p, reason: collision with root package name */
    public g f20818p;

    /* renamed from: q, reason: collision with root package name */
    public int f20819q;

    /* renamed from: r, reason: collision with root package name */
    public int f20820r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20821s;

    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f20822a;

        public b(Animatable animatable) {
            super();
            this.f20822a = animatable;
        }

        @Override // e.a.g
        public void c() {
            this.f20822a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f20822a.stop();
        }
    }

    public static class c extends d.a {
        public h K;
        public l L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new h();
                this.L = new l();
            }
        }

        public static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i10) {
            int iZ = super.z(iArr, drawable);
            this.L.h(iZ, Integer.valueOf(i10));
            return iZ;
        }

        public int C(int i10, int i11, Drawable drawable, boolean z10) {
            int iA = super.a(drawable);
            long jD = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = iA;
            this.K.a(jD, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return iA;
        }

        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return ((Integer) this.L.e(i10, 0)).intValue();
        }

        public int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        public int G(int i10, int i11) {
            return (int) ((Long) this.K.e(D(i10, i11), -1L)).longValue();
        }

        public boolean H(int i10, int i11) {
            return (((Long) this.K.e(D(i10, i11), -1L)).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i10, int i11) {
            return (((Long) this.K.e(D(i10, i11), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // e.d.a, e.b.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final z1.c f20823a;

        public d(z1.c cVar) {
            super();
            this.f20823a = cVar;
        }

        @Override // e.a.g
        public void c() {
            this.f20823a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f20823a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f20824a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20825b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f20825b = z11;
            this.f20824a = objectAnimatorOfInt;
        }

        @Override // e.a.g
        public boolean a() {
            return this.f20825b;
        }

        @Override // e.a.g
        public void b() {
            this.f20824a.reverse();
        }

        @Override // e.a.g
        public void c() {
            this.f20824a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f20824a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f20826a;

        /* renamed from: b, reason: collision with root package name */
        public int f20827b;

        /* renamed from: c, reason: collision with root package name */
        public int f20828c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        public int a() {
            return this.f20828c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f20827b = numberOfFrames;
            int[] iArr = this.f20826a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f20826a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f20826a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f20828c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f20828c) + 0.5f);
            int i11 = this.f20827b;
            int[] iArr = this.f20826a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f20828c : 0.0f);
        }
    }

    public a() {
        this(null, null);
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o() {
        onStateChange(getState());
    }

    @Override // e.d, e.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f20817o = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f20818p;
        if (gVar != null) {
            gVar.d();
            this.f20818p = null;
            g(this.f20819q);
            this.f20819q = -1;
            this.f20820r = -1;
        }
    }

    @Override // e.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f20817o, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, f.c.AnimatedStateListDrawableCompat);
        setVisible(typedArrayK.getBoolean(f.c.AnimatedStateListDrawableCompat_android_visible, true), true);
        s(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // e.d, e.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f20821s && super.mutate() == this) {
            this.f20817o.r();
            this.f20821s = true;
        }
        return this;
    }

    public final void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // e.d, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iF = this.f20817o.F(iArr);
        boolean z10 = iF != c() && (r(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z10 : z10;
    }

    public final int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, f.c.AnimatedStateListDrawableItem);
        int resourceId = typedArrayK.getResourceId(f.c.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayK.getResourceId(f.c.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawableJ = resourceId2 > 0 ? q0.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? z1.h.c(resources, xmlPullParser, attributeSet, theme) : f.a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f20817o.B(iArrJ, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, f.c.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayK.getResourceId(f.c.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayK.getResourceId(f.c.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayK.getResourceId(f.c.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawableJ = resourceId3 > 0 ? q0.h().j(context, resourceId3) : null;
        boolean z10 = typedArrayK.getBoolean(f.c.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? z1.c.b(context, resources, xmlPullParser, attributeSet, theme) : f.a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f20817o.C(resourceId, resourceId2, drawableJ, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    public final boolean r(int i10) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.f20818p;
        if (gVar == null) {
            iC = c();
        } else {
            if (i10 == this.f20819q) {
                return true;
            }
            if (i10 == this.f20820r && gVar.a()) {
                gVar.b();
                this.f20819q = this.f20820r;
                this.f20820r = i10;
                return true;
            }
            iC = this.f20819q;
            gVar.d();
        }
        this.f20818p = null;
        this.f20820r = -1;
        this.f20819q = -1;
        c cVar = this.f20817o;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i10);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof z1.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((z1.c) current);
        }
        bVar.c();
        this.f20818p = bVar;
        this.f20820r = iC;
        this.f20819q = i10;
        return true;
    }

    public final void s(TypedArray typedArray) {
        c cVar = this.f20817o;
        cVar.f20846d |= f.a.b(typedArray);
        cVar.x(typedArray.getBoolean(f.c.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f20851i));
        cVar.t(typedArray.getBoolean(f.c.AnimatedStateListDrawableCompat_android_constantSize, cVar.f20854l));
        cVar.u(typedArray.getInt(f.c.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(f.c.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(f.c.AnimatedStateListDrawableCompat_android_dither, cVar.f20866x));
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f20818p;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.f20819q = -1;
        this.f20820r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
