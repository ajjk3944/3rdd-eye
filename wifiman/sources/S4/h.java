package S4;

import com.google.firebase.crashlytics.internal.common.F;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final F f20275a;

    h(F f10) {
        this.f20275a = f10;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        I4.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f20275a, jSONObject);
    }
}
