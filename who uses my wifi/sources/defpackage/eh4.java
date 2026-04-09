package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eh4 extends ah4 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public eh4(oz1 oz1Var, Object obj, Object obj2) {
        super(oz1Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ah4, defpackage.oz1
    public final ez1 b(int i, ez1 ez1Var, long j) {
        this.b.b(i, ez1Var, j);
        if (Objects.equals(ez1Var.a, this.c)) {
            ez1Var.a = ez1.m;
        }
        return ez1Var;
    }

    @Override // defpackage.ah4, defpackage.oz1
    public final sw1 d(int i, sw1 sw1Var, boolean z) {
        this.b.d(i, sw1Var, z);
        if (Objects.equals(sw1Var.b, this.d) && z) {
            sw1Var.b = e;
        }
        return sw1Var;
    }

    @Override // defpackage.ah4, defpackage.oz1
    public final int e(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.e(obj);
    }

    @Override // defpackage.ah4, defpackage.oz1
    public final Object f(int i) {
        Object objF = this.b.f(i);
        return Objects.equals(objF, this.d) ? e : objF;
    }
}
