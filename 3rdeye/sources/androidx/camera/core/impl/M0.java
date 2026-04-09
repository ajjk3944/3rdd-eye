package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: SurfaceCombination.java */
/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14921a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    iArr[i10] = i11;
                    b(arrayList, i, iArr, i10 + 1);
                    break;
                } else if (i11 == iArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
        }
    }

    public final void a(C1703n c1703n) {
        this.f14921a.add(c1703n);
    }

    public final List<N0> c(List<N0> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f14921a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = false;
        b(arrayList2, size2, new int[size2], 0);
        N0[] n0Arr = new N0[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z11 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    N0 n02 = (N0) arrayList.get(i);
                    N0 n03 = list.get(iArr[i]);
                    n02.getClass();
                    z11 &= n03.b().getId() <= n02.b().getId() && n03.c() == n02.c();
                    if (!z11) {
                        break;
                    }
                    n0Arr[iArr[i]] = (N0) arrayList.get(i);
                }
            }
            if (z11) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return Arrays.asList(n0Arr);
        }
        return null;
    }
}
