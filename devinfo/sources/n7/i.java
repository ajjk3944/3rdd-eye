package n7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.f1;
import f7.b0;
import f7.j;
import f7.x;
import i7.p;
import i7.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import x.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends a {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final g7.a J;
    public final g7.a K;
    public final HashMap L;
    public final o M;
    public final ArrayList N;
    public final ArrayList O;
    public final i7.f P;
    public final x Q;
    public final j R;
    public final int S;
    public final i7.f T;
    public s U;
    public final i7.f V;
    public s W;
    public final i7.i X;
    public s Y;
    public final i7.i Z;

    /* renamed from: a0, reason: collision with root package name */
    public s f29828a0;

    /* renamed from: b0, reason: collision with root package name */
    public final i7.f f29829b0;

    /* renamed from: c0, reason: collision with root package name */
    public s f29830c0;

    /* renamed from: d0, reason: collision with root package name */
    public s f29831d0;

    /* renamed from: e0, reason: collision with root package name */
    public final i7.f f29832e0;

    /* renamed from: f0, reason: collision with root package name */
    public final i7.f f29833f0;

    /* renamed from: g0, reason: collision with root package name */
    public final i7.f f29834g0;

    public i(x xVar, d dVar) {
        l7.d dVar2;
        l7.d dVar3;
        l7.a aVar;
        l7.d dVar4;
        l7.a aVar2;
        l7.d dVar5;
        l7.a aVar3;
        f1 f1Var;
        l7.a aVar4;
        f1 f1Var2;
        l7.b bVar;
        f1 f1Var3;
        l7.b bVar2;
        f1 f1Var4;
        l7.a aVar5;
        f1 f1Var5;
        l7.a aVar6;
        super(xVar, dVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        g7.a aVar7 = new g7.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.J = aVar7;
        g7.a aVar8 = new g7.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.K = aVar8;
        this.L = new HashMap();
        this.M = new o((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = xVar;
        this.R = dVar.f29804b;
        i7.f fVar = new i7.f(2, (List) dVar.f29817q.f218b);
        this.P = fVar;
        fVar.a(this);
        e(fVar);
        km.o oVar = dVar.f29818r;
        if (oVar != null && (f1Var5 = (f1) oVar.f28445a) != null && (aVar6 = (l7.a) f1Var5.f1134b) != null) {
            i7.e eVarG = aVar6.g();
            this.T = (i7.f) eVarG;
            eVarG.a(this);
            e(eVarG);
        }
        if (oVar != null && (f1Var4 = (f1) oVar.f28445a) != null && (aVar5 = (l7.a) f1Var4.f1135c) != null) {
            i7.e eVarG2 = aVar5.g();
            this.V = (i7.f) eVarG2;
            eVarG2.a(this);
            e(eVarG2);
        }
        if (oVar != null && (f1Var3 = (f1) oVar.f28445a) != null && (bVar2 = (l7.b) f1Var3.f1136d) != null) {
            i7.i iVarG = bVar2.g();
            this.X = iVarG;
            iVarG.a(this);
            e(iVarG);
        }
        if (oVar != null && (f1Var2 = (f1) oVar.f28445a) != null && (bVar = (l7.b) f1Var2.f1137e) != null) {
            i7.i iVarG2 = bVar.g();
            this.Z = iVarG2;
            iVarG2.a(this);
            e(iVarG2);
        }
        if (oVar != null && (f1Var = (f1) oVar.f28445a) != null && (aVar4 = (l7.a) f1Var.f1138f) != null) {
            i7.e eVarG3 = aVar4.g();
            this.f29829b0 = (i7.f) eVarG3;
            eVarG3.a(this);
            e(eVarG3);
        }
        if (oVar != null && (dVar5 = (l7.d) oVar.f28446b) != null && (aVar3 = (l7.a) dVar5.f28604b) != null) {
            i7.e eVarG4 = aVar3.g();
            this.f29832e0 = (i7.f) eVarG4;
            eVarG4.a(this);
            e(eVarG4);
        }
        if (oVar != null && (dVar4 = (l7.d) oVar.f28446b) != null && (aVar2 = (l7.a) dVar4.f28605c) != null) {
            i7.e eVarG5 = aVar2.g();
            this.f29833f0 = (i7.f) eVarG5;
            eVarG5.a(this);
            e(eVarG5);
        }
        if (oVar != null && (dVar3 = (l7.d) oVar.f28446b) != null && (aVar = (l7.a) dVar3.f28606d) != null) {
            i7.e eVarG6 = aVar.g();
            this.f29834g0 = (i7.f) eVarG6;
            eVarG6.a(this);
            e(eVarG6);
        }
        if (oVar == null || (dVar2 = (l7.d) oVar.f28446b) == null) {
            return;
        }
        this.S = dVar2.f28603a;
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

    @Override // n7.a, h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        j jVar = this.R;
        rectF.set(0.0f, 0.0f, jVar.f23758k.width(), jVar.f23758k.height());
    }

    @Override // n7.a, k7.f
    public final void f(Object obj, km.o oVar) {
        super.f(obj, oVar);
        PointF pointF = b0.f23692a;
        if (obj == 1) {
            s sVar = this.U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(null, oVar);
            this.U = sVar2;
            sVar2.a(this);
            e(this.U);
            return;
        }
        if (obj == 2) {
            s sVar3 = this.W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(null, oVar);
            this.W = sVar4;
            sVar4.a(this);
            e(this.W);
            return;
        }
        if (obj == b0.f23706q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(null, oVar);
            this.Y = sVar6;
            sVar6.a(this);
            e(this.Y);
            return;
        }
        if (obj == b0.f23707r) {
            s sVar7 = this.f29828a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(null, oVar);
            this.f29828a0 = sVar8;
            sVar8.a(this);
            e(this.f29828a0);
            return;
        }
        if (obj == b0.D) {
            s sVar9 = this.f29830c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(null, oVar);
            this.f29830c0 = sVar10;
            sVar10.a(this);
            e(this.f29830c0);
            return;
        }
        if (obj != b0.K) {
            if (obj == b0.M) {
                i7.f fVar = this.P;
                fVar.getClass();
                fVar.j(new p(new s7.b(), oVar, new k7.b()));
                return;
            }
            return;
        }
        s sVar11 = this.f29831d0;
        if (sVar11 != null) {
            o(sVar11);
        }
        s sVar12 = new s(null, oVar);
        this.f29831d0 = sVar12;
        sVar12.a(this);
        e(this.f29831d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0515, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02db  */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, r7.b r34) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.i.k(android.graphics.Canvas, android.graphics.Matrix, int, r7.b):void");
    }

    public final String s(int i4, String str) {
        int iCodePointAt = str.codePointAt(i4);
        int iCharCount = Character.charCount(iCodePointAt) + i4;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        o oVar = this.M;
        if (oVar.g(j) >= 0) {
            return (String) oVar.e(j);
        }
        StringBuilder sb2 = this.D;
        sb2.setLength(0);
        while (i4 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i4);
            sb2.appendCodePoint(iCodePointAt3);
            i4 += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        oVar.i(string, j);
        return string;
    }

    public final void t(k7.b bVar, int i4, int i10) {
        s sVar = this.U;
        g7.a aVar = this.J;
        if (sVar != null) {
            aVar.setColor(((Integer) sVar.e()).intValue());
        } else {
            i7.f fVar = this.T;
            if (fVar == null || !x(i10)) {
                aVar.setColor(bVar.f28047h);
            } else {
                aVar.setColor(((Integer) fVar.e()).intValue());
            }
        }
        s sVar2 = this.W;
        g7.a aVar2 = this.K;
        if (sVar2 != null) {
            aVar2.setColor(((Integer) sVar2.e()).intValue());
        } else {
            i7.f fVar2 = this.V;
            if (fVar2 == null || !x(i10)) {
                aVar2.setColor(bVar.f28048i);
            } else {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        i7.e eVar = this.f29799w.f25922p;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.e()).intValue();
        i7.f fVar3 = this.f29829b0;
        if (fVar3 != null && x(i10)) {
            iIntValue = ((Integer) fVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i4) / 255.0f);
        aVar.setAlpha(iRound);
        aVar2.setAlpha(iRound);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            aVar2.setStrokeWidth(((Float) sVar3.e()).floatValue());
            return;
        }
        i7.i iVar = this.X;
        if (iVar == null || !x(i10)) {
            aVar2.setStrokeWidth(r7.j.c() * bVar.j);
        } else {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    public final h w(int i4) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i4; size++) {
            h hVar = new h();
            hVar.f29826a = "";
            hVar.f29827b = 0.0f;
            arrayList.add(hVar);
        }
        return (h) arrayList.get(i4 - 1);
    }

    public final boolean x(int i4) {
        i7.f fVar;
        int length = ((k7.b) this.P.e()).f28041a.length();
        i7.f fVar2 = this.f29832e0;
        if (fVar2 == null || (fVar = this.f29833f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int iMax = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        i7.f fVar3 = this.f29834g0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == 2) {
            return i4 >= iMin && i4 < iMax;
        }
        float f10 = (i4 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, k7.b bVar, int i4, float f10) {
        PointF pointF = bVar.f28050l;
        PointF pointF2 = bVar.f28051m;
        float fC = r7.j.c();
        float f11 = (i4 * bVar.f28046f * fC) + (pointF == null ? 0.0f : (bVar.f28046f * fC) + pointF.y);
        if (this.Q.f23819u && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f28043c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int iC = i3.e.c(bVar.f28044d);
        if (iC == 0) {
            canvas.translate(f12, f11);
            return true;
        }
        if (iC == 1) {
            canvas.translate((f12 + f13) - f10, f11);
            return true;
        }
        if (iC != 2) {
            return true;
        }
        canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        return true;
    }

    public final List z(String str, float f10, k7.c cVar, float f11, float f12, boolean z3) {
        float fMeasureText;
        int i4 = 0;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z3) {
                k7.d dVar = (k7.d) this.R.f23756h.d(k7.d.a(cCharAt, cVar.f28052a, cVar.f28054c));
                if (dVar != null) {
                    fMeasureText = (r7.j.c() * ((float) dVar.f28058c) * f11) + f12;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z10 = true;
                f15 = fMeasureText;
            } else if (z10) {
                z10 = false;
                i11 = i12;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i4++;
                h hVarW = w(i4);
                if (i11 == i10) {
                    hVarW.f29826a = str.substring(i10, i12).trim();
                    hVarW.f29827b = (f13 - fMeasureText) - ((r10.length() - r8.length()) * f15);
                    i10 = i12;
                    i11 = i10;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    hVarW.f29826a = str.substring(i10, i11 - 1).trim();
                    hVarW.f29827b = ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15;
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > 0.0f) {
            i4++;
            h hVarW2 = w(i4);
            hVarW2.f29826a = str.substring(i10);
            hVarW2.f29827b = f13;
        }
        return this.O.subList(0, i4);
    }
}
