package N7;

import A7.b;
import D7.a;
import N7.A7;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPageTransformationOverlap.kt */
/* renamed from: N7.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449z7 implements InterfaceC5868a {

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f10090h = b.a.a(EnumC1360t2.EASE_IN_OUT);
    public static final b.C0000b i = b.a.a(Double.valueOf(1.0d));

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f10091j = b.a.a(Double.valueOf(1.0d));

    /* renamed from: k, reason: collision with root package name */
    public static final b.C0000b f10092k = b.a.a(Double.valueOf(1.0d));

    /* renamed from: l, reason: collision with root package name */
    public static final b.C0000b f10093l = b.a.a(Double.valueOf(1.0d));

    /* renamed from: m, reason: collision with root package name */
    public static final b.C0000b f10094m = b.a.a(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f10095a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Double> f10096b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Double> f10097c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f10098d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Double> f10099e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Boolean> f10100f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f10101g;

    public C1449z7(A7.b<EnumC1360t2> interpolator, A7.b<Double> nextPageAlpha, A7.b<Double> nextPageScale, A7.b<Double> previousPageAlpha, A7.b<Double> previousPageScale, A7.b<Boolean> reversedStackingOrder) {
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(nextPageAlpha, "nextPageAlpha");
        kotlin.jvm.internal.l.f(nextPageScale, "nextPageScale");
        kotlin.jvm.internal.l.f(previousPageAlpha, "previousPageAlpha");
        kotlin.jvm.internal.l.f(previousPageScale, "previousPageScale");
        kotlin.jvm.internal.l.f(reversedStackingOrder, "reversedStackingOrder");
        this.f10095a = interpolator;
        this.f10096b = nextPageAlpha;
        this.f10097c = nextPageScale;
        this.f10098d = previousPageAlpha;
        this.f10099e = previousPageScale;
        this.f10100f = reversedStackingOrder;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        A7.b bVar = (A7.b) D7.a.f1071b.f6803k5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return A7.b.e(c0011a, this);
    }

    public C1449z7() {
        this(f10090h, i, f10091j, f10092k, f10093l, f10094m);
    }
}
