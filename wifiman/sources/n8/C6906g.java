package n8;

import com.ubnt.usurvey.R;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6877a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import s9.d;

/* renamed from: n8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6906g extends AbstractC6877a {

    /* renamed from: S, reason: collision with root package name */
    private final gg.i f54415S;

    /* renamed from: n8.g$a */
    private static final class a implements AbstractC6877a.InterfaceC6879c {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ th.l[] f54416c = {O.h(new F(a.class, "networkTopology", "getNetworkTopology()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0))};

        /* renamed from: a, reason: collision with root package name */
        private final Yg.m f54417a;

        /* renamed from: b, reason: collision with root package name */
        private final gg.i f54418b;

        /* renamed from: n8.g$a$a, reason: collision with other inner class name */
        static final class C1981a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1981a f54419a = new C1981a();

            C1981a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                C6292a.b bVar = (C6292a.b) c6556a.a();
                return new C6556a(bVar != null ? bVar.b() : null);
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: n8.g$a$b */
        public static final class b extends o<InterfaceC6293b> {
        }

        public a(DI di2) {
            AbstractC6492s.i(di2, "di");
            org.kodein.type.i iVarE = s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            this.f54417a = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC6293b.class), null).a(this, f54416c[0]);
            gg.i iVarI2 = b().d().N0(C1981a.f54419a).W().o1(1).i2();
            AbstractC6492s.h(iVarI2, "refCount(...)");
            this.f54418b = iVarI2;
        }

        private final InterfaceC6293b b() {
            return (InterfaceC6293b) this.f54417a.getValue();
        }

        @Override // n8.AbstractC6877a.InterfaceC6879c
        public gg.i a() {
            return this.f54418b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6906g(DI di2) {
        super(di2, new a(di2));
        AbstractC6492s.i(di2, "di");
        gg.i iVarK0 = gg.i.K0(new C6556a(new d.b(R.string.device_tag_gateway_long)));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f54415S = iVarK0;
    }

    @Override // n8.AbstractC6877a, n8.InterfaceC6904e
    public gg.i c() {
        return this.f54415S;
    }
}
