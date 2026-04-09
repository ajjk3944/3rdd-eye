package N7;

import A7.b;
import N7.A1;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionScrollTo.kt */
/* renamed from: N7.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443z1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f9998a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1373u1 f9999b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f10000c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f10001d;

    static {
        new b.C0000b(Boolean.TRUE);
    }

    public C1443z1(A7.b<Boolean> animated, AbstractC1373u1 abstractC1373u1, A7.b<String> bVar) {
        kotlin.jvm.internal.l.f(animated, "animated");
        this.f9998a = animated;
        this.f9999b = abstractC1373u1;
        this.f10000c = bVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((A1.a) D7.a.f1071b.f6406A0.getValue()).b(D7.a.f1070a, this);
    }
}
