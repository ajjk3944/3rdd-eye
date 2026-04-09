package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.a3;
import io.sentry.b5;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h implements io.sentry.y0 {

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.u0 f11587g;

    /* renamed from: a, reason: collision with root package name */
    public long f11581a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f11582b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f11583c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f11584d = 1;

    /* renamed from: e, reason: collision with root package name */
    public double f11585e = 1.0E9d / 1;

    /* renamed from: f, reason: collision with root package name */
    public final File f11586f = new File("/proc/self/stat");

    /* renamed from: h, reason: collision with root package name */
    public boolean f11588h = false;

    /* renamed from: i, reason: collision with root package name */
    public final Pattern f11589i = Pattern.compile("[\n\t\r ]");

    public h(io.sentry.u0 u0Var) {
        ir.f0.T(u0Var, "Logger is required.");
        this.f11587g = u0Var;
    }

    @Override // io.sentry.y0
    public final void a(a3 a3Var) throws NumberFormatException {
        if (this.f11588h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.f11581a;
            this.f11581a = jElapsedRealtimeNanos;
            long jB = b();
            long j7 = jB - this.f11582b;
            this.f11582b = jB;
            a3Var.f11461a = Double.valueOf(((j7 / j) / this.f11584d) * 100.0d);
        }
    }

    public final long b() throws NumberFormatException {
        String strN;
        io.sentry.u0 u0Var = this.f11587g;
        try {
            strN = e5.N(this.f11586f);
        } catch (IOException e4) {
            this.f11588h = false;
            u0Var.g(b5.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e4);
            strN = null;
        }
        if (strN != null) {
            String[] strArrSplit = this.f11589i.split(strN.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j7 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j7 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f11585e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
                u0Var.g(b5.ERROR, "Error parsing /proc/self/stat file.", e10);
            }
        }
        return 0L;
    }

    @Override // io.sentry.y0
    public final void c() {
        this.f11588h = true;
        this.f11583c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f11584d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f11585e = 1.0E9d / this.f11583c;
        this.f11582b = b();
    }
}
