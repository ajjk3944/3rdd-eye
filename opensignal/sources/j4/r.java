package j4;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f13238a;

    /* renamed from: b, reason: collision with root package name */
    public u f13239b;

    public r(int i10) {
        this.f13238a = new SparseArray(i10);
    }

    public final void a(u uVar, int i10, int i11) {
        int iA = uVar.a(i10);
        SparseArray sparseArray = this.f13238a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(iA);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i10), rVar);
        }
        if (i11 > i10) {
            rVar.a(uVar, i10 + 1, i11);
        } else {
            rVar.f13239b = uVar;
        }
    }
}
