package R9;

import b9.C2001h;
import p9.InterfaceC5480a;

/* compiled from: JsonElement.kt */
@M9.h(with = y.class)
/* loaded from: classes3.dex */
public final class x extends C {
    public static final x INSTANCE = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final String f11821b = "null";

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Object f11822c = C2001h.a(b9.i.PUBLICATION, a.f11823g);

    /* compiled from: JsonElement.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<M9.b<Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f11823g = new a(0);

        @Override // p9.InterfaceC5480a
        public final M9.b<Object> invoke() {
            return y.f11824a;
        }
    }

    @Override // R9.C
    public final String c() {
        return f11821b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public final M9.b<x> serializer() {
        return (M9.b) f11822c.getValue();
    }
}
