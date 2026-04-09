package q2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i2.C4448h;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5269b;
import l2.C5271d;
import l2.C5273f;
import l2.n;
import l2.o;
import l2.q;
import m0.C5313f;
import n2.C5348b;
import n2.C5349c;
import n2.C5350d;
import o2.C5410a;
import o2.C5411b;
import o2.C5413d;
import o2.C5416g;
import p2.t;
import u2.C5629h;
import v2.C5674b;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public final class i extends q2.b {

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f45407D;

    /* renamed from: E, reason: collision with root package name */
    public final RectF f45408E;

    /* renamed from: F, reason: collision with root package name */
    public final Matrix f45409F;

    /* renamed from: G, reason: collision with root package name */
    public final a f45410G;

    /* renamed from: H, reason: collision with root package name */
    public final b f45411H;

    /* renamed from: I, reason: collision with root package name */
    public final HashMap f45412I;

    /* renamed from: J, reason: collision with root package name */
    public final C5313f<String> f45413J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f45414K;

    /* renamed from: L, reason: collision with root package name */
    public final o f45415L;

    /* renamed from: M, reason: collision with root package name */
    public final z f45416M;

    /* renamed from: N, reason: collision with root package name */
    public final C4448h f45417N;

    /* renamed from: O, reason: collision with root package name */
    public final t f45418O;

    /* renamed from: P, reason: collision with root package name */
    public final C5269b f45419P;

    /* renamed from: Q, reason: collision with root package name */
    public q f45420Q;

    /* renamed from: R, reason: collision with root package name */
    public final C5269b f45421R;

    /* renamed from: S, reason: collision with root package name */
    public q f45422S;

    /* renamed from: T, reason: collision with root package name */
    public final C5271d f45423T;

    /* renamed from: U, reason: collision with root package name */
    public q f45424U;

    /* renamed from: V, reason: collision with root package name */
    public final C5271d f45425V;

    /* renamed from: W, reason: collision with root package name */
    public q f45426W;

    /* renamed from: X, reason: collision with root package name */
    public final C5273f f45427X;

    /* renamed from: Y, reason: collision with root package name */
    public q f45428Y;

    /* renamed from: Z, reason: collision with root package name */
    public q f45429Z;

    /* renamed from: a0, reason: collision with root package name */
    public final C5273f f45430a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C5273f f45431b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C5273f f45432c0;

    /* compiled from: TextLayer.java */
    public class a extends Paint {
    }

    /* compiled from: TextLayer.java */
    public class b extends Paint {
    }

    /* compiled from: TextLayer.java */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45433a;

        static {
            int[] iArr = new int[C5348b.a.values().length];
            f45433a = iArr;
            try {
                iArr[C5348b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45433a[C5348b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45433a[C5348b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TextLayer.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f45434a = "";

        /* renamed from: b, reason: collision with root package name */
        public float f45435b = 0.0f;
    }

    public i(z zVar, e eVar) {
        G5.c cVar;
        G5.c cVar2;
        C5413d c5413d;
        G5.c cVar3;
        C5413d c5413d2;
        G5.c cVar4;
        C5413d c5413d3;
        C5416g c5416g;
        C5413d c5413d4;
        C5416g c5416g2;
        C5411b c5411b;
        C5416g c5416g3;
        C5411b c5411b2;
        C5416g c5416g4;
        C5410a c5410a;
        C5416g c5416g5;
        C5410a c5410a2;
        super(zVar, eVar);
        this.f45407D = new StringBuilder(2);
        this.f45408E = new RectF();
        this.f45409F = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.f45410G = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.f45411H = bVar;
        this.f45412I = new HashMap();
        this.f45413J = new C5313f<>();
        this.f45414K = new ArrayList();
        this.f45418O = t.INDEX;
        this.f45416M = zVar;
        this.f45417N = eVar.f45375b;
        o oVar = new o((List) eVar.f45389q.f2034b);
        this.f45415L = oVar;
        oVar.a(this);
        e(oVar);
        B0.f fVar = eVar.f45390r;
        if (fVar != null && (c5416g5 = (C5416g) fVar.f357c) != null && (c5410a2 = c5416g5.f44811a) != null) {
            AbstractC5268a<?, ?> abstractC5268aA = c5410a2.a();
            this.f45419P = (C5269b) abstractC5268aA;
            abstractC5268aA.a(this);
            e(abstractC5268aA);
        }
        if (fVar != null && (c5416g4 = (C5416g) fVar.f357c) != null && (c5410a = c5416g4.f44812b) != null) {
            AbstractC5268a<?, ?> abstractC5268aA2 = c5410a.a();
            this.f45421R = (C5269b) abstractC5268aA2;
            abstractC5268aA2.a(this);
            e(abstractC5268aA2);
        }
        if (fVar != null && (c5416g3 = (C5416g) fVar.f357c) != null && (c5411b2 = c5416g3.f44813c) != null) {
            C5271d c5271dA = c5411b2.a();
            this.f45423T = c5271dA;
            c5271dA.a(this);
            e(c5271dA);
        }
        if (fVar != null && (c5416g2 = (C5416g) fVar.f357c) != null && (c5411b = c5416g2.f44814d) != null) {
            C5271d c5271dA2 = c5411b.a();
            this.f45425V = c5271dA2;
            c5271dA2.a(this);
            e(c5271dA2);
        }
        if (fVar != null && (c5416g = (C5416g) fVar.f357c) != null && (c5413d4 = c5416g.f44815e) != null) {
            AbstractC5268a<?, ?> abstractC5268aA3 = c5413d4.a();
            this.f45427X = (C5273f) abstractC5268aA3;
            abstractC5268aA3.a(this);
            e(abstractC5268aA3);
        }
        if (fVar != null && (cVar4 = (G5.c) fVar.f358d) != null && (c5413d3 = (C5413d) cVar4.f1910a) != null) {
            AbstractC5268a<?, ?> abstractC5268aA4 = c5413d3.a();
            this.f45430a0 = (C5273f) abstractC5268aA4;
            abstractC5268aA4.a(this);
            e(abstractC5268aA4);
        }
        if (fVar != null && (cVar3 = (G5.c) fVar.f358d) != null && (c5413d2 = (C5413d) cVar3.f1911b) != null) {
            AbstractC5268a<?, ?> abstractC5268aA5 = c5413d2.a();
            this.f45431b0 = (C5273f) abstractC5268aA5;
            abstractC5268aA5.a(this);
            e(abstractC5268aA5);
        }
        if (fVar != null && (cVar2 = (G5.c) fVar.f358d) != null && (c5413d = (C5413d) cVar2.f1912c) != null) {
            AbstractC5268a<?, ?> abstractC5268aA6 = c5413d.a();
            this.f45432c0 = (C5273f) abstractC5268aA6;
            abstractC5268aA6.a(this);
            e(abstractC5268aA6);
        }
        if (fVar == null || (cVar = (G5.c) fVar.f358d) == null) {
            return;
        }
        this.f45418O = (t) cVar.f1913d;
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

    @Override // q2.b, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        PointF pointF = InterfaceC4433F.f38300a;
        if (colorFilter == 1) {
            q qVar = this.f45420Q;
            if (qVar != null) {
                p(qVar);
            }
            q qVar2 = new q(fVar, null);
            this.f45420Q = qVar2;
            qVar2.a(this);
            e(this.f45420Q);
            return;
        }
        if (colorFilter == 2) {
            q qVar3 = this.f45422S;
            if (qVar3 != null) {
                p(qVar3);
            }
            q qVar4 = new q(fVar, null);
            this.f45422S = qVar4;
            qVar4.a(this);
            e(this.f45422S);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38312n) {
            q qVar5 = this.f45424U;
            if (qVar5 != null) {
                p(qVar5);
            }
            q qVar6 = new q(fVar, null);
            this.f45424U = qVar6;
            qVar6.a(this);
            e(this.f45424U);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38313o) {
            q qVar7 = this.f45426W;
            if (qVar7 != null) {
                p(qVar7);
            }
            q qVar8 = new q(fVar, null);
            this.f45426W = qVar8;
            qVar8.a(this);
            e(this.f45426W);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38289A) {
            q qVar9 = this.f45428Y;
            if (qVar9 != null) {
                p(qVar9);
            }
            q qVar10 = new q(fVar, null);
            this.f45428Y = qVar10;
            qVar10.a(this);
            e(this.f45428Y);
            return;
        }
        if (colorFilter != InterfaceC4433F.f38296H) {
            if (colorFilter == InterfaceC4433F.f38298J) {
                o oVar = this.f45415L;
                oVar.getClass();
                oVar.k(new n(new C5674b(), fVar, new C5348b()));
                return;
            }
            return;
        }
        q qVar11 = this.f45429Z;
        if (qVar11 != null) {
            p(qVar11);
        }
        q qVar12 = new q(fVar, null);
        this.f45429Z = qVar12;
        qVar12.a(this);
        e(this.f45429Z);
    }

    @Override // q2.b, k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        C4448h c4448h = this.f45417N;
        rectF.set(0.0f, 0.0f, c4448h.f38354k.width(), c4448h.f38354k.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
    @Override // q2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r29, android.graphics.Matrix r30, int r31) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void t(C5348b c5348b, int i, int i10) {
        q qVar = this.f45420Q;
        a aVar = this.f45410G;
        if (qVar != null) {
            aVar.setColor(((Integer) qVar.f()).intValue());
        } else {
            C5269b c5269b = this.f45419P;
            if (c5269b == null || !x(i10)) {
                aVar.setColor(c5348b.f44255h);
            } else {
                aVar.setColor(c5269b.f().intValue());
            }
        }
        q qVar2 = this.f45422S;
        b bVar = this.f45411H;
        if (qVar2 != null) {
            bVar.setColor(((Integer) qVar2.f()).intValue());
        } else {
            C5269b c5269b2 = this.f45421R;
            if (c5269b2 == null || !x(i10)) {
                bVar.setColor(c5348b.i);
            } else {
                bVar.setColor(c5269b2.f().intValue());
            }
        }
        AbstractC5268a<Integer, Integer> abstractC5268a = this.f45353w.f43742j;
        int iIntValue = 100;
        int iIntValue2 = abstractC5268a == null ? 100 : abstractC5268a.f().intValue();
        C5273f c5273f = this.f45427X;
        if (c5273f != null && x(i10)) {
            iIntValue = c5273f.f().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(iRound);
        bVar.setAlpha(iRound);
        q qVar3 = this.f45424U;
        if (qVar3 != null) {
            bVar.setStrokeWidth(((Float) qVar3.f()).floatValue());
            return;
        }
        C5271d c5271d = this.f45423T;
        if (c5271d == null || !x(i10)) {
            bVar.setStrokeWidth(C5629h.c() * c5348b.f44256j);
        } else {
            bVar.setStrokeWidth(c5271d.f().floatValue());
        }
    }

    public final d w(int i) {
        ArrayList arrayList = this.f45414K;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new d());
        }
        return (d) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        C5273f c5273f;
        int length = this.f45415L.f().f44248a.length();
        C5273f c5273f2 = this.f45430a0;
        if (c5273f2 == null || (c5273f = this.f45431b0) == null) {
            return true;
        }
        int iMin = Math.min(c5273f2.f().intValue(), c5273f.f().intValue());
        int iMax = Math.max(c5273f2.f().intValue(), c5273f.f().intValue());
        C5273f c5273f3 = this.f45432c0;
        if (c5273f3 != null) {
            int iIntValue = c5273f3.f().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f45418O == t.INDEX) {
            return i >= iMin && i < iMax;
        }
        float f10 = (i / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, C5348b c5348b, int i, float f10) {
        PointF pointF = c5348b.f44258l;
        PointF pointF2 = c5348b.f44259m;
        float fC = C5629h.c();
        float f11 = (i * c5348b.f44253f * fC) + (pointF == null ? 0.0f : (c5348b.f44253f * fC) + pointF.y);
        if (this.f45416M.f38442v && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + c5348b.f44250c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i10 = c.f45433a[c5348b.f44251d.ordinal()];
        if (i10 == 1) {
            canvas.translate(f12, f11);
            return true;
        }
        if (i10 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
            return true;
        }
        if (i10 != 3) {
            return true;
        }
        canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        return true;
    }

    public final List<d> z(String str, float f10, C5349c c5349c, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i = 0;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z10) {
                C5350d c5350dD = this.f45417N.f38352h.d(C5350d.a(c5349c.f44260a, c5349c.f44262c, cCharAt));
                if (c5350dD != null) {
                    fMeasureText = (C5629h.c() * ((float) c5350dD.f44266c) * f11) + f12;
                }
            } else {
                fMeasureText = this.f45410G.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f15 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i11 = i12;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i++;
                d dVarW = w(i);
                if (i11 == i10) {
                    dVarW.f45434a = str.substring(i10, i12).trim();
                    dVarW.f45435b = (f13 - fMeasureText) - ((r10.length() - r8.length()) * f15);
                    i10 = i12;
                    i11 = i10;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    dVarW.f45434a = str.substring(i10, i11 - 1).trim();
                    dVarW.f45435b = ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15;
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > 0.0f) {
            i++;
            d dVarW2 = w(i);
            dVarW2.f45434a = str.substring(i10);
            dVarW2.f45435b = f13;
        }
        return this.f45414K.subList(0, i);
    }
}
