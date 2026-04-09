package j5;

import a5.d0;
import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.b1;
import androidx.media3.exoplayer.trackselection.v;
import b5.b0;
import e5.o0;
import h7.r1;
import i.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lf.t1;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f13270a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.h f13271b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.h f13272c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f13273d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f13274e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.r[] f13275f;

    /* renamed from: g, reason: collision with root package name */
    public final k5.t f13276g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f13277h;

    /* renamed from: i, reason: collision with root package name */
    public final List f13278i;
    public final o0 k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13279l;

    /* renamed from: n, reason: collision with root package name */
    public o5.b f13281n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f13282o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13283p;

    /* renamed from: q, reason: collision with root package name */
    public v f13284q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13286s;
    public final r1 j = new r1(12, (byte) 0);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f13280m = d0.f109e;

    /* renamed from: r, reason: collision with root package name */
    public long f13285r = -9223372036854775807L;

    public g(i iVar, k5.t tVar, Uri[] uriArr, androidx.media3.common.r[] rVarArr, h hVar, b0 b0Var, g0 g0Var, List list, o0 o0Var) {
        this.f13270a = iVar;
        this.f13276g = tVar;
        this.f13274e = uriArr;
        this.f13275f = rVarArr;
        this.f13273d = g0Var;
        this.f13278i = list;
        this.k = o0Var;
        g0 g0Var2 = (g0) hVar;
        b5.h hVarA = ((b5.g) g0Var2.f11051a).a();
        this.f13271b = hVarA;
        if (b0Var != null) {
            hVarA.w(b0Var);
        }
        this.f13272c = ((b5.g) g0Var2.f11051a).a();
        this.f13277h = new b1("", rVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((rVarArr[i10].f1788x & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        b1 b1Var = this.f13277h;
        int[] iArrH = t1.H(arrayList);
        e eVar = new e(0, b1Var, iArrH);
        eVar.f13265h = eVar.indexOf(b1Var.f1575r[iArrH[0]]);
        this.f13284q = eVar;
    }

    public final p5.m[] a(k kVar, long j) {
        List listUnmodifiableList;
        g gVar = this;
        k kVar2 = kVar;
        int iA = kVar2 == null ? -1 : gVar.f13277h.a(kVar2.f20267r);
        int length = gVar.f13284q.length();
        p5.m[] mVarArr = new p5.m[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int indexInTrackGroup = gVar.f13284q.getIndexInTrackGroup(i10);
            Uri uri = gVar.f13274e[indexInTrackGroup];
            k5.c cVar = (k5.c) gVar.f13276g;
            if (cVar.c(uri)) {
                k5.i iVarA = cVar.a(z10, uri);
                iVarA.getClass();
                long j7 = iVarA.f14067h - cVar.J;
                Pair pairC = gVar.c(kVar2, indexInTrackGroup != iA ? true : z10, iVarA, j7, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j10 = iVarA.k;
                h0 h0Var = iVarA.f14076s;
                h0 h0Var2 = iVarA.f14075r;
                int i11 = (int) (jLongValue - j10);
                if (i11 < 0 || h0Var2.size() < i11) {
                    f0 f0Var = h0.f19336d;
                    listUnmodifiableList = u0.f19383x;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < h0Var2.size()) {
                        if (iIntValue != -1) {
                            k5.g gVar2 = (k5.g) h0Var2.get(i11);
                            if (iIntValue == 0) {
                                arrayList.add(gVar2);
                            } else if (iIntValue < gVar2.I.size()) {
                                h0 h0Var3 = gVar2.I;
                                arrayList.addAll(h0Var3.subList(iIntValue, h0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(h0Var2.subList(i11, h0Var2.size()));
                        iIntValue = 0;
                    }
                    if (iVarA.f14071n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < h0Var.size()) {
                            arrayList.addAll(h0Var.subList(iIntValue, h0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mVarArr[i10] = new d(j7, listUnmodifiableList);
            } else {
                mVarArr[i10] = p5.m.f20281p;
            }
            i10++;
            gVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return mVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.K;
        if (i10 == -1) {
            return 1;
        }
        k5.i iVarA = ((k5.c) this.f13276g).a(false, this.f13274e[this.f13277h.a(kVar.f20267r)]);
        iVarA.getClass();
        h0 h0Var = iVarA.f14075r;
        int i11 = (int) (kVar.F - iVarA.k);
        if (i11 < 0) {
            return 1;
        }
        h0 h0Var2 = i11 < h0Var.size() ? ((k5.g) h0Var.get(i11)).I : iVarA.f14076s;
        if (i10 >= h0Var2.size()) {
            return 2;
        }
        k5.e eVar = (k5.e) h0Var2.get(i10);
        if (eVar.I) {
            return 0;
        }
        return d0.a(Uri.parse(a5.a.y(iVarA.f14098a, eVar.f14057a)), kVar.f20265d.f2443a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z10, k5.i iVar, long j, long j7) {
        boolean z11 = true;
        if (kVar != null) {
            long jA = kVar.F;
            int i10 = kVar.K;
            if (!z10) {
                if (!kVar.f13293e0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    jA = kVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j10 = iVar.f14078u;
        h0 h0Var = iVar.f14076s;
        long j11 = iVar.k;
        h0 h0Var2 = iVar.f14075r;
        long j12 = j10 + j;
        if (kVar != null && !this.f13283p) {
            j7 = kVar.B;
        }
        if (!iVar.f14072o && j7 >= j12) {
            return new Pair(Long.valueOf(j11 + h0Var2.size()), -1);
        }
        long j13 = j7 - j;
        Long lValueOf = Long.valueOf(j13);
        int i11 = 0;
        if (((k5.c) this.f13276g).I && kVar != null) {
            z11 = false;
        }
        int iC = d0.c(h0Var2, lValueOf, z11);
        long j14 = iC + j11;
        if (iC >= 0) {
            k5.g gVar = (k5.g) h0Var2.get(iC);
            h0 h0Var3 = j13 < gVar.f14061x + gVar.f14059g ? gVar.I : h0Var;
            while (true) {
                if (i11 >= h0Var3.size()) {
                    break;
                }
                k5.e eVar = (k5.e) h0Var3.get(i11);
                if (j13 >= eVar.f14061x + eVar.f14059g) {
                    i11++;
                } else if (eVar.H) {
                    j14 += h0Var3 == h0Var ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        r1 r1Var = this.j;
        byte[] bArr = (byte[]) ((com.google.android.exoplayer2.source.hls.c) r1Var.f10199d).remove(uri);
        if (bArr != null) {
            return null;
        }
        b5.k kVar = new b5.k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        androidx.media3.common.r rVar = this.f13275f[i10];
        int iE = this.f13284q.e();
        Object objG = this.f13284q.g();
        byte[] bArr2 = this.f13280m;
        c cVar = new c(this.f13272c, kVar, 3, rVar, iE, objG, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = d0.f109e;
        }
        cVar.F = bArr2;
        return cVar;
    }
}
