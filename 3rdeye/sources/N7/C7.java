package N7;

import A7.b;
import D7.a;
import N7.D7;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPageTransformationSlide.kt */
/* loaded from: classes.dex */
public final class C7 implements InterfaceC5868a {

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f5031g = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f5032h = b.a.a(Double.valueOf(1.0d));
    public static final b.C0000b i = b.a.a(Double.valueOf(1.0d));

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f5033j = b.a.a(Double.valueOf(1.0d));

    /* renamed from: k, reason: collision with root package name */
    public static final b.C0000b f5034k = b.a.a(Double.valueOf(1.0d));

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f5035a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Double> f5036b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Double> f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f5038d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Double> f5039e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f5040f;

    public C7(A7.b<EnumC1360t2> interpolator, A7.b<Double> nextPageAlpha, A7.b<Double> nextPageScale, A7.b<Double> previousPageAlpha, A7.b<Double> previousPageScale) {
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(nextPageAlpha, "nextPageAlpha");
        kotlin.jvm.internal.l.f(nextPageScale, "nextPageScale");
        kotlin.jvm.internal.l.f(previousPageAlpha, "previousPageAlpha");
        kotlin.jvm.internal.l.f(previousPageScale, "previousPageScale");
        this.f5035a = interpolator;
        this.f5036b = nextPageAlpha;
        this.f5037c = nextPageScale;
        this.f5038d = previousPageAlpha;
        this.f5039e = previousPageScale;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        D7.b bVar = (D7.b) D7.a.f1071b.f6835n5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return D7.b.e(c0011a, this);
    }

    public C7() {
        this(f5031g, f5032h, i, f5033j, f5034k);
    }
}
