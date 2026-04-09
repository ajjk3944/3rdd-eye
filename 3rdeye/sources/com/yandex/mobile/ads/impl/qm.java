package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.bb0;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.mm;
import com.yandex.mobile.ads.impl.ov;
import com.yandex.mobile.ads.impl.pm;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qm implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final mm f32245a;

    /* renamed from: b, reason: collision with root package name */
    private final ov f32246b;

    /* renamed from: c, reason: collision with root package name */
    private final b42 f32247c;

    /* renamed from: d, reason: collision with root package name */
    private final ov f32248d;

    /* renamed from: e, reason: collision with root package name */
    private final ym f32249e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32250f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f32251g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f32252h;
    private Uri i;

    /* renamed from: j, reason: collision with root package name */
    private sv f32253j;

    /* renamed from: k, reason: collision with root package name */
    private sv f32254k;

    /* renamed from: l, reason: collision with root package name */
    private ov f32255l;

    /* renamed from: m, reason: collision with root package name */
    private long f32256m;

    /* renamed from: n, reason: collision with root package name */
    private long f32257n;

    /* renamed from: o, reason: collision with root package name */
    private long f32258o;

    /* renamed from: p, reason: collision with root package name */
    private zm f32259p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32260q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f32261r;

    /* renamed from: s, reason: collision with root package name */
    private long f32262s;

    public /* synthetic */ qm(mm mmVar, ov ovVar, bb0 bb0Var, pm pmVar, ym ymVar, int i, int i10, int i11) {
        this(mmVar, ovVar, bb0Var, pmVar, ymVar, i, i10);
    }

    private void e() throws IOException {
        ov ovVar = this.f32255l;
        if (ovVar == null) {
            return;
        }
        try {
            ovVar.close();
        } finally {
            this.f32254k = null;
            this.f32255l = null;
            zm zmVar = this.f32259p;
            if (zmVar != null) {
                this.f32245a.b(zmVar);
                this.f32259p = null;
            }
        }
    }

    private boolean h() {
        return this.f32255l == this.f32246b;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        this.f32246b.a(q62Var);
        this.f32248d.a(q62Var);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        this.f32253j = null;
        this.i = null;
        this.f32257n = 0L;
        try {
            e();
        } catch (Throwable th) {
            if (h() || (th instanceof mm.a)) {
                this.f32260q = true;
            }
            throw th;
        }
    }

    public final mm f() {
        return this.f32245a;
    }

    public final ym g() {
        return this.f32249e;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        return !h() ? this.f32248d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        long j4;
        if (i10 == 0) {
            return 0;
        }
        if (this.f32258o == 0) {
            return -1;
        }
        sv svVar = this.f32253j;
        svVar.getClass();
        sv svVar2 = this.f32254k;
        svVar2.getClass();
        try {
            if (this.f32257n >= this.f32262s) {
                a(svVar, true);
            }
            ov ovVar = this.f32255l;
            ovVar.getClass();
            int i11 = ovVar.read(bArr, i, i10);
            if (i11 == -1) {
                if (h()) {
                    j4 = -1;
                } else {
                    long j10 = svVar2.f33256g;
                    if (j10 != -1) {
                        j4 = -1;
                        if (this.f32256m < j10) {
                        }
                    }
                    String str = svVar.f33257h;
                    int i12 = s82.f32899a;
                    this.f32258o = 0L;
                    if (this.f32255l == this.f32247c) {
                        yr yrVar = new yr();
                        yr.a(yrVar, this.f32257n);
                        this.f32245a.a(str, yrVar);
                        return i11;
                    }
                }
                long j11 = this.f32258o;
                if (j11 <= 0) {
                    if (j11 == j4) {
                    }
                }
                e();
                a(svVar, false);
                return read(bArr, i, i10);
            }
            long j12 = i11;
            this.f32257n += j12;
            this.f32256m += j12;
            long j13 = this.f32258o;
            if (j13 != -1) {
                this.f32258o = j13 - j12;
                return i11;
            }
            return i11;
        } catch (Throwable th) {
            if (h() || (th instanceof mm.a)) {
                this.f32260q = true;
            }
            throw th;
        }
    }

    private qm(mm mmVar, ov ovVar, bb0 bb0Var, pm pmVar, ym ymVar, int i, int i10) {
        this.f32245a = mmVar;
        this.f32246b = bb0Var;
        this.f32249e = ymVar == null ? ym.f35917a : ymVar;
        this.f32250f = (i & 1) != 0;
        this.f32251g = false;
        this.f32252h = false;
        if (ovVar != null) {
            this.f32248d = ovVar;
            this.f32247c = pmVar != null ? new b42(ovVar, pmVar) : null;
        } else {
            this.f32248d = gh1.f27744a;
            this.f32247c = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        try {
            String strA = this.f32249e.a(svVar);
            sv svVarA = svVar.a().a(strA).a();
            this.f32253j = svVarA;
            mm mmVar = this.f32245a;
            Uri uri = svVarA.f33250a;
            String strC = mmVar.b(strA).c();
            Uri uri2 = strC == null ? null : Uri.parse(strC);
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.f32257n = svVar.f33255f;
            boolean z10 = (this.f32251g && this.f32260q) || (this.f32252h && svVar.f33256g == -1);
            this.f32261r = z10;
            if (z10) {
                this.f32258o = -1L;
            } else {
                long jB = this.f32245a.b(strA).b();
                this.f32258o = jB;
                if (jB != -1) {
                    long j4 = jB - svVar.f33255f;
                    this.f32258o = j4;
                    if (j4 < 0) {
                        throw new pv(2008);
                    }
                }
            }
            long jMin = svVar.f33256g;
            if (jMin != -1) {
                long j10 = this.f32258o;
                if (j10 != -1) {
                    jMin = Math.min(j10, jMin);
                }
                this.f32258o = jMin;
            }
            long j11 = this.f32258o;
            if (j11 > 0 || j11 == -1) {
                a(svVarA, false);
            }
            long j12 = svVar.f33256g;
            return j12 != -1 ? j12 : this.f32258o;
        } catch (Throwable th) {
            if (h() || (th instanceof mm.a)) {
                this.f32260q = true;
            }
            throw th;
        }
    }

    public static final class a implements ov.a {

        /* renamed from: a, reason: collision with root package name */
        private mm f32263a;

        /* renamed from: b, reason: collision with root package name */
        private bb0.b f32264b = new bb0.b();

        /* renamed from: c, reason: collision with root package name */
        private ym f32265c = ym.f35917a;

        /* renamed from: d, reason: collision with root package name */
        private ov.a f32266d;

        @Override // com.yandex.mobile.ads.impl.ov.a
        public final ov a() {
            ov.a aVar = this.f32266d;
            ov ovVarA = aVar != null ? aVar.a() : null;
            mm mmVar = this.f32263a;
            mmVar.getClass();
            pm pmVarA = ovVarA != null ? new pm.b().a(mmVar).a() : null;
            this.f32264b.getClass();
            return new qm(mmVar, ovVarA, new bb0(), pmVarA, this.f32265c, 0, 0, 0);
        }

        public final qm b() {
            ov.a aVar = this.f32266d;
            ov ovVarA = aVar != null ? aVar.a() : null;
            mm mmVar = this.f32263a;
            mmVar.getClass();
            pm pmVarA = ovVarA != null ? new pm.b().a(mmVar).a() : null;
            this.f32264b.getClass();
            return new qm(mmVar, ovVarA, new bb0(), pmVarA, this.f32265c, 1, -1000, 0);
        }

        public final a a(mm mmVar) {
            this.f32263a = mmVar;
            return this;
        }

        public final a a(jz.a aVar) {
            this.f32266d = aVar;
            return this;
        }
    }

    private void a(sv svVar, boolean z10) throws IOException {
        zm zmVarE;
        long j4;
        sv svVarA;
        ov ovVar;
        String str = svVar.f33257h;
        int i = s82.f32899a;
        if (this.f32261r) {
            zmVarE = null;
        } else if (this.f32250f) {
            try {
                zmVarE = this.f32245a.e(str, this.f32257n, this.f32258o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            zmVarE = this.f32245a.c(str, this.f32257n, this.f32258o);
        }
        if (zmVarE == null) {
            ovVar = this.f32248d;
            svVarA = svVar.a().b(this.f32257n).a(this.f32258o).a();
            j4 = -1;
        } else if (zmVarE.f36549e) {
            Uri uriFromFile = Uri.fromFile(zmVarE.f36550f);
            long j10 = zmVarE.f36547c;
            long j11 = this.f32257n - j10;
            long jMin = zmVarE.f36548d - j11;
            j4 = -1;
            long j12 = this.f32258o;
            if (j12 != -1) {
                jMin = Math.min(jMin, j12);
            }
            svVarA = svVar.a().a(uriFromFile).c(j10).b(j11).a(jMin).a();
            ovVar = this.f32246b;
        } else {
            j4 = -1;
            long jMin2 = zmVarE.f36548d;
            if (jMin2 == -1) {
                jMin2 = this.f32258o;
            } else {
                long j13 = this.f32258o;
                if (j13 != -1) {
                    jMin2 = Math.min(jMin2, j13);
                }
            }
            svVarA = svVar.a().b(this.f32257n).a(jMin2).a();
            ovVar = this.f32247c;
            if (ovVar == null) {
                ovVar = this.f32248d;
                this.f32245a.b(zmVarE);
                zmVarE = null;
            }
        }
        this.f32262s = (this.f32261r || ovVar != this.f32248d) ? Long.MAX_VALUE : this.f32257n + 102400;
        if (z10) {
            ov ovVar2 = this.f32255l;
            ov ovVar3 = this.f32248d;
            if (ovVar2 != ovVar3) {
                throw new IllegalStateException();
            }
            if (ovVar == ovVar3) {
                return;
            }
            try {
                e();
            } catch (Throwable th) {
                if (!zmVarE.f36549e) {
                    this.f32245a.b(zmVarE);
                }
                throw th;
            }
        }
        if (zmVarE != null && !zmVarE.f36549e) {
            this.f32259p = zmVarE;
        }
        this.f32255l = ovVar;
        this.f32254k = svVarA;
        this.f32256m = 0L;
        long jA = ovVar.a(svVarA);
        yr yrVar = new yr();
        if (svVarA.f33256g == j4 && jA != j4) {
            this.f32258o = jA;
            yr.a(yrVar, this.f32257n + jA);
        }
        if (!h()) {
            Uri uri = ovVar.getUri();
            this.i = uri;
            yr.a(yrVar, svVar.f33250a.equals(uri) ? null : this.i);
        }
        if (this.f32255l == this.f32247c) {
            this.f32245a.a(str, yrVar);
        }
    }
}
