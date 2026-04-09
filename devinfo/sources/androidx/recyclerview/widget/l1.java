package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f1447a;

    /* renamed from: b, reason: collision with root package name */
    public int f1448b;

    /* renamed from: c, reason: collision with root package name */
    public Set f1449c;

    public final k1 a(int i4) {
        SparseArray sparseArray = this.f1447a;
        k1 k1Var = (k1) sparseArray.get(i4);
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1Var2 = new k1();
        sparseArray.put(i4, k1Var2);
        return k1Var2;
    }
}
