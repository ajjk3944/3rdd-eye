package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class V1 implements InterfaceC1992v0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final byte[] f11862k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: l0, reason: collision with root package name */
    public static final byte[] f11863l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final byte[] f11864m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f11865n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final UUID f11866o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final Map f11867p0;

    /* renamed from: A, reason: collision with root package name */
    public long f11868A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f11869B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f11870C;

    /* renamed from: D, reason: collision with root package name */
    public long f11871D;

    /* renamed from: E, reason: collision with root package name */
    public int f11872E;

    /* renamed from: F, reason: collision with root package name */
    public long f11873F;

    /* renamed from: G, reason: collision with root package name */
    public long f11874G;

    /* renamed from: H, reason: collision with root package name */
    public int f11875H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11876I;

    /* renamed from: J, reason: collision with root package name */
    public long f11877J;

    /* renamed from: K, reason: collision with root package name */
    public long f11878K;

    /* renamed from: L, reason: collision with root package name */
    public long f11879L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public int f11880N;

    /* renamed from: O, reason: collision with root package name */
    public long f11881O;

    /* renamed from: P, reason: collision with root package name */
    public long f11882P;

    /* renamed from: Q, reason: collision with root package name */
    public int f11883Q;

    /* renamed from: R, reason: collision with root package name */
    public int f11884R;

    /* renamed from: S, reason: collision with root package name */
    public int[] f11885S;

    /* renamed from: T, reason: collision with root package name */
    public int f11886T;

    /* renamed from: U, reason: collision with root package name */
    public int f11887U;

    /* renamed from: V, reason: collision with root package name */
    public int f11888V;

    /* renamed from: W, reason: collision with root package name */
    public int f11889W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f11890X;

    /* renamed from: Y, reason: collision with root package name */
    public long f11891Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f11892Z;

    /* renamed from: a, reason: collision with root package name */
    public final W1 f11893a;

    /* renamed from: a0, reason: collision with root package name */
    public int f11894a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f11895b;
    public int b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11896c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f11897c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11898d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11899d0;

    /* renamed from: e, reason: collision with root package name */
    public final R2 f11900e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11901e0;

    /* renamed from: f, reason: collision with root package name */
    public final C2036vr f11902f;

    /* renamed from: f0, reason: collision with root package name */
    public int f11903f0;

    /* renamed from: g, reason: collision with root package name */
    public final C2036vr f11904g;

    /* renamed from: g0, reason: collision with root package name */
    public byte f11905g0;

    /* renamed from: h, reason: collision with root package name */
    public final C2036vr f11906h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11907h0;
    public final C2036vr i;

    /* renamed from: i0, reason: collision with root package name */
    public InterfaceC2100x0 f11908i0;

    /* renamed from: j, reason: collision with root package name */
    public final C2036vr f11909j;

    /* renamed from: j0, reason: collision with root package name */
    public final R1 f11910j0;

    /* renamed from: k, reason: collision with root package name */
    public final C2036vr f11911k;

    /* renamed from: l, reason: collision with root package name */
    public final C2036vr f11912l;

    /* renamed from: m, reason: collision with root package name */
    public final C2036vr f11913m;

    /* renamed from: n, reason: collision with root package name */
    public final C2036vr f11914n;

    /* renamed from: o, reason: collision with root package name */
    public final C2036vr f11915o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f11916p;

    /* renamed from: q, reason: collision with root package name */
    public long f11917q;

    /* renamed from: r, reason: collision with root package name */
    public long f11918r;

    /* renamed from: s, reason: collision with root package name */
    public long f11919s;

    /* renamed from: t, reason: collision with root package name */
    public long f11920t;

    /* renamed from: u, reason: collision with root package name */
    public long f11921u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11922v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11923w;

    /* renamed from: x, reason: collision with root package name */
    public U1 f11924x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11925y;

    /* renamed from: z, reason: collision with root package name */
    public int f11926z;

    static {
        String str = Vt.f12096a;
        f11863l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f11864m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f11865n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f11866o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        A.f.q(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        A.f.q(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11867p0 = Collections.unmodifiableMap(map);
    }

    public V1() {
        this(new R1(), 2, R2.f10828B);
    }

    public static byte[] p(long j6, long j7, String str) {
        AbstractC0582Jp.m(j6 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j6 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j8 = j6 - (i * 3600000000L);
        int i3 = (int) (j8 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i3);
        long j9 = j8 - (i3 * 60000000);
        int i6 = (int) (j9 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i6), Integer.valueOf((int) ((j9 - (i6 * 1000000)) / j7)));
        String str3 = Vt.f12096a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void a() {
        if (!this.f11923w) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f11895b;
            if (i >= sparseArray.size()) {
                InterfaceC2100x0 interfaceC2100x0 = this.f11908i0;
                interfaceC2100x0.getClass();
                interfaceC2100x0.u();
                this.f11923w = false;
                return;
            }
            if (((U1) sparseArray.valueAt(i)).f11559W) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        L2.w wVar = new L2.w(2, (byte) 0);
        C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
        long j6 = c1776r0.f16444c;
        long j7 = 1024;
        if (j6 != -1 && j6 <= 1024) {
            j7 = j6;
        }
        C2036vr c2036vr = (C2036vr) wVar.f2570c;
        C1776r0 c1776r02 = (C1776r0) interfaceC2046w0;
        c1776r02.y(c2036vr.f17354a, 0, 4, false);
        long jP = c2036vr.P();
        wVar.f2569b = 4;
        while (true) {
            if (jP != 440786851) {
                int i = (int) j7;
                int i3 = wVar.f2569b + 1;
                wVar.f2569b = i3;
                if (i3 == i) {
                    break;
                }
                c1776r02.y(c2036vr.f17354a, 0, 1, false);
                jP = ((jP << 8) & (-256)) | (c2036vr.f17354a[0] & 255);
            } else {
                long jQ = wVar.q(c1776r0);
                long j8 = wVar.f2569b;
                if (jQ != Long.MIN_VALUE) {
                    long j9 = j8 + jQ;
                    if (j6 == -1 || j9 < j6) {
                        while (true) {
                            long j10 = wVar.f2569b;
                            if (j10 < j9) {
                                if (wVar.q(c1776r0) != Long.MIN_VALUE) {
                                    long jQ2 = wVar.q(c1776r0);
                                    if (jQ2 < 0) {
                                        break;
                                    }
                                    if (jQ2 != 0) {
                                        int i6 = (int) jQ2;
                                        c1776r02.e(i6, false);
                                        wVar.f2569b += i6;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j10 == j9) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        if (this.f11898d) {
            interfaceC2100x0 = new A1.s(interfaceC2100x0, this.f11900e);
        }
        this.f11908i0 = interfaceC2100x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f11879L = -9223372036854775807L;
        this.f11880N = 0;
        R1 r12 = this.f11910j0;
        r12.f10825e = 0;
        r12.f10822b.clear();
        W1 w12 = r12.f10823c;
        w12.f12141a = 0;
        w12.f12142b = 0;
        W1 w13 = this.f11893a;
        w13.f12141a = 0;
        w13.f12142b = 0;
        n();
        this.f11870C = false;
        this.f11871D = -9223372036854775807L;
        this.f11872E = -1;
        this.f11873F = -1L;
        this.f11874G = -1L;
        if (!this.f11925y) {
            this.f11869B.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f11895b;
            if (i >= sparseArray.size()) {
                return;
            }
            U0 u02 = ((U1) sparseArray.valueAt(i)).f11558V;
            if (u02 != null) {
                u02.f11532b = false;
                u02.f11533c = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x060c, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0659 A[LOOP:1: B:6:0x0016->B:364:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0a9f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0bd8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0c8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.google.android.gms.internal.ads.r0] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v86 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r50, com.google.android.gms.internal.ads.A0 r51) throws com.google.android.gms.internal.ads.P4, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 3978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V1.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }

    public final void h(int i, long j6) throws P4 {
        boolean z6;
        if (i == 240) {
            if (this.f11925y) {
                return;
            }
            j(i);
            if (this.f11874G == -1) {
                this.f11874G = j6;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.f11925y) {
                return;
            }
            j(i);
            if (this.f11873F == -1) {
                this.f11873F = j6;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j6 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j6);
            sb.append(" not supported");
            throw P4.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j6 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j6);
            sb2.append(" not supported");
            throw P4.a(null, sb2.toString());
        }
        switch (i) {
            case 131:
                int i3 = (int) j6;
                if (i3 == 1) {
                    i(i);
                    this.f11924x.f11569e = 2;
                    return;
                }
                if (i3 == 2) {
                    i(i);
                    this.f11924x.f11569e = 1;
                    return;
                } else if (i3 == 17) {
                    i(i);
                    this.f11924x.f11569e = 3;
                    return;
                } else if (i3 != 33) {
                    i(i);
                    this.f11924x.f11569e = -1;
                    return;
                } else {
                    i(i);
                    this.f11924x.f11569e = 5;
                    return;
                }
            case 136:
                z6 = j6 == 1;
                i(i);
                this.f11924x.f11561Y = z6;
                return;
            case 155:
                this.f11882P = q(j6);
                return;
            case 159:
                i(i);
                this.f11924x.f11553Q = (int) j6;
                return;
            case 176:
                i(i);
                this.f11924x.f11577n = (int) j6;
                return;
            case 179:
                if (this.f11925y) {
                    return;
                }
                j(i);
                this.f11871D = q(j6);
                return;
            case 186:
                i(i);
                this.f11924x.f11578o = (int) j6;
                return;
            case 215:
                i(i);
                this.f11924x.f11568d = (int) j6;
                return;
            case 231:
                this.f11879L = q(j6);
                return;
            case 238:
                this.f11889W = (int) j6;
                return;
            case 247:
                if (this.f11925y) {
                    return;
                }
                j(i);
                this.f11872E = (int) j6;
                return;
            case 251:
                this.f11890X = true;
                return;
            case 16871:
                i(i);
                this.f11924x.f11572h = (int) j6;
                return;
            case 16980:
                if (j6 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j6).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j6);
                sb3.append(" not supported");
                throw P4.a(null, sb3.toString());
            case 17029:
                if (j6 < 1 || j6 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j6).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j6);
                    sb4.append(" not supported");
                    throw P4.a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j6 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j6).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j6);
                sb5.append(" not supported");
                throw P4.a(null, sb5.toString());
            case 18401:
                if (j6 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j6);
                sb6.append(" not supported");
                throw P4.a(null, sb6.toString());
            case 18408:
                if (j6 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j6).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j6);
                sb7.append(" not supported");
                throw P4.a(null, sb7.toString());
            case 21420:
                this.f11868A = j6 + this.f11918r;
                return;
            case 21432:
                int i6 = (int) j6;
                i(i);
                if (i6 == 0) {
                    this.f11924x.f11588y = 0;
                    return;
                }
                if (i6 == 1) {
                    this.f11924x.f11588y = 2;
                    return;
                } else if (i6 == 3) {
                    this.f11924x.f11588y = 1;
                    return;
                } else {
                    if (i6 != 15) {
                        return;
                    }
                    this.f11924x.f11588y = 3;
                    return;
                }
            case 21680:
                i(i);
                this.f11924x.f11580q = (int) j6;
                return;
            case 21682:
                i(i);
                this.f11924x.f11582s = (int) j6;
                return;
            case 21690:
                i(i);
                this.f11924x.f11581r = (int) j6;
                return;
            case 21930:
                z6 = j6 == 1;
                i(i);
                this.f11924x.f11560X = z6;
                return;
            case 21938:
                i(i);
                U1 u12 = this.f11924x;
                u12.f11589z = true;
                u12.f11579p = (int) j6;
                return;
            case 21998:
                i(i);
                this.f11924x.f11571g = (int) j6;
                return;
            case 22186:
                i(i);
                this.f11924x.f11556T = j6;
                return;
            case 22203:
                i(i);
                this.f11924x.f11557U = j6;
                return;
            case 25188:
                i(i);
                this.f11924x.f11554R = (int) j6;
                return;
            case 30114:
                this.f11891Y = j6;
                return;
            case 30321:
                int i7 = (int) j6;
                i(i);
                if (i7 == 0) {
                    this.f11924x.f11583t = 0;
                    return;
                }
                if (i7 == 1) {
                    this.f11924x.f11583t = 1;
                    return;
                } else if (i7 == 2) {
                    this.f11924x.f11583t = 2;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f11924x.f11583t = 3;
                    return;
                }
            case 2352003:
                i(i);
                this.f11924x.f11570f = (int) j6;
                return;
            case 2807729:
                this.f11919s = j6;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i8 = (int) j6;
                        i(i);
                        if (i8 == 1) {
                            this.f11924x.f11540C = 2;
                            return;
                        } else {
                            if (i8 != 2) {
                                return;
                            }
                            this.f11924x.f11540C = 1;
                            return;
                        }
                    case 21946:
                        i(i);
                        int iC = HK.c((int) j6);
                        if (iC != -1) {
                            this.f11924x.f11539B = iC;
                            return;
                        }
                        return;
                    case 21947:
                        i(i);
                        this.f11924x.f11589z = true;
                        int iB = HK.b((int) j6);
                        if (iB != -1) {
                            this.f11924x.f11538A = iB;
                            return;
                        }
                        return;
                    case 21948:
                        i(i);
                        this.f11924x.f11541D = (int) j6;
                        return;
                    case 21949:
                        i(i);
                        this.f11924x.f11542E = (int) j6;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void i(int i) throws P4 {
        if (this.f11924x != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw P4.a(null, sb.toString());
    }

    public final void j(int i) throws P4 {
        if (this.f11870C) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw P4.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.internal.ads.U1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V1.k(com.google.android.gms.internal.ads.U1, long, int, int, int):void");
    }

    public final void l(InterfaceC2046w0 interfaceC2046w0, int i) {
        C2036vr c2036vr = this.f11906h;
        if (c2036vr.f17356c >= i) {
            return;
        }
        byte[] bArr = c2036vr.f17354a;
        if (bArr.length < i) {
            int length = bArr.length;
            c2036vr.A(Math.max(length + length, i));
        }
        byte[] bArr2 = c2036vr.f17354a;
        int i3 = c2036vr.f17356c;
        interfaceC2046w0.s(i3, i - i3, bArr2);
        c2036vr.C(i);
    }

    public final int m(InterfaceC2046w0 interfaceC2046w0, U1 u12, int i, boolean z6) throws P4 {
        int iF;
        int iF2;
        int i3;
        String str = u12.f11566c;
        if ("S_TEXT/UTF8".equals(str)) {
            o(interfaceC2046w0, f11862k0, i);
            int i6 = this.f11894a0;
            n();
            return i6;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            o(interfaceC2046w0, f11864m0, i);
            int i7 = this.f11894a0;
            n();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            o(interfaceC2046w0, f11865n0, i);
            int i8 = this.f11894a0;
            n();
            return i8;
        }
        if (u12.f11559W) {
            u12.b0.getClass();
            C2036vr c2036vr = new C2036vr(i);
            if (interfaceC2046w0.y(c2036vr.f17354a, 0, i, true)) {
                interfaceC2046w0.i();
                if (AbstractC0933bL.a(c2036vr.J()) == 1 && c2036vr.B() >= 10) {
                    byte[] bArr = new byte[10];
                    c2036vr.H(0, 10, bArr);
                    c2036vr.E(0);
                    int iQ = AbstractC0933bL.q(bArr);
                    if (c2036vr.B() >= iQ + 4) {
                        c2036vr.G(iQ);
                        if (AbstractC0933bL.a(c2036vr.b()) == 2) {
                            TP tp = u12.b0;
                            tp.getClass();
                            C1855sP c1855sP = new C1855sP(tp);
                            c1855sP.e("audio/vnd.dts.hd");
                            u12.b0 = new TP(c1855sP);
                        }
                    }
                }
            }
            u12.f11564a0.e(u12.b0);
            u12.f11559W = false;
            a();
        }
        T0 t02 = u12.f11564a0;
        boolean z7 = this.f11897c0;
        C2036vr c2036vr2 = this.f11911k;
        if (!z7) {
            boolean z8 = u12.i;
            C2036vr c2036vr3 = this.f11906h;
            if (z8) {
                this.f11888V &= -1073741825;
                if (!this.f11899d0) {
                    interfaceC2046w0.s(0, 1, c2036vr3.f17354a);
                    this.f11892Z++;
                    byte b5 = c2036vr3.f17354a[0];
                    if ((b5 & 128) == 128) {
                        throw P4.a(null, "Extension bit is set in signal byte");
                    }
                    this.f11905g0 = b5;
                    this.f11899d0 = true;
                }
                byte b6 = this.f11905g0;
                if ((b6 & 1) == 1) {
                    int i9 = b6 & 2;
                    this.f11888V |= 1073741824;
                    if (!this.f11907h0) {
                        C2036vr c2036vr4 = this.f11913m;
                        interfaceC2046w0.s(0, 8, c2036vr4.f17354a);
                        this.f11892Z += 8;
                        this.f11907h0 = true;
                        c2036vr3.f17354a[0] = (byte) ((i9 != 2 ? 0 : 128) | 8);
                        c2036vr3.E(0);
                        t02.b(c2036vr3, 1, 1);
                        this.f11894a0++;
                        c2036vr4.E(0);
                        t02.b(c2036vr4, 8, 1);
                        this.f11894a0 += 8;
                    }
                    if (i9 == 2) {
                        if (!this.f11901e0) {
                            interfaceC2046w0.s(0, 1, c2036vr3.f17354a);
                            this.f11892Z++;
                            c2036vr3.E(0);
                            this.f11903f0 = c2036vr3.K();
                            this.f11901e0 = true;
                        }
                        int i10 = this.f11903f0 * 4;
                        c2036vr3.y(i10);
                        interfaceC2046w0.s(0, i10, c2036vr3.f17354a);
                        this.f11892Z += i10;
                        int i11 = (this.f11903f0 >> 1) + 1;
                        int i12 = (i11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f11916p;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f11916p = ByteBuffer.allocate(i12);
                        }
                        this.f11916p.position(0);
                        this.f11916p.putShort((short) i11);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i3 = this.f11903f0;
                            if (i13 >= i3) {
                                break;
                            }
                            int iH = c2036vr3.h();
                            int i15 = iH - i14;
                            if (i13 % 2 == 0) {
                                this.f11916p.putShort((short) i15);
                            } else {
                                this.f11916p.putInt(i15);
                            }
                            i13++;
                            i14 = iH;
                        }
                        int i16 = (i - this.f11892Z) - i14;
                        if ((i3 & 1) == 1) {
                            this.f11916p.putInt(i16);
                        } else {
                            this.f11916p.putShort((short) i16);
                            this.f11916p.putInt(0);
                        }
                        byte[] bArrArray = this.f11916p.array();
                        C2036vr c2036vr5 = this.f11914n;
                        c2036vr5.z(i12, bArrArray);
                        t02.b(c2036vr5, i12, 1);
                        this.f11894a0 += i12;
                    }
                }
            } else {
                byte[] bArr2 = u12.f11573j;
                if (bArr2 != null) {
                    c2036vr2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(u12.f11566c) ? u12.f11571g > 0 : z6) {
                this.f11888V |= 268435456;
                this.f11915o.y(0);
                int i17 = (c2036vr2.f17356c + i) - this.f11892Z;
                c2036vr3.y(4);
                byte[] bArr3 = c2036vr3.f17354a;
                bArr3[0] = (byte) ((i17 >> 24) & 255);
                bArr3[1] = (byte) ((i17 >> 16) & 255);
                bArr3[2] = (byte) ((i17 >> 8) & 255);
                bArr3[3] = (byte) (i17 & 255);
                t02.b(c2036vr3, 4, 2);
                this.f11894a0 += 4;
            }
            this.f11897c0 = true;
        }
        int i18 = i + c2036vr2.f17356c;
        String str2 = u12.f11566c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (u12.f11558V != null) {
                AbstractC0582Jp.h0(c2036vr2.f17356c == 0);
                u12.f11558V.a(interfaceC2046w0);
            }
            while (true) {
                int i19 = this.f11892Z;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int iB = c2036vr2.B();
                if (iB > 0) {
                    iF2 = Math.min(i20, iB);
                    t02.a(iF2, c2036vr2);
                } else {
                    iF2 = t02.f(interfaceC2046w0, i20, false);
                }
                this.f11892Z += iF2;
                this.f11894a0 += iF2;
            }
        } else {
            C2036vr c2036vr6 = this.f11904g;
            byte[] bArr4 = c2036vr6.f17354a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i21 = u12.f11567c0;
            int i22 = 4 - i21;
            while (this.f11892Z < i18) {
                int i23 = this.b0;
                if (i23 == 0) {
                    int iMin = Math.min(i21, c2036vr2.B());
                    interfaceC2046w0.s(i22 + iMin, i21 - iMin, bArr4);
                    if (iMin > 0) {
                        c2036vr2.H(i22, iMin, bArr4);
                    }
                    this.f11892Z += i21;
                    c2036vr6.E(0);
                    this.b0 = c2036vr6.h();
                    C2036vr c2036vr7 = this.f11902f;
                    c2036vr7.E(0);
                    t02.a(4, c2036vr7);
                    this.f11894a0 += 4;
                } else {
                    int iB2 = c2036vr2.B();
                    if (iB2 > 0) {
                        iF = Math.min(i23, iB2);
                        t02.a(iF, c2036vr2);
                    } else {
                        iF = t02.f(interfaceC2046w0, i23, false);
                    }
                    this.f11892Z += iF;
                    this.f11894a0 += iF;
                    this.b0 -= iF;
                }
            }
        }
        if ("A_VORBIS".equals(u12.f11566c)) {
            C2036vr c2036vr8 = this.i;
            c2036vr8.E(0);
            t02.a(4, c2036vr8);
            this.f11894a0 += 4;
        }
        int i24 = this.f11894a0;
        n();
        return i24;
    }

    public final void n() {
        this.f11892Z = 0;
        this.f11894a0 = 0;
        this.b0 = 0;
        this.f11897c0 = false;
        this.f11899d0 = false;
        this.f11901e0 = false;
        this.f11903f0 = 0;
        this.f11905g0 = (byte) 0;
        this.f11907h0 = false;
        this.f11911k.y(0);
    }

    public final void o(InterfaceC2046w0 interfaceC2046w0, byte[] bArr, int i) {
        int length = bArr.length;
        int i3 = length + i;
        C2036vr c2036vr = this.f11912l;
        byte[] bArr2 = c2036vr.f17354a;
        if (bArr2.length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3 + i);
            c2036vr.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        interfaceC2046w0.s(length, i, c2036vr.f17354a);
        c2036vr.E(0);
        c2036vr.C(i3);
    }

    public final long q(long j6) throws P4 {
        long j7 = this.f11919s;
        if (j7 != -9223372036854775807L) {
            return Vt.u(j6, j7, 1000L, RoundingMode.DOWN);
        }
        throw P4.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public V1(R1 r12, int i, R2 r22) {
        this.f11918r = -1L;
        this.f11919s = -9223372036854775807L;
        this.f11920t = -9223372036854775807L;
        this.f11921u = -9223372036854775807L;
        this.f11871D = -9223372036854775807L;
        this.f11872E = -1;
        this.f11873F = -1L;
        this.f11874G = -1L;
        this.f11875H = -1;
        this.f11877J = -1L;
        this.f11878K = -1L;
        this.f11879L = -9223372036854775807L;
        this.f11910j0 = r12;
        r12.f10824d = new C1283hr(2, this);
        this.f11900e = r22;
        this.f11869B = new SparseArray();
        this.f11896c = true;
        this.f11898d = (i & 2) == 0;
        this.f11893a = new W1(0);
        this.f11895b = new SparseArray();
        this.f11906h = new C2036vr(4);
        this.i = new C2036vr(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11909j = new C2036vr(4);
        this.f11902f = new C2036vr(AbstractC2022vd.f17310z);
        this.f11904g = new C2036vr(4);
        this.f11911k = new C2036vr();
        this.f11912l = new C2036vr();
        this.f11913m = new C2036vr(8);
        this.f11914n = new C2036vr();
        this.f11915o = new C2036vr();
        this.f11885S = new int[1];
        this.f11923w = true;
    }
}
