package h7;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f10052a;

    /* renamed from: b, reason: collision with root package name */
    public int f10053b;

    /* renamed from: c, reason: collision with root package name */
    public Set f10054c;

    public final d1 a(int i10) {
        SparseArray sparseArray = this.f10052a;
        d1 d1Var = (d1) sparseArray.get(i10);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1();
        sparseArray.put(i10, d1Var2);
        return d1Var2;
    }
}
