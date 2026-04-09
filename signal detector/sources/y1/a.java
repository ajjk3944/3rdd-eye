package y1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import h0.C2352b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k1.C2620b;
import k1.C2621c;
import l1.EnumC2635a;
import l1.j;
import o1.InterfaceC2753a;
import t2.q;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final p1.e f24206f = new p1.e(21);

    /* renamed from: g, reason: collision with root package name */
    public static final C2352b f24207g = new C2352b(17);

    /* renamed from: a, reason: collision with root package name */
    public final Context f24208a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24209b;

    /* renamed from: e, reason: collision with root package name */
    public final q f24212e;

    /* renamed from: d, reason: collision with root package name */
    public final p1.e f24211d = f24206f;

    /* renamed from: c, reason: collision with root package name */
    public final C2352b f24210c = f24207g;

    public a(Context context, ArrayList arrayList, InterfaceC2753a interfaceC2753a, C0752Tp c0752Tp) {
        this.f24208a = context.getApplicationContext();
        this.f24209b = arrayList;
        this.f24212e = new q(interfaceC2753a, 4, c0752Tp);
    }

    public static int d(C2620b c2620b, int i, int i3) {
        int iMin = Math.min(c2620b.f21753g / i3, c2620b.f21752f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i3 + "], actual dimens: [" + c2620b.f21752f + "x" + c2620b.f21753g + "]");
        }
        return iMax;
    }

    @Override // l1.j
    public final boolean a(Object obj, l1.h hVar) {
        return !((Boolean) hVar.c(g.f24246b)).booleanValue() && R2.a.s(this.f24209b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // l1.j
    public final n1.z b(java.lang.Object r8, int r9, int r10, l1.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            h0.b r8 = r7.f24210c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f20444b     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            k1.c r0 = (k1.C2621c) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            k1.c r0 = new k1.c     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.f21758b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.f21757a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            k1.b r0 = new k1.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.f21759c = r0     // Catch: java.lang.Throwable -> L56
            r5.f21760d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.f21758b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.f21758b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            w1.c r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            h0.b r9 = r1.f24210c
            r9.p(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            h0.b r9 = r1.f24210c
            r9.p(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.a.b(java.lang.Object, int, int, l1.h):n1.z");
    }

    public final w1.c c(ByteBuffer byteBuffer, int i, int i3, C2621c c2621c, l1.h hVar) {
        StringBuilder sb;
        int i6 = H1.j.f1768b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C2620b c2620bB = c2621c.b();
            w1.c cVar = null;
            if (c2620bB.f21749c > 0 && c2620bB.f21748b == 0) {
                Bitmap.Config config = hVar.c(g.f24245a) == EnumC2635a.f21813b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(c2620bB, i, i3);
                p1.e eVar = this.f24211d;
                q qVar = this.f24212e;
                eVar.getClass();
                k1.d dVar = new k1.d(qVar, c2620bB, byteBuffer, iD);
                dVar.c(config);
                dVar.f21770k = (dVar.f21770k + 1) % dVar.f21771l.f21749c;
                Bitmap bitmapB = dVar.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                cVar = new w1.c(new b(new M0.e(2, new f(com.bumptech.glide.b.a(this.f24208a), dVar, i, i3, bitmapB))), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return cVar;
                }
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(H1.j.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return cVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(H1.j.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return cVar;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + H1.j.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
