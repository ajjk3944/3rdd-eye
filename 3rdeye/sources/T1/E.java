package T1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import androidx.work.t;
import b2.C1842w;
import b2.InterfaceC1843x;
import c9.C2097r;
import com.yandex.mobile.ads.impl.bq1;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.m61;
import com.yandex.mobile.ads.impl.r91;
import com.yandex.mobile.ads.impl.u91;
import com.yandex.mobile.ads.impl.z51;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12121c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12125g;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f12120b = i;
        this.f12122d = obj;
        this.f12121c = obj2;
        this.f12123e = obj3;
        this.f12124f = obj4;
        this.f12125g = obj5;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [b9.g, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f12120b) {
            case 0:
                z this_enqueueUniquelyNamedPeriodic = (z) this.f12122d;
                kotlin.jvm.internal.l.f(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
                String name = (String) this.f12121c;
                kotlin.jvm.internal.l.f(name, "$name");
                C1598j c1598j = (C1598j) this.f12123e;
                G g10 = (G) this.f12124f;
                androidx.work.w workRequest = (androidx.work.w) this.f12125g;
                kotlin.jvm.internal.l.f(workRequest, "$workRequest");
                WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.f12232c;
                InterfaceC1843x interfaceC1843xY = workDatabase.y();
                ArrayList arrayListE = interfaceC1843xY.e(name);
                if (arrayListE.size() > 1) {
                    c1598j.a(new q.a.C0272a(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                    break;
                } else {
                    C1842w.b bVar = (C1842w.b) C2097r.q0(arrayListE);
                    if (bVar == null) {
                        g10.invoke();
                        break;
                    } else {
                        String str = bVar.f17160a;
                        C1842w c1842wU = interfaceC1843xY.u(str);
                        if (c1842wU == null) {
                            c1598j.a(new q.a.C0272a(new IllegalStateException(Oo.h("WorkSpec with ", str, ", that matches a name \"", name, "\", wasn't found"))));
                            break;
                        } else if (!c1842wU.d()) {
                            c1598j.a(new q.a.C0272a(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                            break;
                        } else if (bVar.f17161b == t.b.CANCELLED) {
                            interfaceC1843xY.a(str);
                            g10.invoke();
                            break;
                        } else {
                            C1842w c1842wB = C1842w.b(workRequest.f17043b, bVar.f17160a, null, null, null, 0, 0L, 0, 0, 0L, 0, 8388606);
                            try {
                                l processor = this_enqueueUniquelyNamedPeriodic.f12235f;
                                kotlin.jvm.internal.l.e(processor, "processor");
                                androidx.work.b configuration = this_enqueueUniquelyNamedPeriodic.f12231b;
                                kotlin.jvm.internal.l.e(configuration, "configuration");
                                List<n> schedulers = this_enqueueUniquelyNamedPeriodic.f12234e;
                                kotlin.jvm.internal.l.e(schedulers, "schedulers");
                                I.b(processor, workDatabase, configuration, schedulers, c1842wB, workRequest.f17044c);
                                c1598j.a(androidx.work.q.f17018a);
                                break;
                            } catch (Throwable th) {
                                c1598j.a(new q.a.C0272a(th));
                                return;
                            }
                        }
                    }
                }
            case 1:
                com.vungle.ads.internal.j.m62init$lambda3((Context) this.f12122d, (String) this.f12121c, (com.vungle.ads.internal.j) this.f12123e, (com.vungle.ads.B) this.f12124f, this.f12125g);
                break;
            default:
                z51.b((h7) this.f12122d, (r91) this.f12121c, (u91) this.f12123e, (bq1) ((m61) this.f12124f), (z51) this.f12125g);
                break;
        }
    }
}
