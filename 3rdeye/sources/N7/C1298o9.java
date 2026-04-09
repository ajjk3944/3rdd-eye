package N7;

import A7.b;
import N7.C1312p9;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivShadow.kt */
/* renamed from: N7.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298o9 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Double> f8862a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f8863b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Integer> f8864c;

    /* renamed from: d, reason: collision with root package name */
    public final C1325q8 f8865d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8866e;

    static {
        b.a.a(Double.valueOf(0.19d));
        b.a.a(2L);
        b.a.a(0);
    }

    public C1298o9(A7.b<Double> alpha, A7.b<Long> blur, A7.b<Integer> color, C1325q8 c1325q8) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(blur, "blur");
        kotlin.jvm.internal.l.f(color, "color");
        this.f8862a = alpha;
        this.f8863b = blur;
        this.f8864c = color;
        this.f8865d = c1325q8;
    }

    public final boolean a(C1298o9 c1298o9, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return c1298o9 != null && this.f8862a.a(resolver).doubleValue() == c1298o9.f8862a.a(otherResolver).doubleValue() && this.f8863b.a(resolver).longValue() == c1298o9.f8863b.a(otherResolver).longValue() && this.f8864c.a(resolver).intValue() == c1298o9.f8864c.a(otherResolver).intValue() && this.f8865d.a(c1298o9.f8865d, resolver, otherResolver);
    }

    public final int b() {
        Integer num = this.f8866e;
        if (num != null) {
            return num.intValue();
        }
        int iB = this.f8865d.b() + this.f8864c.hashCode() + this.f8863b.hashCode() + this.f8862a.hashCode() + kotlin.jvm.internal.x.a(C1298o9.class).hashCode();
        this.f8866e = Integer.valueOf(iB);
        return iB;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1312p9.a) D7.a.f1071b.f6508J6.getValue()).b(D7.a.f1070a, this);
    }
}
