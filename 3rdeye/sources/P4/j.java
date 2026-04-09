package P4;

import O4.C1461g;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes2.dex */
public final class j implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f10631c = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final File f10632a;

    /* renamed from: b, reason: collision with root package name */
    public h f10633b;

    /* compiled from: QueueFileLogStore.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f10634a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10635b;

        public a(byte[] bArr, int i) {
            this.f10634a = bArr;
            this.f10635b = i;
        }
    }

    public j(File file) {
        this.f10632a = file;
    }

    @Override // P4.c
    public final void a() throws IOException {
        C1461g.b(this.f10633b, "There was a problem closing the Crashlytics log file.");
        this.f10633b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // P4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f10632a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.d()
            P4.h r0 = r7.f10633b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.F()
            byte[] r0 = new byte[r0]
            P4.h r4 = r7.f10633b     // Catch: java.io.IOException -> L29
            P4.i r5 = new P4.i     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.e(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            P4.j$a r4 = new P4.j$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L45
        L3c:
            int r0 = r4.f10635b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f10634a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L45:
            if (r3 == 0) goto L4f
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = P4.j.f10631c
            r0.<init>(r3, r1)
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.j.b():java.lang.String");
    }

    @Override // P4.c
    public final void c(long j4, String str) {
        d();
        if (this.f10633b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f10633b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j4), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f10631c));
            while (!this.f10633b.k() && this.f10633b.F() > 65536) {
                this.f10633b.A();
            }
        } catch (IOException e4) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e4);
        }
    }

    public final void d() {
        File file = this.f10632a;
        if (this.f10633b == null) {
            try {
                this.f10633b = new h(file);
            } catch (IOException e4) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e4);
            }
        }
    }
}
