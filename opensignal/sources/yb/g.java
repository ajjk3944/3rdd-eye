package yb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import bc.e0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import zc.c1;
import zc.j0;
import zc.x;
import zc.x2;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26221a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26222d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Parcelable f26223g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f26224r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26225x;

    public /* synthetic */ g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f26221a = 0;
        this.f26223g = intent;
        this.f26224r = context;
        this.f26222d = z10;
        this.f26225x = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executor;
        int iA;
        switch (this.f26221a) {
            case 0:
                Intent intent = (Intent) this.f26223g;
                Context context = (Context) this.f26224r;
                boolean z10 = this.f26222d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f26225x;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent);
                            Executor executorUnconfigurableExecutorService = null;
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f5819b;
                                    if (softReference != null) {
                                        executorUnconfigurableExecutorService = (Executor) softReference.get();
                                    }
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hc.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f5819b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                    executor = executorUnconfigurableExecutorService;
                                } finally {
                                }
                            }
                            executor.execute(new e0(context, cloudMessage, countDownLatch, 7, false));
                            try {
                                iIntValue = ((Integer) e5.g(new kg.i(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e4) {
                                io.sentry.android.core.e0.c("FirebaseMessaging", "Failed to send message to service.", e4);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    io.sentry.android.core.e0.p("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e10) {
                                io.sentry.android.core.e0.p("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                            }
                        }
                        iA = iIntValue;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                x2 x2Var = (x2) this.f26225x;
                x xVar = x2Var.f27267x;
                if (xVar == null) {
                    j0 j0Var = ((c1) x2Var.f1504d).f26889y;
                    c1.g(j0Var);
                    j0Var.B.b("Discarding data. Failed to set user property");
                    return;
                } else {
                    x2Var.K1(xVar, this.f26222d ? null : (zzpl) this.f26224r, (zzr) this.f26223g);
                    x2Var.F1();
                    return;
                }
            case 2:
                x2 x2Var2 = (x2) this.f26225x;
                x xVar2 = x2Var2.f27267x;
                if (xVar2 == null) {
                    j0 j0Var2 = ((c1) x2Var2.f1504d).f26889y;
                    c1.g(j0Var2);
                    j0Var2.B.b("Discarding data. Failed to send event to service");
                    return;
                } else {
                    x2Var2.K1(xVar2, this.f26222d ? null : (zzbg) this.f26224r, (zzr) this.f26223g);
                    x2Var2.F1();
                    return;
                }
            default:
                x2 x2Var3 = (x2) this.f26225x;
                x xVar3 = x2Var3.f27267x;
                if (xVar3 == null) {
                    j0 j0Var3 = ((c1) x2Var3.f1504d).f26889y;
                    c1.g(j0Var3);
                    j0Var3.B.b("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    x2Var3.K1(xVar3, this.f26222d ? null : (zzah) this.f26224r, (zzr) this.f26223g);
                    x2Var3.F1();
                    return;
                }
        }
    }

    public /* synthetic */ g(x2 x2Var, zzr zzrVar, boolean z10, AbstractSafeParcelable abstractSafeParcelable, int i10) {
        this.f26221a = i10;
        this.f26223g = zzrVar;
        this.f26222d = z10;
        this.f26224r = abstractSafeParcelable;
        this.f26225x = x2Var;
    }

    public g(x2 x2Var, zzr zzrVar, boolean z10, zzah zzahVar) {
        this.f26221a = 3;
        this.f26223g = zzrVar;
        this.f26222d = z10;
        this.f26224r = zzahVar;
        Objects.requireNonNull(x2Var);
        this.f26225x = x2Var;
    }
}
