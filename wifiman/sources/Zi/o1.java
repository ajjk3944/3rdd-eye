package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class o1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f25670a = new o1();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25671b = T.a("kotlin.UShort", Wi.a.J(kotlin.jvm.internal.S.f51692a));

    private o1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25671b;
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        return Yg.H.a(g(eVar));
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Yg.H) obj).h());
    }

    public short g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Yg.H.b(decoder.l(a()).F());
    }

    public void h(Yi.f encoder, short s10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.B(a()).k(s10);
    }
}
