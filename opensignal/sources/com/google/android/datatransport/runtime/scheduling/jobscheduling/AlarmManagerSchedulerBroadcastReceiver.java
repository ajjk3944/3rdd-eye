package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import al.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import io.sentry.k;
import io.sentry.u4;
import java.util.concurrent.Executor;
import m9.i;
import m9.o;
import s9.e;
import w9.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4018a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        k kVarA = i.a();
        kVarA.m0(queryParameter);
        kVarA.f12399r = a.b(iIntValue);
        if (queryParameter2 != null) {
            kVarA.f12398g = Base64.decode(queryParameter2, 0);
        }
        b bVar = o.a().f16374d;
        ((Executor) bVar.f814f).execute(new e(bVar, kVarA.n(), i10, new u4(3)));
    }
}
