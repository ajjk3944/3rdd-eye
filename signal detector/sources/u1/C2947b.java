package u1;

import com.google.android.gms.internal.ads.C0752Tp;
import l1.C2641g;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2947b implements l1.k {

    /* renamed from: b, reason: collision with root package name */
    public static final C2641g f23727b = C2641g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final C2641g f23728c = new C2641g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2641g.f21818e);

    /* renamed from: a, reason: collision with root package name */
    public final C0752Tp f23729a;

    public C2947b(C0752Tp c0752Tp) {
        this.f23729a = c0752Tp;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // l1.InterfaceC2636b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r9, java.io.File r10, l1.h r11) throws java.lang.Throwable {
        /*
            r8 = this;
            n1.z r9 = (n1.z) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            l1.g r1 = u1.C2947b.f23728c
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = H1.j.f1768b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            l1.g r5 = u1.C2947b.f23727b
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Tp r10 = r8.f23729a
            if (r10 == 0) goto L4f
            com.bumptech.glide.load.data.b r6 = new com.bumptech.glide.load.data.b     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            goto L50
        L48:
            r9 = move-exception
            r6 = r7
            goto Lbc
        L4c:
            r10 = move-exception
            r6 = r7
            goto L61
        L4f:
            r6 = r7
        L50:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            goto L5c
        L5a:
            r9 = move-exception
            goto Lc2
        L5c:
            r10 = 1
            goto L73
        L5e:
            r9 = move-exception
            goto Lbc
        L60:
            r10 = move-exception
        L61:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L6d
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L5e
        L6d:
            if (r6 == 0) goto L72
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L72
        L72:
            r10 = 0
        L73:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lbb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = H1.p.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = H1.j.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lbb:
            return r10
        Lbc:
            if (r6 == 0) goto Lc3
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lc3
            goto Lc3
        Lc2:
            throw r9
        Lc3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C2947b.l(java.lang.Object, java.io.File, l1.h):boolean");
    }

    @Override // l1.k
    public final int o(l1.h hVar) {
        return 2;
    }
}
