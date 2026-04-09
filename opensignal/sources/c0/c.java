package c0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3065a;

    @Override // c0.b
    public void a(int i10, int[] iArr, t2.i iVar, int[] iArr2) {
        if (iVar == t2.i.Ltr) {
            d.b(iArr, iArr2, false);
        } else {
            d.c(i10, iArr, iArr2, true);
        }
    }

    public final String toString() {
        switch (this.f3065a) {
            case 0:
                return "Arrangement#Start";
            default:
                return "Arrangement#Top";
        }
    }
}
