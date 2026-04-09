package io.sentry;

import java.io.File;

/* loaded from: classes.dex */
public final class b0 extends w {

    /* renamed from: e, reason: collision with root package name */
    public final b1 f12067e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f12068f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f12069g;

    public b0(b1 b1Var, g1 g1Var, u0 u0Var, long j, int i10) {
        super(b1Var, u0Var, j, i10);
        ir.f0.T(b1Var, "Scopes are required.");
        this.f12067e = b1Var;
        ir.f0.T(g1Var, "Serializer is required.");
        this.f12068f = g1Var;
        ir.f0.T(u0Var, "Logger is required.");
        this.f12069g = u0Var;
    }

    public static void c(b0 b0Var, File file, io.sentry.hints.g gVar) {
        u0 u0Var = b0Var.f12069g;
        if (gVar.a()) {
            u0Var.m(b5.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                u0Var.m(b5.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th2) {
            u0Var.f(b5.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        u0Var.m(b5.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        c(r7, r8, (io.sentry.hints.g) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        return;
     */
    @Override // io.sentry.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.File r8, io.sentry.h0 r9) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.b0.b(java.io.File, io.sentry.h0):void");
    }
}
