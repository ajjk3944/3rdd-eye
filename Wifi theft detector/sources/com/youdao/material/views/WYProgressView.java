package com.youdao.material.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import x8.e;

/* loaded from: classes3.dex */
public class WYProgressView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f20561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20563c;

    /* renamed from: d, reason: collision with root package name */
    public int f20564d;

    /* renamed from: e, reason: collision with root package name */
    public int f20565e;

    /* renamed from: f, reason: collision with root package name */
    public int f20566f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20567g;

    /* renamed from: h, reason: collision with root package name */
    public double f20568h;

    /* renamed from: i, reason: collision with root package name */
    public double f20569i;

    /* renamed from: j, reason: collision with root package name */
    public float f20570j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20571k;

    /* renamed from: l, reason: collision with root package name */
    public long f20572l;

    /* renamed from: m, reason: collision with root package name */
    public int f20573m;

    /* renamed from: n, reason: collision with root package name */
    public int f20574n;

    /* renamed from: o, reason: collision with root package name */
    public Paint f20575o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f20576p;

    /* renamed from: q, reason: collision with root package name */
    public RectF f20577q;

    /* renamed from: r, reason: collision with root package name */
    public float f20578r;

    /* renamed from: s, reason: collision with root package name */
    public long f20579s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20580t;

    /* renamed from: u, reason: collision with root package name */
    public float f20581u;

    /* renamed from: v, reason: collision with root package name */
    public float f20582v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20583w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20584x;

    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public float f20585a;

        /* renamed from: b, reason: collision with root package name */
        public float f20586b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20587c;

        /* renamed from: d, reason: collision with root package name */
        public float f20588d;

        /* renamed from: e, reason: collision with root package name */
        public int f20589e;

        /* renamed from: f, reason: collision with root package name */
        public int f20590f;

        /* renamed from: g, reason: collision with root package name */
        public int f20591g;

        /* renamed from: h, reason: collision with root package name */
        public int f20592h;

        /* renamed from: i, reason: collision with root package name */
        public int f20593i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f20594j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f20595k;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public WheelSavedState createFromParcel(Parcel parcel) {
                return new WheelSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public WheelSavedState[] newArray(int i10) {
                return new WheelSavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f20585a);
            parcel.writeFloat(this.f20586b);
            parcel.writeByte(this.f20587c ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f20588d);
            parcel.writeInt(this.f20589e);
            parcel.writeInt(this.f20590f);
            parcel.writeInt(this.f20591g);
            parcel.writeInt(this.f20592h);
            parcel.writeInt(this.f20593i);
            parcel.writeByte(this.f20594j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20595k ? (byte) 1 : (byte) 0);
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public WheelSavedState(Parcel parcel) {
            super(parcel);
            this.f20585a = parcel.readFloat();
            this.f20586b = parcel.readFloat();
            this.f20587c = parcel.readByte() != 0;
            this.f20588d = parcel.readFloat();
            this.f20589e = parcel.readInt();
            this.f20590f = parcel.readInt();
            this.f20591g = parcel.readInt();
            this.f20592h = parcel.readInt();
            this.f20593i = parcel.readInt();
            this.f20594j = parcel.readByte() != 0;
            this.f20595k = parcel.readByte() != 0;
        }
    }

    public interface b {
    }

    public WYProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20561a = 16;
        this.f20562b = 270;
        this.f20563c = 200L;
        this.f20564d = 28;
        this.f20565e = 4;
        this.f20566f = 4;
        this.f20567g = false;
        this.f20568h = 0.0d;
        this.f20569i = 460.0d;
        this.f20570j = 0.0f;
        this.f20571k = true;
        this.f20572l = 0L;
        this.f20573m = -1442840576;
        this.f20574n = 16777215;
        this.f20575o = new Paint();
        this.f20576p = new Paint();
        this.f20577q = new RectF();
        this.f20578r = 230.0f;
        this.f20579s = 0L;
        this.f20581u = 0.0f;
        this.f20582v = 0.0f;
        this.f20583w = false;
        a(context.obtainStyledAttributes(attributeSet, e.WYProgressView));
        d();
    }

    public final void a(TypedArray typedArray) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f20565e = (int) TypedValue.applyDimension(1, this.f20565e, displayMetrics);
        this.f20566f = (int) TypedValue.applyDimension(1, this.f20566f, displayMetrics);
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.f20564d, displayMetrics);
        this.f20564d = iApplyDimension;
        this.f20564d = (int) typedArray.getDimension(e.WYProgressView_matProg_circleRadius, iApplyDimension);
        this.f20567g = typedArray.getBoolean(e.WYProgressView_matProg_fillRadius, false);
        this.f20565e = (int) typedArray.getDimension(e.WYProgressView_matProg_barWidth, this.f20565e);
        this.f20566f = (int) typedArray.getDimension(e.WYProgressView_matProg_rimWidth, this.f20566f);
        this.f20578r = typedArray.getFloat(e.WYProgressView_matProg_spinSpeed, this.f20578r / 360.0f) * 360.0f;
        this.f20569i = typedArray.getInt(e.WYProgressView_matProg_barSpinCycleTime, (int) this.f20569i);
        this.f20573m = typedArray.getColor(e.WYProgressView_matProg_barColor, this.f20573m);
        this.f20574n = typedArray.getColor(e.WYProgressView_matProg_rimColor, this.f20574n);
        this.f20580t = typedArray.getBoolean(e.WYProgressView_matProg_linearProgress, false);
        if (typedArray.getBoolean(e.WYProgressView_matProg_progressIndeterminate, false)) {
            g();
        }
        typedArray.recycle();
    }

    public final void b() {
    }

    public final void c(float f10) {
    }

    public final void d() {
        this.f20584x = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void e(int i10, int i11) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f20567g) {
            int i12 = this.f20565e;
            this.f20577q = new RectF(paddingLeft + i12, paddingTop + i12, (i10 - paddingRight) - i12, (i11 - paddingBottom) - i12);
            return;
        }
        int i13 = (i10 - paddingLeft) - paddingRight;
        int iMin = Math.min(Math.min(i13, (i11 - paddingBottom) - paddingTop), (this.f20564d * 2) - (this.f20565e * 2));
        int i14 = ((i13 - iMin) / 2) + paddingLeft;
        int i15 = ((((i11 - paddingTop) - paddingBottom) - iMin) / 2) + paddingTop;
        int i16 = this.f20565e;
        this.f20577q = new RectF(i14 + i16, i15 + i16, (i14 + iMin) - i16, (i15 + iMin) - i16);
    }

    public final void f() {
        this.f20575o.setColor(this.f20573m);
        this.f20575o.setAntiAlias(true);
        Paint paint = this.f20575o;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f20575o.setStrokeWidth(this.f20565e);
        this.f20576p.setColor(this.f20574n);
        this.f20576p.setAntiAlias(true);
        this.f20576p.setStyle(style);
        this.f20576p.setStrokeWidth(this.f20566f);
    }

    public void g() {
        this.f20579s = SystemClock.uptimeMillis();
        this.f20583w = true;
        invalidate();
    }

    public int getBarColor() {
        return this.f20573m;
    }

    public int getBarWidth() {
        return this.f20565e;
    }

    public int getCircleRadius() {
        return this.f20564d;
    }

    public float getProgress() {
        if (this.f20583w) {
            return -1.0f;
        }
        return this.f20581u / 360.0f;
    }

    public int getRimColor() {
        return this.f20574n;
    }

    public int getRimWidth() {
        return this.f20566f;
    }

    public float getSpinSpeed() {
        return this.f20578r / 360.0f;
    }

    public final void h(long j10) {
        long j11 = this.f20572l;
        if (j11 < 200) {
            this.f20572l = j11 + j10;
            return;
        }
        double d10 = this.f20568h + j10;
        this.f20568h = d10;
        double d11 = this.f20569i;
        if (d10 > d11) {
            this.f20568h = d10 - d11;
            this.f20572l = 0L;
            this.f20571k = !this.f20571k;
        }
        float fCos = (((float) Math.cos(((this.f20568h / d11) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
        if (this.f20571k) {
            this.f20570j = fCos * 254.0f;
            return;
        }
        float f10 = (1.0f - fCos) * 254.0f;
        this.f20581u += this.f20570j - f10;
        this.f20570j = f10;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        canvas.drawArc(this.f20577q, 360.0f, 360.0f, false, this.f20576p);
        if (this.f20584x) {
            float fPow = 0.0f;
            boolean z10 = true;
            if (this.f20583w) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f20579s;
                float f11 = (jUptimeMillis * this.f20578r) / 1000.0f;
                h(jUptimeMillis);
                float f12 = this.f20581u + f11;
                this.f20581u = f12;
                if (f12 > 360.0f) {
                    this.f20581u = f12 - 360.0f;
                    c(-1.0f);
                }
                this.f20579s = SystemClock.uptimeMillis();
                float f13 = this.f20581u - 90.0f;
                float f14 = this.f20570j + 16.0f;
                if (isInEditMode()) {
                    f14 = 135.0f;
                    f10 = 0.0f;
                } else {
                    f10 = f13;
                }
                canvas.drawArc(this.f20577q, f10, f14, false, this.f20575o);
            } else {
                float f15 = this.f20581u;
                if (f15 != this.f20582v) {
                    this.f20581u = Math.min(this.f20581u + (((SystemClock.uptimeMillis() - this.f20579s) / 1000.0f) * this.f20578r), this.f20582v);
                    this.f20579s = SystemClock.uptimeMillis();
                } else {
                    z10 = false;
                }
                if (f15 != this.f20581u) {
                    b();
                }
                float fPow2 = this.f20581u;
                if (!this.f20580t) {
                    fPow = ((float) (1.0d - Math.pow(1.0f - (fPow2 / 360.0f), 4.0f))) * 360.0f;
                    fPow2 = ((float) (1.0d - Math.pow(1.0f - (this.f20581u / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f20577q, fPow - 90.0f, isInEditMode() ? 360.0f : fPow2, false, this.f20575o);
            }
            if (z10) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int paddingLeft = this.f20564d + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f20564d + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.f20581u = wheelSavedState.f20585a;
        this.f20582v = wheelSavedState.f20586b;
        this.f20583w = wheelSavedState.f20587c;
        this.f20578r = wheelSavedState.f20588d;
        this.f20565e = wheelSavedState.f20589e;
        this.f20573m = wheelSavedState.f20590f;
        this.f20566f = wheelSavedState.f20591g;
        this.f20574n = wheelSavedState.f20592h;
        this.f20564d = wheelSavedState.f20593i;
        this.f20580t = wheelSavedState.f20594j;
        this.f20567g = wheelSavedState.f20595k;
        this.f20579s = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f20585a = this.f20581u;
        wheelSavedState.f20586b = this.f20582v;
        wheelSavedState.f20587c = this.f20583w;
        wheelSavedState.f20588d = this.f20578r;
        wheelSavedState.f20589e = this.f20565e;
        wheelSavedState.f20590f = this.f20573m;
        wheelSavedState.f20591g = this.f20566f;
        wheelSavedState.f20592h = this.f20574n;
        wheelSavedState.f20593i = this.f20564d;
        wheelSavedState.f20594j = this.f20580t;
        wheelSavedState.f20595k = this.f20567g;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        e(i10, i11);
        f();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            this.f20579s = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i10) {
        this.f20573m = i10;
        f();
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i10) {
        this.f20565e = i10;
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setCallback(b bVar) {
        if (this.f20583w) {
            return;
        }
        b();
    }

    public void setCircleRadius(int i10) {
        this.f20564d = i10;
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f10) {
        if (this.f20583w) {
            this.f20581u = 0.0f;
            this.f20583w = false;
        }
        if (f10 > 1.0f) {
            f10 -= 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 == this.f20582v) {
            return;
        }
        float fMin = Math.min(f10 * 360.0f, 360.0f);
        this.f20582v = fMin;
        this.f20581u = fMin;
        this.f20579s = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z10) {
        this.f20580t = z10;
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f20583w) {
            this.f20581u = 0.0f;
            this.f20583w = false;
            b();
        }
        if (f10 > 1.0f) {
            f10 -= 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f11 = this.f20582v;
        if (f10 == f11) {
            return;
        }
        if (this.f20581u == f11) {
            this.f20579s = SystemClock.uptimeMillis();
        }
        this.f20582v = Math.min(f10 * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i10) {
        this.f20574n = i10;
        f();
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i10) {
        this.f20566f = i10;
        if (this.f20583w) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f10) {
        this.f20578r = f10 * 360.0f;
    }

    public WYProgressView(Context context) {
        super(context);
        this.f20561a = 16;
        this.f20562b = 270;
        this.f20563c = 200L;
        this.f20564d = 28;
        this.f20565e = 4;
        this.f20566f = 4;
        this.f20567g = false;
        this.f20568h = 0.0d;
        this.f20569i = 460.0d;
        this.f20570j = 0.0f;
        this.f20571k = true;
        this.f20572l = 0L;
        this.f20573m = -1442840576;
        this.f20574n = 16777215;
        this.f20575o = new Paint();
        this.f20576p = new Paint();
        this.f20577q = new RectF();
        this.f20578r = 230.0f;
        this.f20579s = 0L;
        this.f20581u = 0.0f;
        this.f20582v = 0.0f;
        this.f20583w = false;
        d();
    }
}
