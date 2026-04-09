package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class D implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final D f25535a = new D();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25536b = new N0("kotlin.time.Duration", e.i.f24447a);

    private D() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25536b;
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        return Ai.a.g(g(eVar));
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Ai.a) obj).g0());
    }

    public long g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Ai.a.f849b.c(decoder.s());
    }

    public void h(Yi.f encoder, long j10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.G(Ai.a.W(j10));
    }
}
