package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class w12 implements b32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<List<av>> f34771b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Long> f34772c;

    public w12(ArrayList arrayList, ArrayList arrayList2) {
        this.f34771b = arrayList;
        this.f34772c = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < this.f34772c.size()) {
            return this.f34772c.get(i).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        int iA = s82.a((List) this.f34772c, Long.valueOf(j4), false);
        return iA == -1 ? Collections.EMPTY_LIST : this.f34771b.get(iA);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return this.f34772c.size();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        int i;
        List<Long> list = this.f34772c;
        Long lValueOf = Long.valueOf(j4);
        int i10 = s82.f32899a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < this.f34772c.size()) {
            return i;
        }
        return -1;
    }
}
