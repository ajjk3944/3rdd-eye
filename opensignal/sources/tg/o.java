package tg;

import android.os.Build;
import com.google.android.gms.internal.measurement.e5;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* loaded from: classes.dex */
public final class o implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22823a;

    public static d4.c0 b(d4.z0 z0Var, a2.g gVar, bu.c cVar, ar.a aVar) {
        mq.w wVar = mq.w.f16945a;
        pq.c cVar2 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new d4.c0(new d4.g0(z0Var, new as.d(7, cVar), aVar), e5.H(new a8.h(wVar, cVar2, 5)), gVar, cVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new d4.c0(new d4.g0(z0Var, d4.f0.f6804d, aVar), e5.H(new a8.h(wVar, cVar2, 5)), gVar, cVar);
        }
    }

    public static void c(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && br.l.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e4) {
                throw new IOException("Failed to create directory: " + parentFile, e4);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(fg.e r9, rq.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof tg.t
            if (r0 == 0) goto L13
            r0 = r10
            tg.t r0 = (tg.t) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            tg.t r0 = new tg.t
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f22851x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.f22850r
            java.lang.String r9 = (java.lang.String) r9
            lf.t1.G(r10)     // Catch: java.lang.Exception -> L32
            goto L8d
        L32:
            r10 = move-exception
            goto L94
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f22850r
            fg.e r9 = (fg.e) r9
            lf.t1.G(r10)     // Catch: java.lang.Exception -> L45
            goto L64
        L45:
            r10 = move-exception
            goto L70
        L47:
            lf.t1.G(r10)
            r10 = r9
            fg.d r10 = (fg.d) r10     // Catch: java.lang.Exception -> L45
            dd.r r9 = r10.d()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "getToken(...)"
            br.l.d(r9, r2)     // Catch: java.lang.Exception -> L6c
            r0.f22850r = r10     // Catch: java.lang.Exception -> L6c
            r0.B = r5     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = com.google.android.gms.internal.measurement.i4.f(r9, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r1) goto L61
            goto L8c
        L61:
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            fg.a r10 = (fg.a) r10     // Catch: java.lang.Exception -> L45
            java.lang.String r10 = r10.f8838a     // Catch: java.lang.Exception -> L45
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L6c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.String r2 = "Error getting authentication token."
            io.sentry.android.core.e0.q(r3, r2, r10)
            r10 = r9
            r9 = r6
        L77:
            fg.d r10 = (fg.d) r10     // Catch: java.lang.Exception -> L32
            dd.r r10 = r10.c()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "getId(...)"
            br.l.d(r10, r2)     // Catch: java.lang.Exception -> L32
            r0.f22850r = r9     // Catch: java.lang.Exception -> L32
            r0.B = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = com.google.android.gms.internal.measurement.i4.f(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto L8d
        L8c:
            return r1
        L8d:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L92
            goto L99
        L92:
            r6 = r10
            goto L99
        L94:
            java.lang.String r0 = "Error getting Firebase installation id ."
            io.sentry.android.core.e0.q(r3, r0, r10)
        L99:
            tg.u r10 = new tg.u
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.o.a(fg.e, rq.c):java.lang.Object");
    }

    @Override // kq.a
    public Object get() {
        switch (this.f22823a) {
            case 1:
                return e1.f22767a;
            default:
                return f1.f22777a;
        }
    }
}
