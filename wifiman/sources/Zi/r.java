package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f25684a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25685b = new N0("kotlin.Char", e.c.f24441a);

    private r() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25685b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Character) obj).charValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Character c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Character.valueOf(decoder.g());
    }

    public void h(Yi.f encoder, char c10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.u(c10);
    }
}
