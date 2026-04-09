package na;

import ca.m;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.y0;
import qb.v;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f17405m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f17406n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final m f17407a;

    /* renamed from: b, reason: collision with root package name */
    public final x f17408b;

    /* renamed from: c, reason: collision with root package name */
    public final e f17409c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17410d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17411e;

    /* renamed from: f, reason: collision with root package name */
    public final fb.f f17412f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17413g;

    /* renamed from: h, reason: collision with root package name */
    public final Format f17414h;

    /* renamed from: i, reason: collision with root package name */
    public int f17415i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f17416l;

    public a(m mVar, x xVar, e eVar) throws y0 {
        this.f17407a = mVar;
        this.f17408b = xVar;
        this.f17409c = eVar;
        int i10 = eVar.f17433c;
        int iMax = Math.max(1, i10 / 10);
        this.f17413g = iMax;
        byte[] bArr = eVar.f17436f;
        int length = bArr.length;
        byte b2 = bArr[0];
        byte b10 = bArr[1];
        int i11 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f17410d = i11;
        int i12 = eVar.f17432b;
        int i13 = eVar.f17434d;
        int i14 = (((i13 - (i12 * 4)) * 8) / (eVar.f17435e * i12)) + 1;
        if (i11 != i14) {
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i14);
            sb2.append("; got: ");
            sb2.append(i11);
            throw y0.a(null, sb2.toString());
        }
        int iF = v.f(iMax, i11);
        this.f17411e = new byte[iF * i13];
        this.f17412f = new fb.f(i11 * 2 * i12 * iF);
        int i15 = ((i13 * i10) * 8) / i11;
        g0 g0Var = new g0();
        g0Var.k = "audio/raw";
        g0Var.f4147f = i15;
        g0Var.f4148g = i15;
        g0Var.f4151l = iMax * 2 * i12;
        g0Var.f4163x = i12;
        g0Var.f4164y = i10;
        g0Var.f4165z = 2;
        this.f17414h = new Format(g0Var);
    }

    @Override // na.b
    public final void a(long j) {
        this.f17415i = 0;
        this.j = j;
        this.k = 0;
        this.f17416l = 0L;
    }

    @Override // na.b
    public final void b(int i10, long j) {
        this.f17407a.r(new f(this.f17409c, this.f17410d, i10, j));
        this.f17408b.e(this.f17414h);
    }

    public final void c(int i10) {
        long j = this.j;
        long j7 = this.f17416l;
        e eVar = this.f17409c;
        long jH = j + v.H(j7, 1000000L, eVar.f17433c);
        int i11 = i10 * 2 * eVar.f17432b;
        this.f17408b.d(jH, 1, i11, this.k - i11, null);
        this.f17416l += i10;
        this.k -= i11;
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
    @Override // na.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(ca.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: na.a.d(ca.l, long):boolean");
    }
}
