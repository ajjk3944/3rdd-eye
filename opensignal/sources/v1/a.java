package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends br.k implements ar.n {
    public static final a E = new a(2, dr.a.class, "min", "min(II)I", 1);

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
