package ud;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35299a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35300b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35301c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f35299a = obj;
        this.f35300b = obj2;
        this.f35301c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f35299a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f35300b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f35301c);
        StringBuilder sb2 = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return new IllegalArgumentException(a0.g.p(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
