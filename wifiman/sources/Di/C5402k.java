package di;

import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.S;

/* renamed from: di.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5402k extends AbstractC5398g {

    /* renamed from: b, reason: collision with root package name */
    private final Zh.b f46098b;

    /* renamed from: c, reason: collision with root package name */
    private final Zh.f f46099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5402k(Zh.b enumClassId, Zh.f enumEntryName) {
        super(Yg.z.a(enumClassId, enumEntryName));
        AbstractC6492s.i(enumClassId, "enumClassId");
        AbstractC6492s.i(enumEntryName, "enumEntryName");
        this.f46098b = enumClassId;
        this.f46099c = enumEntryName;
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC7346d0 abstractC7346d0U;
        AbstractC6492s.i(module, "module");
        InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(module, this.f46098b);
        if (interfaceC2495eB != null) {
            if (!bi.i.A(interfaceC2495eB)) {
                interfaceC2495eB = null;
            }
            if (interfaceC2495eB != null && (abstractC7346d0U = interfaceC2495eB.u()) != null) {
                return abstractC7346d0U;
            }
        }
        return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.ERROR_ENUM_TYPE, this.f46098b.toString(), this.f46099c.toString());
    }

    public final Zh.f c() {
        return this.f46099c;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46098b.h());
        sb2.append('.');
        sb2.append(this.f46099c);
        return sb2.toString();
    }
}
