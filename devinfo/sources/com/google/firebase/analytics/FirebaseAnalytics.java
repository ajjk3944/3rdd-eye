package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.tasks.Tasks;
import ec.r2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pb.y;
import zd.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f20707b;

    /* renamed from: a, reason: collision with root package name */
    public final k1 f20708a;

    public FirebaseAnalytics(k1 k1Var) {
        y.h(k1Var);
        this.f20708a = k1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f20707b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f20707b == null) {
                        f20707b = new FirebaseAnalytics(k1.e(context, null));
                    }
                } finally {
                }
            }
        }
        return f20707b;
    }

    @Keep
    public static r2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        k1 k1VarE = k1.e(context, bundle);
        if (k1VarE == null) {
            return null;
        }
        return new c(k1VarE);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(df.c.e().d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        v0 v0VarA = v0.a(activity);
        k1 k1Var = this.f20708a;
        k1Var.getClass();
        k1Var.c(new y0(k1Var, v0VarA, str, str2));
    }
}
