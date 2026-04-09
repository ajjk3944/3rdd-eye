package F3;

/* renamed from: F3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2793i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5917a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5918b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5919c;

    C2793i(Object obj, Object obj2, Object obj3) {
        this.f5917a = obj;
        this.f5918b = obj2;
        this.f5919c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f5919c;
        Object obj2 = this.f5918b;
        Object obj3 = this.f5917a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
