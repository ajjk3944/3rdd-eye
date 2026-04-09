package N7;

import A7.b;
import N7.C1104b4;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivDefaultIndicatorItemPlacement.kt */
/* renamed from: N7.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089a4 implements InterfaceC5868a {

    /* renamed from: c, reason: collision with root package name */
    public static final W4 f7893c = new W4(new b.C0000b(15L));

    /* renamed from: a, reason: collision with root package name */
    public final W4 f7894a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7895b;

    public C1089a4() {
        this(f7893c);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1104b4.a) D7.a.f1071b.f6473G2.getValue()).b(D7.a.f1070a, this);
    }

    public C1089a4(W4 spaceBetweenCenters) {
        kotlin.jvm.internal.l.f(spaceBetweenCenters, "spaceBetweenCenters");
        this.f7894a = spaceBetweenCenters;
    }
}
