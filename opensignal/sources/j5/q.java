package j5;

import a5.d0;
import a5.v;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.util.Arrays;
import u5.a0;
import u5.z;

/* loaded from: classes.dex */
public final class q implements a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.media3.common.r f13308f;

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.media3.common.r f13309g;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f13310a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.r f13311b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.media3.common.r f13312c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13313d;

    /* renamed from: e, reason: collision with root package name */
    public int f13314e;

    static {
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.k = "application/id3";
        f13308f = new androidx.media3.common.r(qVar);
        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
        qVar2.k = "application/x-emsg";
        f13309g = new androidx.media3.common.r(qVar2);
    }

    public q(a0 a0Var, int i10) {
        this.f13310a = a0Var;
        if (i10 == 1) {
            this.f13311b = f13308f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(h0.b.h(i10, "Unknown metadataType: "));
            }
            this.f13311b = f13309g;
        }
        this.f13313d = new byte[0];
        this.f13314e = 0;
    }

    @Override // u5.a0
    public final void a(long j, int i10, int i11, int i12, z zVar) {
        this.f13312c.getClass();
        int i13 = this.f13314e - i12;
        v vVar = new v(Arrays.copyOfRange(this.f13313d, i13 - i11, i13));
        byte[] bArr = this.f13313d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f13314e = i12;
        String str = this.f13312c.H;
        androidx.media3.common.r rVar = this.f13311b;
        String str2 = rVar.H;
        String str3 = rVar.H;
        if (!d0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.f13312c.H)) {
                a5.a.B("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f13312c.H);
                return;
            }
            EventMessage eventMessageK0 = c6.a.k0(vVar);
            androidx.media3.common.r rVarA = eventMessageK0.a();
            if (rVarA == null || !d0.a(str3, rVarA.H)) {
                a5.a.B("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + eventMessageK0.a());
                return;
            }
            byte[] bArrB = eventMessageK0.b();
            bArrB.getClass();
            vVar = new v(bArrB);
        }
        int iA = vVar.a();
        a0 a0Var = this.f13310a;
        a0Var.d(iA, vVar);
        a0Var.a(j, i10, iA, i12, zVar);
    }

    @Override // u5.a0
    public final int b(androidx.media3.common.l lVar, int i10, boolean z10) throws EOFException {
        int i11 = this.f13314e + i10;
        byte[] bArr = this.f13313d;
        if (bArr.length < i11) {
            this.f13313d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int i12 = lVar.read(this.f13313d, this.f13314e, i10);
        if (i12 != -1) {
            this.f13314e += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // u5.a0
    public final void c(androidx.media3.common.r rVar) {
        this.f13312c = rVar;
        this.f13310a.c(this.f13311b);
    }

    @Override // u5.a0
    public final void d(int i10, v vVar) {
        int i11 = this.f13314e + i10;
        byte[] bArr = this.f13313d;
        if (bArr.length < i11) {
            this.f13313d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        vVar.e(this.f13313d, this.f13314e, i10);
        this.f13314e += i10;
    }
}
