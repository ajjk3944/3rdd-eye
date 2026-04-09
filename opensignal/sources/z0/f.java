package z0;

/* loaded from: classes.dex */
public final class f extends br.n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public static final f f26490d = new f(2);

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        String str = (String) obj;
        k kVar = (k) obj2;
        if (str.length() == 0) {
            return kVar.toString();
        }
        return str + ", " + kVar;
    }
}
