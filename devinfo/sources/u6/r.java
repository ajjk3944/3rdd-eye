package u6;

import a0.q0;
import a0.x0;
import al.z0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.z3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.t1;
import t5.f0;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends i0 {

    /* renamed from: n, reason: collision with root package name */
    public static r f35172n;

    /* renamed from: o, reason: collision with root package name */
    public static r f35173o;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f35174p;

    /* renamed from: d, reason: collision with root package name */
    public final Context f35175d;

    /* renamed from: e, reason: collision with root package name */
    public final t6.b f35176e;

    /* renamed from: f, reason: collision with root package name */
    public final WorkDatabase f35177f;
    public final d7.a g;

    /* renamed from: h, reason: collision with root package name */
    public final List f35178h;

    /* renamed from: i, reason: collision with root package name */
    public final c f35179i;
    public final o7.d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35180k = false;

    /* renamed from: l, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f35181l;

    /* renamed from: m, reason: collision with root package name */
    public final z6.l f35182m;

    static {
        t6.v.g("WorkManagerImpl");
        f35172n = null;
        f35173o = null;
        f35174p = new Object();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public r(Context context, final t6.b bVar, d7.a aVar, final WorkDatabase workDatabase, final List list, c cVar, z6.l lVar) {
        int i4 = 0;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && j4.n(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        t6.v vVar = new t6.v(bVar.f34318h);
        synchronized (t6.v.f34398b) {
            try {
                if (t6.v.f34399c == null) {
                    t6.v.f34399c = vVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35175d = applicationContext;
        this.g = aVar;
        this.f35177f = workDatabase;
        this.f35179i = cVar;
        this.f35182m = lVar;
        this.f35176e = bVar;
        this.f35178h = list;
        x0 x0Var = (x0) aVar;
        xk.r rVar = (xk.r) x0Var.f145b;
        nk.k.d(rVar, "getTaskCoroutineDispatcher(...)");
        cl.d dVarB = xk.x.b(rVar);
        this.j = new o7.d(7, workDatabase);
        final c7.l lVar2 = (c7.l) x0Var.f148e;
        String str = g.f35151a;
        cVar.a(new a() { // from class: u6.f
            @Override // u6.a
            public final void e(b7.l lVar3, boolean z3) {
                lVar2.execute(new ci.a(list, lVar3, bVar, workDatabase, 23));
            }
        });
        ((c7.l) x0Var.f148e).execute(new c7.d(applicationContext, this));
        String str2 = k.f35158a;
        if (c7.k.a(applicationContext, bVar)) {
            t5.s sVar = workDatabase.w().f2066a;
            q0 q0Var = new q0(27);
            t5.g gVarF = sVar.f();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            nk.k.e(strArr, "tables");
            f0 f0Var = gVarF.f34236b;
            f0Var.getClass();
            ak.j jVar = new ak.j();
            for (String str3 : strArr) {
                LinkedHashMap linkedHashMap = f0Var.f34228c;
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                nk.k.d(lowerCase, "toLowerCase(...)");
                Set set = (Set) linkedHashMap.get(lowerCase);
                if (set != null) {
                    jVar.addAll(set);
                } else {
                    jVar.add(str3);
                }
            }
            String[] strArr2 = (String[]) com.bumptech.glide.d.c(jVar).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                String str4 = strArr2[i10];
                LinkedHashMap linkedHashMap2 = f0Var.f34231f;
                String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                nk.k.d(lowerCase2, "toLowerCase(...)");
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num == null) {
                    throw new IllegalArgumentException("There is no table with name ".concat(str4));
                }
                iArr[i10] = num.intValue();
            }
            yj.i iVar = new yj.i(strArr2, iArr);
            ?? r42 = (String[]) iVar.f37638a;
            int[] iArr2 = (int[]) iVar.f37639b;
            nk.k.e(r42, "resolvedTableNames");
            nk.k.e(iArr2, "tableIds");
            ck.c cVar2 = null;
            xk.x.v(dVarB, null, null, new al.k(new al.v(z0.i(z0.f(new al.a0(new v5.h(z0.f(new al.f0(new al.m(f0Var, iArr2, (Serializable) r42, cVar2, 9)), -1), sVar, q0Var), new i(4, null), i4), -1)), new j(applicationContext, null), 3), cVar2, i4), 3);
        }
    }

    public static r C() {
        synchronized (f35174p) {
            try {
                r rVar = f35172n;
                if (rVar != null) {
                    return rVar;
                }
                return f35173o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static r D(Context context) {
        r rVarC;
        synchronized (f35174p) {
            try {
                rVarC = C();
                if (rVarC == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVarC;
    }

    public final t6.c0 A() {
        t6.x xVar = this.f35176e.f34322m;
        c7.l lVar = (c7.l) ((x0) this.g).f148e;
        nk.k.d(lVar, "getSerialTaskExecutor(...)");
        return pd.b.l(xVar, "CancelAllWork", lVar, new c7.b(this, 0));
    }

    public final t6.c0 B(String str) {
        t6.x xVar = this.f35176e.f34322m;
        String strConcat = "CancelWorkByTag_".concat(str);
        c7.l lVar = (c7.l) ((x0) this.g).f148e;
        nk.k.d(lVar, "getSerialTaskExecutor(...)");
        return pd.b.l(xVar, strConcat, lVar, new c0.p(2, this, str));
    }

    public final h3.k E() {
        WorkDatabase workDatabase = this.f35177f;
        nk.k.e(workDatabase, "<this>");
        d7.a aVar = this.g;
        nk.k.e(aVar, "executor");
        b7.w wVar = new b7.w(4);
        c7.l lVar = (c7.l) ((x0) aVar).f148e;
        nk.k.d(lVar, "getSerialTaskExecutor(...)");
        return t1.i(lVar, "loadStatusFuture", new c0.p(4, wVar, workDatabase));
    }

    public final void F() {
        synchronized (f35174p) {
            try {
                this.f35180k = true;
                BroadcastReceiver.PendingResult pendingResult = this.f35181l;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f35181l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void G() {
        t6.x xVar = this.f35176e.f34322m;
        c7.b bVar = new c7.b(this, 1);
        nk.k.e(xVar, "<this>");
        boolean zP = z3.p();
        if (zP) {
            try {
                Trace.beginSection(z3.w("ReschedulingWork"));
            } finally {
                if (zP) {
                    Trace.endSection();
                }
            }
        }
        bVar.invoke();
    }
}
