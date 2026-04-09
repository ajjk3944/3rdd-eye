package xr;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends br.j implements ar.k {
    public static final k E = new k(1);

    @Override // br.d
    public final String B() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Constructor constructor = (Constructor) obj;
        br.l.e(constructor, "p0");
        return new r(constructor);
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "<init>";
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.b(r.class);
    }
}
