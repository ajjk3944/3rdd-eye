package com.opensignal.sdk.data.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import br.l;
import ch.n;
import cj.e;
import cj.t;
import ic.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/opensignal/sdk/data/receiver/PackageReplacedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llq/b0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PackageReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        n.b("PackageReplacedReceiver", "onReceive() called with: context = " + context + ", intent = " + intent);
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            n.b("PackageReplacedReceiver", "SDK upgraded");
            ch.l.f3962t5.k();
            Bundle bundle = new Bundle();
            a.F(bundle, "EXECUTION_TYPE", e.POKE_SDK_AFTER_UPGRADE);
            t.a(context, bundle);
        }
    }
}
