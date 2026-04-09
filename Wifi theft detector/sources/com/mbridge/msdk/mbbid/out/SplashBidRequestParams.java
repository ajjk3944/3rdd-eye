package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;

/* loaded from: classes3.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: g, reason: collision with root package name */
    private static int f15930g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static int f15931h;

    /* renamed from: i, reason: collision with root package name */
    private static int f15932i;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15933f;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public boolean a() {
        return this.f15933f;
    }

    public int getOrientation() {
        return f15930g;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f15930g, f15932i, f15931h);
    }

    private void a(int i10, int i11) {
        int iN = m0.n(c.n().d());
        int iM = m0.m(c.n().d());
        int i12 = f15930g;
        if (i12 == 1) {
            if (iM > i11 * 4) {
                setHeight(iM - i11);
                setWidth(iN);
                return;
            } else {
                setHeight(0);
                setWidth(0);
                return;
            }
        }
        if (i12 == 2) {
            if (iN > i10 * 4) {
                setWidth(iN - i10);
                setHeight(iM);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
    }

    public SplashBidRequestParams(String str, String str2, boolean z10, int i10, int i11, int i12) {
        this(str, str2, "", z10, i10, i12, i11);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        super(str, str2, str3, 0, 0);
        this.f15933f = false;
        f15930g = i10;
        a(i11, i12);
        this.f15933f = z10;
    }
}
