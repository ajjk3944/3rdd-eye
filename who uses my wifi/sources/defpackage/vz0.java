package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vz0 implements et0 {
    public static final String j = h80.f("SystemJobScheduler");
    public final Context f;
    public final JobScheduler g;
    public final ha1 h;
    public final uz0 i;

    public vz0(Context context, ha1 ha1Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        uz0 uz0Var = new uz0(context);
        this.f = context;
        this.h = ha1Var;
        this.g = jobScheduler;
        this.i = uz0Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            h80.d().b(j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h80.d().b(j, "getAllPendingJobs() is not reliable on this device.", th);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // defpackage.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f
            android.app.job.JobScheduler r1 = r11.g
            java.util.ArrayList r0 = c(r0, r1)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Ld
            goto L49
        Ld:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            int r5 = r0.size()
            r6 = r2
        L18:
            if (r6 >= r5) goto L48
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7
            java.lang.String r8 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r9 = r7.getExtras()
            if (r9 == 0) goto L35
            boolean r10 = r9.containsKey(r8)     // Catch: java.lang.NullPointerException -> L35
            if (r10 == 0) goto L35
            java.lang.String r8 = r9.getString(r8)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r8 = r3
        L36:
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L18
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            goto L18
        L48:
            r3 = r4
        L49:
            if (r3 == 0) goto L72
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L72
            int r0 = r3.size()
        L55:
            if (r2 >= r0) goto L67
            java.lang.Object r4 = r3.get(r2)
            int r2 = r2 + 1
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            a(r1, r4)
            goto L55
        L67:
            ha1 r0 = r11.h
            androidx.work.impl.WorkDatabase r0 = r0.r
            t83 r0 = r0.k()
            r0.O(r12)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz0.b(java.lang.String):void");
    }

    @Override // defpackage.et0
    public final void d(oa1... oa1VarArr) {
        int iJ;
        ha1 ha1Var = this.h;
        WorkDatabase workDatabase = ha1Var.r;
        f20 f20Var = new f20(0, workDatabase);
        for (oa1 oa1Var : oa1VarArr) {
            workDatabase.c();
            try {
                oa1 oa1VarH = workDatabase.n().h(oa1Var.a);
                if (oa1VarH == null) {
                    h80.d().g(new Throwable[0]);
                    workDatabase.h();
                } else if (oa1VarH.b != 1) {
                    h80.d().g(new Throwable[0]);
                    workDatabase.h();
                } else {
                    sz0 sz0VarF = workDatabase.k().F(oa1Var.a);
                    if (sz0VarF != null) {
                        iJ = sz0VarF.b;
                    } else {
                        ha1Var.q.getClass();
                        iJ = f20Var.j(ha1Var.q.b);
                    }
                    if (sz0VarF == null) {
                        ha1Var.r.k().J(new sz0(oa1Var.a, iJ));
                    }
                    e(oa1Var, iJ);
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(oa1 oa1Var, int i) {
        int i2;
        JobScheduler jobScheduler = this.g;
        String str = j;
        uz0 uz0Var = this.i;
        uz0Var.getClass();
        ri riVar = oa1Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oa1Var.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oa1Var.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, uz0Var.a).setRequiresCharging(riVar.b).setRequiresDeviceIdle(riVar.c).setExtras(persistableBundle);
        int i3 = riVar.a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i3 != 6) {
            int iS = ex0.s(i3);
            if (iS == 0) {
                i2 = 0;
            } else if (iS == 1) {
                i2 = 1;
            } else if (iS != 2) {
                i2 = 3;
                if (iS != 3) {
                    i2 = 4;
                    if (iS != 4) {
                        h80 h80VarD = h80.d();
                        int i5 = uz0.b;
                        h80VarD.a(new Throwable[0]);
                        i2 = 1;
                    }
                }
            } else {
                i2 = 2;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!riVar.c) {
            extras.setBackoffCriteria(oa1Var.m, oa1Var.l == 2 ? 0 : 1);
        }
        long jMax = Math.max(oa1Var.a() - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!oa1Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (riVar.h.a.size() > 0) {
            Iterator it = riVar.h.a.iterator();
            while (it.hasNext()) {
                gj gjVar = (gj) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(gjVar.a, gjVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(riVar.f);
            extras.setTriggerContentMaxDelay(riVar.g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(riVar.d);
        extras.setRequiresStorageNotLow(riVar.e);
        byte b = oa1Var.k > 0;
        if (gc.a() && oa1Var.q && b == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        h80.d().a(new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                h80.d().g(new Throwable[0]);
                if (oa1Var.q && oa1Var.r == 1) {
                    oa1Var.q = false;
                    h80.d().a(new Throwable[0]);
                    e(oa1Var, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListC = c(this.f, jobScheduler);
            int size = arrayListC != null ? arrayListC.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            ha1 ha1Var = this.h;
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(ha1Var.r.n().d().size()), Integer.valueOf(ha1Var.q.c));
            h80.d().b(str, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            h80.d().b(str, "Unable to schedule " + oa1Var, th);
        }
    }

    @Override // defpackage.et0
    public final boolean f() {
        return true;
    }
}
