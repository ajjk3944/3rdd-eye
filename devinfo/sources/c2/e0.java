package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2602a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2603b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f2604c;

    public e0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i4) {
        obj2 = (i4 & 2) != 0 ? null : obj2;
        this.f2602a = obj;
        this.f2603b = obj2;
        this.f2604c = pointerInputEventHandler;
    }

    @Override // i2.v0
    public final i1.m d() {
        return new m0(this.f2602a, this.f2603b, this.f2604c);
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        m0 m0Var = (m0) mVar;
        Object obj = m0Var.f2647o;
        Object obj2 = this.f2602a;
        boolean z3 = !nk.k.a(obj, obj2);
        m0Var.f2647o = obj2;
        Object obj3 = m0Var.f2648p;
        Object obj4 = this.f2603b;
        if (!nk.k.a(obj3, obj4)) {
            z3 = true;
        }
        m0Var.f2648p = obj4;
        Class<?> cls = m0Var.f2649q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f2604c;
        if (cls == pointerInputEventHandler.getClass() ? z3 : true) {
            m0Var.q0();
        }
        m0Var.f2649q = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return nk.k.a(this.f2602a, e0Var.f2602a) && nk.k.a(this.f2603b, e0Var.f2603b) && this.f2604c == e0Var.f2604c;
    }

    public final int hashCode() {
        Object obj = this.f2602a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f2603b;
        return this.f2604c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
