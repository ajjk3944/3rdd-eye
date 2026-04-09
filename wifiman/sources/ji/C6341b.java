package ji;

import Bh.InterfaceC2495e;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* renamed from: ji.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6341b extends AbstractC6340a implements InterfaceC6345f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2495e f50872c;

    /* renamed from: d, reason: collision with root package name */
    private final Zh.f f50873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6341b(InterfaceC2495e classDescriptor, S receiverType, Zh.f fVar, InterfaceC6346g interfaceC6346g) {
        super(receiverType, interfaceC6346g);
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        AbstractC6492s.i(receiverType, "receiverType");
        this.f50872c = classDescriptor;
        this.f50873d = fVar;
    }

    @Override // ji.InterfaceC6345f
    public Zh.f a() {
        return this.f50873d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f50872c + " }";
    }
}
