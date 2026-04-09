package com.mbridge.msdk.mbbid.out;

/* loaded from: classes3.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: d, reason: collision with root package name */
    private int f15922d;

    /* renamed from: e, reason: collision with root package name */
    private int f15923e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f15922d = i11;
        this.f15923e = i10;
    }

    public int getHeight() {
        return this.f15922d;
    }

    public int getWidth() {
        return this.f15923e;
    }

    public void setHeight(int i10) {
        this.f15922d = i10;
    }

    public void setWidth(int i10) {
        this.f15923e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f15922d = i11;
        this.f15923e = i10;
    }
}
