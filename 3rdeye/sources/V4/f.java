package V4;

import A2.l;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final l f12940a;

    public f(l lVar) {
        this.f12940a = lVar;
    }

    public final b a(JSONObject jSONObject) throws JSONException {
        g jVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            jVar = new a();
        } else {
            jVar = new j();
        }
        return jVar.a(this.f12940a, jSONObject);
    }
}
