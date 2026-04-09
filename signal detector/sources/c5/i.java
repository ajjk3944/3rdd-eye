package C5;

import z5.C3030f;
import z5.E;

/* loaded from: classes3.dex */
public final class i implements E {

    /* renamed from: a, reason: collision with root package name */
    public final k f1168a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1169b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1170c;

    /* renamed from: d, reason: collision with root package name */
    public final C3030f f1171d;

    public i(k kVar, long j6, Object obj, C3030f c3030f) {
        this.f1168a = kVar;
        this.f1169b = j6;
        this.f1170c = obj;
        this.f1171d = c3030f;
    }

    @Override // z5.E
    public final void g() {
        k kVar = this.f1168a;
        synchronized (kVar) {
            if (this.f1169b < kVar.O()) {
                return;
            }
            Object[] objArr = kVar.f1180f;
            q5.i.b(objArr);
            long j6 = this.f1169b;
            if (objArr[((int) j6) & (objArr.length - 1)] != this) {
                return;
            }
            l.a(objArr, j6, l.f1184a);
            kVar.J();
        }
    }
}
