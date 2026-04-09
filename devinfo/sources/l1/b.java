package l1;

import android.view.DragEvent;
import android.view.View;
import c2.l0;
import i2.k;
import i2.y1;
import nk.q;
import x.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final e f28538a;

    /* renamed from: b, reason: collision with root package name */
    public final f f28539b;

    /* renamed from: c, reason: collision with root package name */
    public final a f28540c;

    public b() {
        e eVar = new e();
        eVar.f28544q = 0L;
        this.f28538a = eVar;
        this.f28539b = new f(0);
        this.f28540c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        jf.c cVar = new jf.c(27, dragEvent);
        int action = dragEvent.getAction();
        y1 y1Var = y1.f25816a;
        f fVar = this.f28539b;
        e eVar = this.f28538a;
        switch (action) {
            case 1:
                q qVar = new q();
                l0 l0Var = new l0(cVar, eVar, qVar);
                if (l0Var.invoke(eVar) == y1Var) {
                    k.w(eVar, l0Var);
                }
                boolean z3 = qVar.f29982a;
                fVar.getClass();
                x.a aVar = new x.a(fVar);
                while (aVar.hasNext()) {
                    ((e) aVar.next()).t0(cVar);
                }
                break;
            case 2:
                eVar.s0(cVar);
                break;
            case 4:
                l0 l0Var2 = new l0(15, cVar);
                if (l0Var2.invoke(eVar) == y1Var) {
                    k.w(eVar, l0Var2);
                }
                fVar.clear();
                break;
            case 5:
                eVar.q0(cVar);
                break;
            case 6:
                eVar.r0(cVar);
                break;
        }
        return false;
    }
}
