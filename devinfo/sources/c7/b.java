package c7;

import a0.q0;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u6.r f2770b;

    public /* synthetic */ b(u6.r rVar, int i4) {
        this.f2769a = i4;
        this.f2770b = rVar;
    }

    @Override // mk.a
    public final Object invoke() {
        int i4 = this.f2769a;
        u uVar = u.f37649a;
        u6.r rVar = this.f2770b;
        switch (i4) {
            case 0:
                WorkDatabase workDatabase = rVar.f35177f;
                nk.k.d(workDatabase, "getWorkDatabase(...)");
                workDatabase.o(new aj.d(2, workDatabase, rVar));
                break;
            default:
                WorkDatabase workDatabase2 = rVar.f35177f;
                Context context = rVar.f35175d;
                String str = w6.c.f36492f;
                if (Build.VERSION.SDK_INT >= 34) {
                    w6.a.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListF = w6.c.f(context, jobScheduler);
                if (arrayListF != null && !arrayListF.isEmpty()) {
                    int size = arrayListF.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListF.get(i10);
                        i10++;
                        w6.c.a(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                ((Number) com.bumptech.glide.f.r(workDatabase2.w().f2066a, false, true, new q0(29))).intValue();
                u6.g.b(rVar.f35176e, workDatabase2, rVar.f35178h);
                break;
        }
        return uVar;
    }
}
