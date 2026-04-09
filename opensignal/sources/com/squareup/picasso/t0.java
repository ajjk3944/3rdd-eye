package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.StatFs;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final StringBuilder f5986a = new StringBuilder();

    public static long a(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static String c(k0 k0Var) {
        List list = k0Var.f5920d;
        Uri uri = k0Var.f5918b;
        StringBuilder sb2 = f5986a;
        if (uri != null) {
            String string = uri.toString();
            sb2.ensureCapacity(string.length() + 50);
            sb2.append(string);
        } else {
            sb2.ensureCapacity(50);
            sb2.append(k0Var.f5919c);
        }
        sb2.append('\n');
        if (k0Var.a()) {
            sb2.append("resize:");
            sb2.append(k0Var.f5921e);
            sb2.append('x');
            sb2.append(k0Var.f5922f);
            sb2.append('\n');
        }
        if (list != null && list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        String string2 = sb2.toString();
        sb2.setLength(0);
        return string2;
    }

    public static int d(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }
}
