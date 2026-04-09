package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q {

    @NotNull
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";

    @NotNull
    public static final a Companion = new a(null);
    private static final long UNKNOWN_SIZE = -1;

    @NotNull
    private static final String VM_FOLDER = "adAssets";

    @NotNull
    private static final String VUNGLE_FOLDER = "vungle_cache";

    @NotNull
    private final File cleverCacheDir;

    @NotNull
    private final Context context;

    @NotNull
    private final File vmDir;

    @NotNull
    private final File vungleDir;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public q(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, VM_FOLDER);
        this.vmDir = file2;
        File file3 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file3;
        for (File file4 : z8.r.l(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(@NotNull String path) {
        kotlin.jvm.internal.p.e(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e10) {
            p.Companion.w("PathProvider", "Failed to get available bytes " + e10.getMessage());
            return -1L;
        }
    }

    @NotNull
    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final File getDownloadsDirForAd(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        kotlin.jvm.internal.p.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    @NotNull
    public final File getUnclosedAdFile(@NotNull String name) {
        kotlin.jvm.internal.p.e(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    @NotNull
    public final File getVmDir() {
        if (!this.vmDir.exists()) {
            this.vmDir.mkdirs();
        }
        return this.vmDir;
    }

    @NotNull
    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
