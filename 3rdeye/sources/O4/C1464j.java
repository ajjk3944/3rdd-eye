package O4;

import android.util.Log;
import java.io.IOException;

/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* renamed from: O4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1464j {

    /* renamed from: d, reason: collision with root package name */
    public static final C1462h f10311d = new C1462h();

    /* renamed from: e, reason: collision with root package name */
    public static final C1463i f10312e = new C1463i(0);

    /* renamed from: a, reason: collision with root package name */
    public final T4.e f10313a;

    /* renamed from: b, reason: collision with root package name */
    public String f10314b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f10315c = null;

    public C1464j(T4.e eVar) {
        this.f10313a = eVar;
    }

    public static void a(T4.e eVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            eVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e4);
        }
    }
}
