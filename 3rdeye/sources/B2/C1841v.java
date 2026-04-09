package b2;

import androidx.work.t;
import b2.C1842w;
import c9.C2092m;
import com.applovin.impl.v4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1841v implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17135a;

    public /* synthetic */ C1841v(int i) {
        this.f17135a = i;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        long j4;
        int i;
        long jA;
        t.a aVar = null;
        switch (this.f17135a) {
            case 0:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List<C1842w.c> list2 = list;
                ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
                for (C1842w.c cVar : list2) {
                    ArrayList arrayList2 = cVar.f17177q;
                    androidx.work.e progress = !arrayList2.isEmpty() ? (androidx.work.e) arrayList2.get(0) : androidx.work.e.f16893c;
                    UUID uuidFromString = UUID.fromString(cVar.f17162a);
                    kotlin.jvm.internal.l.e(uuidFromString, "fromString(id)");
                    HashSet hashSet = new HashSet(cVar.f17176p);
                    kotlin.jvm.internal.l.e(progress, "progress");
                    long j10 = cVar.f17166e;
                    t.a aVar2 = j10 != 0 ? new t.a(j10, cVar.f17167f) : aVar;
                    t.b bVar = t.b.ENQUEUED;
                    int i10 = cVar.f17169h;
                    long j11 = cVar.f17165d;
                    t.b bVar2 = cVar.f17163b;
                    if (bVar2 == bVar) {
                        String str = C1842w.f17136x;
                        j4 = j11;
                        jA = C1842w.a.a(bVar2 == bVar && i10 > 0, i10, cVar.i, cVar.f17170j, cVar.f17171k, cVar.f17172l, j10 != 0, j4, cVar.f17167f, j10, cVar.f17174n);
                        i = i10;
                    } else {
                        j4 = j11;
                        i = i10;
                        jA = Long.MAX_VALUE;
                    }
                    long j12 = jA;
                    arrayList.add(new androidx.work.t(uuidFromString, cVar.f17163b, hashSet, cVar.f17164c, progress, i, cVar.f17173m, cVar.f17168g, j4, aVar2, j12, cVar.f17175o));
                    aVar = null;
                }
                return arrayList;
            case 1:
                return com.applovin.impl.sdk.ad.b.s((v4) obj);
            case 2:
                return com.applovin.impl.sdk.ad.b.h((v4) obj);
            case 3:
                return com.applovin.impl.sdk.ad.b.n((v4) obj);
            case 4:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
