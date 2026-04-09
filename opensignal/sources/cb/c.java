package cb;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements xa.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3535b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3536c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3537d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3538e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3539f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3540g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3541h;

    /* renamed from: i, reason: collision with root package name */
    public final u f3542i;
    public final s j;
    public final Uri k;

    /* renamed from: l, reason: collision with root package name */
    public final h f3543l;

    /* renamed from: m, reason: collision with root package name */
    public final List f3544m;

    public c(long j, long j7, long j10, boolean z10, long j11, long j12, long j13, long j14, h hVar, u uVar, s sVar, Uri uri, List list) {
        this.f3534a = j;
        this.f3535b = j7;
        this.f3536c = j10;
        this.f3537d = z10;
        this.f3538e = j11;
        this.f3539f = j12;
        this.f3540g = j13;
        this.f3541h = j14;
        this.f3543l = hVar;
        this.f3542i = uVar;
        this.k = uri;
        this.j = sVar;
        this.f3544m = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // xa.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f3544m.size()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f4359a != i10) {
                long jD = d(i10);
                if (jD != -9223372036854775807L) {
                    j7 += jD;
                }
            } else {
                g gVarC = c(i10);
                List list2 = gVarC.f3561c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i11 = streamKey.f4359a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = streamKey.f4360d;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f3526c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((Representation) list3.get(streamKey.f4361g));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f4359a != i11) {
                            break;
                        }
                    } while (streamKey.f4360d == i12);
                    j = j7;
                    arrayList2.add(new a(aVar.f3524a, aVar.f3525b, arrayList3, aVar.f3527d, aVar.f3528e, aVar.f3529f));
                    if (streamKey.f4359a != i11) {
                        break;
                    }
                    j7 = j;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new g(gVarC.f3559a, gVarC.f3560b - j, arrayList2, gVarC.f3562d));
                j7 = j;
            }
            i10++;
        }
        long j10 = j7;
        long j11 = this.f3535b;
        return new c(this.f3534a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f3536c, this.f3537d, this.f3538e, this.f3539f, this.f3540g, this.f3541h, this.f3543l, this.f3542i, this.j, this.k, arrayList);
    }

    public final g c(int i10) {
        return (g) this.f3544m.get(i10);
    }

    public final long d(int i10) {
        long j;
        long j7;
        List list = this.f3544m;
        if (i10 == list.size() - 1) {
            j = this.f3535b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j7 = ((g) list.get(i10)).f3560b;
        } else {
            j = ((g) list.get(i10 + 1)).f3560b;
            j7 = ((g) list.get(i10)).f3560b;
        }
        return j - j7;
    }

    public final long e(int i10) {
        return com.google.android.exoplayer2.h.c(d(i10));
    }
}
