package N7;

import A7.b;
import N7.C1300ob;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextRangeMaskParticles.kt */
/* renamed from: N7.nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286nb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f8838a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Double> f8839b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Boolean> f8840c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Boolean> f8841d;

    /* renamed from: e, reason: collision with root package name */
    public final W4 f8842e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f8843f;

    static {
        b.a.a(Double.valueOf(0.8d));
        b.a.a(Boolean.FALSE);
        b.a.a(Boolean.TRUE);
        new W4(b.a.a(1L));
    }

    public C1286nb(A7.b<Integer> bVar, A7.b<Double> density, A7.b<Boolean> isAnimated, A7.b<Boolean> isEnabled, W4 w42) {
        kotlin.jvm.internal.l.f(density, "density");
        kotlin.jvm.internal.l.f(isAnimated, "isAnimated");
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        this.f8838a = bVar;
        this.f8839b = density;
        this.f8840c = isAnimated;
        this.f8841d = isEnabled;
        this.f8842e = w42;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1300ob.a) D7.a.f1071b.f6749f8.getValue()).b(D7.a.f1070a, this);
    }
}
