package com.google.firebase.analytics;

import B4.e;
import E4.c;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f23242c;

    /* renamed from: a, reason: collision with root package name */
    public final zzee f23243a;

    /* renamed from: b, reason: collision with root package name */
    public E4.a f23244b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
    public enum a {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f23243a = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f23242c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f23242c == null) {
                        f23242c = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f23242c;
    }

    @Keep
    public static zzie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzeeVarZzg = zzee.zzg(context, null, null, null, bundle);
        if (zzeeVarZzg == null) {
            return null;
        }
        return new c(zzeeVarZzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = h5.b.f38246m;
            e eVarC = e.c();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((h5.b) eVarC.b(h5.c.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
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
        this.f23243a.zzG(activity, str, str2);
    }
}
