package tb;

import Sj.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;
import mh.InterfaceC6835l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8067m extends kb.r {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f62037b;

    public C8067m(InterfaceC6835l onSignallingOfferReceived) {
        AbstractC6492s.i(onSignallingOfferReceived, "onSignallingOfferReceived");
        this.f62037b = onSignallingOfferReceived;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kb.r
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public kb.t c() {
        return new kb.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kb.r
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(kb.t response) throws JSONException {
        AbstractC6492s.i(response, "response");
        String str = new String(response.b(), C6510d.f52215b);
        JSONObject jSONObject = new JSONObject(str);
        a.b bVar = Sj.a.f20830a;
        bVar.a("Signaling " + str, new Object[0]);
        if (!jSONObject.has("type")) {
            bVar.o("Unknown signalling response " + jSONObject, new Object[0]);
            return;
        }
        if (AbstractC6492s.d(jSONObject.getString("type"), "offer")) {
            InterfaceC6835l interfaceC6835l = this.f62037b;
            String string = jSONObject.getString("offer");
            AbstractC6492s.h(string, "getString(...)");
            interfaceC6835l.invoke(string);
            return;
        }
        bVar.o("Unknown signalling type " + jSONObject, new Object[0]);
    }
}
