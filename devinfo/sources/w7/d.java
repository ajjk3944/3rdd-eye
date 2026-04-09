package w7;

import a8.g;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f36520a;

    /* renamed from: c, reason: collision with root package name */
    public final i f36522c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f36523d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f36524e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f36525f;
    public byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f36526h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f36527i;
    public final int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f36528k;

    /* renamed from: l, reason: collision with root package name */
    public b f36529l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f36530m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36531n;

    /* renamed from: o, reason: collision with root package name */
    public int f36532o;

    /* renamed from: p, reason: collision with root package name */
    public final int f36533p;

    /* renamed from: q, reason: collision with root package name */
    public final int f36534q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36535r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f36536s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f36521b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f36537t = Bitmap.Config.ARGB_8888;

    public d(i iVar, b bVar, ByteBuffer byteBuffer, int i4) {
        this.f36522c = iVar;
        this.f36529l = new b();
        synchronized (this) {
            try {
                if (i4 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
                }
                int iHighestOneBit = Integer.highestOneBit(i4);
                int i10 = 0;
                this.f36532o = 0;
                this.f36529l = bVar;
                this.f36528k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f36523d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f36523d.order(ByteOrder.LITTLE_ENDIAN);
                this.f36531n = false;
                ArrayList arrayList = bVar.f36511e;
                int size = arrayList.size();
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((a) obj).g == 3) {
                        this.f36531n = true;
                        break;
                    }
                }
                this.f36533p = iHighestOneBit;
                int i11 = bVar.f36512f;
                this.f36535r = i11 / iHighestOneBit;
                int i12 = bVar.g;
                this.f36534q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                g gVar = (g) this.f36522c.f37517c;
                this.f36527i = gVar == null ? new byte[i13] : (byte[]) gVar.e(i13, byte[].class);
                i iVar2 = this.f36522c;
                int i14 = this.f36535r * this.f36534q;
                g gVar2 = (g) iVar2.f37517c;
                this.j = gVar2 == null ? new int[i14] : (int[]) gVar2.e(i14, int[].class);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f36536s;
        Bitmap bitmapA = ((a8.b) this.f36522c.f37516b).a(this.f36535r, this.f36534q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f36537t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f36529l.f36509c <= 0 || this.f36528k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f36529l.f36509c + ", framePointer=" + this.f36528k);
                }
                this.f36532o = 1;
            }
            int i4 = this.f36532o;
            if (i4 != 1 && i4 != 2) {
                this.f36532o = 0;
                if (this.f36524e == null) {
                    g gVar = (g) this.f36522c.f37517c;
                    this.f36524e = gVar == null ? new byte[255] : (byte[]) gVar.e(255, byte[].class);
                }
                a aVar = (a) this.f36529l.f36511e.get(this.f36528k);
                int i10 = this.f36528k - 1;
                a aVar2 = i10 >= 0 ? (a) this.f36529l.f36511e.get(i10) : null;
                int[] iArr = aVar.f36506k;
                if (iArr == null) {
                    iArr = this.f36529l.f36507a;
                }
                this.f36520a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f36528k);
                    }
                    this.f36532o = 1;
                    return null;
                }
                if (aVar.f36503f) {
                    System.arraycopy(iArr, 0, this.f36521b, 0, iArr.length);
                    int[] iArr2 = this.f36521b;
                    this.f36520a = iArr2;
                    iArr2[aVar.f36504h] = 0;
                    if (aVar.g == 2 && this.f36528k == 0) {
                        this.f36536s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f36532o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f36537t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc A[PHI: r5
  0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(w7.a r36, w7.a r37) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.d.d(w7.a, w7.a):android.graphics.Bitmap");
    }
}
