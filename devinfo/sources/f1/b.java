package f1;

import g1.n;
import me.t1;
import u0.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public k f23606a;

    /* renamed from: b, reason: collision with root package name */
    public g f23607b;

    /* renamed from: c, reason: collision with root package name */
    public String f23608c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23609d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f23610e;

    /* renamed from: f, reason: collision with root package name */
    public f f23611f;
    public final a6.e g = new a6.e(8, this);

    public b(k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.f23606a = kVar;
        this.f23607b = gVar;
        this.f23608c = str;
        this.f23609d = obj;
        this.f23610e = objArr;
    }

    @Override // u0.u1
    public final void a() {
        f fVar = this.f23611f;
        if (fVar != null) {
            ((yb.e) fVar).z();
        }
    }

    @Override // u0.u1
    public final void b() {
        f fVar = this.f23611f;
        if (fVar != null) {
            ((yb.e) fVar).z();
        }
    }

    public final void c() {
        String strK;
        g gVar = this.f23607b;
        if (this.f23611f != null) {
            throw new IllegalArgumentException(("entry(" + this.f23611f + ") is not null").toString());
        }
        if (gVar != null) {
            a6.e eVar = this.g;
            Object objInvoke = eVar.invoke();
            if (objInvoke == null || gVar.a(objInvoke)) {
                this.f23611f = gVar.d(this.f23608c, eVar);
                return;
            }
            if (objInvoke instanceof n) {
                n nVar = (n) objInvoke;
                if (nVar.b() == u0.e.f34769d || nVar.b() == u0.e.g || nVar.b() == u0.e.f34770e) {
                    strK = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strK = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strK = t1.k(objInvoke);
            }
            throw new IllegalArgumentException(strK);
        }
    }

    @Override // u0.u1
    public final void d() {
        c();
    }
}
