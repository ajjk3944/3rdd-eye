package w7;

import C6.r;
import L0.I;
import M0.g;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import b9.j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j6.C5195A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.C5215a;
import kotlin.jvm.internal.l;
import qa.g;
import x7.C5780b;

/* compiled from: SliderView.kt */
/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5742b extends View {

    /* renamed from: A, reason: collision with root package name */
    public e f47503A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f47504B;

    /* renamed from: C, reason: collision with root package name */
    public float f47505C;

    /* renamed from: D, reason: collision with root package name */
    public float f47506D;

    /* renamed from: E, reason: collision with root package name */
    public float f47507E;

    /* renamed from: F, reason: collision with root package name */
    public float f47508F;

    /* renamed from: G, reason: collision with root package name */
    public Integer f47509G;

    /* renamed from: b, reason: collision with root package name */
    public final g f47510b;

    /* renamed from: c, reason: collision with root package name */
    public final C5195A<c> f47511c;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f47512d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f47513e;

    /* renamed from: f, reason: collision with root package name */
    public final C5743c f47514f;

    /* renamed from: g, reason: collision with root package name */
    public final C5744d f47515g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f47516h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public AccelerateDecelerateInterpolator f47517j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f47518k;

    /* renamed from: l, reason: collision with root package name */
    public float f47519l;

    /* renamed from: m, reason: collision with root package name */
    public float f47520m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f47521n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f47522o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f47523p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f47524q;

    /* renamed from: r, reason: collision with root package name */
    public float f47525r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f47526s;

    /* renamed from: t, reason: collision with root package name */
    public C5780b f47527t;

    /* renamed from: u, reason: collision with root package name */
    public Float f47528u;

    /* renamed from: v, reason: collision with root package name */
    public final a f47529v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f47530w;

    /* renamed from: x, reason: collision with root package name */
    public C5780b f47531x;

    /* renamed from: y, reason: collision with root package name */
    public int f47532y;

    /* renamed from: z, reason: collision with root package name */
    public final C0548b f47533z;

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$a */
    public final class a extends V0.a {

        /* renamed from: q, reason: collision with root package name */
        public final C5742b f47534q;

        /* renamed from: r, reason: collision with root package name */
        public final Rect f47535r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C5742b f47536s;

        /* compiled from: SliderView.kt */
        /* renamed from: w7.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0547a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47537a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.THUMB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.THUMB_SECONDARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f47537a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5742b c5742b, C5742b slider) {
            super(slider);
            l.f(slider, "slider");
            this.f47536s = c5742b;
            this.f47534q = slider;
            this.f47535r = new Rect();
        }

        public final void A(float f10, int i) {
            C5742b c5742b = this.f47536s;
            e eVar = (i == 0 || c5742b.getThumbSecondaryValue() == null) ? e.THUMB : e.THUMB_SECONDARY;
            c5742b.s(eVar, c5742b.m(f10), false, true);
            z(i, 4);
            q(i, 0);
        }

        public final float B(int i) {
            C5742b c5742b = this.f47536s;
            if (i == 0) {
                return c5742b.getThumbValue();
            }
            Float thumbSecondaryValue = c5742b.getThumbSecondaryValue();
            return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : c5742b.getThumbValue();
        }

        @Override // V0.a
        public final int o(float f10, float f11) {
            C5742b c5742b = this.f47536s;
            if (f10 < c5742b.getLeftPaddingOffset()) {
                return 0;
            }
            int i = C0547a.f47537a[c5742b.k((int) f10).ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            throw new j();
        }

        @Override // V0.a
        public final void p(ArrayList arrayList) {
            arrayList.add(0);
            if (this.f47536s.getThumbSecondaryValue() != null) {
                arrayList.add(1);
            }
        }

        @Override // V0.a
        public final boolean u(int i, int i10, Bundle bundle) {
            C5742b c5742b = this.f47536s;
            if (i10 == 4096) {
                A(B(i) + Math.max(com.google.gson.internal.c.x((c5742b.getMaxValue() - c5742b.getMinValue()) * 0.05d), 1), i);
            } else if (i10 == 8192) {
                A(B(i) - Math.max(com.google.gson.internal.c.x((c5742b.getMaxValue() - c5742b.getMinValue()) * 0.05d), 1), i);
            } else {
                if (i10 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                A(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"), i);
            }
            return true;
        }

        @Override // V0.a
        public final void w(int i, M0.g gVar) {
            int i10;
            int iF;
            gVar.j("android.widget.SeekBar");
            C5742b c5742b = this.f47536s;
            AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(0, c5742b.getMinValue(), c5742b.getMaxValue(), B(i));
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
            StringBuilder sb = new StringBuilder();
            C5742b c5742b2 = this.f47534q;
            CharSequence contentDescription = c5742b2.getContentDescription();
            if (contentDescription != null) {
                sb.append(contentDescription);
                sb.append(StringUtils.COMMA);
            }
            String string = "";
            if (c5742b.getThumbSecondaryValue() != null) {
                if (i == 0) {
                    string = c5742b.getContext().getString(R.string.div_slider_range_start);
                    l.e(string, "context.getString(R.string.div_slider_range_start)");
                } else if (i == 1) {
                    string = c5742b.getContext().getString(R.string.div_slider_range_end);
                    l.e(string, "context.getString(R.string.div_slider_range_end)");
                }
            }
            sb.append(string);
            accessibilityNodeInfo.setContentDescription(sb.toString());
            gVar.b(g.a.f4126g);
            gVar.b(g.a.f4127h);
            if (i == 1) {
                i10 = C5742b.i(c5742b.getThumbSecondaryDrawable());
                iF = C5742b.f(c5742b.getThumbSecondaryDrawable());
            } else {
                i10 = C5742b.i(c5742b.getThumbDrawable());
                iF = C5742b.f(c5742b.getThumbDrawable());
            }
            int paddingLeft = c5742b2.getPaddingLeft() + c5742b.t(B(i), c5742b.getWidth());
            Rect rect = this.f47535r;
            rect.left = paddingLeft;
            rect.right = paddingLeft + i10;
            int i11 = iF / 2;
            rect.top = (c5742b2.getHeight() / 2) - i11;
            rect.bottom = (c5742b2.getHeight() / 2) + i11;
            gVar.i(rect);
        }
    }

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$b, reason: collision with other inner class name */
    public final class C0548b {
        public C0548b() {
        }
    }

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$c */
    public interface c {
        void a(Float f10);

        void b(float f10);
    }

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public float f47539a;

        /* renamed from: b, reason: collision with root package name */
        public float f47540b;

        /* renamed from: c, reason: collision with root package name */
        public int f47541c;

        /* renamed from: d, reason: collision with root package name */
        public int f47542d;

        /* renamed from: e, reason: collision with root package name */
        public Drawable f47543e;

        /* renamed from: f, reason: collision with root package name */
        public Drawable f47544f;

        /* renamed from: g, reason: collision with root package name */
        public int f47545g;

        /* renamed from: h, reason: collision with root package name */
        public int f47546h;
    }

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$e */
    public enum e {
        THUMB,
        THUMB_SECONDARY
    }

    /* compiled from: SliderView.kt */
    /* renamed from: w7.b$f */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47547a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47547a = iArr;
        }
    }

    public C5742b(Context context) {
        super(context, null, 0);
        this.f47510b = new qa.g();
        this.f47511c = new C5195A<>();
        this.f47514f = new C5743c(this);
        this.f47515g = new C5744d(this);
        this.f47516h = new ArrayList();
        this.i = 300L;
        this.f47517j = new AccelerateDecelerateInterpolator();
        this.f47518k = true;
        this.f47520m = 100.0f;
        this.f47525r = this.f47519l;
        a aVar = new a(this, this);
        this.f47529v = aVar;
        I.o(this, aVar);
        setAccessibilityLiveRegion(1);
        this.f47532y = -1;
        this.f47533z = new C0548b();
        this.f47503A = e.THUMB;
        this.f47504B = true;
        this.f47505C = 45.0f;
        this.f47506D = (float) Math.tan(45.0f);
    }

    public static int f(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.f47532y == -1) {
            this.f47532y = Math.max(Math.max(i(this.f47521n), i(this.f47522o)), Math.max(i(this.f47526s), i(this.f47530w)));
        }
        return this.f47532y;
    }

    public static int i(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }

    public static void p(d dVar, C5742b c5742b, Canvas canvas, Drawable drawable, int i, int i10, int i11) {
        if ((i11 & 16) != 0) {
            i = dVar.f47545g;
        }
        if ((i11 & 32) != 0) {
            i10 = dVar.f47546h;
        }
        c5742b.f47510b.c(canvas, drawable, i, i10);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.i);
        valueAnimator.setInterpolator(this.f47517j);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        l.f(event, "event");
        return this.f47529v.m(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        l.f(event, "event");
        return this.f47529v.n(event) || super.dispatchKeyEvent(event);
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.f47521n;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.f47523p;
    }

    public final long getAnimationDuration() {
        return this.i;
    }

    public final boolean getAnimationEnabled() {
        return this.f47518k;
    }

    public final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return this.f47517j;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.f47522o;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.f47524q;
    }

    public final boolean getInteractive() {
        return this.f47504B;
    }

    public final float getInterceptionAngle() {
        return this.f47505C;
    }

    public final float getMaxValue() {
        return this.f47520m;
    }

    public final float getMinValue() {
        return this.f47519l;
    }

    public final List<d> getRanges() {
        return this.f47516h;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer num;
        int iMax = Math.max(f(this.f47523p), f(this.f47524q));
        Iterator it = this.f47516h.iterator();
        if (it.hasNext()) {
            d dVar = (d) it.next();
            Integer numValueOf = Integer.valueOf(Math.max(f(dVar.f47543e), f(dVar.f47544f)));
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                Integer numValueOf2 = Integer.valueOf(Math.max(f(dVar2.f47543e), f(dVar2.f47544f)));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return Math.max(Math.max(f(this.f47526s), f(this.f47530w)), Math.max(iMax, num != null ? num.intValue() : 0));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int iMax = Math.max(Math.max(i(this.f47526s), i(this.f47530w)), Math.max(i(this.f47523p), i(this.f47524q)) * ((int) ((this.f47520m - this.f47519l) + 1)));
        C5780b c5780b = this.f47527t;
        int intrinsicWidth = c5780b != null ? c5780b.getIntrinsicWidth() : 0;
        C5780b c5780b2 = this.f47531x;
        return Math.max(iMax, Math.max(intrinsicWidth, c5780b2 != null ? c5780b2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.f47526s;
    }

    public final C5780b getThumbSecondTextDrawable() {
        return this.f47531x;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.f47530w;
    }

    public final Float getThumbSecondaryValue() {
        return this.f47528u;
    }

    public final C5780b getThumbTextDrawable() {
        return this.f47527t;
    }

    public final float getThumbValue() {
        return this.f47525r;
    }

    public final e k(int i) {
        if (!n()) {
            return e.THUMB;
        }
        int iAbs = Math.abs(i - t(this.f47525r, getWidth()));
        Float f10 = this.f47528u;
        l.c(f10);
        return iAbs < Math.abs(i - t(f10.floatValue(), getWidth())) ? e.THUMB : e.THUMB_SECONDARY;
    }

    public final float l(int i) {
        return (this.f47522o == null && this.f47521n == null) ? u(i) : com.google.gson.internal.c.y(u(i));
    }

    public final float m(float f10) {
        return Math.min(Math.max(f10, this.f47519l), this.f47520m);
    }

    public final boolean n() {
        return this.f47528u != null;
    }

    public final void o(Float f10, float f11) {
        if (f10.floatValue() == f11) {
            return;
        }
        C5195A<c> c5195a = this.f47511c;
        c5195a.getClass();
        C5195A.a aVar = new C5195A.a();
        while (aVar.hasNext()) {
            ((c) aVar.next()).b(f11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175 A[LOOP:2: B:62:0x0175->B:69:0x018e, LOOP_START, PHI: r0
  0x0175: PHI (r0v17 int) = (r0v7 int), (r0v18 int) binds: [B:61:0x0173, B:69:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.C5742b.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        super.onFocusChanged(z10, i, rect);
        this.f47529v.t(z10, i, rect);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        } else if (mode == 1073741824) {
            paddingRight = size;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        } else if (mode2 == 1073741824) {
            paddingBottom = size2;
        }
        setMeasuredDimension(paddingRight, paddingBottom);
        int paddingLeft = ((paddingRight - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
        int paddingTop = (paddingBottom - getPaddingTop()) - getPaddingBottom();
        qa.g gVar = this.f47510b;
        gVar.f45473b = paddingLeft;
        gVar.f45474c = paddingTop;
        Iterator it = this.f47516h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.f47545g = t(Math.max(dVar.f47539a, this.f47519l), paddingRight) + dVar.f47541c;
            dVar.f47546h = t(Math.min(dVar.f47540b, this.f47520m), paddingRight) - dVar.f47542d;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent ev) {
        int scaledTouchSlop;
        l.f(ev, "ev");
        if (this.f47504B) {
            int x10 = (((int) ev.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
            int action = ev.getAction();
            if (action == 0) {
                e eVarK = k(x10);
                this.f47503A = eVarK;
                s(eVarK, l(x10), this.f47518k, false);
                this.f47507E = ev.getX();
                this.f47508F = ev.getY();
                return true;
            }
            if (action == 1) {
                s(this.f47503A, l(x10), this.f47518k, false);
                return true;
            }
            if (action == 2) {
                s(this.f47503A, l(x10), false, true);
                Integer num = this.f47509G;
                if (num != null) {
                    scaledTouchSlop = num.intValue();
                } else {
                    scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    this.f47509G = Integer.valueOf(scaledTouchSlop);
                }
                float fAbs = Math.abs(ev.getY() - this.f47508F);
                if (fAbs < scaledTouchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(fAbs / Math.abs(ev.getX() - this.f47507E) <= this.f47506D);
                }
                this.f47507E = ev.getX();
                this.f47508F = ev.getY();
                return true;
            }
        }
        return false;
    }

    public final void q() {
        w(m(this.f47525r), false, true);
        if (n()) {
            Float f10 = this.f47528u;
            v(f10 != null ? Float.valueOf(m(f10.floatValue())) : null, false, true);
        }
    }

    public final void r() {
        w(com.google.gson.internal.c.y(this.f47525r), false, true);
        if (this.f47528u != null) {
            v(Float.valueOf(com.google.gson.internal.c.y(r0.floatValue())), false, true);
        }
    }

    public final void s(e eVar, float f10, boolean z10, boolean z11) {
        int i = f.f47547a[eVar.ordinal()];
        if (i == 1) {
            w(f10, z10, z11);
        } else {
            if (i != 2) {
                throw new j();
            }
            v(Float.valueOf(f10), z10, z11);
        }
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.f47521n = drawable;
        this.f47532y = -1;
        r();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.f47523p = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j4) {
        if (this.i == j4 || j4 < 0) {
            return;
        }
        this.i = j4;
    }

    public final void setAnimationEnabled(boolean z10) {
        this.f47518k = z10;
    }

    public final void setAnimationInterpolator(AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        l.f(accelerateDecelerateInterpolator, "<set-?>");
        this.f47517j = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.f47522o = drawable;
        this.f47532y = -1;
        r();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.f47524q = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z10) {
        this.f47504B = z10;
    }

    public final void setInterceptionAngle(float f10) {
        float fMax = Math.max(45.0f, Math.abs(f10) % 90);
        this.f47505C = fMax;
        this.f47506D = (float) Math.tan(fMax);
    }

    public final void setMaxValue(float f10) {
        if (this.f47520m == f10) {
            return;
        }
        setMinValue(Math.min(this.f47519l, f10 - 1.0f));
        this.f47520m = f10;
        q();
        invalidate();
    }

    public final void setMinValue(float f10) {
        if (this.f47519l == f10) {
            return;
        }
        setMaxValue(Math.max(this.f47520m, 1.0f + f10));
        this.f47519l = f10;
        q();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f47526s = drawable;
        this.f47532y = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(C5780b c5780b) {
        this.f47531x = c5780b;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.f47530w = drawable;
        this.f47532y = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(C5780b c5780b) {
        this.f47527t = c5780b;
        invalidate();
    }

    public final int t(float f10, int i) {
        return com.google.gson.internal.c.y(((((i - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth()) / (this.f47520m - this.f47519l)) * (r.d(this) ? this.f47520m - f10 : f10 - this.f47519l));
    }

    public final float u(int i) {
        float f10 = this.f47519l;
        float width = ((this.f47520m - f10) * i) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth());
        if (r.d(this)) {
            width = (this.f47520m - width) - 1;
        }
        return f10 + width;
    }

    public final void v(Float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        Float f11;
        int i = 2;
        Float fValueOf = f10 != null ? Float.valueOf(m(f10.floatValue())) : null;
        Float f12 = this.f47528u;
        if (f12 == null) {
            if (fValueOf == null) {
                return;
            }
        } else if (fValueOf != null && f12.floatValue() == fValueOf.floatValue()) {
            return;
        }
        C5744d c5744d = this.f47515g;
        if (!z10 || !this.f47518k || (f11 = this.f47528u) == null || fValueOf == null) {
            if (z11 && (valueAnimator = this.f47513e) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.f47513e == null) {
                Float f13 = this.f47528u;
                c5744d.f47551a = f13;
                this.f47528u = fValueOf;
                if (f13 != null ? fValueOf == null || f13.floatValue() != fValueOf.floatValue() : fValueOf != null) {
                    C5195A<c> c5195a = this.f47511c;
                    c5195a.getClass();
                    C5195A.a aVar = new C5195A.a();
                    while (aVar.hasNext()) {
                        ((c) aVar.next()).a(fValueOf);
                    }
                }
            }
        } else {
            ValueAnimator valueAnimator2 = this.f47513e;
            if (valueAnimator2 == null) {
                c5744d.f47551a = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f14 = this.f47528u;
            l.c(f14);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f14.floatValue(), fValueOf.floatValue());
            valueAnimatorOfFloat.addUpdateListener(new k3.b(this, i));
            valueAnimatorOfFloat.addListener(c5744d);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f47513e = valueAnimatorOfFloat;
        }
        invalidate();
    }

    public final void w(float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        float fM = m(f10);
        float f11 = this.f47525r;
        if (f11 == fM) {
            return;
        }
        C5743c c5743c = this.f47514f;
        if (z10 && this.f47518k) {
            ValueAnimator valueAnimator2 = this.f47512d;
            if (valueAnimator2 == null) {
                c5743c.f47548a = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f47525r, fM);
            valueAnimatorOfFloat.addUpdateListener(new C5215a(this, 2));
            valueAnimatorOfFloat.addListener(c5743c);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f47512d = valueAnimatorOfFloat;
        } else {
            if (z11 && (valueAnimator = this.f47512d) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.f47512d == null) {
                float f12 = this.f47525r;
                c5743c.f47548a = f12;
                this.f47525r = fM;
                o(Float.valueOf(f12), this.f47525r);
            }
        }
        invalidate();
    }
}
