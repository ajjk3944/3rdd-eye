package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f42415a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f42416b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f42417c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f42418d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f42419e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42420f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42421g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f42416b = executor;
        this.f42417c = iExecutionPolicy;
        this.f42418d = exponentialBackoffPolicy;
        this.f42419e = underlyingNetworkTask;
        this.f42420f = list;
        this.f42421g = str;
    }

    private synchronized boolean a(int i) {
        if (!a(i)) {
            return false;
        }
        this.f42415a = i;
        return true;
    }

    public String description() {
        return this.f42419e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f42417c;
    }

    public Executor getExecutor() {
        return this.f42416b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f42418d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f42419e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f42419e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f42419e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f42419e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f42419e;
    }

    public String getUrl() {
        return this.f42419e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f42421g;
    }

    public boolean isRemoved() {
        return this.f42415a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f42419e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f42419e.getFullUrlFormer().incrementAttemptNumber();
            this.f42419e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f42419e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z10;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    zOnRequestComplete = this.f42419e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f42415a = 5;
                    } else {
                        this.f42415a = 6;
                    }
                    z10 = true;
                } else {
                    zOnRequestComplete = false;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f42419e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f42419e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f42419e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f42419e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i;
        boolean zA;
        synchronized (this) {
            i = this.f42415a;
            zA = a(8);
        }
        if (zA) {
            this.f42419e.onTaskFinished();
            if (i == 5) {
                this.f42419e.onSuccessfulTaskFinished();
            } else if (i == 6 || i == 7) {
                this.f42419e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f42419e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z10;
        int i;
        try {
            zHasMoreHosts = this.f42419e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f42419e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f42420f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z10 = false;
                    break;
                }
            }
            i = this.f42415a;
        } catch (Throwable th) {
            throw th;
        }
        return i != 9 && i != 8 && zHasMoreHosts && z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean a(int... r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            int r1 = r13.f42415a     // Catch: java.lang.Throwable -> L1f
            int r2 = r14.length     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r2) goto L84
            r5 = r14[r4]     // Catch: java.lang.Throwable -> L1f
            int r5 = io.appmetrica.analytics.networktasks.impl.e.a(r5)     // Catch: java.lang.Throwable -> L1f
            r6 = 1
            r7 = 4
            r8 = 2
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 9
            switch(r5) {
                case 0: goto L76;
                case 1: goto L6d;
                case 2: goto L63;
                case 3: goto L54;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L45;
                case 7: goto L2f;
                case 8: goto L22;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L1f
        L1b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L1f:
            r14 = move-exception
            goto L8f
        L22:
            if (r1 != r6) goto L26
            goto L76
        L26:
            if (r1 == r12) goto L29
            goto L2a
        L29:
            r6 = r3
        L2a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L1f
            goto L77
        L2f:
            if (r1 == r10) goto L42
            if (r1 == r9) goto L42
            r5 = 7
            if (r1 == r5) goto L42
            if (r1 == r8) goto L42
            if (r1 == r11) goto L42
            if (r1 != r7) goto L3d
            goto L42
        L3d:
            if (r1 != r12) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L45:
            if (r1 != r11) goto L63
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L4a:
            if (r1 != r7) goto L4f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L4f:
            if (r1 != r12) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L54:
            if (r1 == r11) goto L60
            if (r1 == r10) goto L60
            if (r1 != r9) goto L5b
            goto L60
        L5b:
            if (r1 != r12) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L63:
            if (r1 != r8) goto L68
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L68:
            if (r1 != r12) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L6d:
            if (r1 != r6) goto L70
            goto L71
        L70:
            r6 = r3
        L71:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L1f
            goto L77
        L76:
            r5 = 0
        L77:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L81
            r0 = r5
            goto L84
        L81:
            int r4 = r4 + 1
            goto L8
        L84:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r13)
            return r14
        L8f:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1f
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.NetworkTask.a(int[]):boolean");
    }
}
