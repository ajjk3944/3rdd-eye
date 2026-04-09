package k1;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.ads.C0752Tp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import o1.InterfaceC2753a;
import t2.q;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21761a;

    /* renamed from: c, reason: collision with root package name */
    public final q f21763c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f21764d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f21765e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f21766f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f21767g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f21768h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f21769j;

    /* renamed from: k, reason: collision with root package name */
    public int f21770k;

    /* renamed from: l, reason: collision with root package name */
    public C2620b f21771l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f21772m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21773n;

    /* renamed from: o, reason: collision with root package name */
    public int f21774o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21775p;

    /* renamed from: q, reason: collision with root package name */
    public final int f21776q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21777r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f21778s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f21762b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f21779t = Bitmap.Config.ARGB_8888;

    public d(q qVar, C2620b c2620b, ByteBuffer byteBuffer, int i) {
        this.f21763c = qVar;
        this.f21771l = new C2620b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i3 = 0;
                this.f21774o = 0;
                this.f21771l = c2620b;
                this.f21770k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f21764d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f21764d.order(ByteOrder.LITTLE_ENDIAN);
                this.f21773n = false;
                ArrayList arrayList = c2620b.f21751e;
                int size = arrayList.size();
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (((C2619a) obj).f21743g == 3) {
                        this.f21773n = true;
                        break;
                    }
                }
                this.f21775p = iHighestOneBit;
                int i6 = c2620b.f21752f;
                this.f21777r = i6 / iHighestOneBit;
                int i7 = c2620b.f21753g;
                this.f21776q = i7 / iHighestOneBit;
                int i8 = i6 * i7;
                C0752Tp c0752Tp = (C0752Tp) this.f21763c.f23649c;
                this.i = c0752Tp == null ? new byte[i8] : (byte[]) c0752Tp.e(i8, byte[].class);
                q qVar2 = this.f21763c;
                int i9 = this.f21777r * this.f21776q;
                C0752Tp c0752Tp2 = (C0752Tp) qVar2.f23649c;
                this.f21769j = c0752Tp2 == null ? new int[i9] : (int[]) c0752Tp2.e(i9, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f21778s;
        Bitmap bitmapA = ((InterfaceC2753a) this.f21763c.f23648b).a(this.f21777r, this.f21776q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f21779t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f21771l.f21749c <= 0 || this.f21770k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f21771l.f21749c + ", framePointer=" + this.f21770k);
                }
                this.f21774o = 1;
            }
            int i = this.f21774o;
            if (i != 1 && i != 2) {
                this.f21774o = 0;
                if (this.f21765e == null) {
                    C0752Tp c0752Tp = (C0752Tp) this.f21763c.f23649c;
                    this.f21765e = c0752Tp == null ? new byte[255] : (byte[]) c0752Tp.e(255, byte[].class);
                }
                C2619a c2619a = (C2619a) this.f21771l.f21751e.get(this.f21770k);
                int i3 = this.f21770k - 1;
                C2619a c2619a2 = i3 >= 0 ? (C2619a) this.f21771l.f21751e.get(i3) : null;
                int[] iArr = c2619a.f21746k;
                if (iArr == null) {
                    iArr = this.f21771l.f21747a;
                }
                this.f21761a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f21770k);
                    }
                    this.f21774o = 1;
                    return null;
                }
                if (c2619a.f21742f) {
                    System.arraycopy(iArr, 0, this.f21762b, 0, iArr.length);
                    int[] iArr2 = this.f21762b;
                    this.f21761a = iArr2;
                    iArr2[c2619a.f21744h] = 0;
                    if (c2619a.f21743g == 2 && this.f21770k == 0) {
                        this.f21778s = Boolean.TRUE;
                    }
                }
                return d(c2619a, c2619a2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f21774o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f21779t = config;
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
    public final android.graphics.Bitmap d(k1.C2619a r36, k1.C2619a r37) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.d.d(k1.a, k1.a):android.graphics.Bitmap");
    }
}
