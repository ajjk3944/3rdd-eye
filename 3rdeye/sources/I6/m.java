package I6;

/* compiled from: Transitions.kt */
/* loaded from: classes.dex */
public final class m extends K1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K1.n f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r7.g f2561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2562c;

    public m(K1.n nVar, r7.g gVar, l lVar) {
        this.f2560a = nVar;
        this.f2561b = gVar;
        this.f2562c = lVar;
    }

    @Override // K1.i.d
    public final void a(K1.i iVar) {
        this.f2561b.removeOnAttachStateChangeListener(this.f2562c);
        this.f2560a.z(this);
    }
}
