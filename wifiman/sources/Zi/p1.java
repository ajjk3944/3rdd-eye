package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class p1 implements Vi.b {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f25676b = new p1();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C3736v0 f25677a = new C3736v0("kotlin.Unit", Yg.J.f24997a);

    private p1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25677a.a();
    }

    @Override // Vi.InterfaceC3627a
    public /* bridge */ /* synthetic */ Object c(Yi.e eVar) {
        g(eVar);
        return Yg.J.f24997a;
    }

    public void g(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        this.f25677a.c(decoder);
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, Yg.J value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        this.f25677a.e(encoder, value);
    }
}
