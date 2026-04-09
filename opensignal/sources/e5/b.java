package e5;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.p f7805a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f7806b;

    public b(androidx.media3.common.p pVar, SparseArray sparseArray) {
        this.f7805a = pVar;
        SparseArray sparseArray2 = new SparseArray(pVar.f1732a.size());
        for (int i10 = 0; i10 < pVar.f1732a.size(); i10++) {
            int iA = pVar.a(i10);
            a aVar = (a) sparseArray.get(iA);
            aVar.getClass();
            sparseArray2.append(iA, aVar);
        }
        this.f7806b = sparseArray2;
    }

    public final boolean a(int i10) {
        return this.f7805a.f1732a.get(i10);
    }

    public final a b(int i10) {
        a aVar = (a) this.f7806b.get(i10);
        aVar.getClass();
        return aVar;
    }
}
