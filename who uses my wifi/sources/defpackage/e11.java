package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e11 extends da {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final d50 J;
    public final d50 K;
    public final HashMap L;
    public final l80 M;
    public final ArrayList N;
    public final ArrayList O;
    public final fg P;
    public final i90 Q;
    public final u80 R;
    public final int S;
    public final fg T;
    public m41 U;
    public final fg V;
    public m41 W;
    public final pu X;
    public m41 Y;
    public final pu Z;
    public m41 a0;
    public final fg b0;
    public m41 c0;
    public m41 d0;
    public final fg e0;
    public final fg f0;
    public final fg g0;

    public e11(i90 i90Var, f50 f50Var) {
        r2 r2Var;
        r2 r2Var2;
        b4 b4Var;
        r2 r2Var3;
        b4 b4Var2;
        r2 r2Var4;
        b4 b4Var3;
        g4 g4Var;
        b4 b4Var4;
        g4 g4Var2;
        c4 c4Var;
        g4 g4Var3;
        c4 c4Var2;
        g4 g4Var4;
        b4 b4Var5;
        g4 g4Var5;
        b4 b4Var6;
        super(i90Var, f50Var);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        d50 d50Var = new d50(1, 1);
        d50Var.setStyle(Paint.Style.FILL);
        this.J = d50Var;
        d50 d50Var2 = new d50(1, 2);
        d50Var2.setStyle(Paint.Style.STROKE);
        this.K = d50Var2;
        this.L = new HashMap();
        this.M = new l80();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = i90Var;
        this.R = f50Var.b;
        fg fgVar = new fg(2, (List) f50Var.q.g);
        this.P = fgVar;
        fgVar.a(this);
        e(fgVar);
        gw3 gw3Var = f50Var.r;
        if (gw3Var != null && (g4Var5 = (g4) gw3Var.g) != null && (b4Var6 = (b4) g4Var5.g) != null) {
            ba baVarQ0 = b4Var6.Q0();
            this.T = (fg) baVarQ0;
            baVarQ0.a(this);
            e(baVarQ0);
        }
        if (gw3Var != null && (g4Var4 = (g4) gw3Var.g) != null && (b4Var5 = (b4) g4Var4.j) != null) {
            ba baVarQ02 = b4Var5.Q0();
            this.V = (fg) baVarQ02;
            baVarQ02.a(this);
            e(baVarQ02);
        }
        if (gw3Var != null && (g4Var3 = (g4) gw3Var.g) != null && (c4Var2 = (c4) g4Var3.h) != null) {
            pu puVarQ0 = c4Var2.Q0();
            this.X = puVarQ0;
            puVarQ0.a(this);
            e(puVarQ0);
        }
        if (gw3Var != null && (g4Var2 = (g4) gw3Var.g) != null && (c4Var = (c4) g4Var2.i) != null) {
            pu puVarQ02 = c4Var.Q0();
            this.Z = puVarQ02;
            puVarQ02.a(this);
            e(puVarQ02);
        }
        if (gw3Var != null && (g4Var = (g4) gw3Var.g) != null && (b4Var4 = (b4) g4Var.k) != null) {
            ba baVarQ03 = b4Var4.Q0();
            this.b0 = (fg) baVarQ03;
            baVarQ03.a(this);
            e(baVarQ03);
        }
        if (gw3Var != null && (r2Var4 = (r2) gw3Var.h) != null && (b4Var3 = (b4) r2Var4.h) != null) {
            ba baVarQ04 = b4Var3.Q0();
            this.e0 = (fg) baVarQ04;
            baVarQ04.a(this);
            e(baVarQ04);
        }
        if (gw3Var != null && (r2Var3 = (r2) gw3Var.h) != null && (b4Var2 = (b4) r2Var3.i) != null) {
            ba baVarQ05 = b4Var2.Q0();
            this.f0 = (fg) baVarQ05;
            baVarQ05.a(this);
            e(baVarQ05);
        }
        if (gw3Var != null && (r2Var2 = (r2) gw3Var.h) != null && (b4Var = (b4) r2Var2.j) != null) {
            ba baVarQ06 = b4Var.Q0();
            this.g0 = (fg) baVarQ06;
            baVarQ06.a(this);
            e(baVarQ06);
        }
        if (gw3Var == null || (r2Var = (r2) gw3Var.h) == null) {
            return;
        }
        this.S = r2Var.g;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.da, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        PointF pointF = n90.a;
        if (obj == 1) {
            m41 m41Var = this.U;
            if (m41Var != null) {
                o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.U = m41Var2;
            m41Var2.a(this);
            e(this.U);
            return;
        }
        if (obj == 2) {
            m41 m41Var3 = this.W;
            if (m41Var3 != null) {
                o(m41Var3);
            }
            m41 m41Var4 = new m41(null, vq2Var);
            this.W = m41Var4;
            m41Var4.a(this);
            e(this.W);
            return;
        }
        if (obj == n90.n) {
            m41 m41Var5 = this.Y;
            if (m41Var5 != null) {
                o(m41Var5);
            }
            m41 m41Var6 = new m41(null, vq2Var);
            this.Y = m41Var6;
            m41Var6.a(this);
            e(this.Y);
            return;
        }
        if (obj == n90.o) {
            m41 m41Var7 = this.a0;
            if (m41Var7 != null) {
                o(m41Var7);
            }
            m41 m41Var8 = new m41(null, vq2Var);
            this.a0 = m41Var8;
            m41Var8.a(this);
            e(this.a0);
            return;
        }
        if (obj == n90.A) {
            m41 m41Var9 = this.c0;
            if (m41Var9 != null) {
                o(m41Var9);
            }
            m41 m41Var10 = new m41(null, vq2Var);
            this.c0 = m41Var10;
            m41Var10.a(this);
            e(this.c0);
            return;
        }
        if (obj != n90.H) {
            if (obj == n90.J) {
                fg fgVar = this.P;
                fgVar.getClass();
                fgVar.j(new c11(new k90(), vq2Var, new pp()));
                return;
            }
            return;
        }
        m41 m41Var11 = this.d0;
        if (m41Var11 != null) {
            o(m41Var11);
        }
        m41 m41Var12 = new m41(null, vq2Var);
        this.d0 = m41Var12;
        m41Var12.a(this);
        e(this.d0);
    }

    @Override // defpackage.da, defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        u80 u80Var = this.R;
        rectF.set(0.0f, 0.0f, u80Var.k.width(), u80Var.k.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0527, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    @Override // defpackage.da
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, defpackage.mq r34) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.k(android.graphics.Canvas, android.graphics.Matrix, int, mq):void");
    }

    public final String s(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        l80 l80Var = this.M;
        if (l80Var.c(j) >= 0) {
            return (String) l80Var.b(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        l80Var.e(j, string);
        return string;
    }

    public final void t(pp ppVar, int i, int i2) {
        m41 m41Var = this.U;
        d50 d50Var = this.J;
        if (m41Var != null) {
            d50Var.setColor(((Integer) m41Var.e()).intValue());
        } else {
            fg fgVar = this.T;
            if (fgVar == null || !x(i2)) {
                d50Var.setColor(ppVar.h);
            } else {
                d50Var.setColor(((Integer) fgVar.e()).intValue());
            }
        }
        m41 m41Var2 = this.W;
        d50 d50Var2 = this.K;
        if (m41Var2 != null) {
            d50Var2.setColor(((Integer) m41Var2.e()).intValue());
        } else {
            fg fgVar2 = this.V;
            if (fgVar2 == null || !x(i2)) {
                d50Var2.setColor(ppVar.i);
            } else {
                d50Var2.setColor(((Integer) fgVar2.e()).intValue());
            }
        }
        ba baVar = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = baVar == null ? 100 : ((Integer) baVar.e()).intValue();
        fg fgVar3 = this.b0;
        if (fgVar3 != null && x(i2)) {
            iIntValue = ((Integer) fgVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        d50Var.setAlpha(iRound);
        d50Var2.setAlpha(iRound);
        m41 m41Var3 = this.Y;
        if (m41Var3 != null) {
            d50Var2.setStrokeWidth(((Float) m41Var3.e()).floatValue());
            return;
        }
        pu puVar = this.X;
        if (puVar == null || !x(i2)) {
            d50Var2.setStrokeWidth(l41.c() * ppVar.j);
        } else {
            d50Var2.setStrokeWidth(((Float) puVar.e()).floatValue());
        }
    }

    public final d11 w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            d11 d11Var = new d11();
            d11Var.a = "";
            d11Var.b = 0.0f;
            arrayList.add(d11Var);
        }
        return (d11) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        fg fgVar;
        int length = ((pp) this.P.e()).a.length();
        fg fgVar2 = this.e0;
        if (fgVar2 == null || (fgVar = this.f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fgVar2.e()).intValue(), ((Integer) fgVar.e()).intValue());
        int iMax = Math.max(((Integer) fgVar2.e()).intValue(), ((Integer) fgVar.e()).intValue());
        fg fgVar3 = this.g0;
        if (fgVar3 != null) {
            int iIntValue = ((Integer) fgVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean y(Canvas canvas, pp ppVar, int i, float f) {
        PointF pointF = ppVar.l;
        PointF pointF2 = ppVar.m;
        float fC = l41.c();
        float f2 = (i * ppVar.f * fC) + (pointF == null ? 0.0f : (ppVar.f * fC) + pointF.y);
        if (this.Q.z && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + ppVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iS = ex0.s(ppVar.d);
        if (iS == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iS == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iS != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List z(String str, float f, gv gvVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                iv ivVar = (iv) this.R.h.b(iv.a(cCharAt, gvVar.a, gvVar.c));
                if (ivVar != null) {
                    fMeasureText = (l41.c() * ((float) ivVar.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                d11 d11VarW = w(i);
                if (i3 == i2) {
                    d11VarW.a = str.substring(i2, i4).trim();
                    d11VarW.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    d11VarW.a = str.substring(i2, i3 - 1).trim();
                    d11VarW.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            d11 d11VarW2 = w(i);
            d11VarW2.a = str.substring(i2);
            d11VarW2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
