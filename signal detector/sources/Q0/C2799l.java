package q0;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2799l extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f22992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2799l(z zVar, int i) {
        super(1);
        this.f22991b = i;
        this.f22992c = zVar;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        switch (this.f22991b) {
            case 0:
                q5.i.e((v) obj, "destination");
                return Boolean.valueOf(!this.f22992c.f23065l.containsKey(Integer.valueOf(r2.f23043h)));
            default:
                q5.i.e((v) obj, "destination");
                return Boolean.valueOf(!this.f22992c.f23065l.containsKey(Integer.valueOf(r2.f23043h)));
        }
    }
}
