package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.internal.f1;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes4.dex */
public abstract class AbstractJsonTreeEncoder extends f1 implements z9.i {

    /* renamed from: b, reason: collision with root package name */
    public final z9.a f22963b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.l f22964c;

    /* renamed from: d, reason: collision with root package name */
    public final z9.d f22965d;

    /* renamed from: e, reason: collision with root package name */
    public String f22966e;

    public static final class a extends y9.b {

        /* renamed from: a, reason: collision with root package name */
        public final aa.c f22967a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22969c;

        public a(String str) {
            this.f22969c = str;
            this.f22967a = AbstractJsonTreeEncoder.this.d().a();
        }

        @Override // y9.b, y9.f
        public void B(int i10) {
            K(Long.toString(y8.l.b(i10) & 4294967295L, 10));
        }

        public final void K(String s10) {
            kotlin.jvm.internal.p.e(s10, "s");
            AbstractJsonTreeEncoder.this.s0(this.f22969c, new z9.l(s10, false));
        }

        @Override // y9.f
        public aa.c a() {
            return this.f22967a;
        }

        @Override // y9.b, y9.f
        public void h(byte b10) {
            K(y8.j.f(y8.j.b(b10)));
        }

        @Override // y9.b, y9.f
        public void m(long j10) {
            K(g.a(y8.n.b(j10), 10));
        }

        @Override // y9.b, y9.f
        public void q(short s10) {
            K(y8.q.f(y8.q.b(s10)));
        }
    }

    public /* synthetic */ AbstractJsonTreeEncoder(z9.a aVar, l9.l lVar, kotlin.jvm.internal.i iVar) {
        this(aVar, lVar);
    }

    public static final /* synthetic */ String e0(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        return (String) abstractJsonTreeEncoder.V();
    }

    @Override // z9.i
    public void A(kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(element, "element");
        e(JsonElementSerializer.f22944a, element);
    }

    @Override // kotlinx.serialization.internal.c2
    public void U(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        this.f22964c.invoke(r0());
    }

    @Override // y9.f
    public final aa.c a() {
        return this.f22963b.a();
    }

    @Override // kotlinx.serialization.internal.f1
    public String a0(String parentName, String childName) {
        kotlin.jvm.internal.p.e(parentName, "parentName");
        kotlin.jvm.internal.p.e(childName, "childName");
        return childName;
    }

    @Override // y9.f
    public y9.d b(kotlinx.serialization.descriptors.f descriptor) {
        AbstractJsonTreeEncoder yVar;
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        l9.l lVar = W() == null ? this.f22964c : new l9.l() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
            {
                super(1);
            }

            public final void a(kotlinx.serialization.json.b node) {
                kotlin.jvm.internal.p.e(node, "node");
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = this.this$0;
                abstractJsonTreeEncoder.s0(AbstractJsonTreeEncoder.e0(abstractJsonTreeEncoder), node);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlinx.serialization.json.b) obj);
                return y8.s.f25199a;
            }
        };
        kotlinx.serialization.descriptors.h kind = descriptor.getKind();
        if (kotlin.jvm.internal.p.a(kind, i.b.f22787a) ? true : kind instanceof kotlinx.serialization.descriptors.d) {
            yVar = new a0(this.f22963b, lVar);
        } else if (kotlin.jvm.internal.p.a(kind, i.c.f22788a)) {
            z9.a aVar = this.f22963b;
            kotlinx.serialization.descriptors.f fVarA = m0.a(descriptor.g(0), aVar.a());
            kotlinx.serialization.descriptors.h kind2 = fVarA.getKind();
            if ((kind2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.p.a(kind2, h.b.f22785a)) {
                yVar = new c0(this.f22963b, lVar);
            } else {
                if (!aVar.e().b()) {
                    throw s.d(fVarA);
                }
                yVar = new a0(this.f22963b, lVar);
            }
        } else {
            yVar = new y(this.f22963b, lVar);
        }
        String str = this.f22966e;
        if (str != null) {
            kotlin.jvm.internal.p.b(str);
            yVar.s0(str, z9.g.c(descriptor.h()));
            this.f22966e = null;
        }
        return yVar;
    }

    @Override // z9.i
    public final z9.a d() {
        return this.f22963b;
    }

    @Override // kotlinx.serialization.internal.c2, y9.f
    public void e(kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (W() == null && TreeJsonEncoderKt.b(m0.a(serializer.getDescriptor(), a()))) {
            v vVar = new v(this.f22963b, this.f22964c);
            vVar.e(serializer, obj);
            vVar.U(serializer.getDescriptor());
        } else {
            if (!(serializer instanceof kotlinx.serialization.internal.b) || d().e().k()) {
                serializer.serialize(this, obj);
                return;
            }
            kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) serializer;
            String strC = e0.c(serializer.getDescriptor(), d());
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlin.Any");
            kotlinx.serialization.e eVarB = kotlinx.serialization.c.b(bVar, this, obj);
            e0.f(bVar, eVarB, strC);
            e0.b(eVarB.getDescriptor().getKind());
            this.f22966e = strC;
            eVarB.serialize(this, obj);
        }
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.a(Boolean.valueOf(z10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Byte.valueOf(b10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.c(String.valueOf(c10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Double.valueOf(d10)));
        if (this.f22965d.a()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw s.c(Double.valueOf(d10), tag, r0().toString());
        }
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        s0(tag, z9.g.c(enumDescriptor.e(i10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Float.valueOf(f10)));
        if (this.f22965d.a()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw s.c(Float.valueOf(f10), tag, r0().toString());
        }
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public y9.f P(String tag, kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlin.jvm.internal.p.e(inlineDescriptor, "inlineDescriptor");
        return i0.a(inlineDescriptor) ? new a(tag) : super.P(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Integer.valueOf(i10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Long.valueOf(j10)));
    }

    @Override // y9.f
    public void o() {
        String str = (String) W();
        if (str == null) {
            this.f22964c.invoke(JsonNull.f22952c);
        } else {
            o0(str);
        }
    }

    public void o0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, JsonNull.f22952c);
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short s10) {
        kotlin.jvm.internal.p.e(tag, "tag");
        s0(tag, z9.g.b(Short.valueOf(s10)));
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlin.jvm.internal.p.e(value, "value");
        s0(tag, z9.g.c(value));
    }

    public abstract kotlinx.serialization.json.b r0();

    public abstract void s0(String str, kotlinx.serialization.json.b bVar);

    @Override // y9.f
    public void v() {
    }

    @Override // y9.d
    public boolean z(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return this.f22965d.e();
    }

    public AbstractJsonTreeEncoder(z9.a aVar, l9.l lVar) {
        this.f22963b = aVar;
        this.f22964c = lVar;
        this.f22965d = aVar.e();
    }
}
