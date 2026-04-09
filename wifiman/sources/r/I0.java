package r;

import Y0.h;
import Y0.n;
import Y0.r;
import java.util.Map;
import kotlin.jvm.internal.C6486l;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;

/* loaded from: classes.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C6533i f59482a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f59483b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f59482a = new C6533i(0.5f, 0.5f, 0.5f, 0.5f);
        s0 s0VarG = u0.g(kotlin.jvm.internal.r.f51727a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Yg.s sVarA = Yg.z.a(s0VarG, fValueOf2);
        Yg.s sVarA2 = Yg.z.a(u0.e(Y0.r.f24545b), fValueOf2);
        Yg.s sVarA3 = Yg.z.a(u0.d(Y0.n.f24536b), fValueOf2);
        Yg.s sVarA4 = Yg.z.a(u0.f(C6486l.f51726a), Float.valueOf(0.01f));
        Yg.s sVarA5 = Yg.z.a(u0.i(C6533i.f52340e), fValueOf);
        Yg.s sVarA6 = Yg.z.a(u0.j(C6537m.f52356b), fValueOf);
        Yg.s sVarA7 = Yg.z.a(u0.h(C6531g.f52335b), fValueOf);
        s0 s0VarB = u0.b(Y0.h.f24523b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f59483b = Zg.U.k(sVarA, sVarA2, sVarA3, sVarA4, sVarA5, sVarA6, sVarA7, Yg.z.a(s0VarB, fValueOf3), Yg.z.a(u0.c(Y0.j.f24528b), fValueOf3));
    }

    public static final float a(h.a aVar) {
        return Y0.h.j(0.1f);
    }

    public static final int b(kotlin.jvm.internal.r rVar) {
        return 1;
    }

    public static final long c(n.a aVar) {
        return Y0.o.a(1, 1);
    }

    public static final long d(r.a aVar) {
        return Y0.s.a(1, 1);
    }

    public static final long e(C6531g.a aVar) {
        return AbstractC6532h.a(0.5f, 0.5f);
    }

    public static final long f(C6537m.a aVar) {
        return AbstractC6538n.a(0.5f, 0.5f);
    }

    public static final C6533i g(C6533i.a aVar) {
        return f59482a;
    }

    public static final Map h() {
        return f59483b;
    }
}
