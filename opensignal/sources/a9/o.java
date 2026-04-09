package a9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ee.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r8.v;
import r8.z;
import u8.r;
import z8.x;

/* loaded from: classes.dex */
public final class o extends b {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final l J;
    public final l K;
    public final HashMap L;
    public final u.o M;
    public final ArrayList N;
    public final ArrayList O;
    public final u8.e P;
    public final v Q;
    public final r8.h R;
    public final x S;
    public final u8.e T;
    public r U;
    public final u8.e V;
    public r W;
    public final u8.h X;
    public r Y;
    public final u8.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public r f275a0;

    /* renamed from: b0, reason: collision with root package name */
    public final u8.e f276b0;

    /* renamed from: c0, reason: collision with root package name */
    public r f277c0;

    /* renamed from: d0, reason: collision with root package name */
    public r f278d0;

    /* renamed from: e0, reason: collision with root package name */
    public final u8.e f279e0;

    /* renamed from: f0, reason: collision with root package name */
    public final u8.e f280f0;

    /* renamed from: g0, reason: collision with root package name */
    public final u8.e f281g0;

    public o(v vVar, h hVar) {
        js.e eVar;
        js.e eVar2;
        y8.a aVar;
        js.e eVar3;
        y8.a aVar2;
        js.e eVar4;
        y8.a aVar3;
        tv.b bVar;
        y8.a aVar4;
        tv.b bVar2;
        y8.b bVar3;
        tv.b bVar4;
        y8.b bVar5;
        tv.b bVar6;
        y8.a aVar5;
        tv.b bVar7;
        y8.a aVar6;
        super(vVar, hVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        l lVar = new l(1, 0);
        lVar.setStyle(Paint.Style.FILL);
        this.J = lVar;
        l lVar2 = new l(1, 1);
        lVar2.setStyle(Paint.Style.STROKE);
        this.K = lVar2;
        this.L = new HashMap();
        this.M = new u.o((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = x.INDEX;
        this.Q = vVar;
        this.R = hVar.f249b;
        u8.e eVar5 = new u8.e(2, (List) hVar.f262q.f1504d);
        this.P = eVar5;
        eVar5.a(this);
        e(eVar5);
        q3.a aVar7 = hVar.f263r;
        if (aVar7 != null && (bVar7 = (tv.b) aVar7.f20679d) != null && (aVar6 = (y8.a) bVar7.f23029g) != null) {
            u8.d dVarE0 = aVar6.E0();
            this.T = (u8.e) dVarE0;
            dVarE0.a(this);
            e(dVarE0);
        }
        if (aVar7 != null && (bVar6 = (tv.b) aVar7.f20679d) != null && (aVar5 = (y8.a) bVar6.f23027a) != null) {
            u8.d dVarE02 = aVar5.E0();
            this.V = (u8.e) dVarE02;
            dVarE02.a(this);
            e(dVarE02);
        }
        if (aVar7 != null && (bVar4 = (tv.b) aVar7.f20679d) != null && (bVar5 = (y8.b) bVar4.f23028d) != null) {
            u8.h hVarE0 = bVar5.E0();
            this.X = hVarE0;
            hVarE0.a(this);
            e(hVarE0);
        }
        if (aVar7 != null && (bVar2 = (tv.b) aVar7.f20679d) != null && (bVar3 = (y8.b) bVar2.f23030r) != null) {
            u8.h hVarE02 = bVar3.E0();
            this.Z = hVarE02;
            hVarE02.a(this);
            e(hVarE02);
        }
        if (aVar7 != null && (bVar = (tv.b) aVar7.f20679d) != null && (aVar4 = (y8.a) bVar.f23031x) != null) {
            u8.d dVarE03 = aVar4.E0();
            this.f276b0 = (u8.e) dVarE03;
            dVarE03.a(this);
            e(dVarE03);
        }
        if (aVar7 != null && (eVar4 = (js.e) aVar7.f20680g) != null && (aVar3 = (y8.a) eVar4.f13798g) != null) {
            u8.d dVarE04 = aVar3.E0();
            this.f279e0 = (u8.e) dVarE04;
            dVarE04.a(this);
            e(dVarE04);
        }
        if (aVar7 != null && (eVar3 = (js.e) aVar7.f20680g) != null && (aVar2 = (y8.a) eVar3.f13799r) != null) {
            u8.d dVarE05 = aVar2.E0();
            this.f280f0 = (u8.e) dVarE05;
            dVarE05.a(this);
            e(dVarE05);
        }
        if (aVar7 != null && (eVar2 = (js.e) aVar7.f20680g) != null && (aVar = (y8.a) eVar2.f13800x) != null) {
            u8.d dVarE06 = aVar.E0();
            this.f281g0 = (u8.e) dVarE06;
            dVarE06.a(this);
            e(dVarE06);
        }
        if (aVar7 == null || (eVar = (js.e) aVar7.f20680g) == null) {
            return;
        }
        this.S = (x) eVar.f13797d;
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

    @Override // a9.b, t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        r8.h hVar = this.R;
        rectF.set(0.0f, 0.0f, hVar.k.width(), hVar.k.height());
    }

    @Override // a9.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        PointF pointF = z.f21401a;
        if (obj == 1) {
            r rVar = this.U;
            if (rVar != null) {
                o(rVar);
            }
            r rVar2 = new r(eVar, null);
            this.U = rVar2;
            rVar2.a(this);
            e(this.U);
            return;
        }
        if (obj == 2) {
            r rVar3 = this.W;
            if (rVar3 != null) {
                o(rVar3);
            }
            r rVar4 = new r(eVar, null);
            this.W = rVar4;
            rVar4.a(this);
            e(this.W);
            return;
        }
        if (obj == z.f21415q) {
            r rVar5 = this.Y;
            if (rVar5 != null) {
                o(rVar5);
            }
            r rVar6 = new r(eVar, null);
            this.Y = rVar6;
            rVar6.a(this);
            e(this.Y);
            return;
        }
        if (obj == z.f21416r) {
            r rVar7 = this.f275a0;
            if (rVar7 != null) {
                o(rVar7);
            }
            r rVar8 = new r(eVar, null);
            this.f275a0 = rVar8;
            rVar8.a(this);
            e(this.f275a0);
            return;
        }
        if (obj == z.D) {
            r rVar9 = this.f277c0;
            if (rVar9 != null) {
                o(rVar9);
            }
            r rVar10 = new r(eVar, null);
            this.f277c0 = rVar10;
            rVar10.a(this);
            e(this.f277c0);
            return;
        }
        if (obj != z.K) {
            if (obj == z.M) {
                u8.e eVar2 = this.P;
                eVar2.getClass();
                eVar2.k(new u8.o(new u(), eVar, new x8.c()));
                return;
            }
            return;
        }
        r rVar11 = this.f278d0;
        if (rVar11 != null) {
            o(rVar11);
        }
        r rVar12 = new r(eVar, null);
        this.f278d0 = rVar12;
        rVar12.a(this);
        e(this.f278d0);
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
    @Override // a9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, e9.a r34) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.o.k(android.graphics.Canvas, android.graphics.Matrix, int, e9.a):void");
    }

    public final String s(int i10, String str) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        u.o oVar = this.M;
        if (oVar.c(j) >= 0) {
            return (String) oVar.b(j);
        }
        StringBuilder sb2 = this.D;
        sb2.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            sb2.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        oVar.e(string, j);
        return string;
    }

    public final void t(x8.c cVar, int i10, int i11) {
        r rVar = this.U;
        l lVar = this.J;
        if (rVar != null) {
            lVar.setColor(((Integer) rVar.f()).intValue());
        } else {
            u8.e eVar = this.T;
            if (eVar == null || !x(i11)) {
                lVar.setColor(cVar.f25078h);
            } else {
                lVar.setColor(((Integer) eVar.f()).intValue());
            }
        }
        r rVar2 = this.W;
        l lVar2 = this.K;
        if (rVar2 != null) {
            lVar2.setColor(((Integer) rVar2.f()).intValue());
        } else {
            u8.e eVar2 = this.V;
            if (eVar2 == null || !x(i11)) {
                lVar2.setColor(cVar.f25079i);
            } else {
                lVar2.setColor(((Integer) eVar2.f()).intValue());
            }
        }
        u8.d dVar = this.f243w.f23496p;
        int iIntValue = 100;
        int iIntValue2 = dVar == null ? 100 : ((Integer) dVar.f()).intValue();
        u8.e eVar3 = this.f276b0;
        if (eVar3 != null && x(i11)) {
            iIntValue = ((Integer) eVar3.f()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i10) / 255.0f);
        lVar.setAlpha(iRound);
        lVar2.setAlpha(iRound);
        r rVar3 = this.Y;
        if (rVar3 != null) {
            lVar2.setStrokeWidth(((Float) rVar3.f()).floatValue());
            return;
        }
        u8.h hVar = this.X;
        if (hVar == null || !x(i11)) {
            lVar2.setStrokeWidth(e9.j.c() * cVar.j);
        } else {
            lVar2.setStrokeWidth(((Float) hVar.f()).floatValue());
        }
    }

    public final n w(int i10) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i10; size++) {
            n nVar = new n();
            nVar.f273a = "";
            nVar.f274b = 0.0f;
            arrayList.add(nVar);
        }
        return (n) arrayList.get(i10 - 1);
    }

    public final boolean x(int i10) {
        u8.e eVar;
        int length = ((x8.c) this.P.f()).f25071a.length();
        u8.e eVar2 = this.f279e0;
        if (eVar2 == null || (eVar = this.f280f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) eVar2.f()).intValue(), ((Integer) eVar.f()).intValue());
        int iMax = Math.max(((Integer) eVar2.f()).intValue(), ((Integer) eVar.f()).intValue());
        u8.e eVar3 = this.f281g0;
        if (eVar3 != null) {
            int iIntValue = ((Integer) eVar3.f()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == x.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, x8.c cVar, int i10, float f10) {
        PointF pointF = cVar.f25080l;
        PointF pointF2 = cVar.f25081m;
        float fC = e9.j.c();
        float f11 = (i10 * cVar.f25076f * fC) + (pointF == null ? 0.0f : (cVar.f25076f * fC) + pointF.y);
        if (this.Q.R && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + cVar.f25073c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = m.f272a[cVar.f25074d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
            return true;
        }
        if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
            return true;
        }
        if (i11 != 3) {
            return true;
        }
        canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        return true;
    }

    public final List z(String str, float f10, x8.d dVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                x8.e eVar = (x8.e) this.R.f21330h.c(x8.e.a(cCharAt, dVar.f25082a, dVar.f25084c));
                if (eVar != null) {
                    fMeasureText = (e9.j.c() * ((float) eVar.f25088c) * f11) + f12;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f15 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                n nVarW = w(i10);
                if (i12 == i11) {
                    nVarW.f273a = str.substring(i11, i13).trim();
                    nVarW.f274b = (f13 - fMeasureText) - ((r10.length() - r8.length()) * f15);
                    i11 = i13;
                    i12 = i11;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    nVarW.f273a = str.substring(i11, i12 - 1).trim();
                    nVarW.f274b = ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            n nVarW2 = w(i10);
            nVarW2.f273a = str.substring(i11);
            nVarW2.f274b = f13;
        }
        return this.O.subList(0, i10);
    }
}
