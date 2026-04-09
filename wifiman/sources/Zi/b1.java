package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class b1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f25614a;

    /* renamed from: b, reason: collision with root package name */
    private final Vi.b f25615b;

    /* renamed from: c, reason: collision with root package name */
    private final Vi.b f25616c;

    /* renamed from: d, reason: collision with root package name */
    private final Xi.f f25617d;

    public b1(Vi.b aSerializer, Vi.b bSerializer, Vi.b cSerializer) {
        AbstractC6492s.i(aSerializer, "aSerializer");
        AbstractC6492s.i(bSerializer, "bSerializer");
        AbstractC6492s.i(cSerializer, "cSerializer");
        this.f25614a = aSerializer;
        this.f25615b = bSerializer;
        this.f25616c = cSerializer;
        this.f25617d = Xi.l.c("kotlin.Triple", new Xi.f[0], new InterfaceC6835l() { // from class: Zi.a1
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return b1.j(this.f25612a, (Xi.a) obj);
            }
        });
    }

    private final Yg.y h(Yi.c cVar) {
        Object objJ = Yi.c.j(cVar, a(), 0, this.f25614a, null, 8, null);
        Object objJ2 = Yi.c.j(cVar, a(), 1, this.f25615b, null, 8, null);
        Object objJ3 = Yi.c.j(cVar, a(), 2, this.f25616c, null, 8, null);
        cVar.b(a());
        return new Yg.y(objJ, objJ2, objJ3);
    }

    private final Yg.y i(Yi.c cVar) {
        Object objJ = c1.f25618a;
        Object objJ2 = c1.f25618a;
        Object objJ3 = c1.f25618a;
        while (true) {
            int iK = cVar.k(a());
            if (iK == -1) {
                cVar.b(a());
                if (objJ == c1.f25618a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objJ2 == c1.f25618a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objJ3 != c1.f25618a) {
                    return new Yg.y(objJ, objJ2, objJ3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iK == 0) {
                objJ = Yi.c.j(cVar, a(), 0, this.f25614a, null, 8, null);
            } else if (iK == 1) {
                objJ2 = Yi.c.j(cVar, a(), 1, this.f25615b, null, 8, null);
            } else {
                if (iK != 2) {
                    throw new SerializationException("Unexpected index " + iK);
                }
                objJ3 = Yi.c.j(cVar, a(), 2, this.f25616c, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(b1 b1Var, Xi.a buildClassSerialDescriptor) {
        AbstractC6492s.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        Xi.a.b(buildClassSerialDescriptor, "first", b1Var.f25614a.a(), null, false, 12, null);
        Xi.a.b(buildClassSerialDescriptor, "second", b1Var.f25615b.a(), null, false, 12, null);
        Xi.a.b(buildClassSerialDescriptor, "third", b1Var.f25616c.a(), null, false, 12, null);
        return Yg.J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25617d;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Yg.y c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        Yi.c cVarC = decoder.c(a());
        return cVarC.B() ? h(cVarC) : i(cVarC);
    }

    @Override // Vi.o
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, Yg.y value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        Yi.d dVarC = encoder.c(a());
        dVarC.q(a(), 0, this.f25614a, value.j());
        dVarC.q(a(), 1, this.f25615b, value.l());
        dVarC.q(a(), 2, this.f25616c, value.m());
        dVarC.b(a());
    }
}
