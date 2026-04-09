package y7;

/* compiled from: DynamicCardHeightCalculator.java */
/* loaded from: classes.dex */
public final class j extends AbstractC5817b {
    @Override // y7.AbstractC5817b, y7.x.a
    public final int b(int i, int i10) {
        d();
        return super.b(i, i10);
    }

    @Override // y7.x.a
    public final boolean c(float f10, int i) {
        return true;
    }

    @Override // y7.AbstractC5817b
    public final int e(q qVar, int i, float f10) {
        if (f10 < 0.01f) {
            return qVar.c(i);
        }
        return Math.round(((qVar.c(i + 1) - r0) * f10) + qVar.c(i));
    }
}
