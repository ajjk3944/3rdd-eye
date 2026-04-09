package dh;

import dh.InterfaceC5384i;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: dh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5379d implements InterfaceC5384i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f46084a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5384i.b f46085b;

    public C5379d(InterfaceC5384i left, InterfaceC5384i.b element) {
        AbstractC6492s.i(left, "left");
        AbstractC6492s.i(element, "element");
        this.f46084a = left;
        this.f46085b = element;
    }

    private final boolean d(InterfaceC5384i.b bVar) {
        return AbstractC6492s.d(get(bVar.getKey()), bVar);
    }

    private final boolean g(C5379d c5379d) {
        while (d(c5379d.f46085b)) {
            InterfaceC5384i interfaceC5384i = c5379d.f46084a;
            if (!(interfaceC5384i instanceof C5379d)) {
                AbstractC6492s.g(interfaceC5384i, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((InterfaceC5384i.b) interfaceC5384i);
            }
            c5379d = (C5379d) interfaceC5384i;
        }
        return false;
    }

    private final int l() {
        int i10 = 2;
        C5379d c5379d = this;
        while (true) {
            InterfaceC5384i interfaceC5384i = c5379d.f46084a;
            c5379d = interfaceC5384i instanceof C5379d ? (C5379d) interfaceC5384i : null;
            if (c5379d == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(String acc, InterfaceC5384i.b element) {
        AbstractC6492s.i(acc, "acc");
        AbstractC6492s.i(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5379d) {
                C5379d c5379d = (C5379d) obj;
                if (c5379d.l() != l() || !c5379d.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p operation) {
        AbstractC6492s.i(operation, "operation");
        return operation.invoke(this.f46084a.fold(obj, operation), this.f46085b);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        C5379d c5379d = this;
        while (true) {
            InterfaceC5384i.b bVar = c5379d.f46085b.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC5384i interfaceC5384i = c5379d.f46084a;
            if (!(interfaceC5384i instanceof C5379d)) {
                return interfaceC5384i.get(key);
            }
            c5379d = (C5379d) interfaceC5384i;
        }
    }

    public int hashCode() {
        return this.f46084a.hashCode() + this.f46085b.hashCode();
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        if (this.f46085b.get(key) != null) {
            return this.f46084a;
        }
        InterfaceC5384i interfaceC5384iMinusKey = this.f46084a.minusKey(key);
        return interfaceC5384iMinusKey == this.f46084a ? this : interfaceC5384iMinusKey == C5385j.f46088a ? this.f46085b : new C5379d(interfaceC5384iMinusKey, this.f46085b);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC5384i.a.b(this, interfaceC5384i);
    }

    public String toString() {
        return '[' + ((String) fold("", new InterfaceC6839p() { // from class: dh.c
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C5379d.m((String) obj, (InterfaceC5384i.b) obj2);
            }
        })) + ']';
    }
}
