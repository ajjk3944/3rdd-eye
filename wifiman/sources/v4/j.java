package v4;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final C4.a f63443a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f63444b;

    class a extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f63445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f63445c = bVar;
        }
    }

    public interface b {
    }

    /* synthetic */ j(C4.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static j a(b bVar, C4.a aVar, Class cls) {
        return new a(aVar, cls, bVar);
    }

    public final C4.a b() {
        return this.f63443a;
    }

    public final Class c() {
        return this.f63444b;
    }

    private j(C4.a aVar, Class cls) {
        this.f63443a = aVar;
        this.f63444b = cls;
    }
}
