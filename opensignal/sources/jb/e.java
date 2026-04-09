package jb;

import a5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qb.v;

/* loaded from: classes.dex */
public final class e implements eb.e, n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13583a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13584d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13585g;

    public /* synthetic */ e(ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f13583a = i10;
        this.f13584d = arrayList;
        this.f13585g = arrayList2;
    }

    @Override // eb.e, n6.b
    public final int a(long j) {
        int i10;
        int i11;
        int i12 = this.f13583a;
        ArrayList arrayList = this.f13585g;
        switch (i12) {
            case 0:
                Long lValueOf = Long.valueOf(j);
                int i13 = v.f20828a;
                int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
                if (iBinarySearch < 0) {
                    i10 = ~iBinarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        iBinarySearch++;
                        if (iBinarySearch < size) {
                        }
                        i10 = iBinarySearch;
                    } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
                    i10 = iBinarySearch;
                }
                if (i10 < arrayList.size()) {
                    return i10;
                }
                return -1;
            default:
                Long lValueOf2 = Long.valueOf(j);
                int i14 = d0.f105a;
                int iBinarySearch2 = Collections.binarySearch(arrayList, lValueOf2);
                if (iBinarySearch2 < 0) {
                    i11 = ~iBinarySearch2;
                } else {
                    int size2 = arrayList.size();
                    do {
                        iBinarySearch2++;
                        if (iBinarySearch2 < size2) {
                        }
                        i11 = iBinarySearch2;
                    } while (((Comparable) arrayList.get(iBinarySearch2)).compareTo(lValueOf2) == 0);
                    i11 = iBinarySearch2;
                }
                if (i11 < arrayList.size()) {
                    return i11;
                }
                return -1;
        }
    }

    @Override // eb.e, n6.b
    public final long e(int i10) {
        switch (this.f13583a) {
            case 0:
                qb.b.g(i10 >= 0);
                ArrayList arrayList = this.f13585g;
                qb.b.g(i10 < arrayList.size());
                return ((Long) arrayList.get(i10)).longValue();
            default:
                a5.a.e(i10 >= 0);
                ArrayList arrayList2 = this.f13585g;
                a5.a.e(i10 < arrayList2.size());
                return ((Long) arrayList2.get(i10)).longValue();
        }
    }

    @Override // eb.e, n6.b
    public final List f(long j) {
        switch (this.f13583a) {
            case 0:
                int iC = v.c(this.f13585g, Long.valueOf(j), false);
                return iC == -1 ? Collections.EMPTY_LIST : (List) this.f13584d.get(iC);
            default:
                int iC2 = d0.c(this.f13585g, Long.valueOf(j), false);
                return iC2 == -1 ? Collections.EMPTY_LIST : (List) this.f13584d.get(iC2);
        }
    }

    @Override // eb.e, n6.b
    public final int h() {
        switch (this.f13583a) {
        }
        return this.f13585g.size();
    }
}
