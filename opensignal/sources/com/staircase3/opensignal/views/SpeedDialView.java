package com.staircase3.opensignal.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import mq.o;
import mq.w;
import qk.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/staircase3/opensignal/views/SpeedDialView;", "Landroid/widget/LinearLayout;", "Landroid/graphics/RectF;", "getViewRect", "()Landroid/graphics/RectF;", "a", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpeedDialView extends LinearLayout {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f6338c0 = 0;
    public final List B;
    public final List D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final float N;
    public final float O;
    public final double P;
    public final double Q;
    public float R;
    public float S;
    public final int T;
    public ValueAnimator U;
    public int V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final int f6339a;

    /* renamed from: a0, reason: collision with root package name */
    public float f6340a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f6341b0;

    /* renamed from: d, reason: collision with root package name */
    public final int f6342d;

    /* renamed from: g, reason: collision with root package name */
    public final int f6343g;

    /* renamed from: r, reason: collision with root package name */
    public final int f6344r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6345x;

    /* renamed from: y, reason: collision with root package name */
    public a f6346y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ sq.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DOWNLOAD = new a("DOWNLOAD", 0);
        public static final a UPLOAD = new a("UPLOAD", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{DOWNLOAD, UPLOAD};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = a.a.j(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static sq.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedDialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f6339a = Color.parseColor("#456C8C");
        this.f6342d = Color.parseColor("#FF7B00");
        this.f6343g = Color.parseColor("#00C0FF");
        this.f6344r = Color.parseColor("#FF7B00");
        this.f6345x = true;
        this.f6346y = a.DOWNLOAD;
        w wVar = w.f16945a;
        this.B = wVar;
        this.D = wVar;
        this.N = 4.0f;
        this.O = 40.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.SpeedDialView, 0, 0);
        l.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(n.SpeedDialView_speedScalesDownload);
        if (textArray != null) {
            ArrayList arrayList = new ArrayList(textArray.length);
            for (CharSequence charSequence : textArray) {
                arrayList.add(charSequence.toString());
            }
            this.B = o.Q0(arrayList);
        }
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(n.SpeedDialView_speedScalesUpload);
        if (textArray2 != null) {
            ArrayList arrayList2 = new ArrayList(textArray2.length);
            for (CharSequence charSequence2 : textArray2) {
                arrayList2.add(charSequence2.toString());
            }
            this.D = o.Q0(arrayList2);
        }
        this.P = 337.5d / this.B.size();
        this.Q = 337.5d / this.D.size();
        Objects.toString(this.B);
        Objects.toString(this.D);
        this.J = typedArrayObtainStyledAttributes.getColor(n.SpeedDialView_backgroundDialColor, this.f6339a);
        this.N = typedArrayObtainStyledAttributes.getDimension(n.SpeedDialView_dialThickness, 4.0f);
        this.K = typedArrayObtainStyledAttributes.getColor(n.SpeedDialView_speedDialColor, this.f6342d);
        this.L = typedArrayObtainStyledAttributes.getColor(n.SpeedDialView_latencyDialColor, this.f6343g);
        this.T = typedArrayObtainStyledAttributes.getInteger(n.SpeedDialView_latencyAnimationDuration, 3750);
        this.M = typedArrayObtainStyledAttributes.getColor(n.SpeedDialView_speedScaleTextColor, this.f6344r);
        this.O = typedArrayObtainStyledAttributes.getDimension(n.SpeedDialView_speedScaleTextSize, 40.0f);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.N);
        paint.setColor(this.J);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.E = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.N);
        paint2.setColor(this.K);
        paint2.setStrokeCap(cap);
        this.F = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setColor(this.M);
        paint3.setTextSize(this.O);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        this.G = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        paint4.setColor(this.J);
        paint4.setTextSize(this.O);
        paint4.setTextAlign(align);
        this.H = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setStrokeWidth(this.N);
        paint5.setStrokeCap(cap);
        paint5.setColor(this.L);
        this.I = paint5;
        setWillNotDraw(false);
    }

    private final RectF getViewRect() {
        float f10 = 0;
        float f11 = this.f6340a0;
        int i10 = this.V;
        return new RectF(f10 + f11, f10 + f11, i10 - f11, i10 - f11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        List list;
        double d6;
        Paint paint;
        l.e(canvas, "canvas");
        super.onDraw(canvas);
        Throwable th2 = null;
        if (this.f6345x) {
            RectF viewRect = getViewRect();
            canvas.save();
            float f10 = this.f6341b0;
            float f11 = this.f6340a0;
            canvas.translate(f10 + f11, f11);
            float f12 = 270.0f + this.S;
            Paint paint2 = this.I;
            if (paint2 == null) {
                l.l("latencyPaint");
                throw null;
            }
            canvas.drawArc(viewRect, f12, 180.0f, false, paint2);
            canvas.restore();
            return;
        }
        float f13 = this.R;
        a aVar = this.f6346y;
        int[] iArr = com.staircase3.opensignal.views.a.f6353a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1) {
            list = this.B;
        } else {
            if (i10 != 2) {
                throw new bf.n();
            }
            list = this.D;
        }
        int i11 = iArr[this.f6346y.ordinal()];
        if (i11 == 1) {
            d6 = this.P;
        } else {
            if (i11 != 2) {
                throw new bf.n();
            }
            d6 = this.Q;
        }
        float f14 = this.V;
        float f15 = (0.5f * f14) - this.W;
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                Throwable th3 = th2;
                e5.Q();
                throw th3;
            }
            String str = (String) next;
            double d10 = (((i12 * d6) + 67.5d) * 3.141592653589793d) / 180.0d;
            Throwable th4 = th2;
            Paint paint3 = this.G;
            if (paint3 == null) {
                l.l("activeScalePaint");
                throw th4;
            }
            float fMeasureText = paint3.measureText(str);
            Paint paint4 = this.G;
            if (paint4 == null) {
                l.l("activeScalePaint");
                throw th4;
            }
            float textSize = paint4.getTextSize();
            double d11 = d6;
            Iterator it2 = it;
            double d12 = 2.0f;
            double dAbs = Math.abs(Math.sin(d10) * fMeasureText) / d12;
            double dAbs2 = Math.abs(Math.cos(d10) * textSize) / d12;
            double d13 = f14 / 2.0f;
            double d14 = f15;
            double dSin = d13 - (Math.sin(d10) * (d14 - dAbs));
            double dCos = (Math.cos(d10) * (d14 - dAbs2)) + d13;
            float f16 = f14;
            if (((f13 + 67.5d) * 3.141592653589793d) / 180.0d >= d10) {
                paint = this.G;
                if (paint == null) {
                    l.l("activeScalePaint");
                    throw th4;
                }
            } else {
                paint = this.H;
                if (paint == null) {
                    l.l("inactiveScalePaint");
                    throw th4;
                }
            }
            canvas.save();
            float f17 = this.f6341b0;
            float f18 = this.f6340a0;
            canvas.translate(f17 + f18, f18);
            canvas.drawText(str, (float) dSin, (float) dCos, paint);
            canvas.restore();
            f14 = f16;
            i12 = i13;
            th2 = th4;
            d6 = d11;
            it = it2;
        }
        Throwable th5 = th2;
        RectF viewRect2 = getViewRect();
        canvas.save();
        float f19 = this.f6341b0;
        float f20 = this.f6340a0;
        canvas.translate(f19 + f20, f20);
        Paint paint5 = this.E;
        if (paint5 == null) {
            l.l("backgroundPaint");
            throw th5;
        }
        canvas.drawArc(viewRect2, 157.5f, 310.0f, false, paint5);
        float f21 = this.R;
        Paint paint6 = this.F;
        if (paint6 == null) {
            l.l("speedPaint");
            throw th5;
        }
        canvas.drawArc(viewRect2, 157.5f, f21, false, paint6);
        canvas.restore();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int paddingTop;
        int paddingBottom;
        int suggestedMinimumWidth = (getSuggestedMinimumWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int mode3 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode3 == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode3 == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        int mode4 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode4 == 1073741824) {
            paddingBottom2 = size2;
        } else if (mode4 == Integer.MIN_VALUE) {
            paddingBottom2 = Math.min(paddingBottom2, size2);
        }
        setMeasuredDimension(suggestedMinimumWidth, paddingBottom2);
        if (suggestedMinimumWidth < paddingBottom2) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            this.f6341b0 = Math.abs(suggestedMinimumWidth - paddingBottom2) / 2.0f;
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i12 = paddingBottom + paddingTop;
        this.W = i12;
        this.f6340a0 = i12 / 2.0f;
        this.V = Math.min(suggestedMinimumWidth, paddingBottom2) - this.W;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(suggestedMinimumWidth, mode), View.MeasureSpec.makeMeasureSpec(paddingBottom2, mode2));
    }
}
