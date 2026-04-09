package com.lefan.signal.ui.phone;

import F4.e;
import R2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class PhoneSignalView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f19144C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f19145D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f19146E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f19147F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f19148G;

    /* renamed from: H, reason: collision with root package name */
    public String f19149H;

    /* renamed from: I, reason: collision with root package name */
    public String f19150I;

    /* renamed from: a, reason: collision with root package name */
    public float f19151a;

    /* renamed from: b, reason: collision with root package name */
    public float f19152b;

    /* renamed from: c, reason: collision with root package name */
    public float f19153c;

    /* renamed from: d, reason: collision with root package name */
    public float f19154d;

    /* renamed from: e, reason: collision with root package name */
    public float f19155e;

    /* renamed from: f, reason: collision with root package name */
    public float f19156f;

    /* renamed from: g, reason: collision with root package name */
    public float f19157g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19158h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19159j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19160k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19161l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f19162m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneSignalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19151a = -120.0f;
        this.f19152b = -50.0f;
        this.f19153c = 70.0f;
        this.f19154d = -120.0f;
        Paint paint = new Paint();
        this.f19158h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.f19159j = paint3;
        Paint paint4 = new Paint();
        Paint paint5 = new Paint();
        this.f19160k = paint5;
        Paint paint6 = new Paint();
        this.f19161l = paint6;
        Paint paint7 = new Paint();
        this.f19162m = paint7;
        Paint paint8 = new Paint();
        this.f19163n = paint8;
        Paint paint9 = new Paint();
        this.f19144C = paint9;
        Paint paint10 = new Paint();
        this.f19145D = paint10;
        this.f19146E = new int[]{-65536, -256, -16711936};
        this.f19147F = new float[]{0.0f, 0.3f, 0.7f};
        paint2.setAntiAlias(true);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint4.setColor(-7829368);
        paint4.setStrokeWidth(3.0f);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint5.setColor(-16711936);
        paint5.setAntiAlias(true);
        paint6.setColor(getContext().getColor(R.color.white));
        paint7.setColor(getContext().getColor(R.color.color_divider));
        paint8.setColor(getContext().getColor(R.color.text_color));
        paint8.setTextAlign(align);
        paint8.setTypeface(typeface);
        paint9.setColor(getContext().getColor(R.color.text_color));
        paint9.setTextAlign(align);
        paint9.setTypeface(typeface);
        paint10.setColor(-7829368);
        paint10.setTextAlign(align);
        paint10.setTypeface(typeface);
        this.f19148G = new Path();
        this.f19149H = "gsm";
        this.f19150I = "RSSI";
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        Canvas canvas2 = canvas;
        i.e(canvas2, "canvas");
        super.onDraw(canvas);
        SweepGradient sweepGradient = new SweepGradient(this.f19155e, this.f19157g, this.f19146E, this.f19147F);
        Paint paint = this.f19158h;
        paint.setShader(sweepGradient);
        float f2 = this.f19155e;
        float f5 = this.f19157g;
        float f6 = f2 - f5;
        float f7 = f2 + f5;
        RectF rectF = new RectF(f6, f6, f7, f7);
        canvas2.save();
        float f8 = this.f19155e;
        canvas2.rotate(140.0f, f8, f8);
        canvas2.drawArc(rectF, 0.0f, 260.0f, false, paint);
        canvas2.restore();
        canvas2.save();
        float f9 = this.f19155e;
        canvas2.rotate(-130.0f, f9, f9);
        int i = (int) this.f19151a;
        int i3 = (int) this.f19152b;
        if (i <= i3) {
            int i6 = i;
            while (true) {
                int i7 = i6 % 5;
                Paint paint2 = this.i;
                if (i7 != 0) {
                    float f10 = this.f19155e;
                    float f11 = f10 - this.f19157g;
                    float f12 = this.f19156f;
                    float f13 = ((2 * f12) + f11) - 10.0f;
                    float f14 = ((f12 * 3) + f11) - 10.0f;
                    canvas2 = canvas;
                    canvas2.drawLine(f10, f13, f10, f14, paint2);
                } else if (i6 % 10 == 0) {
                    float f15 = this.f19155e;
                    float f16 = f15 - this.f19157g;
                    float f17 = this.f19156f;
                    canvas2.drawLine(f15, ((2 * f17) + f16) - 10.0f, f15, ((f17 * 4) + f16) - 10.0f, paint2);
                    Integer numValueOf = Integer.valueOf(i6);
                    if (a.f3390d) {
                        Locale locale = e.f1457a;
                        str2 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    float f18 = this.f19155e;
                    canvas2.drawText(str2, f18, ((this.f19156f * 6) + (f18 - this.f19157g)) - 10.0f, this.f19159j);
                } else {
                    float f19 = this.f19155e;
                    float f20 = f19 - this.f19157g;
                    float f21 = this.f19156f;
                    canvas2.drawLine(f19, ((2 * f21) + f20) - 10.0f, f19, ((f21 * 3.5f) + f20) - 10.0f, paint2);
                    canvas2 = canvas;
                }
                float f22 = 260.0f / this.f19153c;
                float f23 = this.f19155e;
                canvas2.rotate(f22, f23, f23);
                if (i6 == i3) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        canvas2.restore();
        float f24 = this.f19155e;
        canvas2.drawCircle(f24, f24, this.f19156f * 4, this.f19162m);
        float f25 = this.f19155e;
        canvas2.drawText("dBm", f25, (this.f19156f * 11) + (f25 - this.f19157g), this.f19163n);
        String str3 = this.f19150I;
        float f26 = this.f19155e;
        canvas2.drawText(str3, f26, (this.f19156f * 16) + (f26 - this.f19157g), this.f19145D);
        Float fValueOf = Float.valueOf(this.f19154d);
        if (a.f3390d) {
            Locale locale2 = e.f1457a;
            str = String.format(e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        float f27 = this.f19155e;
        canvas2.drawText(str, f27, (this.f19156f * 13) + f27, this.f19144C);
        float f28 = this.f19155e;
        LinearGradient linearGradient = new LinearGradient(f28, (f28 - this.f19157g) - 20.0f, f28, f28, this.f19146E, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint3 = this.f19160k;
        paint3.setShader(linearGradient);
        float f29 = this.f19154d;
        float f30 = this.f19151a;
        float f31 = f29 <= f30 ? -130.0f : (((f29 - f30) / this.f19153c) * 260.0f) - 130.0f;
        canvas2.save();
        float f32 = this.f19155e;
        canvas2.rotate(f31, f32, f32);
        Path path = this.f19148G;
        path.reset();
        float f33 = this.f19155e;
        path.moveTo(f33, (f33 - this.f19157g) + this.f19156f);
        float f34 = this.f19155e;
        path.lineTo(f34 - this.f19156f, f34);
        float f35 = this.f19155e;
        path.lineTo(f35, (this.f19156f * 2) + f35);
        float f36 = this.f19155e;
        path.lineTo(this.f19156f + f36, f36);
        canvas2.drawPath(path, paint3);
        canvas2.restore();
        float f37 = this.f19155e;
        canvas2.drawCircle(f37, f37, this.f19156f / 3, this.f19161l);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        float f2 = 2;
        this.f19155e = size / f2;
        float f5 = size / 50;
        this.f19156f = f5;
        this.f19157g = (size * 2.2f) / 5;
        this.f19158h.setStrokeWidth(f5 * f2);
        this.f19159j.setTextSize(this.f19156f * f2);
        float f6 = 3;
        this.f19163n.setTextSize(this.f19156f * f6);
        this.f19145D.setTextSize(this.f19156f * f6);
        this.f19144C.setTextSize(this.f19156f * 4.5f);
        setMeasuredDimension(i, (int) (this.f19157g * f2));
    }

    public final void setDbm(float f2) {
        if (this.f19154d == f2) {
            return;
        }
        this.f19154d = f2;
        if (f2 > this.f19152b) {
            this.f19154d = this.f19151a;
        }
        float f5 = this.f19154d;
        float f6 = this.f19151a;
        if (f5 < f6) {
            this.f19154d = f6;
        }
        invalidate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r8.equals("tdscdma") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r7.f19151a = -120.0f;
        r7.f19152b = -20.0f;
        r7.f19153c = 100.0f;
        r7.f19150I = "RSCP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r8.equals("wcdma") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSignalType(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "signalType"
            q5.i.e(r8, r0)
            java.lang.String r0 = r7.f19149H
            boolean r0 = q5.i.a(r0, r8)
            if (r0 == 0) goto Le
            return
        Le:
            r7.f19149H = r8
            int r0 = r8.hashCode()
            java.lang.String r1 = "RSRP"
            r2 = -1038090240(0xffffffffc2200000, float:-40.0)
            r3 = -1022623744(0xffffffffc30c0000, float:-140.0)
            java.lang.String r4 = "RSSI"
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = -1024458752(0xffffffffc2f00000, float:-120.0)
            switch(r0) {
                case -1451586504: goto L67;
                case 3524: goto L55;
                case 107485: goto L43;
                case 3048885: goto L2d;
                case 112947884: goto L24;
                default: goto L23;
            }
        L23:
            goto L6f
        L24:
            java.lang.String r0 = "wcdma"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L7c
            goto L6f
        L2d:
            java.lang.String r0 = "cdma"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L36
            goto L6f
        L36:
            r7.f19151a = r6
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.f19152b = r8
            r8 = 1123024896(0x42f00000, float:120.0)
            r7.f19153c = r8
            r7.f19150I = r4
            return
        L43:
            java.lang.String r0 = "lte"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L4c
            goto L6f
        L4c:
            r7.f19151a = r3
            r7.f19152b = r2
            r7.f19153c = r5
            r7.f19150I = r1
            return
        L55:
            java.lang.String r0 = "nr"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L5e
            goto L6f
        L5e:
            r7.f19151a = r3
            r7.f19152b = r2
            r7.f19153c = r5
            r7.f19150I = r1
            return
        L67:
            java.lang.String r0 = "tdscdma"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L7c
        L6f:
            r7.f19151a = r6
            r8 = -1035468800(0xffffffffc2480000, float:-50.0)
            r7.f19152b = r8
            r8 = 1116471296(0x428c0000, float:70.0)
            r7.f19153c = r8
            r7.f19150I = r4
            return
        L7c:
            r7.f19151a = r6
            r8 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r7.f19152b = r8
            r7.f19153c = r5
            java.lang.String r8 = "RSCP"
            r7.f19150I = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.phone.PhoneSignalView.setSignalType(java.lang.String):void");
    }
}
