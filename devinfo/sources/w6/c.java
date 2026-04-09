package w6;

import a0.q0;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b7.i;
import b7.l;
import b7.r;
import b7.y;
import com.bumptech.glide.f;
import com.google.android.gms.internal.measurement.d5;
import d.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import nk.k;
import t6.d0;
import t6.g0;
import t6.v;
import u6.e;
import zj.m;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final String f36492f = v.g("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f36493a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f36494b;

    /* renamed from: c, reason: collision with root package name */
    public final b f36495c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f36496d;

    /* renamed from: e, reason: collision with root package name */
    public final t6.b f36497e;

    public c(Context context, WorkDatabase workDatabase, t6.b bVar) {
        JobScheduler jobSchedulerB = a.b(context);
        b bVar2 = new b(context, bVar.f34315d, bVar.f34321l);
        this.f36493a = context;
        this.f36494b = jobSchedulerB;
        this.f36495c = bVar2;
        this.f36496d = workDatabase;
        this.f36497e = bVar;
    }

    public static void a(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th2) {
            v.e().d(f36492f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i4)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        int size = arrayListF.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListF.get(i4);
            i4++;
            JobInfo jobInfo = (JobInfo) obj;
            l lVarG = g(jobInfo);
            if (lVarG != null && str.equals(lVarG.f2007a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = a.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static l g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u6.e
    public final void b(r... rVarArr) {
        int iIntValue;
        ArrayList arrayListE;
        int iIntValue2;
        r[] rVarArr2 = rVarArr;
        WorkDatabase workDatabase = this.f36496d;
        o7.c cVar = new o7.c(workDatabase);
        WorkDatabase workDatabase2 = (WorkDatabase) cVar.f30419b;
        int length = rVarArr2.length;
        int i4 = 0;
        while (i4 < length) {
            r rVar = rVarArr2[i4];
            workDatabase.b();
            try {
                y yVarW = workDatabase.w();
                String str = rVar.f2030a;
                r rVarD = yVarW.d(str);
                String str2 = f36492f;
                if (rVarD == null) {
                    v.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (rVarD.f2031b != g0.f34349a) {
                    v.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    l lVarH = d5.h(rVar);
                    i iVarA = workDatabase.t().a(lVarH);
                    t6.b bVar = this.f36497e;
                    if (iVarA != null) {
                        iIntValue = iVarA.f2001c;
                    } else {
                        bVar.getClass();
                        Object objN = workDatabase2.n(new c7.e(cVar, bVar.f34319i, 0));
                        k.d(objN, "runInTransaction(...)");
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (iVarA == null) {
                        i iVar = new i(lVarH.f2007a, lVarH.f2008b, iIntValue);
                        b7.k kVarT = workDatabase.t();
                        kVarT.getClass();
                        f.r(kVarT.f2005a, false, true, new b7.b(2, kVarT, iVar));
                    }
                    h(rVar, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListE = e(this.f36493a, this.f36494b, str)) != null) {
                        int iIndexOf = arrayListE.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListE.remove(iIndexOf);
                        }
                        if (arrayListE.isEmpty()) {
                            bVar.getClass();
                            Object objN2 = workDatabase2.n(new c7.e(cVar, bVar.f34319i, 0));
                            k.d(objN2, "runInTransaction(...)");
                            iIntValue2 = ((Number) objN2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListE.get(0)).intValue();
                        }
                        h(rVar, iIntValue2);
                    }
                    workDatabase.p();
                    i4++;
                    rVarArr2 = rVarArr;
                }
                workDatabase.l();
                i4++;
                rVarArr2 = rVarArr;
            } finally {
                workDatabase.l();
            }
        }
    }

    @Override // u6.e
    public final boolean c() {
        return true;
    }

    @Override // u6.e
    public final void d(String str) {
        Context context = this.f36493a;
        JobScheduler jobScheduler = this.f36494b;
        ArrayList arrayListE = e(context, jobScheduler, str);
        if (arrayListE == null || arrayListE.isEmpty()) {
            return;
        }
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            a(jobScheduler, ((Integer) obj).intValue());
        }
        b7.k kVarT = this.f36496d.t();
        kVarT.getClass();
        k.e(str, "workSpecId");
        f.r(kVarT.f2005a, false, true, new b7.c(str, 3));
    }

    public final void h(r rVar, int i4) {
        String str;
        JobInfo jobInfoA = this.f36495c.a(rVar, i4);
        v vVarE = v.e();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str2 = rVar.f2030a;
        sb2.append(str2);
        sb2.append("Job ID ");
        sb2.append(i4);
        String string = sb2.toString();
        String str3 = f36492f;
        vVarE.a(str3, string);
        try {
            if (this.f36494b.schedule(jobInfoA) == 0) {
                v.e().h(str3, "Unable to schedule work ID " + str2);
                if (rVar.f2044q && rVar.f2045r == d0.f34331a) {
                    rVar.f2044q = false;
                    v.e().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    h(rVar, i4);
                }
            }
        } catch (IllegalStateException e2) {
            String str4 = a.f36487a;
            Context context = this.f36493a;
            k.e(context, "context");
            WorkDatabase workDatabase = this.f36496d;
            k.e(workDatabase, "workDatabase");
            t6.b bVar = this.f36497e;
            k.e(bVar, "configuration");
            int i10 = Build.VERSION.SDK_INT;
            int i11 = i10 >= 31 ? 150 : 100;
            int size = ((List) f.r(workDatabase.w().f2066a, true, false, new q0(22))).size();
            String strG0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i10 >= 34) {
                JobScheduler jobSchedulerB = a.b(context);
                List listA = a.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListF = f(context, jobSchedulerB);
                    int size2 = arrayListF != null ? listA.size() - arrayListF.size() : 0;
                    String str5 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    k.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListF2 = f(context, (JobScheduler) systemService);
                    int size3 = arrayListF2 != null ? arrayListF2.size() : 0;
                    if (size3 != 0) {
                        str5 = size3 + " from WorkManager in the default namespace";
                    }
                    strG0 = n.g0(m.Y(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str5}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListF3 = f(context, a.b(context));
                if (arrayListF3 != null) {
                    strG0 = arrayListF3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb3 = new StringBuilder("JobScheduler ");
            sb3.append(i11);
            sb3.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb3.append(strG0);
            sb3.append(".\nThere are ");
            sb3.append(size);
            sb3.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strU = h.u(sb3, bVar.f34320k, '.');
            v.e().c(str3, strU);
            throw new IllegalStateException(strU, e2);
        } catch (Throwable th2) {
            v.e().d(str3, "Unable to schedule " + rVar, th2);
        }
    }
}
