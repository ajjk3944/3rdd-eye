package N7;

import A7.b;
import D7.a;
import N7.C1216ib;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextRangeMaskBase.kt */
/* renamed from: N7.hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201hb implements InterfaceC5868a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0000b f8365b = new b.C0000b(Boolean.TRUE);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f8366a;

    public C1201hb() {
        this(f8365b);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1216ib.a aVar = (C1216ib.a) D7.a.f1071b.f6726d8.getValue();
        a.C0011a context = D7.a.f1070a;
        aVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "is_enabled", this.f8366a);
        return jSONObject;
    }

    public C1201hb(A7.b<Boolean> isEnabled) {
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        this.f8366a = isEnabled;
    }
}
