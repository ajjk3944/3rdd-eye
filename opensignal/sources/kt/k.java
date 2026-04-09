package kt;

import ht.m0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import mq.w;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f14520a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final d f14521b = d.f14506a;

    /* renamed from: c, reason: collision with root package name */
    public static final a f14522c = new a(qs.g.g(String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* renamed from: d, reason: collision with root package name */
    public static final h f14523d = c(j.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final h f14524e = c(j.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final Set f14525f = i3.g.H(new e());

    public static final f a(g gVar, boolean z10, String... strArr) {
        br.l.e(gVar, "kind");
        br.l.e(strArr, "formatParams");
        if (!z10) {
            return new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        br.l.e(strArr2, "formatParams");
        return new l(gVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final f b(g gVar, String... strArr) {
        br.l.e(gVar, "kind");
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final h c(j jVar, String... strArr) {
        br.l.e(jVar, "kind");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        br.l.e(strArr2, "formatParams");
        return e(jVar, w.f16945a, d(jVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static i d(j jVar, String... strArr) {
        br.l.e(jVar, "kind");
        br.l.e(strArr, "formatParams");
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static h e(j jVar, List list, m0 m0Var, String... strArr) {
        br.l.e(jVar, "kind");
        br.l.e(strArr, "formatParams");
        return new h(m0Var, b(g.ERROR_TYPE_SCOPE, m0Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(rr.l lVar) {
        if (lVar != null) {
            return (lVar instanceof a) || (lVar.o() instanceof a) || lVar == f14521b;
        }
        return false;
    }
}
