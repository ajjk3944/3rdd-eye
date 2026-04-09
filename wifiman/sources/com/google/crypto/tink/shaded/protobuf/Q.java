package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5078e;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class Q implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final M f38468a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f38469b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38470c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5089p f38471d;

    private Q(h0 h0Var, AbstractC5089p abstractC5089p, M m10) {
        this.f38469b = h0Var;
        this.f38470c = abstractC5089p.e(m10);
        this.f38471d = abstractC5089p;
        this.f38468a = m10;
    }

    private int k(h0 h0Var, Object obj) {
        return h0Var.i(h0Var.g(obj));
    }

    private void l(h0 h0Var, AbstractC5089p abstractC5089p, Object obj, b0 b0Var, C5088o c5088o) {
        Object objF = h0Var.f(obj);
        AbstractC5091s abstractC5091sD = abstractC5089p.d(obj);
        while (b0Var.w() != Integer.MAX_VALUE) {
            try {
                if (!n(b0Var, c5088o, abstractC5089p, abstractC5091sD, h0Var, objF)) {
                    return;
                }
            } finally {
                h0Var.o(obj, objF);
            }
        }
    }

    static Q m(h0 h0Var, AbstractC5089p abstractC5089p, M m10) {
        return new Q(h0Var, abstractC5089p, m10);
    }

    private boolean n(b0 b0Var, C5088o c5088o, AbstractC5089p abstractC5089p, AbstractC5091s abstractC5091s, h0 h0Var, Object obj) throws InvalidProtocolBufferException {
        int iA = b0Var.a();
        if (iA != n0.f38578a) {
            if (n0.b(iA) != 2) {
                return b0Var.C();
            }
            Object objB = abstractC5089p.b(c5088o, this.f38468a, n0.a(iA));
            if (objB == null) {
                return h0Var.m(obj, b0Var);
            }
            abstractC5089p.h(b0Var, objB, c5088o, abstractC5091s);
            return true;
        }
        Object objB2 = null;
        int iL = 0;
        AbstractC5081h abstractC5081hZ = null;
        while (b0Var.w() != Integer.MAX_VALUE) {
            int iA2 = b0Var.a();
            if (iA2 == n0.f38580c) {
                iL = b0Var.l();
                objB2 = abstractC5089p.b(c5088o, this.f38468a, iL);
            } else if (iA2 == n0.f38581d) {
                if (objB2 != null) {
                    abstractC5089p.h(b0Var, objB2, c5088o, abstractC5091s);
                } else {
                    abstractC5081hZ = b0Var.z();
                }
            } else if (!b0Var.C()) {
                break;
            }
        }
        if (b0Var.a() != n0.f38579b) {
            throw InvalidProtocolBufferException.c();
        }
        if (abstractC5081hZ != null) {
            if (objB2 != null) {
                abstractC5089p.i(abstractC5081hZ, objB2, c5088o, abstractC5091s);
            } else {
                h0Var.d(obj, iL, abstractC5081hZ);
            }
        }
        return true;
    }

    private void o(h0 h0Var, Object obj, o0 o0Var) {
        h0Var.s(h0Var.g(obj), o0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void a(Object obj, Object obj2) {
        e0.F(this.f38469b, obj, obj2);
        if (this.f38470c) {
            e0.D(this.f38471d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public Object b() {
        M m10 = this.f38468a;
        return m10 instanceof AbstractC5095w ? ((AbstractC5095w) m10).I() : m10.h().y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void c(Object obj) {
        this.f38469b.j(obj);
        this.f38471d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean d(Object obj) {
        return this.f38471d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public boolean e(Object obj, Object obj2) {
        if (!this.f38469b.g(obj).equals(this.f38469b.g(obj2))) {
            return false;
        }
        if (this.f38470c) {
            return this.f38471d.c(obj).equals(this.f38471d.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public int f(Object obj) {
        int iK = k(this.f38469b, obj);
        return this.f38470c ? iK + this.f38471d.c(obj).b() : iK;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public int g(Object obj) {
        int iHashCode = this.f38469b.g(obj).hashCode();
        return this.f38470c ? (iHashCode * 53) + this.f38471d.c(obj).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void h(Object obj, byte[] bArr, int i10, int i11, AbstractC5078e.a aVar) {
        AbstractC5095w abstractC5095w = (AbstractC5095w) obj;
        if (abstractC5095w.unknownFields == i0.c()) {
            abstractC5095w.unknownFields = i0.k();
        }
        AbstractC5487d.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void i(Object obj, o0 o0Var) {
        Iterator itF = this.f38471d.c(obj).f();
        if (itF.hasNext()) {
            AbstractC5487d.a(((Map.Entry) itF.next()).getKey());
            throw null;
        }
        o(this.f38469b, obj, o0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void j(Object obj, b0 b0Var, C5088o c5088o) {
        l(this.f38469b, this.f38471d, obj, b0Var, c5088o);
    }
}
