package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import d2.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l2.g;
import l2.h;
import l2.p;
import l2.q;
import l2.t;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4522a = k.f("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f23092a, pVar.f23094c, num, pVar.f23093b.name(), str, str2);
    }

    public static String c(l2.k kVar, t tVar, h hVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g gVarA = hVar.a(pVar.f23092a);
            sb.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f23092a)), gVarA != null ? Integer.valueOf(gVarA.f23070b) : null, TextUtils.join(",", tVar.b(pVar.f23092a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase workDatabaseO = j.k(getApplicationContext()).o();
        q qVarB = workDatabaseO.B();
        l2.k kVarZ = workDatabaseO.z();
        t tVarC = workDatabaseO.C();
        h hVarY = workDatabaseO.y();
        List listC = qVarB.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listQ = qVarB.q();
        List listJ = qVarB.j(200);
        if (listC != null && !listC.isEmpty()) {
            k kVarC = k.c();
            String str = f4522a;
            kVarC.d(str, "Recently completed work:\n\n", new Throwable[0]);
            k.c().d(str, c(kVarZ, tVarC, hVarY, listC), new Throwable[0]);
        }
        if (listQ != null && !listQ.isEmpty()) {
            k kVarC2 = k.c();
            String str2 = f4522a;
            kVarC2.d(str2, "Running work:\n\n", new Throwable[0]);
            k.c().d(str2, c(kVarZ, tVarC, hVarY, listQ), new Throwable[0]);
        }
        if (listJ != null && !listJ.isEmpty()) {
            k kVarC3 = k.c();
            String str3 = f4522a;
            kVarC3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            k.c().d(str3, c(kVarZ, tVarC, hVarY, listJ), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
