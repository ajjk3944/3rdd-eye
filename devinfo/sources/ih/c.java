package ih;

import a0.g;
import androidx.lifecycle.l0;
import hg.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final wi.e f25997b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.e f25998c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f25999d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f26000e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f26001f;
    public final l0 g;

    public c() {
        wi.e eVar = new wi.e();
        this.f25997b = eVar;
        this.f25998c = eVar;
        l0 l0Var = new l0();
        this.f25999d = l0Var;
        this.f26000e = l0Var;
        l0 l0Var2 = new l0();
        this.f26001f = l0Var2;
        this.g = l0Var2;
    }

    public static final void g(c cVar, Throwable th2) {
        wi.e eVar = cVar.f25997b;
        String message = th2.getMessage();
        if (message == null) {
            message = g.o("error@", th2);
        }
        eVar.h(message);
    }
}
