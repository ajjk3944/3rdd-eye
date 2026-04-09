package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int f12839a;

    /* renamed from: b, reason: collision with root package name */
    private String f12840b;

    /* renamed from: c, reason: collision with root package name */
    private int f12841c;

    /* renamed from: d, reason: collision with root package name */
    private int f12842d;

    /* renamed from: e, reason: collision with root package name */
    private int f12843e;

    public void a(String str) {
        this.f12840b = str;
    }

    public int b() {
        return this.f12842d;
    }

    public int c() {
        return this.f12841c;
    }

    public int d() {
        return this.f12839a;
    }

    public String e() {
        return this.f12840b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f12839a + ", session_id='" + this.f12840b + "', offset=" + this.f12841c + ", expectWidth=" + this.f12842d + ", expectHeight=" + this.f12843e + '}';
    }

    public int a() {
        return this.f12843e;
    }

    public void b(int i10) {
        this.f12842d = i10;
    }

    public void c(int i10) {
        this.f12841c = i10;
    }

    public void d(int i10) {
        this.f12839a = i10;
    }

    public void a(int i10) {
        this.f12843e = i10;
    }
}
