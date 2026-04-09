package Y2;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Y2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204f {

    /* renamed from: d, reason: collision with root package name */
    public static final G f4321d = G.f(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* renamed from: a, reason: collision with root package name */
    public final Application f4322a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f4323b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4324c;

    public C0204f(Application application) {
        this.f4322a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f4323b = sharedPreferences;
        this.f4324c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String string;
        Set<String> stringSet = this.f4323b.getStringSet("stored_info", J.i);
        if (stringSet.isEmpty()) {
            stringSet = f4321d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f4322a;
            C0219v c0219vA = A.a(application, str);
            if (c0219vA == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(c0219vA.f4374a, 0).getAll().get(c0219vA.f4375b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
