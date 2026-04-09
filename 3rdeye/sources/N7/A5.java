package N7;

import A7.b;
import N7.B5;
import android.net.Uri;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivImageBackground.kt */
/* loaded from: classes.dex */
public final class A5 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Double> f4764a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1305p2> f4765b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1319q2> f4766c;

    /* renamed from: d, reason: collision with root package name */
    public final List<F4> f4767d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Uri> f4768e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Boolean> f4769f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<E5> f4770g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f4771h;

    static {
        b.a.a(Double.valueOf(1.0d));
        b.a.a(EnumC1305p2.CENTER);
        b.a.a(EnumC1319q2.CENTER);
        b.a.a(Boolean.FALSE);
        b.a.a(E5.FILL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A5(A7.b<Double> alpha, A7.b<EnumC1305p2> contentAlignmentHorizontal, A7.b<EnumC1319q2> contentAlignmentVertical, List<? extends F4> list, A7.b<Uri> bVar, A7.b<Boolean> preloadRequired, A7.b<E5> scale) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        kotlin.jvm.internal.l.f(contentAlignmentVertical, "contentAlignmentVertical");
        kotlin.jvm.internal.l.f(preloadRequired, "preloadRequired");
        kotlin.jvm.internal.l.f(scale, "scale");
        this.f4764a = alpha;
        this.f4765b = contentAlignmentHorizontal;
        this.f4766c = contentAlignmentVertical;
        this.f4767d = list;
        this.f4768e = bVar;
        this.f4769f = preloadRequired;
        this.f4770g = scale;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((B5.d) D7.a.f1071b.f6588R3.getValue()).b(D7.a.f1070a, this);
    }
}
