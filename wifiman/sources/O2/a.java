package O2;

import B2.a;
import W2.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements C2.i {

    /* renamed from: f, reason: collision with root package name */
    private static final C0604a f16895f = new C0604a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f16896g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f16897a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16898b;

    /* renamed from: c, reason: collision with root package name */
    private final b f16899c;

    /* renamed from: d, reason: collision with root package name */
    private final C0604a f16900d;

    /* renamed from: e, reason: collision with root package name */
    private final O2.b f16901e;

    /* renamed from: O2.a$a, reason: collision with other inner class name */
    static class C0604a {
        C0604a() {
        }

        B2.a a(a.InterfaceC0044a interfaceC0044a, B2.c cVar, ByteBuffer byteBuffer, int i10) {
            return new B2.e(interfaceC0044a, cVar, byteBuffer, i10);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f16902a = l.f(0);

        b() {
        }

        synchronized B2.d a(ByteBuffer byteBuffer) {
            B2.d dVar;
            try {
                dVar = (B2.d) this.f16902a.poll();
                if (dVar == null) {
                    dVar = new B2.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(B2.d dVar) {
            dVar.a();
            this.f16902a.offer(dVar);
        }
    }

    public a(Context context, List list, F2.d dVar, F2.b bVar) {
        this(context, list, dVar, bVar, f16896g, f16895f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, B2.d dVar, C2.g gVar) {
        long jB = W2.g.b();
        try {
            B2.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = gVar.c(i.f16942a) == C2.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                B2.a aVarA = this.f16900d.a(this.f16901e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.f(config);
                aVarA.c();
                Bitmap nextFrame = aVarA.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W2.g.a(jB));
                    }
                    return null;
                }
                e eVar = new e(new c(this.f16897a, aVarA, K2.j.c(), i10, i11, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W2.g.a(jB));
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W2.g.a(jB));
            }
        }
    }

    private static int e(B2.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, C2.g gVar) {
        B2.d dVarA = this.f16899c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, gVar);
        } finally {
            this.f16899c.b(dVarA);
        }
    }

    @Override // C2.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, C2.g gVar) {
        return !((Boolean) gVar.c(i.f16943b)).booleanValue() && com.bumptech.glide.load.a.g(this.f16898b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List list, F2.d dVar, F2.b bVar, b bVar2, C0604a c0604a) {
        this.f16897a = context.getApplicationContext();
        this.f16898b = list;
        this.f16900d = c0604a;
        this.f16901e = new O2.b(dVar, bVar);
        this.f16899c = bVar2;
    }
}
