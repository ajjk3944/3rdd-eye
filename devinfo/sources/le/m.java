package le;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f28731c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f28732a;

    /* renamed from: b, reason: collision with root package name */
    public l f28733b;

    public m(File file) {
        this.f28732a = file;
    }

    @Override // le.d
    public final void a() throws IOException {
        je.g.b(this.f28733b, "There was a problem closing the Crashlytics log file.");
        this.f28733b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // le.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f28732a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3a
        Lc:
            r7.c()
            le.l r0 = r7.f28733b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.F()
            byte[] r0 = new byte[r0]
            le.l r4 = r7.f28733b     // Catch: java.io.IOException -> L29
            le.f r5 = new le.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.m(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L31:
            t7.m r4 = new t7.m
            r3 = r3[r1]
            r5 = 15
            r4.<init>(r0, r3, r5)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r2
            goto L49
        L3e:
            int r0 = r4.f34473b
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f34474c
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = le.m.f28731c
            r0.<init>(r3, r1)
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: le.m.b():java.lang.String");
    }

    public final void c() {
        File file = this.f28732a;
        if (this.f28733b == null) {
            try {
                this.f28733b = new l(file);
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e2);
            }
        }
    }

    @Override // le.d
    public final void n(long j, String str) {
        c();
        if (this.f28733b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE);
            }
            this.f28733b.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f28731c));
            while (!this.f28733b.p() && this.f28733b.F() > 65536) {
                this.f28733b.y();
            }
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e2);
        }
    }
}
