package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lr extends ou1 {
    public final /* synthetic */ mr w;

    public lr(mr mrVar) {
        this.w = mrVar;
    }

    @Override // defpackage.ou1
    public final void r(Throwable th) {
        this.w.a.d(th);
    }

    @Override // defpackage.ou1
    public final void s(mc2 mc2Var) {
        mr mrVar = this.w;
        mrVar.c = mc2Var;
        mc2 mc2Var2 = mrVar.c;
        rr rrVar = mrVar.a;
        mrVar.b = new xb4(mc2Var2, rrVar.g, rrVar.i, Build.VERSION.SDK_INT >= 34 ? xr.a() : pu1.j());
        rr rrVar2 = mrVar.a;
        rrVar2.getClass();
        ArrayList arrayList = new ArrayList();
        rrVar2.a.writeLock().lock();
        try {
            rrVar2.c = 1;
            arrayList.addAll(rrVar2.b);
            rrVar2.b.clear();
            rrVar2.a.writeLock().unlock();
            rrVar2.d.post(new cd(arrayList, rrVar2.c, (Throwable) null));
        } catch (Throwable th) {
            rrVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
