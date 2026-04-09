package k3;

import C9.r;
import H6.C0680q;
import K6.C0749p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import b9.C1992A;
import c9.C2097r;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import kotlin.jvm.internal.m;
import l3.C5280a;
import p9.l;
import p9.p;
import p9.q;

/* compiled from: Gauge.kt */
/* loaded from: classes.dex */
public abstract class c extends View implements Observer {

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f43303A;

    /* renamed from: B, reason: collision with root package name */
    public C5280a f43304B;

    /* renamed from: C, reason: collision with root package name */
    public float f43305C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f43306D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f43307E;

    /* renamed from: F, reason: collision with root package name */
    public float f43308F;

    /* renamed from: G, reason: collision with root package name */
    public float f43309G;

    /* renamed from: H, reason: collision with root package name */
    public Locale f43310H;

    /* renamed from: I, reason: collision with root package name */
    public float f43311I;

    /* renamed from: J, reason: collision with root package name */
    public float f43312J;

    /* renamed from: K, reason: collision with root package name */
    public a f43313K;

    /* renamed from: L, reason: collision with root package name */
    public float f43314L;

    /* renamed from: M, reason: collision with root package name */
    public float f43315M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f43316N;

    /* renamed from: O, reason: collision with root package name */
    public Bitmap f43317O;

    /* renamed from: P, reason: collision with root package name */
    public Canvas f43318P;

    /* renamed from: Q, reason: collision with root package name */
    public l<? super Float, ? extends CharSequence> f43319Q;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f43320b;

    /* renamed from: c, reason: collision with root package name */
    public TextPaint f43321c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f43322d;

    /* renamed from: e, reason: collision with root package name */
    public final TextPaint f43323e;

    /* renamed from: f, reason: collision with root package name */
    public String f43324f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43325g;

    /* renamed from: h, reason: collision with root package name */
    public float f43326h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f43327j;

    /* renamed from: k, reason: collision with root package name */
    public int f43328k;

    /* renamed from: l, reason: collision with root package name */
    public float f43329l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43330m;

    /* renamed from: n, reason: collision with root package name */
    public float f43331n;

    /* renamed from: o, reason: collision with root package name */
    public int f43332o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f43333p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f43334q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f43335r;

    /* renamed from: s, reason: collision with root package name */
    public q<? super c, ? super Boolean, ? super Boolean, C1992A> f43336s;

    /* renamed from: t, reason: collision with root package name */
    public p<? super C5280a, ? super C5280a, C1992A> f43337t;

    /* renamed from: u, reason: collision with root package name */
    public final L1.e f43338u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f43339v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f43340w;

    /* renamed from: x, reason: collision with root package name */
    public int f43341x;

    /* renamed from: y, reason: collision with root package name */
    public int f43342y;

    /* renamed from: z, reason: collision with root package name */
    public int f43343z;

    /* compiled from: Gauge.kt */
    public enum a {
        TOP_LEFT(0.0f, 0.0f, 0.0f, 0.0f, 1, 1),
        TOP_CENTER(0.5f, 0.0f, 0.5f, 0.0f, 0, 1),
        TOP_RIGHT(1.0f, 0.0f, 1.0f, 0.0f, -1, 1),
        LEFT(0.0f, 0.5f, 0.0f, 0.5f, 1, 0),
        CENTER(0.5f, 0.5f, 0.5f, 0.5f, 0, 0),
        RIGHT(1.0f, 0.5f, 1.0f, 0.5f, -1, 0),
        BOTTOM_LEFT(0.0f, 1.0f, 0.0f, 1.0f, 1, -1),
        BOTTOM_CENTER(0.5f, 1.0f, 0.5f, 1.0f, 0, -1),
        BOTTOM_RIGHT(1.0f, 1.0f, 1.0f, 1.0f, -1, -1);

        private final float height;
        private final int paddingH;
        private final int paddingV;
        private final float width;

        /* renamed from: x, reason: collision with root package name */
        private final float f43344x;

        /* renamed from: y, reason: collision with root package name */
        private final float f43345y;

        a(float f10, float f11, float f12, float f13, int i, int i10) {
            this.f43344x = f10;
            this.f43345y = f11;
            this.width = f12;
            this.height = f13;
            this.paddingH = i;
            this.paddingV = i10;
        }

        public final float getHeight$speedviewlib_release() {
            return this.height;
        }

        public final int getPaddingH$speedviewlib_release() {
            return this.paddingH;
        }

        public final int getPaddingV$speedviewlib_release() {
            return this.paddingV;
        }

        public final float getWidth$speedviewlib_release() {
            return this.width;
        }

        public final float getX$speedviewlib_release() {
            return this.f43344x;
        }

        public final float getY$speedviewlib_release() {
            return this.f43345y;
        }
    }

    /* compiled from: Gauge.kt */
    public static final class b extends m implements l<C5280a, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f43346g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10) {
            super(1);
            this.f43346g = f10;
        }

        @Override // p9.l
        public final C1992A invoke(C5280a c5280a) {
            C5280a it = c5280a;
            kotlin.jvm.internal.l.f(it, "it");
            it.f43749c = this.f43346g;
            c cVar = it.f43748b;
            if (cVar != null) {
                cVar.l();
            }
            return C1992A.f18074a;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f43320b = new Paint(1);
        this.f43321c = new TextPaint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f43322d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f43323e = textPaint2;
        this.f43324f = "Km/h";
        this.f43325g = true;
        this.i = 100.0f;
        this.f43327j = getMinSpeed();
        this.f43329l = getMinSpeed();
        this.f43331n = 4.0f;
        this.f43332o = 1000;
        e eVar = (e) this;
        this.f43338u = new L1.e(eVar, 1);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
        kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.f43339v = bitmapCreateBitmap;
        this.f43340w = new Paint(1);
        ArrayList<C5280a> arrayList = new ArrayList();
        this.f43303A = arrayList;
        this.f43305C = j(30.0f);
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.l.e(locale, "getDefault()");
        this.f43310H = locale;
        this.f43311I = 0.1f;
        this.f43312J = 0.1f;
        this.f43313K = a.BOTTOM_CENTER;
        this.f43314L = j(1.0f);
        this.f43315M = j(20.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, config);
        kotlin.jvm.internal.l.e(bitmapCreateBitmap2, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.f43317O = bitmapCreateBitmap2;
        this.f43319Q = new C0680q(eVar, 7);
        this.f43321c.setColor(-16777216);
        this.f43321c.setTextSize(j(10.0f));
        this.f43321c.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-16777216);
        textPaint.setTextSize(j(18.0f));
        textPaint2.setColor(-16777216);
        textPaint2.setTextSize(j(15.0f));
        float f10 = 0.6f;
        C5280a c5280a = new C5280a(0.0f, f10, getSpeedometerWidth(), -16711936);
        c5280a.a(this);
        arrayList.add(c5280a);
        float f11 = 0.87f;
        C5280a c5280a2 = new C5280a(f10, f11, getSpeedometerWidth(), -256);
        c5280a2.a(this);
        arrayList.add(c5280a2);
        C5280a c5280a3 = new C5280a(f11, 1.0f, getSpeedometerWidth(), -65536);
        c5280a3.a(this);
        arrayList.add(c5280a3);
        i();
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.f43347a, 0, 0);
        kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl… R.styleable.Gauge, 0, 0)");
        setMaxSpeed(typedArrayObtainStyledAttributes.getFloat(2, getMaxSpeed()));
        setMinSpeed(typedArrayObtainStyledAttributes.getFloat(3, getMinSpeed()));
        this.f43327j = getMinSpeed();
        setCurrentSpeed(getMinSpeed());
        setSpeedometerWidth(typedArrayObtainStyledAttributes.getDimension(10, getSpeedometerWidth()));
        for (C5280a c5280a4 : arrayList) {
            c5280a4.f43749c = getSpeedometerWidth();
            c cVar = c5280a4.f43748b;
            if (cVar != null) {
                cVar.l();
            }
        }
        setWithTremble(typedArrayObtainStyledAttributes.getBoolean(22, this.f43325g));
        TextPaint textPaint3 = this.f43321c;
        textPaint3.setColor(typedArrayObtainStyledAttributes.getColor(11, textPaint3.getColor()));
        TextPaint textPaint4 = this.f43321c;
        textPaint4.setTextSize(typedArrayObtainStyledAttributes.getDimension(13, textPaint4.getTextSize()));
        TextPaint textPaint5 = this.f43322d;
        textPaint5.setColor(typedArrayObtainStyledAttributes.getColor(4, textPaint5.getColor()));
        textPaint5.setTextSize(typedArrayObtainStyledAttributes.getDimension(8, textPaint5.getTextSize()));
        TextPaint textPaint6 = this.f43323e;
        textPaint6.setColor(typedArrayObtainStyledAttributes.getColor(19, textPaint6.getColor()));
        textPaint6.setTextSize(typedArrayObtainStyledAttributes.getDimension(20, textPaint6.getTextSize()));
        String string = typedArrayObtainStyledAttributes.getString(17);
        setUnit(string == null ? this.f43324f : string);
        setTrembleDegree(typedArrayObtainStyledAttributes.getFloat(15, this.f43331n));
        setTrembleDuration(typedArrayObtainStyledAttributes.getInt(16, this.f43332o));
        setSpeedometerTextRightToLeft(typedArrayObtainStyledAttributes.getBoolean(12, this.f43306D));
        setAccelerate(typedArrayObtainStyledAttributes.getFloat(0, this.f43311I));
        setDecelerate(typedArrayObtainStyledAttributes.getFloat(1, this.f43312J));
        setUnitUnderSpeedText(typedArrayObtainStyledAttributes.getBoolean(21, this.f43316N));
        setUnitSpeedInterval(typedArrayObtainStyledAttributes.getDimension(18, this.f43314L));
        setSpeedTextPadding(typedArrayObtainStyledAttributes.getDimension(6, this.f43315M));
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        if (string2 != null && !isInEditMode()) {
            setSpeedTextTypeface(Typeface.createFromAsset(context.getAssets(), string2));
        }
        String string3 = typedArrayObtainStyledAttributes.getString(14);
        if (string3 != null && !isInEditMode()) {
            setTextTypeface(Typeface.createFromAsset(context.getAssets(), string3));
        }
        int i = typedArrayObtainStyledAttributes.getInt(7, -1);
        if (i != -1) {
            setSpeedTextPosition(a.values()[i]);
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i10 == 0) {
            setSpeedTextListener(new r(eVar, 9));
        } else if (i10 == 1) {
            setSpeedTextListener(new C0749p(eVar, 8));
        }
        typedArrayObtainStyledAttributes.recycle();
        e();
        f();
        h();
    }

    public static void a(c this$0, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.f43330m = ((Float) animatedValue).floatValue() > this$0.getCurrentSpeed();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        if (animatedValue2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.setCurrentSpeed(((Float) animatedValue2).floatValue());
        this$0.postInvalidate();
    }

    public static void b(c this$0, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.setCurrentSpeed(((Float) animatedValue).floatValue());
        this$0.postInvalidate();
    }

    private final float getSpeedUnitTextHeight() {
        boolean z10 = this.f43316N;
        TextPaint textPaint = this.f43323e;
        TextPaint textPaint2 = this.f43322d;
        if (!z10) {
            return Math.max(textPaint2.getTextSize(), textPaint.getTextSize());
        }
        return textPaint.getTextSize() + textPaint2.getTextSize() + this.f43314L;
    }

    private final float getSpeedUnitTextWidth() {
        boolean z10 = this.f43316N;
        TextPaint textPaint = this.f43323e;
        TextPaint textPaint2 = this.f43322d;
        if (z10) {
            return Math.max(textPaint2.measureText(getSpeedText().toString()), textPaint.measureText(this.f43324f));
        }
        return textPaint.measureText(this.f43324f) + textPaint2.measureText(getSpeedText().toString()) + this.f43314L;
    }

    private final void setCurrentSpeed(float f10) {
        this.f43329l = f10;
        int i = (int) f10;
        if (i != this.f43328k && this.f43336s != null) {
            ValueAnimator valueAnimator = this.f43334q;
            boolean z10 = valueAnimator != null && valueAnimator.isRunning();
            boolean z11 = i > this.f43328k;
            int i10 = z11 ? 1 : -1;
            while (true) {
                int i11 = this.f43328k;
                if (i11 == i) {
                    break;
                }
                this.f43328k = i11 + i10;
                q<? super c, ? super Boolean, ? super Boolean, C1992A> qVar = this.f43336s;
                kotlin.jvm.internal.l.c(qVar);
                qVar.invoke(this, Boolean.valueOf(z11), Boolean.valueOf(z10));
            }
        }
        this.f43328k = i;
        g();
    }

    private final void setSpeedTextPadding(float f10) {
        this.f43315M = f10;
        if (this.f43307E) {
            invalidate();
        }
    }

    private final void setUnitSpeedInterval(float f10) {
        this.f43314L = f10;
        l();
    }

    public final void c() {
        this.f43335r = true;
        ValueAnimator valueAnimator = this.f43333p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f43335r = false;
        d();
    }

    public final void d() {
        this.f43335r = true;
        ValueAnimator valueAnimator = this.f43334q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f43335r = false;
        this.f43334q = null;
    }

    public final void e() {
        float f10 = this.f43311I;
        if (!(f10 <= 1.0f && f10 > 0.0f)) {
            throw new IllegalArgumentException("accelerate must be between (0, 1]");
        }
    }

    public final void f() {
        float f10 = this.f43312J;
        if (!(f10 <= 1.0f && f10 > 0.0f)) {
            throw new IllegalArgumentException("decelerate must be between (0, 1]");
        }
    }

    public final void g() {
        C5280a c5280a;
        Iterator it = this.f43303A.iterator();
        while (true) {
            if (!it.hasNext()) {
                c5280a = null;
                break;
            }
            c5280a = (C5280a) it.next();
            if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * c5280a.f43751e) <= getCurrentSpeed()) {
                if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * c5280a.f43752f) >= getCurrentSpeed()) {
                    break;
                }
            }
        }
        C5280a c5280a2 = this.f43304B;
        if (c5280a2 != c5280a) {
            p<? super C5280a, ? super C5280a, C1992A> pVar = this.f43337t;
            if (pVar != null) {
                pVar.invoke(c5280a2, c5280a);
            }
            this.f43304B = c5280a;
        }
    }

    public final float getAccelerate() {
        return this.f43311I;
    }

    public final Bitmap getBackgroundBitmap() {
        return this.f43339v;
    }

    public final int getCurrentIntSpeed() {
        return this.f43328k;
    }

    public final C5280a getCurrentSection() {
        return this.f43304B;
    }

    public final float getCurrentSpeed() {
        return this.f43329l;
    }

    public final float getDecelerate() {
        return this.f43312J;
    }

    public final int getHeightPa() {
        return this.f43343z;
    }

    public final Locale getLocale() {
        return this.f43310H;
    }

    public final float getMaxSpeed() {
        return this.i;
    }

    public final float getMinSpeed() {
        return this.f43326h;
    }

    public final float getOffsetSpeed() {
        return (this.f43329l - getMinSpeed()) / (getMaxSpeed() - getMinSpeed());
    }

    public final p<C5280a, C5280a, C1992A> getOnSectionChangeListener() {
        return this.f43337t;
    }

    public final q<c, Boolean, Boolean, C1992A> getOnSpeedChangeListener() {
        return this.f43336s;
    }

    public final int getPadding() {
        return this.f43341x;
    }

    public final float getPercentSpeed() {
        return ((this.f43329l - getMinSpeed()) * 100.0f) / (getMaxSpeed() - getMinSpeed());
    }

    public final List<C5280a> getSections() {
        return this.f43303A;
    }

    public final float getSpeed() {
        return this.f43327j;
    }

    public final CharSequence getSpeedText() {
        return this.f43319Q.invoke(Float.valueOf(this.f43329l));
    }

    public final int getSpeedTextColor() {
        return this.f43322d.getColor();
    }

    public final l<Float, CharSequence> getSpeedTextListener() {
        return this.f43319Q;
    }

    public final a getSpeedTextPosition() {
        return this.f43313K;
    }

    public final float getSpeedTextSize() {
        return this.f43322d.getTextSize();
    }

    public final Typeface getSpeedTextTypeface() {
        return this.f43322d.getTypeface();
    }

    public final RectF getSpeedUnitTextBounds() {
        float paddingH$speedviewlib_release = (this.f43315M * this.f43313K.getPaddingH$speedviewlib_release()) + ((((this.f43313K.getX$speedviewlib_release() * this.f43342y) - this.f43308F) + this.f43341x) - (this.f43313K.getWidth$speedviewlib_release() * getSpeedUnitTextWidth()));
        float paddingV$speedviewlib_release = (this.f43315M * this.f43313K.getPaddingV$speedviewlib_release()) + ((((this.f43313K.getY$speedviewlib_release() * this.f43343z) - this.f43309G) + this.f43341x) - (this.f43313K.getHeight$speedviewlib_release() * getSpeedUnitTextHeight()));
        return new RectF(paddingH$speedviewlib_release, paddingV$speedviewlib_release, getSpeedUnitTextWidth() + paddingH$speedviewlib_release, getSpeedUnitTextHeight() + paddingV$speedviewlib_release);
    }

    public final boolean getSpeedometerTextRightToLeft() {
        return this.f43306D;
    }

    public float getSpeedometerWidth() {
        return this.f43305C;
    }

    public final int getTextColor() {
        return this.f43321c.getColor();
    }

    public final TextPaint getTextPaint() {
        return this.f43321c;
    }

    public final float getTextSize() {
        return this.f43321c.getTextSize();
    }

    public final Typeface getTextTypeface() {
        return this.f43321c.getTypeface();
    }

    public final float getTranslatedDx() {
        return this.f43308F;
    }

    public final float getTranslatedDy() {
        return this.f43309G;
    }

    public final float getTrembleDegree() {
        return this.f43331n;
    }

    public final int getTrembleDuration() {
        return this.f43332o;
    }

    public final String getUnit() {
        return this.f43324f;
    }

    public final int getUnitTextColor() {
        return this.f43323e.getColor();
    }

    public final float getUnitTextSize() {
        return this.f43323e.getTextSize();
    }

    public final boolean getUnitUnderSpeedText() {
        return this.f43316N;
    }

    public final int getViewSize() {
        return Math.max(getWidth(), getHeight());
    }

    public final int getViewSizePa() {
        return Math.max(this.f43342y, this.f43343z);
    }

    public final int getWidthPa() {
        return this.f43342y;
    }

    public final boolean getWithTremble() {
        return this.f43325g;
    }

    public final void h() {
        if (!(this.f43331n >= 0.0f)) {
            throw new IllegalArgumentException("trembleDegree  can't be Negative");
        }
        if (!(this.f43332o >= 0)) {
            throw new IllegalArgumentException("trembleDuration  can't be Negative");
        }
    }

    public abstract void i();

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f43307E;
    }

    public final float j(float f10) {
        return f10 * getContext().getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ValueAnimator valueAnimator = this.f43334q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d();
        }
    }

    public final void k(Canvas canvas) {
        float width;
        float fMeasureText;
        RectF speedUnitTextBounds = getSpeedUnitTextBounds();
        String string = getSpeedText().toString();
        this.f43317O.eraseColor(0);
        boolean z10 = this.f43316N;
        TextPaint textPaint = this.f43322d;
        TextPaint textPaint2 = this.f43323e;
        if (z10) {
            Canvas canvas2 = this.f43318P;
            if (canvas2 != null) {
                canvas2.drawText(string, this.f43317O.getWidth() * 0.5f, (this.f43317O.getHeight() * 0.5f) - (this.f43314L * 0.5f), textPaint);
            }
            Canvas canvas3 = this.f43318P;
            if (canvas3 != null) {
                canvas3.drawText(this.f43324f, this.f43317O.getWidth() * 0.5f, (this.f43314L * 0.5f) + textPaint2.getTextSize() + (this.f43317O.getHeight() * 0.5f), textPaint2);
            }
        } else {
            if (this.f43306D) {
                fMeasureText = (this.f43317O.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                width = textPaint2.measureText(this.f43324f) + fMeasureText + this.f43314L;
            } else {
                width = (this.f43317O.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                fMeasureText = textPaint.measureText(string) + width + this.f43314L;
            }
            float speedUnitTextHeight = (getSpeedUnitTextHeight() * 0.5f) + (this.f43317O.getHeight() * 0.5f);
            Canvas canvas4 = this.f43318P;
            if (canvas4 != null) {
                canvas4.drawText(string, width, speedUnitTextHeight, textPaint);
            }
            Canvas canvas5 = this.f43318P;
            if (canvas5 != null) {
                canvas5.drawText(this.f43324f, fMeasureText, speedUnitTextHeight, textPaint2);
            }
        }
        canvas.drawBitmap(this.f43317O, (speedUnitTextBounds.width() * 0.5f) + (speedUnitTextBounds.left - (r1.getWidth() * 0.5f)), (speedUnitTextBounds.height() * 0.5f) + (speedUnitTextBounds.top - (this.f43317O.getHeight() * 0.5f)), this.f43320b);
    }

    public final void l() {
        if (this.f43307E) {
            o();
            invalidate();
        }
    }

    public final void m(float f10, float f11) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("minSpeed must be smaller than maxSpeed !!");
        }
        c();
        this.f43326h = f10;
        this.i = f11;
        g();
        l();
        if (this.f43307E) {
            setSpeedAt(this.f43327j);
        }
    }

    public final void n() {
        float minSpeed;
        float f10;
        int i = 0;
        d();
        if (this.f43325g) {
            Random random = new Random();
            float fNextFloat = random.nextFloat() * this.f43331n * (random.nextBoolean() ? -1 : 1);
            if (this.f43327j + fNextFloat <= getMaxSpeed()) {
                if (this.f43327j + fNextFloat < getMinSpeed()) {
                    minSpeed = getMinSpeed();
                    f10 = this.f43327j;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43329l, this.f43327j + fNextFloat);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.setDuration(getTrembleDuration());
                valueAnimatorOfFloat.addUpdateListener(new C5215a(this, i));
                valueAnimatorOfFloat.addListener(this.f43338u);
                C1992A c1992a = C1992A.f18074a;
                this.f43334q = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
            }
            minSpeed = getMaxSpeed();
            f10 = this.f43327j;
            fNextFloat = minSpeed - f10;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f43329l, this.f43327j + fNextFloat);
            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat2.setDuration(getTrembleDuration());
            valueAnimatorOfFloat2.addUpdateListener(new C5215a(this, i));
            valueAnimatorOfFloat2.addListener(this.f43338u);
            C1992A c1992a2 = C1992A.f18074a;
            this.f43334q = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.start();
        }
    }

    public abstract void o();

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43307E = true;
        if (isInEditMode()) {
            return;
        }
        o();
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        this.f43307E = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        canvas.translate(this.f43308F, this.f43309G);
        canvas.drawBitmap(this.f43339v, 0.0f, 0.0f, this.f43340w);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i, i10, i11, i12);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int i14 = this.f43342y;
        if (i14 > 0 && (i13 = this.f43343z) > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i13, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(widthPa, he… Bitmap.Config.ARGB_8888)");
            this.f43317O = bitmapCreateBitmap;
        }
        this.f43318P = new Canvas(this.f43317O);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        ValueAnimator valueAnimator = this.f43333p;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.isRunning();
    }

    public final void p(int i, int i10, int i11, int i12) {
        this.f43341x = Math.max(Math.max(i, i11), Math.max(i10, i12));
        this.f43342y = getWidth() - (this.f43341x * 2);
        this.f43343z = getHeight() - (this.f43341x * 2);
    }

    public final void setAccelerate(float f10) {
        this.f43311I = f10;
        e();
    }

    public final void setBackgroundBitmap(Bitmap bitmap) {
        kotlin.jvm.internal.l.f(bitmap, "<set-?>");
        this.f43339v = bitmap;
    }

    public final void setDecelerate(float f10) {
        this.f43312J = f10;
        f();
    }

    public final void setLocale(Locale locale) {
        kotlin.jvm.internal.l.f(locale, "locale");
        this.f43310H = locale;
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setMaxSpeed(float f10) {
        m(getMinSpeed(), f10);
    }

    public final void setMinSpeed(float f10) {
        m(f10, getMaxSpeed());
    }

    public final void setOnSectionChangeListener(p<? super C5280a, ? super C5280a, C1992A> pVar) {
        this.f43337t = pVar;
    }

    public final void setOnSpeedChangeListener(q<? super c, ? super Boolean, ? super Boolean, C1992A> qVar) {
        this.f43336s = qVar;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
        p(i, i10, i11, i12);
        int i13 = this.f43341x;
        super.setPadding(i13, i13, i13, i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
        p(i, i10, i11, i12);
        int i13 = this.f43341x;
        super.setPaddingRelative(i13, i13, i13, i13);
    }

    public final void setSpeedAt(float f10) {
        if (f10 > getMaxSpeed()) {
            f10 = getMaxSpeed();
        } else if (f10 < getMinSpeed()) {
            f10 = getMinSpeed();
        }
        this.f43330m = f10 > this.f43329l;
        this.f43327j = f10;
        setCurrentSpeed(f10);
        c();
        invalidate();
        n();
    }

    public final void setSpeedTextColor(int i) {
        this.f43322d.setColor(i);
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setSpeedTextListener(l<? super Float, ? extends CharSequence> speedTextFormat) {
        kotlin.jvm.internal.l.f(speedTextFormat, "speedTextFormat");
        this.f43319Q = speedTextFormat;
        l();
    }

    public final void setSpeedTextPosition(a speedTextPosition) {
        kotlin.jvm.internal.l.f(speedTextPosition, "speedTextPosition");
        this.f43313K = speedTextPosition;
        l();
    }

    public final void setSpeedTextSize(float f10) {
        this.f43322d.setTextSize(f10);
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setSpeedTextTypeface(Typeface typeface) {
        this.f43322d.setTypeface(typeface);
        this.f43323e.setTypeface(typeface);
        l();
    }

    public final void setSpeedometerTextRightToLeft(boolean z10) {
        this.f43306D = z10;
        l();
    }

    public void setSpeedometerWidth(float f10) {
        this.f43305C = f10;
        b bVar = new b(f10);
        ArrayList arrayList = new ArrayList(getSections());
        ArrayList arrayList2 = this.f43303A;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C5280a) it.next()).f43748b = null;
        }
        arrayList2.clear();
        l();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C5280a it3 = (C5280a) it2.next();
            kotlin.jvm.internal.l.e(it3, "it");
            bVar.invoke(it3);
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C5280a c5280a = (C5280a) it4.next();
            c5280a.a(this);
            arrayList2.add(c5280a);
            int iIndexOf = arrayList2.indexOf(c5280a);
            float f11 = c5280a.f43751e;
            float f12 = c5280a.f43752f;
            if (f11 >= f12) {
                throw new IllegalArgumentException("endOffset must be bigger than startOffset");
            }
            C5280a c5280a2 = (C5280a) C2097r.r0(iIndexOf - 1, arrayList2);
            if (c5280a2 != null) {
                float f13 = c5280a2.f43752f;
                if (f13 > f11 || f13 >= f12) {
                    throw new IllegalArgumentException(C4356c.i(iIndexOf, "Section at index (", ") is conflicted with previous section").toString());
                }
            }
            C5280a c5280a3 = (C5280a) C2097r.r0(iIndexOf + 1, arrayList2);
            if (c5280a3 != null) {
                float f14 = c5280a3.f43751e;
                if (f14 < f12 || f14 <= f11) {
                    throw new IllegalArgumentException(C4356c.i(iIndexOf, "Section at index (", ") is conflicted with next section").toString());
                }
            }
        }
        l();
        if (this.f43307E) {
            l();
        }
    }

    public final void setTextColor(int i) {
        this.f43321c.setColor(i);
        l();
    }

    public final void setTextPaint(TextPaint textPaint) {
        kotlin.jvm.internal.l.f(textPaint, "<set-?>");
        this.f43321c = textPaint;
    }

    public final void setTextSize(float f10) {
        this.f43321c.setTextSize(f10);
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setTextTypeface(Typeface typeface) {
        this.f43321c.setTypeface(typeface);
        l();
    }

    public final void setTranslatedDx(float f10) {
        this.f43308F = f10;
    }

    public final void setTranslatedDy(float f10) {
        this.f43309G = f10;
    }

    public final void setTrembleDegree(float f10) {
        this.f43331n = f10;
        h();
    }

    public final void setTrembleDuration(int i) {
        this.f43332o = i;
        h();
    }

    public final void setUnit(String unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f43324f = unit;
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setUnitTextColor(int i) {
        this.f43323e.setColor(i);
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setUnitTextSize(float f10) {
        this.f43323e.setTextSize(f10);
        l();
    }

    public final void setUnitUnderSpeedText(boolean z10) {
        this.f43316N = z10;
        TextPaint textPaint = this.f43323e;
        TextPaint textPaint2 = this.f43322d;
        if (z10) {
            Paint.Align align = Paint.Align.CENTER;
            textPaint2.setTextAlign(align);
            textPaint.setTextAlign(align);
        } else {
            Paint.Align align2 = Paint.Align.LEFT;
            textPaint2.setTextAlign(align2);
            textPaint.setTextAlign(align2);
        }
        l();
    }

    public final void setWithTremble(boolean z10) {
        this.f43325g = z10;
        n();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        l();
    }
}
