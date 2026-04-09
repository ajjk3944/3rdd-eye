package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends br.k implements ar.n {
    public static final b E = new b(2, dr.a.class, "max", "max(II)I", 1);

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
