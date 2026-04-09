package V4;

import A2.l;
import F9.y;
import H6.I;
import N7.G8;
import O4.J;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12932a;

    /* renamed from: b, reason: collision with root package name */
    public final i f12933b;

    /* renamed from: c, reason: collision with root package name */
    public final f f12934c;

    /* renamed from: d, reason: collision with root package name */
    public final l f12935d;

    /* renamed from: e, reason: collision with root package name */
    public final I f12936e;

    /* renamed from: f, reason: collision with root package name */
    public final y f12937f;

    /* renamed from: g, reason: collision with root package name */
    public final J f12938g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<b> f12939h;
    public final AtomicReference<TaskCompletionSource<b>> i;

    public e(Context context, i iVar, l lVar, f fVar, I i, y yVar, J j4) {
        AtomicReference<b> atomicReference = new AtomicReference<>();
        this.f12939h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.f12932a = context;
        this.f12933b = iVar;
        this.f12935d = lVar;
        this.f12934c = fVar;
        this.f12936e = i;
        this.f12937f = yVar;
        this.f12938g = j4;
        atomicReference.set(a.b(lVar));
    }

    public static void c(String str, JSONObject jSONObject) throws JSONException {
        StringBuilder sbU = G8.u(str);
        sbU.append(jSONObject.toString());
        String string = sbU.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public final b a(c cVar) {
        b bVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectG = this.f12936e.g();
                if (jSONObjectG != null) {
                    b bVarA = this.f12934c.a(jSONObjectG);
                    c("Loaded cached settings: ", jSONObjectG);
                    this.f12935d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c.IGNORE_CACHE_EXPIRATION.equals(cVar) || bVarA.f12923c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return bVarA;
                        } catch (Exception e4) {
                            e = e4;
                            bVar = bVarA;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final b b() {
        return this.f12939h.get();
    }
}
