package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3709h0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3709h0 f25636a = new C3709h0();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25637b = new N0("kotlin.Long", e.g.f24445a);

    private C3709h0() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25637b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).longValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }

    public void h(Yi.f encoder, long j10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.E(j10);
    }
}
