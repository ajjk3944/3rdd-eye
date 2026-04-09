package com.mbridge.msdk.mbbid.common;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f15904a;

    /* renamed from: b, reason: collision with root package name */
    private String f15905b;

    /* renamed from: c, reason: collision with root package name */
    private String f15906c;

    public c(String str, String str2) {
        this.f15904a = str;
        this.f15905b = str2;
    }

    public String getmFloorPrice() {
        return this.f15906c;
    }

    public String getmPlacementId() {
        return this.f15904a;
    }

    public String getmUnitId() {
        return this.f15905b;
    }

    public void setmFloorPrice(String str) {
        this.f15906c = str;
    }

    public void setmPlacementId(String str) {
        this.f15904a = str;
    }

    public void setmUnitId(String str) {
        this.f15905b = str;
    }

    public c(String str, String str2, String str3) {
        this.f15904a = str;
        this.f15905b = str2;
        this.f15906c = str3;
    }
}
