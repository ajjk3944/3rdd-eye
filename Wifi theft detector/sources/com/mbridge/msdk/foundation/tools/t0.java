package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes3.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    static String f15510a = "";

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f15511b = false;

    /* renamed from: c, reason: collision with root package name */
    private static int f15512c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static int f15513d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static long f15514e;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f15511b) {
                return;
            }
            f15511b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f15510a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f15510a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f15510a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f15510a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f15510a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f15513d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f15514e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f15512c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f15513d = Long.valueOf(((statFs.getBlockCount() * blockSize) / 1000) / 1000).intValue();
            f15512c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f15514e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
