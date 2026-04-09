package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3730s0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f25688a;

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25689b;

    public C3730s0(Vi.b serializer) {
        AbstractC6492s.i(serializer, "serializer");
        this.f25688a = serializer;
        this.f25689b = new Q0(serializer.a());
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25689b;
    }

    @Override // Vi.InterfaceC3627a
    public Object c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return decoder.y() ? decoder.t(this.f25688a) : decoder.r();
    }

    @Override // Vi.o
    public void e(Yi.f encoder, Object obj) {
        AbstractC6492s.i(encoder, "encoder");
        if (obj == null) {
            encoder.f();
        } else {
            encoder.v();
            encoder.z(this.f25688a, obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3730s0.class == obj.getClass() && AbstractC6492s.d(this.f25688a, ((C3730s0) obj).f25688a);
    }

    public int hashCode() {
        return this.f25688a.hashCode();
    }
}
