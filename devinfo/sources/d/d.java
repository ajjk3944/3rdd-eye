package d;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21585a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21587c;

    public /* synthetic */ d(c0 c0Var, j jVar) {
        this.f21586b = c0Var;
        this.f21587c = jVar;
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        switch (this.f21585a) {
            case 0:
                j.f((c0) this.f21586b, (j) this.f21587c, a0Var, rVar);
                break;
            default:
                yb.e eVar = (yb.e) this.f21586b;
                Runnable runnable = (Runnable) eVar.f37509b;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) eVar.f37510c;
                e4.n nVar = (e4.n) this.f21587c;
                androidx.lifecycle.r.Companion.getClass();
                if (rVar != androidx.lifecycle.r.ON_RESUME) {
                    if (rVar != androidx.lifecycle.r.ON_DESTROY) {
                        if (rVar == androidx.lifecycle.r.ON_PAUSE) {
                            copyOnWriteArrayList.remove(nVar);
                            runnable.run();
                            break;
                        }
                    } else {
                        eVar.s(nVar);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(nVar);
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(yb.e eVar, e4.n nVar) {
        this.f21586b = eVar;
        this.f21587c = nVar;
    }
}
