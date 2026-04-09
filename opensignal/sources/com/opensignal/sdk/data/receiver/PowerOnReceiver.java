package com.opensignal.sdk.data.receiver;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import br.l;
import ch.n;
import com.opensignal.sdk.data.task.TickJobService;
import h0.b;
import kotlin.Metadata;
import wi.a;
import xi.i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/opensignal/sdk/data/receiver/PowerOnReceiver;", "Lwi/a;", "<init>", "()V", "Lch/l;", "serviceLocator", "(Lch/l;)V", "Landroid/content/Context;", "context", "Llq/b0;", "launchKeepAliveJob", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", "onReceiveIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "startKeepAliveService", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PowerOnReceiver extends a {
    public PowerOnReceiver() {
    }

    private final void launchKeepAliveJob(Context context) {
        if (getServiceLocator().F().c()) {
            startKeepAliveService(context);
        }
    }

    @Override // wi.a
    public void onReceiveIntent(Context context, Intent intent) {
        int iHashCode;
        l.e(context, "context");
        l.e(intent, "intent");
        n.b("PowerOnReceiver", "Intent action found - " + intent.getAction());
        String action = intent.getAction();
        if (action == null || ((iHashCode = action.hashCode()) == -1787487905 ? !action.equals("android.intent.action.QUICKBOOT_POWERON") : iHashCode == -1417835046 ? !action.equals("com.htc.intent.action.QUICKBOOT_POWERON") : !(iHashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")))) {
            n.g("PowerOnReceiver", "Unknown intent action found - " + intent.getAction());
            return;
        }
        launchKeepAliveJob(context);
        ch.l serviceLocator = getServiceLocator();
        if (serviceLocator.Y0 == null) {
            serviceLocator.Y0 = new i(0);
        }
        i iVar = serviceLocator.Y0;
        if (iVar != null) {
            iVar.a1();
        } else {
            l.l("_deviceBootTriggerDataSource");
            throw null;
        }
    }

    public final void startKeepAliveService(Context context) {
        l.e(context, "context");
        TickJobService.Companion.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobInfo.Builder builder = new JobInfo.Builder(100, new ComponentName(context, (Class<?>) TickJobService.class));
        builder.setMinimumLatency(10000L);
        builder.setOverrideDeadline(10001L);
        builder.setPersisted(false);
        int iSchedule = ((JobScheduler) systemService).schedule(builder.build());
        if (iSchedule == 0) {
            String strH = b.h(iSchedule, "Error scheduling in keep alive service - ");
            n.b("TickJobService", strH);
            ch.l.f3962t5.r();
            cj.a.F(strH);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerOnReceiver(ch.l lVar) {
        super(lVar);
        l.e(lVar, "serviceLocator");
    }
}
