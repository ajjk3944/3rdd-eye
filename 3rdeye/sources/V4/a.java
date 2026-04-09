package V4;

import A2.l;
import V4.b;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes2.dex */
public final class a implements g {
    public static b b(l lVar) {
        return new b(System.currentTimeMillis() + 3600000, new b.C0184b(8), new b.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // V4.g
    public final b a(l lVar, JSONObject jSONObject) {
        return b(lVar);
    }
}
