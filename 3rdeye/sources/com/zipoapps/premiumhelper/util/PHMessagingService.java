package com.zipoapps.premiumhelper.util;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import r8.d;
import w9.i;

/* compiled from: PHMessagingService.kt */
/* loaded from: classes3.dex */
public final class PHMessagingService extends FirebaseMessagingService {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f37188k;

    /* renamed from: j, reason: collision with root package name */
    public final d f37189j = new d(null);

    /* compiled from: PHMessagingService.kt */
    public interface a {
    }

    static {
        q qVar = new q(PHMessagingService.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        f37188k = new i[]{qVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(n5.s r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.util.PHMessagingService.d(n5.s):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String token) throws Throwable {
        l.f(token, "token");
        Context applicationContext = getApplicationContext();
        l.e(applicationContext, "getApplicationContext(...)");
        if (applicationContext.getSharedPreferences("premium_helper_data", 0).getBoolean("has_active_purchase", false)) {
            TotoRegisterWorker.Companion companion = TotoRegisterWorker.Companion;
            Context applicationContext2 = getApplicationContext();
            l.e(applicationContext2, "getApplicationContext(...)");
            companion.schedule(applicationContext2, token);
        }
    }
}
