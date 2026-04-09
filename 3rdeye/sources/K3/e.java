package k3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import b9.j;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l3.EnumC5281b;
import m3.AbstractC5321b;
import m3.C5320a;
import m3.C5322c;
import m3.C5323d;
import m3.h;
import m3.i;
import n3.AbstractC5355a;
import p9.p;

/* compiled from: Speedometer.kt */
/* loaded from: classes.dex */
public abstract class e extends c {

    /* renamed from: R, reason: collision with root package name */
    public AbstractC5321b<?> f43350R;

    /* renamed from: S, reason: collision with root package name */
    public final PointF f43351S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f43352T;

    /* renamed from: U, reason: collision with root package name */
    public int f43353U;

    /* renamed from: V, reason: collision with root package name */
    public final Paint f43354V;

    /* renamed from: W, reason: collision with root package name */
    public final Paint f43355W;

    /* renamed from: a0, reason: collision with root package name */
    public final Paint f43356a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Path f43357b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f43358c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f43359d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f43360e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f43361f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f43362g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f43363h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f43364i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList<AbstractC5355a<?>> f43365j0;

    /* renamed from: k0, reason: collision with root package name */
    public a f43366k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f43367l0;

    /* renamed from: m0, reason: collision with root package name */
    public List<Float> f43368m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f43369n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f43370o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f43371p0;

    /* renamed from: q0, reason: collision with root package name */
    public p<? super Integer, ? super Float, ? extends CharSequence> f43372q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f43373r0;

    /* compiled from: Speedometer.kt */
    public enum a {
        NORMAL(0, 720, false, 1, 1),
        LEFT(90, 270, true, 2, 1),
        TOP(180, 360, true, 1, 2),
        RIGHT(270, 450, true, 2, 1),
        BOTTOM(0, 180, true, 1, 2),
        TOP_LEFT(180, 270, false, 1, 1),
        TOP_RIGHT(270, 360, false, 1, 1),
        BOTTOM_RIGHT(0, 90, false, 1, 1),
        BOTTOM_LEFT(90, 180, false, 1, 1);

        private final int divHeight;
        private final int divWidth;
        private final boolean isHalf;
        private final int maxDegree;
        private final int minDegree;

        a(int i, int i10, boolean z10, int i11, int i12) {
            this.minDegree = i;
            this.maxDegree = i10;
            this.isHalf = z10;
            this.divWidth = i11;
            this.divHeight = i12;
        }

        public final int getDivHeight$speedviewlib_release() {
            return this.divHeight;
        }

        public final int getDivWidth$speedviewlib_release() {
            return this.divWidth;
        }

        public final int getMaxDegree$speedviewlib_release() {
            return this.maxDegree;
        }

        public final int getMinDegree$speedviewlib_release() {
            return this.minDegree;
        }

        public final boolean isBottom() {
            return this == BOTTOM || this == BOTTOM_LEFT || this == BOTTOM_RIGHT;
        }

        public final boolean isHalf() {
            return this.isHalf;
        }

        public final boolean isLeft() {
            return this == LEFT || this == TOP_LEFT || this == BOTTOM_LEFT;
        }

        public final boolean isQuarter() {
            return (this.isHalf || this == NORMAL) ? false : true;
        }

        public final boolean isRight() {
            return this == RIGHT || this == TOP_RIGHT || this == BOTTOM_RIGHT;
        }

        public final boolean isTop() {
            return this == TOP || this == TOP_LEFT || this == TOP_RIGHT;
        }
    }

    /* compiled from: Speedometer.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43374a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.LEFT.ordinal()] = 1;
            iArr[a.TOP_LEFT.ordinal()] = 2;
            iArr[a.BOTTOM_LEFT.ordinal()] = 3;
            iArr[a.RIGHT.ordinal()] = 4;
            iArr[a.TOP_RIGHT.ordinal()] = 5;
            iArr[a.BOTTOM_RIGHT.ordinal()] = 6;
            iArr[a.TOP.ordinal()] = 7;
            iArr[a.BOTTOM.ordinal()] = 8;
            f43374a = iArr;
            int[] iArr2 = new int[AbstractC5355a.b.values().length];
            iArr2[AbstractC5355a.b.TopIndicator.ordinal()] = 1;
            iArr2[AbstractC5355a.b.CenterIndicator.ordinal()] = 2;
            iArr2[AbstractC5355a.b.BottomIndicator.ordinal()] = 3;
            iArr2[AbstractC5355a.b.TopSpeedometer.ordinal()] = 4;
            iArr2[AbstractC5355a.b.QuarterSpeedometer.ordinal()] = 5;
            iArr2[AbstractC5355a.b.CenterSpeedometer.ordinal()] = 6;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    public final int getBackgroundCircleColor() {
        return this.f43361f0;
    }

    public final float getDegree() {
        return this.f43364i0;
    }

    public final int getEndDegree() {
        return this.f43363h0;
    }

    public final float getFulcrumX() {
        return this.f43351S.x;
    }

    public final float getFulcrumY() {
        return this.f43351S.y;
    }

    public final AbstractC5321b<?> getIndicator() {
        return this.f43350R;
    }

    public final int getIndicatorLightColor() {
        return this.f43353U;
    }

    public final float getInitTickPadding() {
        return this.f43370o0;
    }

    public final int getMarkColor() {
        return this.f43356a0.getColor();
    }

    public final float getMarkHeight() {
        return this.f43360e0;
    }

    public final Paint getMarkPaint() {
        return this.f43356a0;
    }

    public final EnumC5281b getMarkStyle() {
        return this.f43356a0.getStrokeCap() == Paint.Cap.ROUND ? EnumC5281b.ROUND : EnumC5281b.BUTT;
    }

    public final float getMarkWidth() {
        return this.f43356a0.getStrokeWidth();
    }

    public final int getMarksNumber() {
        return this.f43358c0;
    }

    public final float getMarksPadding() {
        return this.f43359d0;
    }

    public final p<Integer, Float, CharSequence> getOnPrintTickLabel() {
        return this.f43372q0;
    }

    public final int getSize() {
        a aVar = this.f43366k0;
        return aVar == a.NORMAL ? getWidth() : aVar.isHalf() ? Math.max(getWidth(), getHeight()) : (Math.max(getWidth(), getHeight()) * 2) - (this.f43367l0 * 2);
    }

    public final int getSizePa() {
        return getSize() - (getPadding() * 2);
    }

    public final a getSpeedometerMode() {
        return this.f43366k0;
    }

    @Override // k3.c
    public float getSpeedometerWidth() {
        return super.getSpeedometerWidth();
    }

    public final int getStartDegree() {
        return this.f43362g0;
    }

    public final int getTickNumber() {
        return this.f43368m0.size();
    }

    public final float getTickPadding() {
        return this.f43371p0;
    }

    public final List<Float> getTicks() {
        return this.f43368m0;
    }

    public final float getViewBottom() {
        return (getHeight() * 0.5f) + getViewCenterY();
    }

    public final float getViewCenterX() {
        switch (b.f43374a[this.f43366k0.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return (getSize() * 0.5f) - (getWidth() * 0.5f);
            case 4:
            case 5:
            case 6:
                return (getWidth() * 0.5f) + (getSize() * 0.5f);
            default:
                return getSize() * 0.5f;
        }
    }

    public final float getViewCenterY() {
        int i = b.f43374a[this.f43366k0.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                return getSize() * 0.5f;
                            }
                        }
                    }
                }
            }
            return (getHeight() * 0.5f) + (getSize() * 0.5f);
        }
        return (getSize() * 0.5f) - (getHeight() * 0.5f);
    }

    public final float getViewLeft() {
        return getViewCenterX() - (getWidth() * 0.5f);
    }

    public final float getViewRight() {
        return (getWidth() * 0.5f) + getViewCenterX();
    }

    public final float getViewTop() {
        return getViewCenterY() - (getHeight() * 0.5f);
    }

    @Override // k3.c, android.view.View
    public void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        this.f43364i0 = s(getCurrentSpeed());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int iJ = (int) j(250.0f);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 && mode2 == 1073741824) {
            size = Math.min(size, size2);
        } else if (mode != 1073741824) {
            size = mode2 == 1073741824 ? size2 : ((mode == 0 && mode2 == 0) || (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE)) ? Math.min(iJ, Math.min(size, size2)) : mode == Integer.MIN_VALUE ? Math.min(iJ, size) : Math.min(iJ, size2);
        }
        int iMax = Math.max(size, Math.max(getSuggestedMinimumWidth(), getSuggestedMinimumHeight()));
        int divWidth$speedviewlib_release = iMax / this.f43366k0.getDivWidth$speedviewlib_release();
        int divHeight$speedviewlib_release = iMax / this.f43366k0.getDivHeight$speedviewlib_release();
        if (this.f43366k0.isHalf()) {
            if (this.f43366k0.getDivWidth$speedviewlib_release() == 2) {
                divWidth$speedviewlib_release += this.f43367l0;
            } else {
                divHeight$speedviewlib_release += this.f43367l0;
            }
        }
        setMeasuredDimension(divWidth$speedviewlib_release, divHeight$speedviewlib_release);
    }

    @Override // k3.c, android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f43350R.j();
        v();
    }

    public final void q() {
        int i = this.f43362g0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("StartDegree can't be Negative");
        }
        int i10 = this.f43363h0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("EndDegree can't be Negative");
        }
        if (!(i < i10)) {
            throw new IllegalArgumentException("EndDegree must be bigger than StartDegree !");
        }
        if (!(i10 - i <= 360)) {
            throw new IllegalArgumentException("(EndDegree - StartDegree) must be smaller than 360 !");
        }
        if (!(i >= this.f43366k0.getMinDegree$speedviewlib_release())) {
            throw new IllegalArgumentException(("StartDegree must be bigger than " + getSpeedometerMode().getMinDegree$speedviewlib_release() + " in " + getSpeedometerMode() + " Mode !").toString());
        }
        if (this.f43363h0 <= this.f43366k0.getMaxDegree$speedviewlib_release()) {
            return;
        }
        throw new IllegalArgumentException(("EndDegree must be smaller than " + getSpeedometerMode().getMaxDegree$speedviewlib_release() + " in " + getSpeedometerMode() + " Mode !").toString());
    }

    public abstract void r();

    public final float s(float f10) {
        return (((f10 - getMinSpeed()) * (this.f43363h0 - this.f43362g0)) / (getMaxSpeed() - getMinSpeed())) + this.f43362g0;
    }

    public final void setBackgroundCircleColor(int i) {
        this.f43361f0 = i;
        this.f43354V.setColor(i);
        l();
    }

    public final void setEndDegree(int i) {
        u(this.f43362g0, i);
    }

    public final void setIndicator(AbstractC5321b<?> indicator) {
        l.f(indicator, "indicator");
        this.f43350R.deleteObservers();
        indicator.h(this);
        this.f43350R = indicator;
        if (this.f43307E) {
            indicator.h(this);
            invalidate();
        }
    }

    public final void setIndicatorLightColor(int i) {
        this.f43353U = i;
    }

    public final void setInitTickPadding(float f10) {
        this.f43370o0 = f10;
    }

    public final void setMarkColor(int i) {
        this.f43356a0.setColor(i);
    }

    public final void setMarkHeight(float f10) {
        this.f43360e0 = f10;
        l();
    }

    public final void setMarkStyle(EnumC5281b markStyle) {
        l.f(markStyle, "markStyle");
        EnumC5281b enumC5281b = EnumC5281b.ROUND;
        Paint paint = this.f43356a0;
        if (markStyle == enumC5281b) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            paint.setStrokeCap(Paint.Cap.BUTT);
        }
        l();
    }

    public final void setMarkWidth(float f10) {
        this.f43356a0.setStrokeWidth(f10);
        l();
    }

    public final void setMarksNumber(int i) {
        this.f43358c0 = i;
        l();
    }

    public final void setMarksPadding(float f10) {
        this.f43359d0 = f10;
        l();
    }

    public final void setOnPrintTickLabel(p<? super Integer, ? super Float, ? extends CharSequence> pVar) {
        this.f43372q0 = pVar;
        l();
    }

    public final void setSpeedometerMode(a speedometerMode) {
        l.f(speedometerMode, "speedometerMode");
        this.f43366k0 = speedometerMode;
        if (speedometerMode != a.NORMAL) {
            this.f43362g0 = speedometerMode.getMinDegree$speedviewlib_release();
            this.f43363h0 = speedometerMode.getMaxDegree$speedviewlib_release();
        }
        v();
        c();
        this.f43364i0 = s(getSpeed());
        this.f43350R.j();
        if (this.f43307E) {
            requestLayout();
            l();
            n();
        }
    }

    @Override // k3.c
    public void setSpeedometerWidth(float f10) {
        super.setSpeedometerWidth(f10);
        if (this.f43307E) {
            this.f43350R.j();
        }
    }

    public final void setStartDegree(int i) {
        u(i, this.f43363h0);
    }

    public final void setTickNumber(int i) {
        int i10 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("tickNumber mustn't be negative");
        }
        ArrayList arrayList = new ArrayList();
        float f10 = i == 1 ? 0.0f : 1.0f / (i - 1);
        if (i > 0) {
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(Float.valueOf(i10 * f10));
                if (i11 >= i) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        setTicks(arrayList);
    }

    public final void setTickPadding(float f10) {
        this.f43371p0 = f10;
        l();
    }

    public final void setTickRotation(boolean z10) {
        this.f43369n0 = z10;
        l();
    }

    public final void setTicks(List<Float> ticks) {
        l.f(ticks, "ticks");
        this.f43368m0 = ticks;
        Iterator<Float> it = ticks.iterator();
        while (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
                throw new IllegalArgumentException("ticks must be between [0f, 1f] !!");
            }
        }
        l();
    }

    public final void setWithIndicatorLight(boolean z10) {
        this.f43352T = z10;
    }

    public final float t(float f10) {
        return getMinSpeed() + (((getMaxSpeed() - getMinSpeed()) * (f10 - this.f43362g0)) / (this.f43363h0 - this.f43362g0));
    }

    public final void u(int i, int i10) {
        this.f43362g0 = i;
        this.f43363h0 = i10;
        q();
        c();
        this.f43364i0 = s(getSpeed());
        if (this.f43307E) {
            l();
            n();
        }
    }

    public final void v() {
        setTranslatedDx(this.f43366k0.isRight() ? ((-getSize()) * 0.5f) + this.f43367l0 : 0.0f);
        setTranslatedDy(this.f43366k0.isBottom() ? this.f43367l0 + ((-getSize()) * 0.5f) : 0.0f);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f43350R = new m3.f(context);
        this.f43351S = new PointF(0.5f, 0.5f);
        this.f43353U = -1140893918;
        Paint paint = new Paint(1);
        this.f43354V = paint;
        Paint paint2 = new Paint(1);
        this.f43355W = paint2;
        Paint paint3 = new Paint(1);
        this.f43356a0 = paint3;
        this.f43357b0 = new Path();
        this.f43360e0 = j(9.0f);
        this.f43361f0 = -1;
        this.f43362g0 = 135;
        this.f43363h0 = 405;
        this.f43364i0 = 135;
        this.f43365j0 = new ArrayList<>();
        this.f43366k0 = a.NORMAL;
        this.f43368m0 = C2099t.f18581b;
        this.f43369n0 = true;
        this.f43371p0 = j(3.0f) + getSpeedometerWidth();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
        setMarkColor(-1);
        setMarkWidth(j(3.0f));
        setMarkStyle(EnumC5281b.BUTT);
        r();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.f43349c, 0, 0);
            l.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…leable.Speedometer, 0, 0)");
            int i10 = typedArrayObtainStyledAttributes.getInt(13, -1);
            if (i10 != -1 && i10 != 0) {
                setSpeedometerMode(a.values()[i10]);
            }
            int i11 = typedArrayObtainStyledAttributes.getInt(3, -1);
            if (i11 != -1) {
                setIndicator(AbstractC5321b.a.values()[i11]);
            }
            setMarksNumber(typedArrayObtainStyledAttributes.getInt(11, this.f43358c0));
            setMarksPadding(typedArrayObtainStyledAttributes.getDimension(12, this.f43359d0));
            setMarkHeight(typedArrayObtainStyledAttributes.getDimension(8, this.f43360e0));
            setMarkWidth(typedArrayObtainStyledAttributes.getDimension(10, getMarkWidth()));
            setMarkColor(typedArrayObtainStyledAttributes.getColor(7, getMarkColor()));
            int i12 = typedArrayObtainStyledAttributes.getInt(9, -1);
            if (i12 != -1) {
                setMarkStyle(EnumC5281b.values()[i12]);
            }
            setBackgroundCircleColor(typedArrayObtainStyledAttributes.getColor(0, this.f43361f0));
            this.f43362g0 = typedArrayObtainStyledAttributes.getInt(14, this.f43362g0);
            this.f43363h0 = typedArrayObtainStyledAttributes.getInt(2, this.f43363h0);
            AbstractC5321b<?> abstractC5321b = this.f43350R;
            abstractC5321b.i(typedArrayObtainStyledAttributes.getDimension(6, abstractC5321b.f44063d));
            this.f43367l0 = (int) typedArrayObtainStyledAttributes.getDimension(1, this.f43367l0);
            setTickNumber(typedArrayObtainStyledAttributes.getInteger(15, this.f43368m0.size()));
            this.f43369n0 = typedArrayObtainStyledAttributes.getBoolean(17, this.f43369n0);
            setTickPadding(typedArrayObtainStyledAttributes.getDimension(16, this.f43371p0));
            AbstractC5321b<?> abstractC5321b2 = this.f43350R;
            abstractC5321b2.g(typedArrayObtainStyledAttributes.getColor(4, abstractC5321b2.f44064e));
            this.f43352T = typedArrayObtainStyledAttributes.getBoolean(19, this.f43352T);
            this.f43353U = typedArrayObtainStyledAttributes.getColor(5, this.f43353U);
            int i13 = typedArrayObtainStyledAttributes.getInt(18, -1);
            if (i13 == 0) {
                setOnPrintTickLabel(new f(this));
            } else if (i13 == 1) {
                setOnPrintTickLabel(new g(this));
            }
            this.f43364i0 = this.f43362g0;
            typedArrayObtainStyledAttributes.recycle();
            q();
        }
        paint.setColor(this.f43361f0);
    }

    public void setIndicator(AbstractC5321b.a indicator) {
        AbstractC5321b<?> fVar;
        l.f(indicator, "indicator");
        int i = AbstractC5321b.f44059f;
        Context context = getContext();
        l.e(context, "context");
        switch (C5320a.f44058a[indicator.ordinal()]) {
            case 1:
                fVar = new m3.f(context);
                break;
            case 2:
                fVar = new m3.g(context);
                break;
            case 3:
                fVar = new C5322c(context, 1);
                break;
            case 4:
                i iVar = new i(context);
                iVar.f44075g = new Path();
                iVar.i(25.0f * iVar.f44061b);
                fVar = iVar;
                break;
            case 5:
                fVar = new h(context);
                break;
            case 6:
                fVar = new C5323d(context, 1.0f);
                break;
            case 7:
                fVar = new C5323d(context, 0.5f);
                break;
            case 8:
                fVar = new C5323d(context, 0.25f);
                break;
            case 9:
                fVar = new C5322c(context, 0);
                break;
            case 10:
                fVar = new m3.e(context);
                break;
            default:
                throw new j();
        }
        fVar.h(this);
        setIndicator(fVar);
    }
}
