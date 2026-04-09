package cc;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements d, b, c {

    /* renamed from: b, reason: collision with root package name */
    public static h f3650b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f3651c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f3652a;

    public /* synthetic */ h(Object obj) {
        this.f3652a = obj;
    }

    public static synchronized h b() {
        try {
            if (f3650b == null) {
                f3650b = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3650b;
    }

    @Override // cc.d
    public void a(ConnectionResult connectionResult) {
        e eVar = (e) this.f3652a;
        if (connectionResult.f4807d == 0) {
            eVar.k(null, eVar.l());
            return;
        }
        c cVar = eVar.f3628p;
        if (cVar != null) {
            cVar.f(connectionResult);
        }
    }

    @Override // cc.b
    public void d(int i10) {
        ((ac.g) this.f3652a).d(i10);
    }

    @Override // cc.b
    public void e() {
        ((ac.g) this.f3652a).e();
    }

    @Override // cc.c
    public void f(ConnectionResult connectionResult) {
        ((ac.h) this.f3652a).f(connectionResult);
    }

    public h(e eVar) {
        Objects.requireNonNull(eVar);
        this.f3652a = eVar;
    }
}
