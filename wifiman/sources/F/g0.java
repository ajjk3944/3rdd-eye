package F;

import Q0.AbstractC3434k;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private Y0.t f5316a;

    /* renamed from: b, reason: collision with root package name */
    private Y0.d f5317b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3434k.b f5318c;

    /* renamed from: d, reason: collision with root package name */
    private L0.U f5319d;

    /* renamed from: e, reason: collision with root package name */
    private Object f5320e;

    /* renamed from: f, reason: collision with root package name */
    private long f5321f = a();

    public g0(Y0.t tVar, Y0.d dVar, AbstractC3434k.b bVar, L0.U u10, Object obj) {
        this.f5316a = tVar;
        this.f5317b = dVar;
        this.f5318c = bVar;
        this.f5319d = u10;
        this.f5320e = obj;
    }

    private final long a() {
        return X.b(this.f5319d, this.f5317b, this.f5318c, null, 0, 24, null);
    }

    public final long b() {
        return this.f5321f;
    }

    public final void c(Y0.t tVar, Y0.d dVar, AbstractC3434k.b bVar, L0.U u10, Object obj) {
        if (tVar == this.f5316a && AbstractC6492s.d(dVar, this.f5317b) && AbstractC6492s.d(bVar, this.f5318c) && AbstractC6492s.d(u10, this.f5319d) && AbstractC6492s.d(obj, this.f5320e)) {
            return;
        }
        this.f5316a = tVar;
        this.f5317b = dVar;
        this.f5318c = bVar;
        this.f5319d = u10;
        this.f5320e = obj;
        this.f5321f = a();
    }
}
