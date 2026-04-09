package S9;

import O9.k;
import O9.l;
import Q9.AbstractC1520b;
import Q9.AbstractC1527e0;
import R9.AbstractC1564a;
import b9.C1992A;
import c9.C2097r;
import t4.C5606d;

/* compiled from: TreeJsonEncoder.kt */
/* renamed from: S9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1571c extends AbstractC1527e0 implements R9.r {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1564a f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final p9.l<R9.i, C1992A> f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final R9.g f12074d;

    /* renamed from: e, reason: collision with root package name */
    public String f12075e;

    /* compiled from: TreeJsonEncoder.kt */
    /* renamed from: S9.c$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<R9.i, C1992A> {
        public a() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(R9.i iVar) {
            R9.i node = iVar;
            kotlin.jvm.internal.l.f(node, "node");
            AbstractC1571c abstractC1571c = AbstractC1571c.this;
            abstractC1571c.X(node, (String) C2097r.v0(abstractC1571c.f11414a));
            return C1992A.f18074a;
        }
    }

    public AbstractC1571c(AbstractC1564a abstractC1564a, p9.l lVar) {
        this.f12072b = abstractC1564a;
        this.f12073c = lVar;
        this.f12074d = abstractC1564a.f11781a;
    }

    @Override // P9.c
    public final boolean F(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return this.f12074d.f11799a;
    }

    @Override // Q9.E0
    public final void H(String str, boolean z10) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z10);
        Q9.M m10 = R9.j.f11806a;
        X(new R9.u(boolValueOf, false, null), tag);
    }

    @Override // Q9.E0
    public final void I(byte b10, Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Byte.valueOf(b10)), tag);
    }

    @Override // Q9.E0
    public final void J(String str, char c10) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.b(String.valueOf(c10)), tag);
    }

    @Override // Q9.E0
    public final void K(String str, double d10) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Double.valueOf(d10)), tag);
        this.f12074d.getClass();
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            Double dValueOf = Double.valueOf(d10);
            String output = W().toString();
            kotlin.jvm.internal.l.f(output, "output");
            throw new w(E.u.R(dValueOf, tag, output));
        }
    }

    @Override // Q9.E0
    public final void L(String str, O9.e enumDescriptor, int i) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        X(R9.j.b(enumDescriptor.g(i)), tag);
    }

    @Override // Q9.E0
    public final void M(String str, float f10) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Float.valueOf(f10)), tag);
        this.f12074d.getClass();
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            Float fValueOf = Float.valueOf(f10);
            String output = W().toString();
            kotlin.jvm.internal.l.f(output, "output");
            throw new w(E.u.R(fValueOf, tag, output));
        }
    }

    @Override // Q9.E0
    public final P9.e N(String str, O9.e inlineDescriptor) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(inlineDescriptor, "inlineDescriptor");
        if (P.a(inlineDescriptor)) {
            return new C1573e(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(R9.j.f11806a)) {
            return new C1572d(this, tag, inlineDescriptor);
        }
        this.f11414a.add(tag);
        return this;
    }

    @Override // Q9.E0
    public final void O(int i, Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Integer.valueOf(i)), tag);
    }

    @Override // Q9.E0
    public final void P(long j4, Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Long.valueOf(j4)), tag);
    }

    @Override // Q9.E0
    public final void Q(String str, short s10) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        X(R9.j.a(Short.valueOf(s10)), tag);
    }

    @Override // Q9.E0
    public final void R(String str, String value) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(value, "value");
        X(R9.j.b(value), tag);
    }

    @Override // Q9.E0
    public final void S(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        this.f12073c.invoke(W());
    }

    @Override // Q9.AbstractC1527e0
    public String V(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        AbstractC1564a json = this.f12072b;
        kotlin.jvm.internal.l.f(json, "json");
        y.c(descriptor, json);
        return descriptor.g(i);
    }

    public abstract R9.i W();

    public abstract void X(R9.i iVar, String str);

    @Override // P9.e
    public final I9.g a() {
        return this.f12072b.f11782b;
    }

    @Override // R9.r
    public final AbstractC1564a c() {
        return this.f12072b;
    }

    @Override // P9.e
    public final P9.c d(O9.e descriptor) {
        AbstractC1571c f10;
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        p9.l nodeConsumer = C2097r.w0(this.f11414a) == null ? this.f12073c : new a();
        O9.k kVarE = descriptor.e();
        boolean z10 = kotlin.jvm.internal.l.b(kVarE, l.b.f10524a) ? true : kVarE instanceof O9.c;
        AbstractC1564a abstractC1564a = this.f12072b;
        if (z10) {
            f10 = new B(abstractC1564a, nodeConsumer, 1);
        } else if (kotlin.jvm.internal.l.b(kVarE, l.c.f10525a)) {
            O9.e eVarA = U.a(descriptor.i(0), abstractC1564a.f11782b);
            O9.k kVarE2 = eVarA.e();
            if ((kVarE2 instanceof O9.d) || kotlin.jvm.internal.l.b(kVarE2, k.b.f10522a)) {
                kotlin.jvm.internal.l.f(nodeConsumer, "nodeConsumer");
                I i = new I(abstractC1564a, nodeConsumer);
                i.f12029h = true;
                f10 = i;
            } else {
                if (!abstractC1564a.f11781a.f11801c) {
                    throw E.u.g(eVarA);
                }
                f10 = new B(abstractC1564a, nodeConsumer, 1);
            }
        } else {
            f10 = new F(abstractC1564a, nodeConsumer);
        }
        String str = this.f12075e;
        if (str != null) {
            f10.X(R9.j.b(descriptor.a()), str);
            this.f12075e = null;
        }
        return f10;
    }

    @Override // P9.e
    public final void f() {
        String str = (String) C2097r.w0(this.f11414a);
        if (str == null) {
            this.f12073c.invoke(R9.x.INSTANCE);
        } else {
            X(R9.x.INSTANCE, str);
        }
    }

    @Override // R9.r
    public final void t(R9.i element) {
        kotlin.jvm.internal.l.f(element, "element");
        x(R9.p.f11812a, element);
    }

    @Override // Q9.E0, P9.e
    public final <T> void x(M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(serializer, "serializer");
        Object objW0 = C2097r.w0(this.f11414a);
        AbstractC1564a abstractC1564a = this.f12072b;
        if (objW0 == null) {
            O9.e eVarA = U.a(serializer.getDescriptor(), abstractC1564a.f11782b);
            if ((eVarA.e() instanceof O9.d) || eVarA.e() == k.b.f10522a) {
                new B(abstractC1564a, this.f12073c, 0).x(serializer, t10);
                return;
            }
        }
        if (!(serializer instanceof AbstractC1520b)) {
            serializer.serialize(this, t10);
            return;
        }
        R9.g gVar = abstractC1564a.f11781a;
        AbstractC1520b abstractC1520b = (AbstractC1520b) serializer;
        String strM = C5606d.m(serializer.getDescriptor(), abstractC1564a);
        kotlin.jvm.internal.l.d(t10, "null cannot be cast to non-null type kotlin.Any");
        M9.b bVarT = A9.I.t(abstractC1520b, this, t10);
        C5606d.j(bVarT.getDescriptor().e());
        this.f12075e = strM;
        bVarT.serialize(this, t10);
    }

    @Override // Q9.E0, P9.e
    public final P9.e z(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return C2097r.w0(this.f11414a) != null ? super.z(descriptor) : new B(this.f12072b, this.f12073c, 0).z(descriptor);
    }

    @Override // P9.e
    public final void r() {
    }
}
