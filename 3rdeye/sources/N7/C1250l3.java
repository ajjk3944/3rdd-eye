package N7;

import A7.b;
import N7.C1264m3;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCircleShape.kt */
/* renamed from: N7.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250l3 implements InterfaceC5868a {

    /* renamed from: e, reason: collision with root package name */
    public static final W4 f8726e = new W4(new b.C0000b(10L));

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f8727a;

    /* renamed from: b, reason: collision with root package name */
    public final W4 f8728b;

    /* renamed from: c, reason: collision with root package name */
    public final C1185ga f8729c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f8730d;

    public C1250l3() {
        this(null, f8726e, null);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1264m3.a) D7.a.f1071b.f6619U1.getValue()).b(D7.a.f1070a, this);
    }

    public C1250l3(A7.b<Integer> bVar, W4 radius, C1185ga c1185ga) {
        kotlin.jvm.internal.l.f(radius, "radius");
        this.f8727a = bVar;
        this.f8728b = radius;
        this.f8729c = c1185ga;
    }
}
