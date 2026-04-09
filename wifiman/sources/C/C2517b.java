package C;

import T.InterfaceC3551q0;
import T.t1;
import Zg.AbstractC3689v;
import c0.AbstractC4172a;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2517b extends C {

    /* renamed from: L, reason: collision with root package name */
    public static final c f1935L = new c(null);

    /* renamed from: M, reason: collision with root package name */
    private static final InterfaceC4182k f1936M = AbstractC4172a.a(a.f1938a, C0072b.f1939a);

    /* renamed from: K, reason: collision with root package name */
    private InterfaceC3551q0 f1937K;

    /* renamed from: C.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1938a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(InterfaceC4184m interfaceC4184m, C2517b c2517b) {
            return AbstractC3689v.o(Integer.valueOf(c2517b.v()), Float.valueOf(AbstractC7978m.j(c2517b.w(), -0.5f, 0.5f)), Integer.valueOf(c2517b.F()));
        }
    }

    /* renamed from: C.b$b, reason: collision with other inner class name */
    static final class C0072b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0072b f1939a = new C0072b();

        /* renamed from: C.b$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1940a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f1940a = list;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object obj = this.f1940a.get(2);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C0072b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2517b invoke(List list) {
            Object obj = list.get(0);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C2517b(iIntValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* renamed from: C.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return C2517b.f1936M;
        }

        private c() {
        }
    }

    public C2517b(int i10, float f10, InterfaceC6824a interfaceC6824a) {
        super(i10, f10);
        this.f1937K = t1.d(interfaceC6824a, null, 2, null);
    }

    @Override // C.C
    public int F() {
        return ((Number) ((InterfaceC6824a) this.f1937K.getValue()).invoke()).intValue();
    }

    public final InterfaceC3551q0 m0() {
        return this.f1937K;
    }
}
