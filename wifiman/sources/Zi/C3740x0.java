package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: Zi.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3740x0 extends Z {

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3740x0(final Vi.b keySerializer, final Vi.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC6492s.i(keySerializer, "keySerializer");
        AbstractC6492s.i(valueSerializer, "valueSerializer");
        this.f25705c = Xi.l.c("kotlin.Pair", new Xi.f[0], new InterfaceC6835l() { // from class: Zi.w0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3740x0.m(keySerializer, valueSerializer, (Xi.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(Vi.b bVar, Vi.b bVar2, Xi.a buildClassSerialDescriptor) {
        AbstractC6492s.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        Xi.a.b(buildClassSerialDescriptor, "first", bVar.a(), null, false, 12, null);
        Xi.a.b(buildClassSerialDescriptor, "second", bVar2.a(), null, false, 12, null);
        return Yg.J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25705c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object g(Yg.s sVar) {
        AbstractC6492s.i(sVar, "<this>");
        return sVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object i(Yg.s sVar) {
        AbstractC6492s.i(sVar, "<this>");
        return sVar.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Yg.s k(Object obj, Object obj2) {
        return Yg.z.a(obj, obj2);
    }
}
