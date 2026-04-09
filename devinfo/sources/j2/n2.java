package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements l1, nk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0.t f27240a;

    public n2(u0.t tVar) {
        this.f27240a = tVar;
    }

    @Override // nk.g
    public final yj.c a() {
        return new nk.i(1, this.f27240a, u0.t.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l1) && (obj instanceof nk.g)) {
            return a().equals(((nk.g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
