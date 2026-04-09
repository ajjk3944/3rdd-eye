package q3;

import java.util.ArrayList;
import u.i0;

/* loaded from: classes.dex */
public final class f implements t3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20697b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f20696a = i10;
        this.f20697b = obj;
    }

    @Override // t3.a
    public final void accept(Object obj) {
        switch (this.f20696a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((a) this.f20697b).M0(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f20702c) {
                    try {
                        i0 i0Var = h.f20703d;
                        ArrayList arrayList = (ArrayList) i0Var.get((String) this.f20697b);
                        if (arrayList == null) {
                            return;
                        }
                        i0Var.remove((String) this.f20697b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((t3.a) arrayList.get(i10)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
