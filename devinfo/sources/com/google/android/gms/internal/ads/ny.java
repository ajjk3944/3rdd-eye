package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ny implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14477a = new ArrayList();

    public final boolean a(qz qzVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f14477a;
        int size = arrayList2.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            my myVar = (my) obj;
            if (myVar.f14066c == qzVar) {
                arrayList.add(myVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((my) obj2).f14067d.q();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14477a.iterator();
    }
}
