package lu;

import h7.h0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f15933d = new b(new i(false, false, true, "    ", "type", true, a.POLYMORPHIC), nu.a.f18561a);

    /* renamed from: a, reason: collision with root package name */
    public final i f15934a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.e f15935b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f15936c = new h0(26);

    public c(i iVar, cg.e eVar) {
        this.f15934a = iVar;
        this.f15935b = eVar;
    }

    public final Object a(gu.a aVar, String str) {
        br.l.e(aVar, "deserializer");
        bj.c cVar = new bj.c(str);
        Object objF = new mu.w(this, mu.b0.OBJ, cVar, aVar.getDescriptor(), null).f(aVar);
        if (cVar.l() == 10) {
            return objF;
        }
        bj.c.u(cVar, "Expected EOF after parsing, but had " + str.charAt(cVar.f2794d - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(gu.a aVar, Object obj) {
        char[] cArr;
        br.l.e(aVar, "serializer");
        ag.b bVar = new ag.b((char) 0, 10);
        mu.c cVar = mu.c.f17009g;
        synchronized (cVar) {
            mq.k kVar = (mq.k) cVar.f1301d;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                cVar.f1300a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        bVar.f346g = cArr;
        try {
            mu.b0 b0Var = mu.b0.OBJ;
            mu.y[] yVarArr = new mu.y[((mq.a) mu.b0.getEntries()).a()];
            br.l.e(b0Var, "mode");
            new mu.y(new ab.g((Object) bVar, 10, false), this, b0Var, yVarArr).l(aVar, obj);
            return bVar.toString();
        } finally {
            bVar.p();
        }
    }
}
