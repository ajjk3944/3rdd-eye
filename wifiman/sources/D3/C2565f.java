package D3;

/* renamed from: D3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2565f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2855a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2856b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2857c;

    C2565f(Object obj, Object obj2, Object obj3) {
        this.f2855a = obj;
        this.f2856b = obj2;
        this.f2857c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f2857c;
        Object obj2 = this.f2856b;
        Object obj3 = this.f2855a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
