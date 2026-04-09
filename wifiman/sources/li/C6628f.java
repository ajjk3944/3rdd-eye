package li;

import Uh.b;
import di.AbstractC5398g;
import ki.AbstractC6472a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: li.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6628f extends AbstractC6623a implements InterfaceC6627e {

    /* renamed from: b, reason: collision with root package name */
    private final C6629g f52699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6628f(Bh.G module, Bh.L notFoundClasses, AbstractC6472a protocol) {
        super(protocol);
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(protocol, "protocol");
        this.f52699b = new C6629g(module, notFoundClasses);
    }

    @Override // li.InterfaceC6630h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(Uh.b proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        return this.f52699b.a(proto, nameResolver);
    }

    @Override // li.InterfaceC6627e
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC5398g c(AbstractC6611N container, Uh.n proto, pi.S expectedType) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(expectedType, "expectedType");
        return null;
    }

    @Override // li.InterfaceC6627e
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC5398g e(AbstractC6611N container, Uh.n proto, pi.S expectedType) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(expectedType, "expectedType");
        b.C0830b.c cVar = (b.C0830b.c) Wh.e.a(proto, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f52699b.f(expectedType, cVar, container.b());
    }
}
