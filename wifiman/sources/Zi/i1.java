package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class i1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f25643a = new i1();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25644b = T.a("kotlin.UInt", Wi.a.H(kotlin.jvm.internal.r.f51727a));

    private i1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25644b;
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        return Yg.C.a(g(eVar));
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Yg.C) obj).h());
    }

    public int g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Yg.C.b(decoder.l(a()).n());
    }

    public void h(Yi.f encoder, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.B(a()).A(i10);
    }
}
