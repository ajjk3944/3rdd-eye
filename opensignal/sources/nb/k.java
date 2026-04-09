package nb;

import a5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import qb.v;

/* loaded from: classes.dex */
public final class k implements eb.e, n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17489a;

    /* renamed from: d, reason: collision with root package name */
    public final List f17490d;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f17491g;

    /* renamed from: r, reason: collision with root package name */
    public final long[] f17492r;

    public k(int i10, ArrayList arrayList) {
        this.f17489a = i10;
        switch (i10) {
            case 1:
                this.f17490d = Collections.unmodifiableList(new ArrayList(arrayList));
                this.f17491g = new long[arrayList.size() * 2];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    v6.c cVar = (v6.c) arrayList.get(i11);
                    int i12 = i11 * 2;
                    long[] jArr = this.f17491g;
                    jArr[i12] = cVar.f23880b;
                    jArr[i12 + 1] = cVar.f23881c;
                }
                long[] jArr2 = this.f17491g;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.f17492r = jArrCopyOf;
                Arrays.sort(jArrCopyOf);
                break;
            default:
                this.f17490d = Collections.unmodifiableList(new ArrayList(arrayList));
                this.f17491g = new long[arrayList.size() * 2];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    c cVar2 = (c) arrayList.get(i13);
                    int i14 = i13 * 2;
                    long[] jArr3 = this.f17491g;
                    jArr3[i14] = cVar2.f17462b;
                    jArr3[i14 + 1] = cVar2.f17463c;
                }
                long[] jArr4 = this.f17491g;
                long[] jArrCopyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.f17492r = jArrCopyOf2;
                Arrays.sort(jArrCopyOf2);
                break;
        }
    }

    @Override // eb.e, n6.b
    public final int a(long j) {
        switch (this.f17489a) {
            case 0:
                long[] jArr = this.f17492r;
                int iB = v.b(jArr, j, false);
                if (iB < jArr.length) {
                    return iB;
                }
                return -1;
            default:
                long[] jArr2 = this.f17492r;
                int iB2 = d0.b(jArr2, j, false);
                if (iB2 < jArr2.length) {
                    return iB2;
                }
                return -1;
        }
    }

    @Override // eb.e, n6.b
    public final long e(int i10) {
        switch (this.f17489a) {
            case 0:
                qb.b.g(i10 >= 0);
                long[] jArr = this.f17492r;
                qb.b.g(i10 < jArr.length);
                return jArr[i10];
            default:
                a5.a.e(i10 >= 0);
                long[] jArr2 = this.f17492r;
                a5.a.e(i10 < jArr2.length);
                return jArr2[i10];
        }
    }

    @Override // eb.e, n6.b
    public final List f(long j) {
        switch (this.f17489a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    List list = this.f17490d;
                    if (i10 >= list.size()) {
                        Collections.sort(arrayList2, new androidx.media3.exoplayer.trackselection.d(21));
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            eb.a aVarA = ((c) arrayList2.get(i11)).f17461a.a();
                            aVarA.f8044e = (-1) - i11;
                            aVarA.f8045f = 1;
                            arrayList.add(aVarA.a());
                        }
                        return arrayList;
                    }
                    int i12 = i10 * 2;
                    long[] jArr = this.f17491g;
                    if (jArr[i12] <= j && j < jArr[i12 + 1]) {
                        c cVar = (c) list.get(i10);
                        eb.b bVar = cVar.f17461a;
                        if (bVar.f8060e == -3.4028235E38f) {
                            arrayList2.add(cVar);
                        } else {
                            arrayList.add(bVar);
                        }
                    }
                    i10++;
                }
                break;
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    List list2 = this.f17490d;
                    if (i14 >= list2.size()) {
                        Collections.sort(arrayList4, new oh.f(8));
                        while (i13 < arrayList4.size()) {
                            z4.b bVar2 = ((v6.c) arrayList4.get(i13)).f23879a;
                            arrayList3.add(new z4.b(bVar2.f26646a, bVar2.f26647d, bVar2.f26648g, bVar2.f26649r, (-1) - i13, 1, bVar2.B, bVar2.D, bVar2.E, bVar2.J, bVar2.K, bVar2.F, bVar2.G, bVar2.H, bVar2.I, bVar2.L, bVar2.M));
                            i13++;
                            arrayList4 = arrayList4;
                        }
                        return arrayList3;
                    }
                    int i15 = i14 * 2;
                    long[] jArr2 = this.f17491g;
                    if (jArr2[i15] <= j && j < jArr2[i15 + 1]) {
                        v6.c cVar2 = (v6.c) list2.get(i14);
                        z4.b bVar3 = cVar2.f23879a;
                        if (bVar3.f26650x == -3.4028235E38f) {
                            arrayList4.add(cVar2);
                        } else {
                            arrayList3.add(bVar3);
                        }
                    }
                    i14++;
                }
                break;
        }
    }

    @Override // eb.e, n6.b
    public final int h() {
        switch (this.f17489a) {
        }
        return this.f17492r.length;
    }
}
