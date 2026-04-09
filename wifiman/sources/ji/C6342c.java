package ji;

import Bh.InterfaceC2491a;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* renamed from: ji.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6342c extends AbstractC6340a implements InterfaceC6345f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2491a f50874c;

    /* renamed from: d, reason: collision with root package name */
    private final Zh.f f50875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6342c(InterfaceC2491a declarationDescriptor, S receiverType, Zh.f fVar, InterfaceC6346g interfaceC6346g) {
        super(receiverType, interfaceC6346g);
        AbstractC6492s.i(declarationDescriptor, "declarationDescriptor");
        AbstractC6492s.i(receiverType, "receiverType");
        this.f50874c = declarationDescriptor;
        this.f50875d = fVar;
    }

    @Override // ji.InterfaceC6345f
    public Zh.f a() {
        return this.f50875d;
    }

    public InterfaceC2491a c() {
        return this.f50874c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
