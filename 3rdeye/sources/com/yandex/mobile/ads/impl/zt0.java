package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.n52;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class zt0 implements u70 {

    /* renamed from: c0, reason: collision with root package name */
    private static final byte[] f36614c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f36615d0 = s82.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f36616e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f36617f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    private static final UUID f36618g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    private static final Map<String, Integer> f36619h0;

    /* renamed from: A, reason: collision with root package name */
    private long f36620A;

    /* renamed from: B, reason: collision with root package name */
    private long f36621B;

    /* renamed from: C, reason: collision with root package name */
    private us0 f36622C;

    /* renamed from: D, reason: collision with root package name */
    private us0 f36623D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f36624E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f36625F;

    /* renamed from: G, reason: collision with root package name */
    private int f36626G;

    /* renamed from: H, reason: collision with root package name */
    private long f36627H;

    /* renamed from: I, reason: collision with root package name */
    private long f36628I;

    /* renamed from: J, reason: collision with root package name */
    private int f36629J;

    /* renamed from: K, reason: collision with root package name */
    private int f36630K;

    /* renamed from: L, reason: collision with root package name */
    private int[] f36631L;

    /* renamed from: M, reason: collision with root package name */
    private int f36632M;

    /* renamed from: N, reason: collision with root package name */
    private int f36633N;

    /* renamed from: O, reason: collision with root package name */
    private int f36634O;

    /* renamed from: P, reason: collision with root package name */
    private int f36635P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f36636Q;

    /* renamed from: R, reason: collision with root package name */
    private long f36637R;

    /* renamed from: S, reason: collision with root package name */
    private int f36638S;

    /* renamed from: T, reason: collision with root package name */
    private int f36639T;

    /* renamed from: U, reason: collision with root package name */
    private int f36640U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f36641V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f36642W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f36643X;

    /* renamed from: Y, reason: collision with root package name */
    private int f36644Y;

    /* renamed from: Z, reason: collision with root package name */
    private byte f36645Z;

    /* renamed from: a, reason: collision with root package name */
    private final v40 f36646a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f36647a0;

    /* renamed from: b, reason: collision with root package name */
    private final d92 f36648b;

    /* renamed from: b0, reason: collision with root package name */
    private w70 f36649b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f36650c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36651d;

    /* renamed from: e, reason: collision with root package name */
    private final uf1 f36652e;

    /* renamed from: f, reason: collision with root package name */
    private final uf1 f36653f;

    /* renamed from: g, reason: collision with root package name */
    private final uf1 f36654g;

    /* renamed from: h, reason: collision with root package name */
    private final uf1 f36655h;
    private final uf1 i;

    /* renamed from: j, reason: collision with root package name */
    private final uf1 f36656j;

    /* renamed from: k, reason: collision with root package name */
    private final uf1 f36657k;

    /* renamed from: l, reason: collision with root package name */
    private final uf1 f36658l;

    /* renamed from: m, reason: collision with root package name */
    private final uf1 f36659m;

    /* renamed from: n, reason: collision with root package name */
    private final uf1 f36660n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f36661o;

    /* renamed from: p, reason: collision with root package name */
    private long f36662p;

    /* renamed from: q, reason: collision with root package name */
    private long f36663q;

    /* renamed from: r, reason: collision with root package name */
    private long f36664r;

    /* renamed from: s, reason: collision with root package name */
    private long f36665s;

    /* renamed from: t, reason: collision with root package name */
    private long f36666t;

    /* renamed from: u, reason: collision with root package name */
    private b f36667u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f36668v;

    /* renamed from: w, reason: collision with root package name */
    private int f36669w;

    /* renamed from: x, reason: collision with root package name */
    private long f36670x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f36671y;

    /* renamed from: z, reason: collision with root package name */
    private long f36672z;

    public final class a implements u40 {
        public /* synthetic */ a(zt0 zt0Var, int i) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(int i, int i10, rz rzVar) throws IOException {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            long j4;
            int i17;
            int i18;
            int i19;
            zt0 zt0Var = zt0.this;
            zt0Var.getClass();
            int i20 = 1;
            int i21 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (zt0Var.f36626G != 2) {
                        return;
                    }
                    b bVar = (b) zt0Var.f36650c.get(zt0Var.f36632M);
                    if (zt0Var.f36635P != 4 || !"V_VP9".equals(bVar.f36700b)) {
                        rzVar.a(i10);
                        return;
                    } else {
                        zt0Var.f36660n.c(i10);
                        rzVar.a(zt0Var.f36660n.c(), 0, i10, false);
                        return;
                    }
                }
                if (i == 16877) {
                    zt0Var.a(i);
                    b bVar2 = zt0Var.f36667u;
                    int i22 = bVar2.f36705g;
                    if (i22 != 1685485123 && i22 != 1685480259) {
                        rzVar.a(i10);
                        return;
                    }
                    byte[] bArr = new byte[i10];
                    bVar2.f36687N = bArr;
                    rzVar.a(bArr, 0, i10, false);
                    return;
                }
                if (i == 16981) {
                    zt0Var.a(i);
                    b bVar3 = zt0Var.f36667u;
                    byte[] bArr2 = new byte[i10];
                    bVar3.i = bArr2;
                    rzVar.a(bArr2, 0, i10, false);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i10];
                    rzVar.a(bArr3, 0, i10, false);
                    zt0Var.a(i);
                    zt0Var.f36667u.f36707j = new n52.a(1, 0, 0, bArr3);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(zt0Var.i.c(), (byte) 0);
                    rzVar.a(zt0Var.i.c(), 4 - i10, i10, false);
                    zt0Var.i.e(0);
                    zt0Var.f36669w = (int) zt0Var.i.v();
                    return;
                }
                if (i == 25506) {
                    zt0Var.a(i);
                    b bVar4 = zt0Var.f36667u;
                    byte[] bArr4 = new byte[i10];
                    bVar4.f36708k = bArr4;
                    rzVar.a(bArr4, 0, i10, false);
                    return;
                }
                if (i != 30322) {
                    throw yf1.a("Unexpected id: " + i, (Exception) null);
                }
                zt0Var.a(i);
                b bVar5 = zt0Var.f36667u;
                byte[] bArr5 = new byte[i10];
                bVar5.f36719v = bArr5;
                rzVar.a(bArr5, 0, i10, false);
                return;
            }
            int i23 = 8;
            if (zt0Var.f36626G == 0) {
                zt0Var.f36632M = (int) zt0Var.f36648b.a(rzVar, false, true, 8);
                zt0Var.f36633N = zt0Var.f36648b.a();
                zt0Var.f36628I = -9223372036854775807L;
                zt0Var.f36626G = 1;
                zt0Var.f36654g.c(0);
            }
            b bVar6 = (b) zt0Var.f36650c.get(zt0Var.f36632M);
            if (bVar6 == null) {
                rzVar.a(i10 - zt0Var.f36633N);
                zt0Var.f36626G = 0;
                return;
            }
            bVar6.f36697X.getClass();
            if (zt0Var.f36626G == 1) {
                zt0Var.a(rzVar, 3);
                int i24 = (zt0Var.f36654g.c()[2] & 6) >> 1;
                if (i24 == 0) {
                    zt0Var.f36630K = 1;
                    int[] iArr = zt0Var.f36631L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    zt0Var.f36631L = iArr;
                    iArr[0] = (i10 - zt0Var.f36633N) - 3;
                } else {
                    zt0Var.a(rzVar, 4);
                    int i25 = (zt0Var.f36654g.c()[3] & KotlinVersion.MAX_COMPONENT_VALUE) + 1;
                    zt0Var.f36630K = i25;
                    int[] iArr2 = zt0Var.f36631L;
                    if (iArr2 == null) {
                        iArr2 = new int[i25];
                    } else if (iArr2.length < i25) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                    }
                    zt0Var.f36631L = iArr2;
                    if (i24 == 2) {
                        int i26 = (i10 - zt0Var.f36633N) - 4;
                        int i27 = zt0Var.f36630K;
                        Arrays.fill(iArr2, 0, i27, i26 / i27);
                    } else {
                        if (i24 != 1) {
                            if (i24 != 3) {
                                throw yf1.a("Unexpected lacing value: " + i24, (Exception) null);
                            }
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 4;
                            while (true) {
                                int i31 = zt0Var.f36630K - i20;
                                if (i28 >= i31) {
                                    i11 = i20;
                                    i13 = i21;
                                    zt0Var.f36631L[i31] = ((i10 - zt0Var.f36633N) - i30) - i29;
                                    break;
                                }
                                zt0Var.f36631L[i28] = i21;
                                int i32 = i30 + 1;
                                zt0Var.a(rzVar, i32);
                                if (zt0Var.f36654g.c()[i30] == 0) {
                                    throw yf1.a("No valid varint length mask found", (Exception) null);
                                }
                                int i33 = i21;
                                while (true) {
                                    if (i33 >= i23) {
                                        i14 = i20;
                                        i15 = i21;
                                        i16 = i23;
                                        j4 = 0;
                                        i30 = i32;
                                        break;
                                    }
                                    i16 = i23;
                                    int i34 = i20 << (7 - i33);
                                    if ((zt0Var.f36654g.c()[i30] & i34) != 0) {
                                        i14 = i20;
                                        int i35 = i32 + i33;
                                        zt0Var.a(rzVar, i35);
                                        i15 = i21;
                                        j4 = zt0Var.f36654g.c()[i30] & 255 & (~i34);
                                        while (i32 < i35) {
                                            j4 = (j4 << i16) | (zt0Var.f36654g.c()[i32] & 255);
                                            i32++;
                                            i35 = i35;
                                        }
                                        int i36 = i35;
                                        if (i28 > 0) {
                                            j4 -= (1 << ((i33 * 7) + 6)) - 1;
                                        }
                                        i30 = i36;
                                    } else {
                                        i33++;
                                        i23 = i16;
                                    }
                                }
                                if (j4 < -2147483648L || j4 > 2147483647L) {
                                    break;
                                }
                                int i37 = (int) j4;
                                int[] iArr3 = zt0Var.f36631L;
                                if (i28 != 0) {
                                    i37 += iArr3[i28 - 1];
                                }
                                iArr3[i28] = i37;
                                i29 += i37;
                                i28++;
                                i20 = i14;
                                i23 = i16;
                                i21 = i15;
                            }
                            throw yf1.a("EBML lacing sample size out of range.", (Exception) null);
                        }
                        int i38 = 0;
                        int i39 = 0;
                        int i40 = 4;
                        while (true) {
                            i17 = zt0Var.f36630K - 1;
                            if (i38 >= i17) {
                                break;
                            }
                            zt0Var.f36631L[i38] = 0;
                            while (true) {
                                i18 = i40 + 1;
                                zt0Var.a(rzVar, i18);
                                int i41 = zt0Var.f36654g.c()[i40] & 255;
                                int[] iArr4 = zt0Var.f36631L;
                                i19 = iArr4[i38] + i41;
                                iArr4[i38] = i19;
                                if (i41 != 255) {
                                    break;
                                } else {
                                    i40 = i18;
                                }
                            }
                            i39 += i19;
                            i38++;
                            i40 = i18;
                        }
                        zt0Var.f36631L[i17] = ((i10 - zt0Var.f36633N) - i40) - i39;
                    }
                }
                i11 = 1;
                i13 = 0;
                zt0Var.f36627H = zt0Var.a((zt0Var.f36654g.c()[i13] << 8) | (zt0Var.f36654g.c()[i11] & 255)) + zt0Var.f36621B;
                zt0Var.f36634O = (bVar6.f36702d == 2 || (i == 163 && (zt0Var.f36654g.c()[2] & 128) == 128)) ? i11 : i13;
                zt0Var.f36626G = 2;
                zt0Var.f36629J = i13;
                i12 = 163;
            } else {
                i11 = 1;
                i12 = 163;
            }
            if (i == i12) {
                while (true) {
                    int i42 = zt0Var.f36629J;
                    if (i42 >= zt0Var.f36630K) {
                        zt0Var.f36626G = 0;
                        return;
                    }
                    b bVar7 = bVar6;
                    zt0Var.a(bVar7, zt0Var.f36627H + ((zt0Var.f36629J * bVar6.f36703e) / 1000), zt0Var.f36634O, zt0Var.a(rzVar, bVar6, zt0Var.f36631L[i42], false), 0);
                    zt0Var.f36629J++;
                    bVar6 = bVar7;
                }
            } else {
                while (true) {
                    int i43 = zt0Var.f36629J;
                    if (i43 >= zt0Var.f36630K) {
                        return;
                    }
                    int[] iArr5 = zt0Var.f36631L;
                    boolean z10 = i11;
                    iArr5[i43] = zt0Var.a(rzVar, bVar6, iArr5[i43], z10);
                    zt0Var.f36629J += z10 ? 1 : 0;
                }
            }
        }

        private a() {
        }

        public final void a(int i, double d10) throws yf1 {
            zt0 zt0Var = zt0.this;
            if (i == 181) {
                zt0Var.a(i);
                zt0Var.f36667u.f36690Q = (int) d10;
                return;
            }
            if (i != 17545) {
                switch (i) {
                    case 21969:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36677D = (float) d10;
                        break;
                    case 21970:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36678E = (float) d10;
                        break;
                    case 21971:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36679F = (float) d10;
                        break;
                    case 21972:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36680G = (float) d10;
                        break;
                    case 21973:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36681H = (float) d10;
                        break;
                    case 21974:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36682I = (float) d10;
                        break;
                    case 21975:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36683J = (float) d10;
                        break;
                    case 21976:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36684K = (float) d10;
                        break;
                    case 21977:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36685L = (float) d10;
                        break;
                    case 21978:
                        zt0Var.a(i);
                        zt0Var.f36667u.f36686M = (float) d10;
                        break;
                    default:
                        switch (i) {
                            case 30323:
                                zt0Var.a(i);
                                zt0Var.f36667u.f36716s = (float) d10;
                                break;
                            case 30324:
                                zt0Var.a(i);
                                zt0Var.f36667u.f36717t = (float) d10;
                                break;
                            case 30325:
                                zt0Var.a(i);
                                zt0Var.f36667u.f36718u = (float) d10;
                                break;
                            default:
                                zt0Var.getClass();
                                break;
                        }
                }
                return;
            }
            zt0Var.f36665s = (long) d10;
        }

        public final void a(int i, long j4) throws yf1 {
            us0 us0Var;
            zt0 zt0Var = zt0.this;
            zt0Var.getClass();
            if (i == 20529) {
                if (j4 == 0) {
                    return;
                }
                throw yf1.a("ContentEncodingOrder " + j4 + " not supported", (Exception) null);
            }
            if (i == 20530) {
                if (j4 == 1) {
                    return;
                }
                throw yf1.a("ContentEncodingScope " + j4 + " not supported", (Exception) null);
            }
            int i10 = 3;
            int i11 = 2;
            switch (i) {
                case 131:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36702d = (int) j4;
                    return;
                case 136:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36695V = j4 == 1;
                    return;
                case 155:
                    zt0Var.f36628I = zt0Var.a(j4);
                    return;
                case 159:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36688O = (int) j4;
                    return;
                case 176:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36710m = (int) j4;
                    return;
                case 179:
                    us0 us0Var2 = zt0Var.f36622C;
                    if (us0Var2 != null && zt0Var.f36623D != null) {
                        us0Var2.a(zt0Var.a(j4));
                        return;
                    }
                    throw yf1.a("Element " + i + " must be in a Cues", (Exception) null);
                case 186:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36711n = (int) j4;
                    return;
                case 215:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36701c = (int) j4;
                    return;
                case 231:
                    zt0Var.f36621B = zt0Var.a(j4);
                    return;
                case 238:
                    zt0Var.f36635P = (int) j4;
                    return;
                case 241:
                    if (zt0Var.f36624E) {
                        return;
                    }
                    if (zt0Var.f36622C != null && (us0Var = zt0Var.f36623D) != null) {
                        us0Var.a(j4);
                        zt0Var.f36624E = true;
                        return;
                    } else {
                        throw yf1.a("Element " + i + " must be in a Cues", (Exception) null);
                    }
                case 251:
                    zt0Var.f36636Q = true;
                    return;
                case 16871:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36705g = (int) j4;
                    return;
                case 16980:
                    if (j4 == 3) {
                        return;
                    }
                    throw yf1.a("ContentCompAlgo " + j4 + " not supported", (Exception) null);
                case 17029:
                    if (j4 < 1 || j4 > 2) {
                        throw yf1.a("DocTypeReadVersion " + j4 + " not supported", (Exception) null);
                    }
                    return;
                case 17143:
                    if (j4 == 1) {
                        return;
                    }
                    throw yf1.a("EBMLReadVersion " + j4 + " not supported", (Exception) null);
                case 18401:
                    if (j4 == 5) {
                        return;
                    }
                    throw yf1.a("ContentEncAlgo " + j4 + " not supported", (Exception) null);
                case 18408:
                    if (j4 == 1) {
                        return;
                    }
                    throw yf1.a("AESSettingsCipherMode " + j4 + " not supported", (Exception) null);
                case 21420:
                    zt0Var.f36670x = zt0Var.f36663q + j4;
                    return;
                case 21432:
                    int i12 = (int) j4;
                    zt0Var.a(i);
                    if (i12 == 0) {
                        zt0Var.f36667u.f36720w = 0;
                        return;
                    }
                    if (i12 == 1) {
                        zt0Var.f36667u.f36720w = 2;
                        return;
                    } else if (i12 == 3) {
                        zt0Var.f36667u.f36720w = 1;
                        return;
                    } else {
                        if (i12 != 15) {
                            return;
                        }
                        zt0Var.f36667u.f36720w = 3;
                        return;
                    }
                case 21680:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36712o = (int) j4;
                    return;
                case 21682:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36714q = (int) j4;
                    return;
                case 21690:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36713p = (int) j4;
                    return;
                case 21930:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36694U = j4 == 1;
                    return;
                case 21998:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36704f = (int) j4;
                    return;
                case 22186:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36691R = j4;
                    return;
                case 22203:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36692S = j4;
                    return;
                case 25188:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36689P = (int) j4;
                    return;
                case 30114:
                    zt0Var.f36637R = j4;
                    return;
                case 30321:
                    zt0Var.a(i);
                    int i13 = (int) j4;
                    if (i13 == 0) {
                        zt0Var.f36667u.f36715r = 0;
                        return;
                    }
                    if (i13 == 1) {
                        zt0Var.f36667u.f36715r = 1;
                        return;
                    } else if (i13 == 2) {
                        zt0Var.f36667u.f36715r = 2;
                        return;
                    } else {
                        if (i13 != 3) {
                            return;
                        }
                        zt0Var.f36667u.f36715r = 3;
                        return;
                    }
                case 2352003:
                    zt0Var.a(i);
                    zt0Var.f36667u.f36703e = (int) j4;
                    return;
                case 2807729:
                    zt0Var.f36664r = j4;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            zt0Var.a(i);
                            int i14 = (int) j4;
                            if (i14 == 1) {
                                zt0Var.f36667u.f36674A = 2;
                                return;
                            } else {
                                if (i14 != 2) {
                                    return;
                                }
                                zt0Var.f36667u.f36674A = 1;
                                return;
                            }
                        case 21946:
                            zt0Var.a(i);
                            int i15 = (int) j4;
                            if (i15 != 1) {
                                if (i15 == 16) {
                                    i10 = 6;
                                } else if (i15 == 18) {
                                    i10 = 7;
                                } else if (i15 != 6 && i15 != 7) {
                                    i10 = -1;
                                }
                            }
                            if (i10 != -1) {
                                zt0Var.f36667u.f36723z = i10;
                                return;
                            }
                            return;
                        case 21947:
                            zt0Var.a(i);
                            b bVar = zt0Var.f36667u;
                            bVar.f36721x = true;
                            int i16 = (int) j4;
                            if (i16 == 1) {
                                i11 = 1;
                            } else if (i16 == 9) {
                                i11 = 6;
                            } else if (i16 != 4 && i16 != 5 && i16 != 6 && i16 != 7) {
                                i11 = -1;
                            }
                            if (i11 != -1) {
                                bVar.f36722y = i11;
                                return;
                            }
                            return;
                        case 21948:
                            zt0Var.a(i);
                            zt0Var.f36667u.f36675B = (int) j4;
                            return;
                        case 21949:
                            zt0Var.a(i);
                            zt0Var.f36667u.f36676C = (int) j4;
                            return;
                        default:
                            return;
                    }
            }
        }

        public final void a(int i, long j4, long j10) throws yf1 {
            zt0 zt0Var = zt0.this;
            w70 w70Var = zt0Var.f36649b0;
            if (w70Var == null) {
                throw new IllegalStateException();
            }
            if (i == 160) {
                zt0Var.f36636Q = false;
                zt0Var.f36637R = 0L;
                return;
            }
            if (i == 174) {
                zt0Var.f36667u = new b();
                return;
            }
            if (i == 187) {
                zt0Var.f36624E = false;
                return;
            }
            if (i == 19899) {
                zt0Var.f36669w = -1;
                zt0Var.f36670x = -1L;
                return;
            }
            if (i == 20533) {
                zt0Var.a(i);
                zt0Var.f36667u.f36706h = true;
                return;
            }
            if (i == 21968) {
                zt0Var.a(i);
                zt0Var.f36667u.f36721x = true;
                return;
            }
            if (i == 408125543) {
                long j11 = zt0Var.f36663q;
                if (j11 == -1 || j11 == j4) {
                    zt0Var.f36663q = j4;
                    zt0Var.f36662p = j10;
                    return;
                }
                throw yf1.a("Multiple Segment elements not supported", (Exception) null);
            }
            if (i != 475249515) {
                if (i == 524531317 && !zt0Var.f36668v) {
                    if (zt0Var.f36651d && zt0Var.f36672z != -1) {
                        zt0Var.f36671y = true;
                        return;
                    } else {
                        w70Var.a(new tw1.b(zt0Var.f36666t, 0L));
                        zt0Var.f36668v = true;
                        return;
                    }
                }
                return;
            }
            zt0Var.f36622C = new us0(0);
            zt0Var.f36623D = new us0(0);
        }

        public final void a(int i, String str) throws yf1 {
            zt0 zt0Var = zt0.this;
            zt0Var.getClass();
            if (i == 134) {
                zt0Var.a(i);
                zt0Var.f36667u.f36700b = str;
                return;
            }
            if (i == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    return;
                }
                throw yf1.a("DocType " + str + " not supported", (Exception) null);
            }
            if (i == 21358) {
                zt0Var.a(i);
                zt0Var.f36667u.f36699a = str;
            } else {
                if (i != 2274716) {
                    return;
                }
                zt0Var.a(i);
                zt0Var.f36667u.f36696W = str;
            }
        }
    }

    public static final class b {

        /* renamed from: N, reason: collision with root package name */
        public byte[] f36687N;

        /* renamed from: T, reason: collision with root package name */
        public v62 f36693T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f36694U;

        /* renamed from: X, reason: collision with root package name */
        public n52 f36697X;

        /* renamed from: Y, reason: collision with root package name */
        public int f36698Y;

        /* renamed from: a, reason: collision with root package name */
        public String f36699a;

        /* renamed from: b, reason: collision with root package name */
        public String f36700b;

        /* renamed from: c, reason: collision with root package name */
        public int f36701c;

        /* renamed from: d, reason: collision with root package name */
        public int f36702d;

        /* renamed from: e, reason: collision with root package name */
        public int f36703e;

        /* renamed from: f, reason: collision with root package name */
        public int f36704f;

        /* renamed from: g, reason: collision with root package name */
        private int f36705g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f36706h;
        public byte[] i;

        /* renamed from: j, reason: collision with root package name */
        public n52.a f36707j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f36708k;

        /* renamed from: l, reason: collision with root package name */
        public a40 f36709l;

        /* renamed from: m, reason: collision with root package name */
        public int f36710m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f36711n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f36712o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f36713p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f36714q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f36715r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f36716s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f36717t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f36718u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f36719v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f36720w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f36721x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f36722y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f36723z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f36674A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f36675B = 1000;

        /* renamed from: C, reason: collision with root package name */
        public int f36676C = 200;

        /* renamed from: D, reason: collision with root package name */
        public float f36677D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f36678E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f36679F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f36680G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f36681H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f36682I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f36683J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f36684K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f36685L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f36686M = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public int f36688O = 1;

        /* renamed from: P, reason: collision with root package name */
        public int f36689P = -1;

        /* renamed from: Q, reason: collision with root package name */
        public int f36690Q = 8000;

        /* renamed from: R, reason: collision with root package name */
        public long f36691R = 0;

        /* renamed from: S, reason: collision with root package name */
        public long f36692S = 0;

        /* renamed from: V, reason: collision with root package name */
        public boolean f36695V = true;

        /* renamed from: W, reason: collision with root package name */
        private String f36696W = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] a(String str) throws yf1 {
            byte[] bArr = this.f36708k;
            if (bArr != null) {
                return bArr;
            }
            throw yf1.a("Missing CodecPrivate for codec " + str, (Exception) null);
        }
    }

    static {
        HashMap map = new HashMap();
        yt0.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        yt0.a(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f36619h0 = Collections.unmodifiableMap(map);
    }

    public zt0() {
        this(new pz());
    }

    public zt0(pz pzVar) {
        this.f36663q = -1L;
        this.f36664r = -9223372036854775807L;
        this.f36665s = -9223372036854775807L;
        this.f36666t = -9223372036854775807L;
        this.f36672z = -1L;
        this.f36620A = -1L;
        this.f36621B = -9223372036854775807L;
        this.f36646a = pzVar;
        pzVar.a(new a(this, 0));
        this.f36651d = true;
        this.f36648b = new d92();
        this.f36650c = new SparseArray<>();
        this.f36654g = new uf1(4);
        this.f36655h = new uf1(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new uf1(4);
        this.f36652e = new uf1(u31.f33899a);
        this.f36653f = new uf1(4);
        this.f36656j = new uf1();
        this.f36657k = new uf1();
        this.f36658l = new uf1(8);
        this.f36659m = new uf1();
        this.f36660n = new uf1();
        this.f36631L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) throws yf1 {
        if (this.f36667u != null) {
            return;
        }
        throw yf1.a("Element " + i + " must be in a TrackEntry", (Exception) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r37) throws com.yandex.mobile.ads.impl.yf1 {
        /*
            Method dump skipped, instructions count: 3324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zt0.b(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.yandex.mobile.ads.impl.zt0.b r23, long r24, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zt0.a(com.yandex.mobile.ads.impl.zt0$b, long, int, int, int):void");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    private static byte[] a(String str, long j4, long j10) {
        if (j4 != -9223372036854775807L) {
            int i = (int) (j4 / 3600000000L);
            long j11 = j4 - (i * 3600000000L);
            int i10 = (int) (j11 / 60000000);
            long j12 = j11 - (i10 * 60000000);
            int i11 = (int) (j12 / 1000000);
            return s82.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10))));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f36649b0 = w70Var;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        this.f36625F = false;
        boolean zA = true;
        while (zA && !this.f36625F) {
            rz rzVar = (rz) v70Var;
            zA = ((pz) this.f36646a).a(rzVar);
            if (zA) {
                long jA = rzVar.a();
                if (this.f36671y) {
                    this.f36620A = jA;
                    jj1Var.f29169a = this.f36672z;
                    this.f36671y = false;
                } else if (this.f36668v) {
                    long j4 = this.f36620A;
                    if (j4 != -1) {
                        jj1Var.f29169a = j4;
                        this.f36620A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.f36650c.size(); i++) {
            b bVarValueAt = this.f36650c.valueAt(i);
            bVarValueAt.f36697X.getClass();
            v62 v62Var = bVarValueAt.f36693T;
            if (v62Var != null) {
                v62Var.a(bVarValueAt.f36697X, bVarValueAt.f36707j);
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rz rzVar, int i) throws IOException {
        if (this.f36654g.e() >= i) {
            return;
        }
        if (this.f36654g.b() < i) {
            uf1 uf1Var = this.f36654g;
            uf1Var.a(Math.max(uf1Var.b() * 2, i));
        }
        rzVar.a(this.f36654g.c(), this.f36654g.e(), i - this.f36654g.e(), false);
        this.f36654g.d(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(long j4) throws yf1 {
        long j10 = this.f36664r;
        if (j10 != -9223372036854775807L) {
            return s82.a(j4, j10, 1000L);
        }
        throw yf1.a("Can't scale timecode prior to timecodeScale being set.", (Exception) null);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f36621B = -9223372036854775807L;
        this.f36626G = 0;
        ((pz) this.f36646a).a();
        this.f36648b.b();
        b();
        for (int i = 0; i < this.f36650c.size(); i++) {
            v62 v62Var = this.f36650c.valueAt(i).f36693T;
            if (v62Var != null) {
                v62Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(rz rzVar, b bVar, int i, boolean z10) throws IOException {
        int iB;
        int iB2;
        int i10;
        if ("S_TEXT/UTF8".equals(bVar.f36700b)) {
            a(rzVar, f36614c0, i);
            int i11 = this.f36639T;
            b();
            return i11;
        }
        if ("S_TEXT/ASS".equals(bVar.f36700b)) {
            a(rzVar, f36616e0, i);
            int i12 = this.f36639T;
            b();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f36700b)) {
            a(rzVar, f36617f0, i);
            int i13 = this.f36639T;
            b();
            return i13;
        }
        n52 n52Var = bVar.f36697X;
        if (!this.f36641V) {
            if (bVar.f36706h) {
                this.f36634O &= -1073741825;
                if (!this.f36642W) {
                    rzVar.a(this.f36654g.c(), 0, 1, false);
                    this.f36638S++;
                    if ((this.f36654g.c()[0] & 128) != 128) {
                        this.f36645Z = this.f36654g.c()[0];
                        this.f36642W = true;
                    } else {
                        throw yf1.a("Extension bit is set in signal byte", (Exception) null);
                    }
                }
                byte b10 = this.f36645Z;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f36634O |= 1073741824;
                    if (!this.f36647a0) {
                        rzVar.a(this.f36658l.c(), 0, 8, false);
                        this.f36638S += 8;
                        this.f36647a0 = true;
                        this.f36654g.c()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f36654g.e(0);
                        n52Var.b(1, this.f36654g);
                        this.f36639T++;
                        this.f36658l.e(0);
                        n52Var.b(8, this.f36658l);
                        this.f36639T += 8;
                    }
                    if (z11) {
                        if (!this.f36643X) {
                            rzVar.a(this.f36654g.c(), 0, 1, false);
                            this.f36638S++;
                            this.f36654g.e(0);
                            this.f36644Y = this.f36654g.t();
                            this.f36643X = true;
                        }
                        int i14 = this.f36644Y * 4;
                        this.f36654g.c(i14);
                        rzVar.a(this.f36654g.c(), 0, i14, false);
                        this.f36638S += i14;
                        short s10 = (short) ((this.f36644Y / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f36661o;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f36661o = ByteBuffer.allocate(i15);
                        }
                        this.f36661o.position(0);
                        this.f36661o.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.f36644Y;
                            if (i16 >= i10) {
                                break;
                            }
                            int iX = this.f36654g.x();
                            if (i16 % 2 == 0) {
                                this.f36661o.putShort((short) (iX - i17));
                            } else {
                                this.f36661o.putInt(iX - i17);
                            }
                            i16++;
                            i17 = iX;
                        }
                        int i18 = (i - this.f36638S) - i17;
                        if (i10 % 2 == 1) {
                            this.f36661o.putInt(i18);
                        } else {
                            this.f36661o.putShort((short) i18);
                            this.f36661o.putInt(0);
                        }
                        this.f36659m.a(i15, this.f36661o.array());
                        n52Var.b(i15, this.f36659m);
                        this.f36639T += i15;
                    }
                }
            } else {
                byte[] bArr = bVar.i;
                if (bArr != null) {
                    this.f36656j.a(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(bVar.f36700b) ? bVar.f36704f > 0 : z10) {
                this.f36634O |= 268435456;
                this.f36660n.c(0);
                int iE = (this.f36656j.e() + i) - this.f36638S;
                this.f36654g.c(4);
                this.f36654g.c()[0] = (byte) ((iE >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f36654g.c()[1] = (byte) ((iE >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f36654g.c()[2] = (byte) ((iE >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f36654g.c()[3] = (byte) (iE & KotlinVersion.MAX_COMPONENT_VALUE);
                n52Var.b(4, this.f36654g);
                this.f36639T += 4;
            }
            this.f36641V = true;
        }
        int iE2 = this.f36656j.e() + i;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f36700b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f36700b)) {
            if (bVar.f36693T != null) {
                if (this.f36656j.e() == 0) {
                    bVar.f36693T.a(rzVar);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i19 = this.f36638S;
                if (i19 >= iE2) {
                    break;
                }
                int i20 = iE2 - i19;
                int iA = this.f36656j.a();
                if (iA > 0) {
                    iB2 = Math.min(i20, iA);
                    n52Var.a(iB2, this.f36656j);
                } else {
                    iB2 = n52Var.b(rzVar, i20, false);
                }
                this.f36638S += iB2;
                this.f36639T += iB2;
            }
        } else {
            byte[] bArrC = this.f36653f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i21 = bVar.f36698Y;
            int i22 = 4 - i21;
            while (this.f36638S < iE2) {
                int i23 = this.f36640U;
                if (i23 == 0) {
                    int iMin = Math.min(i21, this.f36656j.a());
                    rzVar.a(bArrC, i22 + iMin, i21 - iMin, false);
                    if (iMin > 0) {
                        this.f36656j.a(bArrC, i22, iMin);
                    }
                    this.f36638S += i21;
                    this.f36653f.e(0);
                    this.f36640U = this.f36653f.x();
                    this.f36652e.e(0);
                    n52Var.a(4, this.f36652e);
                    this.f36639T += 4;
                } else {
                    int iA2 = this.f36656j.a();
                    if (iA2 > 0) {
                        iB = Math.min(i23, iA2);
                        n52Var.a(iB, this.f36656j);
                    } else {
                        iB = n52Var.b(rzVar, i23, false);
                    }
                    this.f36638S += iB;
                    this.f36639T += iB;
                    this.f36640U -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f36700b)) {
            this.f36655h.e(0);
            n52Var.a(4, this.f36655h);
            this.f36639T += 4;
        }
        int i24 = this.f36639T;
        b();
        return i24;
    }

    private void a(rz rzVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f36657k.b() < length) {
            this.f36657k.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f36657k.c(), 0, bArr.length);
        }
        rzVar.a(this.f36657k.c(), bArr.length, i, false);
        this.f36657k.e(0);
        this.f36657k.d(length);
    }

    private static u70[] a() {
        return new u70[]{new zt0(new pz())};
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        return new j02().b((rz) v70Var);
    }

    private void b() {
        this.f36638S = 0;
        this.f36639T = 0;
        this.f36640U = 0;
        this.f36641V = false;
        this.f36642W = false;
        this.f36643X = false;
        this.f36644Y = 0;
        this.f36645Z = (byte) 0;
        this.f36647a0 = false;
        this.f36656j.c(0);
    }
}
