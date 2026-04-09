package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26902a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f26903b;

    /* renamed from: d, reason: collision with root package name */
    public int f26905d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f26906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26907f;

    /* renamed from: c, reason: collision with root package name */
    public int f26904c = -1;
    public final u0.d1 g = u0.q.r(null);

    public h0(Object obj, j0 j0Var) {
        this.f26902a = obj;
        this.f26903b = j0Var;
    }

    public final h0 a() {
        if (this.f26907f) {
            f0.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f26905d == 0) {
            this.f26903b.f26919a.add(this);
            h0 h0Var = (h0) this.g.getValue();
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f26906e = h0Var;
        }
        this.f26905d++;
        return this;
    }

    public final void b() {
        if (this.f26907f) {
            return;
        }
        if (this.f26905d <= 0) {
            f0.a.c("Release should only be called once");
        }
        int i4 = this.f26905d - 1;
        this.f26905d = i4;
        if (i4 == 0) {
            this.f26903b.f26919a.remove(this);
            h0 h0Var = this.f26906e;
            if (h0Var != null) {
                h0Var.b();
            }
            this.f26906e = null;
        }
    }
}
