package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oi1 implements lf1 {
    public static final byte[] j0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] k0;
    public static final byte[] l0;
    public static final byte[] m0;
    public static final UUID n0;
    public static final Map o0;
    public long A;
    public final SparseArray B;
    public boolean C;
    public long D;
    public int E;
    public long F;
    public int G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public boolean L;
    public int M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int[] R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public long X;
    public int Y;
    public int Z;
    public final pi1 a;
    public int a0;
    public final SparseArray b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public final jk1 e;
    public int e0;
    public final kz2 f;
    public byte f0;
    public final kz2 g;
    public boolean g0;
    public final kz2 h;
    public nf1 h0;
    public final kz2 i;
    public final ki1 i0;
    public final kz2 j;
    public final kz2 k;
    public final kz2 l;
    public final kz2 m;
    public final kz2 n;
    public final kz2 o;
    public ByteBuffer p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public ni1 x;
    public boolean y;
    public int z;

    static {
        String str = v23.a;
        k0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        l0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        m0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        n0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ga1.m(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ga1.m(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        o0 = Collections.unmodifiableMap(map);
    }

    public oi1() {
        this(new ki1(), 2, jk1.e);
    }

    public static byte[] o(long j, long j2, String str) {
        zt0.D(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str3 = v23.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void a() {
        if (!this.w) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                nf1 nf1Var = this.h0;
                nf1Var.getClass();
                nf1Var.s();
                this.w = false;
                return;
            }
            if (((ni1) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        t3 t3Var = new t3(6, (byte) 0);
        df1 df1Var = (df1) mf1Var;
        long j = df1Var.h;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        kz2 kz2Var = (kz2) t3Var.h;
        df1Var.B(kz2Var.a, 0, 4, false);
        long jP = kz2Var.P();
        t3Var.g = 4;
        while (true) {
            if (jP != 440786851) {
                int i = (int) j2;
                int i2 = t3Var.g + 1;
                t3Var.g = i2;
                if (i2 == i) {
                    break;
                }
                df1Var.B(kz2Var.a, 0, 1, false);
                jP = ((jP << 8) & (-256)) | (kz2Var.a[0] & 255);
            } else {
                long jX = t3Var.x(df1Var);
                long j3 = t3Var.g;
                if (jX != Long.MIN_VALUE) {
                    long j4 = j3 + jX;
                    if (j == -1 || j4 < j) {
                        while (true) {
                            long j5 = t3Var.g;
                            if (j5 < j4) {
                                if (t3Var.x(df1Var) != Long.MIN_VALUE) {
                                    long jX2 = t3Var.x(df1Var);
                                    if (jX2 < 0) {
                                        break;
                                    }
                                    if (jX2 != 0) {
                                        int i3 = (int) jX2;
                                        df1Var.e(i3, false);
                                        t3Var.g += i3;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j5 == j4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:496:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x065e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[LOOP:1: B:6:0x0016->B:49:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x070e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r36, defpackage.pf1 r37) throws defpackage.lq1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 3298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.K = -9223372036854775807L;
        this.M = 0;
        ki1 ki1Var = this.i0;
        ki1Var.e = 0;
        ki1Var.b.clear();
        pi1 pi1Var = ki1Var.c;
        pi1Var.f = 0;
        pi1Var.g = 0;
        pi1 pi1Var2 = this.a;
        pi1Var2.f = 0;
        pi1Var2.g = 0;
        m();
        this.C = false;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            kg1 kg1Var = ((ni1) sparseArray.valueAt(i)).V;
            if (kg1Var != null) {
                kg1Var.b = false;
                kg1Var.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        if (this.d) {
            nf1Var = new rl(nf1Var, this.e);
        }
        this.h0 = nf1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0230, code lost:
    
        if (r3.equals("A_OPUS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0232, code lost:
    
        r48 = "S_HDMV/PGS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023c, code lost:
    
        if (r3.equals("A_FLAC") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
    
        if (r3.equals("A_EAC3") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024a, code lost:
    
        if (r3.equals("V_MPEG2") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0251, code lost:
    
        if (r3.equals("S_TEXT/UTF8") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0258, code lost:
    
        if (r3.equals("S_TEXT/WEBVTT") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025f, code lost:
    
        if (r3.equals("V_MPEGH/ISO/HEVC") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0266, code lost:
    
        if (r3.equals("S_TEXT/SSA") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026d, code lost:
    
        if (r3.equals("S_TEXT/ASS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0274, code lost:
    
        if (r3.equals("A_PCM/INT/LIT") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x027b, code lost:
    
        if (r3.equals("A_PCM/INT/BIG") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0282, code lost:
    
        if (r3.equals("A_PCM/FLOAT/IEEE") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0289, code lost:
    
        if (r3.equals("A_DTS/EXPRESS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r3.equals("V_THEORA") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0297, code lost:
    
        if (r3.equals("S_HDMV/PGS") != false) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0234 A[PHI: r25 r26 r27 r28 r29 r30 r31 r32 r33 r34 r35 r36 r37 r38 r39 r40 r48
  0x0234: PHI (r25v2 java.lang.Object) = 
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v1 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
  (r25v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r26v2 java.lang.Object) = 
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v1 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
  (r26v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r27v2 java.lang.Object) = 
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v1 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r28v2 java.lang.Object) = 
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v1 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
  (r28v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r29v2 java.lang.Object) = 
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v1 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
  (r29v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r30v2 java.lang.Object) = 
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v1 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
  (r30v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r31v2 java.lang.Object) = 
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v1 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r32v2 java.lang.Object) = 
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v1 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r33v2 java.lang.Object) = 
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v1 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
  (r33v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r34v2 java.lang.Object) = 
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v1 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
  (r34v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r35v2 java.lang.Object) = 
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v1 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
  (r35v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r36v2 java.lang.Object) = 
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v1 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
  (r36v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r37v2 java.lang.Object) = 
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v1 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
  (r37v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r38v2 java.lang.Object) = 
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v1 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
  (r38v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r39v2 java.lang.Object) = 
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v1 java.lang.Object)
  (r39v0 java.lang.Object)
  (r39v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r40v2 java.lang.Object) = 
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v0 java.lang.Object)
  (r40v1 java.lang.Object)
  (r40v0 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r48v21 java.lang.Object) = 
  (r48v2 java.lang.Object)
  (r48v3 java.lang.Object)
  (r48v4 java.lang.Object)
  (r48v5 java.lang.Object)
  (r48v6 java.lang.Object)
  (r48v7 java.lang.Object)
  (r48v8 java.lang.Object)
  (r48v9 java.lang.Object)
  (r48v10 java.lang.Object)
  (r48v11 java.lang.Object)
  (r48v12 java.lang.Object)
  (r48v13 java.lang.Object)
  (r48v14 java.lang.Object)
  (r48v15 java.lang.Object)
  (r48v16 java.lang.Object)
  (r48v17 java.lang.Object)
  (r48v18 java.lang.Object)
  (r48v19 java.lang.Object)
  (r48v20 java.lang.Object)
  (r48v22 java.lang.Object)
 binds: [B:223:0x0397, B:220:0x038c, B:217:0x0380, B:215:0x0374, B:212:0x0366, B:209:0x0358, B:206:0x034a, B:203:0x033c, B:200:0x032e, B:197:0x0320, B:194:0x0312, B:191:0x0304, B:188:0x02f6, B:185:0x02e8, B:182:0x02da, B:179:0x02cc, B:176:0x02be, B:173:0x02b1, B:170:0x02a4, B:124:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0b31  */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r48) throws defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 3368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi1.g(int):void");
    }

    public final void h(int i) throws lq1 {
        if (this.x != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw lq1.a(null, sb.toString());
    }

    public final void i(int i) throws lq1 {
        if (this.C) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw lq1.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r2 = o(r10, 10000, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(defpackage.ni1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi1.j(ni1, long, int, int, int):void");
    }

    public final void k(mf1 mf1Var, int i) {
        kz2 kz2Var = this.h;
        if (kz2Var.c >= i) {
            return;
        }
        byte[] bArr = kz2Var.a;
        if (bArr.length < i) {
            int length = bArr.length;
            kz2Var.A(Math.max(length + length, i));
        }
        byte[] bArr2 = kz2Var.a;
        int i2 = kz2Var.c;
        mf1Var.x(bArr2, i2, i - i2);
        kz2Var.C(i);
    }

    public final int l(mf1 mf1Var, ni1 ni1Var, int i, boolean z) throws lq1 {
        int iB;
        int iB2;
        int i2;
        if ("S_TEXT/UTF8".equals(ni1Var.c)) {
            n(mf1Var, j0, i);
            int i3 = this.Z;
            m();
            return i3;
        }
        if ("S_TEXT/ASS".equals(ni1Var.c) || "S_TEXT/SSA".equals(ni1Var.c)) {
            n(mf1Var, l0, i);
            int i4 = this.Z;
            m();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(ni1Var.c)) {
            n(mf1Var, m0, i);
            int i5 = this.Z;
            m();
            return i5;
        }
        if (ni1Var.W) {
            ni1Var.b0.getClass();
            kz2 kz2Var = new kz2(i);
            if (mf1Var.B(kz2Var.a, 0, i, true)) {
                mf1Var.i();
                if (qb1.w(kz2Var.J()) == 1 && kz2Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    kz2Var.H(bArr, 0, 10);
                    kz2Var.E(0);
                    int iD = qb1.D(bArr);
                    if (kz2Var.B() >= iD + 4) {
                        kz2Var.G(iD);
                        if (qb1.w(kz2Var.b()) == 2) {
                            ph4 ph4Var = ni1Var.b0;
                            ph4Var.getClass();
                            gg4 gg4Var = new gg4(ph4Var);
                            gg4Var.e("audio/vnd.dts.hd");
                            ni1Var.b0 = new ph4(gg4Var);
                        }
                    }
                }
            }
            ni1Var.a0.d(ni1Var.b0);
            ni1Var.W = false;
            a();
        }
        jg1 jg1Var = ni1Var.a0;
        boolean z2 = this.b0;
        kz2 kz2Var2 = this.k;
        if (!z2) {
            boolean z3 = ni1Var.i;
            kz2 kz2Var3 = this.h;
            if (z3) {
                this.U &= -1073741825;
                if (!this.c0) {
                    mf1Var.x(kz2Var3.a, 0, 1);
                    this.Y++;
                    byte b = kz2Var3.a[0];
                    if ((b & 128) == 128) {
                        throw lq1.a(null, "Extension bit is set in signal byte");
                    }
                    this.f0 = b;
                    this.c0 = true;
                }
                byte b2 = this.f0;
                if ((b2 & 1) == 1) {
                    int i6 = b2 & 2;
                    this.U |= 1073741824;
                    if (!this.g0) {
                        kz2 kz2Var4 = this.m;
                        mf1Var.x(kz2Var4.a, 0, 8);
                        this.Y += 8;
                        this.g0 = true;
                        kz2Var3.a[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        kz2Var3.E(0);
                        jg1Var.a(kz2Var3, 1, 1);
                        this.Z++;
                        kz2Var4.E(0);
                        jg1Var.a(kz2Var4, 8, 1);
                        this.Z += 8;
                    }
                    if (i6 == 2) {
                        if (!this.d0) {
                            mf1Var.x(kz2Var3.a, 0, 1);
                            this.Y++;
                            kz2Var3.E(0);
                            this.e0 = kz2Var3.K();
                            this.d0 = true;
                        }
                        int i7 = this.e0 * 4;
                        kz2Var3.y(i7);
                        mf1Var.x(kz2Var3.a, 0, i7);
                        this.Y += i7;
                        int i8 = (this.e0 >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.p;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.p = ByteBuffer.allocate(i9);
                        }
                        this.p.position(0);
                        this.p.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.e0;
                            if (i10 >= i2) {
                                break;
                            }
                            int iH = kz2Var3.h();
                            int i12 = iH - i11;
                            if (i10 % 2 == 0) {
                                this.p.putShort((short) i12);
                            } else {
                                this.p.putInt(i12);
                            }
                            i10++;
                            i11 = iH;
                        }
                        int i13 = (i - this.Y) - i11;
                        if ((i2 & 1) == 1) {
                            this.p.putInt(i13);
                        } else {
                            this.p.putShort((short) i13);
                            this.p.putInt(0);
                        }
                        byte[] bArrArray = this.p.array();
                        kz2 kz2Var5 = this.n;
                        kz2Var5.z(i9, bArrArray);
                        jg1Var.a(kz2Var5, i9, 1);
                        this.Z += i9;
                    }
                }
            } else {
                byte[] bArr2 = ni1Var.j;
                if (bArr2 != null) {
                    kz2Var2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(ni1Var.c) ? ni1Var.g > 0 : z) {
                this.U |= 268435456;
                this.o.y(0);
                int i14 = (kz2Var2.c + i) - this.Y;
                kz2Var3.y(4);
                byte[] bArr3 = kz2Var3.a;
                bArr3[0] = (byte) ((i14 >> 24) & 255);
                bArr3[1] = (byte) ((i14 >> 16) & 255);
                bArr3[2] = (byte) ((i14 >> 8) & 255);
                bArr3[3] = (byte) (i14 & 255);
                jg1Var.a(kz2Var3, 4, 2);
                this.Z += 4;
            }
            this.b0 = true;
        }
        int i15 = i + kz2Var2.c;
        if (!"V_MPEG4/ISO/AVC".equals(ni1Var.c) && !"V_MPEGH/ISO/HEVC".equals(ni1Var.c)) {
            if (ni1Var.V != null) {
                zt0.b0(kz2Var2.c == 0);
                ni1Var.V.a(mf1Var);
            }
            while (true) {
                int i16 = this.Y;
                if (i16 >= i15) {
                    break;
                }
                int i17 = i15 - i16;
                int iB3 = kz2Var2.B();
                if (iB3 > 0) {
                    iB2 = Math.min(i17, iB3);
                    jg1Var.a(kz2Var2, iB2, 0);
                } else {
                    iB2 = jg1Var.b(mf1Var, i17, false);
                }
                this.Y += iB2;
                this.Z += iB2;
            }
        } else {
            kz2 kz2Var6 = this.g;
            byte[] bArr4 = kz2Var6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i18 = ni1Var.c0;
            int i19 = 4 - i18;
            while (this.Y < i15) {
                int i20 = this.a0;
                if (i20 == 0) {
                    int iMin = Math.min(i18, kz2Var2.B());
                    mf1Var.x(bArr4, i19 + iMin, i18 - iMin);
                    if (iMin > 0) {
                        kz2Var2.H(bArr4, i19, iMin);
                    }
                    this.Y += i18;
                    kz2Var6.E(0);
                    this.a0 = kz2Var6.h();
                    kz2 kz2Var7 = this.f;
                    kz2Var7.E(0);
                    jg1Var.a(kz2Var7, 4, 0);
                    this.Z += 4;
                } else {
                    int iB4 = kz2Var2.B();
                    if (iB4 > 0) {
                        iB = Math.min(i20, iB4);
                        jg1Var.a(kz2Var2, iB, 0);
                    } else {
                        iB = jg1Var.b(mf1Var, i20, false);
                    }
                    this.Y += iB;
                    this.Z += iB;
                    this.a0 -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(ni1Var.c)) {
            kz2 kz2Var8 = this.i;
            kz2Var8.E(0);
            jg1Var.a(kz2Var8, 4, 0);
            this.Z += 4;
        }
        int i21 = this.Z;
        m();
        return i21;
    }

    public final void m() {
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = (byte) 0;
        this.g0 = false;
        this.k.y(0);
    }

    public final void n(mf1 mf1Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        kz2 kz2Var = this.l;
        byte[] bArr2 = kz2Var.a;
        if (bArr2.length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            kz2Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        mf1Var.x(kz2Var.a, length, i);
        kz2Var.E(0);
        kz2Var.C(i2);
    }

    public final long p(long j) throws lq1 {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return v23.t(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw lq1.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public oi1(ki1 ki1Var, int i, jk1 jk1Var) {
        this.r = -1L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1;
        this.I = -1L;
        this.J = -1L;
        this.K = -9223372036854775807L;
        this.i0 = ki1Var;
        ki1Var.d = new f23(11, this);
        this.e = jk1Var;
        this.B = new SparseArray();
        this.c = true;
        this.d = (i & 2) == 0;
        this.a = new pi1(0);
        this.b = new SparseArray();
        this.h = new kz2(4);
        this.i = new kz2(ByteBuffer.allocate(4).putInt(-1).array());
        this.j = new kz2(4);
        this.f = new kz2(wl2.G);
        this.g = new kz2(4);
        this.k = new kz2();
        this.l = new kz2();
        this.m = new kz2(8);
        this.n = new kz2();
        this.o = new kz2();
        this.R = new int[1];
        this.w = true;
    }
}
