package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f32596a = new o2(new b6.a(22));

    /* renamed from: b, reason: collision with root package name */
    public static final o2 f32597b = new o2(new b6.a(23));

    public static final long a(l lVar, long j) {
        long j8 = lVar.f32564a;
        long j9 = lVar.U;
        long j10 = lVar.Q;
        long j11 = lVar.M;
        long j12 = lVar.f32578q;
        if (p1.s.c(j, j8)) {
            return lVar.f32565b;
        }
        if (p1.s.c(j, lVar.f32569f)) {
            return lVar.g;
        }
        if (p1.s.c(j, lVar.j)) {
            return lVar.f32572k;
        }
        if (p1.s.c(j, lVar.f32575n)) {
            return lVar.f32576o;
        }
        if (p1.s.c(j, lVar.f32584w)) {
            return lVar.f32585x;
        }
        if (p1.s.c(j, lVar.f32566c)) {
            return lVar.f32567d;
        }
        if (p1.s.c(j, lVar.f32570h)) {
            return lVar.f32571i;
        }
        if (p1.s.c(j, lVar.f32573l)) {
            return lVar.f32574m;
        }
        if (p1.s.c(j, lVar.f32586y)) {
            return lVar.f32587z;
        }
        if (p1.s.c(j, lVar.f32582u)) {
            return lVar.f32583v;
        }
        if (p1.s.c(j, lVar.f32577p)) {
            return j12;
        }
        if (p1.s.c(j, lVar.f32579r)) {
            return lVar.f32580s;
        }
        if (p1.s.c(j, lVar.D) || p1.s.c(j, lVar.F) || p1.s.c(j, lVar.G) || p1.s.c(j, lVar.H) || p1.s.c(j, lVar.I) || p1.s.c(j, lVar.J) || p1.s.c(j, lVar.E)) {
            return j12;
        }
        if (p1.s.c(j, lVar.K) || p1.s.c(j, lVar.L)) {
            return j11;
        }
        if (p1.s.c(j, lVar.O) || p1.s.c(j, lVar.P)) {
            return j10;
        }
        if (p1.s.c(j, lVar.S) || p1.s.c(j, lVar.T)) {
            return j9;
        }
        int i4 = p1.s.f31019i;
        return p1.s.f31018h;
    }

    public static l b(long j, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, int i4, int i10) {
        return new l(j, j8, (i4 & 4) != 0 ? t0.c.f33912y : j9, (i4 & 8) != 0 ? t0.c.j : j10, (i4 & 16) != 0 ? t0.c.f33894e : j11, j12, (i4 & 64) != 0 ? t0.c.f33900m : j13, (i4 & 128) != 0 ? t0.c.C : j14, (i4 & 256) != 0 ? t0.c.f33901n : j15, j16, (i4 & Segment.SHARE_MINIMUM) != 0 ? t0.c.f33906s : j17, (i4 & 2048) != 0 ? t0.c.O : j18, (i4 & Buffer.SEGMENTING_THRESHOLD) != 0 ? t0.c.f33907t : j19, (i4 & Segment.SIZE) != 0 ? t0.c.f33890a : j20, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t0.c.g : j21, (i4 & 32768) != 0 ? t0.c.F : j22, (65536 & i4) != 0 ? t0.c.f33904q : j23, (131072 & i4) != 0 ? t0.c.N : j24, (262144 & i4) != 0 ? t0.c.f33905r : j25, (524288 & i4) != 0 ? j : j26, (1048576 & i4) != 0 ? t0.c.f33895f : j27, (2097152 & i4) != 0 ? t0.c.f33893d : j28, t0.c.f33891b, t0.c.f33896h, t0.c.f33892c, t0.c.f33897i, (67108864 & i4) != 0 ? t0.c.f33910w : j29, (134217728 & i4) != 0 ? t0.c.f33911x : j30, (268435456 & i4) != 0 ? t0.c.B : j31, (536870912 & i4) != 0 ? t0.c.G : j32, (i10 & 8) != 0 ? t0.c.M : j38, (1073741824 & i4) != 0 ? t0.c.H : j33, (i4 & LinearLayoutManager.INVALID_OFFSET) != 0 ? t0.c.I : j34, (i10 & 1) != 0 ? t0.c.J : j35, (i10 & 2) != 0 ? t0.c.K : j36, (i10 & 4) != 0 ? t0.c.L : j37, (i10 & 16) != 0 ? t0.c.f33913z : j39, (i10 & 32) != 0 ? t0.c.A : j40, (i10 & 64) != 0 ? t0.c.f33898k : j41, (i10 & 128) != 0 ? t0.c.f33899l : j42, (i10 & 256) != 0 ? t0.c.D : j43, (i10 & 512) != 0 ? t0.c.E : j44, (i10 & Segment.SHARE_MINIMUM) != 0 ? t0.c.f33902o : j45, (i10 & 2048) != 0 ? t0.c.f33903p : j46, (i10 & Buffer.SEGMENTING_THRESHOLD) != 0 ? t0.c.P : j47, (i10 & Segment.SIZE) != 0 ? t0.c.Q : j48, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t0.c.f33908u : j49, (i10 & 32768) != 0 ? t0.c.f33909v : j50);
    }

    public static final long c(l lVar, t0.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return lVar.f32575n;
            case 1:
                return lVar.f32584w;
            case 2:
                return lVar.f32586y;
            case 3:
                return lVar.f32583v;
            case 4:
                return lVar.f32568e;
            case 5:
                return lVar.f32582u;
            case 6:
                return lVar.f32576o;
            case 7:
                return lVar.f32585x;
            case 8:
                return lVar.f32587z;
            case 9:
                return lVar.f32565b;
            case 10:
                return lVar.f32567d;
            case 11:
                return lVar.M;
            case 12:
                return lVar.N;
            case 13:
                return lVar.g;
            case 14:
                return lVar.f32571i;
            case 15:
                return lVar.Q;
            case 16:
                return lVar.R;
            case 17:
                return lVar.f32578q;
            case 18:
                return lVar.f32580s;
            case 19:
                return lVar.f32572k;
            case 20:
                return lVar.f32574m;
            case 21:
                return lVar.U;
            case 22:
                return lVar.V;
            case 23:
                return lVar.A;
            case 24:
                return lVar.B;
            case 25:
                return lVar.f32564a;
            case 26:
                return lVar.f32566c;
            case 27:
                return lVar.K;
            case 28:
                return lVar.L;
            case 29:
                return lVar.C;
            case 30:
                return lVar.f32569f;
            case 31:
                return lVar.f32570h;
            case 32:
                return lVar.O;
            case 33:
                return lVar.P;
            case 34:
                return lVar.f32577p;
            case 35:
                return lVar.D;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                return lVar.F;
            case 37:
                return lVar.G;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                return lVar.H;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                return lVar.I;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                return lVar.J;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                return lVar.E;
            case 42:
                return lVar.f32581t;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                return lVar.f32579r;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                return lVar.j;
            case 45:
                return lVar.f32573l;
            case 46:
                return lVar.S;
            case 47:
                return lVar.T;
            default:
                throw new ac.m();
        }
    }

    public static l d(long j, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, int i4, int i10) {
        long j51 = (i4 & 1) != 0 ? t0.d.f33937z : j;
        return new l(j51, (i4 & 2) != 0 ? t0.d.j : j8, (i4 & 4) != 0 ? t0.d.A : j9, (i4 & 8) != 0 ? t0.d.f33922k : j10, (i4 & 16) != 0 ? t0.d.f33918e : j11, (i4 & 32) != 0 ? t0.d.E : j12, (i4 & 64) != 0 ? t0.d.f33925n : j13, (i4 & 128) != 0 ? t0.d.F : j14, (i4 & 256) != 0 ? t0.d.f33926o : j15, (i4 & 512) != 0 ? t0.d.R : j16, (i4 & Segment.SHARE_MINIMUM) != 0 ? t0.d.f33931t : j17, (i4 & 2048) != 0 ? t0.d.S : j18, (i4 & Buffer.SEGMENTING_THRESHOLD) != 0 ? t0.d.f33932u : j19, (i4 & Segment.SIZE) != 0 ? t0.d.f33914a : j20, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t0.d.g : j21, (i4 & 32768) != 0 ? t0.d.I : j22, (65536 & i4) != 0 ? t0.d.f33929r : j23, (131072 & i4) != 0 ? t0.d.Q : j24, (262144 & i4) != 0 ? t0.d.f33930s : j25, (524288 & i4) != 0 ? j51 : j26, (1048576 & i4) != 0 ? t0.d.f33919f : j27, (2097152 & i4) != 0 ? t0.d.f33917d : j28, t0.d.f33915b, t0.d.f33920h, t0.d.f33916c, t0.d.f33921i, (67108864 & i4) != 0 ? t0.d.f33935x : j29, (134217728 & i4) != 0 ? t0.d.f33936y : j30, (268435456 & i4) != 0 ? t0.d.D : j31, (536870912 & i4) != 0 ? t0.d.J : j32, (i10 & 8) != 0 ? t0.d.P : j38, (1073741824 & i4) != 0 ? t0.d.K : j33, (i4 & LinearLayoutManager.INVALID_OFFSET) != 0 ? t0.d.L : j34, (i10 & 1) != 0 ? t0.d.M : j35, (i10 & 2) != 0 ? t0.d.N : j36, (i10 & 4) != 0 ? t0.d.O : j37, (i10 & 16) != 0 ? t0.d.B : j39, (i10 & 32) != 0 ? t0.d.C : j40, (i10 & 64) != 0 ? t0.d.f33923l : j41, (i10 & 128) != 0 ? t0.d.f33924m : j42, (i10 & 256) != 0 ? t0.d.G : j43, (i10 & 512) != 0 ? t0.d.H : j44, (i10 & Segment.SHARE_MINIMUM) != 0 ? t0.d.f33927p : j45, (i10 & 2048) != 0 ? t0.d.f33928q : j46, (i10 & Buffer.SEGMENTING_THRESHOLD) != 0 ? t0.d.T : j47, (i10 & Segment.SIZE) != 0 ? t0.d.U : j48, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t0.d.f33933v : j49, (i10 & 32768) != 0 ? t0.d.f33934w : j50);
    }
}
