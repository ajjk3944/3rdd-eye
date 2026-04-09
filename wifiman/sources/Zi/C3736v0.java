package Zi;

import Xi.n;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: Zi.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3736v0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25699a;

    /* renamed from: b, reason: collision with root package name */
    private List f25700b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f25701c;

    public C3736v0(final String serialName, Object objectInstance) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(objectInstance, "objectInstance");
        this.f25699a = objectInstance;
        this.f25700b = AbstractC3689v.l();
        this.f25701c = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: Zi.t0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C3736v0.i(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f i(String str, final C3736v0 c3736v0) {
        return Xi.l.d(str, n.d.f24473a, new Xi.f[0], new InterfaceC6835l() { // from class: Zi.u0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3736v0.j(this.f25698a, (Xi.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(C3736v0 c3736v0, Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(c3736v0.f25700b);
        return Yg.J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return (Xi.f) this.f25701c.getValue();
    }

    @Override // Vi.InterfaceC3627a
    public Object c(Yi.e decoder) {
        int iK;
        AbstractC6492s.i(decoder, "decoder");
        Xi.f fVarA = a();
        Yi.c cVarC = decoder.c(fVarA);
        if (cVarC.B() || (iK = cVarC.k(a())) == -1) {
            Yg.J j10 = Yg.J.f24997a;
            cVarC.b(fVarA);
            return this.f25699a;
        }
        throw new SerializationException("Unexpected index " + iK);
    }

    @Override // Vi.o
    public void e(Yi.f encoder, Object value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        encoder.c(a()).b(a());
    }
}
