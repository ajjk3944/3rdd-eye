package N7;

import A7.b;
import D7.a;
import N7.C1216ib;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextRangeMaskBaseTemplate.kt */
/* renamed from: N7.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230jb implements InterfaceC5868a, z7.b<C1201hb> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f8597a;

    static {
        new b.C0000b(Boolean.TRUE);
    }

    public C1230jb(AbstractC5371a<A7.b<Boolean>> abstractC5371a) {
        this.f8597a = abstractC5371a;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1216ib.b bVar = (C1216ib.b) D7.a.f1071b.f6737e8.getValue();
        a.C0011a context = D7.a.f1070a;
        bVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "is_enabled", this.f8597a);
        return jSONObject;
    }
}
