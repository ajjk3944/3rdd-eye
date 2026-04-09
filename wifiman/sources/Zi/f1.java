package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6479e;

/* loaded from: classes4.dex */
public final class f1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f25628a = new f1();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25629b = T.a("kotlin.UByte", Wi.a.D(C6479e.f51714a));

    private f1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25629b;
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        return Yg.A.a(g(eVar));
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Yg.A) obj).h());
    }

    public byte g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Yg.A.b(decoder.l(a()).D());
    }

    public void h(Yi.f encoder, byte b10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.B(a()).l(b10);
    }
}
