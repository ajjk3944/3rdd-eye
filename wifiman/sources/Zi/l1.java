package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6495v;

/* loaded from: classes4.dex */
public final class l1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f25662a = new l1();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25663b = T.a("kotlin.ULong", Wi.a.I(C6495v.f51728a));

    private l1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25663b;
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        return Yg.E.a(g(eVar));
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Yg.E) obj).j());
    }

    public long g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Yg.E.b(decoder.l(a()).v());
    }

    public void h(Yi.f encoder, long j10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.B(a()).E(j10);
    }
}
