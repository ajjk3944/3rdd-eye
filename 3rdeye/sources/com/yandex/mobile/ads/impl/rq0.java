package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4068a;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class rq0 implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32743a;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f32744b;

    /* renamed from: c, reason: collision with root package name */
    private final tf1 f32745c;

    /* renamed from: d, reason: collision with root package name */
    private n52 f32746d;

    /* renamed from: e, reason: collision with root package name */
    private String f32747e;

    /* renamed from: f, reason: collision with root package name */
    private dc0 f32748f;

    /* renamed from: g, reason: collision with root package name */
    private int f32749g;

    /* renamed from: h, reason: collision with root package name */
    private int f32750h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f32751j;

    /* renamed from: k, reason: collision with root package name */
    private long f32752k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32753l;

    /* renamed from: m, reason: collision with root package name */
    private int f32754m;

    /* renamed from: n, reason: collision with root package name */
    private int f32755n;

    /* renamed from: o, reason: collision with root package name */
    private int f32756o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32757p;

    /* renamed from: q, reason: collision with root package name */
    private long f32758q;

    /* renamed from: r, reason: collision with root package name */
    private int f32759r;

    /* renamed from: s, reason: collision with root package name */
    private long f32760s;

    /* renamed from: t, reason: collision with root package name */
    private int f32761t;

    /* renamed from: u, reason: collision with root package name */
    private String f32762u;

    public rq0(String str) {
        this.f32743a = str;
        uf1 uf1Var = new uf1(1024);
        this.f32744b = uf1Var;
        this.f32745c = new tf1(uf1Var.c());
        this.f32752k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) throws yf1 {
        int i;
        boolean zF;
        if (this.f32746d == null) {
            throw new IllegalStateException();
        }
        while (uf1Var.a() > 0) {
            int i10 = this.f32749g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iT = uf1Var.t();
                    if ((iT & 224) == 224) {
                        this.f32751j = iT;
                        this.f32749g = 2;
                    } else if (iT != 86) {
                        this.f32749g = 0;
                    }
                } else if (i10 == 2) {
                    int iT2 = ((this.f32751j & (-225)) << 8) | uf1Var.t();
                    this.i = iT2;
                    if (iT2 > this.f32744b.c().length) {
                        this.f32744b.c(this.i);
                        tf1 tf1Var = this.f32745c;
                        byte[] bArrC = this.f32744b.c();
                        tf1Var.getClass();
                        tf1Var.a(bArrC.length, bArrC);
                    }
                    this.f32750h = 0;
                    this.f32749g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(uf1Var.a(), this.i - this.f32750h);
                    uf1Var.a(this.f32745c.f33573a, this.f32750h, iMin);
                    int i11 = this.f32750h + iMin;
                    this.f32750h = i11;
                    if (i11 == this.i) {
                        this.f32745c.c(0);
                        tf1 tf1Var2 = this.f32745c;
                        if (tf1Var2.f()) {
                            if (this.f32753l) {
                            }
                            this.f32749g = 0;
                        } else {
                            this.f32753l = true;
                            int iB = tf1Var2.b(1);
                            int iB2 = iB == 1 ? tf1Var2.b(1) : 0;
                            this.f32754m = iB2;
                            if (iB2 != 0) {
                                throw yf1.a((String) null, (Exception) null);
                            }
                            if (iB == 1) {
                                tf1Var2.b((tf1Var2.b(2) + 1) * 8);
                            }
                            if (!tf1Var2.f()) {
                                throw yf1.a((String) null, (Exception) null);
                            }
                            this.f32755n = tf1Var2.b(6);
                            int iB3 = tf1Var2.b(4);
                            int iB4 = tf1Var2.b(3);
                            if (iB3 != 0 || iB4 != 0) {
                                throw yf1.a((String) null, (Exception) null);
                            }
                            if (iB == 0) {
                                int iE = tf1Var2.e();
                                int iB5 = tf1Var2.b();
                                C4068a.C0399a c0399aA = C4068a.a(tf1Var2, true);
                                this.f32762u = c0399aA.f24351c;
                                this.f32759r = c0399aA.f24349a;
                                this.f32761t = c0399aA.f24350b;
                                int iB6 = iB5 - tf1Var2.b();
                                tf1Var2.c(iE);
                                byte[] bArr = new byte[(iB6 + 7) / 8];
                                tf1Var2.a(bArr, iB6);
                                dc0 dc0VarA = new dc0.a().b(this.f32747e).e("audio/mp4a-latm").a(this.f32762u).c(this.f32761t).l(this.f32759r).a(Collections.singletonList(bArr)).d(this.f32743a).a();
                                if (!dc0VarA.equals(this.f32748f)) {
                                    this.f32748f = dc0VarA;
                                    this.f32760s = 1024000000 / dc0VarA.f26066A;
                                    this.f32746d.a(dc0VarA);
                                }
                            } else {
                                int iB7 = tf1Var2.b();
                                C4068a.C0399a c0399aA2 = C4068a.a(tf1Var2, true);
                                this.f32762u = c0399aA2.f24351c;
                                this.f32759r = c0399aA2.f24349a;
                                this.f32761t = c0399aA2.f24350b;
                                tf1Var2.d(tf1Var2.b((tf1Var2.b(2) + 1) * 8) - (iB7 - tf1Var2.b()));
                            }
                            int iB8 = tf1Var2.b(3);
                            this.f32756o = iB8;
                            if (iB8 == 0) {
                                tf1Var2.d(8);
                            } else if (iB8 == 1) {
                                tf1Var2.d(9);
                            } else if (iB8 == 3 || iB8 == 4 || iB8 == 5) {
                                tf1Var2.d(6);
                            } else {
                                if (iB8 != 6 && iB8 != 7) {
                                    throw new IllegalStateException();
                                }
                                tf1Var2.d(1);
                            }
                            boolean zF2 = tf1Var2.f();
                            this.f32757p = zF2;
                            this.f32758q = 0L;
                            if (zF2) {
                                if (iB == 1) {
                                    this.f32758q = tf1Var2.b((tf1Var2.b(2) + 1) * 8);
                                } else {
                                    do {
                                        zF = tf1Var2.f();
                                        this.f32758q = (this.f32758q << 8) + tf1Var2.b(8);
                                    } while (zF);
                                }
                            }
                            if (tf1Var2.f()) {
                                tf1Var2.d(8);
                            }
                        }
                        if (this.f32754m != 0) {
                            throw yf1.a((String) null, (Exception) null);
                        }
                        if (this.f32755n != 0) {
                            throw yf1.a((String) null, (Exception) null);
                        }
                        if (this.f32756o != 0) {
                            throw yf1.a((String) null, (Exception) null);
                        }
                        int i12 = 0;
                        while (true) {
                            int iB9 = tf1Var2.b(8);
                            i = i12 + iB9;
                            if (iB9 != 255) {
                                break;
                            } else {
                                i12 = i;
                            }
                        }
                        int iE2 = tf1Var2.e();
                        if ((iE2 & 7) == 0) {
                            this.f32744b.e(iE2 >> 3);
                        } else {
                            tf1Var2.a(this.f32744b.c(), i * 8);
                            this.f32744b.e(0);
                        }
                        this.f32746d.a(i, this.f32744b);
                        long j4 = this.f32752k;
                        if (j4 != -9223372036854775807L) {
                            this.f32746d.a(j4, 1, i, 0, null);
                            this.f32752k += this.f32760s;
                        }
                        if (this.f32757p) {
                            tf1Var2.d((int) this.f32758q);
                        }
                        this.f32749g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (uf1Var.t() == 86) {
                this.f32749g = 1;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f32746d = w70Var.a(dVar.c(), 1);
        this.f32747e = dVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f32752k = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f32749g = 0;
        this.f32752k = -9223372036854775807L;
        this.f32753l = false;
    }
}
