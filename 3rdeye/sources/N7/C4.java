package N7;

import A7.b;
import D7.a;
import N7.D4;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFadeTransition.kt */
/* loaded from: classes.dex */
public final class C4 implements InterfaceC5868a {

    /* renamed from: f, reason: collision with root package name */
    public static final b.C0000b f5015f = b.a.a(Double.valueOf(0.0d));

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f5016g = b.a.a(200L);

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f5017h = b.a.a(EnumC1360t2.EASE_IN_OUT);
    public static final b.C0000b i = b.a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Double> f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f5020c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f5021d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f5022e;

    public C4(A7.b<Double> alpha, A7.b<Long> duration, A7.b<EnumC1360t2> interpolator, A7.b<Long> startDelay) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(duration, "duration");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f5018a = alpha;
        this.f5019b = duration;
        this.f5020c = interpolator;
        this.f5021d = startDelay;
    }

    public final boolean a(C4 c42, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return c42 != null && this.f5018a.a(resolver).doubleValue() == c42.f5018a.a(otherResolver).doubleValue() && this.f5019b.a(resolver).longValue() == c42.f5019b.a(otherResolver).longValue() && this.f5020c.a(resolver) == c42.f5020c.a(otherResolver) && this.f5021d.a(resolver).longValue() == c42.f5021d.a(otherResolver).longValue();
    }

    public final int b() {
        Integer num = this.f5022e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f5021d.hashCode() + this.f5020c.hashCode() + this.f5019b.hashCode() + this.f5018a.hashCode() + kotlin.jvm.internal.x.a(C4.class).hashCode();
        this.f5022e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        D4.b bVar = (D4.b) D7.a.f1071b.f6697b3.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return D4.b.e(c0011a, this);
    }

    public C4() {
        this(f5015f, f5016g, f5017h, i);
    }
}
