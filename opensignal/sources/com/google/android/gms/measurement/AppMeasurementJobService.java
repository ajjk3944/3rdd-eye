package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import cc.s;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.v0;
import io.sentry.android.core.e0;
import java.util.Objects;
import z7.b;
import zc.a3;
import zc.d;
import zc.j0;
import zc.p3;
import zc.z1;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public b f5389a;

    @Override // zc.a3
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // zc.a3
    public final void b(Intent intent) {
    }

    @Override // zc.a3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final b d() {
        if (this.f5389a == null) {
            this.f5389a = new b(this);
        }
        return this.f5389a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) d().f26690a).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) d().f26690a).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            e0.d("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        b bVarD = d();
        Service service = (Service) bVarD.f26690a;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            s.h(string);
            p3 p3VarY = p3.y(service);
            j0 j0VarX = p3VarY.x();
            d dVar = p3VarY.H.f26886g;
            j0VarX.K.c(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            p3VarY.J().B1(new z1(bVarD, p3VarY, new bc.e0(bVarD, j0VarX, jobParameters2, 16, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        s.h(string);
        i1 i1VarE = i1.e(service, null);
        z1 z1Var = new z1(bVarD, jobParameters2);
        i1VarE.getClass();
        i1VarE.c(new v0(i1VarE, z1Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            e0.d("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
