package Z0;

import V0.m;
import W0.c;
import W0.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e1.C2300c;
import e1.h;
import f1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f4518e = m.h("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4519a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f4520b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4521c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4522d;

    public b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f4519a = context;
        this.f4521c = kVar;
        this.f4520b = jobScheduler;
        this.f4522d = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m.f().e(f4518e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r7, android.app.job.JobScheduler r8, java.lang.String r9) {
        /*
            java.util.ArrayList r7 = f(r7, r8)
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L43
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L30
            boolean r6 = r5.containsKey(r4)     // Catch: java.lang.NullPointerException -> L30
            if (r6 == 0) goto L30
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.NullPointerException -> L30
            goto L31
        L30:
            r4 = r8
        L31:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L13
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L13
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.f().e(f4518e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // W0.c
    public final boolean b() {
        return true;
    }

    @Override // W0.c
    public final void d(String str) {
        Context context = this.f4519a;
        JobScheduler jobScheduler = this.f4520b;
        ArrayList arrayListC = c(context, jobScheduler, str);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            a(jobScheduler, ((Integer) obj).intValue());
        }
        this.f4521c.f3992k.q().x(str);
    }

    @Override // W0.c
    public final void e(h... hVarArr) {
        int iA;
        ArrayList arrayListC;
        int iA2;
        k kVar = this.f4521c;
        WorkDatabase workDatabase = kVar.f3992k;
        f fVar = new f(workDatabase);
        for (h hVar : hVarArr) {
            workDatabase.c();
            try {
                h hVarH = workDatabase.t().h(hVar.f19908a);
                String str = f4518e;
                if (hVarH == null) {
                    m.f().i(str, "Skipping scheduling " + hVar.f19908a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.m();
                } else if (hVarH.f19909b != 1) {
                    m.f().i(str, "Skipping scheduling " + hVar.f19908a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.m();
                } else {
                    C2300c c2300cP = workDatabase.q().p(hVar.f19908a);
                    if (c2300cP != null) {
                        iA = c2300cP.f19901b;
                    } else {
                        kVar.f3991j.getClass();
                        iA = fVar.a(kVar.f3991j.f3801b);
                    }
                    if (c2300cP == null) {
                        kVar.f3992k.q().t(new C2300c(hVar.f19908a, iA));
                    }
                    g(hVar, iA);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListC = c(this.f4519a, this.f4520b, hVar.f19908a)) != null) {
                        int iIndexOf = arrayListC.indexOf(Integer.valueOf(iA));
                        if (iIndexOf >= 0) {
                            arrayListC.remove(iIndexOf);
                        }
                        if (arrayListC.isEmpty()) {
                            kVar.f3991j.getClass();
                            iA2 = fVar.a(kVar.f3991j.f3801b);
                        } else {
                            iA2 = ((Integer) arrayListC.get(0)).intValue();
                        }
                        g(hVar, iA2);
                    }
                    workDatabase.m();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r7 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(e1.h r19, int r20) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.g(e1.h, int):void");
    }
}
