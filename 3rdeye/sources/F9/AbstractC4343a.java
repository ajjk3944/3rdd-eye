package f9;

import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4343a implements InterfaceC4350h.a {
    private final InterfaceC4350h.b<?> key;

    public AbstractC4343a(InterfaceC4350h.b<?> key) {
        l.f(key, "key");
        this.key = key;
    }

    @Override // f9.InterfaceC4350h
    public <R> R fold(R r9, p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) InterfaceC4350h.a.C0456a.a(this, r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        return (E) InterfaceC4350h.a.C0456a.b(this, bVar);
    }

    @Override // f9.InterfaceC4350h.a
    public InterfaceC4350h.b<?> getKey() {
        return this.key;
    }

    @Override // f9.InterfaceC4350h
    public InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return InterfaceC4350h.a.C0456a.c(this, bVar);
    }

    @Override // f9.InterfaceC4350h
    public InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return InterfaceC4350h.a.C0456a.d(this, interfaceC4350h);
    }
}
