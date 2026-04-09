package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C4371i1;
import java.util.Objects;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4940q6 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36675a;

    public C4940q6(Context context) {
        AbstractC7901p.l(context);
        this.f36675a = context;
    }

    public static /* synthetic */ void d(C4940q6 c4940q6, int i10, L2 l22, Intent intent) {
        if (((InterfaceC4963t6) c4940q6.f36675a).zza(i10)) {
            l22.G().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            c4940q6.k().G().a("Completed wakeful intent.");
            ((InterfaceC4963t6) c4940q6.f36675a).a(intent);
        }
    }

    public static /* synthetic */ void e(C4940q6 c4940q6, JobParameters jobParameters) {
        Log.v("FA", "AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC4963t6) c4940q6.f36675a).b(jobParameters, false);
    }

    public static /* synthetic */ void f(C4940q6 c4940q6, L2 l22, JobParameters jobParameters) {
        l22.G().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC4963t6) c4940q6.f36675a).b(jobParameters, false);
    }

    private final void g(C4833d7 c4833d7, Runnable runnable) {
        c4833d7.zzl().z(new RunnableC4971u6(this, c4833d7, runnable));
    }

    private final L2 k() {
        return C4976v3.a(this.f36675a, null, null).zzj();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        final L2 l2Zzj = C4976v3.a(this.f36675a, null, null).zzj();
        if (intent == null) {
            l2Zzj.H().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        l2Zzj.G().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            g(C4833d7.j(this.f36675a), new Runnable() { // from class: com.google.android.gms.measurement.internal.s6
                @Override // java.lang.Runnable
                public final void run() {
                    C4940q6.d(this.f36733a, i11, l2Zzj, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().C().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new A3(C4833d7.j(this.f36675a));
        }
        k().H().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        C4976v3.a(this.f36675a, null, null).zzj().G().a("Local AppMeasurementService is starting up");
    }

    public final boolean h(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC7901p.l(string);
            C4833d7 c4833d7J = C4833d7.j(this.f36675a);
            final L2 l2Zzj = c4833d7J.zzj();
            l2Zzj.G().b("Local AppMeasurementJobService called. action", str);
            g(c4833d7J, new Runnable() { // from class: com.google.android.gms.measurement.internal.r6
                @Override // java.lang.Runnable
                public final void run() {
                    C4940q6.f(this.f36709a, l2Zzj, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C4371i1 c4371i1E = C4371i1.e(this.f36675a);
        if (!((Boolean) N.f36048T0.a(null)).booleanValue()) {
            return true;
        }
        c4371i1E.r(new Runnable() { // from class: com.google.android.gms.measurement.internal.p6
            @Override // java.lang.Runnable
            public final void run() {
                C4940q6.e(this.f36650a, jobParameters);
            }
        });
        return true;
    }

    public final void i() {
        C4976v3.a(this.f36675a, null, null).zzj().G().a("Local AppMeasurementService is shutting down");
    }

    public final void j(Intent intent) {
        if (intent == null) {
            k().C().a("onRebind called with null intent");
        } else {
            k().G().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean l(Intent intent) {
        if (intent == null) {
            k().C().a("onUnbind called with null intent");
            return true;
        }
        k().G().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
