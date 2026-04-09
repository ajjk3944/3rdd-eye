package wt;

import lf.t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v DEFAULT = new v("DEFAULT", 0);
    public static final v LAZY = new v("LAZY", 1);
    public static final v ATOMIC = new v("ATOMIC", 2);
    public static final v UNDISPATCHED = new v("UNDISPATCHED", 3);

    private static final /* synthetic */ v[] $values() {
        return new v[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        v[] vVarArr$values = $values();
        $VALUES = vVarArr$values;
        $ENTRIES = a.a.j(vVarArr$values);
    }

    private v(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final <R, T> void invoke(ar.n nVar, R r10, pq.c cVar) {
        Object objW;
        int i10 = u.f24659a[ordinal()];
        lq.b0 b0Var = lq.b0.f15562a;
        if (i10 == 1) {
            try {
                bu.a.h(b0Var, xu.l.D(xu.l.m(nVar, r10, cVar)));
                return;
            } finally {
                cVar.g(t1.k(th));
            }
        }
        if (i10 == 2) {
            br.l.e(nVar, "<this>");
            br.l.e(cVar, "completion");
            xu.l.D(xu.l.m(nVar, r10, cVar)).g(b0Var);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new bf.n();
            }
            return;
        }
        br.l.e(cVar, "completion");
        try {
            pq.h hVarM = cVar.m();
            Object objL = bu.a.l(hVarM, null);
            try {
                if (nVar instanceof rq.a) {
                    br.b0.c(2, nVar);
                    objW = nVar.w(r10, cVar);
                } else {
                    objW = xu.l.d0(nVar, r10, cVar);
                }
                bu.a.g(hVarM, objL);
                if (objW != qq.a.COROUTINE_SUSPENDED) {
                    cVar.g(objW);
                }
            } catch (Throwable th2) {
                bu.a.g(hVarM, objL);
                throw th2;
            }
        } catch (Throwable th3) {
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
