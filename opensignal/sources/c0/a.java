package c0;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3062b;

    public a(int i10) {
        this.f3061a = i10;
        switch (i10) {
            case 1:
                this.f3062b = 0;
                break;
            case 2:
                this.f3062b = 0;
                break;
            case 3:
                this.f3062b = 0;
                break;
            default:
                this.f3062b = 0;
                break;
        }
    }

    @Override // c0.b
    public final void a(int i10, int[] iArr, t2.i iVar, int[] iArr2) {
        switch (this.f3061a) {
            case 0:
                if (iVar != t2.i.Ltr) {
                    d.a(i10, iArr, iArr2, true);
                    break;
                } else {
                    d.a(i10, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (iVar != t2.i.Ltr) {
                    d.d(i10, iArr, iArr2, true);
                    break;
                } else {
                    d.d(i10, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (iVar != t2.i.Ltr) {
                    d.e(i10, iArr, iArr2, true);
                    break;
                } else {
                    d.e(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (iVar != t2.i.Ltr) {
                    d.f(i10, iArr, iArr2, true);
                    break;
                } else {
                    d.f(i10, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // c0.b
    public final float b() {
        switch (this.f3061a) {
        }
        return this.f3062b;
    }

    public final String toString() {
        switch (this.f3061a) {
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
