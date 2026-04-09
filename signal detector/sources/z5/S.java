package z5;

import c5.C0412i;

/* loaded from: classes3.dex */
public final class S extends X {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24504e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24505f;

    public /* synthetic */ S(int i, Object obj) {
        this.f24504e = i;
        this.f24505f = obj;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        switch (this.f24504e) {
            case 0:
                o((Throwable) obj);
                break;
            case 1:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return C0412i.f5929a;
    }

    @Override // z5.X
    public final void o(Throwable th) {
        switch (this.f24504e) {
            case 0:
                ((p5.l) this.f24505f).f(th);
                break;
            case 1:
                Y y3 = (Y) this.f24505f;
                Object objY = n().y();
                if (!(objY instanceof C3038n)) {
                    y3.e(AbstractC3046w.p(objY));
                    break;
                } else {
                    y3.e(R2.a.d(((C3038n) objY).f24546a));
                    break;
                }
            default:
                ((C3030f) this.f24505f).e(C0412i.f5929a);
                break;
        }
    }
}
