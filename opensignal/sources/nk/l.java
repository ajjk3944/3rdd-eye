package nk;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final f f18415d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final p0 f18416a;

    /* renamed from: b, reason: collision with root package name */
    public final k[] f18417b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.t f18418c;

    public l(p0 p0Var, TreeMap treeMap) {
        this.f18416a = p0Var;
        this.f18417b = (k[]) treeMap.values().toArray(new k[treeMap.size()]);
        this.f18418c = io.sentry.t.G((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // nk.r
    public final Object fromJson(w wVar) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objE = this.f18416a.e();
            try {
                wVar.f();
                while (wVar.w()) {
                    int iP0 = wVar.p0(this.f18418c);
                    if (iP0 == -1) {
                        wVar.r0();
                        wVar.s0();
                    } else {
                        k kVar = this.f18417b[iP0];
                        kVar.f18412b.set(objE, kVar.f18413c.fromJson(wVar));
                    }
                }
                wVar.i();
                return objE;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e10) {
            ok.f.i(e10);
            throw null;
        }
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            c0Var.f();
            for (k kVar : this.f18417b) {
                c0Var.y(kVar.f18411a);
                kVar.f18413c.toJson(c0Var, kVar.f18412b.get(obj));
            }
            c0Var.q();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f18416a + ")";
    }
}
