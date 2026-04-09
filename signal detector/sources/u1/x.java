package u1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f23770e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f23771f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f23772g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile x f23773h;

    /* renamed from: b, reason: collision with root package name */
    public int f23775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23776c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f23777d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f23774a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f23770e = i < 29;
        f23771f = i >= 28;
        f23772g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f23773h == null) {
            synchronized (x.class) {
                try {
                    if (f23773h == null) {
                        f23773h = new x();
                    }
                } finally {
                }
            }
        }
        return f23773h;
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
        return this.f23774a;
    }

    public final boolean c(int i, int i3, boolean z6, boolean z7) {
        boolean z8;
        if (z6) {
            if (f23771f) {
                if (!f23770e || this.f23777d.get()) {
                    if (z7) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i3 >= 0) {
                        synchronized (this) {
                            try {
                                int i6 = this.f23775b + 1;
                                this.f23775b = i6;
                                if (i6 >= 50) {
                                    this.f23775b = 0;
                                    int length = f23772g.list().length;
                                    long jB = b();
                                    boolean z9 = ((long) length) < jB;
                                    this.f23776c = z9;
                                    if (!z9 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z8 = this.f23776c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z8) {
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
