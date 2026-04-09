package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import cc.s;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.zzdf;
import fg.d;
import fg.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import se.f;
import ve.a;
import zc.e2;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f5808b;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f5809a;

    public FirebaseAnalytics(i1 i1Var) {
        s.h(i1Var);
        this.f5809a = i1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f5808b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f5808b == null) {
                        f5808b = new FirebaseAnalytics(i1.e(context, null));
                    }
                } finally {
                }
            }
        }
        return f5808b;
    }

    @Keep
    public static e2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        i1 i1VarE = i1.e(context, bundle);
        if (i1VarE == null) {
            return null;
        }
        return new a(i1VarE);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f8845m;
            return (String) e5.h(((d) f.c().b(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdf zzdfVarD = zzdf.d(activity);
        i1 i1Var = this.f5809a;
        i1Var.getClass();
        i1Var.c(new w0(i1Var, zzdfVarD, str, str2));
    }
}
