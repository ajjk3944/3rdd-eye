package lf;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f28770a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f28771b;

    /* renamed from: c, reason: collision with root package name */
    public final b f28772c;

    /* renamed from: d, reason: collision with root package name */
    public final b f28773d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, b bVar, b bVar2) {
        this.f28771b = executor;
        this.f28772c = bVar;
        this.f28773d = bVar2;
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", a0.g.n("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(kf.g gVar) {
        synchronized (this.f28770a) {
            this.f28770a.add(gVar);
        }
    }

    public final void b(String str, c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.f28770a) {
            try {
                Iterator it = this.f28770a.iterator();
                while (it.hasNext()) {
                    this.f28771b.execute(new b5.e((kf.g) it.next(), str, cVar, 29));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
