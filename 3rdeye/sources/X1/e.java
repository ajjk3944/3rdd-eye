package X1;

import Y1.i;
import b2.C1842w;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<Y1.d<?>> f13544a;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a extends m implements l<Y1.d<?>, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f13545g = new a(1);

        @Override // p9.l
        public final CharSequence invoke(Y1.d<?> dVar) {
            Y1.d<?> it = dVar;
            kotlin.jvm.internal.l.f(it, "it");
            return it.getClass().getSimpleName();
        }
    }

    public e(G5.c trackers) {
        kotlin.jvm.internal.l.f(trackers, "trackers");
        Y1.a aVar = new Y1.a((Z1.h) trackers.f1910a);
        Y1.b bVar = new Y1.b((Z1.c) trackers.f1911b);
        i iVar = new i((Z1.h) trackers.f1913d);
        Z1.h hVar = (Z1.h) trackers.f1912c;
        this.f13544a = C2092m.W(aVar, bVar, iVar, new Y1.e(hVar), new Y1.h(hVar), new Y1.g(hVar), new Y1.f(hVar));
    }

    public final boolean a(C1842w c1842w) {
        List<Y1.d<?>> list = this.f13544a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Y1.d dVar = (Y1.d) obj;
            dVar.getClass();
            if (dVar.b(c1842w) && dVar.c(dVar.f13710a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            androidx.work.m.e().a(h.f13557a, "Work " + c1842w.f17138a + " constrained by " + C2097r.u0(arrayList, null, null, null, a.f13545g, 31));
        }
        return arrayList.isEmpty();
    }
}
