package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C4371i1;
import com.google.android.gms.measurement.internal.InterfaceC4883j5;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f38610b;

    /* renamed from: a, reason: collision with root package name */
    private final C4371i1 f38611a;

    private FirebaseAnalytics(C4371i1 c4371i1) {
        AbstractC7901p.l(c4371i1);
        this.f38611a = c4371i1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f38610b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f38610b == null) {
                        f38610b = new FirebaseAnalytics(C4371i1.e(context));
                    }
                } finally {
                }
            }
        }
        return f38610b;
    }

    @Keep
    public static InterfaceC4883j5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4371i1 c4371i1F = C4371i1.f(context, null, null, null, bundle);
        if (c4371i1F == null) {
            return null;
        }
        return new a(c4371i1F);
    }

    public final void a(String str, Bundle bundle) {
        this.f38611a.s(str, bundle);
    }

    public final void b(String str) {
        this.f38611a.G(str);
    }

    public final void c(String str, String str2) {
        this.f38611a.A(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f38611a.j(activity, str, str2);
    }
}
