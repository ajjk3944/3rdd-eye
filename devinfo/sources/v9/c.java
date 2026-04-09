package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import o9.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public Paint f35987c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f35988d;

    /* renamed from: e, reason: collision with root package name */
    public n9.e f35989e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f35990f;
    public Paint.FontMetrics g;

    /* renamed from: h, reason: collision with root package name */
    public Path f35991h;

    public final void C(o9.b bVar) {
        ArrayList arrayList;
        String str;
        float f10;
        float f11;
        Paint paint = this.f35987c;
        n9.e eVar = this.f35989e;
        eVar.getClass();
        ArrayList arrayList2 = this.f35990f;
        arrayList2.clear();
        int i4 = 0;
        while (true) {
            ArrayList arrayList3 = bVar.f30440i;
            if (i4 >= (arrayList3 == null ? 0 : arrayList3.size())) {
                break;
            }
            s9.a aVarD = bVar.d(i4);
            o9.c cVar = (o9.c) aVarD;
            ArrayList arrayList4 = cVar.f30441a;
            int size = cVar.j.size();
            if (aVarD instanceof o9.h) {
                o9.h hVar = (o9.h) aVarD;
                for (int i10 = 0; i10 < arrayList4.size() && i10 < size; i10++) {
                    arrayList2.add(new n9.f(((i) hVar.d(i10)).f30478d, 3, ((Integer) arrayList4.get(i10)).intValue()));
                }
                if (hVar.f30443c != null) {
                    arrayList2.add(new n9.f(cVar.f30443c, 1, 1122867));
                }
            } else {
                int i11 = 0;
                while (i11 < arrayList4.size() && i11 < size) {
                    arrayList2.add(new n9.f((i11 >= arrayList4.size() - 1 || i11 >= size + (-1)) ? ((o9.c) bVar.d(i4)).f30443c : null, 3, ((Integer) arrayList4.get(i11)).intValue()));
                    i11++;
                }
            }
            i4++;
        }
        eVar.f29856f = (n9.f[]) arrayList2.toArray(new n9.f[arrayList2.size()]);
        paint.setTextSize(eVar.f29853d);
        paint.setColor(eVar.f29854e);
        w9.h hVar2 = (w9.h) this.f218b;
        ArrayList arrayList5 = eVar.f29870v;
        ArrayList arrayList6 = eVar.f29869u;
        ArrayList arrayList7 = eVar.f29871w;
        float f12 = eVar.f29860l;
        float fC = w9.g.c(f12);
        float fC2 = w9.g.c(eVar.f29864p);
        float f13 = eVar.f29863o;
        float fC3 = w9.g.c(f13);
        float fC4 = w9.g.c(eVar.f29862n);
        float fC5 = w9.g.c(0.0f);
        n9.f[] fVarArr = eVar.f29856f;
        int length = fVarArr.length;
        w9.g.c(f13);
        n9.f[] fVarArr2 = eVar.f29856f;
        int length2 = fVarArr2.length;
        int i12 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            if (i12 >= length2) {
                break;
            }
            int i13 = length2;
            n9.f fVar = fVarArr2[i12];
            fVar.getClass();
            float fC6 = w9.g.c(Float.isNaN(Float.NaN) ? f12 : Float.NaN);
            if (fC6 > f15) {
                f15 = fC6;
            }
            String str2 = fVar.f29872a;
            if (str2 != null) {
                float fMeasureText = (int) paint.measureText(str2);
                if (fMeasureText > f14) {
                    f14 = fMeasureText;
                }
            }
            i12++;
            length2 = i13;
        }
        n9.f[] fVarArr3 = eVar.f29856f;
        int length3 = fVarArr3.length;
        int i14 = 0;
        float f16 = 0.0f;
        while (i14 < length3) {
            int i15 = i14;
            String str3 = fVarArr3[i15].f29872a;
            if (str3 != null) {
                float fA = w9.g.a(paint, str3);
                if (fA > f16) {
                    f16 = fA;
                }
            }
            i14 = i15 + 1;
        }
        eVar.f29868t = f16;
        int iC = i3.e.c(eVar.f29858i);
        if (iC != 0) {
            int i16 = 1;
            if (iC == 1) {
                Paint.FontMetrics fontMetrics = w9.g.f36560f;
                paint.getFontMetrics(fontMetrics);
                float f17 = fontMetrics.descent - fontMetrics.ascent;
                float fMax = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                int i17 = 0;
                boolean z3 = false;
                while (i17 < length) {
                    n9.f fVar2 = fVarArr[i17];
                    float f20 = f17;
                    boolean z10 = fVar2.f29873b != i16;
                    float fC7 = Float.isNaN(Float.NaN) ? fC : w9.g.c(Float.NaN);
                    String str4 = fVar2.f29872a;
                    if (!z3) {
                        f19 = 0.0f;
                    }
                    if (z10) {
                        if (z3) {
                            f19 += fC2;
                        }
                        f19 += fC7;
                    }
                    if (str4 != null) {
                        if (z10 && !z3) {
                            f11 = f19 + fC3;
                        } else if (z3) {
                            fMax = Math.max(fMax, f19);
                            f18 += f20 + fC5;
                            f11 = 0.0f;
                            z3 = false;
                        } else {
                            f11 = f19;
                        }
                        float fMeasureText2 = f11 + ((int) paint.measureText(str4));
                        if (i17 < length - 1) {
                            f18 = f20 + fC5 + f18;
                        }
                        f19 = fMeasureText2;
                    } else {
                        f19 += fC7;
                        if (i17 < length - 1) {
                            f19 += fC2;
                        }
                        z3 = true;
                    }
                    fMax = Math.max(fMax, f19);
                    i17++;
                    f17 = f20;
                    i16 = 1;
                }
                eVar.f29866r = fMax;
                eVar.f29867s = f18;
            }
        } else {
            Paint.FontMetrics fontMetrics2 = w9.g.f36560f;
            paint.getFontMetrics(fontMetrics2);
            float f21 = fontMetrics2.descent - fontMetrics2.ascent;
            paint.getFontMetrics(fontMetrics2);
            float f22 = (fontMetrics2.ascent - fontMetrics2.top) + fontMetrics2.bottom + fC5;
            hVar2.f36564b.width();
            arrayList5.clear();
            arrayList6.clear();
            arrayList7.clear();
            int i18 = -1;
            int i19 = 0;
            float fMax2 = 0.0f;
            float f23 = 0.0f;
            float f24 = 0.0f;
            while (i19 < length) {
                n9.f fVar3 = fVarArr[i19];
                int i20 = length;
                float f25 = fC2;
                boolean z11 = fVar3.f29873b != 1;
                float fC8 = Float.isNaN(Float.NaN) ? fC : w9.g.c(Float.NaN);
                String str5 = fVar3.f29872a;
                boolean z12 = z11;
                arrayList5.add(Boolean.FALSE);
                float f26 = i18 == -1 ? 0.0f : f23 + f25;
                if (str5 != null) {
                    arrayList = arrayList5;
                    arrayList6.add(w9.g.b(paint, str5));
                    f10 = f26 + (z12 ? fC3 + fC8 : 0.0f) + ((w9.b) arrayList6.get(i19)).f36540b;
                    str = str5;
                } else {
                    arrayList = arrayList5;
                    w9.b bVar2 = (w9.b) w9.b.f36539d.b();
                    str = str5;
                    bVar2.f36540b = 0.0f;
                    bVar2.f36541c = 0.0f;
                    arrayList6.add(bVar2);
                    if (!z12) {
                        fC8 = 0.0f;
                    }
                    f10 = f26 + fC8;
                    if (i18 == -1) {
                        i18 = i19;
                    }
                }
                if (str != null || i19 == i20 - 1) {
                    float f27 = (f24 == 0.0f ? 0.0f : fC4) + f10 + f24;
                    if (i19 == i20 - 1) {
                        w9.b bVar3 = (w9.b) w9.b.f36539d.b();
                        bVar3.f36540b = f27;
                        bVar3.f36541c = f21;
                        arrayList7.add(bVar3);
                        fMax2 = Math.max(fMax2, f27);
                    }
                    f24 = f27;
                }
                if (str != null) {
                    i18 = -1;
                }
                i19++;
                arrayList5 = arrayList;
                fC2 = f25;
                f23 = f10;
                length = i20;
            }
            eVar.f29866r = fMax2;
            eVar.f29867s = (f22 * (arrayList7.size() == 0 ? 0 : arrayList7.size() - 1)) + (f21 * arrayList7.size());
        }
        eVar.f29867s += eVar.f29852c;
        eVar.f29866r += eVar.f29851b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.graphics.Canvas r9, float r10, float r11, n9.f r12, n9.e r13) {
        /*
            r8 = this;
            android.graphics.Path r0 = r8.f35991h
            android.graphics.Paint r6 = r8.f35988d
            int r1 = r12.f29874c
            r2 = 1122868(0x112234, float:1.573473E-39)
            if (r1 == r2) goto L92
            r2 = 1122867(0x112233, float:1.573472E-39)
            if (r1 == r2) goto L92
            if (r1 != 0) goto L14
            goto L92
        L14:
            int r7 = r9.save()
            int r12 = r12.f29873b
            r2 = 3
            if (r12 != r2) goto L1f
            int r12 = r13.f29859k
        L1f:
            r6.setColor(r1)
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 == 0) goto L2d
            float r3 = r13.f29860l
            goto L2e
        L2d:
            r3 = r1
        L2e:
            float r3 = w9.g.c(r3)
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r3 / r4
            int r12 = i3.e.c(r12)
            r5 = 2
            if (r12 == r5) goto L70
            if (r12 == r2) goto L73
            r2 = 4
            if (r12 == r2) goto L70
            r2 = 5
            if (r12 == r2) goto L47
        L45:
            r1 = r9
            goto L8f
        L47:
            boolean r12 = java.lang.Float.isNaN(r1)
            if (r12 == 0) goto L4f
            float r1 = r13.f29861m
        L4f:
            float r12 = w9.g.c(r1)
            r13.getClass()
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r13)
            r6.setStrokeWidth(r12)
            r12 = 0
            r6.setPathEffect(r12)
            r0.reset()
            r0.moveTo(r10, r11)
            float r10 = r10 + r3
            r0.lineTo(r10, r11)
            r9.drawPath(r0, r6)
            goto L45
        L70:
            r1 = r9
            r2 = r10
            goto L85
        L73:
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL
            r6.setStyle(r12)
            r12 = r3
            float r3 = r11 - r4
            float r12 = r12 + r10
            float r5 = r11 + r4
            r1 = r9
            r2 = r10
            r4 = r12
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L8f
        L85:
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r6.setStyle(r9)
            float r10 = r2 + r4
            r1.drawCircle(r10, r11, r4, r6)
        L8f:
            r1.restoreToCount(r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.c.D(android.graphics.Canvas, float, float, n9.f, n9.e):void");
    }

    public final void E(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        ArrayList arrayList;
        int i4;
        float f12;
        float f13;
        Canvas canvas3;
        String str;
        float f14;
        float f15;
        int i10;
        int i11;
        float fMeasureText;
        float fWidth;
        double d10;
        double d11;
        c cVar = this;
        Paint.FontMetrics fontMetrics = cVar.g;
        Paint paint = cVar.f35987c;
        w9.h hVar = (w9.h) cVar.f218b;
        n9.e eVar = cVar.f35989e;
        if (eVar.f29850a) {
            paint.setTextSize(eVar.f29853d);
            paint.setColor(eVar.f29854e);
            DisplayMetrics displayMetrics = w9.g.f36555a;
            paint.getFontMetrics(fontMetrics);
            float f16 = fontMetrics.descent - fontMetrics.ascent;
            paint.getFontMetrics(fontMetrics);
            float fC = w9.g.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f16 - (w9.g.a(paint, "ABC") / 2.0f);
            n9.f[] fVarArr = eVar.f29856f;
            float fC2 = w9.g.c(eVar.f29863o);
            float fC3 = w9.g.c(eVar.f29862n);
            int i12 = eVar.f29858i;
            int i13 = eVar.g;
            int i14 = eVar.f29857h;
            int i15 = eVar.j;
            float fC4 = w9.g.c(eVar.f29860l);
            float fC5 = w9.g.c(eVar.f29864p);
            float f17 = eVar.f29852c;
            float f18 = eVar.f29851b;
            int iC = i3.e.c(i13);
            if (iC == 0) {
                f10 = fC5;
                if (i12 != 2) {
                    f18 += hVar.f36564b.left;
                }
                f11 = i15 == 2 ? eVar.f29866r + f18 : f18;
            } else if (iC == 1) {
                if (i12 == 2) {
                    fWidth = hVar.f36565c / 2.0f;
                } else {
                    RectF rectF = hVar.f36564b;
                    fWidth = (rectF.width() / 2.0f) + rectF.left;
                }
                f11 = fWidth + (i15 == 1 ? f18 : -f18);
                if (i12 == 2) {
                    f10 = fC5;
                    double d12 = f11;
                    if (i15 == 1) {
                        d10 = d12;
                        d11 = ((-eVar.f29866r) / 2.0d) + f18;
                    } else {
                        d10 = d12;
                        d11 = (eVar.f29866r / 2.0d) - f18;
                    }
                    f11 = (float) (d10 + d11);
                } else {
                    f10 = fC5;
                }
            } else if (iC != 2) {
                f10 = fC5;
                f11 = 0.0f;
            } else {
                f11 = (i12 == 2 ? hVar.f36565c : hVar.f36564b.right) - f18;
                if (i15 == 1) {
                    f11 -= eVar.f29866r;
                }
                f10 = fC5;
            }
            int iC2 = i3.e.c(i12);
            float f19 = Float.NaN;
            if (iC2 != 0) {
                if (iC2 != 1) {
                    return;
                }
                int iC3 = i3.e.c(i14);
                if (iC3 == 0) {
                    f13 = (i13 == 2 ? 0.0f : hVar.f36564b.top) + f17;
                } else if (iC3 == 1) {
                    f13 = ((hVar.f36566d / 2.0f) - (eVar.f29867s / 2.0f)) + eVar.f29852c;
                } else if (iC3 != 2) {
                    f13 = 0.0f;
                } else {
                    f13 = (i13 == 2 ? hVar.f36566d : hVar.f36564b.bottom) - (eVar.f29867s + f17);
                }
                float f20 = f13;
                boolean z3 = false;
                int i16 = 0;
                float f21 = 0.0f;
                while (i16 < fVarArr.length) {
                    n9.f fVar = fVarArr[i16];
                    int i17 = fVar.f29873b;
                    String str2 = fVar.f29872a;
                    boolean z10 = i17 != 1;
                    float fC6 = Float.isNaN(f19) ? fC4 : w9.g.c(f19);
                    if (z10) {
                        float f22 = i15 == 1 ? f11 + f21 : f11 - (fC6 - f21);
                        str = str2;
                        f14 = f11;
                        f15 = f19;
                        i10 = 1;
                        i11 = i15;
                        fMeasureText = f22;
                        canvas3 = canvas;
                        cVar.D(canvas3, fMeasureText, f20 + fA, fVar, cVar.f35989e);
                        if (i11 == 1) {
                            fMeasureText += fC6;
                        }
                    } else {
                        canvas3 = canvas;
                        str = str2;
                        f14 = f11;
                        f15 = f19;
                        i10 = 1;
                        i11 = i15;
                        fMeasureText = f14;
                    }
                    if (str != null) {
                        if (z10 && !z3) {
                            fMeasureText += i11 == i10 ? fC2 : -fC2;
                        } else if (z3) {
                            fMeasureText = f14;
                        }
                        if (i11 == 2) {
                            fMeasureText -= (int) paint.measureText(str);
                        }
                        if (z3) {
                            f20 += f16 + fC;
                            canvas3.drawText(str, fMeasureText, f20 + f16, paint);
                        } else {
                            canvas3.drawText(str, fMeasureText, f20 + f16, paint);
                        }
                        f20 = f16 + fC + f20;
                        f21 = 0.0f;
                    } else {
                        f21 = fC6 + f10 + f21;
                        z3 = true;
                    }
                    i16++;
                    i15 = i11;
                    f19 = f15;
                    f11 = f14;
                }
                return;
            }
            float f23 = f11;
            ArrayList arrayList2 = eVar.f29871w;
            ArrayList arrayList3 = eVar.f29869u;
            ArrayList arrayList4 = eVar.f29870v;
            int iC4 = i3.e.c(i14);
            float f24 = iC4 != 0 ? iC4 != 1 ? iC4 != 2 ? 0.0f : (hVar.f36566d - f17) - eVar.f29867s : ((hVar.f36566d - eVar.f29867s) / 2.0f) + f17 : f17;
            int length = fVarArr.length;
            float f25 = f23;
            int i18 = 0;
            int i19 = 0;
            while (i19 < length) {
                float f26 = f24;
                n9.f fVar2 = fVarArr[i19];
                int i20 = length;
                int i21 = fVar2.f29873b;
                float f27 = fA;
                String str3 = fVar2.f29872a;
                boolean z11 = i21 != 1;
                float fC7 = Float.isNaN(Float.NaN) ? fC4 : w9.g.c(Float.NaN);
                if (i19 < arrayList4.size() && ((Boolean) arrayList4.get(i19)).booleanValue()) {
                    f26 = f16 + fC + f26;
                    f25 = f23;
                }
                if (f25 == f23 && i13 == 2 && i18 < arrayList2.size()) {
                    f25 += (i15 == 2 ? ((w9.b) arrayList2.get(i18)).f36540b : -((w9.b) arrayList2.get(i18)).f36540b) / 2.0f;
                    i18++;
                }
                int i22 = i18;
                boolean z12 = str3 == null;
                if (z11) {
                    if (i15 == 2) {
                        f25 -= fC7;
                    }
                    float f28 = f25;
                    ArrayList arrayList5 = arrayList2;
                    i4 = i19;
                    arrayList = arrayList5;
                    canvas2 = canvas;
                    cVar.D(canvas2, f28, f26 + f27, fVar2, cVar.f35989e);
                    f25 = i15 == 1 ? f28 + fC7 : f28;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                    i4 = i19;
                }
                if (z12) {
                    f12 = f10;
                    f25 += i15 == 2 ? -f12 : f12;
                } else {
                    if (z11) {
                        f25 += i15 == 2 ? -fC2 : fC2;
                    }
                    if (i15 == 2) {
                        f25 -= ((w9.b) arrayList3.get(i4)).f36540b;
                    }
                    canvas2.drawText(str3, f25, f26 + f16, paint);
                    if (i15 == 1) {
                        f25 += ((w9.b) arrayList3.get(i4)).f36540b;
                    }
                    f25 += i15 == 2 ? -fC3 : fC3;
                    f12 = f10;
                }
                f10 = f12;
                i19 = i4 + 1;
                f24 = f26;
                length = i20;
                fA = f27;
                arrayList2 = arrayList;
                i18 = i22;
                cVar = this;
            }
        }
    }
}
