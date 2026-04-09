package x9;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final qb.f f25190a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f25191b;

    public r(qb.f fVar, SparseArray sparseArray) {
        this.f25190a = fVar;
        SparseArray sparseArray2 = new SparseArray(fVar.f20777a.size());
        for (int i10 = 0; i10 < fVar.f20777a.size(); i10++) {
            int iA = fVar.a(i10);
            q qVar = (q) sparseArray.get(iA);
            qVar.getClass();
            sparseArray2.append(iA, qVar);
        }
        this.f25191b = sparseArray2;
    }
}
