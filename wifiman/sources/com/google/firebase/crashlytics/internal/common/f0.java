package com.google.firebase.crashlytics.internal.common;

import N4.F;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final C f38776a;

    /* renamed from: b, reason: collision with root package name */
    private final Q4.e f38777b;

    /* renamed from: c, reason: collision with root package name */
    private final R4.b f38778c;

    /* renamed from: d, reason: collision with root package name */
    private final M4.f f38779d;

    /* renamed from: e, reason: collision with root package name */
    private final M4.o f38780e;

    /* renamed from: f, reason: collision with root package name */
    private final L f38781f;

    /* renamed from: g, reason: collision with root package name */
    private final L4.f f38782g;

    f0(C c10, Q4.e eVar, R4.b bVar, M4.f fVar, M4.o oVar, L l10, L4.f fVar2) {
        this.f38776a = c10;
        this.f38777b = eVar;
        this.f38778c = bVar;
        this.f38779d = fVar;
        this.f38780e = oVar;
        this.f38781f = l10;
        this.f38782g = fVar2;
    }

    private F.e.d d(F.e.d dVar, M4.f fVar, M4.o oVar) {
        return e(dVar, fVar, oVar, Collections.emptyMap());
    }

    private F.e.d e(F.e.d dVar, M4.f fVar, M4.o oVar, Map map) {
        F.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(F.e.d.AbstractC0579d.a().b(strC).a());
        } else {
            I4.g.f().i("No log data to include with this event.");
        }
        List listO = o(oVar.f(map));
        List listO2 = o(oVar.g());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private F.e.d f(F.e.d dVar, Map map) {
        return g(e(dVar, this.f38779d, this.f38780e, map), this.f38780e);
    }

    private F.e.d g(F.e.d dVar, M4.o oVar) {
        List listH = oVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        F.e.d.b bVarH = dVar.h();
        bVarH.e(F.e.d.f.a().b(listH).a());
        return bVarH.a();
    }

    private static F.a h(ApplicationExitInfo applicationExitInfo) throws IOException {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            I4.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static f0 j(Context context, L l10, Q4.g gVar, C5099a c5099a, M4.f fVar, M4.o oVar, T4.d dVar, S4.j jVar, Q q10, C5111m c5111m, L4.f fVar2) {
        return new f0(new C(context, l10, c5099a, dVar, jVar), new Q4.e(gVar, jVar, c5111m), R4.b.b(context, jVar, q10), fVar, oVar, l10, fVar2);
    }

    private D k(D d10) {
        if (d10.b().h() != null && d10.b().g() != null) {
            return d10;
        }
        K kD = this.f38781f.d(true);
        return D.a(d10.b().t(kD.b()).s(kD.a()), d10.d(), d10.c());
    }

    private ApplicationExitInfo n(String str, List list) {
        long jQ = this.f38777b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = S.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.e0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f0.q((F.c) obj, (F.c) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int q(F.c cVar, F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(F.e.d dVar, M4.c cVar, boolean z10) {
        I4.g.f().b("disk worker: log non-fatal event to persistence");
        this.f38777b.y(dVar, cVar.b(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(Task task) {
        if (!task.isSuccessful()) {
            I4.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        D d10 = (D) task.getResult();
        I4.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + d10.d());
        File fileC = d10.c();
        if (fileC.delete()) {
            I4.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        I4.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void v(Throwable th2, Thread thread, String str, final M4.c cVar, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final F.e.d dVarF = f(this.f38776a.d(th2, thread, str, cVar.c(), 4, 8, z10), cVar.a());
        if (z10) {
            this.f38777b.y(dVarF, cVar.b(), zEquals);
        } else {
            this.f38782g.f11230b.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38766a.r(dVarF, cVar, zEquals);
                }
            });
        }
    }

    public Task A(Executor executor) {
        return B(executor, null);
    }

    public Task B(Executor executor, String str) {
        List<D> listW = this.f38777b.w();
        ArrayList arrayList = new ArrayList();
        for (D d10 : listW) {
            if (str == null || str.equals(d10.d())) {
                arrayList.add(this.f38778c.c(k(d10), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.d0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f38770a.u(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void l(String str, List list, F.a aVar) {
        I4.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b bVarC = ((O) it.next()).c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        this.f38777b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j10, String str) {
        this.f38777b.k(str, j10);
    }

    public boolean p() {
        return this.f38777b.r();
    }

    public SortedSet s() {
        return this.f38777b.p();
    }

    public void t(String str, long j10) {
        this.f38777b.z(this.f38776a.e(str, j10));
    }

    public void w(Throwable th2, Thread thread, String str, long j10) {
        I4.g.f().i("Persisting fatal event for session " + str);
        v(th2, thread, "crash", new M4.c(str, j10), true);
    }

    public void x(Throwable th2, Thread thread, M4.c cVar) {
        I4.g.f().i("Persisting non-fatal event for session " + cVar.b());
        v(th2, thread, "error", cVar, false);
    }

    public void y(String str, List list, M4.f fVar, M4.o oVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            I4.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d dVarC = this.f38776a.c(h(applicationExitInfoN));
        I4.g.f().b("Persisting anr for session " + str);
        this.f38777b.y(g(d(dVarC, fVar, oVar), oVar), str, true);
    }

    public void z() {
        this.f38777b.i();
    }
}
