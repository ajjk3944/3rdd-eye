package Z1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f<Object> f13992a;

    public e(f<Object> fVar) {
        this.f13992a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(intent, "intent");
        this.f13992a.f(intent);
    }
}
