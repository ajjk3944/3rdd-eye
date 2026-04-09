package m2;

import android.text.TextUtils;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.m;
import java.util.List;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f23382c = androidx.work.k.f("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final d2.g f23383a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.c f23384b = new d2.c();

    public b(d2.g gVar) {
        this.f23383a = gVar;
    }

    public static boolean b(d2.g gVar) {
        boolean zC = c(gVar.g(), gVar.f(), (String[]) d2.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0134 A[PHI: r0 r8 r11 r12 r13
  0x0134: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v13 java.lang.String[])
  (r0v13 java.lang.String[])
 binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0133, B:79:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0133, B:79:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0133, B:79:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0133, B:79:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0133, B:79:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(d2.j r16, java.util.List r17, java.lang.String[] r18, java.lang.String r19, androidx.work.ExistingWorkPolicy r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.b.c(d2.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    public static boolean e(d2.g gVar) {
        List<d2.g> listE = gVar.e();
        boolean z10 = false;
        if (listE != null) {
            boolean zE = false;
            for (d2.g gVar2 : listE) {
                if (gVar2.j()) {
                    androidx.work.k.c().h(f23382c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    zE |= e(gVar2);
                }
            }
            z10 = zE;
        }
        return b(gVar) | z10;
    }

    public static void g(l2.p pVar) {
        androidx.work.b bVar = pVar.f23101j;
        String str = pVar.f23094c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            d.a aVar = new d.a();
            aVar.c(pVar.f23096e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f23094c = ConstraintTrackingWorker.class.getName();
            pVar.f23096e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase workDatabaseO = this.f23383a.g().o();
        workDatabaseO.c();
        try {
            boolean zE = e(this.f23383a);
            workDatabaseO.r();
            return zE;
        } finally {
            workDatabaseO.g();
        }
    }

    public androidx.work.m d() {
        return this.f23384b;
    }

    public void f() {
        d2.j jVarG = this.f23383a.g();
        d2.f.b(jVarG.i(), jVarG.o(), jVarG.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f23383a.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f23383a));
            }
            if (a()) {
                g.a(this.f23383a.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f23384b.a(androidx.work.m.f4528a);
        } catch (Throwable th) {
            this.f23384b.a(new m.b.a(th));
        }
    }
}
