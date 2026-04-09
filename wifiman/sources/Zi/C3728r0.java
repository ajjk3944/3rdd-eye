package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;

/* renamed from: Zi.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3728r0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3728r0 f25686a = new C3728r0();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25687b = C3727q0.f25679a;

    private C3728r0() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25687b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, Void value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
