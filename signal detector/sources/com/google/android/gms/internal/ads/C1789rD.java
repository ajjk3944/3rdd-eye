package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789rD extends AbstractC1466lD {

    /* renamed from: D, reason: collision with root package name */
    public List f16485D;

    public C1789rD(LB lb, boolean z6) {
        List arrayList;
        super(lb, z6, true);
        if (lb.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = lb.size();
            C1476lN.v(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < lb.size(); i++) {
            arrayList.add(null);
        }
        this.f16485D = arrayList;
        v();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void r(int i) {
        this.f15369l = null;
        this.f16485D = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void w(int i, Object obj) {
        List list = this.f16485D;
        if (list != null) {
            list.set(i, new C1843sD(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1466lD
    public final void x() {
        List<C1843sD> list = this.f16485D;
        if (list != null) {
            int size = list.size();
            C1476lN.v(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (C1843sD c1843sD : list) {
                arrayList.add(c1843sD != null ? c1843sD.f16692a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
