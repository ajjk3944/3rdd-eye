package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.infer.annotation.Nullsafe;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.Sk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f22325a = new AtomicBoolean();

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22326b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22327c;

        public a(Context context, String str) {
            this.f22326b = context;
            this.f22327c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 433
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.a.run():void");
        }
    }

    public static void a(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", ConstantDeviceInfo.APP_PLATFORM);
        jSONObject.put(Sk.f40128f, str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", Constants.PLATFORM);
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d10) {
        AtomicBoolean atomicBoolean = f22325a;
        if (atomicBoolean.get() || Math.random() >= d10) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
