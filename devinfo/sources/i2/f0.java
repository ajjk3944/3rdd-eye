package i2;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final g2.s0 f25658a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25661d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25662e;

    /* renamed from: f, reason: collision with root package name */
    public a f25663f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25664h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25659b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public f0(a aVar, int i4) {
        this.f25664h = i4;
        this.f25658a = (g2.s0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [mk.e, nk.i] */
    /* JADX WARN: Type inference failed for: r3v7, types: [g2.s0, i2.a] */
    public static final void a(f0 f0Var, g2.a aVar, int i4, d1 d1Var) {
        HashMap map = f0Var.g;
        float f10 = i4;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long jT = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (f0Var.f25664h) {
                    case 0:
                        l1 l1Var = d1Var.L;
                        if (l1Var != null) {
                            jT = ((j2.g1) l1Var).d(jT, false);
                        }
                        jT = ii.a.t(jT, d1Var.f25621z);
                        break;
                    default:
                        n0 n0VarX0 = d1Var.x0();
                        nk.k.b(n0VarX0);
                        long j = n0VarX0.f25720p;
                        jT = o1.b.h((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), jT);
                        break;
                }
                d1Var = d1Var.f25612q;
                nk.k.b(d1Var);
                if (d1Var.equals(f0Var.f25658a.h())) {
                    int iRound = Math.round(aVar instanceof g2.l ? Float.intBitsToFloat((int) (jT & 4294967295L)) : Float.intBitsToFloat((int) (jT >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) zj.w.G(aVar, map)).intValue();
                        g2.l lVar = g2.d.f24318a;
                        iRound = ((Number) aVar.f24301a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!f0Var.b(d1Var).containsKey(aVar));
            float fC = f0Var.c(d1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(d1 d1Var) {
        switch (this.f25664h) {
            case 0:
                return d1Var.h0().b();
            default:
                n0 n0VarX0 = d1Var.x0();
                nk.k.b(n0VarX0);
                return n0VarX0.h0().b();
        }
    }

    public final int c(d1 d1Var, g2.a aVar) {
        switch (this.f25664h) {
            case 0:
                return d1Var.c0(aVar);
            default:
                n0 n0VarX0 = d1Var.x0();
                nk.k.b(n0VarX0);
                return n0VarX0.c0(aVar);
        }
    }

    public final boolean d() {
        return this.f25660c || this.f25661d || this.f25662e;
    }

    public final boolean e() {
        h();
        return this.f25663f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g2.s0, i2.a] */
    public final void f() {
        this.f25659b = true;
        ?? r02 = this.f25658a;
        a aVarJ = r02.j();
        if (aVarJ == null) {
            return;
        }
        if (this.f25660c) {
            aVarJ.requestLayout();
        }
        if (this.f25661d) {
            r02.G();
        }
        if (this.f25662e) {
            r02.requestLayout();
        }
        aVarJ.b().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [g2.s0, i2.a] */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        c2.l0 l0Var = new c2.l0(5, this);
        ?? r22 = this.f25658a;
        r22.g(l0Var);
        map.putAll(b(r22.h()));
        this.f25659b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [g2.s0, i2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            g2.s0 r1 = r2.f25658a
            if (r0 == 0) goto L9
            goto L51
        L9:
            i2.a r0 = r1.j()
            if (r0 != 0) goto L10
            goto L53
        L10:
            i2.f0 r0 = r0.b()
            i2.a r1 = r0.f25663f
            if (r1 == 0) goto L23
            i2.f0 r0 = r1.b()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            i2.a r0 = r2.f25663f
            if (r0 == 0) goto L53
            i2.f0 r1 = r0.b()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            i2.a r1 = r0.j()
            if (r1 == 0) goto L41
            i2.f0 r1 = r1.b()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            i2.a r0 = r0.j()
            if (r0 == 0) goto L50
            i2.f0 r0 = r0.b()
            if (r0 == 0) goto L50
            i2.a r1 = r0.f25663f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f25663f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.f0.h():void");
    }
}
