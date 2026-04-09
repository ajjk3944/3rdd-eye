package f9;

import N7.B8;
import f9.InterfaceC4350h;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: f9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4346d implements InterfaceC4350h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f37868b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4350h.a f37869c;

    public C4346d(InterfaceC4350h.a element, InterfaceC4350h left) {
        l.f(left, "left");
        l.f(element, "element");
        this.f37868b = left;
        this.f37869c = element;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4346d) {
            C4346d c4346d = (C4346d) obj;
            c4346d.getClass();
            int i = 2;
            C4346d c4346d2 = c4346d;
            int i10 = 2;
            while (true) {
                InterfaceC4350h interfaceC4350h = c4346d2.f37868b;
                c4346d2 = interfaceC4350h instanceof C4346d ? (C4346d) interfaceC4350h : null;
                if (c4346d2 == null) {
                    break;
                }
                i10++;
            }
            C4346d c4346d3 = this;
            while (true) {
                InterfaceC4350h interfaceC4350h2 = c4346d3.f37868b;
                c4346d3 = interfaceC4350h2 instanceof C4346d ? (C4346d) interfaceC4350h2 : null;
                if (c4346d3 == null) {
                    break;
                }
                i++;
            }
            if (i10 == i) {
                C4346d c4346d4 = this;
                while (true) {
                    InterfaceC4350h.a aVar = c4346d4.f37869c;
                    if (!l.b(c4346d.get(aVar.getKey()), aVar)) {
                        zB = false;
                        break;
                    }
                    InterfaceC4350h interfaceC4350h3 = c4346d4.f37868b;
                    if (!(interfaceC4350h3 instanceof C4346d)) {
                        l.d(interfaceC4350h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC4350h.a aVar2 = (InterfaceC4350h.a) interfaceC4350h3;
                        zB = l.b(c4346d.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    c4346d4 = (C4346d) interfaceC4350h3;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p<? super R, ? super InterfaceC4350h.a, ? extends R> operation) {
        l.f(operation, "operation");
        return operation.invoke((Object) this.f37868b.fold(r9, operation), this.f37869c);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> key) {
        l.f(key, "key");
        C4346d c4346d = this;
        while (true) {
            E e4 = (E) c4346d.f37869c.get(key);
            if (e4 != null) {
                return e4;
            }
            InterfaceC4350h interfaceC4350h = c4346d.f37868b;
            if (!(interfaceC4350h instanceof C4346d)) {
                return (E) interfaceC4350h.get(key);
            }
            c4346d = (C4346d) interfaceC4350h;
        }
    }

    public final int hashCode() {
        return this.f37869c.hashCode() + this.f37868b.hashCode();
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> key) {
        l.f(key, "key");
        InterfaceC4350h.a aVar = this.f37869c;
        InterfaceC4350h.a aVar2 = aVar.get(key);
        InterfaceC4350h interfaceC4350h = this.f37868b;
        if (aVar2 != null) {
            return interfaceC4350h;
        }
        InterfaceC4350h interfaceC4350hMinusKey = interfaceC4350h.minusKey(key);
        return interfaceC4350hMinusKey == interfaceC4350h ? this : interfaceC4350hMinusKey == C4351i.f37871b ? aVar : new C4346d(aVar, interfaceC4350hMinusKey);
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h context) {
        l.f(context, "context");
        return context == C4351i.f37871b ? this : (InterfaceC4350h) context.fold(this, new C4349g());
    }

    public final String toString() {
        return B8.j(new StringBuilder("["), (String) fold("", new C4345c()), ']');
    }
}
