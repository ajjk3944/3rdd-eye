package lb;

import aj.InterfaceC3875i;
import com.ui.unifi.core.base.net.models.ResultDeserializeException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.h;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import ub.C8156c;

@Vi.n(with = c.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0010\u000e\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\r\u0010\u000bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\b¢\u0006\u0004\b\u000e\u0010\u000b\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Llb/h;", "T", "", "<init>", "()V", SnmpConfigurator.O_COMMUNITY, "()Ljava/lang/Object;", "U", "Lkotlin/Function1;", "mapper", "d", "(Lmh/l;)Llb/h;", "", "f", SnmpConfigurator.O_BIND_ADDRESS, "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "Llb/h$b;", "Llb/h$d;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: lb.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(InterfaceC6824a action) {
            AbstractC6492s.i(action, "action");
            try {
                return c(action.invoke());
            } catch (Exception e10) {
                return b(e10);
            }
        }

        public final b b(Throwable throwable) {
            AbstractC6492s.i(throwable, "throwable");
            return new b(throwable);
        }

        public final d c(Object obj) {
            return new d(obj);
        }

        public final <T> Vi.b serializer(Vi.b typeSerial0) {
            AbstractC6492s.i(typeSerial0, "typeSerial0");
            return new c(typeSerial0);
        }

        private Companion() {
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f52500a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable throwable) {
            super(null);
            AbstractC6492s.i(throwable, "throwable");
            this.f52500a = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f52500a, ((b) obj).f52500a);
        }

        public final Throwable g() {
            return this.f52500a;
        }

        public int hashCode() {
            return this.f52500a.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f52500a + ")";
        }
    }

    public static final class c implements Vi.b {

        /* renamed from: a, reason: collision with root package name */
        private final Vi.b f52501a;

        /* renamed from: b, reason: collision with root package name */
        private final Xi.f f52502b;

        public c(Vi.b tSerializer) {
            AbstractC6492s.i(tSerializer, "tSerializer");
            this.f52501a = tSerializer;
            this.f52502b = tSerializer.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3875i m(Yi.e eVar) {
            InterfaceC3875i interfaceC3875i = eVar instanceof InterfaceC3875i ? (InterfaceC3875i) eVar : null;
            if (interfaceC3875i != null) {
                return interfaceC3875i;
            }
            throw new IllegalStateException("Can only parse JSON");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final aj.j n(InterfaceC3875i jsonDecoder) {
            AbstractC6492s.i(jsonDecoder, "jsonDecoder");
            return jsonDecoder.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h o(final c cVar, final aj.j jsonElement) {
            AbstractC6492s.i(jsonElement, "jsonElement");
            return h.INSTANCE.a(new InterfaceC6824a() { // from class: lb.l
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.c.p(this.f52506a, jsonElement);
                }
            }).f(new InterfaceC6835l() { // from class: lb.m
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.c.q(jsonElement, (Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object p(c cVar, aj.j jVar) {
            return C8156c.f62925a.d().d(cVar.f52501a, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Throwable q(aj.j jVar, Throwable t10) {
            AbstractC6492s.i(t10, "t");
            String string = jVar.toString();
            Sj.a.f20830a.p(t10, "Error parsing JSON: " + string, new Object[0]);
            return new ResultDeserializeException(string, t10);
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public Xi.f a() {
            return this.f52502b;
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public h c(final Yi.e decoder) {
            AbstractC6492s.i(decoder, "decoder");
            return h.INSTANCE.a(new InterfaceC6824a() { // from class: lb.i
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.c.m(decoder);
                }
            }).d(new InterfaceC6835l() { // from class: lb.j
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.c.n((InterfaceC3875i) obj);
                }
            }).b(new InterfaceC6835l() { // from class: lb.k
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.c.o(this.f52505a, (aj.j) obj);
                }
            });
        }

        @Override // Vi.o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void e(Yi.f encoder, h value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            if (value instanceof d) {
                this.f52501a.e(encoder, ((d) value).g());
            } else {
                if (!(value instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Can't serialize Result.Error to JSON");
            }
        }
    }

    public static final class d extends h {

        /* renamed from: a, reason: collision with root package name */
        private final Object f52503a;

        public d(Object obj) {
            super(null);
            this.f52503a = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC6492s.d(this.f52503a, ((d) obj).f52503a);
        }

        public final Object g() {
            return this.f52503a;
        }

        public int hashCode() {
            Object obj = this.f52503a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Value(item=" + this.f52503a + ")";
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(InterfaceC6835l interfaceC6835l, h hVar) {
        return interfaceC6835l.invoke(((d) hVar).g());
    }

    public final h b(InterfaceC6835l mapper) {
        AbstractC6492s.i(mapper, "mapper");
        if (this instanceof d) {
            return (h) mapper.invoke(((d) this).g());
        }
        if (this instanceof b) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object c() {
        if (this instanceof d) {
            return ((d) this).g();
        }
        if (this instanceof b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final h d(final InterfaceC6835l mapper) {
        AbstractC6492s.i(mapper, "mapper");
        if (this instanceof d) {
            return INSTANCE.a(new InterfaceC6824a() { // from class: lb.g
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.e(mapper, this);
                }
            });
        }
        if (this instanceof b) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final h f(InterfaceC6835l mapper) {
        AbstractC6492s.i(mapper, "mapper");
        if (this instanceof d) {
            return this;
        }
        if (this instanceof b) {
            return INSTANCE.b((Throwable) mapper.invoke(((b) this).g()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private h() {
    }
}
