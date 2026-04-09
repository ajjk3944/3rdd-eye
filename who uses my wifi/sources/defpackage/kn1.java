package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kn1 implements ln1 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final nf1 a;
    public final jg1 b;
    public final cm c;
    public final int d;
    public final byte[] e;
    public final kz2 f;
    public final int g;
    public final ph4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public kn1(nf1 nf1Var, jg1 jg1Var, cm cmVar) throws lq1 {
        this.a = nf1Var;
        this.b = jg1Var;
        this.c = cmVar;
        int i = cmVar.g;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        kz2 kz2Var = new kz2((byte[]) cmVar.j);
        kz2Var.M();
        int iM = kz2Var.M();
        this.d = iM;
        int i2 = cmVar.f;
        int i3 = cmVar.h;
        int i4 = (((i3 - (i2 * 4)) * 8) / (cmVar.i * i2)) + 1;
        if (iM != i4) {
            throw lq1.a(null, ga1.l(new StringBuilder(String.valueOf(i4).length() + 34 + String.valueOf(iM).length()), "Expected frames per block: ", i4, "; got: ", iM));
        }
        String str = v23.a;
        int i5 = ((iMax + iM) - 1) / iM;
        this.e = new byte[i5 * i3];
        this.f = new kz2((iM + iM) * i2 * i5);
        int i6 = ((i3 * i) * 8) / iM;
        gg4 gg4Var = new gg4();
        gg4Var.e("audio/raw");
        gg4Var.g = i6;
        gg4Var.h = i6;
        gg4Var.m = (iMax + iMax) * i2;
        gg4Var.D = i2;
        gg4Var.E = i;
        gg4Var.F = 2;
        this.h = new ph4(gg4Var);
    }

    @Override // defpackage.ln1
    public final void a(int i, long j) {
        this.a.v(new pn1(this.c, this.d, i, j));
        this.b.d(this.h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0024->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.ln1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.mf1 r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn1.b(mf1, long):boolean");
    }

    public final void c(int i) {
        cm cmVar = this.c;
        long jT = this.j + v23.t(this.l, 1000000L, cmVar.g, RoundingMode.DOWN);
        int i2 = (i + i) * cmVar.f;
        this.b.c(jT, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }

    @Override // defpackage.ln1
    public final void d(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }
}
