package O4;

import N7.G8;
import Q4.A;
import Q4.K;
import Q4.L;
import Q4.V;
import Q4.W;
import Q4.X;
import Q4.Y;
import Q4.f0;
import Q9.C1553s;
import U4.c.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import v3.C5677c;
import w3.C5719a;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final G f10283a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.c f10284b;

    /* renamed from: c, reason: collision with root package name */
    public final U4.a f10285c;

    /* renamed from: d, reason: collision with root package name */
    public final P4.e f10286d;

    /* renamed from: e, reason: collision with root package name */
    public final P4.o f10287e;

    /* renamed from: f, reason: collision with root package name */
    public final P f10288f;

    public T(G g10, T4.c cVar, U4.a aVar, P4.e eVar, P4.o oVar, P p10) {
        this.f10283a = g10;
        this.f10284b = cVar;
        this.f10285c = aVar;
        this.f10286d = eVar;
        this.f10287e = oVar;
        this.f10288f = p10;
    }

    public static Q4.K a(Q4.K k10, P4.e eVar, P4.o oVar) {
        f0.e.d.a.b bVar;
        K.a aVarG = k10.g();
        String strB = eVar.f10611b.b();
        if (strB != null) {
            aVarG.f11054e = new V(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List<f0.c> listD = d(oVar.f10646d.f10650a.getReference().a());
        List<f0.c> listD2 = d(oVar.f10647e.f10650a.getReference().a());
        if (!listD.isEmpty() || !listD2.isEmpty()) {
            L.a aVarH = k10.f11046c.h();
            aVarH.f11065b = listD;
            aVarH.f11066c = listD2;
            if (aVarH.f11071h != 1 || (bVar = aVarH.f11064a) == null) {
                StringBuilder sb = new StringBuilder();
                if (aVarH.f11064a == null) {
                    sb.append(" execution");
                }
                if ((aVarH.f11071h & 1) == 0) {
                    sb.append(" uiOrientation");
                }
                throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
            }
            aVarG.f11052c = new Q4.L(bVar, listD, listD2, aVarH.f11067d, aVarH.f11068e, aVarH.f11069f, aVarH.f11070g);
        }
        return aVarG.a();
    }

    public static f0.e.d b(Q4.K k10, P4.o oVar) {
        List<P4.k> listA = oVar.f10648f.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            P4.k kVar = listA.get(i);
            W.a aVar = new W.a();
            String strE = kVar.e();
            if (strE == null) {
                throw new NullPointerException("Null variantId");
            }
            String strC = kVar.c();
            if (strC == null) {
                throw new NullPointerException("Null rolloutId");
            }
            aVar.f11130a = new X(strC, strE);
            String strA = kVar.a();
            if (strA == null) {
                throw new NullPointerException("Null parameterKey");
            }
            aVar.f11131b = strA;
            String strB = kVar.b();
            if (strB == null) {
                throw new NullPointerException("Null parameterValue");
            }
            aVar.f11132c = strB;
            aVar.f11133d = kVar.d();
            aVar.f11134e = (byte) (aVar.f11134e | 1);
            arrayList.add(aVar.a());
        }
        if (arrayList.isEmpty()) {
            return k10;
        }
        K.a aVarG = k10.g();
        aVarG.f11055f = new Y(arrayList);
        return aVarG.a();
    }

    public static T c(Context context, P p10, T4.e eVar, C1455a c1455a, P4.e eVar2, P4.o oVar, C1553s c1553s, V4.e eVar3, C1471q c1471q, C1465k c1465k) {
        G g10 = new G(context, p10, c1455a, c1553s, eVar3);
        T4.c cVar = new T4.c(eVar, eVar3, c1465k);
        R4.a aVar = U4.a.f12467b;
        y3.u.b(context);
        return new T(g10, cVar, new U4.a(new U4.c(y3.u.a().c(new C5719a(U4.a.f12468c, U4.a.f12469d)).a("FIREBASE_CRASHLYTICS_REPORT", new C5677c("json"), U4.a.f12470e), eVar3.b(), c1471q)), eVar2, oVar, p10);
    }

    public static List<f0.c> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new NullPointerException("Null key");
            }
            String value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new Q4.D(key, value));
        }
        Collections.sort(arrayList, new B2.d(1));
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(Throwable th, Thread thread, String str, String str2, long j4, boolean z10) {
        C1553s c1553s;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean zEquals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        G g10 = this.f10283a;
        Context context = g10.f10251a;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        E3.m mVar = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            c1553s = g10.f10254d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            mVar = new E3.m(th2.getLocalizedMessage(), th2.getClass().getName(), c1553s.c(th2.getStackTrace()), mVar);
        }
        K.a aVar = new K.a();
        aVar.f11051b = str2;
        aVar.f11050a = j4;
        aVar.f11056g = (byte) (aVar.f11056g | 1);
        f0.e.d.a.c cVarC = L4.h.f4062a.c(context);
        Boolean boolValueOf = cVarC.a() > 0 ? Boolean.valueOf(cVarC.a() != 100) : null;
        ArrayList arrayListB = L4.h.b(context);
        byte b11 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) mVar.f1418d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        Boolean bool = boolValueOf;
        byte b12 = (byte) 1;
        List listD = G.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b12 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b12 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
        arrayList.add(new Q4.Q(4, name, listD));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b10 = b12;
                } else {
                    StackTraceElement[] stackTraceElementArrC = c1553s.c(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listD2 = G.d(stackTraceElementArrC, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b12 != 1) {
                        byte b13 = b12;
                        StringBuilder sb2 = new StringBuilder();
                        if (b13 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(G8.t(sb2, "Missing required properties:"));
                    }
                    b10 = b12;
                    arrayList.add(new Q4.Q(0, name2, listD2));
                }
                it2 = it;
                b12 = b10;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Q4.O oC = G.c(mVar, 0);
        Q4.P pE = G.e();
        List<f0.e.d.a.b.AbstractC0138a> listA = g10.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        Q4.M m10 = new Q4.M(listUnmodifiableList, oC, null, pE, listA);
        if (b11 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b11 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(G8.t(sb3, "Missing required properties:"));
        }
        aVar.f11052c = new Q4.L(m10, null, null, bool, cVarC, arrayListB, i);
        aVar.f11053d = g10.b(i);
        Q4.K kA = aVar.a();
        P4.e eVar = this.f10286d;
        P4.o oVar = this.f10287e;
        this.f10284b.d(b(a(kA, eVar, oVar), oVar), str, zEquals);
    }

    public final Task f(String str, ExecutorService executorService) {
        TaskCompletionSource<H> taskCompletionSource;
        ArrayList arrayListB = this.f10284b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                R4.a aVar = T4.c.f12276g;
                String strE = T4.c.e(file);
                aVar.getClass();
                arrayList.add(new C1456b(R4.a.i(strE), file.getName(), file));
            } catch (IOException e4) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e4);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            H c1456b = (H) it2.next();
            if (str == null || str.equals(c1456b.c())) {
                U4.a aVar2 = this.f10285c;
                boolean z10 = true;
                if (c1456b.a().f() == null || c1456b.a().e() == null) {
                    O oB = this.f10288f.b(true);
                    A.a aVarM = c1456b.a().m();
                    aVarM.f10964e = oB.f10272a;
                    A.a aVarM2 = aVarM.a().m();
                    aVarM2.f10965f = oB.f10273b;
                    c1456b = new C1456b(aVarM2.a(), c1456b.c(), c1456b.b());
                }
                boolean z11 = str != null;
                U4.c cVar = aVar2.f12471a;
                synchronized (cVar.f12481f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource<>();
                        if (z11) {
                            ((AtomicInteger) cVar.i.f10322b).getAndIncrement();
                            if (cVar.f12481f.size() >= cVar.f12480e) {
                                z10 = false;
                            }
                            if (z10) {
                                L4.e eVar = L4.e.f4061a;
                                eVar.b("Enqueueing report: " + c1456b.c());
                                eVar.b("Queue size: " + cVar.f12481f.size());
                                cVar.f12482g.execute(cVar.new a(c1456b, taskCompletionSource));
                                eVar.b("Closing task for report: " + c1456b.c());
                                taskCompletionSource.trySetResult(c1456b);
                            } else {
                                cVar.a();
                                String str2 = "Dropping report due to queue being full: " + c1456b.c();
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) cVar.i.f10323c).getAndIncrement();
                                taskCompletionSource.trySetResult(c1456b);
                            }
                        } else {
                            cVar.b(c1456b, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executorService, new B.d(this, 10)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
