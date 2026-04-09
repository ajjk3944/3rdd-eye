package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.util.Map;
import org.snmp4j.mp.MPv3;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5083j implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5082i f38540a;

    /* renamed from: b, reason: collision with root package name */
    private int f38541b;

    /* renamed from: c, reason: collision with root package name */
    private int f38542c;

    /* renamed from: d, reason: collision with root package name */
    private int f38543d = 0;

    private C5083j(AbstractC5082i abstractC5082i) {
        AbstractC5082i abstractC5082i2 = (AbstractC5082i) AbstractC5097y.b(abstractC5082i, "input");
        this.f38540a = abstractC5082i2;
        abstractC5082i2.f38515d = this;
    }

    public static C5083j O(AbstractC5082i abstractC5082i) {
        C5083j c5083j = abstractC5082i.f38515d;
        return c5083j != null ? c5083j : new C5083j(abstractC5082i);
    }

    private void P(Object obj, c0 c0Var, C5088o c5088o) {
        int i10 = this.f38542c;
        this.f38542c = n0.c(n0.a(this.f38541b), 4);
        try {
            c0Var.j(obj, this, c5088o);
            if (this.f38541b == this.f38542c) {
            } else {
                throw InvalidProtocolBufferException.m();
            }
        } finally {
            this.f38542c = i10;
        }
    }

    private void Q(Object obj, c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException {
        int iC = this.f38540a.C();
        AbstractC5082i abstractC5082i = this.f38540a;
        if (abstractC5082i.f38512a >= abstractC5082i.f38513b) {
            throw InvalidProtocolBufferException.n();
        }
        int iL = abstractC5082i.l(iC);
        this.f38540a.f38512a++;
        c0Var.j(obj, this, c5088o);
        this.f38540a.a(0);
        r5.f38512a--;
        this.f38540a.k(iL);
    }

    private Object R(c0 c0Var, C5088o c5088o) {
        Object objB = c0Var.b();
        P(objB, c0Var, c5088o);
        c0Var.c(objB);
        return objB;
    }

    private Object S(c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException {
        Object objB = c0Var.b();
        Q(objB, c0Var, c5088o);
        c0Var.c(objB);
        return objB;
    }

    private void U(int i10) throws InvalidProtocolBufferException {
        if (this.f38540a.d() != i10) {
            throw InvalidProtocolBufferException.s();
        }
    }

    private void V(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (n0.b(this.f38541b) != i10) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void W(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void X(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.m();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void A(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5093u)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 2) {
                int iC = this.f38540a.C();
                W(iC);
                int iD = this.f38540a.d() + iC;
                do {
                    list.add(Float.valueOf(this.f38540a.s()));
                } while (this.f38540a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Float.valueOf(this.f38540a.s()));
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB = this.f38540a.B();
                }
            } while (iB == this.f38541b);
            this.f38543d = iB;
            return;
        }
        AbstractC5093u abstractC5093u = (AbstractC5093u) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 2) {
            int iC2 = this.f38540a.C();
            W(iC2);
            int iD2 = this.f38540a.d() + iC2;
            do {
                abstractC5093u.e(this.f38540a.s());
            } while (this.f38540a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            abstractC5093u.e(this.f38540a.s());
            if (this.f38540a.e()) {
                return;
            } else {
                iB2 = this.f38540a.B();
            }
        } while (iB2 == this.f38541b);
        this.f38543d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public boolean C() {
        int i10;
        if (this.f38540a.e() || (i10 = this.f38541b) == this.f38542c) {
            return false;
        }
        return this.f38540a.E(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f38540a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void E(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (n0.b(this.f38541b) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            list.add(z());
            if (this.f38540a.e()) {
                return;
            } else {
                iB = this.f38540a.B();
            }
        } while (iB == this.f38541b);
        this.f38543d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void F(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5085l)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.f38540a.o()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iC = this.f38540a.C();
            X(iC);
            int iD = this.f38540a.d() + iC;
            do {
                list.add(Double.valueOf(this.f38540a.o()));
            } while (this.f38540a.d() < iD);
            return;
        }
        AbstractC5085l abstractC5085l = (AbstractC5085l) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 1) {
            do {
                abstractC5085l.e(this.f38540a.o());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iC2 = this.f38540a.C();
        X(iC2);
        int iD2 = this.f38540a.d() + iC2;
        do {
            abstractC5085l.e(this.f38540a.o());
        } while (this.f38540a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public String H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f38540a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void I(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof D)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f38540a.r()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iC = this.f38540a.C();
            X(iC);
            int iD = this.f38540a.d() + iC;
            do {
                list.add(Long.valueOf(this.f38540a.r()));
            } while (this.f38540a.d() < iD);
            return;
        }
        D d10 = (D) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 1) {
            do {
                d10.e(this.f38540a.r());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iC2 = this.f38540a.C();
        X(iC2);
        int iD2 = this.f38540a.d() + iC2;
        do {
            d10.e(this.f38540a.r());
        } while (this.f38540a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void J(Object obj, c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException {
        V(2);
        Q(obj, c0Var, c5088o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void K(List list, c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (n0.b(this.f38541b) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int i10 = this.f38541b;
        do {
            list.add(S(c0Var, c5088o));
            if (this.f38540a.e() || this.f38543d != 0) {
                return;
            } else {
                iB = this.f38540a.B();
            }
        } while (iB == i10);
        this.f38543d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void L(Object obj, c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        P(obj, c0Var, c5088o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void M(Map map, F.a aVar, C5088o c5088o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        this.f38540a.l(this.f38540a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void N(List list, c0 c0Var, C5088o c5088o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (n0.b(this.f38541b) != 3) {
            throw InvalidProtocolBufferException.h();
        }
        int i10 = this.f38541b;
        do {
            list.add(R(c0Var, c5088o));
            if (this.f38540a.e() || this.f38543d != 0) {
                return;
            } else {
                iB = this.f38540a.B();
            }
        } while (iB == i10);
        this.f38543d = iB;
    }

    public void T(List list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        int iB2;
        if (n0.b(this.f38541b) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        if (!(list instanceof B) || z10) {
            do {
                list.add(z10 ? H() : v());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB = this.f38540a.B();
                }
            } while (iB == this.f38541b);
            this.f38543d = iB;
            return;
        }
        B b10 = (B) list;
        do {
            b10.E0(z());
            if (this.f38540a.e()) {
                return;
            } else {
                iB2 = this.f38540a.B();
            }
        } while (iB2 == this.f38541b);
        this.f38543d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int a() {
        return this.f38541b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void b(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f38540a.x()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Integer.valueOf(this.f38540a.x()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                abstractC5096x.e(this.f38540a.x());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            abstractC5096x.e(this.f38540a.x());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f38540a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void e(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 2) {
                int iC = this.f38540a.C();
                W(iC);
                int iD = this.f38540a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f38540a.v()));
                } while (this.f38540a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Integer.valueOf(this.f38540a.v()));
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB = this.f38540a.B();
                }
            } while (iB == this.f38541b);
            this.f38543d = iB;
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 2) {
            int iC2 = this.f38540a.C();
            W(iC2);
            int iD2 = this.f38540a.d() + iC2;
            do {
                abstractC5096x.e(this.f38540a.v());
            } while (this.f38540a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            abstractC5096x.e(this.f38540a.v());
            if (this.f38540a.e()) {
                return;
            } else {
                iB2 = this.f38540a.B();
            }
        } while (iB2 == this.f38541b);
        this.f38543d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void f(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof D)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f38540a.y()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Long.valueOf(this.f38540a.y()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        D d10 = (D) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                d10.e(this.f38540a.y());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            d10.e(this.f38540a.y());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void g(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f38540a.C()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Integer.valueOf(this.f38540a.C()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                abstractC5096x.e(this.f38540a.C());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            abstractC5096x.e(this.f38540a.C());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f38540a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f38540a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void k(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof D)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f38540a.D()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Long.valueOf(this.f38540a.D()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        D d10 = (D) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                d10.e(this.f38540a.D());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            d10.e(this.f38540a.D());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void m(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof D)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f38540a.u()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Long.valueOf(this.f38540a.u()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        D d10 = (D) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                d10.e(this.f38540a.u());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            d10.e(this.f38540a.u());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void n(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof D)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f38540a.w()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iC = this.f38540a.C();
            X(iC);
            int iD = this.f38540a.d() + iC;
            do {
                list.add(Long.valueOf(this.f38540a.w()));
            } while (this.f38540a.d() < iD);
            return;
        }
        D d10 = (D) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 1) {
            do {
                d10.e(this.f38540a.w());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iC2 = this.f38540a.C();
        X(iC2);
        int iD2 = this.f38540a.d() + iC2;
        do {
            d10.e(this.f38540a.w());
        } while (this.f38540a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void o(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f38540a.t()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Integer.valueOf(this.f38540a.t()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                abstractC5096x.e(this.f38540a.t());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            abstractC5096x.e(this.f38540a.t());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void p(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f38540a.p()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Integer.valueOf(this.f38540a.p()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                abstractC5096x.e(this.f38540a.p());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            abstractC5096x.e(this.f38540a.p());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void r(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5096x)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 2) {
                int iC = this.f38540a.C();
                W(iC);
                int iD = this.f38540a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f38540a.q()));
                } while (this.f38540a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Integer.valueOf(this.f38540a.q()));
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB = this.f38540a.B();
                }
            } while (iB == this.f38541b);
            this.f38543d = iB;
            return;
        }
        AbstractC5096x abstractC5096x = (AbstractC5096x) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 2) {
            int iC2 = this.f38540a.C();
            W(iC2);
            int iD2 = this.f38540a.d() + iC2;
            do {
                abstractC5096x.e(this.f38540a.q());
            } while (this.f38540a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            abstractC5096x.e(this.f38540a.q());
            if (this.f38540a.e()) {
                return;
            } else {
                iB2 = this.f38540a.B();
            }
        } while (iB2 == this.f38541b);
        this.f38543d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f38540a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f38540a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f38540a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void u(List list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof AbstractC5079f)) {
            int iB3 = n0.b(this.f38541b);
            if (iB3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f38540a.m()));
                    if (this.f38540a.e()) {
                        return;
                    } else {
                        iB = this.f38540a.B();
                    }
                } while (iB == this.f38541b);
                this.f38543d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int iD = this.f38540a.d() + this.f38540a.C();
            do {
                list.add(Boolean.valueOf(this.f38540a.m()));
            } while (this.f38540a.d() < iD);
            U(iD);
            return;
        }
        AbstractC5079f abstractC5079f = (AbstractC5079f) list;
        int iB4 = n0.b(this.f38541b);
        if (iB4 == 0) {
            do {
                abstractC5079f.e(this.f38540a.m());
                if (this.f38540a.e()) {
                    return;
                } else {
                    iB2 = this.f38540a.B();
                }
            } while (iB2 == this.f38541b);
            this.f38543d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int iD2 = this.f38540a.d() + this.f38540a.C();
        do {
            abstractC5079f.e(this.f38540a.m());
        } while (this.f38540a.d() < iD2);
        U(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public String v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f38540a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int w() {
        int i10 = this.f38543d;
        if (i10 != 0) {
            this.f38541b = i10;
            this.f38543d = 0;
        } else {
            this.f38541b = this.f38540a.B();
        }
        int i11 = this.f38541b;
        return (i11 == 0 || i11 == this.f38542c) ? MPv3.MAX_MESSAGE_ID : n0.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void x(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void y(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public AbstractC5081h z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f38540a.n();
    }
}
