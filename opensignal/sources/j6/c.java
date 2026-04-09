package j6;

import a5.d0;
import a5.n;
import a5.v;
import android.util.SparseArray;
import androidx.media3.common.k0;
import h7.r1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ne.g;
import u5.a0;
import u5.k;
import u5.l;
import u5.m;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f13376c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f13377d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f13378e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f13379f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f13380g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f13381h0;
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
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final ha.b f13382a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13383a0;

    /* renamed from: b, reason: collision with root package name */
    public final d f13384b;

    /* renamed from: b0, reason: collision with root package name */
    public m f13385b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f13386c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13387d;

    /* renamed from: e, reason: collision with root package name */
    public final v f13388e;

    /* renamed from: f, reason: collision with root package name */
    public final v f13389f;

    /* renamed from: g, reason: collision with root package name */
    public final v f13390g;

    /* renamed from: h, reason: collision with root package name */
    public final v f13391h;

    /* renamed from: i, reason: collision with root package name */
    public final v f13392i;
    public final v j;
    public final v k;

    /* renamed from: l, reason: collision with root package name */
    public final v f13393l;

    /* renamed from: m, reason: collision with root package name */
    public final v f13394m;

    /* renamed from: n, reason: collision with root package name */
    public final v f13395n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f13396o;

    /* renamed from: p, reason: collision with root package name */
    public long f13397p;

    /* renamed from: q, reason: collision with root package name */
    public long f13398q;

    /* renamed from: r, reason: collision with root package name */
    public long f13399r;

    /* renamed from: s, reason: collision with root package name */
    public long f13400s;

    /* renamed from: t, reason: collision with root package name */
    public long f13401t;

    /* renamed from: u, reason: collision with root package name */
    public b f13402u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13403v;

    /* renamed from: w, reason: collision with root package name */
    public int f13404w;

    /* renamed from: x, reason: collision with root package name */
    public long f13405x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13406y;

    /* renamed from: z, reason: collision with root package name */
    public long f13407z;

    static {
        int i10 = d0.f105a;
        f13377d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(g.f17524c);
        f13378e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13379f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13380g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        c7.a.w(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        c7.a.w(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13381h0 = Collections.unmodifiableMap(map);
    }

    public c(int i10) {
        ha.b bVar = new ha.b(1);
        this.f13398q = -1L;
        this.f13399r = -9223372036854775807L;
        this.f13400s = -9223372036854775807L;
        this.f13401t = -9223372036854775807L;
        this.f13407z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f13382a = bVar;
        bVar.f10539g = new r1(13, this);
        this.f13387d = (i10 & 1) == 0;
        this.f13384b = new d();
        this.f13386c = new SparseArray();
        this.f13390g = new v(4);
        this.f13391h = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13392i = new v(4);
        this.f13388e = new v(u5.b.f23265t);
        this.f13389f = new v(4);
        this.j = new v();
        this.k = new v();
        this.f13393l = new v(8);
        this.f13394m = new v();
        this.f13395n = new v();
        this.L = new int[1];
    }

    public static byte[] e(String str, long j, long j7) {
        a5.a.e(j != -9223372036854775807L);
        int i10 = (int) (j / 3600000000L);
        long j10 = j - (i10 * 3600000000L);
        int i11 = (int) (j10 / 60000000);
        long j11 = j10 - (i11 * 60000000);
        int i12 = (int) (j11 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j11 - (i12 * 1000000)) / j7)));
        int i13 = d0.f105a;
        return str2.getBytes(g.f17524c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw k0.a(null, "Element " + i10 + " must be in a Cues");
        }
    }

    public final void b(int i10) {
        if (this.f13402u != null) {
            return;
        }
        throw k0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ha.b bVar = this.f13382a;
        bVar.f10535c = 0;
        bVar.f10534b.clear();
        d dVar = (d) bVar.f10538f;
        dVar.f13410b = 0;
        dVar.f13411c = 0;
        d dVar2 = this.f13384b;
        dVar2.f13410b = 0;
        dVar2.f13411c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f13386c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ha.d dVar3 = ((b) sparseArray.valueAt(i10)).T;
            if (dVar3 != null) {
                dVar3.f10565b = false;
                dVar3.f10566c = 0;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(j6.b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.d(j6.b, long, int, int, int):void");
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f13385b0 = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0b7a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0efc, code lost:
    
        if (r5 == false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0efe, code lost:
    
        r2 = ((u5.h) r1).f23288r;
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x0f07, code lost:
    
        if (r0.f13406y == false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0f09, code lost:
    
        r0.A = r2;
        r40.f3485a = r0.f13407z;
        r0.f13406y = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0f15, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0f16, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0f1c, code lost:
    
        if (r0.f13403v == false) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0f1e, code lost:
    
        r6 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0f24, code lost:
    
        if (r6 == (-1)) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0f26, code lost:
    
        r40.f3485a = r6;
        r0.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0f2a, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0f2b, code lost:
    
        r37 = true;
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0f31, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0f31, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e3  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r6v4, types: [u5.h] */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r39, ca.n r40) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 4772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        ag.b bVar = new ag.b(6, (byte) 0);
        v vVar = (v) bVar.f346g;
        long length = lVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i10 = (int) j;
        lVar.p(vVar.f165a, 0, 4);
        long jU = vVar.u();
        bVar.f345d = 4;
        while (true) {
            if (jU != 440786851) {
                int i11 = bVar.f345d + 1;
                bVar.f345d = i11;
                if (i11 == i10) {
                    break;
                }
                lVar.p(vVar.f165a, 0, 1);
                jU = ((jU << 8) & (-256)) | (vVar.f165a[0] & 255);
            } else {
                long jN = bVar.n(lVar);
                long j7 = bVar.f345d;
                if (jN != Long.MIN_VALUE && (length == -1 || j7 + jN < length)) {
                    while (true) {
                        long j10 = bVar.f345d;
                        long j11 = j7 + jN;
                        if (j10 < j11) {
                            if (bVar.n(lVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jN2 = bVar.n(lVar);
                            if (jN2 < 0 || jN2 > 2147483647L) {
                                break;
                            }
                            if (jN2 != 0) {
                                int i12 = (int) jN2;
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

    public final void i(l lVar, int i10) {
        v vVar = this.f13390g;
        if (vVar.f167c >= i10) {
            return;
        }
        byte[] bArr = vVar.f165a;
        if (bArr.length < i10) {
            vVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = vVar.f165a;
        int i11 = vVar.f167c;
        lVar.readFully(bArr2, i11, i10 - i11);
        vVar.D(i10);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f13383a0 = false;
        this.j.B(0);
    }

    public final long k(long j) throws k0 {
        long j7 = this.f13399r;
        if (j7 != -9223372036854775807L) {
            return d0.M(j, j7, 1000L);
        }
        throw k0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int l(l lVar, b bVar, int i10, boolean z10) throws k0 {
        int iB;
        int iB2;
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f13353b)) {
            m(lVar, f13376c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(bVar.f13353b)) {
            m(lVar, f13378e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f13353b)) {
            m(lVar, f13379f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        a0 a0Var = bVar.X;
        boolean z11 = this.V;
        v vVar = this.j;
        if (!z11) {
            boolean z12 = bVar.f13359h;
            v vVar2 = this.f13390g;
            if (z12) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(vVar2.f165a, 0, 1);
                    this.S++;
                    byte b2 = vVar2.f165a[0];
                    if ((b2 & 128) == 128) {
                        throw k0.a(null, "Extension bit is set in signal byte");
                    }
                    this.Z = b2;
                    this.W = true;
                }
                byte b10 = this.Z;
                if ((b10 & 1) == 1) {
                    boolean z13 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f13383a0) {
                        v vVar3 = this.f13393l;
                        lVar.readFully(vVar3.f165a, 0, 8);
                        this.S += 8;
                        this.f13383a0 = true;
                        vVar2.f165a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        vVar2.E(0);
                        a0Var.d(1, vVar2);
                        this.T++;
                        vVar3.E(0);
                        a0Var.d(8, vVar3);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            lVar.readFully(vVar2.f165a, 0, 1);
                            this.S++;
                            vVar2.E(0);
                            this.Y = vVar2.t();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        vVar2.B(i15);
                        lVar.readFully(vVar2.f165a, 0, i15);
                        this.S += i15;
                        short s8 = (short) ((this.Y / 2) + 1);
                        int i16 = (s8 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13396o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f13396o = ByteBuffer.allocate(i16);
                        }
                        this.f13396o.position(0);
                        this.f13396o.putShort(s8);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int iW = vVar2.w();
                            if (i17 % 2 == 0) {
                                this.f13396o.putShort((short) (iW - i18));
                            } else {
                                this.f13396o.putInt(iW - i18);
                            }
                            i17++;
                            i18 = iW;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f13396o.putInt(i19);
                        } else {
                            this.f13396o.putShort((short) i19);
                            this.f13396o.putInt(0);
                        }
                        byte[] bArrArray = this.f13396o.array();
                        v vVar4 = this.f13394m;
                        vVar4.C(i16, bArrArray);
                        a0Var.d(i16, vVar4);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = bVar.f13360i;
                if (bArr != null) {
                    vVar.C(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(bVar.f13353b) ? z10 : bVar.f13357f > 0) {
                this.O |= 268435456;
                this.f13395n.B(0);
                int i20 = (vVar.f167c + i10) - this.S;
                vVar2.B(4);
                byte[] bArr2 = vVar2.f165a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                a0Var.d(4, vVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + vVar.f167c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f13353b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f13353b)) {
            if (bVar.T != null) {
                a5.a.i(vVar.f167c == 0);
                bVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA = vVar.a();
                if (iA > 0) {
                    iB2 = Math.min(i23, iA);
                    a0Var.d(iB2, vVar);
                } else {
                    iB2 = a0Var.b(lVar, i23, false);
                }
                this.S += iB2;
                this.T += iB2;
            }
        } else {
            v vVar5 = this.f13389f;
            byte[] bArr3 = vVar5.f165a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = bVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int iMin = Math.min(i24, vVar.a());
                    lVar.readFully(bArr3, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        vVar.e(bArr3, i25, iMin);
                    }
                    this.S += i24;
                    vVar5.E(0);
                    this.U = vVar5.w();
                    v vVar6 = this.f13388e;
                    vVar6.E(0);
                    a0Var.d(4, vVar6);
                    this.T += 4;
                } else {
                    int iA2 = vVar.a();
                    if (iA2 > 0) {
                        iB = Math.min(i26, iA2);
                        a0Var.d(iB, vVar);
                    } else {
                        iB = a0Var.b(lVar, i26, false);
                    }
                    this.S += iB;
                    this.T += iB;
                    this.U -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f13353b)) {
            v vVar7 = this.f13391h;
            vVar7.E(0);
            a0Var.d(4, vVar7);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        v vVar = this.k;
        byte[] bArr2 = vVar.f165a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            vVar.getClass();
            vVar.C(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(vVar.f165a, bArr.length, i10);
        vVar.E(0);
        vVar.D(length);
    }

    @Override // u5.k
    public final void release() {
    }
}
