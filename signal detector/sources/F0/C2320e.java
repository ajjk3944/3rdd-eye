package f0;

import a.AbstractC0241a;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2320e extends T2.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2321f f19983d;

    public C2320e(C2321f c2321f) {
        this.f19983d = c2321f;
    }

    @Override // T2.g
    public final void x(Throwable th) {
        this.f19983d.f19984a.d(th);
    }

    @Override // T2.g
    public final void y(c1.g gVar) {
        C2321f c2321f = this.f19983d;
        c2321f.f19986c = gVar;
        c1.g gVar2 = c2321f.f19986c;
        j jVar = c2321f.f19984a;
        c2321f.f19985b = new V2.e(gVar2, jVar.f19995g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : AbstractC0241a.d());
        j jVar2 = c2321f.f19984a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f19989a.writeLock().lock();
        try {
            jVar2.f19991c = 1;
            arrayList.addAll(jVar2.f19990b);
            jVar2.f19990b.clear();
            jVar2.f19989a.writeLock().unlock();
            jVar2.f19992d.post(new A3.h(arrayList, jVar2.f19991c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f19989a.writeLock().unlock();
            throw th;
        }
    }
}
