package m;

import R.T;
import d4.C2272f;
import o.i1;

/* loaded from: classes.dex */
public final class i extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21920a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21921b;

    /* renamed from: c, reason: collision with root package name */
    public int f21922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21923d;

    public i(C2272f c2272f) {
        this.f21920a = 0;
        this.f21923d = c2272f;
        this.f21921b = false;
        this.f21922c = 0;
    }

    @Override // com.bumptech.glide.d, R.T
    public void a() {
        switch (this.f21920a) {
            case 1:
                this.f21921b = true;
                break;
        }
    }

    @Override // com.bumptech.glide.d, R.T
    public final void b() {
        switch (this.f21920a) {
            case 0:
                if (!this.f21921b) {
                    this.f21921b = true;
                    T t6 = (T) ((C2272f) this.f21923d).f19804e;
                    if (t6 != null) {
                        t6.b();
                        break;
                    }
                }
                break;
            default:
                ((i1) this.f21923d).f22522a.setVisibility(0);
                break;
        }
    }

    @Override // R.T
    public final void c() {
        switch (this.f21920a) {
            case 0:
                int i = this.f21922c + 1;
                this.f21922c = i;
                C2272f c2272f = (C2272f) this.f21923d;
                if (i == c2272f.f19800a.size()) {
                    T t6 = (T) c2272f.f19804e;
                    if (t6 != null) {
                        t6.c();
                    }
                    this.f21922c = 0;
                    this.f21921b = false;
                    c2272f.f19802c = false;
                    break;
                }
                break;
            default:
                if (!this.f21921b) {
                    ((i1) this.f21923d).f22522a.setVisibility(this.f21922c);
                    break;
                }
                break;
        }
    }

    public i(i1 i1Var, int i) {
        this.f21920a = 1;
        this.f21923d = i1Var;
        this.f21922c = i;
        this.f21921b = false;
    }
}
