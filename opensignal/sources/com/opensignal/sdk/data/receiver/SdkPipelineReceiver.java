package com.opensignal.sdk.data.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import br.l;
import ch.n;
import cj.e;
import cj.t;
import kotlin.Metadata;
import mj.g;
import wi.a;
import wi.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/opensignal/sdk/data/receiver/SdkPipelineReceiver;", "Lwi/a;", "Lwi/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llq/b0;", "onReceiveIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "isExported", "Z", "()Z", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SdkPipelineReceiver extends a implements f {
    private final boolean isExported;

    @Override // wi.f
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.opensignal.sdk.data.receiver.ALARM_PIPELINE");
        return intentFilter;
    }

    @Override // wi.a
    /* renamed from: isExported, reason: from getter */
    public boolean getIsExported() {
        return this.isExported;
    }

    @Override // wi.a
    public void onReceiveIntent(Context context, Intent intent) {
        int iHashCode;
        l.e(context, "context");
        l.e(intent, "intent");
        n.b("SdkPipelineReceiver", "Alarm pipeline intent received for " + intent.getAction());
        String action = intent.getAction();
        if (action == null || ((iHashCode = action.hashCode()) == -445099570 ? !action.equals("com.opensignal.sdk.data.receiver.ALARM_PIPELINE") : !(iHashCode == 42137749 && action.equals("com.opensignal.sdk.data.receiver.LONG_RUNNING_ALARM_PIPELINE")))) {
            n.g("SdkPipelineReceiver", "Caught a non alarm pipeline event: " + intent.getAction() + ". Ignoring.");
            return;
        }
        if (g.f16855b.get()) {
            n.b("SdkPipelineReceiver", "SDK already initialised. Rescheduling all tasks.");
            ch.l.f3962t5.k();
            Bundle bundle = new Bundle();
            ic.a.F(bundle, "EXECUTION_TYPE", e.RESCHEDULE_TASKS);
            t.a(context, bundle);
            return;
        }
        n.b("SdkPipelineReceiver", "SDK not initialised. Initialising.");
        String strC = getServiceLocator().F0().C();
        if (!getServiceLocator().s0().D() || strC == null) {
            return;
        }
        g.g0(context, strC);
    }
}
