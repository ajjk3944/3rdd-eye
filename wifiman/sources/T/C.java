package T;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class C extends H0 {

    /* renamed from: b, reason: collision with root package name */
    private final D f20839b;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20840a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            AbstractC3546o.s("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public C(InterfaceC6835l interfaceC6835l) {
        super(a.f20840a);
        this.f20839b = new D(interfaceC6835l);
    }

    @Override // T.H0
    public I0 c(Object obj) {
        return new I0(this, obj, obj == null, null, null, null, true);
    }

    @Override // T.AbstractC3557u
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public D a() {
        return this.f20839b;
    }
}
