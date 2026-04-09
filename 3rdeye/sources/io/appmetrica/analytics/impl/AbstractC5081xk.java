package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5081xk {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f42089a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C4773lj c4773lj;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f42089a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Nf.f39901c).build());
        C5065x4 c5065x4L = C5065x4.l();
        synchronized (c5065x4L) {
            try {
                if (c5065x4L.f42025o == null) {
                    C4773lj c4773lj2 = new C4773lj();
                    c5065x4L.f42025o = c4773lj2;
                    c5065x4L.f42019h.a(c4773lj2);
                }
                c4773lj = c5065x4L.f42025o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo screenInfoA = c4773lj.a(context);
        intentPutExtras.putExtra("screen_size", screenInfoA == null ? null : AbstractC5122zb.a(screenInfoA));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
