package U2;

import U2.l;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import t4.C5606d;

/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final L2.g<L2.b> f12414f = L2.g.a(L2.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final L2.g<L2.i> f12415g = new L2.g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, L2.g.f4028e);

    /* renamed from: h, reason: collision with root package name */
    public static final L2.g<Boolean> f12416h;
    public static final L2.g<Boolean> i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<String> f12417j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f12418k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f12419l;

    /* renamed from: a, reason: collision with root package name */
    public final O2.b f12420a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f12421b;

    /* renamed from: c, reason: collision with root package name */
    public final O2.g f12422c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12423d;

    /* renamed from: e, reason: collision with root package name */
    public final r f12424e = r.a();

    /* compiled from: Downsampler.java */
    public interface b {
        void a(O2.b bVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        l.e eVar = l.f12407a;
        Boolean bool = Boolean.FALSE;
        f12416h = L2.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = L2.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f12417j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12418k = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = h3.l.f38217a;
        f12419l = new ArrayDeque(0);
    }

    public m(ArrayList arrayList, DisplayMetrics displayMetrics, O2.b bVar, O2.g gVar) {
        this.f12423d = arrayList;
        C5606d.l(displayMetrics, "Argument must not be null");
        this.f12421b = displayMetrics;
        C5606d.l(bVar, "Argument must not be null");
        this.f12420a = bVar;
        C5606d.l(gVar, "Argument must not be null");
        this.f12422c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(U2.s r9, android.graphics.BitmapFactory.Options r10, U2.m.b r11, O2.b r12) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.b()
            r9.c()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = U2.z.f12463b
            r4.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = androidx.work.s.i(r6, r1, r7, r2, r8)     // Catch: java.lang.Throwable -> L66
            r1.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L66
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            r12.b(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            java.util.concurrent.locks.Lock r10 = U2.z.f12463b
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = U2.z.f12463b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.m.c(U2.s, android.graphics.BitmapFactory$Options, U2.m$b, O2.b):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = f12419l;
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

    public final e a(s sVar, int i10, int i11, L2.h hVar, b bVar) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f12422c.d(65536, byte[].class);
        synchronized (m.class) {
            ArrayDeque arrayDeque = f12419l;
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
        L2.b bVar2 = (L2.b) hVar.c(f12414f);
        L2.i iVar = (L2.i) hVar.c(f12415g);
        l lVar = (l) hVar.c(l.f12412f);
        boolean zBooleanValue = ((Boolean) hVar.c(f12416h)).booleanValue();
        L2.g<Boolean> gVar = i;
        try {
            return e.b(this.f12420a, b(sVar, options2, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, zBooleanValue, bVar));
        } finally {
            e(options2);
            this.f12422c.h(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(U2.s r42, android.graphics.BitmapFactory.Options r43, U2.l r44, L2.b r45, L2.i r46, boolean r47, int r48, int r49, boolean r50, U2.m.b r51) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.m.b(U2.s, android.graphics.BitmapFactory$Options, U2.l, L2.b, L2.i, boolean, int, int, boolean, U2.m$b):android.graphics.Bitmap");
    }

    /* compiled from: Downsampler.java */
    public class a implements b {
        @Override // U2.m.b
        public final void b() {
        }

        @Override // U2.m.b
        public final void a(O2.b bVar, Bitmap bitmap) {
        }
    }
}
