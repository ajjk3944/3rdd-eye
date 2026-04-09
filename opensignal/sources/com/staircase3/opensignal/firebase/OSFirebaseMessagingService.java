package com.staircase3.opensignal.firebase;

import android.content.Context;
import android.os.Bundle;
import as.x;
import br.l;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kc.f;
import kotlin.Metadata;
import lq.j;
import sm.m;
import u.e;
import vm.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/firebase/OSFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OSFirebaseMessagingService extends FirebaseMessagingService {
    public final Object D = f.E(j.SYNCHRONIZED, new x(18, this));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(RemoteMessage remoteMessage) throws NumberFormatException {
        a mVar;
        ?? r02 = this.D;
        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "fcm_firebase", "notification", "received", 8);
        if (remoteMessage.f5833d == null) {
            Bundle bundle = remoteMessage.f5832a;
            e eVar = new e(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            remoteMessage.f5833d = eVar;
        }
        e eVar2 = remoteMessage.f5833d;
        l.d(eVar2, "getData(...)");
        String str3 = (String) eVar2.get("Type");
        if (str3 != null) {
            int i10 = Integer.parseInt(str3);
            if (i10 == 0) {
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "fcm_firebase", "interview_notification", "received", 8);
                mVar = new m();
            } else if (i10 != 1) {
                mVar = null;
            } else {
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "fcm_firebase", "boost_speedtest_notification", "received", 8);
                mVar = new sm.f(27);
            }
            if (mVar != null) {
                Context applicationContext = getApplicationContext();
                l.d(applicationContext, "getApplicationContext(...)");
                mVar.w(applicationContext, eVar2);
            }
        }
    }
}
