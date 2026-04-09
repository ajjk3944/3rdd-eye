package C5;

import h5.InterfaceC2370d;
import z5.C3030f;

/* loaded from: classes3.dex */
public final class m extends D5.d {

    /* renamed from: a, reason: collision with root package name */
    public long f1187a;

    /* renamed from: b, reason: collision with root package name */
    public C3030f f1188b;

    @Override // D5.d
    public final boolean a(D5.b bVar) {
        k kVar = (k) bVar;
        if (this.f1187a >= 0) {
            return false;
        }
        long j6 = kVar.f1181g;
        if (j6 < kVar.f1182h) {
            kVar.f1182h = j6;
        }
        this.f1187a = j6;
        return true;
    }

    @Override // D5.d
    public final InterfaceC2370d[] b(D5.b bVar) {
        long j6 = this.f1187a;
        this.f1187a = -1L;
        this.f1188b = null;
        return ((k) bVar).V(j6);
    }
}
