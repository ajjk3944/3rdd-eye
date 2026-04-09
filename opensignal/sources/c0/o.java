package c0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3095a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1.v f3096d;

    public /* synthetic */ o(v1.v vVar, int i10) {
        this.f3095a = i10;
        this.f3096d = vVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        v1.u uVar = (v1.u) obj;
        switch (this.f3095a) {
            case 0:
                v1.u.h(uVar, this.f3096d, 0, 0);
                break;
            case 1:
                v1.u.h(uVar, this.f3096d, 0, 0);
                break;
            case 2:
                v1.u.e(uVar, this.f3096d, 0, 0);
                break;
            default:
                v1.u.e(uVar, this.f3096d, 0, 0);
                break;
        }
        return lq.b0.f15562a;
    }
}
