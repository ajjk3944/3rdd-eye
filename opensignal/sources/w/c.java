package w;

import n0.b2;
import n0.w1;
import n0.x0;
import n0.x1;
import y1.m1;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f24093a = new h(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final i f24094b = new i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final j f24095c = new j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final k f24096d = new k(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final h f24097e = new h(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final i f24098f = new i(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final j f24099g = new j(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final k f24100h = new k(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f24101i = new float[91];
    public static final om.f j;

    static {
        int i10 = 21;
        j = new om.f(new lu.u(5), i10, new lu.u(6));
        new om.f(new lu.u(7), i10, new lu.u(8));
    }

    public static al.c a(float f10) {
        return new al.c(Float.valueOf(f10), j, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(3:13|78|14)(2:18|19))(8:21|(10:76|23|24|72|25|26|68|27|(1:30)|50)(7:39|74|40|41|80|42|(6:44|45|70|46|47|48)(2:55|56))|34|59|(1:61)|62|(1:66)|67)|31|80|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (c(r3, r5, r8) == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8 A[Catch: CancellationException -> 0x0123, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0123, blocks: (B:42:0x00d1, B:44:0x00e8), top: B:80:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011a -> B:31:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(k8.b r21, w.d0 r22, long r23, final ar.k r25, rq.c r26) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.b(k8.b, w.d0, long, ar.k, rq.c):java.lang.Object");
    }

    public static final Object c(d0 d0Var, ar.k kVar, c0 c0Var) {
        d0Var.f24105a.H();
        b0 b0Var = new b0(kVar, 0);
        pq.h hVar = c0Var.f21666d;
        br.l.b(hVar);
        return n0.w.g(hVar).i(b0Var, c0Var);
    }

    public static final l d(l lVar) {
        l lVarC = lVar.c();
        int iB = lVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            lVarC.e(i10, lVar.a(i10));
        }
        return lVarC;
    }

    public static final void e(e eVar, long j7, float f10, d0 d0Var, k8.b bVar, ar.k kVar) {
        long jA = f10 == 0.0f ? d0Var.a() : (long) ((j7 - eVar.f24115b) / f10);
        eVar.f24119f = j7;
        ((b2) eVar.f24117d).setValue(d0Var.b(jA));
        eVar.f24118e = d0Var.c(jA);
        if (jA >= d0Var.a()) {
            eVar.f24120g = eVar.f24119f;
            ((b2) eVar.f24121h).setValue(Boolean.FALSE);
        }
        g(eVar, bVar);
        kVar.a(eVar);
    }

    public static final float f(pq.h hVar) {
        float f10;
        m1 m1Var = (m1) hVar.Y(z0.b.I);
        if (m1Var != null) {
            x1 x1Var = m1Var.f25744a;
            f10 = ((w1) x0.l.t((w1) x1Var.f17363g, x1Var)).f17357c;
        } else {
            f10 = 1.0f;
        }
        if (f10 >= 0.0f) {
            return f10;
        }
        v.b("negative scale factor");
        return f10;
    }

    public static final void g(e eVar, k8.b bVar) {
        ((b2) ((x0) bVar.f14199y)).setValue(((b2) eVar.f24117d).getValue());
        l lVar = (l) bVar.B;
        l lVar2 = eVar.f24118e;
        int iB = lVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            lVar.e(i10, lVar2.a(i10));
        }
        bVar.f14196g = eVar.f24120g;
        bVar.f14195d = eVar.f24119f;
        bVar.f14197r = ((Boolean) ((b2) eVar.f24121h).getValue()).booleanValue();
    }
}
