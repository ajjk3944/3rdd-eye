package U2;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12429e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f12430f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f12431g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile r f12432h;

    /* renamed from: b, reason: collision with root package name */
    public int f12434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12435c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12436d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f12433a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f12429e = i < 29;
        f12430f = i >= 28;
        f12431g = new File("/proc/self/fd");
    }

    public static r a() {
        if (f12432h == null) {
            synchronized (r.class) {
                try {
                    if (f12432h == null) {
                        f12432h = new r();
                    }
                } finally {
                }
            }
        }
        return f12432h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f12433a;
    }

    public final boolean c(int i, int i10, boolean z10, boolean z11) {
        boolean z12;
        if (z10) {
            if (f12430f) {
                if (!f12429e || this.f12436d.get()) {
                    if (z11) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i10 >= 0) {
                        synchronized (this) {
                            try {
                                int i11 = this.f12434b + 1;
                                this.f12434b = i11;
                                if (i11 >= 50) {
                                    this.f12434b = 0;
                                    int length = f12431g.list().length;
                                    long jB = b();
                                    boolean z13 = ((long) length) < jB;
                                    this.f12435c = z13;
                                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z12 = this.f12435c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z12) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
