package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.io.IOException;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.j0;

/* loaded from: classes3.dex */
public final class CleanupJob implements Job {

    @NotNull
    private static final String AD_ID_KEY = "AD_ID_KEY";

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String TAG = "CleanupJob";

    @NotNull
    private final Context context;

    @NotNull
    private final q pathProvider;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return aVar.makeJobInfo(str);
        }

        @NotNull
        public final JobInfo makeJobInfo(@Nullable String str) {
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, str);
            }
            return priority.setExtras(bundle).setUpdateCurrent(str == null);
        }

        private a() {
        }
    }

    public CleanupJob(@NotNull Context context, @NotNull q pathProvider) {
        p.e(context, "context");
        p.e(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.task.CleanupJob$checkIfSdkUpgraded$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t7.b] */
            @Override // l9.a
            @NotNull
            public final t7.b invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(t7.b.class);
            }
        });
        int i10 = m352checkIfSdkUpgraded$lambda4(hVarA).getInt("VERSION_CODE", -1);
        if (i10 < 70603) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            if (i10 < 70500) {
                dropV742TpatData();
            }
            if (i10 < 70600) {
                dropV750Data();
            }
            m352checkIfSdkUpgraded$lambda4(hVarA).put("VERSION_CODE", 70603).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final t7.b m352checkIfSdkUpgraded$lambda4(y8.h hVar) {
        return (t7.b) hVar.getValue();
    }

    private final void dropV6Data() {
        com.vungle.ads.internal.util.p.Companion.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            com.vungle.ads.internal.util.i.delete$default(file, null, 2, null);
            com.vungle.ads.internal.util.i.delete$default(new File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sp = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sp.getString("cache_path", null);
        if (Build.VERSION.SDK_INT >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            p.d(sp, "sp");
            SharedPreferences.Editor editor = sp.edit();
            p.d(editor, "editor");
            editor.clear();
            editor.apply();
        }
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        p.d(noBackupFilesDir, "context.noBackupFilesDir");
        com.vungle.ads.internal.util.i.delete$default(new File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            com.vungle.ads.internal.util.i.delete$default(new File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        com.vungle.ads.internal.util.i.delete$default(new File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            com.vungle.ads.internal.util.i.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            com.vungle.ads.internal.util.i.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to delete temp data", e10);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.i.delete$default(new File(noBackupFilesDir, "failedTpats"), null, 2, null);
            com.vungle.ads.internal.util.i.delete$default(new File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to delete 742 tpat data", e10);
        }
    }

    private final void dropV750Data() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.i.delete$default(new File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            com.vungle.ads.internal.util.i.delete$default(new File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to delete 750 data", e10);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(@NotNull Bundle bundle, @NotNull c jobRunner) {
        File downloadsDirForAd;
        p.e(bundle, "bundle");
        p.e(jobRunner, "jobRunner");
        File vmDir = this.pathProvider.getVmDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = vmDir;
        }
        com.vungle.ads.internal.util.p.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!p.a(downloadsDirForAd, vmDir)) {
                com.vungle.ads.internal.util.i.delete$default(downloadsDirForAd, null, 2, null);
                return 0;
            }
            checkIfSdkUpgraded();
            com.vungle.ads.internal.util.i.deleteContents(downloadsDirForAd, j0.f(com.vungle.ads.internal.b.OM_SDK_JS, com.vungle.ads.internal.b.OM_SESSION_JS));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
