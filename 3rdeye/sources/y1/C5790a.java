package y1;

import f9.InterfaceC4350h;

/* compiled from: ConnectionPoolImpl.kt */
/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5790a implements InterfaceC4350h.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0554a f47921c = new C0554a();

    /* renamed from: b, reason: collision with root package name */
    public final k f47922b;

    /* compiled from: ConnectionPoolImpl.kt */
    /* renamed from: y1.a$a, reason: collision with other inner class name */
    public static final class C0554a implements InterfaceC4350h.b<C5790a> {
    }

    public C5790a(k connectionWrapper) {
        kotlin.jvm.internal.l.f(connectionWrapper, "connectionWrapper");
        this.f47922b = connectionWrapper;
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p9.p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) InterfaceC4350h.a.C0456a.a(this, r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        return (E) InterfaceC4350h.a.C0456a.b(this, bVar);
    }

    @Override // f9.InterfaceC4350h.a
    public final InterfaceC4350h.b<C5790a> getKey() {
        return f47921c;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return InterfaceC4350h.a.C0456a.c(this, bVar);
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return InterfaceC4350h.a.C0456a.d(this, interfaceC4350h);
    }
}
