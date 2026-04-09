package K2;

import K2.a;
import O2.g;
import android.graphics.Bitmap;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3091a;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0054a f3093c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f3094d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3095e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f3096f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f3097g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f3098h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3099j;

    /* renamed from: k, reason: collision with root package name */
    public int f3100k;

    /* renamed from: l, reason: collision with root package name */
    public c f3101l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f3102m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3103n;

    /* renamed from: o, reason: collision with root package name */
    public int f3104o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3105p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3106q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3107r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f3108s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3092b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f3109t = Bitmap.Config.ARGB_8888;

    public e(a.InterfaceC0054a interfaceC0054a, c cVar, ByteBuffer byteBuffer, int i) {
        this.f3093c = interfaceC0054a;
        this.f3101l = new c();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f3104o = 0;
                this.f3101l = cVar;
                this.f3100k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3094d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3094d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3103n = false;
                Iterator it = cVar.f3081e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f3073g == 3) {
                        this.f3103n = true;
                        break;
                    }
                }
                this.f3105p = iHighestOneBit;
                int i10 = cVar.f3082f;
                this.f3107r = i10 / iHighestOneBit;
                int i11 = cVar.f3083g;
                this.f3106q = i11 / iHighestOneBit;
                int i12 = i10 * i11;
                g gVar = ((Y2.b) this.f3093c).f13727b;
                this.i = gVar == null ? new byte[i12] : (byte[]) gVar.d(i12, byte[].class);
                a.InterfaceC0054a interfaceC0054a2 = this.f3093c;
                int i13 = this.f3107r * this.f3106q;
                g gVar2 = ((Y2.b) interfaceC0054a2).f13727b;
                this.f3099j = gVar2 == null ? new int[i13] : (int[]) gVar2.d(i13, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K2.a
    public final synchronized Bitmap a() {
        try {
            if (this.f3101l.f3079c <= 0 || this.f3100k < 0) {
                if (Log.isLoggable(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, 3)) {
                    Log.d(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Unable to decode frame, frameCount=" + this.f3101l.f3079c + ", framePointer=" + this.f3100k);
                }
                this.f3104o = 1;
            }
            int i = this.f3104o;
            if (i != 1 && i != 2) {
                this.f3104o = 0;
                if (this.f3095e == null) {
                    g gVar = ((Y2.b) this.f3093c).f13727b;
                    this.f3095e = gVar == null ? new byte[KotlinVersion.MAX_COMPONENT_VALUE] : (byte[]) gVar.d(KotlinVersion.MAX_COMPONENT_VALUE, byte[].class);
                }
                b bVar = (b) this.f3101l.f3081e.get(this.f3100k);
                int i10 = this.f3100k - 1;
                b bVar2 = i10 >= 0 ? (b) this.f3101l.f3081e.get(i10) : null;
                int[] iArr = bVar.f3076k;
                if (iArr == null) {
                    iArr = this.f3101l.f3077a;
                }
                this.f3091a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, 3)) {
                        Log.d(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "No valid color table found for frame #" + this.f3100k);
                    }
                    this.f3104o = 1;
                    return null;
                }
                if (bVar.f3072f) {
                    System.arraycopy(iArr, 0, this.f3092b, 0, iArr.length);
                    int[] iArr2 = this.f3092b;
                    this.f3091a = iArr2;
                    iArr2[bVar.f3074h] = 0;
                    if (bVar.f3073g == 2 && this.f3100k == 0) {
                        this.f3108s = Boolean.TRUE;
                    }
                }
                return e(bVar, bVar2);
            }
            if (Log.isLoggable(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, 3)) {
                Log.d(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Unable to decode frame, status=" + this.f3104o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.f3100k = (this.f3100k + 1) % this.f3101l.f3079c;
    }

    public final Bitmap c() {
        Boolean bool = this.f3108s;
        Bitmap bitmapA = ((Y2.b) this.f3093c).f13726a.a(this.f3107r, this.f3106q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3109t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f3109t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(K2.b r36, K2.b r37) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.e.e(K2.b, K2.b):android.graphics.Bitmap");
    }
}
