package j4;

import android.os.Build;
import java.util.ArrayList;
import lf.t1;

/* loaded from: classes.dex */
public final class d extends kc.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.b f13207e;

    public d(df.b bVar) {
        this.f13207e = bVar;
    }

    @Override // kc.f
    public final void J(Throwable th2) {
        ((h) this.f13207e.f7337a).e(th2);
    }

    @Override // kc.f
    public final void K(kg.r rVar) {
        df.b bVar = this.f13207e;
        bVar.f7339c = rVar;
        kg.r rVar2 = (kg.r) bVar.f7339c;
        h hVar = (h) bVar.f7337a;
        bVar.f7338b = new io.sentry.k(rVar2, hVar.f13214g, hVar.f13216i, Build.VERSION.SDK_INT >= 34 ? l.a() : t1.s());
        h hVar2 = (h) bVar.f7337a;
        hVar2.getClass();
        ArrayList arrayList = new ArrayList();
        hVar2.f13208a.writeLock().lock();
        try {
            hVar2.f13210c = 1;
            arrayList.addAll(hVar2.f13209b);
            hVar2.f13209b.clear();
            hVar2.f13208a.writeLock().unlock();
            hVar2.f13211d.post(new bc.m(arrayList, hVar2.f13210c, (Throwable) null));
        } catch (Throwable th2) {
            hVar2.f13208a.writeLock().unlock();
            throw th2;
        }
    }
}
