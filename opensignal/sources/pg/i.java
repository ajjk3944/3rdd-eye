package pg;

import io.sentry.android.core.e0;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f20522e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f20523f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f20524a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20525b;

    /* renamed from: c, reason: collision with root package name */
    public final c f20526c;

    /* renamed from: d, reason: collision with root package name */
    public final c f20527d;

    static {
        Charset.forName("UTF-8");
        f20522e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f20523f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public i(Executor executor, c cVar, c cVar2) {
        this.f20525b = executor;
        this.f20526c = cVar;
        this.f20527d = cVar2;
    }

    public static String b(c cVar, String str) {
        d dVarC = cVar.c();
        if (dVarC == null) {
            return null;
        }
        try {
            return dVarC.f20499b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void c(String str, String str2) {
        e0.p("FirebaseRemoteConfig", "No value of type '" + str2 + "' exists for parameter key '" + str + "'.");
    }

    public final void a(String str, d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f20524a) {
            try {
                Iterator it = this.f20524a.iterator();
                while (it.hasNext()) {
                    this.f20525b.execute(new ch.a((og.h) it.next(), str, dVar, 15));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
