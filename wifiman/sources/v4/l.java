package v4;

import o4.AbstractC7072g;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private final Class f63449a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f63450b;

    class a extends l {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f63451c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f63451c = bVar;
        }

        @Override // v4.l
        public Object a(AbstractC7072g abstractC7072g) {
            return this.f63451c.a(abstractC7072g);
        }
    }

    public interface b {
        Object a(AbstractC7072g abstractC7072g);
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(AbstractC7072g abstractC7072g);

    public Class c() {
        return this.f63449a;
    }

    public Class d() {
        return this.f63450b;
    }

    private l(Class cls, Class cls2) {
        this.f63449a = cls;
        this.f63450b = cls2;
    }
}
