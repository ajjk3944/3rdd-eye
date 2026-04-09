package g8;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f24601e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f24602f;
    public static final File g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile x f24603h;

    /* renamed from: b, reason: collision with root package name */
    public int f24605b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24606c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24607d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f24604a = 20000;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f24601e = i4 < 29;
        f24602f = i4 >= 28;
        g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f24603h == null) {
            synchronized (x.class) {
                try {
                    if (f24603h == null) {
                        f24603h = new x();
                    }
                } finally {
                }
            }
        }
        return f24603h;
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
        return this.f24604a;
    }

    public final boolean c(int i4, int i10, boolean z3, boolean z10) {
        boolean z11;
        if (z3) {
            if (f24602f) {
                if (!f24601e || this.f24607d.get()) {
                    if (z10) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i4 >= 0 && i10 >= 0) {
                        synchronized (this) {
                            try {
                                int i11 = this.f24605b + 1;
                                this.f24605b = i11;
                                if (i11 >= 50) {
                                    this.f24605b = 0;
                                    int length = g.list().length;
                                    long jB = b();
                                    boolean z12 = ((long) length) < jB;
                                    this.f24606c = z12;
                                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z11 = this.f24606c;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z11) {
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
