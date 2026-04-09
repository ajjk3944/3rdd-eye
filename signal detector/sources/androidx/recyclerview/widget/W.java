package androidx.recyclerview.widget;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f5408a;

    /* renamed from: b, reason: collision with root package name */
    public int f5409b;

    public final V a(int i) {
        SparseArray sparseArray = this.f5408a;
        V v6 = (V) sparseArray.get(i);
        if (v6 != null) {
            return v6;
        }
        V v7 = new V();
        sparseArray.put(i, v7);
        return v7;
    }
}
