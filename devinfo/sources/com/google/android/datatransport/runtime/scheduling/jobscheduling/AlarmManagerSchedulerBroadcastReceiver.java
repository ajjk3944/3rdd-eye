package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.applovin.impl.sdk.z;
import com.google.android.gms.internal.consent_sdk.d;
import ea.i;
import ea.q;
import java.util.concurrent.Executor;
import oa.a;
import yb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9011a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i4 = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        e eVarA = i.a();
        eVarA.v(queryParameter);
        eVarA.f37511d = a.b(iIntValue);
        if (queryParameter2 != null) {
            eVarA.f37510c = Base64.decode(queryParameter2, 0);
        }
        d dVar = q.a().f22516d;
        ((Executor) dVar.f19299e).execute(new z(i4, 1, dVar, eVarA.i(), new bg.a(5)));
    }
}
