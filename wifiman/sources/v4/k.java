package v4;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private final Class f63446a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f63447b;

    class a extends k {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f63448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f63448c = bVar;
        }
    }

    public interface b {
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f63446a;
    }

    public Class c() {
        return this.f63447b;
    }

    private k(Class cls, Class cls2) {
        this.f63446a = cls;
        this.f63447b = cls2;
    }
}
