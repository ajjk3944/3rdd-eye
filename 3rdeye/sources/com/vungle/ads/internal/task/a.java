package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.ServiceLocator;
import d6.C4277a;
import java.io.File;
import java.io.IOException;
import p9.InterfaceC5480a;

/* compiled from: CleanupJob.kt */
/* loaded from: classes2.dex */
public final class a implements com.vungle.ads.internal.task.b {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final C0393a Companion = new C0393a(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final com.vungle.ads.internal.util.l pathProvider;

    /* compiled from: CleanupJob.kt */
    /* renamed from: com.vungle.ads.internal.task.a$a, reason: collision with other inner class name */
    public static final class C0393a {
        public /* synthetic */ C0393a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ d makeJobInfo$default(C0393a c0393a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c0393a.makeJobInfo(str);
        }

        public final d makeJobInfo(String str) {
            d priority = new d(a.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(a.AD_ID_KEY, str);
            }
            return priority.setExtras(bundle).setUpdateCurrent(str == null);
        }

        private C0393a() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C4277a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d6.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C4277a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C4277a.class);
        }
    }

    public a(Context context, com.vungle.ads.internal.util.l pathProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        InterfaceC2000g interfaceC2000gA = C2001h.a(b9.i.SYNCHRONIZED, new b(this.context));
        int i = m100checkIfSdkUpgraded$lambda3(interfaceC2000gA).getInt("VERSION_CODE", -1);
        if (i < 70401) {
            if (i < 70000) {
                dropV6Data();
            }
            if (i < 70100) {
                dropV700Data();
            }
            if (i < 70301) {
                dropV730TempData();
            }
            m100checkIfSdkUpgraded$lambda3(interfaceC2000gA).put("VERSION_CODE", 70401).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-3, reason: not valid java name */
    private static final C4277a m100checkIfSdkUpgraded$lambda3(InterfaceC2000g<C4277a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    private final void dropV6Data() {
        com.vungle.ads.internal.util.k.Companion.d(TAG, "CleanupJob: drop old files data");
        int i = Build.VERSION.SDK_INT;
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            com.vungle.ads.internal.util.f.delete(file);
            com.vungle.ads.internal.util.f.delete(new File(file.getPath() + "-journal"));
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sharedPreferences.getString("cache_path", null);
        if (i >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            sharedPreferences.edit().clear().apply();
        }
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        kotlin.jvm.internal.l.e(noBackupFilesDir, "{\n            context.noBackupFilesDir\n        }");
        com.vungle.ads.internal.util.f.delete(new File(noBackupFilesDir, "vungle_settings"));
        if (string != null) {
            com.vungle.ads.internal.util.f.delete(new File(string));
        }
    }

    private final void dropV700Data() {
        com.vungle.ads.internal.util.f.delete(new File(this.context.getApplicationInfo().dataDir, "vungle"));
    }

    private final void dropV730TempData() {
        try {
            com.vungle.ads.internal.util.f.delete(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"));
            com.vungle.ads.internal.util.f.delete(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"));
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Failed to delete temp data", e4);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.l getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.b
    public int onRunJob(Bundle bundle, f jobRunner) {
        File downloadsDirForAd;
        kotlin.jvm.internal.l.f(bundle, "bundle");
        kotlin.jvm.internal.l.f(jobRunner, "jobRunner");
        File downloadDir = this.pathProvider.getDownloadDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = downloadDir;
        }
        com.vungle.ads.internal.util.k.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!kotlin.jvm.internal.l.b(downloadsDirForAd, downloadDir)) {
                com.vungle.ads.internal.util.f.delete(downloadsDirForAd);
                return 0;
            }
            checkIfSdkUpgraded();
            com.vungle.ads.internal.util.f.deleteContents(downloadsDirForAd);
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
