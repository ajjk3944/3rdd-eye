package I0;

import C0.r;
import Y0.p;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final J0.n f8442a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8443b;

    /* renamed from: c, reason: collision with root package name */
    private final p f8444c;

    /* renamed from: d, reason: collision with root package name */
    private final r f8445d;

    public m(J0.n nVar, int i10, p pVar, r rVar) {
        this.f8442a = nVar;
        this.f8443b = i10;
        this.f8444c = pVar;
        this.f8445d = rVar;
    }

    public final r a() {
        return this.f8445d;
    }

    public final int b() {
        return this.f8443b;
    }

    public final J0.n c() {
        return this.f8442a;
    }

    public final p d() {
        return this.f8444c;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f8442a + ", depth=" + this.f8443b + ", viewportBoundsInWindow=" + this.f8444c + ", coordinates=" + this.f8445d + ')';
    }
}
