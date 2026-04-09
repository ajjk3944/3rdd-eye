package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297i4 implements InterfaceC1349j4 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14659m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14660n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2100x0 f14661a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f14662b;

    /* renamed from: c, reason: collision with root package name */
    public final C1401k2 f14663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14664d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14665e;

    /* renamed from: f, reason: collision with root package name */
    public final C2036vr f14666f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14667g;

    /* renamed from: h, reason: collision with root package name */
    public final TP f14668h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f14669j;

    /* renamed from: k, reason: collision with root package name */
    public int f14670k;

    /* renamed from: l, reason: collision with root package name */
    public long f14671l;

    public C1297i4(InterfaceC2100x0 interfaceC2100x0, T0 t02, C1401k2 c1401k2) throws P4 {
        this.f14661a = interfaceC2100x0;
        this.f14662b = t02;
        this.f14663c = c1401k2;
        int i = c1401k2.f15054b;
        int iMax = Math.max(1, i / 10);
        this.f14667g = iMax;
        C2036vr c2036vr = new C2036vr((byte[]) c1401k2.f15057e);
        c2036vr.M();
        int iM = c2036vr.M();
        this.f14664d = iM;
        int i3 = c1401k2.f15053a;
        int i6 = c1401k2.f15055c;
        int i7 = (((i6 - (i3 * 4)) * 8) / (c1401k2.f15056d * i3)) + 1;
        if (iM != i7) {
            throw P4.a(null, A.f.o(new StringBuilder(String.valueOf(i7).length() + 34 + String.valueOf(iM).length()), "Expected frames per block: ", i7, "; got: ", iM));
        }
        String str = Vt.f12096a;
        int i8 = ((iMax + iM) - 1) / iM;
        this.f14665e = new byte[i8 * i6];
        this.f14666f = new C2036vr((iM + iM) * i3 * i8);
        int i9 = ((i6 * i) * 8) / iM;
        C1855sP c1855sP = new C1855sP();
        c1855sP.e("audio/raw");
        c1855sP.f16728g = i9;
        c1855sP.f16729h = i9;
        c1855sP.f16733m = (iMax + iMax) * i3;
        c1855sP.f16714D = i3;
        c1855sP.f16715E = i;
        c1855sP.f16716F = 2;
        this.f14668h = new TP(c1855sP);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    public final void a(int i, long j6) {
        this.f14661a.A(new C1511m4(this.f14663c, this.f14664d, i, j6));
        this.f14662b.e(this.f14668h);
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
    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.google.android.gms.internal.ads.InterfaceC2046w0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1297i4.b(com.google.android.gms.internal.ads.w0, long):boolean");
    }

    public final void c(int i) {
        C1401k2 c1401k2 = this.f14663c;
        long jU = this.f14669j + Vt.u(this.f14671l, 1000000L, c1401k2.f15054b, RoundingMode.DOWN);
        int i3 = (i + i) * c1401k2.f15053a;
        this.f14662b.c(jU, 1, i3, this.f14670k - i3, null);
        this.f14671l += i;
        this.f14670k -= i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    public final void g(long j6) {
        this.i = 0;
        this.f14669j = j6;
        this.f14670k = 0;
        this.f14671l = 0L;
    }
}
