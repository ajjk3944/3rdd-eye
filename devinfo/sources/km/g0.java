package km;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28416d;

    /* renamed from: e, reason: collision with root package name */
    public final a f28417e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28418f;

    public g0(boolean z3, int i4, String str) {
        this.f28415c = i4;
        switch (i4) {
            case 1:
                a aVar = a.f28382b;
                Objects.requireNonNull(str, "name == null");
                this.f28416d = str;
                this.f28417e = aVar;
                this.f28418f = z3;
                break;
            case 2:
                a aVar2 = a.f28382b;
                Objects.requireNonNull(str, "name == null");
                this.f28416d = str;
                this.f28417e = aVar2;
                this.f28418f = z3;
                break;
            default:
                a aVar3 = a.f28382b;
                Objects.requireNonNull(str, "name == null");
                this.f28416d = str;
                this.f28417e = aVar3;
                this.f28418f = z3;
                break;
        }
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        switch (this.f28415c) {
            case 0:
                if (obj != null) {
                    this.f28417e.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        n nVar = s0Var.j;
                        String str = this.f28416d;
                        if (!this.f28418f) {
                            nVar.g(str, string);
                            break;
                        } else {
                            nVar.h(str, string);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f28417e.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        s0Var.a(this.f28416d, string2, this.f28418f);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f28417e.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        s0Var.c(this.f28416d, string3, this.f28418f);
                        break;
                    }
                }
                break;
        }
    }
}
