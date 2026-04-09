package kf;

import io.sentry.android.core.e0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f14324g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f14325a;

    /* renamed from: d, reason: collision with root package name */
    public k f14326d;

    public l(File file) {
        this.f14325a = file;
    }

    public final void a() {
        File file = this.f14325a;
        if (this.f14326d == null) {
            try {
                this.f14326d = new k(file);
            } catch (IOException e4) {
                e0.c("FirebaseCrashlytics", "Could not open log file: " + file, e4);
            }
        }
    }

    @Override // kf.c
    public final void b() throws IOException {
        hf.f.b(this.f14326d, "There was a problem closing the Crashlytics log file.");
        this.f14326d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // kf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            java.io.File r0 = r7.f14325a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3a
        Lc:
            r7.a()
            kf.k r0 = r7.f14326d
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.R()
            byte[] r0 = new byte[r0]
            kf.k r4 = r7.f14326d     // Catch: java.io.IOException -> L29
            kf.e r5 = new kf.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.h(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            io.sentry.android.core.e0.c(r6, r5, r4)
        L31:
            ag.b r4 = new ag.b
            r3 = r3[r1]
            r5 = 8
            r4.<init>(r3, r5, r0)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r2
            goto L49
        L3e:
            int r0 = r4.f345d
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f346g
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kf.l.f14324g
            r0.<init>(r3, r1)
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.l.e():java.lang.String");
    }

    @Override // kf.c
    public final void h(long j, String str) {
        a();
        if (this.f14326d == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f14326d.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f14324g));
            while (!this.f14326d.i() && this.f14326d.R() > 65536) {
                this.f14326d.y();
            }
        } catch (IOException e4) {
            e0.c("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e4);
        }
    }
}
