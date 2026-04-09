package fm;

import android.content.Context;
import d4.w;
import io.sentry.a3;
import io.sentry.k1;
import io.sentry.o;
import io.sentry.p;
import io.sentry.y0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8996a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8997d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8998g;

    public /* synthetic */ b(Object obj, Serializable serializable, int i10) {
        this.f8996a = i10;
        this.f8998g = obj;
        this.f8997d = serializable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f8996a) {
            case 0:
                a8.f.A(new w((a8.f) this.f8997d, (Context) this.f8998g, null, 1));
                break;
            case 1:
                ((ih.e) this.f8998g).b((ih.d) this.f8997d);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f8997d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = (p) this.f8998g;
                if (jCurrentTimeMillis - pVar.f12490i > 10) {
                    arrayList.clear();
                    pVar.f12490i = jCurrentTimeMillis;
                    a3 a3Var = new a3(pVar.f12488g.getDateProvider().a().d());
                    Iterator it = pVar.f12485d.iterator();
                    while (it.hasNext()) {
                        ((y0) it.next()).a(a3Var);
                    }
                    for (o oVar : pVar.f12484c.values()) {
                        ArrayList arrayList2 = oVar.f12452a;
                        k1 k1Var = oVar.f12453b;
                        arrayList2.add(a3Var);
                        if (k1Var != null) {
                            if (oVar.f12455d.f12488g.getDateProvider().a().d() > TimeUnit.MILLISECONDS.toNanos(30000L) + oVar.f12454c) {
                                arrayList.add(k1Var);
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        pVar.f((k1) it2.next());
                    }
                    break;
                }
                break;
        }
    }

    public b(a8.f fVar, Context context) {
        this.f8996a = 0;
        this.f8997d = fVar;
        this.f8998g = context;
    }
}
