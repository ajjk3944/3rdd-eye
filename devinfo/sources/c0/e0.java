package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f2399b = new e0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2400a;

    public /* synthetic */ e0(int i4) {
        this.f2400a = i4;
    }

    @Override // c0.u0
    public i2.i a(e0.i iVar) {
        return new d0(iVar);
    }

    public boolean equals(Object obj) {
        switch (this.f2400a) {
            case 0:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }

    @Override // c0.u0
    public int hashCode() {
        switch (this.f2400a) {
            case 0:
                return -1;
            default:
                return super.hashCode();
        }
    }
}
