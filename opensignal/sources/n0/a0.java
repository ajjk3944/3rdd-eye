package n0;

/* loaded from: classes.dex */
public final class a0 extends androidx.compose.runtime.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17128b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ar.a aVar) {
        super(aVar);
        t0 t0Var = t0.f17321y;
        this.f17129c = t0Var;
    }

    @Override // androidx.compose.runtime.d
    public final i1 a(Object obj) {
        switch (this.f17128b) {
            case 0:
                return new i1(this, obj, obj == null, null, true);
            default:
                return new i1(this, obj, obj == null, (c2) this.f17129c, true);
        }
    }

    @Override // androidx.compose.runtime.d
    public j2 b() {
        switch (this.f17128b) {
            case 0:
                return (b0) this.f17129c;
            default:
                return super.b();
        }
    }

    public a0() {
        super(new c0.a0(24));
        this.f17129c = new b0();
    }
}
