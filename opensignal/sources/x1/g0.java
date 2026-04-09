package x1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.v f24834a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24837d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24838e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24839f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24840g;

    /* renamed from: h, reason: collision with root package name */
    public a f24841h;
    public final /* synthetic */ int j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24835b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f24842i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i10) {
        this.j = i10;
        this.f24834a = (v1.v) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ar.n, br.k] */
    /* JADX WARN: Type inference failed for: r3v5, types: [v1.v, x1.a] */
    public static final void a(g0 g0Var, v1.h hVar, int i10, f1 f1Var) {
        HashMap map = g0Var.f24842i;
        float f10 = i10;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long jQ0 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (g0Var.j) {
                    case 0:
                        g1.g0 g0Var2 = f1.J;
                        jQ0 = f1Var.Q0(jQ0);
                        break;
                    default:
                        n0 n0VarT0 = f1Var.t0();
                        br.l.b(n0VarT0);
                        long j = n0VarT0.f24890p;
                        jQ0 = f1.b.e((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), jQ0);
                        break;
                }
                f1Var = f1Var.f24823q;
                br.l.b(f1Var);
                if (f1Var.equals(g0Var.f24834a.d())) {
                    int iRound = Math.round(hVar instanceof v1.h ? Float.intBitsToFloat((int) (jQ0 & 4294967295L)) : Float.intBitsToFloat((int) (jQ0 >> 32)));
                    if (map.containsKey(hVar)) {
                        int iIntValue = ((Number) mq.b0.O(map, hVar)).intValue();
                        v1.h hVar2 = v1.c.f23758a;
                        iRound = ((Number) hVar.f23787a.w(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(hVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!g0Var.b(f1Var).containsKey(hVar));
            float fC = g0Var.c(f1Var, hVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f1 f1Var) {
        switch (this.j) {
            case 0:
                return f1Var.a0().a();
            default:
                n0 n0VarT0 = f1Var.t0();
                br.l.b(n0VarT0);
                return n0VarT0.a0().a();
        }
    }

    public final int c(f1 f1Var, v1.h hVar) {
        switch (this.j) {
            case 0:
                return f1Var.V(hVar);
            default:
                n0 n0VarT0 = f1Var.t0();
                br.l.b(n0VarT0);
                return n0VarT0.V(hVar);
        }
    }

    public final boolean d() {
        return this.f24836c || this.f24838e || this.f24839f || this.f24840g;
    }

    public final boolean e() {
        h();
        return this.f24841h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v1.v, x1.a] */
    public final void f() {
        this.f24835b = true;
        ?? r02 = this.f24834a;
        a aVarE = r02.e();
        if (aVarE == null) {
            return;
        }
        if (this.f24836c) {
            aVarE.E();
        } else if (this.f24838e || this.f24837d) {
            aVarE.requestLayout();
        }
        if (this.f24839f) {
            r02.E();
        }
        if (this.f24840g) {
            r02.requestLayout();
        }
        aVarE.n().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [v1.v, x1.a] */
    public final void g() {
        HashMap map = this.f24842i;
        map.clear();
        j1.a aVar = new j1.a(18, this);
        ?? r22 = this.f24834a;
        r22.o(aVar);
        map.putAll(b(r22.d()));
        this.f24835b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [v1.v, x1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            v1.v r1 = r2.f24834a
            if (r0 == 0) goto L9
            goto L51
        L9:
            x1.a r0 = r1.e()
            if (r0 != 0) goto L10
            goto L53
        L10:
            x1.g0 r0 = r0.n()
            x1.a r1 = r0.f24841h
            if (r1 == 0) goto L23
            x1.g0 r0 = r1.n()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            x1.a r0 = r2.f24841h
            if (r0 == 0) goto L53
            x1.g0 r1 = r0.n()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            x1.a r1 = r0.e()
            if (r1 == 0) goto L41
            x1.g0 r1 = r1.n()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            x1.a r0 = r0.e()
            if (r0 == 0) goto L50
            x1.g0 r0 = r0.n()
            if (r0 == 0) goto L50
            x1.a r1 = r0.f24841h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f24841h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.g0.h():void");
    }
}
