package ob;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.List;
import oe.h0;
import oe.s;
import qb.v;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: h, reason: collision with root package name */
    public final pb.g f19217h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19218i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final float f19219l;

    /* renamed from: m, reason: collision with root package name */
    public final float f19220m;

    /* renamed from: n, reason: collision with root package name */
    public final h0 f19221n;

    /* renamed from: o, reason: collision with root package name */
    public final et.d f19222o;

    /* renamed from: p, reason: collision with root package name */
    public float f19223p;

    /* renamed from: q, reason: collision with root package name */
    public int f19224q;

    /* renamed from: r, reason: collision with root package name */
    public int f19225r;

    /* renamed from: s, reason: collision with root package name */
    public long f19226s;

    /* renamed from: t, reason: collision with root package name */
    public ab.m f19227t;

    public b(TrackGroup trackGroup, int[] iArr, int i10, pb.g gVar, long j, long j7, long j10, float f10, h0 h0Var) {
        super(trackGroup, iArr, i10);
        if (j10 < j) {
            e0.p("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j10 = j;
        }
        this.f19217h = gVar;
        this.f19218i = j * 1000;
        this.j = j7 * 1000;
        this.k = j10 * 1000;
        this.f19219l = f10;
        this.f19220m = 0.75f;
        this.f19221n = h0.l(h0Var);
        this.f19222o = qb.a.f20757q;
        this.f19223p = 1.0f;
        this.f19225r = 0;
        this.f19226s = -9223372036854775807L;
    }

    public static void k(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j7 : jArr) {
            j += j7;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            oe.e0 e0Var = (oe.e0) arrayList.get(i10);
            if (e0Var != null) {
                e0Var.a(new a(j, jArr[i10]));
            }
        }
    }

    public static long m(List list) {
        if (!list.isEmpty()) {
            ab.m mVar = (ab.m) s.i(list);
            long j = mVar.B;
            if (j != -9223372036854775807L) {
                long j7 = mVar.D;
                if (j7 != -9223372036854775807L) {
                    return j7 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // ob.f
    public final int a() {
        return this.f19224q;
    }

    @Override // ob.c, ob.f
    public final void b() {
        this.f19226s = -9223372036854775807L;
        this.f19227t = null;
    }

    @Override // ob.c, ob.f
    public final int c(long j, List list) {
        int i10;
        int i11;
        this.f19222o.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = this.f19226s;
        if (j7 != -9223372036854775807L && jElapsedRealtime - j7 < 1000 && (list.isEmpty() || ((ab.m) s.i(list)).equals(this.f19227t))) {
            return list.size();
        }
        this.f19226s = jElapsedRealtime;
        this.f19227t = list.isEmpty() ? null : (ab.m) s.i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jV = v.v(((ab.m) list.get(size - 1)).B - j, this.f19223p);
        long j10 = this.k;
        if (jV >= j10) {
            m(list);
            Format format = this.f19232e[l(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                ab.m mVar = (ab.m) list.get(i12);
                Format format2 = mVar.f304r;
                if (v.v(mVar.B - j, this.f19223p) >= j10 && format2.D < format.D && (i10 = format2.N) != -1 && i10 < 720 && (i11 = format2.M) != -1 && i11 < 1280 && i10 < format.N) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // ob.c, ob.f
    public final void d() {
        this.f19227t = null;
    }

    @Override // ob.f
    public final int e() {
        return this.f19225r;
    }

    @Override // ob.c, ob.f
    public final void f(float f10) {
        this.f19223p = f10;
    }

    @Override // ob.f
    public final Object g() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    @Override // ob.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r7, long r9, java.util.List r11, ab.n[] r12) {
        /*
            r6 = this;
            et.d r0 = r6.f19222o
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r6.f19224q
            int r3 = r12.length
            if (r2 >= r3) goto L21
            r2 = r12[r2]
            boolean r2 = r2.next()
            if (r2 == 0) goto L21
            int r2 = r6.f19224q
            r12 = r12[r2]
            r12.b()
            r12.a()
            goto L3a
        L21:
            int r2 = r12.length
            r3 = 0
        L23:
            if (r3 >= r2) goto L37
            r4 = r12[r3]
            boolean r5 = r4.next()
            if (r5 == 0) goto L34
            r4.b()
            r4.a()
            goto L3a
        L34:
            int r3 = r3 + 1
            goto L23
        L37:
            m(r11)
        L3a:
            int r12 = r6.f19225r
            if (r12 != 0) goto L48
            r7 = 1
            r6.f19225r = r7
            int r7 = r6.l(r0)
            r6.f19224q = r7
            return
        L48:
            int r2 = r6.f19224q
            boolean r3 = r11.isEmpty()
            r4 = -1
            if (r3 == 0) goto L53
            r3 = r4
            goto L5f
        L53:
            java.lang.Object r3 = oe.s.i(r11)
            ab.m r3 = (ab.m) r3
            com.google.android.exoplayer2.Format r3 = r3.f304r
            int r3 = r6.indexOf(r3)
        L5f:
            if (r3 == r4) goto L6a
            java.lang.Object r11 = oe.s.i(r11)
            ab.m r11 = (ab.m) r11
            int r12 = r11.f305x
            r2 = r3
        L6a:
            int r11 = r6.l(r0)
            boolean r0 = r6.j(r2, r0)
            if (r0 != 0) goto La2
            com.google.android.exoplayer2.Format[] r0 = r6.f19232e
            r1 = r0[r2]
            r0 = r0[r11]
            int r0 = r0.D
            int r1 = r1.D
            if (r0 <= r1) goto L99
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            long r4 = r6.f19218i
            if (r3 == 0) goto L94
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 > 0) goto L94
            float r9 = (float) r9
            float r10 = r6.f19220m
            float r9 = r9 * r10
            long r4 = (long) r9
        L94:
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L99
            goto La1
        L99:
            if (r0 >= r1) goto La2
            long r9 = r6.j
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto La2
        La1:
            r11 = r2
        La2:
            if (r11 != r2) goto La5
            goto La6
        La5:
            r12 = 3
        La6:
            r6.f19225r = r12
            r6.f19224q = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.b.h(long, long, java.util.List, ab.n[]):void");
    }

    public final int l(long j) {
        long jB = (long) (((long) (this.f19217h.b() * this.f19219l)) / this.f19223p);
        h0 h0Var = this.f19221n;
        if (!h0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < h0Var.size() - 1 && ((a) h0Var.get(i10)).f19215a < jB) {
                i10++;
            }
            a aVar = (a) h0Var.get(i10 - 1);
            a aVar2 = (a) h0Var.get(i10);
            long j7 = aVar.f19215a;
            long j10 = aVar.f19216b;
            jB = ((long) (((jB - j7) / (aVar2.f19215a - j7)) * (aVar2.f19216b - j10))) + j10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19229b; i12++) {
            if (j == Long.MIN_VALUE || !j(i12, j)) {
                if (this.f19232e[i12].D <= jB) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
