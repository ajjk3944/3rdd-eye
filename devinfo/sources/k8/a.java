package k8;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.d5;
import j6.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import x7.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final i f28069f = new i(2);
    public static final b8.c g = new b8.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f28070a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28071b;

    /* renamed from: e, reason: collision with root package name */
    public final yb.i f28074e;

    /* renamed from: d, reason: collision with root package name */
    public final i f28073d = f28069f;

    /* renamed from: c, reason: collision with root package name */
    public final b8.c f28072c = g;

    public a(Context context, ArrayList arrayList, a8.b bVar, a8.g gVar) {
        this.f28070a = context.getApplicationContext();
        this.f28071b = arrayList;
        this.f28074e = new yb.i(bVar, false, gVar, 29);
    }

    public static int d(w7.b bVar, int i4, int i10) {
        int iMin = Math.min(bVar.g / i10, bVar.f36512f / i4);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbN = r5.c.n(iMax, "Downsampling GIF, sampleSize: ", ", target dimens: [", i4, "x");
            sbN.append(i10);
            sbN.append("], actual dimens: [");
            sbN.append(bVar.f36512f);
            sbN.append("x");
            sbN.append(bVar.g);
            sbN.append("]");
            Log.v("BufferGifDecoder", sbN.toString());
        }
        return iMax;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // x7.j
    public final z7.y a(java.lang.Object r8, int r9, int r10, x7.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            b8.c r8 = r7.f28072c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f2072a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            w7.c r0 = (w7.c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            w7.c r0 = new w7.c     // Catch: java.lang.Throwable -> L17
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
            r5.f36517b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f36516a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            w7.b r0 = new w7.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f36518c = r0     // Catch: java.lang.Throwable -> L54
            r5.f36519d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f36517b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f36517b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            i8.d r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            b8.c r9 = r1.f28072c
            r9.c(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            b8.c r9 = r1.f28072c
            r9.c(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: k8.a.a(java.lang.Object, int, int, x7.h):z7.y");
    }

    @Override // x7.j
    public final boolean b(Object obj, x7.h hVar) {
        return !((Boolean) hVar.c(g.f28105b)).booleanValue() && d5.m(this.f28071b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final i8.d c(ByteBuffer byteBuffer, int i4, int i10, w7.c cVar, x7.h hVar) {
        StringBuilder sb2;
        int i11 = t8.h.f34512b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            w7.b bVarB = cVar.b();
            i8.d dVar = null;
            if (bVarB.f36509c > 0 && bVarB.f36508b == 0) {
                Bitmap.Config config = hVar.c(g.f28104a) == x7.a.f36994b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(bVarB, i4, i10);
                i iVar = this.f28073d;
                yb.i iVar2 = this.f28074e;
                iVar.getClass();
                w7.d dVar2 = new w7.d(iVar2, bVarB, byteBuffer, iD);
                dVar2.c(config);
                dVar2.f36528k = (dVar2.f36528k + 1) % dVar2.f36529l.f36509c;
                Bitmap bitmapB = dVar2.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                dVar = new i8.d(new b(new k6.d(1, new f(com.bumptech.glide.b.a(this.f28070a), dVar2, i4, i10, bitmapB))), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return dVar;
                }
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(t8.h.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return dVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(t8.h.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return dVar;
            }
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + t8.h.a(jElapsedRealtimeNanos));
            }
            throw th2;
        }
    }
}
