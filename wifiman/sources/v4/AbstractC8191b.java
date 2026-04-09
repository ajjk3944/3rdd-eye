package v4;

import o4.AbstractC7072g;
import o4.y;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8191b {

    /* renamed from: a, reason: collision with root package name */
    private final C4.a f63419a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f63420b;

    /* renamed from: v4.b$a */
    class a extends AbstractC8191b {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2246b f63421c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4.a aVar, Class cls, InterfaceC2246b interfaceC2246b) {
            super(aVar, cls, null);
            this.f63421c = interfaceC2246b;
        }

        @Override // v4.AbstractC8191b
        public AbstractC7072g d(q qVar, y yVar) {
            return this.f63421c.a(qVar, yVar);
        }
    }

    /* renamed from: v4.b$b, reason: collision with other inner class name */
    public interface InterfaceC2246b {
        AbstractC7072g a(q qVar, y yVar);
    }

    /* synthetic */ AbstractC8191b(C4.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static AbstractC8191b a(InterfaceC2246b interfaceC2246b, C4.a aVar, Class cls) {
        return new a(aVar, cls, interfaceC2246b);
    }

    public final C4.a b() {
        return this.f63419a;
    }

    public final Class c() {
        return this.f63420b;
    }

    public abstract AbstractC7072g d(q qVar, y yVar);

    private AbstractC8191b(C4.a aVar, Class cls) {
        this.f63419a = aVar;
        this.f63420b = cls;
    }
}
