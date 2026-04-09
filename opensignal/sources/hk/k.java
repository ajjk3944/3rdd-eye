package hk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.o;
import ch.n;
import cj.q;
import cj.t;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.domain.ApplicationLifecycleListener;
import h7.h0;
import h7.r1;
import h9.p;
import h9.r2;
import i.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import jj.m0;
import jj.o0;
import org.json.JSONException;
import p.l2;
import tt.s;
import xi.u;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public Object f10830a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10831b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10832c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10833d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10834e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10835f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10836g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10837h;

    /* renamed from: i, reason: collision with root package name */
    public Object f10838i;
    public Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f10839l;

    /* renamed from: m, reason: collision with root package name */
    public Object f10840m;

    /* renamed from: n, reason: collision with root package name */
    public Object f10841n;

    public k(Context context, a8.f fVar, of.b bVar, r2 r2Var, om.f fVar2, p pVar, al.g gVar, sm.m mVar, dj.g gVar2, h0 h0Var, l2 l2Var, q qVar, df.c cVar, l2 l2Var2, bm.d dVar, l2 l2Var3, r2 r2Var2, cj.a aVar) {
        br.l.e(l2Var, "jobResultProcessor");
        this.f10831b = context;
        this.f10830a = fVar;
        this.f10832c = bVar;
        this.f10833d = r2Var;
        this.f10834e = fVar2;
        this.f10835f = pVar;
        this.f10836g = gVar;
        this.f10837h = gVar2;
        this.f10838i = l2Var;
        this.j = qVar;
        this.k = dVar;
        this.f10839l = l2Var3;
        this.f10840m = r2Var2;
        this.f10841n = new Object();
        n.b("TaskScheduler", "init called");
        h0Var.f10078a = this;
    }

    public static boolean x(h hVar, boolean z10) {
        n.b("TaskScheduler", hVar.c() + " shouldUpdateSchedule() called with: executedSuccessfully = " + z10 + ", task = " + hVar.f10805b);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.c());
        sb2.append(" shouldUpdateSchedule() called with: rescheduleOnFailFromThisJobOnwards = ");
        String str = hVar.f10822u;
        sb2.append(str);
        n.b("TaskScheduler", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(hVar.c());
        sb3.append(" shouldUpdateSchedule() called with: rescheduleOnInterruptFromThisJobOnwards = ");
        String str2 = hVar.f10823v;
        sb3.append(str2);
        n.b("TaskScheduler", sb3.toString());
        String str3 = hVar.S;
        List list = hVar.f10810g;
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vj.b) it.next()).f());
        }
        Boolean boolY = y(str3, str2, arrayList, hVar.c(), "interruption");
        String str4 = hVar.R;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((vj.b) it2.next()).f());
        }
        Boolean boolY2 = y(str4, str, arrayList2, hVar.c(), "failure");
        if (z10) {
            return true;
        }
        if (boolY2 != null && boolY != null) {
            return boolY2.booleanValue() || boolY.booleanValue();
        }
        if (boolY2 != null) {
            return boolY2.booleanValue();
        }
        if (boolY != null) {
            return boolY.booleanValue();
        }
        return true;
    }

    public static Boolean y(String str, String str2, ArrayList arrayList, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(" shouldUpdateScheduleOnEvent() called with: eventJobName = ");
        sb2.append(str);
        sb2.append(", rescheduleFromThisJobOnwards = ");
        sb2.append(str2);
        sb2.append(", jobNames = ");
        sb2.append(arrayList);
        sb2.append(", logPrefix = ");
        sb2.append(str3);
        n.b("TaskScheduler", w.g.j(sb2, ", eventType = ", str4));
        if (str2.length() == 0) {
            n.b("TaskScheduler", str3 + ' ' + str4 + " flag does not specify task to reschedule from. Should reschedule.");
            return null;
        }
        if (str == null) {
            n.b("TaskScheduler", str3 + ' ' + str4 + " job name is null. Should reschedule.");
            return null;
        }
        n.b("TaskScheduler", str3 + ' ' + str4 + ": " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(" reschedule from this task onwards: ");
        sb3.append(str2);
        n.b("TaskScheduler", sb3.toString());
        int iIndexOf = arrayList.indexOf(str);
        int iIndexOf2 = arrayList.indexOf(str2);
        n.b("TaskScheduler", str3 + ' ' + str4 + "JobIndex: " + iIndexOf);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str3);
        sb4.append(" updateScheduleJobIndex: ");
        sb4.append(iIndexOf2);
        n.b("TaskScheduler", sb4.toString());
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return Boolean.TRUE;
        }
        boolean z10 = iIndexOf >= iIndexOf2;
        n.b("TaskScheduler", str3 + " Reschedule on " + str4 + ": " + z10);
        return Boolean.valueOf(z10);
    }

    public void A(h hVar, boolean z10) {
        n.b("TaskScheduler", "taskFinishedWork() called with: task = " + hVar.f10805b + ", executedSuccessfully = " + z10);
        synchronized (this.f10841n) {
            try {
                ((om.f) this.f10834e).c(hVar);
                h hVarY = ((of.b) this.f10832c).y(hVar);
                String strC = hVarY.c();
                n.b("TaskScheduler", strC + " Tasks deleted - " + ((r2) this.f10833d).T0(hVar));
                if (hVar.f10820s) {
                    o(hVar, z10);
                }
                int iK0 = ((r2) this.f10833d).k0(hVarY);
                boolean zW = w(iK0, hVarY);
                n.b("TaskScheduler", strC + " Finished work");
                n.b("TaskScheduler", strC + " shouldReschedule: " + zW + ' ');
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strC);
                sb2.append(" executedSuccessfully: ");
                sb2.append(z10);
                n.b("TaskScheduler", sb2.toString());
                n.b("TaskScheduler", strC + " currentRunCount: " + iK0);
                if (zW) {
                    boolean zX = x(hVar, z10);
                    n.b("TaskScheduler", strC + " shouldUpdateTaskSchedule: " + zX);
                    h hVarC = zX ? C(iK0, hVarY) : hVarY;
                    hVarY.Q = null;
                    h hVarA = ((q) this.j).a(hVarC);
                    ((r2) this.f10833d).v1(hVarA);
                    if (hVarA.f10809f.k) {
                        n.b("TaskScheduler", strC + " re-scheduling for triggers.");
                        h hVarB = h.b(hVarA, 0L, null, null, null, null, false, null, -1);
                        hVarB.N = m.WAITING_FOR_TRIGGERS;
                        ((r2) this.f10833d).v1(hVarB);
                        return;
                    }
                    if (zX) {
                        n.b("TaskScheduler", hVarA.c() + " schedule updated. Re-schedule.");
                        v(hVarA, false, m0.TASK_FINISHED_WORK_TRIGGER);
                    } else {
                        n.b("TaskScheduler", strC + " schedule not updated. Don't re-schedule.");
                    }
                    hVarY = hVarC;
                } else if (s.n0(hVarY.f10805b, "custom", false)) {
                    s(hVarY);
                }
                if (z10) {
                    t(hVarY);
                }
            } finally {
            }
        }
    }

    public h B(h hVar, h hVar2) {
        n.b("TaskScheduler", hVar.c() + " updateExistingPreConfiguredTask() called with: New task = " + hVar.f10805b);
        n.b("TaskScheduler", hVar.c() + " updateExistingPreConfiguredTask() called with: Scheduled task = " + hVar2.f10805b);
        n.b("TaskScheduler", "updateTaskWithScheduledData() called with: newTask = " + hVar + " ,scheduledTask = " + hVar2);
        gk.c cVar = hVar2.f10809f;
        h hVarB = h.b(hVar, hVar2.f10804a, null, gk.c.a(hVar.f10809f, cVar.f9616b, cVar.f9620f, cVar.f9621g, cVar.f9622h, cVar.j, cVar.f9625m, 3357), null, null, false, hVar2.C, -268435490);
        ((r2) this.f10833d).v1(hVarB);
        return hVarB;
    }

    public h C(int i10, h hVar) {
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " [updateTask]"));
        int i11 = i10 + 1;
        bm.d dVar = (bm.d) this.k;
        gk.c cVar = hVar.f10809f;
        o oVarF = dVar.F(cVar);
        long j = cVar.f9622h;
        n.b("TaskScheduler", hVar.c() + " executionCount: " + i11);
        n.b("TaskScheduler", hVar.c() + " scheduleMechanism: " + oVarF);
        n.b("TaskScheduler", hVar.c() + " scheduleTime: " + j);
        h hVarB = h.b(hVar, ((long) hVar.f10805b.hashCode()) + System.currentTimeMillis(), null, oVarF.f1(cVar, i11, System.currentTimeMillis()), null, null, false, null, -34);
        n.b("TaskScheduler", hVarB.c() + " Update new task. Time " + hVarB.f10809f.f9622h);
        ((r2) this.f10833d).v1(hVarB);
        return hVarB;
    }

    public h D(h hVar) {
        gk.c cVarA = gk.c.a(hVar.f10809f, 0L, System.currentTimeMillis(), 0L, 0L, 0, false, 8159);
        n.b("TaskScheduler", "updateTaskSchedule() called with: task = " + hVar.f10805b + ", newSchedule = " + cVarA.f9615a);
        h hVarB = h.b(hVar, 0L, null, cVarA, null, null, false, null, -33);
        if (!cVarA.f9624l) {
            ((r2) this.f10833d).v1(hVarB);
        }
        return hVarB;
    }

    @Override // hk.f
    public void a(h hVar, vj.c cVar) {
        br.l.e(cVar, "result");
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Complete."));
        if (hVar.f10809f.f9624l) {
            l2 l2Var = (l2) this.f10838i;
            long j = hVar.f10804a;
            l2Var.getClass();
            n.b("JobResultProcessor", "Complete: taskId: " + j);
            vj.d dVarW = ((r1) l2Var.f20100d).W();
            if (dVarW != null) {
                ((mk.g) dVarW).d(new fi.f(j, cVar));
            }
        }
        A(hVar, true);
        ((r2) this.f10833d).T0(hVar);
    }

    @Override // hk.f
    public void b(h hVar) {
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Stopped."));
        A(hVar, false);
        if (hVar.f10809f.f9624l) {
            l2 l2Var = (l2) this.f10838i;
            l2Var.getClass();
            n.b("JobResultProcessor", "Job stopped: taskId: " + hVar + " jobId: manual-stop reason: Task Interrupted");
            vj.d dVarW = ((r1) l2Var.f20100d).W();
            if (dVarW != null) {
                ((mk.g) dVarW).d(new mk.f(1, hVar));
            }
        }
        ((r2) this.f10833d).T0(hVar);
    }

    @Override // hk.f
    public void c(long j, String str, h hVar, String str2) {
        br.l.e(str, "jobName");
        br.l.e(str2, "error");
        n.c("TaskScheduler", "[" + j + ':' + str + "] Error on : " + str2);
        A(hVar, false);
        l2 l2Var = (l2) this.f10838i;
        l2Var.getClass();
        n.c("JobResultProcessor", "Error: taskId: " + j + " jobId: " + str);
        vj.d dVarW = ((r1) l2Var.f20100d).W();
        if (dVarW != null) {
            ((mk.g) dVarW).d(new mk.e(0, j, str, str2));
        }
    }

    @Override // hk.f
    public void d(long j, String str, vj.c cVar, boolean z10) {
        br.l.e(str, "jobName");
        Objects.toString(cVar);
        n.a();
        if (z10) {
            l2 l2Var = (l2) this.f10838i;
            l2Var.getClass();
            n.b("JobResultProcessor", "Job Complete: taskId: " + j + " id: " + str + " result: " + cVar);
            vj.d dVarW = ((r1) l2Var.f20100d).W();
            if (dVarW != null) {
                ((mk.g) dVarW).d(new io.sentry.android.replay.i(str, j, cVar, 2));
            }
        }
    }

    @Override // hk.f
    public void e(h hVar) {
        br.l.e(hVar, "task");
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Started."));
        r2 r2Var = (r2) this.f10833d;
        r2Var.w(hVar);
        if (!hVar.f10809f.f9624l) {
            r2Var.v1(hVar);
            return;
        }
        l2 l2Var = (l2) this.f10838i;
        l2Var.getClass();
        n.b("JobResultProcessor", "Start: taskId: " + hVar);
        vj.d dVarW = ((r1) l2Var.f20100d).W();
        if (dVarW != null) {
            mk.g gVar = (mk.g) dVarW;
            gVar.f16869f = "";
            gVar.f16870g = 0L;
            gVar.d(new mk.f(0, hVar));
        }
    }

    @Override // hk.f
    public void f(long j, String str, vj.c cVar, boolean z10) throws JSONException {
        br.l.e(str, "jobName");
        br.l.e(cVar, "result");
        n.b("TaskScheduler", "[" + j + ':' + str + "] onResult()");
        if (z10) {
            l2 l2Var = (l2) this.f10838i;
            l2Var.getClass();
            n.b("JobResultProcessor", "Result: taskId: " + j + " id: " + str + " result: " + cVar);
            vj.d dVarW = ((r1) l2Var.f20100d).W();
            if (dVarW != null) {
                mk.g gVar = (mk.g) dVarW;
                df.c cVar2 = gVar.f16867d;
                String strH = cVar.h();
                if (strH.equals(gVar.f16869f)) {
                    n.b("JsonJobResultBinder", "Ignoring duplicate result for taskId: " + j + ", jobId: " + str);
                    return;
                }
                long j7 = gVar.f16870g + 50;
                cVar2.getClass();
                if (j7 > System.currentTimeMillis()) {
                    return;
                }
                gVar.f16870g = System.currentTimeMillis();
                gVar.f16869f = strH;
                gVar.d(new mk.e(1, j, str, strH));
            }
        }
    }

    public boolean g(h hVar) {
        al.g gVar = (al.g) this.f10836g;
        int i10 = 1;
        if (((a8.f) this.f10830a).f() || hVar.f10809f.f9624l) {
            if (gVar.k(hVar)) {
                n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " has completed. Ignore task."));
                return false;
            }
            if (!gVar.n(hVar)) {
                return true;
            }
            n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Is running. Ignore task."));
            return false;
        }
        n.b("TaskScheduler", "A more important SDK app is available. Disabling this one.");
        AtomicBoolean atomicBoolean = mj.g.f16855b;
        Context context = (Context) this.f10831b;
        n.b("SdkApi", "Stop SDK data collection");
        ch.l lVar = ch.l.f3962t5;
        lVar.k();
        Bundle bundle = new Bundle();
        ic.a.F(bundle, "EXECUTION_TYPE", cj.e.STOP_MONITORING);
        t.a(context, bundle);
        if (lVar.f3822h1 == null) {
            lVar.f3822h1 = new ApplicationLifecycleListener(lVar.d());
        }
        ApplicationLifecycleListener applicationLifecycleListener = lVar.f3822h1;
        if (applicationLifecycleListener == null) {
            br.l.l("_applicationLifecycleListener");
            throw null;
        }
        n.b("SdkApi", "unregisterAppLifecycleOwner");
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.E;
            br.l.c(processLifecycleOwner, "null cannot be cast to non-null type androidx.lifecycle.ProcessLifecycleOwner");
            lVar.c0().G(new cj.s(processLifecycleOwner, applicationLifecycleListener, i10));
            return false;
        } catch (Error e4) {
            n.c("SdkApi", "Error looking up ProcessLifecycleOwner: " + e4.getLocalizedMessage() + ". Is dependency missing!");
            return false;
        }
    }

    public void h(List list) {
        r2 r2Var = (r2) this.f10833d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (br.l.a(((h) obj).f10805b, hVar.f10805b)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            if (size > 1) {
                String str = "Task " + hVar.f10805b + " has " + size + " items, instead of 1";
                n.c("TaskScheduler", str);
                cj.a.F(str);
                r2Var.V0(hVar);
                r2Var.B(hVar);
            }
        }
    }

    public ak.t i() {
        String manufacturerCode;
        String str;
        String strValueOf;
        Integer numValueOf;
        String id2;
        h0 h0Var = (h0) this.f10839l;
        q3.a aVar = (q3.a) this.f10834e;
        ch.i iVar = (ch.i) this.f10833d;
        Context context = iVar.f3946a;
        com.squareup.picasso.s sVar = (com.squareup.picasso.s) this.f10840m;
        ag.b bVar = (ag.b) this.f10837h;
        ch.f fVar = (ch.f) ((b9.c) this.f10831b).f2478d;
        fj.g gVarB = ((dj.g) this.f10832c).b();
        ch.f fVar2 = gVarB.f8912a;
        TelephonyManager telephonyManager = gVarB.f8914c;
        q3.a aVar2 = (q3.a) this.f10835f;
        boolean zV0 = aVar2.v0("core");
        boolean zV02 = aVar2.v0("speeds");
        boolean zV03 = aVar2.v0("speeds_wifi");
        String strK = gVarB.f8916e.k(gVarB.j);
        String strN = ((om.f) this.f10841n).n("registration_key", null);
        u uVar = (u) this.f10838i;
        Double dValueOf = uVar.G.c() ? Double.valueOf(uVar.G.f721a) : null;
        Double dValueOf2 = uVar.G.c() ? Double.valueOf(uVar.G.f722b) : null;
        Integer numValueOf2 = sVar.l() > 0 ? Integer.valueOf(sVar.l()) : null;
        Integer numValueOf3 = sVar.j() > 0 ? Integer.valueOf(sVar.j()) : null;
        List listJ = ((a8.f) this.f10830a).j();
        br.l.d(Build.MODEL, "MODEL");
        br.l.d(Build.MANUFACTURER, "MANUFACTURER");
        if (fVar2.j() && gVarB.f8922m.hasSystemFeature("android.hardware.telephony.cdma")) {
            if (telephonyManager != null) {
                manufacturerCode = telephonyManager.getManufacturerCode();
                str = manufacturerCode;
            }
            str = null;
        } else {
            if (!fVar2.j() && fVar2.e() && telephonyManager != null) {
                manufacturerCode = telephonyManager.getManufacturerCode();
                str = manufacturerCode;
            }
            str = null;
        }
        String strValueOf2 = String.valueOf(iVar.a());
        if (telephonyManager == null) {
            strValueOf = "Unknown";
        } else {
            int phoneType = telephonyManager.getPhoneType();
            strValueOf = phoneType != 0 ? phoneType != 1 ? phoneType != 2 ? phoneType != 3 ? String.valueOf(telephonyManager.getPhoneType()) : "SIP" : "CDMA" : "GSM" : "None";
        }
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        String strValueOf3 = String.valueOf(System.currentTimeMillis());
        ak.b bVarW = ((bm.d) this.f10836g).w();
        String str2 = bVarW != null ? bVarW.f430d : "";
        String strA0 = aVar.A0();
        String typeAllocationCode = (!fVar2.e() || telephonyManager == null) ? null : telephonyManager.getTypeAllocationCode();
        String strValueOf4 = String.valueOf(((ak.g) aVar2.f20680g).f525b);
        if (tt.l.D0(iVar.f3947b)) {
            String packageName = context.getPackageName();
            br.l.d(packageName, "getPackageName(...)");
            iVar.f3947b = packageName;
        }
        String str3 = iVar.f3947b;
        String strValueOf5 = String.valueOf(iVar.b());
        boolean zI = bVar.i("android.permission.READ_PHONE_STATE");
        boolean zI2 = bVar.i("android.permission.READ_BASIC_PHONE_STATE");
        boolean zI3 = bVar.i("android.permission.ACCESS_FINE_LOCATION");
        boolean zI4 = bVar.i("android.permission.ACCESS_COARSE_LOCATION");
        boolean zI5 = bVar.i("android.permission.ACCESS_BACKGROUND_LOCATION");
        boolean zI6 = bVar.i("android.permission.ACCESS_WIFI_STATE");
        boolean zI7 = bVar.i("android.permission.ACCESS_NETWORK_STATE");
        boolean zI8 = bVar.i("android.permission.RECEIVE_BOOT_COMPLETED");
        boolean zI9 = bVar.i("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        long jD = -1;
        if (iVar.f3952g == -1) {
            try {
                jD = Build.VERSION.SDK_INT >= 28 ? i3.a.d(context.getPackageManager().getPackageInfo("com.google.android.gms", 0)) : r4.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            iVar.f3952g = jD;
        }
        int i10 = (int) iVar.f3952g;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        String simOperatorName = telephonyManager != null ? telephonyManager.getSimOperatorName() : null;
        int phoneCount = -1;
        if (fVar2.a() && telephonyManager != null) {
            phoneCount = telephonyManager.getPhoneCount();
        }
        Integer numValueOf4 = Integer.valueOf(phoneCount);
        String str4 = fVar.g() ? Build.SOC_MANUFACTURER : null;
        String str5 = fVar.g() ? Build.SOC_MODEL : null;
        String str6 = fVar.g() ? Build.SKU : null;
        String str7 = fVar.g() ? Build.ODM_SKU : null;
        String str8 = Build.TAGS;
        Long lY = df.c.y(Long.valueOf(((g0) this.j).x().totalMem));
        Long lY2 = df.c.y(ki.a.a(new bq.g(1, (ki.a) this.k, ki.a.class, "getTotalStorageBytesForPath", "getTotalStorageBytesForPath(Ljava/lang/String;)J", 0, 3)));
        String language = ((Locale) h0Var.f10078a).getLanguage();
        if (br.l.a(language, new Locale("iw").getLanguage())) {
            language = new Locale("he").getLanguage();
        } else if (br.l.a(language, new Locale("in").getLanguage())) {
            language = new Locale("id").getLanguage();
        } else if (br.l.a(language, new Locale("ji").getLanguage())) {
            language = new Locale("yi").getLanguage();
        }
        br.l.b(language);
        byte[] bytes = language.getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        String str9 = (bytes.length == 2 && h0.H(language)) ? language : null;
        String strY = h0Var.y();
        String property = System.getProperty("http.agent");
        br.l.d(Build.HARDWARE, "HARDWARE");
        try {
            numValueOf = Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
        } catch (Exception unused2) {
            numValueOf = null;
        }
        try {
            id2 = TimeZone.getDefault().getID();
        } catch (Exception unused3) {
            id2 = null;
        }
        return new ak.t(str, strValueOf2, strValueOf, networkOperator, simOperator, strValueOf3, str2, strA0, typeAllocationCode, strValueOf4, str3, listJ, strValueOf5, zI, zI2, zI3, zI4, zI5, zI6, zI7, zI8, zI9, zV0, zV02, zV03, strK, i10, dValueOf, dValueOf2, networkOperatorName, simOperatorName, numValueOf4, str4, str5, str6, str7, lY, lY2, str9, strY, property, numValueOf2, numValueOf3, strN, numValueOf, id2);
    }

    public void j(o oVar) {
        br.l.e(oVar, "triggerDataSource");
        synchronized (this.f10841n) {
            try {
                if (((p) ((r2) this.f10833d).f10472g).c().isEmpty()) {
                    ((AtomicBoolean) ((l2) this.f10839l).f20100d).set(false);
                }
                List<h> listM0 = mq.o.M0(((r2) this.f10833d).j0(), new dv.h(4));
                n.b("TaskScheduler", listM0.size() + " scheduled tasks found");
                h(listM0);
                for (h hVar : listM0) {
                    List list = hVar.f10807d;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (oVar.i1().contains(((ik.a) it.next()).a())) {
                                v(hVar, false, oVar.h1());
                                break;
                            }
                        }
                    }
                    n.b("TaskScheduler", "Task " + hVar.c() + " not interested in trigger " + oVar.i1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(m0 m0Var) {
        br.l.e(m0Var, "triggerReason");
        synchronized (this.f10841n) {
            try {
                if (((p) ((r2) this.f10833d).f10472g).c().isEmpty()) {
                    ((AtomicBoolean) ((l2) this.f10839l).f20100d).set(false);
                }
                List<h> listM0 = mq.o.M0(((r2) this.f10833d).t0(), new dv.h(5));
                h(listM0);
                n.b("TaskScheduler", listM0.size() + " scheduled tasks found");
                for (h hVar : listM0) {
                    if (hVar.f10809f.f9624l) {
                        n.b("TaskScheduler", hVar.c() + " ignoring as manual task");
                    } else {
                        v(hVar, false, m0Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(h hVar, boolean z10) {
        h hVarD = D(hVar);
        n.b("TaskScheduler", hVar.c() + " Executing immediately. Ignore delay " + z10);
        hVarD.Q = this;
        ((r2) this.f10833d).w(hVar);
        of.b bVar = (of.b) this.f10832c;
        n.b("TaskExecutor", c7.a.o(hVarD, new StringBuilder(), " Execute"));
        bVar.u(hVarD);
        ((r2) bVar.f19425x).s1(hVarD, true);
        ((d) bVar.f19421a).m(hVarD, z10);
    }

    public void m(h hVar) {
        int i10;
        h hVarD = D(hVar);
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Executing later"));
        hVarD.Q = this;
        of.b bVar = (of.b) this.f10832c;
        n.b("TaskExecutor", c7.a.o(hVarD, new StringBuilder(), " Execute with schedule"));
        r2 r2Var = (r2) bVar.f19425x;
        r2Var.s1(hVarD, true);
        if (!((ak.g) ((q3.a) bVar.B).f20680g).f529f.f449a.f492w) {
            ((d) bVar.f19424r).m(hVarD, false);
        } else if (hVarD.f10809f.b()) {
            List listC = ((p) r2Var.f10472g).c();
            if (listC.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = listC.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((h) it.next()).f10809f.b() && (i10 = i10 + 1) < 0) {
                        e5.P();
                        throw null;
                    }
                }
            }
            n.b("TaskExecutor", hVarD.c() + " totalLongRunningTasks: " + i10);
            if (i10 == 0) {
                n.b("TaskExecutor", c7.a.o(hVarD, new StringBuilder(), " Start long running pipeline."));
                ((d) bVar.f19423g).m(hVarD, false);
            }
        }
        if (!al.g.b(hVarD)) {
            ((d) bVar.f19422d).m(hVarD, false);
            return;
        }
        bVar.u(hVarD);
        r2Var.w(hVarD);
        ((d) bVar.f19421a).m(hVarD, false);
    }

    public String n() {
        String str = (String) this.f10839l;
        String str2 = "-32768";
        String str3 = (str == null || str.matches(".*[\\[,\\]].*")) ? "-32768" : (String) this.f10839l;
        String str4 = (String) this.f10840m;
        if (str4 != null && !str4.matches(".*[\\[,\\]].*")) {
            str2 = (String) this.f10840m;
        }
        return "[" + str3 + "," + str2 + "]";
    }

    public void o(h hVar, boolean z10) {
        ((AtomicBoolean) ((l2) this.f10839l).f20100d).set(false);
        if (!z10 || hVar.f10809f.f9624l) {
            return;
        }
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Update last intensive task execution time"));
        r2 r2Var = (r2) this.f10833d;
        ((om.f) r2Var.f10474x).t(System.currentTimeMillis(), "last_intensive_task_run_time");
    }

    public void p() {
        o0 o0VarA;
        List<h> listC = ((p) ((r2) this.f10833d).f10472g).c();
        n.b("TaskScheduler", listC.size() + " running tasks found");
        for (h hVar : listC) {
            br.l.e(hVar, "task");
            Iterator it = hVar.f10808e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    n.b("TriggerChecker", c7.a.o(hVar, new StringBuilder(), " Ignore interruption"));
                    o0VarA = null;
                    break;
                }
                ik.a aVar = (ik.a) it.next();
                n.b("TriggerChecker", hVar.c() + " Interrupt: " + aVar.getClass().getSimpleName());
                if (aVar.b(hVar)) {
                    n.b("TriggerChecker", c7.a.o(hVar, new StringBuilder(), " Interrupting trigger"));
                    o0VarA = aVar.a();
                    break;
                }
            }
            if (o0VarA != null) {
                n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Interrupted"));
                hVar.Q = this;
                n.b("TaskKlass", hVar.c() + " Interrupting task " + hVar.f10805b + " (id: " + hVar.f10804a + ") due to trigger: " + o0VarA);
                if (hVar.I) {
                    hVar.G.h(new fh.e("TASK_INTERRUPTED", new fh.d[]{new fh.d(o0VarA.name(), "INTERRUPTION_TRIGGER")}, hVar.a(), 0));
                }
                hVar.k(true);
                z(hVar);
                hVar.Q = null;
            }
        }
    }

    public void q(boolean z10) {
        of.b bVar = (of.b) this.f10832c;
        n.b("TaskScheduler", "releaseCurrentlyRunningTasks() called");
        r2 r2Var = (r2) this.f10833d;
        for (h hVar : ((p) r2Var.f10472g).c()) {
            if (!z10) {
                br.l.e(hVar, "task");
                if (System.currentTimeMillis() - hVar.f10809f.f9620f > 3600000) {
                }
            }
            hVar.getClass();
            hVar.N = m.UNSCHEDULED;
            bVar.v(hVar);
            r2Var.T0(bVar.y(hVar));
        }
    }

    public void r(ArrayList arrayList, ArrayList arrayList2) {
        StringBuilder sb2 = new StringBuilder("removeOldTasks() called with: tasks = ");
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((h) it.next()).f10805b);
        }
        sb2.append(arrayList3);
        n.b("TaskScheduler", sb2.toString());
        StringBuilder sb3 = new StringBuilder("removeOldTasks() called with: scheduledTasks = ");
        ArrayList arrayList4 = new ArrayList(mq.p.a0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((h) it2.next()).f10805b);
        }
        sb3.append(arrayList4);
        n.b("TaskScheduler", sb3.toString());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            h hVar = (h) it3.next();
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (br.l.a(((h) it4.next()).f10805b, hVar.f10805b)) {
                        break;
                    }
                }
            }
            n.b("TaskScheduler", w.g.j(new StringBuilder(), hVar.f10805b, " not found. Removing."));
            s(hVar);
        }
    }

    public void s(h hVar) {
        n.b("TaskScheduler", "removeScheduledTask() called with: task = " + hVar.f10805b);
        ((of.b) this.f10832c).v(hVar);
        ((r2) this.f10833d).V0(hVar);
        dj.g gVar = (dj.g) this.f10837h;
        gVar.e(hVar.f10807d, false);
        gVar.e(hVar.f10808e, false);
    }

    public void t(h hVar) {
        ArrayList arrayListT0 = ((r2) this.f10833d).t0();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListT0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h hVar2 = (h) next;
            if (!br.l.a(hVar2.f10805b, hVar.f10805b) && hVar2.f10820s) {
                arrayList.add(next);
            }
        }
        Iterator it2 = mq.o.M0(arrayList, new dv.h(6)).iterator();
        while (it2.hasNext()) {
            v((h) it2.next(), false, m0.SCHEDULE_INTENSIVE_TASK_TRIGGER);
        }
    }

    public void u(h hVar) {
        bm.d dVar = (bm.d) this.k;
        gk.c cVar = hVar.f10809f;
        dVar.F(cVar).getClass();
        br.l.e(cVar, "schedule");
        n.b("ScheduleMechanism", "Get initial schedule");
        n.b("ScheduleMechanism", "currentExecutionCount: " + cVar.j);
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVarB = h.b(hVar, 0L, null, gk.c.a(cVar, jCurrentTimeMillis, 0L, 0L, jCurrentTimeMillis + cVar.f9617c, 0, false, 7549), null, null, false, null, -33);
        n.b("TaskScheduler", c7.a.o(hVarB, new StringBuilder(), " Schedule pre configured task"));
        v(hVarB, false, m0.SCHEDULE_PRECONFIGURED_TASK_TRIGGER);
    }

    public void v(h hVar, boolean z10, m0 m0Var) {
        br.l.e(hVar, "task");
        br.l.e(m0Var, "triggerReason");
        n.b("TaskScheduler", "scheduleTask() called with: task  " + hVar.f10805b + " , TriggerType: " + m0Var + " , reschedule: " + z10);
        synchronized (this.f10841n) {
            try {
                if (g(hVar)) {
                    r2 r2Var = (r2) this.f10840m;
                    long j = hVar.f10804a;
                    String reason = m0Var.getReason();
                    br.l.e(reason, "triggerType");
                    synchronized (((HashMap) r2Var.f10473r)) {
                        ((HashMap) r2Var.f10473r).put(Long.valueOf(j), reason);
                    }
                    if (!hVar.f10809f.f9624l) {
                        if (((r2) this.f10833d).C0(hVar)) {
                            n.b("TaskScheduler", hVar.c() + " Task is already scheduled.");
                        } else {
                            n.b("TaskScheduler", hVar.c() + " Task is not scheduled. Schedule.");
                            ((r2) this.f10833d).B(hVar);
                        }
                    }
                    e eVarG = ((al.g) this.f10836g).g(hVar, z10, m0Var);
                    switch (j.f10829a[eVarG.ordinal()]) {
                        case 1:
                            h hVarB = h.b(hVar, 0L, null, null, null, null, false, null, -1);
                            hVarB.N = m.WAITING_FOR_TRIGGERS;
                            ((r2) this.f10833d).v1(hVarB);
                            break;
                        case 2:
                            l(hVar, false);
                            break;
                        case 3:
                            l(hVar, true);
                            break;
                        case 4:
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            m(hVar);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            n.b("TaskScheduler", hVar.c() + " Do nothing. State: " + eVarG);
                            break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean w(int i10, h hVar) {
        String strC = hVar.c();
        if (i10 == -1) {
            n.b("TaskScheduler", w.g.f(strC, " won't reschedule. currentRunCount is NOT_EXECUTED"));
            return false;
        }
        if (hVar.N == m.UNSCHEDULED) {
            n.b("TaskScheduler", w.g.f(strC, " won't reschedule. task.state is UNSCHEDULED"));
            return false;
        }
        gk.c cVar = hVar.f10809f;
        boolean z10 = cVar.f9624l;
        int i11 = cVar.f9619e;
        if (z10) {
            n.b("TaskScheduler", w.g.f(strC, " won't reschedule. manual execution is true"));
            return false;
        }
        if (i11 == -1) {
            n.b("TaskScheduler", w.g.f(strC, " will reschedule. repeatCount is REPEAT_COUNT_CONTINUOUS"));
            return true;
        }
        if (cVar.k) {
            n.b("TaskScheduler", w.g.f(strC, " will reschedule. schedule.rescheduleForTriggers is true"));
            return true;
        }
        if (i11 == 0) {
            n.b("TaskScheduler", w.g.f(strC, " won't reschedule. schedule.repeatCount is 0"));
            return false;
        }
        int iK0 = ((r2) this.f10833d).k0(hVar);
        boolean z11 = i11 > iK0;
        n.b("TaskScheduler", strC + " repeatCount: " + i11);
        n.b("TaskScheduler", strC + " executionCount: " + iK0);
        n.b("TaskScheduler", strC + " shouldRescheduleTask : " + z11);
        return z11;
    }

    public void z(h hVar) {
        n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Stop"));
        ((of.b) this.f10832c).v(hVar);
    }
}
