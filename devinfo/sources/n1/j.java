package n1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.u f29524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29525b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nk.u uVar, int i4) {
        super(1);
        this.f29524a = uVar;
        this.f29525b = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((s) obj).w0(this.f29525b));
        this.f29524a.f29986a = boolValueOf;
        return boolValueOf;
    }
}
