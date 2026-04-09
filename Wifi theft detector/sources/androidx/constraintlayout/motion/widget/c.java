package androidx.constraintlayout.motion.widget;

import a0.f;
import a0.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.app.z;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class c {

    /* renamed from: w, reason: collision with root package name */
    public static String f2025w = "ViewTransition";

    /* renamed from: a, reason: collision with root package name */
    public int f2026a;

    /* renamed from: e, reason: collision with root package name */
    public int f2030e;

    /* renamed from: f, reason: collision with root package name */
    public f f2031f;

    /* renamed from: g, reason: collision with root package name */
    public c.a f2032g;

    /* renamed from: j, reason: collision with root package name */
    public int f2035j;

    /* renamed from: k, reason: collision with root package name */
    public String f2036k;

    /* renamed from: o, reason: collision with root package name */
    public Context f2040o;

    /* renamed from: b, reason: collision with root package name */
    public int f2027b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2028c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f2029d = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f2033h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2034i = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f2037l = 0;

    /* renamed from: m, reason: collision with root package name */
    public String f2038m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f2039n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f2041p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f2042q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f2043r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f2044s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f2045t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f2046u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f2047v = -1;

    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v.c f2048a;

        public a(v.c cVar) {
            this.f2048a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f2048a.a(f10);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2051b;

        /* renamed from: c, reason: collision with root package name */
        public long f2052c;

        /* renamed from: d, reason: collision with root package name */
        public l f2053d;

        /* renamed from: e, reason: collision with root package name */
        public int f2054e;

        /* renamed from: f, reason: collision with root package name */
        public int f2055f;

        /* renamed from: h, reason: collision with root package name */
        public d f2057h;

        /* renamed from: i, reason: collision with root package name */
        public Interpolator f2058i;

        /* renamed from: k, reason: collision with root package name */
        public float f2060k;

        /* renamed from: l, reason: collision with root package name */
        public float f2061l;

        /* renamed from: m, reason: collision with root package name */
        public long f2062m;

        /* renamed from: o, reason: collision with root package name */
        public boolean f2064o;

        /* renamed from: g, reason: collision with root package name */
        public v.d f2056g = new v.d();

        /* renamed from: j, reason: collision with root package name */
        public boolean f2059j = false;

        /* renamed from: n, reason: collision with root package name */
        public Rect f2063n = new Rect();

        public b(d dVar, l lVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f2064o = false;
            this.f2057h = dVar;
            this.f2053d = lVar;
            this.f2054e = i10;
            this.f2055f = i11;
            long jNanoTime = System.nanoTime();
            this.f2052c = jNanoTime;
            this.f2062m = jNanoTime;
            this.f2057h.b(this);
            this.f2058i = interpolator;
            this.f2050a = i13;
            this.f2051b = i14;
            if (i12 == 3) {
                this.f2064o = true;
            }
            this.f2061l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        public void a() {
            if (this.f2059j) {
                c();
            } else {
                b();
            }
        }

        public void b() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f2062m;
            this.f2062m = jNanoTime;
            float f10 = this.f2060k + (((float) (j10 * 1.0E-6d)) * this.f2061l);
            this.f2060k = f10;
            if (f10 >= 1.0f) {
                this.f2060k = 1.0f;
            }
            Interpolator interpolator = this.f2058i;
            float interpolation = interpolator == null ? this.f2060k : interpolator.getInterpolation(this.f2060k);
            l lVar = this.f2053d;
            boolean zS = lVar.s(lVar.f42b, interpolation, jNanoTime, this.f2056g);
            if (this.f2060k >= 1.0f) {
                if (this.f2050a != -1) {
                    this.f2053d.r().setTag(this.f2050a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2051b != -1) {
                    this.f2053d.r().setTag(this.f2051b, null);
                }
                if (!this.f2064o) {
                    this.f2057h.f(this);
                }
            }
            if (this.f2060k < 1.0f || zS) {
                this.f2057h.d();
            }
        }

        public void c() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f2062m;
            this.f2062m = jNanoTime;
            float f10 = this.f2060k - (((float) (j10 * 1.0E-6d)) * this.f2061l);
            this.f2060k = f10;
            if (f10 < 0.0f) {
                this.f2060k = 0.0f;
            }
            Interpolator interpolator = this.f2058i;
            float interpolation = interpolator == null ? this.f2060k : interpolator.getInterpolation(this.f2060k);
            l lVar = this.f2053d;
            boolean zS = lVar.s(lVar.f42b, interpolation, jNanoTime, this.f2056g);
            if (this.f2060k <= 0.0f) {
                if (this.f2050a != -1) {
                    this.f2053d.r().setTag(this.f2050a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2051b != -1) {
                    this.f2053d.r().setTag(this.f2051b, null);
                }
                this.f2057h.f(this);
            }
            if (this.f2060k > 0.0f || zS) {
                this.f2057h.d();
            }
        }

        public void d(int i10, float f10, float f11) {
            if (i10 == 1) {
                if (this.f2059j) {
                    return;
                }
                e(true);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f2053d.r().getHitRect(this.f2063n);
                if (this.f2063n.contains((int) f10, (int) f11) || this.f2059j) {
                    return;
                }
                e(true);
            }
        }

        public void e(boolean z10) {
            int i10;
            this.f2059j = z10;
            if (z10 && (i10 = this.f2055f) != -1) {
                this.f2061l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f2057h.d();
            this.f2062m = System.nanoTime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.c.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public static /* synthetic */ void a(c cVar, View[] viewArr) {
        if (cVar.f2041p != -1) {
            for (View view : viewArr) {
                view.setTag(cVar.f2041p, Long.valueOf(System.nanoTime()));
            }
        }
        if (cVar.f2042q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(cVar.f2042q, null);
            }
        }
    }

    public void b(d dVar, MotionLayout motionLayout, View view) {
        l lVar = new l(view);
        lVar.v(view);
        this.f2031f.a(lVar);
        lVar.C(motionLayout.getWidth(), motionLayout.getHeight(), this.f2033h, System.nanoTime());
        new b(dVar, lVar, this.f2033h, this.f2034i, this.f2027b, e(motionLayout.getContext()), this.f2041p, this.f2042q);
    }

    public void c(d dVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.c cVar, final View... viewArr) {
        if (this.f2028c) {
            return;
        }
        int i11 = this.f2030e;
        if (i11 == 2) {
            b(dVar, motionLayout, viewArr[0]);
            return;
        }
        if (i11 == 1) {
            for (int i12 : motionLayout.getConstraintSetIds()) {
                if (i12 != i10) {
                    androidx.constraintlayout.widget.c cVarO0 = motionLayout.o0(i12);
                    for (View view : viewArr) {
                        c.a aVarV = cVarO0.v(view.getId());
                        c.a aVar = this.f2032g;
                        if (aVar != null) {
                            aVar.d(aVarV);
                            aVarV.f2204g.putAll(this.f2032g.f2204g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.p(cVar);
        for (View view2 : viewArr) {
            c.a aVarV2 = cVar2.v(view2.getId());
            c.a aVar2 = this.f2032g;
            if (aVar2 != null) {
                aVar2.d(aVarV2);
                aVarV2.f2204g.putAll(this.f2032g.f2204g);
            }
        }
        motionLayout.L0(i10, cVar2);
        int i13 = b0.c.view_transition;
        motionLayout.L0(i13, cVar);
        motionLayout.z0(i13, -1, -1);
        a.b bVar = new a.b(-1, motionLayout.f1897y, i13, i10);
        for (View view3 : viewArr) {
            l(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.F0(new Runnable() { // from class: a0.p
            @Override // java.lang.Runnable
            public final void run() {
                androidx.constraintlayout.motion.widget.c.a(this.f92a, viewArr);
            }
        });
    }

    public boolean d(View view) {
        int i10 = this.f2043r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f2044s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    public Interpolator e(Context context) {
        int i10 = this.f2037l;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f2039n);
        }
        if (i10 == -1) {
            return new a(v.c.c(this.f2038m));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int f() {
        return this.f2045t;
    }

    public int g() {
        return this.f2046u;
    }

    public int h() {
        return this.f2027b;
    }

    public boolean i(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f2035j == -1 && this.f2036k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f2035j) {
            return true;
        }
        return this.f2036k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f2122b0) != null && str.matches(this.f2036k);
    }

    public final void j(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == b0.d.ViewTransition_android_id) {
                this.f2026a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2026a);
            } else if (index == b0.d.ViewTransition_motionTarget) {
                if (MotionLayout.f1870c1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2035j);
                    this.f2035j = resourceId;
                    if (resourceId == -1) {
                        this.f2036k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f2036k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f2035j = typedArrayObtainStyledAttributes.getResourceId(index, this.f2035j);
                }
            } else if (index == b0.d.ViewTransition_onStateTransition) {
                this.f2027b = typedArrayObtainStyledAttributes.getInt(index, this.f2027b);
            } else if (index == b0.d.ViewTransition_transitionDisable) {
                this.f2028c = typedArrayObtainStyledAttributes.getBoolean(index, this.f2028c);
            } else if (index == b0.d.ViewTransition_pathMotionArc) {
                this.f2029d = typedArrayObtainStyledAttributes.getInt(index, this.f2029d);
            } else if (index == b0.d.ViewTransition_duration) {
                this.f2033h = typedArrayObtainStyledAttributes.getInt(index, this.f2033h);
            } else if (index == b0.d.ViewTransition_upDuration) {
                this.f2034i = typedArrayObtainStyledAttributes.getInt(index, this.f2034i);
            } else if (index == b0.d.ViewTransition_viewTransitionMode) {
                this.f2030e = typedArrayObtainStyledAttributes.getInt(index, this.f2030e);
            } else if (index == b0.d.ViewTransition_motionInterpolator) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f2039n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f2037l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2038m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2037l = -1;
                    } else {
                        this.f2039n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f2037l = -2;
                    }
                } else {
                    this.f2037l = typedArrayObtainStyledAttributes.getInteger(index, this.f2037l);
                }
            } else if (index == b0.d.ViewTransition_setsTag) {
                this.f2041p = typedArrayObtainStyledAttributes.getResourceId(index, this.f2041p);
            } else if (index == b0.d.ViewTransition_clearsTag) {
                this.f2042q = typedArrayObtainStyledAttributes.getResourceId(index, this.f2042q);
            } else if (index == b0.d.ViewTransition_ifTagSet) {
                this.f2043r = typedArrayObtainStyledAttributes.getResourceId(index, this.f2043r);
            } else if (index == b0.d.ViewTransition_ifTagNotSet) {
                this.f2044s = typedArrayObtainStyledAttributes.getResourceId(index, this.f2044s);
            } else if (index == b0.d.ViewTransition_SharedValueId) {
                this.f2046u = typedArrayObtainStyledAttributes.getResourceId(index, this.f2046u);
            } else if (index == b0.d.ViewTransition_SharedValue) {
                this.f2045t = typedArrayObtainStyledAttributes.getInteger(index, this.f2045t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean k(int i10) {
        int i11 = this.f2027b;
        return i11 == 1 ? i10 == 0 : i11 == 2 ? i10 == 1 : i11 == 3 && i10 == 0;
    }

    public final void l(a.b bVar, View view) {
        int i10 = this.f2033h;
        if (i10 != -1) {
            bVar.E(i10);
        }
        bVar.G(this.f2029d);
        bVar.F(this.f2037l, this.f2038m, this.f2039n);
        view.getId();
        f fVar = this.f2031f;
        if (fVar != null) {
            ArrayList arrayListC = fVar.c(-1);
            f fVar2 = new f();
            Iterator it = arrayListC.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                throw null;
            }
            bVar.t(fVar2);
        }
    }

    public String toString() {
        return "ViewTransition(" + a0.a.c(this.f2040o, this.f2026a) + ")";
    }
}
