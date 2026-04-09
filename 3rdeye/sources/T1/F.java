package T1;

import android.os.Build;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b2.C1842w;
import b2.InterfaceC1818E;
import b2.InterfaceC1843x;
import java.util.List;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f12126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1842w f12127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1842w f12128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f12129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Set f12131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12132h;

    public /* synthetic */ F(WorkDatabase workDatabase, C1842w c1842w, C1842w c1842w2, List list, String str, Set set, boolean z10) {
        this.f12126b = workDatabase;
        this.f12127c = c1842w;
        this.f12128d = c1842w2;
        this.f12129e = list;
        this.f12130f = str;
        this.f12131g = set;
        this.f12132h = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkDatabase workDatabase = this.f12126b;
        kotlin.jvm.internal.l.f(workDatabase, "$workDatabase");
        C1842w c1842w = this.f12127c;
        C1842w c1842w2 = this.f12128d;
        List schedulers = this.f12129e;
        kotlin.jvm.internal.l.f(schedulers, "$schedulers");
        String workSpecId = this.f12130f;
        kotlin.jvm.internal.l.f(workSpecId, "$workSpecId");
        Set<String> tags = this.f12131g;
        kotlin.jvm.internal.l.f(tags, "$tags");
        InterfaceC1843x interfaceC1843xY = workDatabase.y();
        InterfaceC1818E interfaceC1818EZ = workDatabase.z();
        C1842w c1842wB = C1842w.b(c1842w2, null, c1842w.f17139b, null, null, c1842w.f17147k, c1842w.f17150n, c1842w.f17155s, c1842w.f17156t + 1, c1842w.f17157u, c1842w.f17158v, 4447229);
        if (c1842w2.f17158v == 1) {
            c1842wB.f17157u = c1842w2.f17157u;
            c1842wB.f17158v++;
        }
        if (Build.VERSION.SDK_INT < 26) {
            androidx.work.d dVar = c1842wB.f17146j;
            String name = ConstraintTrackingWorker.class.getName();
            String str = c1842wB.f17140c;
            if (kotlin.jvm.internal.l.b(str, name) || !(dVar.f16885d || dVar.f16886e)) {
                c1842wB = c1842wB;
            } else {
                e.a aVar = new e.a();
                aVar.b(c1842wB.f17142e.f16894a);
                aVar.f16895a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                androidx.work.e eVar = new androidx.work.e(aVar.f16895a);
                androidx.work.e.i(eVar);
                c1842wB = C1842w.b(c1842wB, null, null, ConstraintTrackingWorker.class.getName(), eVar, 0, 0L, 0, 0, 0L, 0, 8388587);
            }
        }
        interfaceC1843xY.r(c1842wB);
        interfaceC1818EZ.c(workSpecId);
        interfaceC1818EZ.b(workSpecId, tags);
        if (this.f12132h) {
            return;
        }
        interfaceC1843xY.d(-1L, workSpecId);
        workDatabase.x().a(workSpecId);
    }
}
