package xr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final /* synthetic */ class n extends br.j implements ar.k {
    public static final n E = new n(1);

    @Override // br.d
    public final String B() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Method method = (Method) obj;
        br.l.e(method, "p0");
        return new x(method);
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "<init>";
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.b(x.class);
    }
}
