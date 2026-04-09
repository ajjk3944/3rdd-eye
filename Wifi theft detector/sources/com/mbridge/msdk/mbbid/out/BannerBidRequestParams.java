package com.mbridge.msdk.mbbid.out;

/* loaded from: classes3.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: d, reason: collision with root package name */
    private int f15924d;

    /* renamed from: e, reason: collision with root package name */
    private int f15925e;

    public BannerBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f15924d = i11;
        this.f15925e = i10;
    }

    public int getHeight() {
        return this.f15924d;
    }

    public int getWidth() {
        return this.f15925e;
    }

    public void setHeight(int i10) {
        this.f15924d = i10;
    }

    public void setWidth(int i10) {
        this.f15925e = i10;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f15924d = i11;
        this.f15925e = i10;
    }
}
