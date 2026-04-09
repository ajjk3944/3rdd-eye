package y7;

import K6.C0713c;
import L0.I;
import L0.S;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import h7.C4422c;
import i6.C4459b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import y7.e;
import y7.v;

/* compiled from: BaseIndicatorTabLayout.java */
/* loaded from: classes.dex */
public class e extends HorizontalScrollView {

    /* renamed from: H, reason: collision with root package name */
    public static final h1.b f48230H = new h1.b();

    /* renamed from: I, reason: collision with root package name */
    public static final K0.e f48231I = new K0.e(16);

    /* renamed from: A, reason: collision with root package name */
    public ViewPager f48232A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.viewpager.widget.a f48233B;

    /* renamed from: C, reason: collision with root package name */
    public C0560e f48234C;

    /* renamed from: D, reason: collision with root package name */
    public g f48235D;

    /* renamed from: E, reason: collision with root package name */
    public final r f48236E;

    /* renamed from: F, reason: collision with root package name */
    public T6.b f48237F;

    /* renamed from: G, reason: collision with root package name */
    public final K0.d f48238G;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<f> f48239b;

    /* renamed from: c, reason: collision with root package name */
    public f f48240c;

    /* renamed from: d, reason: collision with root package name */
    public final d f48241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48243f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48244g;

    /* renamed from: h, reason: collision with root package name */
    public final int f48245h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public final int f48246j;

    /* renamed from: k, reason: collision with root package name */
    public u6.a f48247k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f48248l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f48249m;

    /* renamed from: n, reason: collision with root package name */
    public int f48250n;

    /* renamed from: o, reason: collision with root package name */
    public final int f48251o;

    /* renamed from: p, reason: collision with root package name */
    public final int f48252p;

    /* renamed from: q, reason: collision with root package name */
    public final int f48253q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f48254r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f48255s;

    /* renamed from: t, reason: collision with root package name */
    public final int f48256t;

    /* renamed from: u, reason: collision with root package name */
    public final o7.c f48257u;

    /* renamed from: v, reason: collision with root package name */
    public final int f48258v;

    /* renamed from: w, reason: collision with root package name */
    public final int f48259w;

    /* renamed from: x, reason: collision with root package name */
    public int f48260x;

    /* renamed from: y, reason: collision with root package name */
    public c f48261y;

    /* renamed from: z, reason: collision with root package name */
    public ValueAnimator f48262z;

    /* compiled from: BaseIndicatorTabLayout.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48263a;

        static {
            int[] iArr = new int[b.values().length];
            f48263a = iArr;
            try {
                iArr[b.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48263a[b.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public enum b {
        SLIDE,
        FADE,
        NONE
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public interface c {
        void a(f fVar);

        void b(f fVar);
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public static class d extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        public int f48264b;

        /* renamed from: c, reason: collision with root package name */
        public int f48265c;

        /* renamed from: d, reason: collision with root package name */
        public int f48266d;

        /* renamed from: e, reason: collision with root package name */
        public int f48267e;

        /* renamed from: f, reason: collision with root package name */
        public float f48268f;

        /* renamed from: g, reason: collision with root package name */
        public int f48269g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f48270h;
        public int[] i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f48271j;

        /* renamed from: k, reason: collision with root package name */
        public int f48272k;

        /* renamed from: l, reason: collision with root package name */
        public int f48273l;

        /* renamed from: m, reason: collision with root package name */
        public int f48274m;

        /* renamed from: n, reason: collision with root package name */
        public ValueAnimator f48275n;

        /* renamed from: o, reason: collision with root package name */
        public final Paint f48276o;

        /* renamed from: p, reason: collision with root package name */
        public final Path f48277p;

        /* renamed from: q, reason: collision with root package name */
        public final RectF f48278q;

        /* renamed from: r, reason: collision with root package name */
        public final int f48279r;

        /* renamed from: s, reason: collision with root package name */
        public final int f48280s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f48281t;

        /* renamed from: u, reason: collision with root package name */
        public float f48282u;

        /* renamed from: v, reason: collision with root package name */
        public int f48283v;

        /* renamed from: w, reason: collision with root package name */
        public b f48284w;

        public d(Context context, int i, int i10) {
            super(context);
            this.f48265c = -1;
            this.f48266d = -1;
            this.f48267e = -1;
            this.f48269g = 0;
            this.f48272k = -1;
            this.f48273l = -1;
            this.f48282u = 1.0f;
            this.f48283v = -1;
            this.f48284w = b.SLIDE;
            setId(R.id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.f48274m = childCount;
            if (this.f48281t) {
                this.f48274m = (childCount + 1) / 2;
            }
            d(this.f48274m);
            Paint paint = new Paint();
            this.f48276o = paint;
            paint.setAntiAlias(true);
            this.f48278q = new RectF();
            this.f48279r = i;
            this.f48280s = i10;
            this.f48277p = new Path();
            this.f48271j = new float[8];
        }

        public final void a(int i, long j4) {
            ValueAnimator valueAnimator = this.f48275n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f48275n.cancel();
                j4 = Math.round((1.0f - this.f48275n.getAnimatedFraction()) * this.f48275n.getDuration());
            }
            View childAt = getChildAt(c(i));
            if (childAt == null) {
                e();
                return;
            }
            int i10 = a.f48263a[this.f48284w.ordinal()];
            if (i10 == 1) {
                if (i != this.f48267e) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(e.f48230H);
                    valueAnimatorOfFloat.setDuration(j4);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.g
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            e.d dVar = this.f48299a;
                            dVar.getClass();
                            dVar.f48282u = 1.0f - valueAnimator2.getAnimatedFraction();
                            WeakHashMap<View, S> weakHashMap = I.f3792a;
                            dVar.postInvalidateOnAnimation();
                        }
                    });
                    valueAnimatorOfFloat.addListener(new i(this));
                    this.f48283v = i;
                    this.f48275n = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                ValueAnimator valueAnimator2 = this.f48275n;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f48275n.cancel();
                }
                this.f48267e = i;
                this.f48268f = 0.0f;
                e();
                f();
                return;
            }
            final int i11 = this.f48272k;
            final int i12 = this.f48273l;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (i11 == left && i12 == right) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(e.f48230H);
            valueAnimatorOfFloat2.setDuration(j4);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    e.d dVar = this.f48294a;
                    dVar.getClass();
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    int i13 = left;
                    int iRound = Math.round((i13 - r2) * animatedFraction) + i11;
                    int i14 = right;
                    int iRound2 = Math.round(animatedFraction * (i14 - r3)) + i12;
                    if (iRound != dVar.f48272k || iRound2 != dVar.f48273l) {
                        dVar.f48272k = iRound;
                        dVar.f48273l = iRound2;
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        dVar.postInvalidateOnAnimation();
                    }
                    WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                    dVar.postInvalidateOnAnimation();
                }
            });
            valueAnimatorOfFloat2.addListener(new y7.h(this));
            this.f48283v = i;
            this.f48275n = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.start();
        }

        @Override // android.view.ViewGroup
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i < 0) {
                i = childCount;
            }
            if (i != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = this.f48269g;
                super.addView(view, i, marginLayoutParams);
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams2.leftMargin = this.f48269g;
                updateViewLayout(childAt, marginLayoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams3.leftMargin = 0;
            super.addView(view, i, marginLayoutParams3);
        }

        public final void b(Canvas canvas, int i, int i10, float f10, int i11, float f11) {
            if (i < 0 || i10 <= i) {
                return;
            }
            RectF rectF = this.f48278q;
            rectF.set(i, this.f48279r, i10, f10 - this.f48280s);
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float[] fArr = new float[8];
            for (int i12 = 0; i12 < 8; i12++) {
                float f12 = this.f48271j[i12];
                float fMin = 0.0f;
                if (fHeight > 0.0f && fWidth > 0.0f) {
                    fMin = Math.min(fHeight, fWidth) / 2.0f;
                    if (f12 != -1.0f) {
                        if (f12 > fMin) {
                            int i13 = C4422c.f38270a;
                            C7.a aVar = C7.a.ERROR;
                        }
                        fMin = Math.min(f12, fMin);
                    }
                }
                fArr[i12] = fMin;
            }
            Path path = this.f48277p;
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            path.close();
            Paint paint = this.f48276o;
            paint.setColor(i11);
            paint.setAlpha(Math.round(paint.getAlpha() * f11));
            canvas.drawPath(path, paint);
        }

        public final int c(int i) {
            return (!this.f48281t || i == -1) ? i : i * 2;
        }

        public final void d(int i) {
            this.f48274m = i;
            this.f48270h = new int[i];
            this.i = new int[i];
            for (int i10 = 0; i10 < this.f48274m; i10++) {
                this.f48270h[i10] = -1;
                this.i[i10] = -1;
            }
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            float height = getHeight();
            if (this.f48266d != -1) {
                int i = this.f48274m;
                for (int i10 = 0; i10 < i; i10++) {
                    b(canvas, this.f48270h[i10], this.i[i10], height, this.f48266d, 1.0f);
                }
            }
            if (this.f48265c != -1) {
                int iC = c(this.f48267e);
                int iC2 = c(this.f48283v);
                int i11 = a.f48263a[this.f48284w.ordinal()];
                if (i11 == 1) {
                    b(canvas, this.f48270h[iC], this.i[iC], height, this.f48265c, this.f48282u);
                    if (this.f48283v != -1) {
                        b(canvas, this.f48270h[iC2], this.i[iC2], height, this.f48265c, 1.0f - this.f48282u);
                    }
                } else if (i11 != 2) {
                    b(canvas, this.f48270h[iC], this.i[iC], height, this.f48265c, 1.0f);
                } else {
                    b(canvas, this.f48272k, this.f48273l, height, this.f48265c, 1.0f);
                }
            }
            super.draw(canvas);
        }

        public final void e() {
            int i;
            int right;
            int i10;
            int i11;
            int childCount = getChildCount();
            if (childCount != this.f48274m) {
                d(childCount);
            }
            int iC = c(this.f48267e);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof v) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        right = childAt.getRight();
                        if (this.f48284w != b.SLIDE || i12 != iC || this.f48268f <= 0.0f || i12 >= childCount - 1) {
                            i10 = left;
                            i11 = i10;
                            i = right;
                        } else {
                            View childAt2 = getChildAt(this.f48281t ? i12 + 2 : i12 + 1);
                            float left2 = this.f48268f * childAt2.getLeft();
                            float f10 = this.f48268f;
                            i11 = (int) (((1.0f - f10) * left) + left2);
                            int right2 = (int) (((1.0f - this.f48268f) * right) + (f10 * childAt2.getRight()));
                            i10 = left;
                            i = right2;
                        }
                    } else {
                        i = -1;
                        right = -1;
                        i10 = -1;
                        i11 = -1;
                    }
                    int[] iArr = this.f48270h;
                    int i13 = iArr[i12];
                    int[] iArr2 = this.i;
                    int i14 = iArr2[i12];
                    if (i10 != i13 || right != i14) {
                        iArr[i12] = i10;
                        iArr2[i12] = right;
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        postInvalidateOnAnimation();
                    }
                    if (i12 == iC && (i11 != this.f48272k || i != this.f48273l)) {
                        this.f48272k = i11;
                        this.f48273l = i;
                        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                        postInvalidateOnAnimation();
                    }
                }
            }
        }

        public final void f() {
            float f10 = 1.0f - this.f48268f;
            if (f10 != this.f48282u) {
                this.f48282u = f10;
                int i = this.f48267e + 1;
                if (i >= this.f48274m) {
                    i = -1;
                }
                this.f48283v = i;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                postInvalidateOnAnimation();
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
            super.onLayout(z10, i, i10, i11, i12);
            e();
            ValueAnimator valueAnimator = this.f48275n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f48275n.cancel();
            a(this.f48283v, Math.round((1.0f - this.f48275n.getAnimatedFraction()) * this.f48275n.getDuration()));
        }
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    /* renamed from: y7.e$e, reason: collision with other inner class name */
    public class C0560e extends DataSetObserver {
        public C0560e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            e.this.n();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            e.this.n();
        }
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f48286a;

        /* renamed from: b, reason: collision with root package name */
        public int f48287b = -1;

        /* renamed from: c, reason: collision with root package name */
        public e f48288c;

        /* renamed from: d, reason: collision with root package name */
        public v f48289d;
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public static class g implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<e> f48290a;

        /* renamed from: b, reason: collision with root package name */
        public int f48291b;

        /* renamed from: c, reason: collision with root package name */
        public int f48292c;

        public g(e eVar) {
            this.f48290a = new WeakReference<>(eVar);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            this.f48291b = this.f48292c;
            this.f48292c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f10, int i10) {
            e eVar = this.f48290a.get();
            if (eVar != null) {
                if (this.f48292c != 2 || this.f48291b == 1) {
                    eVar.r(f10, i);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            e eVar = this.f48290a.get();
            if (eVar == null || eVar.getSelectedTabPosition() == i) {
                return;
            }
            int i10 = this.f48292c;
            eVar.p(eVar.f48239b.get(i), i10 == 0 || (i10 == 2 && this.f48291b == 0));
        }
    }

    @SuppressLint({"PrivateResource"})
    public e(Context context) throws Resources.NotFoundException {
        super(context, null, R.attr.divTabIndicatorLayoutStyle);
        this.f48239b = new ArrayList<>();
        this.i = 300L;
        this.f48247k = u6.a.f46598b;
        this.f48250n = Integer.MAX_VALUE;
        this.f48257u = new o7.c(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.f48238G = new K0.d(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4459b.f38459d, R.attr.divTabIndicatorLayoutStyle, 2132017476);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, C4459b.f38456a, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.f48249m = typedArrayObtainStyledAttributes2.getBoolean(6, false);
        this.f48259w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f48254r = typedArrayObtainStyledAttributes2.getBoolean(1, true);
        this.f48255s = typedArrayObtainStyledAttributes2.getBoolean(5, false);
        this.f48256t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        d dVar = new d(context, dimensionPixelSize, dimensionPixelSize2);
        this.f48241d = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (dVar.f48264b != dimensionPixelSize3) {
            dVar.f48264b = dimensionPixelSize3;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(8, 0);
        if (dVar.f48265c != color) {
            if ((color >> 24) == 0) {
                dVar.f48265c = -1;
            } else {
                dVar.f48265c = color;
            }
            WeakHashMap<View, S> weakHashMap2 = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(0, 0);
        if (dVar.f48266d != color2) {
            if ((color2 >> 24) == 0) {
                dVar.f48266d = -1;
            } else {
                dVar.f48266d = color2;
            }
            WeakHashMap<View, S> weakHashMap3 = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
        this.f48236E = new r(getContext(), dVar);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f48245h = dimensionPixelSize4;
        this.f48244g = dimensionPixelSize4;
        this.f48243f = dimensionPixelSize4;
        this.f48242e = dimensionPixelSize4;
        this.f48242e = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize4);
        this.f48243f = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize4);
        this.f48244g = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize4);
        this.f48245h = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(24, 2132017477);
        this.f48246j = resourceId;
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, C4353a.f37897w);
        try {
            this.f48248l = typedArrayObtainStyledAttributes3.getColorStateList(3);
            typedArrayObtainStyledAttributes3.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(25)) {
                this.f48248l = typedArrayObtainStyledAttributes.getColorStateList(25);
            }
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                this.f48248l = k(this.f48248l.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(23, 0));
            }
            this.f48251o = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.f48252p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f48258v = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f48260x = typedArrayObtainStyledAttributes.getInt(15, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.f48253q = getResources().getDimensionPixelSize(R.dimen.tab_scrollable_min_width);
            i();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes3.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.f48250n;
    }

    private int getTabMinWidth() {
        int i = this.f48251o;
        if (i != -1) {
            return i;
        }
        if (this.f48260x == 0) {
            return this.f48253q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f48241d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList k(int i, int i10) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i10, i});
    }

    private void setSelectedTabView(int i) {
        d dVar = this.f48241d;
        int childCount = dVar.getChildCount();
        int iC = dVar.c(i);
        if (iC >= childCount || dVar.getChildAt(iC).isSelected()) {
            return;
        }
        int i10 = 0;
        while (i10 < childCount) {
            dVar.getChildAt(i10).setSelected(i10 == iC);
            i10++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        g(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f48257u.a(motionEvent);
        return zDispatchTouchEvent;
    }

    public final void f(f fVar, boolean z10) {
        if (fVar.f48288c != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        v vVar = fVar.f48289d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        d dVar = this.f48241d;
        dVar.addView(vVar, layoutParams);
        int childCount = dVar.getChildCount() - 1;
        r rVar = this.f48236E;
        if (rVar.f48322c != null) {
            d dVar2 = rVar.f48321b;
            if (dVar2.getChildCount() != 1) {
                if (childCount == 0) {
                    dVar2.addView(rVar.a(), 1);
                } else {
                    dVar2.addView(rVar.a(), childCount);
                }
            }
        }
        if (z10) {
            vVar.setSelected(true);
        }
        ArrayList<f> arrayList = this.f48239b;
        int size = arrayList.size();
        fVar.f48287b = size;
        arrayList.add(size, fVar);
        int size2 = arrayList.size();
        for (int i = size + 1; i < size2; i++) {
            arrayList.get(i).f48287b = i;
        }
        if (z10) {
            e eVar = fVar.f48288c;
            if (eVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            eVar.p(fVar, true);
        }
    }

    public final void g(View view) {
        if (!(view instanceof o)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        f fVarM = m();
        ((o) view).getClass();
        f(fVarM, this.f48239b.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public g getPageChangeListener() {
        if (this.f48235D == null) {
            this.f48235D = new g(this);
        }
        return this.f48235D;
    }

    public int getSelectedTabPosition() {
        f fVar = this.f48240c;
        if (fVar != null) {
            return fVar.f48287b;
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.f48248l.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public int getTabCount() {
        return this.f48239b.size();
    }

    public int getTabMode() {
        return this.f48260x;
    }

    public ColorStateList getTabTextColors() {
        return this.f48248l;
    }

    public final void h(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C6.r.c(this)) {
            d dVar = this.f48241d;
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (dVar.getChildAt(i10).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iJ = j(0.0f, i);
            if (scrollX != iJ) {
                if (this.f48262z == null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(new int[0]);
                    this.f48262z = valueAnimatorOfInt;
                    valueAnimatorOfInt.setInterpolator(f48230H);
                    this.f48262z.setDuration(this.i);
                    this.f48262z.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.d
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            e eVar = this.f48229a;
                            eVar.getClass();
                            eVar.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                        }
                    });
                }
                this.f48262z.setIntValues(scrollX, iJ);
                this.f48262z.start();
            }
            dVar.a(i, this.i);
            return;
        }
        r(0.0f, i);
    }

    public final void i() {
        int iMax;
        int iMax2;
        if (this.f48260x == 0) {
            iMax = Math.max(0, this.f48258v - this.f48242e);
            iMax2 = Math.max(0, this.f48259w - this.f48244g);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        d dVar = this.f48241d;
        dVar.setPaddingRelative(iMax, 0, iMax2, 0);
        if (this.f48260x != 1) {
            dVar.setGravity(8388611);
        } else {
            dVar.setGravity(1);
        }
        for (int i = 0; i < dVar.getChildCount(); i++) {
            View childAt = dVar.getChildAt(i);
            if (childAt instanceof v) {
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
                childAt.requestLayout();
            }
        }
    }

    public final int j(float f10, int i) {
        int width;
        int width2;
        if (this.f48260x == 0) {
            d dVar = this.f48241d;
            View childAt = dVar.getChildAt(dVar.c(i));
            if (childAt != null) {
                int width3 = childAt.getWidth();
                if (this.f48255s) {
                    width = childAt.getLeft();
                    width2 = this.f48256t;
                } else {
                    int i10 = i + 1;
                    width = (childAt.getWidth() / 2) + childAt.getLeft() + ((int) ((width3 + ((i10 < dVar.getChildCount() ? dVar.getChildAt(i10) : null) != null ? r7.getWidth() : 0)) * f10 * 0.5f));
                    width2 = getWidth() / 2;
                }
                return width - width2;
            }
        }
        return 0;
    }

    public v l(Context context) {
        return new v(context);
    }

    public final f m() {
        f fVar = (f) f48231I.a();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f48288c = this;
        v vVarL = (v) this.f48238G.a();
        if (vVarL == null) {
            vVarL = l(getContext());
            int i = this.f48244g;
            int i10 = this.f48245h;
            int i11 = this.f48242e;
            int i12 = this.f48243f;
            vVarL.getClass();
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            vVarL.setPaddingRelative(i11, i12, i, i10);
            vVarL.f48335k = this.f48247k;
            vVarL.f48337m = this.f48246j;
            if (!vVarL.isSelected()) {
                vVarL.setTextAppearance(vVarL.getContext(), vVarL.f48337m);
            }
            vVarL.setInputFocusTracker(this.f48237F);
            vVarL.setTextColorList(this.f48248l);
            vVarL.setBoldTextOnSelection(this.f48249m);
            vVarL.setEllipsizeEnabled(this.f48254r);
            vVarL.setMaxWidthProvider(new B.d(this, 29));
            vVarL.setOnUpdateListener(new D7.c(this, 25));
        }
        vVarL.setTab(fVar);
        vVarL.setFocusable(true);
        vVarL.setMinimumWidth(getTabMinWidth());
        fVar.f48289d = vVarL;
        return fVar;
    }

    public final void n() {
        int currentItem;
        o();
        androidx.viewpager.widget.a aVar = this.f48233B;
        if (aVar == null) {
            o();
            return;
        }
        int count = aVar.getCount();
        for (int i = 0; i < count; i++) {
            f fVarM = m();
            fVarM.f48286a = this.f48233B.getPageTitle(i);
            v vVar = fVarM.f48289d;
            if (vVar != null) {
                f fVar = vVar.f48342r;
                vVar.setText(fVar == null ? null : fVar.f48286a);
                v.b bVar = vVar.f48341q;
                if (bVar != null) {
                    ((e) ((D7.c) bVar).f1075c).getClass();
                }
            }
            f(fVarM, false);
        }
        ViewPager viewPager = this.f48232A;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        p(this.f48239b.get(currentItem), true);
    }

    public final void o() {
        ArrayList<f> arrayList = this.f48239b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = this.f48241d;
            v vVar = (v) dVar.getChildAt(size);
            int iC = dVar.c(size);
            dVar.removeViewAt(iC);
            r rVar = this.f48236E;
            if (rVar.f48322c != null) {
                d dVar2 = rVar.f48321b;
                if (dVar2.getChildCount() != 0) {
                    if (iC == 0) {
                        dVar2.removeViewAt(0);
                    } else {
                        dVar2.removeViewAt(iC - 1);
                    }
                }
            }
            if (vVar != null) {
                vVar.setTab(null);
                vVar.setSelected(false);
                this.f48238G.c(vVar);
            }
            requestLayout();
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f48288c = null;
            next.f48289d = null;
            next.f48286a = null;
            next.f48287b = -1;
            f48231I.c(next);
        }
        this.f48240c = null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    public final void onMeasure(int i, int i10) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + C0713c.C(44, getResources().getDisplayMetrics());
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i10)), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iC = this.f48252p;
            if (iC <= 0) {
                iC = size - C0713c.C(56, getResources().getDisplayMetrics());
            }
            this.f48250n = iC;
        }
        super.onMeasure(i, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f48260x != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i10, boolean z10, boolean z11) {
        super.onOverScrolled(i, i10, z10, z11);
        o7.c cVar = this.f48257u;
        if (cVar.f44874b && z10) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.d.f(cVar.f44873a, 0, 0, 1, 0, null);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i10, int i11, int i12) {
        super.onScrollChanged(i, i10, i11, i12);
        this.f48257u.f44874b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        f fVar;
        int i13;
        super.onSizeChanged(i, i10, i11, i12);
        if (i11 == 0 || i11 == i || (fVar = this.f48240c) == null || (i13 = fVar.f48287b) == -1) {
            return;
        }
        r(0.0f, i13);
    }

    public final void p(f fVar, boolean z10) {
        c cVar;
        f fVar2 = this.f48240c;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                c cVar2 = this.f48261y;
                if (cVar2 != null) {
                    cVar2.a(fVar2);
                }
                h(fVar.f48287b);
                return;
            }
            return;
        }
        if (z10) {
            int i = fVar != null ? fVar.f48287b : -1;
            if (i != -1) {
                setSelectedTabView(i);
            }
            f fVar3 = this.f48240c;
            if ((fVar3 == null || fVar3.f48287b == -1) && i != -1) {
                r(0.0f, i);
            } else {
                h(i);
            }
        }
        this.f48240c = fVar;
        if (fVar == null || (cVar = this.f48261y) == null) {
            return;
        }
        cVar.b(fVar);
    }

    public final void q(androidx.viewpager.widget.a aVar) {
        C0560e c0560e;
        androidx.viewpager.widget.a aVar2 = this.f48233B;
        if (aVar2 != null && (c0560e = this.f48234C) != null) {
            aVar2.unregisterDataSetObserver(c0560e);
        }
        this.f48233B = aVar;
        if (aVar != null) {
            if (this.f48234C == null) {
                this.f48234C = new C0560e();
            }
            aVar.registerDataSetObserver(this.f48234C);
        }
        n();
    }

    public final void r(float f10, int i) {
        int iRound = Math.round(i + f10);
        if (iRound >= 0) {
            d dVar = this.f48241d;
            if (iRound >= dVar.getChildCount()) {
                return;
            }
            ValueAnimator valueAnimator = dVar.f48275n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                dVar.f48275n.cancel();
            }
            dVar.f48267e = i;
            dVar.f48268f = f10;
            dVar.e();
            dVar.f();
            ValueAnimator valueAnimator2 = this.f48262z;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f48262z.cancel();
            }
            scrollTo(j(f10, i), 0);
            setSelectedTabView(iRound);
        }
    }

    public final void s(Bitmap bitmap, int i, int i10) {
        r rVar = this.f48236E;
        rVar.getClass();
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        rVar.f48322c = bitmap;
        rVar.f48323d = i10;
        rVar.f48324e = i;
        d dVar = rVar.f48321b;
        if (dVar.f48281t) {
            for (int childCount = dVar.getChildCount() - 1; childCount > 0; childCount -= 2) {
                dVar.removeViewAt(childCount);
            }
        }
        if (dVar.f48281t) {
            dVar.f48281t = false;
            dVar.f();
            dVar.e();
        }
        if (rVar.f48322c != null) {
            int childCount2 = dVar.getChildCount();
            for (int i11 = 1; i11 < childCount2; i11++) {
                dVar.addView(rVar.a(), (i11 * 2) - 1);
            }
            if (!dVar.f48281t) {
                dVar.f48281t = true;
                dVar.f();
                dVar.e();
            }
        }
    }

    public void setAnimationDuration(long j4) {
        this.i = j4;
    }

    public void setAnimationType(b bVar) {
        d dVar = this.f48241d;
        if (dVar.f48284w != bVar) {
            dVar.f48284w = bVar;
            ValueAnimator valueAnimator = dVar.f48275n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            dVar.f48275n.cancel();
        }
    }

    public void setFocusTracker(T6.b bVar) {
        this.f48237F = bVar;
    }

    public void setOnTabSelectedListener(c cVar) {
        this.f48261y = cVar;
    }

    public void setSelectedTabIndicatorColor(int i) {
        d dVar = this.f48241d;
        if (dVar.f48265c != i) {
            if ((i >> 24) == 0) {
                dVar.f48265c = -1;
            } else {
                dVar.f48265c = i;
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabBackgroundColor(int i) {
        d dVar = this.f48241d;
        if (dVar.f48266d != i) {
            if ((i >> 24) == 0) {
                dVar.f48266d = -1;
            } else {
                dVar.f48266d = i;
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabIndicatorCornersRadii(float[] fArr) {
        d dVar = this.f48241d;
        if (Arrays.equals(dVar.f48271j, fArr)) {
            return;
        }
        dVar.f48271j = fArr;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        dVar.postInvalidateOnAnimation();
    }

    public void setTabIndicatorHeight(int i) {
        d dVar = this.f48241d;
        if (dVar.f48264b != i) {
            dVar.f48264b = i;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabItemSpacing(int i) {
        d dVar = this.f48241d;
        if (i != dVar.f48269g) {
            dVar.f48269g = i;
            int childCount = dVar.getChildCount();
            for (int i10 = 1; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams.leftMargin = dVar.f48269g;
                dVar.updateViewLayout(childAt, marginLayoutParams);
            }
        }
    }

    public void setTabMode(int i) {
        if (i != this.f48260x) {
            this.f48260x = i;
            i();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f48248l != colorStateList) {
            this.f48248l = colorStateList;
            ArrayList<f> arrayList = this.f48239b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                v vVar = arrayList.get(i).f48289d;
                if (vVar != null) {
                    vVar.setTextColorList(this.f48248l);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z10) {
        int i = 0;
        while (true) {
            ArrayList<f> arrayList = this.f48239b;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).f48289d.setEnabled(z10);
            i++;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        g gVar;
        ViewPager viewPager2 = this.f48232A;
        if (viewPager2 != null && (gVar = this.f48235D) != null) {
            viewPager2.removeOnPageChangeListener(gVar);
        }
        if (viewPager == null) {
            this.f48232A = null;
            setOnTabSelectedListener(null);
            q(null);
            return;
        }
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f48232A = viewPager;
        if (this.f48235D == null) {
            this.f48235D = new g(this);
        }
        g gVar2 = this.f48235D;
        gVar2.f48292c = 0;
        gVar2.f48291b = 0;
        viewPager.addOnPageChangeListener(gVar2);
        setOnTabSelectedListener(new h(viewPager));
        q(adapter);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        g(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    /* compiled from: BaseIndicatorTabLayout.java */
    public static class h implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f48293a;

        public h(ViewPager viewPager) {
            this.f48293a = viewPager;
        }

        @Override // y7.e.c
        public final void b(f fVar) throws Resources.NotFoundException {
            this.f48293a.setCurrentItem(fVar.f48287b);
        }

        @Override // y7.e.c
        public final void a(f fVar) {
        }
    }
}
