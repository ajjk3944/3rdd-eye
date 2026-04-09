package B3;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final Class f1145a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1146b;

    private g(Class cls, Object obj) {
        this.f1145a = cls;
        this.f1146b = obj;
    }

    public static g a(Class cls, Object obj) {
        return new g(cls, obj);
    }

    public final Class b() {
        return this.f1145a;
    }

    public final Object c() {
        return this.f1146b;
    }
}
