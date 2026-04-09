package b4;

import java.util.ArrayList;
import nm.d0;
import pf.u;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1687b;

    public /* synthetic */ h(int i4, Object obj) {
        this.f1686a = i4;
        this.f1687b = obj;
    }

    @Override // d4.a
    public final void accept(Object obj) {
        switch (this.f1686a) {
            case 0:
                i iVar = (i) obj;
                if (iVar == null) {
                    iVar = new i(-3);
                }
                ((yb.i) this.f1687b).N(iVar);
                return;
            case 1:
                i iVar2 = (i) obj;
                synchronized (j.f1692c) {
                    try {
                        n0 n0Var = j.f1693d;
                        ArrayList arrayList = (ArrayList) n0Var.get((String) this.f1687b);
                        if (arrayList == null) {
                            return;
                        }
                        n0Var.remove((String) this.f1687b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((d4.a) arrayList.get(i4)).accept(iVar2);
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                d0 d0Var = new d0(13, arrayList2);
                ((ri.d) this.f1687b).a((t7.c) obj, d0Var);
                return;
            case 3:
                ((lf.e) this.f1687b).c((t7.c) obj);
                return;
            default:
                ((u) this.f1687b).g((t7.c) obj);
                return;
        }
    }

    public /* synthetic */ h(cl.u uVar, lf.e eVar) {
        this.f1686a = 3;
        this.f1687b = eVar;
    }
}
