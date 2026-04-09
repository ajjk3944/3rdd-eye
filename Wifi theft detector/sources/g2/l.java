package g2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l2.p;
import l2.q;

/* loaded from: classes.dex */
public class l implements d2.e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f21181e = androidx.work.k.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f21182a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f21183b;

    /* renamed from: c, reason: collision with root package name */
    public final d2.j f21184c;

    /* renamed from: d, reason: collision with root package name */
    public final k f21185d;

    public l(Context context, d2.j jVar) {
        this(context, jVar, (JobScheduler) context.getSystemService("jobscheduler"), new k(context));
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            androidx.work.k.c().b(f21181e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            androidx.work.k.c().b(f21181e, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, d2.j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listB = jVar.o().y().b();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    e(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                androidx.work.k.c().a(f21181e, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        WorkDatabase workDatabaseO = jVar.o();
        workDatabaseO.c();
        try {
            q qVarB = workDatabaseO.B();
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                qVarB.l((String) it2.next(), -1L);
            }
            workDatabaseO.r();
            workDatabaseO.g();
            return z10;
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }

    @Override // d2.e
    public void a(String str) {
        List listF = f(this.f21182a, this.f21183b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            e(this.f21183b, ((Integer) it.next()).intValue());
        }
        this.f21184c.o().y().d(str);
    }

    @Override // d2.e
    public void c(p... pVarArr) {
        List listF;
        WorkDatabase workDatabaseO = this.f21184c.o();
        m2.f fVar = new m2.f(workDatabaseO);
        for (p pVar : pVarArr) {
            workDatabaseO.c();
            try {
                p pVarG = workDatabaseO.B().g(pVar.f23092a);
                if (pVarG == null) {
                    androidx.work.k.c().h(f21181e, "Skipping scheduling " + pVar.f23092a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseO.r();
                } else if (pVarG.f23093b != WorkInfo$State.ENQUEUED) {
                    androidx.work.k.c().h(f21181e, "Skipping scheduling " + pVar.f23092a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseO.r();
                } else {
                    l2.g gVarA = workDatabaseO.y().a(pVar.f23092a);
                    int iD = gVarA != null ? gVarA.f23070b : fVar.d(this.f21184c.i().i(), this.f21184c.i().g());
                    if (gVarA == null) {
                        this.f21184c.o().y().c(new l2.g(pVar.f23092a, iD));
                    }
                    j(pVar, iD);
                    if (Build.VERSION.SDK_INT == 23 && (listF = f(this.f21182a, this.f21183b, pVar.f23092a)) != null) {
                        int iIndexOf = listF.indexOf(Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        j(pVar, !listF.isEmpty() ? ((Integer) listF.get(0)).intValue() : fVar.d(this.f21184c.i().i(), this.f21184c.i().g()));
                    }
                    workDatabaseO.r();
                }
            } finally {
                workDatabaseO.g();
            }
        }
    }

    @Override // d2.e
    public boolean d() {
        return true;
    }

    public void j(p pVar, int i10) {
        JobInfo jobInfoA = this.f21185d.a(pVar, i10);
        androidx.work.k kVarC = androidx.work.k.c();
        String str = f21181e;
        kVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f23092a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f21183b.schedule(jobInfoA) == 0) {
                androidx.work.k.c().h(str, String.format("Unable to schedule work ID %s", pVar.f23092a), new Throwable[0]);
                if (pVar.f23108q && pVar.f23109r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f23108q = false;
                    androidx.work.k.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f23092a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List listG = g(this.f21182a, this.f21183b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f21184c.o().B().d().size()), Integer.valueOf(this.f21184c.i().h()));
            androidx.work.k.c().b(f21181e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e10);
        } catch (Throwable th) {
            androidx.work.k.c().b(f21181e, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public l(Context context, d2.j jVar, JobScheduler jobScheduler, k kVar) {
        this.f21182a = context;
        this.f21184c = jVar;
        this.f21183b = jobScheduler;
        this.f21185d = kVar;
    }
}
