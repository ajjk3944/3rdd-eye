package ha;

import a5.n;
import android.util.SparseArray;
import ca.k;
import ca.l;
import ca.m;
import com.google.android.exoplayer2.y0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ne.g;
import qb.v;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: b0, reason: collision with root package name */
    public static final byte[] f10571b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f10572c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f10573d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final UUID f10574e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Map f10575f0;
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f10576a;

    /* renamed from: a0, reason: collision with root package name */
    public m f10577a0;

    /* renamed from: b, reason: collision with root package name */
    public final f f10578b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f10579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10580d;

    /* renamed from: e, reason: collision with root package name */
    public final fb.f f10581e;

    /* renamed from: f, reason: collision with root package name */
    public final fb.f f10582f;

    /* renamed from: g, reason: collision with root package name */
    public final fb.f f10583g;

    /* renamed from: h, reason: collision with root package name */
    public final fb.f f10584h;

    /* renamed from: i, reason: collision with root package name */
    public final fb.f f10585i;
    public final fb.f j;
    public final fb.f k;

    /* renamed from: l, reason: collision with root package name */
    public final fb.f f10586l;

    /* renamed from: m, reason: collision with root package name */
    public final fb.f f10587m;

    /* renamed from: n, reason: collision with root package name */
    public final fb.f f10588n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f10589o;

    /* renamed from: p, reason: collision with root package name */
    public long f10590p;

    /* renamed from: q, reason: collision with root package name */
    public long f10591q;

    /* renamed from: r, reason: collision with root package name */
    public long f10592r;

    /* renamed from: s, reason: collision with root package name */
    public long f10593s;

    /* renamed from: t, reason: collision with root package name */
    public long f10594t;

    /* renamed from: u, reason: collision with root package name */
    public c f10595u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10596v;

    /* renamed from: w, reason: collision with root package name */
    public int f10597w;

    /* renamed from: x, reason: collision with root package name */
    public long f10598x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10599y;

    /* renamed from: z, reason: collision with root package name */
    public long f10600z;

    static {
        int i10 = v.f20828a;
        f10572c0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(g.f17524c);
        f10573d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f10574e0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        c7.a.w(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        c7.a.w(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f10575f0 = Collections.unmodifiableMap(map);
    }

    public e(int i10) {
        b bVar = new b(0);
        this.f10591q = -1L;
        this.f10592r = -9223372036854775807L;
        this.f10593s = -9223372036854775807L;
        this.f10594t = -9223372036854775807L;
        this.f10600z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f10576a = bVar;
        bVar.f10539g = new a2.g(this);
        this.f10580d = (i10 & 1) == 0;
        this.f10578b = new f();
        this.f10579c = new SparseArray();
        this.f10583g = new fb.f(4);
        this.f10584h = new fb.f(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10585i = new fb.f(4);
        this.f10581e = new fb.f(qb.b.f20760c);
        this.f10582f = new fb.f(4);
        this.j = new fb.f();
        this.k = new fb.f();
        this.f10586l = new fb.f(8);
        this.f10587m = new fb.f();
        this.f10588n = new fb.f();
        this.L = new int[1];
    }

    public static byte[] e(String str, long j, long j7) {
        qb.b.g(j != -9223372036854775807L);
        int i10 = (int) (j / 3600000000L);
        long j10 = j - ((i10 * 3600) * 1000000);
        int i11 = (int) (j10 / 60000000);
        long j11 = j10 - ((i11 * 60) * 1000000);
        int i12 = (int) (j11 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j11 - (i12 * 1000000)) / j7)));
        int i13 = v.f20828a;
        return str2.getBytes(g.f17524c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw y0.a(null, sb2.toString());
        }
    }

    public final void b(int i10) {
        if (this.f10595u != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw y0.a(null, sb2.toString());
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f10576a;
        bVar.f10535c = 0;
        bVar.f10534b.clear();
        f fVar = (f) bVar.f10538f;
        fVar.f10603b = 0;
        fVar.f10604c = 0;
        f fVar2 = this.f10578b;
        fVar2.f10603b = 0;
        fVar2.f10604c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f10579c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            d dVar = ((c) sparseArray.valueAt(i10)).T;
            if (dVar != null) {
                dVar.f10565b = false;
                dVar.f10566c = 0;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(ha.c r14, long r15, int r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.e.d(ha.c, long, int, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0b24, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0ec2, code lost:
    
        if (r5 == false) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0ec4, code lost:
    
        r1 = ((ca.h) r0).f3478r;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0ecd, code lost:
    
        if (r3.f10599y == false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ecf, code lost:
    
        r3.A = r1;
        r40.f3485a = r3.f10600z;
        r3.f10599y = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0edb, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0edc, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0ee2, code lost:
    
        if (r3.f10596v == false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0ee4, code lost:
    
        r6 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0eea, code lost:
    
        if (r6 == (-1)) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0eec, code lost:
    
        r40.f3485a = r6;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ef0, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0ef1, code lost:
    
        r37 = true;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ef7, code lost:
    
        r0 = r3;
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0ef7, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d8  */
    /* JADX WARN: Type inference failed for: r15v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r5v38, types: [ca.h] */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r39, ca.n r40) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 4716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.e.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        ag.b bVar = new ag.b(3, (byte) 0);
        fb.f fVar = (fb.f) bVar.f346g;
        long length = lVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i10 = (int) j;
        lVar.p(fVar.f8800a, 0, 4);
        long jP = fVar.p();
        bVar.f345d = 4;
        while (true) {
            if (jP != 440786851) {
                int i11 = bVar.f345d + 1;
                bVar.f345d = i11;
                if (i11 == i10) {
                    break;
                }
                lVar.p(fVar.f8800a, 0, 1);
                jP = ((jP << 8) & (-256)) | (fVar.f8800a[0] & 255);
            } else {
                long jM = bVar.m(lVar);
                long j7 = bVar.f345d;
                if (jM != Long.MIN_VALUE && (length == -1 || j7 + jM < length)) {
                    while (true) {
                        long j10 = bVar.f345d;
                        long j11 = j7 + jM;
                        if (j10 < j11) {
                            if (bVar.m(lVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jM2 = bVar.m(lVar);
                            if (jM2 < 0 || jM2 > 2147483647L) {
                                break;
                            }
                            if (jM2 != 0) {
                                int i12 = (int) jM2;
                                lVar.g(i12);
                                bVar.f345d += i12;
                            }
                        } else if (j10 == j11) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f10577a0 = mVar;
    }

    public final void i(l lVar, int i10) {
        fb.f fVar = this.f10583g;
        if (fVar.f8802c >= i10) {
            return;
        }
        byte[] bArr = fVar.f8800a;
        if (bArr.length < i10) {
            fVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = fVar.f8800a;
        int i11 = fVar.f8802c;
        lVar.readFully(bArr2, i11, i10 - i11);
        fVar.x(i10);
    }

    public final void j() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.v(0);
    }

    public final long k(long j) throws y0 {
        long j7 = this.f10592r;
        if (j7 != -9223372036854775807L) {
            return v.H(j, j7, 1000L);
        }
        throw y0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(ca.l r18, ha.c r19, int r20) throws com.google.android.exoplayer2.y0 {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.e.l(ca.l, ha.c, int):int");
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        fb.f fVar = this.k;
        byte[] bArr2 = fVar.f8800a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            fVar.getClass();
            fVar.w(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(fVar.f8800a, bArr.length, i10);
        fVar.y(0);
        fVar.x(length);
    }

    @Override // ca.k
    public final void release() {
    }
}
