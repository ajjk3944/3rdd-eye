package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j9 implements k9 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f12675m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12676n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final z1 f12677a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f12678b;

    /* renamed from: c, reason: collision with root package name */
    public final l5 f12679c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12680d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12681e;

    /* renamed from: f, reason: collision with root package name */
    public final sk0 f12682f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final mx1 f12683h;

    /* renamed from: i, reason: collision with root package name */
    public int f12684i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f12685k;

    /* renamed from: l, reason: collision with root package name */
    public long f12686l;

    public j9(z1 z1Var, u2 u2Var, l5 l5Var) throws ua {
        this.f12677a = z1Var;
        this.f12678b = u2Var;
        this.f12679c = l5Var;
        int i4 = l5Var.f13373b;
        int iMax = Math.max(1, i4 / 10);
        this.g = iMax;
        sk0 sk0Var = new sk0((byte[]) l5Var.f13376e);
        sk0Var.M();
        int iM = sk0Var.M();
        this.f12680d = iM;
        int i10 = l5Var.f13372a;
        int i11 = l5Var.f13374c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (l5Var.f13375d * i10)) + 1;
        if (iM != i12) {
            throw ua.a(null, je.u.q(i12, iM, "Expected frames per block: ", "; got: ", new StringBuilder(String.valueOf(i12).length() + 34 + String.valueOf(iM).length())));
        }
        String str = bq0.f9768a;
        int i13 = ((iMax + iM) - 1) / iM;
        this.f12681e = new byte[i13 * i11];
        this.f12682f = new sk0((iM + iM) * i10 * i13);
        int i14 = ((i11 * i4) * 8) / iM;
        lw1 lw1Var = new lw1();
        lw1Var.e("audio/raw");
        lw1Var.g = i14;
        lw1Var.f13658h = i14;
        lw1Var.f13662m = (iMax + iMax) * i10;
        lw1Var.D = i10;
        lw1Var.E = i4;
        lw1Var.F = 2;
        this.f12683h = new mx1(lw1Var);
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void a(int i4, long j) {
        this.f12677a.o(new n9(this.f12679c, this.f12680d, i4, j));
        this.f12678b.f(this.f12683h);
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
    @Override // com.google.android.gms.internal.ads.k9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.google.android.gms.internal.ads.y1 r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j9.b(com.google.android.gms.internal.ads.y1, long):boolean");
    }

    public final void c(int i4) {
        l5 l5Var = this.f12679c;
        long jU = this.j + bq0.u(this.f12686l, 1000000L, l5Var.f13373b, RoundingMode.DOWN);
        int i10 = (i4 + i4) * l5Var.f13372a;
        this.f12678b.d(jU, 1, i10, this.f12685k - i10, null);
        this.f12686l += i4;
        this.f12685k -= i10;
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void g(long j) {
        this.f12684i = 0;
        this.j = j;
        this.f12685k = 0;
        this.f12686l = 0L;
    }
}
