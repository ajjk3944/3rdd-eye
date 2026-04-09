package Y2;

import L2.j;
import Y2.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.s;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public final class a implements j<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    public static final C0199a f13718f = new C0199a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f13719g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13720a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13721b;

    /* renamed from: c, reason: collision with root package name */
    public final b f13722c;

    /* renamed from: d, reason: collision with root package name */
    public final C0199a f13723d;

    /* renamed from: e, reason: collision with root package name */
    public final Y2.b f13724e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    public static class C0199a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f13725a;

        public b() {
            char[] cArr = l.f38217a;
            this.f13725a = new ArrayDeque(0);
        }

        public final synchronized void a(K2.d dVar) {
            dVar.f3088b = null;
            dVar.f3089c = null;
            this.f13725a.offer(dVar);
        }
    }

    public a(Context context, ArrayList arrayList, O2.b bVar, O2.g gVar) {
        C0199a c0199a = f13718f;
        this.f13720a = context.getApplicationContext();
        this.f13721b = arrayList;
        this.f13723d = c0199a;
        this.f13724e = new Y2.b(bVar, gVar);
        this.f13722c = f13719g;
    }

    public static int d(K2.c cVar, int i, int i10) {
        int iMin = Math.min(cVar.f3083g / i10, cVar.f3082f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbI = s.i("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbI.append(i10);
            sbI.append("], actual dimens: [");
            sbI.append(cVar.f3082f);
            sbI.append("x");
            sbI.append(cVar.f3083g);
            sbI.append("]");
            Log.v("BufferGifDecoder", sbI.toString());
        }
        return iMax;
    }

    @Override // L2.j
    public final boolean a(ByteBuffer byteBuffer, L2.h hVar) throws IOException {
        return !((Boolean) hVar.c(h.f13762b)).booleanValue() && com.bumptech.glide.load.a.c(this.f13721b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // L2.j
    public final N2.u<Y2.c> b(java.nio.ByteBuffer r8, int r9, int r10, L2.h r11) throws java.io.IOException {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            Y2.a$b r8 = r7.f13722c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f13725a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            K2.d r0 = (K2.d) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            K2.d r0 = new K2.d     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f3088b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f3087a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            K2.c r0 = new K2.c     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f3089c = r0     // Catch: java.lang.Throwable -> L54
            r5.f3090d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f3088b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f3088b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            Y2.d r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            Y2.a$b r9 = r1.f13722c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            Y2.a$b r9 = r1.f13722c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.b(java.lang.Object, int, int, L2.h):N2.u");
    }

    public final d c(ByteBuffer byteBuffer, int i, int i10, K2.d dVar, L2.h hVar) {
        StringBuilder sb;
        int i11 = h3.h.f38207b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            K2.c cVarB = dVar.b();
            if (cVarB.f3079c > 0 && cVarB.f3078b == 0) {
                Bitmap.Config config = hVar.c(h.f13761a) == L2.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(cVarB, i, i10);
                C0199a c0199a = this.f13723d;
                Y2.b bVar = this.f13724e;
                c0199a.getClass();
                K2.e eVar = new K2.e(bVar, cVarB, byteBuffer, iD);
                eVar.d(config);
                eVar.b();
                Bitmap bitmapA = eVar.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(h3.h.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                d dVar2 = new d(new c(new c.a(new f(com.bumptech.glide.b.a(this.f13720a), eVar, i, i10, T2.b.f12247b, bitmapA))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + h3.h.a(jElapsedRealtimeNanos));
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(h3.h.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + h3.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
