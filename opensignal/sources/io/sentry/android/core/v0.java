package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b1;
import io.sentry.b4;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.j2;
import io.sentry.q1;
import io.sentry.x5;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11785a = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.util.a f11786b = new io.sentry.util.a();

    public static void a(x5 x5Var, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (q1 q1Var : x5Var.getIntegrations()) {
            if (z10 && (q1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(q1Var);
            }
            if (z11 && (q1Var instanceof SentryTimberIntegration)) {
                arrayList.add(q1Var);
            }
            if (q1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(q1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                x5Var.getIntegrations().remove((q1) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                x5Var.getIntegrations().remove((q1) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                x5Var.getIntegrations().remove((q1) arrayList3.get(i12));
            }
        }
    }

    public static void b(Context context, r rVar, b4 b4Var) {
        try {
            io.sentry.q qVarA = f11786b.a();
            try {
                c4.e(new j2(), new e(rVar, context, b4Var));
                b1 b1VarC = c4.c();
                if (e0.i()) {
                    if (b1VarC.k().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        b1VarC.r(new bf.a(27, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            b1VarC.p();
                        }
                    }
                    b1VarC.k().getReplayController().y();
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalAccessException e4) {
            rVar.g(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
        } catch (InstantiationException e10) {
            rVar.g(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (NoSuchMethodException e11) {
            rVar.g(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (InvocationTargetException e12) {
            rVar.g(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        }
    }
}
