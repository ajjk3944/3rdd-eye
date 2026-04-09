package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final j$.time.format.a f26222a = new j$.time.format.a(1);

    /* renamed from: b, reason: collision with root package name */
    public static final j$.time.format.a f26223b = new j$.time.format.a(2);

    /* renamed from: c, reason: collision with root package name */
    public static final j$.time.format.a f26224c = new j$.time.format.a(3);

    /* renamed from: d, reason: collision with root package name */
    public static final j$.time.format.a f26225d = new j$.time.format.a(4);

    /* renamed from: e, reason: collision with root package name */
    public static final j$.time.format.a f26226e = new j$.time.format.a(5);

    /* renamed from: f, reason: collision with root package name */
    public static final j$.time.format.a f26227f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static u d(n nVar, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.j(nVar);
        }
        if (nVar.e(qVar)) {
            return ((a) qVar).f26204b;
        }
        throw new t(j$.time.b.a("Unsupported field: ", qVar));
    }

    public static int a(n nVar, q qVar) {
        u uVarK = nVar.k(qVar);
        if (uVarK.f26228a < -2147483648L || uVarK.f26231d > 2147483647L) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jW = nVar.w(qVar);
        if (uVarK.d(jW)) {
            return (int) jW;
        }
        throw new j$.time.a("Invalid value for " + qVar + " (valid values " + uVarK + "): " + jW);
    }

    public static Object c(n nVar, j$.time.format.a aVar) {
        if (aVar == f26222a || aVar == f26223b || aVar == f26224c) {
            return null;
        }
        return aVar.a(nVar);
    }

    public static m b(m mVar, long j, s sVar) {
        long j8;
        if (j == Long.MIN_VALUE) {
            mVar = mVar.d(Long.MAX_VALUE, sVar);
            j8 = 1;
        } else {
            j8 = -j;
        }
        return mVar.d(j8, sVar);
    }
}
