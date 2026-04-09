package v4;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final Class f63422a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f63423b;

    class a extends c {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f63424c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f63424c = bVar;
        }
    }

    public interface b {
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static c a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f63422a;
    }

    public Class c() {
        return this.f63423b;
    }

    private c(Class cls, Class cls2) {
        this.f63422a = cls;
        this.f63423b = cls2;
    }
}
