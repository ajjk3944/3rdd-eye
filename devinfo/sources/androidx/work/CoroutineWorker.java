package androidx.work;

import android.content.Context;
import ck.h;
import me.t1;
import nk.k;
import t6.f;
import t6.g;
import t6.u;
import vd.b;
import xk.a1;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends u {

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters f1597e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.e(context, "appContext");
        k.e(workerParameters, "params");
        this.f1597e = workerParameters;
        this.f1598f = f.f34342c;
    }

    public abstract Object a(g gVar);

    @Override // t6.u
    public final b getForegroundInfoAsync() {
        a1 a1VarC = x.c();
        f fVar = this.f1598f;
        fVar.getClass();
        return t1.v(wd.b.O(fVar, a1VarC), new g(this, null, 0));
    }

    @Override // t6.u
    public final b startWork() {
        f fVar = f.f34342c;
        h hVar = this.f1598f;
        if (k.a(hVar, fVar)) {
            hVar = this.f1597e.g;
        }
        k.b(hVar);
        return t1.v(hVar.y(x.c()), new g(this, null, 1));
    }
}
