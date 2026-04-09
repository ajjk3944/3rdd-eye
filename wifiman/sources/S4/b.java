package S4;

import S4.d;
import com.google.firebase.crashlytics.internal.common.F;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements i {
    b() {
    }

    static d b(F f10) {
        return new d(f10.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // S4.i
    public d a(F f10, JSONObject jSONObject) {
        return b(f10);
    }
}
