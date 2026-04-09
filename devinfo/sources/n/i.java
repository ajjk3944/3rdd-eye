package n;

import e4.d1;
import p.n3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29487a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29488b;

    /* renamed from: c, reason: collision with root package name */
    public int f29489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29490d;

    public i(j jVar) {
        this.f29487a = 0;
        this.f29490d = jVar;
        this.f29488b = false;
        this.f29489c = 0;
    }

    @Override // com.bumptech.glide.e, e4.d1
    public void a() {
        switch (this.f29487a) {
            case 1:
                this.f29488b = true;
                break;
        }
    }

    @Override // com.bumptech.glide.e, e4.d1
    public final void c() {
        switch (this.f29487a) {
            case 0:
                if (!this.f29488b) {
                    this.f29488b = true;
                    d1 d1Var = ((j) this.f29490d).f29494d;
                    if (d1Var != null) {
                        d1Var.c();
                        break;
                    }
                }
                break;
            default:
                ((n3) this.f29490d).f30779a.setVisibility(0);
                break;
        }
    }

    @Override // e4.d1
    public final void d() {
        switch (this.f29487a) {
            case 0:
                int i4 = this.f29489c + 1;
                this.f29489c = i4;
                j jVar = (j) this.f29490d;
                if (i4 == jVar.f29491a.size()) {
                    d1 d1Var = jVar.f29494d;
                    if (d1Var != null) {
                        d1Var.d();
                    }
                    this.f29489c = 0;
                    this.f29488b = false;
                    jVar.f29495e = false;
                    break;
                }
                break;
            default:
                if (!this.f29488b) {
                    ((n3) this.f29490d).f30779a.setVisibility(this.f29489c);
                    break;
                }
                break;
        }
    }

    public i(n3 n3Var, int i4) {
        this.f29487a = 1;
        this.f29490d = n3Var;
        this.f29489c = i4;
        this.f29488b = false;
    }
}
