package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f34561e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f34562f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f34563g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile p f34564h;

    /* renamed from: b, reason: collision with root package name */
    private int f34566b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34567c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f34568d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f34565a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f34561e = i10 < 29;
        f34562f = i10 >= 28;
        f34563g = new File("/proc/self/fd");
    }

    p() {
    }

    private boolean a() {
        return f34561e && !this.f34568d.get();
    }

    public static p b() {
        if (f34564h == null) {
            synchronized (p.class) {
                try {
                    if (f34564h == null) {
                        f34564h = new p();
                    }
                } finally {
                }
            }
        }
        return f34564h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f34565a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f34566b + 1;
            this.f34566b = i10;
            if (i10 >= 50) {
                this.f34566b = 0;
                int length = f34563g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f34567c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34567c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f34562f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        W2.l.a();
        this.f34568d.set(true);
    }
}
