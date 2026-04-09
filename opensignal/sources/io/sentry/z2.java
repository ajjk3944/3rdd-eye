package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class z2 extends w {

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f12874i = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    public final b1 f12875e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f12876f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f12877g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f12878h;

    public z2(b1 b1Var, s0 s0Var, g1 g1Var, u0 u0Var, long j, int i10) {
        super(b1Var, u0Var, j, i10);
        ir.f0.T(b1Var, "Scopes are required.");
        this.f12875e = b1Var;
        ir.f0.T(s0Var, "Envelope reader is required.");
        this.f12876f = s0Var;
        ir.f0.T(g1Var, "Serializer is required.");
        this.f12877g = g1Var;
        ir.f0.T(u0Var, "Logger is required.");
        this.f12878h = u0Var;
    }

    public static /* synthetic */ void c(z2 z2Var, File file, io.sentry.hints.g gVar) {
        u0 u0Var = z2Var.f12878h;
        if (gVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            u0Var.m(b5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e4) {
            u0Var.f(b5.ERROR, e4, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.w
    public final void b(File file, h0 h0Var) {
        boolean zA = a(file.getName());
        u0 u0Var = this.f12878h;
        try {
            if (!zA) {
                u0Var.m(b5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    i4.b bVarA = this.f12876f.a(bufferedInputStream);
                    if (bVarA == null) {
                        u0Var.m(b5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(bVarA, h0Var);
                        u0Var.m(b5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objY = dr.a.y(h0Var);
                    if (!io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) || objY == null) {
                        io.sentry.config.a.c0(io.sentry.hints.g.class, objY, u0Var);
                    } else {
                        c(this, file, (io.sentry.hints.g) objY);
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e4) {
                u0Var.g(b5.ERROR, "Error processing envelope.", e4);
                Object objY2 = dr.a.y(h0Var);
                if (!io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) || objY2 == null) {
                    io.sentry.config.a.c0(io.sentry.hints.g.class, objY2, u0Var);
                } else {
                    c(this, file, (io.sentry.hints.g) objY2);
                }
            }
        } catch (Throwable th4) {
            Object objY3 = dr.a.y(h0Var);
            if (!io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) || objY3 == null) {
                io.sentry.config.a.c0(io.sentry.hints.g.class, objY3, u0Var);
            } else {
                c(this, file, (io.sentry.hints.g) objY3);
            }
            throw th4;
        }
    }

    public final cj.a d(q6 q6Var) {
        String str;
        u0 u0Var = this.f12878h;
        if (q6Var != null && (str = q6Var.B) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (lf.t1.z(dValueOf, false)) {
                    String str2 = q6Var.D;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (lf.t1.z(dValueOf2, false)) {
                            return new cj.a(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return lf.t1.b(new cj.a(Boolean.TRUE, dValueOf));
                }
                u0Var.m(b5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                u0Var.m(b5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new cj.a(Boolean.TRUE, (Double) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[PHI: r16 r17
  0x006b: PHI (r16v2 java.util.Iterator) = 
  (r16v0 java.util.Iterator)
  (r16v0 java.util.Iterator)
  (r16v0 java.util.Iterator)
  (r16v0 java.util.Iterator)
  (r16v3 java.util.Iterator)
 binds: [B:42:0x0106, B:106:0x026e, B:107:0x0270, B:74:0x01aa, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r17v2 int) = (r17v0 int), (r17v0 int), (r17v0 int), (r17v0 int), (r17v3 int) binds: [B:42:0x0106, B:106:0x026e, B:107:0x0270, B:74:0x01aa, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i4.b r21, io.sentry.h0 r22) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.z2.e(i4.b, io.sentry.h0):void");
    }

    public final boolean f(h0 h0Var) {
        Object objY = dr.a.y(h0Var);
        if (objY instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objY).d();
        }
        io.sentry.config.a.c0(io.sentry.hints.f.class, objY, this.f12878h);
        return true;
    }
}
