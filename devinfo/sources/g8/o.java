package g8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final x7.g f24585f = x7.g.a(x7.a.f36995c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final x7.g g = new x7.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, x7.g.f36999e);

    /* renamed from: h, reason: collision with root package name */
    public static final x7.g f24586h;

    /* renamed from: i, reason: collision with root package name */
    public static final x7.g f24587i;
    public static final Set j;

    /* renamed from: k, reason: collision with root package name */
    public static final ec.z f24588k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f24589l;

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f24590a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f24591b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.g f24592c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24593d;

    /* renamed from: e, reason: collision with root package name */
    public final x f24594e = x.a();

    static {
        m mVar = m.f24578b;
        Boolean bool = Boolean.FALSE;
        f24586h = x7.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f24587i = x7.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f24588k = new ec.z(25);
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = t8.m.f34520a;
        f24589l = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, a8.b bVar, a8.g gVar) {
        this.f24593d = arrayList;
        t8.f.c(displayMetrics, "Argument must not be null");
        this.f24591b = displayMetrics;
        t8.f.c(bVar, "Argument must not be null");
        this.f24590a = bVar;
        t8.f.c(gVar, "Argument must not be null");
        this.f24592c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(yb.e r9, android.graphics.BitmapFactory.Options r10, g8.n r11, a8.b r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.g()
            int r1 = r9.f37508a
            switch(r1) {
                case 23: goto L22;
                case 24: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.f37509b
            com.bumptech.glide.load.data.h r1 = (com.bumptech.glide.load.data.h) r1
            java.lang.Object r1 = r1.f6523b
            g8.y r1 = (g8.y) r1
            monitor-enter(r1)
            byte[] r2 = r1.f24608a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f24610c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = g8.a0.f24551b
            r4.lock()
            android.graphics.Bitmap r9 = r9.k(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = r5.c.n(r1, r6, r7, r2, r8)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.d(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = g8.a0.f24551b
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = g8.a0.f24551b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.o.c(yb.e, android.graphics.BitmapFactory$Options, g8.n, a8.b):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = f24589l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(yb.e eVar, int i4, int i10, x7.h hVar, n nVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f24592c.e(65536, byte[].class);
        synchronized (o.class) {
            ArrayDeque arrayDeque = f24589l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        x7.a aVar = (x7.a) hVar.c(f24585f);
        x7.i iVar = (x7.i) hVar.c(g);
        m mVar = (m) hVar.c(m.g);
        boolean zBooleanValue = ((Boolean) hVar.c(f24586h)).booleanValue();
        x7.g gVar = f24587i;
        try {
            return c.c(this.f24590a, b(eVar, options2, mVar, aVar, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i4, i10, zBooleanValue, nVar));
        } finally {
            e(options2);
            this.f24592c.i(bArr);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(yb.e r43, android.graphics.BitmapFactory.Options r44, g8.m r45, x7.a r46, x7.i r47, boolean r48, int r49, int r50, boolean r51, g8.n r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.o.b(yb.e, android.graphics.BitmapFactory$Options, g8.m, x7.a, x7.i, boolean, int, int, boolean, g8.n):android.graphics.Bitmap");
    }
}
