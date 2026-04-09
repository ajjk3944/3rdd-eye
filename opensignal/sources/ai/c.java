package ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.b1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f381b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f382c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f383d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f384e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f385f;

    public c(ch.f fVar, Executor executor) {
        this.f380a = 0;
        this.f381b = fVar;
        this.f382c = executor;
        this.f383d = new CopyOnWriteArrayList();
        this.f384e = new CopyOnWriteArrayList();
        this.f385f = new AtomicBoolean(false);
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter("sdk.assistant.action.new_result_received");
        try {
            if (((AtomicBoolean) this.f385f).compareAndSet(false, true)) {
                if (((ch.f) this.f381b).h()) {
                    context.registerReceiver(this, intentFilter, e5.f(context), null, 2);
                } else {
                    context.registerReceiver(this, intentFilter, e5.f(context), null);
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public void b(Context context, ah.c cVar) {
        l.e(context, "context");
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f384e;
        n.b("AssistantBroadcastReceiver", "removeInternalListener() with " + cVar + " returned: " + copyOnWriteArrayList.remove(cVar));
        if (copyOnWriteArrayList.isEmpty() && ((CopyOnWriteArrayList) this.f383d).isEmpty()) {
            c(context);
        }
    }

    public void c(Context context) {
        l.e(context, "context");
        if (((AtomicBoolean) this.f385f).compareAndSet(true, false)) {
            try {
                context.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r3 = r5;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.c.onReceive(android.content.Context, android.content.Intent):void");
    }

    public c(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f380a = 1;
        this.f385f = systemEventsBreadcrumbsIntegration;
        this.f383d = new io.sentry.android.core.internal.util.g(0, 60000L);
        this.f384e = new char[64];
        this.f381b = b1Var;
        this.f382c = sentryAndroidOptions;
    }
}
