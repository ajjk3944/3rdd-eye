package r8;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f21365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21367c;

    public /* synthetic */ q(v vVar, int i10, int i11) {
        this.f21365a = vVar;
        this.f21366b = i10;
        this.f21367c = i11;
    }

    @Override // r8.t
    public final void run() {
        v vVar = this.f21365a;
        h hVar = vVar.f21375a;
        int i10 = this.f21366b;
        int i11 = this.f21367c;
        if (hVar == null) {
            vVar.B.add(new q(vVar, i10, i11));
        } else {
            vVar.f21379d.i(i10, i11 + 0.99f);
        }
    }
}
