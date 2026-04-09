package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements b, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24094a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24095b;

    public a(int i4) {
        this.f24094a = i4;
        switch (i4) {
            case 1:
                this.f24095b = 0;
                break;
            case 2:
                this.f24095b = 0;
                break;
            case 3:
                this.f24095b = 0;
                break;
            default:
                this.f24095b = 0;
                break;
        }
    }

    @Override // g0.b, g0.d
    public final float a() {
        switch (this.f24094a) {
        }
        return this.f24095b;
    }

    @Override // g0.d
    public final void b(int i4, g2.l0 l0Var, int[] iArr, int[] iArr2) {
        switch (this.f24094a) {
            case 0:
                e.a(i4, iArr, iArr2, false);
                break;
            case 1:
                e.d(i4, iArr, iArr2, false);
                break;
            case 2:
                e.e(i4, iArr, iArr2, false);
                break;
            default:
                e.f(i4, iArr, iArr2, false);
                break;
        }
    }

    @Override // g0.b
    public final void c(g2.l0 l0Var, int i4, int[] iArr, d3.l lVar, int[] iArr2) {
        switch (this.f24094a) {
            case 0:
                if (lVar != d3.l.f21966a) {
                    e.a(i4, iArr, iArr2, true);
                    break;
                } else {
                    e.a(i4, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (lVar != d3.l.f21966a) {
                    e.d(i4, iArr, iArr2, true);
                    break;
                } else {
                    e.d(i4, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (lVar != d3.l.f21966a) {
                    e.e(i4, iArr, iArr2, true);
                    break;
                } else {
                    e.e(i4, iArr, iArr2, false);
                    break;
                }
            default:
                if (lVar != d3.l.f21966a) {
                    e.f(i4, iArr, iArr2, true);
                    break;
                } else {
                    e.f(i4, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f24094a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
