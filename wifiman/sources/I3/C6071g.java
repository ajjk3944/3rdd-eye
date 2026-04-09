package i3;

import e3.AbstractC5419d;
import e3.InterfaceC5417b;
import m3.InterfaceC6756a;

/* renamed from: i3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6071g implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f48818a;

    public C6071g(Jg.a aVar) {
        this.f48818a = aVar;
    }

    public static j3.f a(InterfaceC6756a interfaceC6756a) {
        return (j3.f) AbstractC5419d.d(AbstractC6070f.a(interfaceC6756a));
    }

    public static C6071g b(Jg.a aVar) {
        return new C6071g(aVar);
    }

    @Override // Jg.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.f get() {
        return a((InterfaceC6756a) this.f48818a.get());
    }
}
