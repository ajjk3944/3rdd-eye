package M2;

/* loaded from: classes.dex */
public final class v extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final J2.b f2820a;

    public v(J2.b bVar) {
        if (!((bVar.f2045b == 0 || bVar.f2046c == null) ? false : true)) {
            throw new IllegalArgumentException("ResolvableConnectionException can only be created with a connection result containing a resolution.");
        }
        this.f2820a = bVar;
    }
}
