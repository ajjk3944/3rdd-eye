package j5;

import a5.b0;
import a5.v;
import android.net.Uri;
import androidx.media3.common.DrmInitData;
import e5.o0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lf.t1;
import oe.f0;
import oe.h0;
import oe.u0;
import w6.u;

/* loaded from: classes.dex */
public final class k extends p5.l {

    /* renamed from: i0, reason: collision with root package name */
    public static final AtomicInteger f13288i0 = new AtomicInteger();
    public final int G;
    public final int H;
    public final Uri I;
    public final boolean J;
    public final int K;
    public final b5.h L;
    public final b5.k M;
    public final l N;
    public final boolean O;
    public final boolean P;
    public final b0 Q;
    public final i R;
    public final List S;
    public final DrmInitData T;
    public final f6.c U;
    public final v V;
    public final boolean W;
    public final boolean X;
    public final o0 Y;
    public l Z;

    /* renamed from: a0, reason: collision with root package name */
    public s f13289a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f13290b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f13291c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile boolean f13292d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f13293e0;

    /* renamed from: f0, reason: collision with root package name */
    public h0 f13294f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13295g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13296h0;

    public k(i iVar, b5.h hVar, b5.k kVar, androidx.media3.common.r rVar, boolean z10, b5.h hVar2, b5.k kVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j, long j7, long j10, int i11, boolean z12, int i12, boolean z13, boolean z14, b0 b0Var, DrmInitData drmInitData, l lVar, f6.c cVar, v vVar, boolean z15, o0 o0Var) {
        super(hVar, kVar, rVar, i10, obj, j, j7, j10);
        this.W = z10;
        this.K = i11;
        this.f13296h0 = z12;
        this.H = i12;
        this.M = kVar2;
        this.L = hVar2;
        this.f13291c0 = kVar2 != null;
        this.X = z11;
        this.I = uri;
        this.O = z14;
        this.Q = b0Var;
        this.P = z13;
        this.R = iVar;
        this.S = list;
        this.T = drmInitData;
        this.N = lVar;
        this.U = cVar;
        this.V = vVar;
        this.J = z15;
        this.Y = o0Var;
        f0 f0Var = h0.f19336d;
        this.f13294f0 = u0.f19383x;
        this.G = f13288i0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (xu.l.a0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p5.l
    public final boolean b() {
        throw null;
    }

    @Override // r5.k, pb.j0
    public final void c() {
        l lVar;
        this.f13289a0.getClass();
        if (this.Z == null && (lVar = this.N) != null) {
            u5.k kVar = ((b) lVar).f13260a;
            if ((kVar instanceof u) || (kVar instanceof l6.h)) {
                this.Z = lVar;
                this.f13291c0 = false;
            }
        }
        b5.k kVar2 = this.M;
        b5.h hVar = this.L;
        if (this.f13291c0) {
            hVar.getClass();
            kVar2.getClass();
            e(hVar, kVar2, this.X, false);
            this.f13290b0 = 0;
            this.f13291c0 = false;
        }
        if (this.f13292d0) {
            return;
        }
        if (!this.P) {
            e(this.E, this.f20265d, this.W, true);
        }
        this.f13293e0 = !this.f13292d0;
    }

    @Override // r5.k, pb.j0
    public final void d() {
        this.f13292d0 = true;
    }

    public final void e(b5.h hVar, b5.k kVar, boolean z10, boolean z11) {
        b5.k kVarA;
        long j;
        if (z10) {
            z = this.f13290b0 != 0;
            kVarA = kVar;
        } else {
            kVarA = kVar.a(this.f13290b0);
        }
        try {
            u5.h hVarH = h(hVar, kVarA, z11);
            if (z) {
                hVarH.m(this.f13290b0);
            }
            while (!this.f13292d0 && ((b) this.Z).f13260a.g(hVarH, b.f13259d) == 0) {
                try {
                    try {
                    } catch (EOFException e4) {
                        if ((this.f20267r.f1788x & 16384) == 0) {
                            throw e4;
                        }
                        ((b) this.Z).f13260a.c(0L, 0L);
                        j = hVarH.f23288r;
                    }
                } catch (Throwable th2) {
                    this.f13290b0 = (int) (hVarH.f23288r - kVar.f2447e);
                    throw th2;
                }
            }
            j = hVarH.f23288r;
            this.f13290b0 = (int) (j - kVar.f2447e);
        } finally {
            t1.h(hVar);
        }
    }

    public final int g(int i10) {
        a5.a.i(!this.J);
        if (i10 >= this.f13294f0.size()) {
            return 0;
        }
        return ((Integer) this.f13294f0.get(i10)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u5.h h(b5.h r21, b5.k r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.k.h(b5.h, b5.k, boolean):u5.h");
    }
}
