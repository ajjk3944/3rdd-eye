package com.mbridge.msdk.video.dynview.error;

/* loaded from: classes3.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: a, reason: collision with root package name */
    private int f18745a;

    /* renamed from: b, reason: collision with root package name */
    private String f18746b;

    a(int i10, String str) {
        this.f18745a = i10;
        this.f18746b = str;
    }

    public int g() {
        return this.f18745a;
    }

    public String h() {
        return this.f18746b;
    }
}
