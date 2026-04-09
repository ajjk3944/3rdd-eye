package W1;

import B7.d;
import G0.o;
import G0.p;
import H6.I;
import H8.e;
import T1.n;
import W1.a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.m;
import androidx.work.r;
import androidx.work.t;
import b2.C1823d;
import b2.C1828i;
import b2.C1834o;
import b2.C1842w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.l;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final String f13323g = m.g("SystemJobScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f13324b;

    /* renamed from: c, reason: collision with root package name */
    public final JobScheduler f13325c;

    /* renamed from: d, reason: collision with root package name */
    public final a f13326d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f13327e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.b f13328f;

    public b(Context context, WorkDatabase workDatabase, androidx.work.b bVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context, bVar.f16867c);
        this.f13324b = context;
        this.f13325c = jobScheduler;
        this.f13326d = aVar;
        this.f13327e = workDatabase;
        this.f13328f = bVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m.e().d(f13323g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            C1834o c1834oG = g(jobInfo);
            if (c1834oG != null && str.equals(c1834oG.f17128a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.e().d(f13323g, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static C1834o g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C1834o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // T1.n
    public final void b(C1842w... c1842wArr) {
        int iIntValue;
        ArrayList arrayListC;
        int iIntValue2;
        WorkDatabase workDatabase = this.f13327e;
        final I i = new I(workDatabase);
        for (C1842w c1842w : c1842wArr) {
            workDatabase.c();
            try {
                C1842w c1842wU = workDatabase.y().u(c1842w.f17138a);
                String str = f13323g;
                String str2 = c1842w.f17138a;
                if (c1842wU == null) {
                    m.e().h(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (c1842wU.f17139b != t.b.ENQUEUED) {
                    m.e().h(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    C1834o c1834oL = d.l(c1842w);
                    C1828i c1828iB = workDatabase.v().b(c1834oL);
                    WorkDatabase workDatabase2 = (WorkDatabase) i.f2053c;
                    androidx.work.b bVar = this.f13328f;
                    if (c1828iB != null) {
                        iIntValue = c1828iB.f17121c;
                    } else {
                        bVar.getClass();
                        final int i10 = bVar.f16874k;
                        Callable callable = new Callable() { // from class: c2.k
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                I this$0 = i;
                                kotlin.jvm.internal.l.f(this$0, "this$0");
                                WorkDatabase workDatabase3 = (WorkDatabase) this$0.f2053c;
                                Long lA = workDatabase3.t().a("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase3.t().b(new C1823d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase3.t().b(new C1823d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        };
                        workDatabase2.getClass();
                        Object objQ = workDatabase2.q(new e(callable, 7));
                        l.e(objQ, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objQ).intValue();
                    }
                    if (c1828iB == null) {
                        workDatabase.v().d(new C1828i(c1834oL.f17128a, c1834oL.f17129b, iIntValue));
                    }
                    h(c1842w, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListC = c(this.f13324b, this.f13325c, str2)) != null) {
                        int iIndexOf = arrayListC.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListC.remove(iIndexOf);
                        }
                        if (arrayListC.isEmpty()) {
                            bVar.getClass();
                            final int i11 = bVar.f16874k;
                            Callable callable2 = new Callable() { // from class: c2.k
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    I this$0 = i;
                                    kotlin.jvm.internal.l.f(this$0, "this$0");
                                    WorkDatabase workDatabase3 = (WorkDatabase) this$0.f2053c;
                                    Long lA = workDatabase3.t().a("next_job_scheduler_id");
                                    int i112 = 0;
                                    int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                    workDatabase3.t().b(new C1823d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                    if (iLongValue < 0 || iLongValue > i11) {
                                        workDatabase3.t().b(new C1823d("next_job_scheduler_id", Long.valueOf(1)));
                                    } else {
                                        i112 = iLongValue;
                                    }
                                    return Integer.valueOf(i112);
                                }
                            };
                            workDatabase2.getClass();
                            Object objQ2 = workDatabase2.q(new e(callable2, 7));
                            l.e(objQ2, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objQ2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListC.get(0)).intValue();
                        }
                        h(c1842w, iIntValue2);
                    }
                    workDatabase.r();
                }
                workDatabase.n();
            } finally {
                workDatabase.n();
            }
        }
    }

    @Override // T1.n
    public final boolean d() {
        return true;
    }

    @Override // T1.n
    public final void e(String str) {
        Context context = this.f13324b;
        JobScheduler jobScheduler = this.f13325c;
        ArrayList arrayListC = c(context, jobScheduler, str);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f13327e.v().e(str);
    }

    public final void h(C1842w c1842w, int i) {
        char c10;
        int i10;
        char c11;
        char c12;
        char c13;
        long j4;
        int i11 = 2;
        JobScheduler jobScheduler = this.f13325c;
        a aVar = this.f13326d;
        aVar.getClass();
        androidx.work.d dVar = c1842w.f17146j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = c1842w.f17138a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c1842w.f17156t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c1842w.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, aVar.f13320a).setRequiresCharging(dVar.f16883b);
        boolean z10 = dVar.f16884c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z10).setExtras(persistableBundle);
        int i12 = Build.VERSION.SDK_INT;
        androidx.work.n nVar = dVar.f16882a;
        if (i12 < 30 || nVar != androidx.work.n.TEMPORARILY_UNMETERED) {
            int i13 = a.C0190a.f13322a[nVar.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        char c14 = 2;
                        if (i13 != 4) {
                            if (i13 == 5 && i12 >= 26) {
                                i10 = 1;
                                i11 = 4;
                                c10 = c14;
                            }
                        } else if (i12 >= 24) {
                            i11 = 3;
                            c12 = c14;
                        }
                        i10 = 1;
                        m.e().a(a.f13319c, "API version too low. Cannot convert network type value " + nVar);
                        c11 = c14;
                    } else {
                        c12 = 2;
                    }
                    i10 = 1;
                    c10 = c12;
                } else {
                    c11 = 2;
                    i10 = 1;
                }
                i11 = i10;
                c10 = c11;
            } else {
                c10 = 2;
                i10 = 1;
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
            c13 = c10;
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            c13 = 2;
            i10 = 1;
        }
        if (!z10) {
            extras.setBackoffCriteria(c1842w.f17149m, c1842w.f17148l == androidx.work.a.LINEAR ? 0 : i10);
        }
        long jA = c1842w.a();
        aVar.f13321b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c1842w.f17153q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 < 24 || !dVar.a()) {
            j4 = 0;
        } else {
            for (d.a aVar2 : dVar.f16889h) {
                boolean z11 = aVar2.f16891b;
                p.k();
                extras.addTriggerContentUri(o.b(aVar2.f16890a, z11 ? 1 : 0));
            }
            j4 = 0;
            extras.setTriggerContentUpdateDelay(dVar.f16887f);
            extras.setTriggerContentMaxDelay(dVar.f16888g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f16885d);
            extras.setRequiresStorageNotLow(dVar.f16886e);
        }
        int i15 = c1842w.f17147k > 0 ? i10 : 0;
        int i16 = jMax > j4 ? i10 : 0;
        if (i14 >= 31 && c1842w.f17153q && i15 == 0 && i16 == 0) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f13323g;
        m.e().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                m.e().h(str2, "Unable to schedule work ID " + str);
                if (c1842w.f17153q && c1842w.f17154r == r.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c1842w.f17153q = false;
                    m.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    h(c1842w, i);
                }
            }
        } catch (IllegalStateException e4) {
            ArrayList arrayListF = f(this.f13324b, jobScheduler);
            int size = arrayListF != null ? arrayListF.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            Integer numValueOf2 = Integer.valueOf(this.f13327e.y().k().size());
            androidx.work.b bVar = this.f13328f;
            Integer numValueOf3 = Integer.valueOf(bVar.f16876m);
            Object[] objArr = new Object[3];
            objArr[0] = numValueOf;
            objArr[i10] = numValueOf2;
            objArr[c13] = numValueOf3;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            m.e().c(str2, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e4);
            T.a aVar3 = bVar.f16872h;
            if (aVar3 == null) {
                throw illegalStateException;
            }
            aVar3.accept(illegalStateException);
        } catch (Throwable th) {
            m.e().d(str2, "Unable to schedule " + c1842w, th);
        }
    }
}
