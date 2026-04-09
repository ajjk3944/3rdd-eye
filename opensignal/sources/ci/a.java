package ci;

import ak.d;
import android.telephony.ServiceState;
import br.l;
import ch.f;
import com.opensignal.sdk.common.measurements.base.c;
import com.opensignal.sdk.common.measurements.base.e;
import fj.n;
import kg.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f3970a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3971b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.f f3972c;

    public a(r rVar, f fVar, n nVar) {
        this.f3970a = fVar;
        this.f3971b = nVar;
        this.f3972c = new a8.f((e) rVar.f14395a, (f) rVar.f14396d, (com.opensignal.sdk.common.measurements.base.f) rVar.f14397g, (c) rVar.f14398r);
    }

    public final String a(d dVar) throws JSONException {
        String string;
        l.e(dVar, "backgroundConfig");
        String str = dVar.f472a;
        ch.n.b("FiveGFieldDataCollector", "getFiveGFields()");
        string = "";
        if (this.f3970a.e()) {
            ServiceState serviceState = this.f3971b.N;
            a8.f fVar = this.f3972c;
            fVar.C(serviceState, str);
            fVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectU = fVar.u();
                if (jSONObjectU.length() > 0) {
                    jSONObject.put("ServiceState", jSONObjectU);
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("SignalStrength", jSONObject2);
                }
            } catch (JSONException e4) {
                ch.n.b("FiveGFieldExtractor", e4);
            }
            string = jSONObject.length() != 0 ? jSONObject.toString() : "";
            l.d(string, "getResultAsJson(...)");
        }
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.data.collection.FiveGFieldDataCollector");
        a aVar = (a) obj;
        return this.f3971b.equals(aVar.f3971b) && l.a(this.f3972c, aVar.f3972c) && this.f3970a.equals(aVar.f3970a);
    }

    public final int hashCode() {
        return this.f3970a.hashCode() + ((this.f3972c.hashCode() + (this.f3971b.hashCode() * 31)) * 31);
    }
}
