package n;

import p.r2;
import u3.m0;

/* loaded from: classes.dex */
public final class i extends kc.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17117e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17118f;

    /* renamed from: g, reason: collision with root package name */
    public int f17119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17120h;

    public i(j jVar) {
        this.f17117e = 0;
        this.f17120h = jVar;
        this.f17118f = false;
        this.f17119g = 0;
    }

    @Override // kc.f, u3.m0
    public void a() {
        switch (this.f17117e) {
            case 1:
                this.f17118f = true;
                break;
        }
    }

    @Override // kc.f, u3.m0
    public final void b() {
        switch (this.f17117e) {
            case 0:
                if (!this.f17118f) {
                    this.f17118f = true;
                    m0 m0Var = ((j) this.f17120h).f17124d;
                    if (m0Var != null) {
                        m0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((r2) this.f17120h).f20152a.setVisibility(0);
                break;
        }
    }

    @Override // u3.m0
    public final void c() {
        switch (this.f17117e) {
            case 0:
                int i10 = this.f17119g + 1;
                this.f17119g = i10;
                j jVar = (j) this.f17120h;
                if (i10 == jVar.f17121a.size()) {
                    m0 m0Var = jVar.f17124d;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f17119g = 0;
                    this.f17118f = false;
                    jVar.f17125e = false;
                    break;
                }
                break;
            default:
                if (!this.f17118f) {
                    ((r2) this.f17120h).f20152a.setVisibility(this.f17119g);
                    break;
                }
                break;
        }
    }

    public i(r2 r2Var, int i10) {
        this.f17117e = 1;
        this.f17120h = r2Var;
        this.f17119g = i10;
        this.f17118f = false;
    }
}
