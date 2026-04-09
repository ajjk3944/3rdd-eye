package com.mbridge.msdk.dycreator.error;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f14573a;

    /* renamed from: b, reason: collision with root package name */
    private String f14574b;

    public a(b bVar) {
        if (bVar != null) {
            this.f14573a = bVar.g();
            this.f14574b = bVar.h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f14573a + '}';
    }

    public a(int i10, String str) {
        this.f14573a = i10;
        this.f14574b = str;
    }
}
