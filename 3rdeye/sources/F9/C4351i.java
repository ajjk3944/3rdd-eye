package f9;

import f9.InterfaceC4350h;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: f9.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4351i implements InterfaceC4350h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C4351i f37871b = new C4351i();

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p<? super R, ? super InterfaceC4350h.a, ? extends R> operation) {
        l.f(operation, "operation");
        return r9;
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> key) {
        l.f(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> key) {
        l.f(key, "key");
        return this;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h context) {
        l.f(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
