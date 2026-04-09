package h5;

import a5.d0;
import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements n5.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9908a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9909b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9911d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9912e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9913f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9914g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9915h;

    /* renamed from: i, reason: collision with root package name */
    public final u f9916i;
    public final s j;
    public final Uri k;

    /* renamed from: l, reason: collision with root package name */
    public final h f9917l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9918m;

    public c(long j, long j7, long j10, boolean z10, long j11, long j12, long j13, long j14, h hVar, u uVar, s sVar, Uri uri, List list) {
        this.f9908a = j;
        this.f9909b = j7;
        this.f9910c = j10;
        this.f9911d = z10;
        this.f9912e = j11;
        this.f9913f = j12;
        this.f9914g = j13;
        this.f9915h = j14;
        this.f9917l = hVar;
        this.f9916i = uVar;
        this.k = uri;
        this.j = sVar;
        this.f9918m = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // n5.a
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f9918m.size()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f1551a != i10) {
                long jC = c(i10);
                if (jC != -9223372036854775807L) {
                    j7 += jC;
                }
            } else {
                g gVarB = b(i10);
                List list2 = gVarB.f9934c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i11 = streamKey.f1551a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = streamKey.f1552d;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f9900c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((l) list3.get(streamKey.f1553g));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f1551a != i11) {
                            break;
                        }
                    } while (streamKey.f1552d == i12);
                    j = j7;
                    arrayList2.add(new a(aVar.f9898a, aVar.f9899b, arrayList3, aVar.f9901d, aVar.f9902e, aVar.f9903f));
                    if (streamKey.f1551a != i11) {
                        break;
                    }
                    j7 = j;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new g(gVarB.f9932a, gVarB.f9933b - j, arrayList2, gVarB.f9935d));
                j7 = j;
            }
            i10++;
        }
        long j10 = j7;
        long j11 = this.f9909b;
        return new c(this.f9908a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f9910c, this.f9911d, this.f9912e, this.f9913f, this.f9914g, this.f9915h, this.f9917l, this.f9916i, this.j, this.k, arrayList);
    }

    public final g b(int i10) {
        return (g) this.f9918m.get(i10);
    }

    public final long c(int i10) {
        long j;
        long j7;
        List list = this.f9918m;
        if (i10 == list.size() - 1) {
            j = this.f9909b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j7 = ((g) list.get(i10)).f9933b;
        } else {
            j = ((g) list.get(i10 + 1)).f9933b;
            j7 = ((g) list.get(i10)).f9933b;
        }
        return j - j7;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
