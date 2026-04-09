package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network/classes2.dex */
public final class AC extends AbstractC2001qP implements InterfaceC1909os {
    public static byte[] A0m;
    public static String[] A0n = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C2002qQ A09;
    public C1980q2 A0A;
    public C1980q2 A0B;
    public C1980q2 A0C;
    public C1975px A0D;
    public C1973pv A0E;
    public C1949pW A0F;
    public C1944pR A0G;
    public C02474z A0H;
    public AD A0I;
    public C7Z A0J;
    public C03207u A0K;
    public InterfaceC0434Cx A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C1973pv A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Looper A0Y;
    public final InterfaceC01993b A0Z;
    public final C1963pl A0a;
    public final AnonymousClass45 A0b;
    public final AnonymousClass48 A0c;
    public final C1907oq A0d;
    public final AB A0e;
    public final InterfaceC1900oj A0f;
    public final AbstractC0485Ew A0g;
    public final C0486Ex A0h;
    public final CopyOnWriteArraySet<C6W> A0i;
    public final CopyOnWriteArraySet<C3U> A0j;
    public final boolean A0k;
    public final InterfaceC1905oo[] A0l;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0m, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0m = new byte[]{102, 29, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, 127, 99, 0, 61, 42, 21, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, 127, 114, 55, 96, 101, 120, 121, 112, 55, 99, 127, 101, 114, 118, 115, 57, 29, 84, 98, 101, 101, 114, 121, 99, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 68, 114, 114, 55, 127, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, 127, 101, 114, 118, 115, 20, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, 14, 71, 73, 64, 65, 92, 75, 74, 14, 76, 75, 77, 79, 91, 93, 75, 14, 79, 64, 14, 79, 74, 14, 71, 93, 14, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public AC(InterfaceC1905oo[] interfaceC1905ooArr, AbstractC0485Ew abstractC0485Ew, AnonymousClass74 anonymousClass74, F6 f62, AnonymousClass45 anonymousClass45) {
        this(interfaceC1905ooArr, abstractC0485Ew, anonymousClass74, f62, anonymousClass45, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public AC(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC1905oo[] interfaceC1905ooArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") AbstractC0485Ew abstractC0485Ew, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") AnonymousClass74 anonymousClass74, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") F6 f62, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") AnonymousClass45 anonymousClass45, boolean z3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, long j, boolean z15, int i4, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, InterfaceC01993b interfaceC01993b) {
        InterfaceC01993b interfaceC01993b2 = interfaceC01993b;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + C5C.A04 + A04(193, 1, 54));
        this.A0c = new AnonymousClass48();
        try {
            this.A0M = z21;
            AbstractC02203y.A08(interfaceC1905ooArr.length > 0);
            this.A0l = (InterfaceC1905oo[]) AbstractC02203y.A01(interfaceC1905ooArr);
            this.A0g = (AbstractC0485Ew) AbstractC02203y.A01(abstractC0485Ew);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C1980q2.A0Z;
            this.A0B = C1980q2.A0Z;
            this.A0C = C1980q2.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C2002qQ.A07;
            this.A0W = 0L;
            this.A0j = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC1900oj analyticsCollector = InterfaceC1900oj.A00;
            this.A0f = analyticsCollector;
            this.A0K = C03207u.A03;
            this.A06 = 1;
            this.A0d = new C1907oq();
            this.A0h = new C0486Ex(new C03187s[interfaceC1905ooArr.length], new InterfaceC1808nE[interfaceC1905ooArr.length], C1951pY.A03, null);
            this.A0a = new C1963pl();
            this.A0T = new C3P().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, abstractC0485Ew.A0Y()).A04();
            this.A0E = new C3P().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C1944pR.A03;
            this.A0D = C1975px.A06;
            this.A0Y = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.6c
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (WU.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th2) {
                        WU.A00(th2, this);
                    }
                }
            };
            this.A0b = anonymousClass45;
            this.A0Z = interfaceC01993b2 == null ? this : interfaceC01993b2;
            this.A0J = new C7Z(Timeline.A02, 0L, C1826nW.A06, this.A0h);
            this.A0e = new AB(interfaceC1905ooArr, abstractC0485Ew, this.A0h, anonymousClass74, f62, this.A0Q, this.A05, this.A0S, this.A0X, anonymousClass45, z3, z10, z11, z12, z13, z14, j, z15, i4, z16, z17, z18, z19, z20, z22, C8O.A03);
            this.A0F = C1949pW.A06;
            this.A0H = C02474z.A03;
            this.A0i = new CopyOnWriteArraySet<>();
        } finally {
            this.A0c.A04();
        }
    }

    private long A00(long j) {
        long jA01 = C2Y.A01(j);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            long positionMs = this.A0a.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C1844no c1844no, long j) {
        timeline.A0J(c1844no.A04, this.A0a);
        return j + this.A0a.A0C();
    }

    private C7Z A02(boolean z3, boolean z10, int i4) {
        C0486Ex c0486Ex;
        if (z3) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7h();
            this.A01 = A7c();
            this.A08 = A7e();
            this.A07 = A0J();
        }
        Timeline timeline = z10 ? Timeline.A02 : this.A0J.A03;
        C1844no c1844no = this.A0J.A05;
        long j = this.A0J.A02;
        long j8 = this.A0J.A01;
        C1826nW c1826nW = z10 ? C1826nW.A06 : this.A0J.A06;
        if (z10) {
            c0486Ex = this.A0h;
        } else {
            C7Z c7z = this.A0J;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            c0486Ex = c7z.A07;
        }
        return new C7Z(timeline, c1844no, j, j8, i4, false, c1826nW, c0486Ex, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private C03037d A03(InterfaceC03027c interfaceC03027c) {
        int iA7h = A7h();
        AB ab2 = this.A0e;
        Timeline timeline = this.A0J.A03;
        if (iA7h == -1) {
            iA7h = 0;
        }
        return new C03037d(ab2, interfaceC03027c, timeline, iA7h, this.A0b, this.A0e.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0c.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = C5C.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0k) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0n[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0n[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(com.instagram.common.viewpoint.core.C7Z r15, int r16, boolean r17, int r18) {
        /*
            r14 = this;
            r6 = r15
            r3 = r14
            int r0 = r3.A03
            int r0 = r0 - r16
            r3.A03 = r0
            int r0 = r3.A03
            if (r0 != 0) goto L72
            long r4 = r6.A02
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            com.facebook.ads.redexgen.X.no r7 = r6.A05
            long r10 = r6.A01
            long r0 = r6.A0D
            r8 = 0
            r6 = r6
            r12 = r0
            com.facebook.ads.redexgen.X.7Z r6 = r6.A06(r7, r8, r10, r12)
        L25:
            com.facebook.ads.redexgen.X.7Z r0 = r3.A0J
            com.facebook.ads.androidx.media3.common.Timeline r0 = r0.A03
            boolean r0 = r0.A0N()
            r4 = 0
            if (r0 == 0) goto L4d
            boolean r5 = r3.A0O
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AC.A0n
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AC.A0n
            java.lang.String r1 = "E7I7Mej0S3DTzUCwep"
            r0 = 6
            r2[r0] = r1
            if (r5 == 0) goto L5f
        L4d:
            com.facebook.ads.androidx.media3.common.Timeline r0 = r6.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L5f
            r3.A01 = r4
            r3.A02 = r4
            r0 = 0
            r3.A08 = r0
            r3.A07 = r0
        L5f:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L73
            r9 = 0
        L64:
            boolean r10 = r3.A0P
            r3.A0O = r4
            r3.A0P = r4
            r5 = r14
            r8 = r18
            r7 = r17
            r5.A08(r6, r7, r8, r9, r10)
        L72:
            return
        L73:
            r9 = 2
            goto L64
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AC.A07(com.facebook.ads.redexgen.X.7Z, int, boolean, int):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0058 */
    /* JADX WARN: Incorrect condition in loop: B:34:0x009b */
    /* JADX WARN: Incorrect condition in loop: B:39:0x00b8 */
    /* JADX WARN: Incorrect condition in loop: B:55:0x0121 */
    /* JADX WARN: Incorrect condition in loop: B:61:0x0144 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.instagram.common.viewpoint.core.C7Z r10, boolean r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AC.A08(com.facebook.ads.redexgen.X.7Z, boolean, int, int, boolean):void");
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z3, boolean z10) {
        if (this.A0Q != z3) {
            this.A0Q = z3;
            this.A04++;
            this.A0e.A1G(z3);
            C7Z c7z = this.A0J;
            if (!z3) {
                this.A0R = z3;
                Iterator<C3U> it = this.A0j.iterator();
                while (it.hasNext()) {
                    C3U next = it.next();
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    next.AFM(z3, c7z.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2001qP
    public final void A0H(int i4, long j) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i4 >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0n[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0n;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i4 < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAd()) {
                    Log.w(A04(2, 13, 30), A04(217, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i4;
                if (timeline.A0N()) {
                    this.A08 = j == -9223372036854775807L ? 0L : j;
                    this.A01 = 0;
                } else {
                    if (j == -9223372036854775807L) {
                        jA00 = timeline.A0K(i4, super.A00).A05();
                    } else {
                        jA00 = C2Y.A00(j);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0a, i4, jA00);
                    this.A08 = C2Y.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0e.A1D(timeline, i4, C2Y.A00(j));
                Iterator<C3U> it = this.A0j.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C01882q(timeline, i4, j);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7h(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C1963pl c1963plA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0a);
            jA0D = c1963plA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c1963plA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return C5C.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j = this.A07;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0n[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j;
        }
        C7Z c7z = this.A0J;
        if (A0n[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0n[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return C2Y.A01(c7z.A0C);
    }

    public final Looper A0K() {
        return this.A0Y;
    }

    public final C03037d A0L(InterfaceC03027c interfaceC03027c) {
        A05();
        return A03(interfaceC03027c);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(185, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(C5C.A04).append(strA04).append(AnonymousClass35.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0e.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C1944pR.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C7Z) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C1975px c1975px = (C1975px) message.obj;
                C1975px c1975px2 = this.A0D;
                String[] strArr = A0n;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0n;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c1975px2.equals(c1975px)) {
                        this.A0D = c1975px;
                        Iterator<C3U> it = this.A0j.iterator();
                        while (it.hasNext()) {
                            it.next().AFI(c1975px);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                AD ad2 = (AD) message.obj;
                this.A0I = ad2;
                CopyOnWriteArraySet<C3U> copyOnWriteArraySet = this.A0j;
                String[] strArr3 = A0n;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0n;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<C3U> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0n;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0n[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AFK(ad2);
                }
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<C3U> copyOnWriteArraySet2 = this.A0j;
                    if (A0n[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0n;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    Iterator<C3U> it3 = copyOnWriteArraySet2.iterator();
                    while (it3.hasNext()) {
                        C3U next = it3.next();
                        if (this.A0R) {
                            next.AFM(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<C3U> it4 = this.A0j.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<C3U> copyOnWriteArraySet3 = this.A0j;
                String[] strArr7 = A0n;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0n;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<C3U> it5 = copyOnWriteArraySet3.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(C3U c3u) {
        this.A0j.add(c3u);
    }

    public final void A0P(InterfaceC0434Cx interfaceC0434Cx, boolean z3, boolean z10) {
        this.A0I = null;
        this.A0L = interfaceC0434Cx;
        C7Z c7zA02 = A02(z3, z10, 2);
        this.A0O = true;
        this.A03++;
        this.A0e.A1F(interfaceC0434Cx, z3, z10);
        A08(c7zA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z3) {
        A09(z3, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final long A77() {
        if (AAd()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return C2Y.A01(this.A0J.A0B);
            }
            return A7s();
        }
        return A0I();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final long A7T() {
        if (AAd()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            return this.A0a.A0B() + C2Y.A01(this.A0J.A01);
        }
        return A7e();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final int A7Y() {
        if (AAd()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final int A7Z() {
        if (AAd()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7b() {
        A05();
        int iA7h = A7h();
        if (iA7h == -1) {
            return 0;
        }
        return iA7h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final int A7c() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C1844no c1844no = this.A0J.A05;
        String[] strArr = A0n;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0n[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c1844no.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final long A7e() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return C2Y.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final Timeline A7g() {
        return this.A0J.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final int A7h() {
        if (A0A()) {
            int i4 = this.A02;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i4;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a).A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final long A7s() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAd()) {
            C1844no c1844no = this.A0J.A05;
            timeline.A0J(c1844no.A04, this.A0a);
            return C2Y.A01(this.A0a.A0E(c1844no.A00, c1844no.A01));
        }
        return timeline.A0K(A7h(), super.A00).A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final long A9J() {
        return Math.max(0L, C2Y.A01(this.A0J.A0D));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final boolean AAd() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01993b
    public final void AKG(boolean z3) {
        if (z3) {
            this.A0I = null;
            this.A0L = null;
        }
        C7Z c7zA02 = A02(z3, z3, 1);
        this.A03++;
        this.A0e.A1H(z3);
        A08(c7zA02, false, 4, 1, false);
        this.A0G = new C1944pR(MetaExoPlayerCustomizedCollections.A01(), c7zA02.A0C);
    }
}
