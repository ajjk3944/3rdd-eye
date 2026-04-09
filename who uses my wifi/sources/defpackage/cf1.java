package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cf1 {
    public final LinkedHashMap a;

    public cf1() {
        this.a = new LinkedHashMap();
    }

    public void a(String str, ga4 ga4Var) {
        if (ga4Var == null) {
            throw new NullPointerException("provider");
        }
        this.a.put(str, ga4Var);
    }

    public void b(bf1 bf1Var) {
        long[] jArr = bf1Var.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), bf1Var);
        }
    }

    public void c(String str, ga4 ga4Var) {
        a(str, ga4Var);
    }

    public ea4 d() {
        return new ea4(this.a);
    }

    public cf1(int i) {
        this.a = qb1.F(i);
    }
}
