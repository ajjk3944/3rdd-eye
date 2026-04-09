package u1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import l1.C2641g;
import l1.EnumC2635a;
import o.a1;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final C2641g f23753f = C2641g.a(EnumC2635a.f21814c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final C2641g f23754g = new C2641g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2641g.f21818e);

    /* renamed from: h, reason: collision with root package name */
    public static final C2641g f23755h;
    public static final C2641g i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f23756j;

    /* renamed from: k, reason: collision with root package name */
    public static final p1.e f23757k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f23758l;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2753a f23759a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f23760b;

    /* renamed from: c, reason: collision with root package name */
    public final C0752Tp f23761c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23762d;

    /* renamed from: e, reason: collision with root package name */
    public final x f23763e = x.a();

    static {
        n nVar = n.f23745b;
        Boolean bool = Boolean.FALSE;
        f23755h = C2641g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = C2641g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f23756j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f23757k = new p1.e(12);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = H1.p.f1779a;
        f23758l = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC2753a interfaceC2753a, C0752Tp c0752Tp) {
        this.f23762d = arrayList;
        H1.g.c(displayMetrics, "Argument must not be null");
        this.f23760b = displayMetrics;
        H1.g.c(interfaceC2753a, "Argument must not be null");
        this.f23759a = interfaceC2753a;
        H1.g.c(c0752Tp, "Argument must not be null");
        this.f23761c = c0752Tp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(o.a1 r5, android.graphics.BitmapFactory.Options r6, u1.o r7, o1.InterfaceC2753a r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.c()
            int r1 = r5.f22478a
            switch(r1) {
                case 3: goto L22;
                case 4: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f22479b
            com.bumptech.glide.load.data.h r1 = (com.bumptech.glide.load.data.h) r1
            java.lang.Object r1 = r1.f6545b
            u1.y r1 = (u1.y) r1
            monitor-enter(r1)
            byte[] r2 = r1.f23778a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f23780c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = u1.AbstractC2943A.f23712b
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5c
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5c
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5b
            r8.e(r0)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            java.util.concurrent.locks.Lock r6 = u1.AbstractC2943A.f23712b
            r6.unlock()
            return r5
        L5a:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = u1.AbstractC2943A.f23712b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.p.c(o.a1, android.graphics.BitmapFactory$Options, u1.o, o1.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i3, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i3 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f23758l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
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

    public final C2949d a(a1 a1Var, int i3, int i6, l1.h hVar, o oVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f23761c.e(65536, byte[].class);
        synchronized (p.class) {
            ArrayDeque arrayDeque = f23758l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC2635a enumC2635a = (EnumC2635a) hVar.c(f23753f);
        l1.i iVar = (l1.i) hVar.c(f23754g);
        n nVar = (n) hVar.c(n.f23750g);
        boolean zBooleanValue = ((Boolean) hVar.c(f23755h)).booleanValue();
        C2641g c2641g = i;
        try {
            return C2949d.d(b(a1Var, options2, nVar, enumC2635a, iVar, hVar.c(c2641g) != null && ((Boolean) hVar.c(c2641g)).booleanValue(), i3, i6, zBooleanValue, oVar), this.f23759a);
        } finally {
            f(options2);
            this.f23761c.i(bArr);
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
    /* JADX WARN: Removed duplicated region for block: B:146:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0418 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x059f  */
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
    public final android.graphics.Bitmap b(o.a1 r43, android.graphics.BitmapFactory.Options r44, u1.n r45, l1.EnumC2635a r46, l1.i r47, boolean r48, int r49, int r50, boolean r51, u1.o r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.p.b(o.a1, android.graphics.BitmapFactory$Options, u1.n, l1.a, l1.i, boolean, int, int, boolean, u1.o):android.graphics.Bitmap");
    }
}
