package f0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f20016a;

    /* renamed from: b, reason: collision with root package name */
    public v f20017b;

    public s(int i) {
        this.f20016a = new SparseArray(i);
    }

    public final void a(v vVar, int i, int i3) {
        int iA = vVar.a(i);
        SparseArray sparseArray = this.f20016a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(iA);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i), sVar);
        }
        if (i3 > i) {
            sVar.a(vVar, i + 1, i3);
        } else {
            sVar.f20017b = vVar;
        }
    }
}
