package ir;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 extends br.k implements ar.k {
    public static final e0 E = new e0(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // ar.k
    public final Object a(Object obj) {
        Class cls = (Class) obj;
        br.l.e(cls, "p0");
        return cls.getComponentType();
    }
}
