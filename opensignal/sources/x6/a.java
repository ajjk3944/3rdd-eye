package x6;

import a5.d0;
import a5.v;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import com.google.android.material.datepicker.n;
import u5.a0;
import u5.m;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f25034m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f25035n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final m f25036a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f25037b;

    /* renamed from: c, reason: collision with root package name */
    public final n f25038c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25039d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f25040e;

    /* renamed from: f, reason: collision with root package name */
    public final v f25041f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25042g;

    /* renamed from: h, reason: collision with root package name */
    public final r f25043h;

    /* renamed from: i, reason: collision with root package name */
    public int f25044i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f25045l;

    public a(m mVar, a0 a0Var, n nVar) throws k0 {
        this.f25036a = mVar;
        this.f25037b = a0Var;
        this.f25038c = nVar;
        int i10 = nVar.f5609g;
        int iMax = Math.max(1, i10 / 10);
        this.f25042g = iMax;
        v vVar = new v((byte[]) nVar.f5612y);
        vVar.m();
        int iM = vVar.m();
        this.f25039d = iM;
        int i11 = nVar.f5608d;
        int i12 = nVar.f5610r;
        int i13 = (((i12 - (i11 * 4)) * 8) / (nVar.f5611x * i11)) + 1;
        if (iM != i13) {
            throw k0.a(null, "Expected frames per block: " + i13 + "; got: " + iM);
        }
        int iF = d0.f(iMax, iM);
        this.f25040e = new byte[iF * i12];
        this.f25041f = new v(iM * 2 * i11 * iF);
        int i14 = ((i12 * i10) * 8) / iM;
        q qVar = new q();
        qVar.k = "audio/raw";
        qVar.f1739f = i14;
        qVar.f1740g = i14;
        qVar.f1743l = iMax * 2 * i11;
        qVar.f1755x = i11;
        qVar.f1756y = i10;
        qVar.f1757z = 2;
        this.f25043h = new r(qVar);
    }

    @Override // x6.b
    public final void a(long j) {
        this.f25044i = 0;
        this.j = j;
        this.k = 0;
        this.f25045l = 0L;
    }

    @Override // x6.b
    public final void b(int i10, long j) {
        this.f25036a.u(new d(this.f25038c, this.f25039d, i10, j));
        this.f25037b.c(this.f25043h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // x6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(u5.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.a.c(u5.l, long):boolean");
    }

    public final void d(int i10) {
        long j = this.j;
        long j7 = this.f25045l;
        n nVar = this.f25038c;
        long jM = j + d0.M(j7, 1000000L, nVar.f5609g);
        int i11 = i10 * 2 * nVar.f5608d;
        this.f25037b.a(jM, 1, i11, this.k - i11, null);
        this.f25045l += i10;
        this.k -= i11;
    }
}
