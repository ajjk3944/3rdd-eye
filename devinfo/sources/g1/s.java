package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24274b;

    public /* synthetic */ s(int i4, Object obj) {
        this.f24273a = i4;
        this.f24274b = obj;
    }

    public final void a() {
        switch (this.f24273a) {
            case 0:
                t tVar = (t) this.f24274b;
                tVar.f24283k--;
                break;
            default:
                u0.p pVar = (u0.p) this.f24274b;
                pVar.A--;
                break;
        }
    }

    public final void b() {
        switch (this.f24273a) {
            case 0:
                ((t) this.f24274b).f24283k++;
                break;
            default:
                ((u0.p) this.f24274b).A++;
                break;
        }
    }
}
