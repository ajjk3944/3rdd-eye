package d2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.k;
import androidx.work.m;
import androidx.work.o;
import androidx.work.r;
import g2.l;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class j extends r {

    /* renamed from: j, reason: collision with root package name */
    public static final String f20690j = androidx.work.k.f("WorkManagerImpl");

    /* renamed from: k, reason: collision with root package name */
    public static j f20691k = null;

    /* renamed from: l, reason: collision with root package name */
    public static j f20692l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f20693m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Context f20694a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.work.a f20695b;

    /* renamed from: c, reason: collision with root package name */
    public WorkDatabase f20696c;

    /* renamed from: d, reason: collision with root package name */
    public o2.a f20697d;

    /* renamed from: e, reason: collision with root package name */
    public List f20698e;

    /* renamed from: f, reason: collision with root package name */
    public d f20699f;

    /* renamed from: g, reason: collision with root package name */
    public m2.h f20700g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20701h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f20702i;

    public j(Context context, androidx.work.a aVar, o2.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(o.workmanager_test_configuration));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f20693m) {
            try {
                j jVar = f20691k;
                if (jVar != null && f20692l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (jVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f20692l == null) {
                        f20692l = new j(applicationContext, aVar, new o2.b(aVar.l()));
                    }
                    f20691k = f20692l;
                }
            } finally {
            }
        }
    }

    public static j j() {
        synchronized (f20693m) {
            try {
                j jVar = f20691k;
                if (jVar != null) {
                    return jVar;
                }
                return f20692l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static j k(Context context) {
        j jVarJ;
        synchronized (f20693m) {
            try {
                jVarJ = j();
                if (jVarJ == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVarJ;
    }

    @Override // androidx.work.r
    public m a(String str) {
        m2.a aVarD = m2.a.d(str, this);
        this.f20697d.b(aVarD);
        return aVarD.e();
    }

    @Override // androidx.work.r
    public m c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public m f(UUID uuid) {
        m2.a aVarB = m2.a.b(uuid, this);
        this.f20697d.b(aVarB);
        return aVarB.e();
    }

    public List g(Context context, androidx.work.a aVar, o2.a aVar2) {
        return Arrays.asList(f.a(context, this), new e2.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f20694a;
    }

    public androidx.work.a i() {
        return this.f20695b;
    }

    public m2.h l() {
        return this.f20700g;
    }

    public d m() {
        return this.f20699f;
    }

    public List n() {
        return this.f20698e;
    }

    public WorkDatabase o() {
        return this.f20696c;
    }

    public o2.a p() {
        return this.f20697d;
    }

    public final void q(Context context, androidx.work.a aVar, o2.a aVar2, WorkDatabase workDatabase, List list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20694a = applicationContext;
        this.f20695b = aVar;
        this.f20697d = aVar2;
        this.f20696c = workDatabase;
        this.f20698e = list;
        this.f20699f = dVar;
        this.f20700g = new m2.h(workDatabase);
        this.f20701h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f20697d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void r() {
        synchronized (f20693m) {
            try {
                this.f20701h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f20702i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f20702i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        l.b(h());
        o().B().k();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f20693m) {
            try {
                this.f20702i = pendingResult;
                if (this.f20701h) {
                    pendingResult.finish();
                    this.f20702i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f20697d.b(new m2.l(this, str, aVar));
    }

    public void w(String str) {
        this.f20697d.b(new m2.m(this, str, true));
    }

    public void x(String str) {
        this.f20697d.b(new m2.m(this, str, false));
    }

    public j(Context context, androidx.work.a aVar, o2.a aVar2, boolean z10) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.getBackgroundExecutor(), z10));
    }

    public j(Context context, androidx.work.a aVar, o2.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        androidx.work.k.e(new k.a(aVar.j()));
        List listG = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, listG, new d(context, aVar, aVar2, workDatabase, listG));
    }
}
