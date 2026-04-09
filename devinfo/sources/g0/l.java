package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements d, b {

    /* renamed from: b, reason: collision with root package name */
    public static final l f24150b = new l(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24151a;

    public /* synthetic */ l(int i4) {
        this.f24151a = i4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // g0.d
    public float a() {
        switch (this.f24151a) {
        }
        return 0;
    }

    @Override // g0.d
    public void b(int i4, g2.l0 l0Var, int[] iArr, int[] iArr2) {
        switch (this.f24151a) {
            case 1:
                e.c(i4, iArr, iArr2, false);
                break;
            default:
                e.b(iArr, iArr2, false);
                break;
        }
    }

    @Override // g0.b
    public void c(g2.l0 l0Var, int i4, int[] iArr, d3.l lVar, int[] iArr2) {
        if (lVar == d3.l.f21966a) {
            e.b(iArr, iArr2, false);
        } else {
            e.c(i4, iArr, iArr2, true);
        }
    }

    public i1.n d() {
        return new f();
    }

    public String toString() {
        switch (this.f24151a) {
            case 1:
                return "Arrangement#Bottom";
            case 2:
                return "Arrangement#Start";
            case 3:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
