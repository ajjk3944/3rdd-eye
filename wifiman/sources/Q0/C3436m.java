package Q0;

import Q0.AbstractC3434k;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: Q0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3436m implements AbstractC3434k.b {

    /* renamed from: a, reason: collision with root package name */
    private final G f19076a;

    /* renamed from: b, reason: collision with root package name */
    private final H f19077b;

    /* renamed from: c, reason: collision with root package name */
    private final T f19078c;

    /* renamed from: d, reason: collision with root package name */
    private final r f19079d;

    /* renamed from: e, reason: collision with root package name */
    private final F f19080e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f19081f;

    /* renamed from: Q0.m$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S s10) {
            return C3436m.this.h(S.b(s10, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* renamed from: Q0.m$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f19084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S s10) {
            super(1);
            this.f19084b = s10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke(InterfaceC6835l interfaceC6835l) {
            U uA = C3436m.this.f19079d.a(this.f19084b, C3436m.this.g(), interfaceC6835l, C3436m.this.f19081f);
            if (uA == null && (uA = C3436m.this.f19080e.a(this.f19084b, C3436m.this.g(), interfaceC6835l, C3436m.this.f19081f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return uA;
        }
    }

    public C3436m(G g10, H h10, T t10, r rVar, F f10) {
        this.f19076a = g10;
        this.f19077b = h10;
        this.f19078c = t10;
        this.f19079d = rVar;
        this.f19080e = f10;
        this.f19081f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1 h(S s10) {
        return this.f19078c.c(s10, new b(s10));
    }

    @Override // Q0.AbstractC3434k.b
    public z1 a(AbstractC3434k abstractC3434k, A a10, int i10, int i11) {
        return h(new S(this.f19077b.d(abstractC3434k), this.f19077b.c(a10), this.f19077b.a(i10), this.f19077b.b(i11), this.f19076a.c(), null));
    }

    public final G g() {
        return this.f19076a;
    }

    public /* synthetic */ C3436m(G g10, H h10, T t10, r rVar, F f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g10, (i10 & 2) != 0 ? H.f18997a.a() : h10, (i10 & 4) != 0 ? AbstractC3437n.b() : t10, (i10 & 8) != 0 ? new r(AbstractC3437n.a(), null, 2, 0 == true ? 1 : 0) : rVar, (i10 & 16) != 0 ? new F() : f10);
    }
}
