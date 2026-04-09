package ub;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
public abstract class f {
    public static final String a(Context context) {
        AbstractC6492s.i(context, "<this>");
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    public static final RequestBody b(String str) {
        AbstractC6492s.i(str, "<this>");
        return RequestBody.INSTANCE.b(str, MediaType.INSTANCE.a("application/json"));
    }
}
