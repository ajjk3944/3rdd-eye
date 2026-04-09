package e3;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5418c implements InterfaceC5417b {

    /* renamed from: b, reason: collision with root package name */
    private static final C5418c f46172b = new C5418c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f46173a;

    private C5418c(Object obj) {
        this.f46173a = obj;
    }

    public static InterfaceC5417b a(Object obj) {
        return new C5418c(AbstractC5419d.c(obj, "instance cannot be null"));
    }

    @Override // Jg.a
    public Object get() {
        return this.f46173a;
    }
}
