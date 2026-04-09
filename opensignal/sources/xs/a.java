package xs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mq.p;
import mq.w;
import ur.q0;

/* loaded from: classes.dex */
public final class a implements rt.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25520d = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25521a;

    public /* synthetic */ a(int i10) {
        this.f25521a = i10;
    }

    @Override // rt.a
    public final Iterable d(Object obj) {
        switch (this.f25521a) {
            case 0:
                int i10 = d.f25523a;
                Collection collectionP = ((q0) obj).p();
                ArrayList arrayList = new ArrayList(p.a0(collectionP, 10));
                Iterator it = ((ArrayList) collectionP).iterator();
                while (it.hasNext()) {
                    arrayList.add(((q0) it.next()).u1());
                }
                return arrayList;
            default:
                rr.d dVar = (rr.d) obj;
                Collection collectionP2 = dVar != null ? dVar.p() : null;
                return collectionP2 == null ? w.f16945a : collectionP2;
        }
    }
}
