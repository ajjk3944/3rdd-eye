package aj;

import Xi.d;
import Yg.J;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class r implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f26374a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26375b = Xi.l.d("kotlinx.serialization.json.JsonElement", d.b.f24438a, new Xi.f[0], new InterfaceC6835l() { // from class: aj.l
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return r.m((Xi.a) obj);
        }
    });

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Xi.a.b(buildSerialDescriptor, "JsonPrimitive", s.f(new InterfaceC6824a() { // from class: aj.m
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return r.n();
            }
        }), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "JsonNull", s.f(new InterfaceC6824a() { // from class: aj.n
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return r.o();
            }
        }), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "JsonLiteral", s.f(new InterfaceC6824a() { // from class: aj.o
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return r.p();
            }
        }), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "JsonObject", s.f(new InterfaceC6824a() { // from class: aj.p
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return r.q();
            }
        }), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "JsonArray", s.f(new InterfaceC6824a() { // from class: aj.q
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return r.r();
            }
        }), null, false, 12, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f n() {
        return H.f26326a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f o() {
        return C3862C.f26318a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f p() {
        return y.f26380a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f q() {
        return C3865F.f26321a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f r() {
        return C3870d.f26333a.a();
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26375b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public j c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return s.d(decoder).m();
    }

    @Override // Vi.o
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, j value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        if (value instanceof AbstractC3866G) {
            encoder.z(H.f26326a, value);
        } else if (value instanceof C3864E) {
            encoder.z(C3865F.f26321a, value);
        } else {
            if (!(value instanceof C3869c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.z(C3870d.f26333a, value);
        }
    }
}
