package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import E3.f;
import I3.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import y3.j;
import y3.r;
import y3.u;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22439a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        u.b(context);
        j.a aVarA = r.a();
        aVarA.b(queryParameter);
        aVarA.f48080c = a.b(iIntValue);
        if (queryParameter2 != null) {
            aVarA.f48079b = Base64.decode(queryParameter2, 0);
        }
        E3.j jVar = u.a().f48105d;
        j jVarA = aVarA.a();
        E3.a aVar = new E3.a(0);
        jVar.getClass();
        jVar.f1401e.execute(new f(jVar, jVarA, i, aVar));
    }
}
