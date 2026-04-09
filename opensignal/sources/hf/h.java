package hf;

import io.sentry.android.core.e0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final g f10651d = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.media3.exoplayer.trackselection.d f10652e = new androidx.media3.exoplayer.trackselection.d(13);

    /* renamed from: a, reason: collision with root package name */
    public final of.b f10653a;

    /* renamed from: b, reason: collision with root package name */
    public String f10654b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f10655c = null;

    public h(of.b bVar) {
        this.f10653a = bVar;
    }

    public static void a(of.b bVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.e(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e4) {
            e0.q("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e4);
        }
    }
}
