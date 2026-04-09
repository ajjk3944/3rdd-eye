package y7;

import android.util.SparseArray;

/* compiled from: MaxCardHeightCalculator.java */
/* loaded from: classes.dex */
public final class l extends AbstractC5817b {
    @Override // y7.x.a
    public final boolean c(float f10, int i) {
        SparseArray<q> sparseArray = this.f48203d;
        if (sparseArray.size() != 0) {
            if (i != 0 && (i != 1 || f10 > 0.0f)) {
                return false;
            }
            sparseArray.size();
            q qVarValueAt = sparseArray.valueAt(sparseArray.size() - 1);
            if (qVarValueAt.a() == qVarValueAt.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // y7.AbstractC5817b
    public final int e(q qVar, int i, float f10) {
        if (i > 0) {
            return qVar.b();
        }
        if (f10 < 0.01f) {
            return qVar.a();
        }
        return Math.round(((qVar.b() - r3) * f10) + qVar.a());
    }
}
