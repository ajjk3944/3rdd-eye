package xr;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final /* synthetic */ class m extends br.j implements ar.k {
    public static final m E = new m(1);

    @Override // br.d
    public final String B() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Field field = (Field) obj;
        br.l.e(field, "p0");
        return new u(field);
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "<init>";
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.b(u.class);
    }
}
