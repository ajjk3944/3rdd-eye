package ir;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends br.k implements ar.k {
    public static final a0 E = new a0(1, f0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // ar.k
    public final Object a(Object obj) {
        Type type = (Type) obj;
        br.l.e(type, "p0");
        return f0.b(type);
    }
}
