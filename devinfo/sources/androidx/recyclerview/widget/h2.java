package androidx.recyclerview.widget;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1400a;

    /* renamed from: b, reason: collision with root package name */
    public int f1401b;

    /* renamed from: c, reason: collision with root package name */
    public int f1402c;

    /* renamed from: d, reason: collision with root package name */
    public int f1403d;

    /* renamed from: e, reason: collision with root package name */
    public int f1404e;

    public final boolean a() {
        int i4 = this.f1400a;
        int i10 = 2;
        if ((i4 & 7) != 0) {
            int i11 = this.f1403d;
            int i12 = this.f1401b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & AppLovinMediationAdapter.ERROR_CHILD_USER) != 0) {
            int i13 = this.f1403d;
            int i14 = this.f1402c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i15 = this.f1404e;
            int i16 = this.f1401b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i17 = this.f1404e;
            int i18 = this.f1402c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i4 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
