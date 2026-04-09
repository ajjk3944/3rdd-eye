package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class W implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final W f25597a = new W();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25598b = new N0("kotlin.Int", e.f.f24444a);

    private W() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25598b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).intValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Integer.valueOf(decoder.n());
    }

    public void h(Yi.f encoder, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.A(i10);
    }
}
