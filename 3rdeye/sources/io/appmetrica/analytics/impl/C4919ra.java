package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4919ra {

    /* renamed from: a, reason: collision with root package name */
    public final File f41566a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f41567b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f41568c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f41569d;

    /* renamed from: e, reason: collision with root package name */
    public int f41570e;

    public C4919ra(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f41566a, "rw");
            this.f41568c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f41569d = channel;
            if (this.f41570e == 0) {
                this.f41567b = channel.lock();
            }
            this.f41570e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f41566a.getAbsolutePath();
            int i = this.f41570e - 1;
            this.f41570e = i;
            if (i == 0) {
                AbstractC4533cb.a(this.f41567b);
            }
            AbstractC4623fo.a((Closeable) this.f41568c);
            AbstractC4623fo.a((Closeable) this.f41569d);
            this.f41568c = null;
            this.f41567b = null;
            this.f41569d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4919ra(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C4919ra(File file) {
        this.f41570e = 0;
        this.f41566a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
