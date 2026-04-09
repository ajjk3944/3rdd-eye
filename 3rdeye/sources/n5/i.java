package n5;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.yandex.mobile.ads.impl.R2;
import s1.ExecutorC5546b;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f44349c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ServiceConnectionC5363F f44350d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f44351a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorC5546b f44352b = new ExecutorC5546b();

    public i(Context context) {
        this.f44351a = context;
    }

    public static Task<Integer> a(Context context, Intent intent, boolean z10) {
        ServiceConnectionC5363F serviceConnectionC5363F;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f44349c) {
            try {
                if (f44350d == null) {
                    f44350d = new ServiceConnectionC5363F(context);
                }
                serviceConnectionC5363F = f44350d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            return serviceConnectionC5363F.b(intent).continueWith(new ExecutorC5546b(), new androidx.work.s());
        }
        if (v.a().c(context)) {
            C5361D.b(context, serviceConnectionC5363F, intent);
        } else {
            serviceConnectionC5363F.b(intent);
        }
        return Tasks.forResult(-1);
    }

    @KeepForSdk
    public final Task<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        Context context = this.f44351a;
        boolean z10 = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        ExecutorC5546b executorC5546b = this.f44352b;
        return Tasks.call(executorC5546b, new com.vungle.ads.internal.executor.h(1, context, intent)).continueWithTask(executorC5546b, new R2(z11, context, intent));
    }
}
