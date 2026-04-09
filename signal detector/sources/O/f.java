package O;

import h0.C2351a;
import java.util.ArrayList;
import u.C2940i;

/* loaded from: classes.dex */
public final class f implements Q.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3045b;

    public /* synthetic */ f(int i, Object obj) {
        this.f3044a = i;
        this.f3045b = obj;
    }

    @Override // Q.a
    public final void accept(Object obj) {
        switch (this.f3044a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((C2351a) this.f3045b).N(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f3050c) {
                    try {
                        C2940i c2940i = h.f3051d;
                        ArrayList arrayList = (ArrayList) c2940i.get((String) this.f3045b);
                        if (arrayList == null) {
                            return;
                        }
                        c2940i.remove((String) this.f3045b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((Q.a) arrayList.get(i)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
