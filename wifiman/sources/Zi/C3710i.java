package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3710i implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3710i f25639a = new C3710i();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25640b = new N0("kotlin.Boolean", e.a.f24439a);

    private C3710i() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25640b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Boolean) obj).booleanValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Boolean.valueOf(decoder.f());
    }

    public void h(Yi.f encoder, boolean z10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.m(z10);
    }
}
