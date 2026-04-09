package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v4 implements x1 {

    /* renamed from: k0, reason: collision with root package name */
    public static final byte[] f17454k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: l0, reason: collision with root package name */
    public static final byte[] f17455l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final byte[] f17456m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f17457n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final UUID f17458o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final Map f17459p0;
    public long A;
    public final SparseArray B;
    public boolean C;
    public long D;
    public int E;
    public long F;
    public long G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public int[] S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public long Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final w4 f17460a;

    /* renamed from: a0, reason: collision with root package name */
    public int f17461a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f17462b;

    /* renamed from: b0, reason: collision with root package name */
    public int f17463b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17464c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f17465c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17466d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f17467d0;

    /* renamed from: e, reason: collision with root package name */
    public final r6 f17468e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f17469e0;

    /* renamed from: f, reason: collision with root package name */
    public final sk0 f17470f;

    /* renamed from: f0, reason: collision with root package name */
    public int f17471f0;
    public final sk0 g;

    /* renamed from: g0, reason: collision with root package name */
    public byte f17472g0;

    /* renamed from: h, reason: collision with root package name */
    public final sk0 f17473h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17474h0;

    /* renamed from: i, reason: collision with root package name */
    public final sk0 f17475i;

    /* renamed from: i0, reason: collision with root package name */
    public z1 f17476i0;
    public final sk0 j;

    /* renamed from: j0, reason: collision with root package name */
    public final c2.f f17477j0;

    /* renamed from: k, reason: collision with root package name */
    public final sk0 f17478k;

    /* renamed from: l, reason: collision with root package name */
    public final sk0 f17479l;

    /* renamed from: m, reason: collision with root package name */
    public final sk0 f17480m;

    /* renamed from: n, reason: collision with root package name */
    public final sk0 f17481n;

    /* renamed from: o, reason: collision with root package name */
    public final sk0 f17482o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f17483p;

    /* renamed from: q, reason: collision with root package name */
    public long f17484q;

    /* renamed from: r, reason: collision with root package name */
    public long f17485r;

    /* renamed from: s, reason: collision with root package name */
    public long f17486s;

    /* renamed from: t, reason: collision with root package name */
    public long f17487t;

    /* renamed from: u, reason: collision with root package name */
    public long f17488u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17489v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17490w;

    /* renamed from: x, reason: collision with root package name */
    public u4 f17491x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17492y;

    /* renamed from: z, reason: collision with root package name */
    public int f17493z;

    static {
        String str = bq0.f9768a;
        f17455l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f17456m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f17457n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f17458o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        a0.g.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a0.g.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f17459p0 = DesugarCollections.unmodifiableMap(map);
    }

    public v4() {
        this(new c2.f(1), 2, r6.I8);
    }

    public static byte[] p(String str, long j, long j8) {
        mq0.m(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i4 = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i4);
        long j9 = j - (i4 * 3600000000L);
        int i10 = (int) (j9 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i10);
        long j10 = j9 - (i10 * 60000000);
        int i11 = (int) (j10 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j10 - (i11 * 1000000)) / j8)));
        String str3 = bq0.f9768a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    public final void b() {
        if (!this.f17490w) {
            return;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f17462b;
            if (i4 >= sparseArray.size()) {
                z1 z1Var = this.f17476i0;
                z1Var.getClass();
                z1Var.i();
                this.f17490w = false;
                return;
            }
            if (((u4) sparseArray.valueAt(i4)).W) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        t7.m mVar = new t7.m((byte) 0, 4);
        t1 t1Var = (t1) y1Var;
        long j = t1Var.f16635c;
        long j8 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j != -1 && j <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j8 = j;
        }
        sk0 sk0Var = (sk0) mVar.f34474c;
        t1Var.O1(sk0Var.f16446a, 0, 4, false);
        long jP = sk0Var.P();
        mVar.f34473b = 4;
        while (true) {
            if (jP != 440786851) {
                int i4 = (int) j8;
                int i10 = mVar.f34473b + 1;
                mVar.f34473b = i10;
                if (i10 == i4) {
                    break;
                }
                t1Var.O1(sk0Var.f16446a, 0, 1, false);
                jP = ((jP << 8) & (-256)) | (sk0Var.f16446a[0] & 255);
            } else {
                long jF = mVar.F(t1Var);
                long j9 = mVar.f34473b;
                if (jF != Long.MIN_VALUE) {
                    long j10 = j9 + jF;
                    if (j == -1 || j10 < j) {
                        while (true) {
                            long j11 = mVar.f34473b;
                            if (j11 < j10) {
                                if (mVar.F(t1Var) != Long.MIN_VALUE) {
                                    long jF2 = mVar.F(t1Var);
                                    if (jF2 < 0) {
                                        break;
                                    }
                                    if (jF2 != 0) {
                                        int i11 = (int) jF2;
                                        t1Var.e(i11, false);
                                        mVar.f34473b += i11;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j11 == j10) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        if (this.f17466d) {
            z1Var = new b5.i0(z1Var, this.f17468e);
        }
        this.f17476i0 = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.L = -9223372036854775807L;
        this.N = 0;
        c2.f fVar = this.f17477j0;
        fVar.f2605a = 0;
        ((ArrayDeque) fVar.f2609e).clear();
        w4 w4Var = (w4) fVar.f2610f;
        w4Var.f17860a = 0;
        w4Var.f17861b = 0;
        w4 w4Var2 = this.f17460a;
        w4Var2.f17860a = 0;
        w4Var2.f17861b = 0;
        n();
        this.C = false;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1L;
        if (!this.f17492y) {
            this.B.clear();
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f17462b;
            if (i4 >= sparseArray.size()) {
                return;
            }
            v2 v2Var = ((u4) sparseArray.valueAt(i4)).V;
            if (v2Var != null) {
                v2Var.f17431b = false;
                v2Var.f17432c = 0;
            }
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x05c3, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x060e A[LOOP:1: B:6:0x001a->B:353:0x060e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x061d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:668:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0a55 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0b91 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0c47 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r14v22, types: [com.google.android.gms.internal.ads.t1] */
    /* JADX WARN: Type inference failed for: r7v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v69 */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r45, com.google.android.gms.internal.ads.c2 r46) throws java.io.EOFException, java.io.InterruptedIOException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 3836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v4.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    public final void h(int i4, long j) throws ua {
        boolean z3;
        if (i4 == 240) {
            if (this.f17492y) {
                return;
            }
            j(i4);
            if (this.G == -1) {
                this.G = j;
                return;
            }
            return;
        }
        if (i4 == 241) {
            if (this.f17492y) {
                return;
            }
            j(i4);
            if (this.F == -1) {
                this.F = j;
                return;
            }
            return;
        }
        if (i4 == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j);
            sb2.append(" not supported");
            throw ua.a(null, sb2.toString());
        }
        if (i4 == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j);
            sb3.append(" not supported");
            throw ua.a(null, sb3.toString());
        }
        switch (i4) {
            case 131:
                int i10 = (int) j;
                if (i10 == 1) {
                    i(i4);
                    this.f17491x.f17063e = 2;
                    return;
                }
                if (i10 == 2) {
                    i(i4);
                    this.f17491x.f17063e = 1;
                    return;
                } else if (i10 == 17) {
                    i(i4);
                    this.f17491x.f17063e = 3;
                    return;
                } else if (i10 != 33) {
                    i(i4);
                    this.f17491x.f17063e = -1;
                    return;
                } else {
                    i(i4);
                    this.f17491x.f17063e = 5;
                    return;
                }
            case 136:
                z3 = j == 1;
                i(i4);
                this.f17491x.Y = z3;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.P = q(j);
                return;
            case 159:
                i(i4);
                this.f17491x.Q = (int) j;
                return;
            case 176:
                i(i4);
                this.f17491x.f17070n = (int) j;
                return;
            case 179:
                if (this.f17492y) {
                    return;
                }
                j(i4);
                this.D = q(j);
                return;
            case 186:
                i(i4);
                this.f17491x.f17071o = (int) j;
                return;
            case 215:
                i(i4);
                this.f17491x.f17062d = (int) j;
                return;
            case 231:
                this.L = q(j);
                return;
            case 238:
                this.W = (int) j;
                return;
            case 247:
                if (this.f17492y) {
                    return;
                }
                j(i4);
                this.E = (int) j;
                return;
            case 251:
                this.X = true;
                return;
            case 16871:
                i(i4);
                this.f17491x.f17065h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j);
                sb4.append(" not supported");
                throw ua.a(null, sb4.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw ua.a(null, sb5.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ua.a(null, sb6.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j);
                sb7.append(" not supported");
                throw ua.a(null, sb7.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j);
                sb8.append(" not supported");
                throw ua.a(null, sb8.toString());
            case 21420:
                this.A = j + this.f17485r;
                return;
            case 21432:
                int i11 = (int) j;
                i(i4);
                if (i11 == 0) {
                    this.f17491x.f17081y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f17491x.f17081y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f17491x.f17081y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f17491x.f17081y = 3;
                    return;
                }
            case 21680:
                i(i4);
                this.f17491x.f17073q = (int) j;
                return;
            case 21682:
                i(i4);
                this.f17491x.f17075s = (int) j;
                return;
            case 21690:
                i(i4);
                this.f17491x.f17074r = (int) j;
                return;
            case 21930:
                z3 = j == 1;
                i(i4);
                this.f17491x.X = z3;
                return;
            case 21938:
                i(i4);
                u4 u4Var = this.f17491x;
                u4Var.f17082z = true;
                u4Var.f17072p = (int) j;
                return;
            case 21998:
                i(i4);
                this.f17491x.g = (int) j;
                return;
            case 22186:
                i(i4);
                this.f17491x.T = j;
                return;
            case 22203:
                i(i4);
                this.f17491x.U = j;
                return;
            case 25188:
                i(i4);
                this.f17491x.R = (int) j;
                return;
            case 30114:
                this.Y = j;
                return;
            case 30321:
                int i12 = (int) j;
                i(i4);
                if (i12 == 0) {
                    this.f17491x.f17076t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f17491x.f17076t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f17491x.f17076t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f17491x.f17076t = 3;
                    return;
                }
            case 2352003:
                i(i4);
                this.f17491x.f17064f = (int) j;
                return;
            case 2807729:
                this.f17486s = j;
                return;
            default:
                switch (i4) {
                    case 21945:
                        int i13 = (int) j;
                        i(i4);
                        if (i13 == 1) {
                            this.f17491x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f17491x.C = 1;
                            return;
                        }
                    case 21946:
                        i(i4);
                        int iC = sm1.c((int) j);
                        if (iC != -1) {
                            this.f17491x.B = iC;
                            return;
                        }
                        return;
                    case 21947:
                        i(i4);
                        this.f17491x.f17082z = true;
                        int iB = sm1.b((int) j);
                        if (iB != -1) {
                            this.f17491x.A = iB;
                            return;
                        }
                        return;
                    case 21948:
                        i(i4);
                        this.f17491x.D = (int) j;
                        return;
                    case 21949:
                        i(i4);
                        this.f17491x.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void i(int i4) throws ua {
        if (this.f17491x != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 32);
        sb2.append("Element ");
        sb2.append(i4);
        sb2.append(" must be in a TrackEntry");
        throw ua.a(null, sb2.toString());
    }

    public final void j(int i4) throws ua {
        if (this.C) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 26);
        sb2.append("Element ");
        sb2.append(i4);
        sb2.append(" must be in a Cues");
        throw ua.a(null, sb2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = p("%01d:%02d:%02d:%02d", r11, 10000);
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.internal.ads.u4 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v4.k(com.google.android.gms.internal.ads.u4, long, int, int, int):void");
    }

    public final void l(y1 y1Var, int i4) {
        sk0 sk0Var = this.f17473h;
        if (sk0Var.f16448c >= i4) {
            return;
        }
        byte[] bArr = sk0Var.f16446a;
        if (bArr.length < i4) {
            int length = bArr.length;
            sk0Var.A(Math.max(length + length, i4));
        }
        byte[] bArr2 = sk0Var.f16446a;
        int i10 = sk0Var.f16448c;
        y1Var.L1(i10, i4 - i10, bArr2);
        sk0Var.C(i4);
    }

    public final int m(y1 y1Var, u4 u4Var, int i4, boolean z3) throws ua {
        int iG;
        int iG2;
        int i10;
        String str = u4Var.f17060c;
        if ("S_TEXT/UTF8".equals(str)) {
            o(y1Var, f17454k0, i4);
            int i11 = this.f17461a0;
            n();
            return i11;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            o(y1Var, f17456m0, i4);
            int i12 = this.f17461a0;
            n();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            o(y1Var, f17457n0, i4);
            int i13 = this.f17461a0;
            n();
            return i13;
        }
        if (u4Var.W) {
            u4Var.f17059b0.getClass();
            sk0 sk0Var = new sk0(i4);
            if (y1Var.O1(sk0Var.f16446a, 0, i4, true)) {
                y1Var.B1();
                if (nn1.a(sk0Var.J()) == 1 && sk0Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    sk0Var.H(0, 10, bArr);
                    sk0Var.E(0);
                    int iO = nn1.o(bArr);
                    if (sk0Var.B() >= iO + 4) {
                        sk0Var.G(iO);
                        if (nn1.a(sk0Var.b()) == 2) {
                            mx1 mx1Var = u4Var.f17059b0;
                            mx1Var.getClass();
                            lw1 lw1Var = new lw1(mx1Var);
                            lw1Var.e("audio/vnd.dts.hd");
                            u4Var.f17059b0 = new mx1(lw1Var);
                        }
                    }
                }
            }
            u4Var.f17057a0.f(u4Var.f17059b0);
            u4Var.W = false;
            b();
        }
        u2 u2Var = u4Var.f17057a0;
        boolean z10 = this.f17465c0;
        sk0 sk0Var2 = this.f17478k;
        if (!z10) {
            boolean z11 = u4Var.f17066i;
            sk0 sk0Var3 = this.f17473h;
            if (z11) {
                this.V &= -1073741825;
                if (!this.f17467d0) {
                    y1Var.L1(0, 1, sk0Var3.f16446a);
                    this.Z++;
                    byte b10 = sk0Var3.f16446a[0];
                    if ((b10 & 128) == 128) {
                        throw ua.a(null, "Extension bit is set in signal byte");
                    }
                    this.f17472g0 = b10;
                    this.f17467d0 = true;
                }
                byte b11 = this.f17472g0;
                if ((b11 & 1) == 1) {
                    int i14 = b11 & 2;
                    this.V |= 1073741824;
                    if (!this.f17474h0) {
                        sk0 sk0Var4 = this.f17480m;
                        y1Var.L1(0, 8, sk0Var4.f16446a);
                        this.Z += 8;
                        this.f17474h0 = true;
                        sk0Var3.f16446a[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                        sk0Var3.E(0);
                        u2Var.c(sk0Var3, 1, 1);
                        this.f17461a0++;
                        sk0Var4.E(0);
                        u2Var.c(sk0Var4, 8, 1);
                        this.f17461a0 += 8;
                    }
                    if (i14 == 2) {
                        if (!this.f17469e0) {
                            y1Var.L1(0, 1, sk0Var3.f16446a);
                            this.Z++;
                            sk0Var3.E(0);
                            this.f17471f0 = sk0Var3.K();
                            this.f17469e0 = true;
                        }
                        int i15 = this.f17471f0 * 4;
                        sk0Var3.y(i15);
                        y1Var.L1(0, i15, sk0Var3.f16446a);
                        this.Z += i15;
                        int i16 = (this.f17471f0 >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.f17483p;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f17483p = ByteBuffer.allocate(i17);
                        }
                        this.f17483p.position(0);
                        this.f17483p.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i10 = this.f17471f0;
                            if (i18 >= i10) {
                                break;
                            }
                            int iH = sk0Var3.h();
                            int i20 = iH - i19;
                            if (i18 % 2 == 0) {
                                this.f17483p.putShort((short) i20);
                            } else {
                                this.f17483p.putInt(i20);
                            }
                            i18++;
                            i19 = iH;
                        }
                        int i21 = (i4 - this.Z) - i19;
                        if ((i10 & 1) == 1) {
                            this.f17483p.putInt(i21);
                        } else {
                            this.f17483p.putShort((short) i21);
                            this.f17483p.putInt(0);
                        }
                        byte[] bArrArray = this.f17483p.array();
                        sk0 sk0Var5 = this.f17481n;
                        sk0Var5.z(i17, bArrArray);
                        u2Var.c(sk0Var5, i17, 1);
                        this.f17461a0 += i17;
                    }
                }
            } else {
                byte[] bArr2 = u4Var.j;
                if (bArr2 != null) {
                    sk0Var2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(u4Var.f17060c) ? u4Var.g > 0 : z3) {
                this.V |= 268435456;
                this.f17482o.y(0);
                int i22 = (sk0Var2.f16448c + i4) - this.Z;
                sk0Var3.y(4);
                byte[] bArr3 = sk0Var3.f16446a;
                bArr3[0] = (byte) ((i22 >> 24) & 255);
                bArr3[1] = (byte) ((i22 >> 16) & 255);
                bArr3[2] = (byte) ((i22 >> 8) & 255);
                bArr3[3] = (byte) (i22 & 255);
                u2Var.c(sk0Var3, 4, 2);
                this.f17461a0 += 4;
            }
            this.f17465c0 = true;
        }
        int i23 = i4 + sk0Var2.f16448c;
        String str2 = u4Var.f17060c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (u4Var.V != null) {
                mq0.c0(sk0Var2.f16448c == 0);
                u4Var.V.a(y1Var);
            }
            while (true) {
                int i24 = this.Z;
                if (i24 >= i23) {
                    break;
                }
                int i25 = i23 - i24;
                int iB = sk0Var2.B();
                if (iB > 0) {
                    iG2 = Math.min(i25, iB);
                    u2Var.b(iG2, sk0Var2);
                } else {
                    iG2 = u2Var.g(y1Var, i25, false);
                }
                this.Z += iG2;
                this.f17461a0 += iG2;
            }
        } else {
            sk0 sk0Var6 = this.g;
            byte[] bArr4 = sk0Var6.f16446a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = u4Var.f17061c0;
            int i27 = 4 - i26;
            while (this.Z < i23) {
                int i28 = this.f17463b0;
                if (i28 == 0) {
                    int iMin = Math.min(i26, sk0Var2.B());
                    y1Var.L1(i27 + iMin, i26 - iMin, bArr4);
                    if (iMin > 0) {
                        sk0Var2.H(i27, iMin, bArr4);
                    }
                    this.Z += i26;
                    sk0Var6.E(0);
                    this.f17463b0 = sk0Var6.h();
                    sk0 sk0Var7 = this.f17470f;
                    sk0Var7.E(0);
                    u2Var.b(4, sk0Var7);
                    this.f17461a0 += 4;
                } else {
                    int iB2 = sk0Var2.B();
                    if (iB2 > 0) {
                        iG = Math.min(i28, iB2);
                        u2Var.b(iG, sk0Var2);
                    } else {
                        iG = u2Var.g(y1Var, i28, false);
                    }
                    this.Z += iG;
                    this.f17461a0 += iG;
                    this.f17463b0 -= iG;
                }
            }
        }
        if ("A_VORBIS".equals(u4Var.f17060c)) {
            sk0 sk0Var8 = this.f17475i;
            sk0Var8.E(0);
            u2Var.b(4, sk0Var8);
            this.f17461a0 += 4;
        }
        int i29 = this.f17461a0;
        n();
        return i29;
    }

    public final void n() {
        this.Z = 0;
        this.f17461a0 = 0;
        this.f17463b0 = 0;
        this.f17465c0 = false;
        this.f17467d0 = false;
        this.f17469e0 = false;
        this.f17471f0 = 0;
        this.f17472g0 = (byte) 0;
        this.f17474h0 = false;
        this.f17478k.y(0);
    }

    public final void o(y1 y1Var, byte[] bArr, int i4) {
        int length = bArr.length;
        int i10 = length + i4;
        sk0 sk0Var = this.f17479l;
        byte[] bArr2 = sk0Var.f16446a;
        if (bArr2.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10 + i4);
            sk0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        y1Var.L1(length, i4, sk0Var.f16446a);
        sk0Var.E(0);
        sk0Var.C(i10);
    }

    public final long q(long j) throws ua {
        long j8 = this.f17486s;
        if (j8 != -9223372036854775807L) {
            return bq0.u(j, j8, 1000L, RoundingMode.DOWN);
        }
        throw ua.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public v4(c2.f fVar, int i4, r6 r6Var) {
        this.f17485r = -1L;
        this.f17486s = -9223372036854775807L;
        this.f17487t = -9223372036854775807L;
        this.f17488u = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1L;
        this.H = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -9223372036854775807L;
        this.f17477j0 = fVar;
        fVar.g = new ix0(4, this);
        this.f17468e = r6Var;
        this.B = new SparseArray();
        this.f17464c = true;
        this.f17466d = (i4 & 2) == 0;
        this.f17460a = new w4(0);
        this.f17462b = new SparseArray();
        this.f17473h = new sk0(4);
        this.f17475i = new sk0(ByteBuffer.allocate(4).putInt(-1).array());
        this.j = new sk0(4);
        this.f17470f = new sk0(ls.f13608z);
        this.g = new sk0(4);
        this.f17478k = new sk0();
        this.f17479l = new sk0();
        this.f17480m = new sk0(8);
        this.f17481n = new sk0();
        this.f17482o = new sk0();
        this.S = new int[1];
        this.f17490w = true;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
