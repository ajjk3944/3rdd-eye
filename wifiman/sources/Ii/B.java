package Ii;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3067m f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.q f9232c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9233d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f9234e;

    public B(Object obj, InterfaceC3067m interfaceC3067m, mh.q qVar, Object obj2, Throwable th2) {
        this.f9230a = obj;
        this.f9231b = interfaceC3067m;
        this.f9232c = qVar;
        this.f9233d = obj2;
        this.f9234e = th2;
    }

    public static /* synthetic */ B b(B b10, Object obj, InterfaceC3067m interfaceC3067m, mh.q qVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b10.f9230a;
        }
        if ((i10 & 2) != 0) {
            interfaceC3067m = b10.f9231b;
        }
        InterfaceC3067m interfaceC3067m2 = interfaceC3067m;
        if ((i10 & 4) != 0) {
            qVar = b10.f9232c;
        }
        mh.q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            obj2 = b10.f9233d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = b10.f9234e;
        }
        return b10.a(obj, interfaceC3067m2, qVar2, obj4, th2);
    }

    public final B a(Object obj, InterfaceC3067m interfaceC3067m, mh.q qVar, Object obj2, Throwable th2) {
        return new B(obj, interfaceC3067m, qVar, obj2, th2);
    }

    public final boolean c() {
        return this.f9234e != null;
    }

    public final void d(C3073p c3073p, Throwable th2) {
        InterfaceC3067m interfaceC3067m = this.f9231b;
        if (interfaceC3067m != null) {
            c3073p.j(interfaceC3067m, th2);
        }
        mh.q qVar = this.f9232c;
        if (qVar != null) {
            c3073p.k(qVar, th2, this.f9230a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return AbstractC6492s.d(this.f9230a, b10.f9230a) && AbstractC6492s.d(this.f9231b, b10.f9231b) && AbstractC6492s.d(this.f9232c, b10.f9232c) && AbstractC6492s.d(this.f9233d, b10.f9233d) && AbstractC6492s.d(this.f9234e, b10.f9234e);
    }

    public int hashCode() {
        Object obj = this.f9230a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC3067m interfaceC3067m = this.f9231b;
        int iHashCode2 = (iHashCode + (interfaceC3067m == null ? 0 : interfaceC3067m.hashCode())) * 31;
        mh.q qVar = this.f9232c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f9233d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f9234e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f9230a + ", cancelHandler=" + this.f9231b + ", onCancellation=" + this.f9232c + ", idempotentResume=" + this.f9233d + ", cancelCause=" + this.f9234e + ')';
    }

    public /* synthetic */ B(Object obj, InterfaceC3067m interfaceC3067m, mh.q qVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC3067m, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
