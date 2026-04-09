package je;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final h f27552d = new h(0);

    /* renamed from: e, reason: collision with root package name */
    public static final b4.b f27553e = new b4.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final pe.c f27554a;

    /* renamed from: b, reason: collision with root package name */
    public String f27555b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f27556c = null;

    public i(pe.c cVar) {
        this.f27554a = cVar;
    }

    public static void a(pe.c cVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
