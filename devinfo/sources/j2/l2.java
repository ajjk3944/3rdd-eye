package j2;

import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l2 implements u0.s, androidx.lifecycle.y {

    /* renamed from: a, reason: collision with root package name */
    public final r f27221a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.w f27222b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27223c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.t f27224d;

    /* renamed from: e, reason: collision with root package name */
    public mk.e f27225e = y0.f27359a;

    public l2(r rVar, u0.w wVar) {
        this.f27221a = rVar;
        this.f27222b = wVar;
    }

    public final void a() {
        if (!this.f27223c) {
            this.f27223c = true;
            this.f27221a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.t tVar = this.f27224d;
            if (tVar != null) {
                tVar.b(this);
            }
        }
        this.f27222b.m();
    }

    public final void b(mk.e eVar) {
        this.f27221a.setOnViewTreeOwnersAvailable(new c2.w(7, this, eVar));
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        if (rVar == androidx.lifecycle.r.ON_DESTROY) {
            a();
        } else {
            if (rVar != androidx.lifecycle.r.ON_CREATE || this.f27223c) {
                return;
            }
            b(this.f27225e);
        }
    }
}
