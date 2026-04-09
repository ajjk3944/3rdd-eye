package N7;

import A7.b;
import D7.a;
import N7.C1109b9;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivScaleTransition.kt */
/* loaded from: classes.dex */
public final class Z8 implements InterfaceC5868a {

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f7859h = b.a.a(200L);
    public static final b.C0000b i = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f7860j = b.a.a(Double.valueOf(0.5d));

    /* renamed from: k, reason: collision with root package name */
    public static final b.C0000b f7861k = b.a.a(Double.valueOf(0.5d));

    /* renamed from: l, reason: collision with root package name */
    public static final b.C0000b f7862l = b.a.a(Double.valueOf(0.0d));

    /* renamed from: m, reason: collision with root package name */
    public static final b.C0000b f7863m = b.a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f7864a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f7865b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Double> f7866c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f7867d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Double> f7868e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Long> f7869f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f7870g;

    public Z8(A7.b<Long> duration, A7.b<EnumC1360t2> interpolator, A7.b<Double> pivotX, A7.b<Double> pivotY, A7.b<Double> scale, A7.b<Long> startDelay) {
        kotlin.jvm.internal.l.f(duration, "duration");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(pivotX, "pivotX");
        kotlin.jvm.internal.l.f(pivotY, "pivotY");
        kotlin.jvm.internal.l.f(scale, "scale");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f7864a = duration;
        this.f7865b = interpolator;
        this.f7866c = pivotX;
        this.f7867d = pivotY;
        this.f7868e = scale;
        this.f7869f = startDelay;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1109b9.b bVar = (C1109b9.b) D7.a.f1071b.f6911u6.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1109b9.b.e(c0011a, this);
    }

    public Z8() {
        this(f7859h, i, f7860j, f7861k, f7862l, f7863m);
    }
}
