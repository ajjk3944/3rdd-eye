package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m50 extends f74 {
    public Paint i;
    public Paint j;
    public k50 k;
    public ArrayList l;
    public Paint.FontMetrics m;
    public Path n;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U1(android.graphics.Canvas r9, float r10, float r11, defpackage.l50 r12, defpackage.k50 r13) {
        /*
            r8 = this;
            android.graphics.Path r0 = r8.n
            android.graphics.Paint r6 = r8.j
            int r1 = r12.e
            float r2 = r12.d
            float r3 = r12.c
            r4 = 1122868(0x112234, float:1.573473E-39)
            if (r1 == r4) goto L93
            r4 = 1122867(0x112233, float:1.573472E-39)
            if (r1 == r4) goto L93
            if (r1 != 0) goto L18
            goto L93
        L18:
            int r7 = r9.save()
            int r12 = r12.b
            r4 = 3
            if (r12 != r4) goto L23
            int r12 = r13.k
        L23:
            r6.setColor(r1)
            boolean r1 = java.lang.Float.isNaN(r3)
            if (r1 == 0) goto L2e
            float r3 = r13.l
        L2e:
            float r1 = defpackage.k41.c(r3)
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r1 / r3
            int r12 = defpackage.ex0.s(r12)
            r5 = 2
            if (r12 == r5) goto L70
            if (r12 == r4) goto L74
            r4 = 4
            if (r12 == r4) goto L70
            r3 = 5
            if (r12 == r3) goto L47
        L45:
            r1 = r9
            goto L90
        L47:
            boolean r12 = java.lang.Float.isNaN(r2)
            if (r12 == 0) goto L4f
            float r2 = r13.m
        L4f:
            float r12 = defpackage.k41.c(r2)
            r13.getClass()
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r13)
            r6.setStrokeWidth(r12)
            r12 = 0
            r6.setPathEffect(r12)
            r0.reset()
            r0.moveTo(r10, r11)
            float r10 = r10 + r1
            r0.lineTo(r10, r11)
            r9.drawPath(r0, r6)
            goto L45
        L70:
            r1 = r9
            r2 = r10
            r12 = r3
            goto L86
        L74:
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL
            r6.setStyle(r12)
            r12 = r3
            float r3 = r11 - r12
            float r4 = r10 + r1
            float r5 = r11 + r12
            r1 = r9
            r2 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L90
        L86:
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r6.setStyle(r9)
            float r10 = r2 + r12
            r1.drawCircle(r10, r11, r12, r6)
        L90:
            r1.restoreToCount(r7)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m50.U1(android.graphics.Canvas, float, float, l50, k50):void");
    }

    public final void V1(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Canvas canvas2;
        ArrayList arrayList;
        int i;
        float f4;
        float f5;
        Canvas canvas3;
        float f6;
        float f7;
        String str;
        int i2;
        float fMeasureText;
        float f8;
        float fWidth;
        double d;
        double d2;
        m50 m50Var = this;
        Paint.FontMetrics fontMetrics = m50Var.m;
        Paint paint = m50Var.i;
        u61 u61Var = (u61) m50Var.g;
        k50 k50Var = m50Var.k;
        if (k50Var.a) {
            paint.setTextSize(k50Var.d);
            paint.setColor(k50Var.e);
            DisplayMetrics displayMetrics = k41.a;
            paint.getFontMetrics(fontMetrics);
            float f9 = fontMetrics.descent - fontMetrics.ascent;
            paint.getFontMetrics(fontMetrics);
            float fC = k41.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f9 - (k41.a(paint, "ABC") / 2.0f);
            l50[] l50VarArr = k50Var.f;
            float fC2 = k41.c(k50Var.o);
            float fC3 = k41.c(k50Var.n);
            int i3 = k50Var.i;
            int i4 = k50Var.g;
            int i5 = k50Var.h;
            int i6 = k50Var.j;
            float fC4 = k41.c(k50Var.l);
            float fC5 = k41.c(k50Var.p);
            float f10 = k50Var.c;
            float f11 = k50Var.b;
            int iS = ex0.s(i4);
            if (iS == 0) {
                f = fC5;
                if (i3 != 2) {
                    f11 += u61Var.b.left;
                }
                f2 = i6 == 2 ? k50Var.r + f11 : f11;
            } else if (iS == 1) {
                if (i3 == 2) {
                    fWidth = u61Var.c / 2.0f;
                } else {
                    RectF rectF = u61Var.b;
                    fWidth = (rectF.width() / 2.0f) + rectF.left;
                }
                f2 = fWidth + (i6 == 1 ? f11 : -f11);
                if (i3 == 2) {
                    f = fC5;
                    double d3 = f2;
                    if (i6 == 1) {
                        d = d3;
                        d2 = ((-k50Var.r) / 2.0d) + f11;
                    } else {
                        d = d3;
                        d2 = (k50Var.r / 2.0d) - f11;
                    }
                    f2 = (float) (d + d2);
                } else {
                    f = fC5;
                }
            } else if (iS != 2) {
                f = fC5;
                f2 = 0.0f;
            } else {
                f2 = (i3 == 2 ? u61Var.c : u61Var.b.right) - f11;
                if (i6 == 1) {
                    f2 -= k50Var.r;
                }
                f = fC5;
            }
            int iS2 = ex0.s(i3);
            if (iS2 != 0) {
                if (iS2 != 1) {
                    return;
                }
                int iS3 = ex0.s(i5);
                if (iS3 == 0) {
                    f5 = (i4 == 2 ? 0.0f : u61Var.b.top) + f10;
                } else if (iS3 == 1) {
                    f5 = ((u61Var.d / 2.0f) - (k50Var.s / 2.0f)) + k50Var.c;
                } else if (iS3 != 2) {
                    f5 = 0.0f;
                } else {
                    f5 = (i4 == 2 ? u61Var.d : u61Var.b.bottom) - (k50Var.s + f10);
                }
                float f12 = f5;
                boolean z = false;
                int i7 = 0;
                float f13 = 0.0f;
                while (i7 < l50VarArr.length) {
                    l50 l50Var = l50VarArr[i7];
                    int i8 = l50Var.b;
                    float f14 = l50Var.c;
                    String str2 = l50Var.a;
                    boolean z2 = i8 != 1;
                    float fC6 = Float.isNaN(f14) ? fC4 : k41.c(f14);
                    if (z2) {
                        fMeasureText = i6 == 1 ? f2 + f13 : f2 - (fC6 - f13);
                        f6 = f2;
                        i2 = i6;
                        f7 = f12;
                        str = str2;
                        canvas3 = canvas;
                        m50Var.U1(canvas3, fMeasureText, f12 + fA, l50Var, m50Var.k);
                        if (i2 == 1) {
                            fMeasureText += fC6;
                        }
                    } else {
                        canvas3 = canvas;
                        f6 = f2;
                        f7 = f12;
                        str = str2;
                        i2 = i6;
                        fMeasureText = f6;
                    }
                    if (str != null) {
                        if (z2 && !z) {
                            fMeasureText += i2 == 1 ? fC2 : -fC2;
                        } else if (z) {
                            fMeasureText = f6;
                        }
                        if (i2 == 2) {
                            fMeasureText -= (int) paint.measureText(str);
                        }
                        if (z) {
                            float f15 = f9 + fC + f7;
                            canvas3.drawText(str, fMeasureText, f15 + f9, paint);
                            f8 = f15;
                        } else {
                            canvas3.drawText(str, fMeasureText, f7 + f9, paint);
                            f8 = f7;
                        }
                        f12 = f9 + fC + f8;
                        f13 = 0.0f;
                    } else {
                        f13 = fC6 + f + f13;
                        f12 = f7;
                        z = true;
                    }
                    i7++;
                    i6 = i2;
                    f2 = f6;
                }
                return;
            }
            float f16 = f2;
            ArrayList arrayList2 = k50Var.v;
            ArrayList arrayList3 = k50Var.t;
            ArrayList arrayList4 = k50Var.u;
            int iS4 = ex0.s(i5);
            float f17 = iS4 != 0 ? iS4 != 1 ? iS4 != 2 ? 0.0f : (u61Var.d - f10) - k50Var.s : ((u61Var.d - k50Var.s) / 2.0f) + f10 : f10;
            int length = l50VarArr.length;
            float f18 = f16;
            int i9 = 0;
            int i10 = 0;
            while (i10 < length) {
                float f19 = f17;
                l50 l50Var2 = l50VarArr[i10];
                int i11 = length;
                int i12 = l50Var2.b;
                float f20 = fA;
                String str3 = l50Var2.a;
                float f21 = f18;
                float f22 = l50Var2.c;
                boolean z3 = i12 != 1;
                float fC7 = Float.isNaN(f22) ? fC4 : k41.c(f22);
                if (i10 >= arrayList4.size() || !((Boolean) arrayList4.get(i10)).booleanValue()) {
                    f3 = f21;
                } else {
                    f19 = f9 + fC + f19;
                    f3 = f16;
                }
                if (f3 == f16 && i4 == 2 && i9 < arrayList2.size()) {
                    f3 += (i6 == 2 ? ((xt) arrayList2.get(i9)).g : -((xt) arrayList2.get(i9)).g) / 2.0f;
                    i9++;
                }
                int i13 = i9;
                boolean z4 = str3 == null;
                if (z3) {
                    if (i6 == 2) {
                        f3 -= fC7;
                    }
                    float f23 = f3;
                    ArrayList arrayList5 = arrayList2;
                    i = i10;
                    arrayList = arrayList5;
                    canvas2 = canvas;
                    m50Var.U1(canvas2, f23, f19 + f20, l50Var2, m50Var.k);
                    f3 = i6 == 1 ? f23 + fC7 : f23;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                    i = i10;
                }
                if (z4) {
                    f4 = f;
                    f18 = f3 + (i6 == 2 ? -f4 : f4);
                } else {
                    if (z3) {
                        f3 += i6 == 2 ? -fC2 : fC2;
                    }
                    if (i6 == 2) {
                        f3 -= ((xt) arrayList3.get(i)).g;
                    }
                    canvas2.drawText(str3, f3, f19 + f9, paint);
                    if (i6 == 1) {
                        f3 += ((xt) arrayList3.get(i)).g;
                    }
                    f18 = f3 + (i6 == 2 ? -fC3 : fC3);
                    f4 = f;
                }
                f = f4;
                i10 = i + 1;
                f17 = f19;
                length = i11;
                fA = f20;
                i9 = i13;
                arrayList2 = arrayList;
                m50Var = this;
            }
        }
    }
}
