package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zt0;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class pz implements v40 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31950a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f31951b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final d92 f31952c = new d92();

    /* renamed from: d, reason: collision with root package name */
    private u40 f31953d;

    /* renamed from: e, reason: collision with root package name */
    private int f31954e;

    /* renamed from: f, reason: collision with root package name */
    private int f31955f;

    /* renamed from: g, reason: collision with root package name */
    private long f31956g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f31957a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31958b;

        public /* synthetic */ a(int i, long j4, int i10) {
            this(i, j4);
        }

        private a(int i, long j4) {
            this.f31957a = i;
            this.f31958b = j4;
        }
    }

    public final void a(u40 u40Var) {
        this.f31953d = u40Var;
    }

    public final boolean a(rz rzVar) throws IOException {
        int i;
        String str;
        int iA;
        int iA2;
        if (this.f31953d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            a aVarPeek = this.f31951b.peek();
            if (aVarPeek != null && rzVar.a() >= aVarPeek.f31958b) {
                zt0.this.b(this.f31951b.pop().f31957a);
                return true;
            }
            int i10 = 0;
            if (this.f31954e == 0) {
                long jA = this.f31952c.a(rzVar, true, false, 4);
                if (jA == -2) {
                    rzVar.c();
                    while (true) {
                        rzVar.b(this.f31950a, 0, 4, false);
                        iA = d92.a(this.f31950a[0]);
                        if (iA != -1 && iA <= 4) {
                            iA2 = (int) d92.a(this.f31950a, iA, false);
                            zt0.this.getClass();
                            if (iA2 == 357149030 || iA2 == 524531317 || iA2 == 475249515 || iA2 == 374648427) {
                            }
                        }
                        rzVar.a(1);
                    }
                    rzVar.a(iA);
                    jA = iA2;
                }
                if (jA == -1) {
                    return false;
                }
                this.f31955f = (int) jA;
                this.f31954e = 1;
            }
            if (this.f31954e == 1) {
                this.f31956g = this.f31952c.a(rzVar, false, true, 8);
                this.f31954e = 2;
            }
            u40 u40Var = this.f31953d;
            int i11 = this.f31955f;
            zt0.this.getClass();
            switch (i11) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (i == 1) {
                    long jA2 = rzVar.a();
                    this.f31951b.push(new a(this.f31955f, this.f31956g + jA2, i10));
                    ((zt0.a) this.f31953d).a(this.f31955f, jA2, this.f31956g);
                    this.f31954e = 0;
                    return true;
                }
                long j4 = 0;
                if (i == 2) {
                    long j10 = this.f31956g;
                    if (j10 > 8) {
                        throw yf1.a("Invalid integer size: " + this.f31956g, (Exception) null);
                    }
                    u40 u40Var2 = this.f31953d;
                    int i12 = this.f31955f;
                    int i13 = (int) j10;
                    rzVar.a(this.f31950a, 0, i13, false);
                    for (int i14 = 0; i14 < i13; i14++) {
                        j4 = (this.f31950a[i14] & 255) | (j4 << 8);
                    }
                    ((zt0.a) u40Var2).a(i12, j4);
                    this.f31954e = 0;
                    return true;
                }
                if (i == 3) {
                    long j11 = this.f31956g;
                    if (j11 > 2147483647L) {
                        throw yf1.a("String element size: " + this.f31956g, (Exception) null);
                    }
                    u40 u40Var3 = this.f31953d;
                    int i15 = this.f31955f;
                    int i16 = (int) j11;
                    if (i16 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i16];
                        rzVar.a(bArr, 0, i16, false);
                        while (i16 > 0 && bArr[i16 - 1] == 0) {
                            i16--;
                        }
                        str = new String(bArr, 0, i16);
                    }
                    ((zt0.a) u40Var3).a(i15, str);
                    this.f31954e = 0;
                    return true;
                }
                if (i == 4) {
                    ((zt0.a) this.f31953d).a(this.f31955f, (int) this.f31956g, rzVar);
                    this.f31954e = 0;
                    return true;
                }
                if (i != 5) {
                    throw yf1.a("Invalid element type " + i, (Exception) null);
                }
                long j12 = this.f31956g;
                if (j12 != 4 && j12 != 8) {
                    throw yf1.a("Invalid float size: " + this.f31956g, (Exception) null);
                }
                u40 u40Var4 = this.f31953d;
                int i17 = this.f31955f;
                int i18 = (int) j12;
                rzVar.a(this.f31950a, 0, i18, false);
                for (int i19 = 0; i19 < i18; i19++) {
                    j4 = (this.f31950a[i19] & 255) | (j4 << 8);
                }
                ((zt0.a) u40Var4).a(i17, i18 == 4 ? Float.intBitsToFloat((int) j4) : Double.longBitsToDouble(j4));
                this.f31954e = 0;
                return true;
            }
            rzVar.a((int) this.f31956g);
            this.f31954e = 0;
        }
    }

    public final void a() {
        this.f31954e = 0;
        this.f31951b.clear();
        this.f31952c.b();
    }
}
