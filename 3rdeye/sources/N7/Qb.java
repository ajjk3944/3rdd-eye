package N7;

import A7.b;
import N7.AbstractC1138d8;
import N7.Rb;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTransform.kt */
/* loaded from: classes.dex */
public final class Qb implements InterfaceC5868a {

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1138d8.b f6101e = new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1138d8.b f6102f = new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1138d8 f6103a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1138d8 f6104b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Double> f6105c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f6106d;

    public Qb() {
        this(f6101e, f6102f, null);
    }

    public final boolean a(Qb qb, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (qb == null || !this.f6103a.a(qb.f6103a, resolver, otherResolver) || !this.f6104b.a(qb.f6104b, resolver, otherResolver)) {
            return false;
        }
        A7.b<Double> bVar = this.f6105c;
        Double dA = bVar != null ? bVar.a(resolver) : null;
        A7.b<Double> bVar2 = qb.f6105c;
        return kotlin.jvm.internal.l.a(dA, bVar2 != null ? bVar2.a(otherResolver) : null);
    }

    public final int b() {
        Integer num = this.f6106d;
        if (num != null) {
            return num.intValue();
        }
        int iB = this.f6104b.b() + this.f6103a.b() + kotlin.jvm.internal.x.a(Qb.class).hashCode();
        A7.b<Double> bVar = this.f6105c;
        int iHashCode = iB + (bVar != null ? bVar.hashCode() : 0);
        this.f6106d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Rb.a) D7.a.f1071b.f6604S8.getValue()).b(D7.a.f1070a, this);
    }

    public Qb(AbstractC1138d8 pivotX, AbstractC1138d8 pivotY, A7.b<Double> bVar) {
        kotlin.jvm.internal.l.f(pivotX, "pivotX");
        kotlin.jvm.internal.l.f(pivotY, "pivotY");
        this.f6103a = pivotX;
        this.f6104b = pivotY;
        this.f6105c = bVar;
    }
}
