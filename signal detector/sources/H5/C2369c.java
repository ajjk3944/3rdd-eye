package h5;

import java.io.Serializable;
import p5.p;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2369c implements InterfaceC2375i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2375i f20483a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2373g f20484b;

    public C2369c(InterfaceC2375i interfaceC2375i, InterfaceC2373g interfaceC2373g) {
        q5.i.e(interfaceC2375i, "left");
        q5.i.e(interfaceC2373g, "element");
        this.f20483a = interfaceC2375i;
        this.f20484b = interfaceC2373g;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2369c) {
            C2369c c2369c = (C2369c) obj;
            c2369c.getClass();
            int i = 2;
            C2369c c2369c2 = c2369c;
            int i3 = 2;
            while (true) {
                InterfaceC2375i interfaceC2375i = c2369c2.f20483a;
                c2369c2 = interfaceC2375i instanceof C2369c ? (C2369c) interfaceC2375i : null;
                if (c2369c2 == null) {
                    break;
                }
                i3++;
            }
            C2369c c2369c3 = this;
            while (true) {
                InterfaceC2375i interfaceC2375i2 = c2369c3.f20483a;
                c2369c3 = interfaceC2375i2 instanceof C2369c ? (C2369c) interfaceC2375i2 : null;
                if (c2369c3 == null) {
                    break;
                }
                i++;
            }
            if (i3 == i) {
                C2369c c2369c4 = this;
                while (true) {
                    InterfaceC2373g interfaceC2373g = c2369c4.f20484b;
                    if (!q5.i.a(c2369c.h(interfaceC2373g.getKey()), interfaceC2373g)) {
                        zA = false;
                        break;
                    }
                    InterfaceC2375i interfaceC2375i3 = c2369c4.f20483a;
                    if (!(interfaceC2375i3 instanceof C2369c)) {
                        q5.i.c(interfaceC2375i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC2373g interfaceC2373g2 = (InterfaceC2373g) interfaceC2375i3;
                        zA = q5.i.a(c2369c.h(interfaceC2373g2.getKey()), interfaceC2373g2);
                        break;
                    }
                    c2369c4 = (C2369c) interfaceC2375i3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        C2369c c2369c = this;
        while (true) {
            InterfaceC2373g interfaceC2373gH = c2369c.f20484b.h(interfaceC2374h);
            if (interfaceC2373gH != null) {
                return interfaceC2373gH;
            }
            InterfaceC2375i interfaceC2375i = c2369c.f20483a;
            if (!(interfaceC2375i instanceof C2369c)) {
                return interfaceC2375i.h(interfaceC2374h);
            }
            c2369c = (C2369c) interfaceC2375i;
        }
    }

    public final int hashCode() {
        return this.f20484b.hashCode() + this.f20483a.hashCode();
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i m(InterfaceC2375i interfaceC2375i) {
        q5.i.e(interfaceC2375i, "context");
        return interfaceC2375i == C2376j.f20486a ? this : (InterfaceC2375i) interfaceC2375i.o(this, new C2368b(1));
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        InterfaceC2373g interfaceC2373g = this.f20484b;
        InterfaceC2373g interfaceC2373gH = interfaceC2373g.h(interfaceC2374h);
        InterfaceC2375i interfaceC2375i = this.f20483a;
        if (interfaceC2373gH != null) {
            return interfaceC2375i;
        }
        InterfaceC2375i interfaceC2375iN = interfaceC2375i.n(interfaceC2374h);
        return interfaceC2375iN == interfaceC2375i ? this : interfaceC2375iN == C2376j.f20486a ? interfaceC2373g : new C2369c(interfaceC2375iN, interfaceC2373g);
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p pVar) {
        return pVar.h(this.f20483a.o(obj, pVar), this.f20484b);
    }

    public final String toString() {
        return "[" + ((String) o("", new C2368b(0))) + ']';
    }
}
