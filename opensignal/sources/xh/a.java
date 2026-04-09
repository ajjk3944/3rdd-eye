package xh;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;
import mq.w;
import org.json.JSONArray;
import xu.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25309a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f25310b;

    public a(SharedPreferences sharedPreferences) {
        this.f25309a = sharedPreferences;
        AtomicReference atomicReference = new AtomicReference(w.f16945a);
        this.f25310b = atomicReference;
        String string = sharedPreferences.getString("excludedDevices", null);
        if (string != null) {
            atomicReference.set(d.i0(new JSONArray(string)));
        }
    }
}
