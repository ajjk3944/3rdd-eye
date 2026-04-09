package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int f17284a;

    /* renamed from: b, reason: collision with root package name */
    private String f17285b;

    /* renamed from: c, reason: collision with root package name */
    private int f17286c;

    /* renamed from: d, reason: collision with root package name */
    private int f17287d;

    /* renamed from: e, reason: collision with root package name */
    private int f17288e;

    public void a(String str) {
        this.f17285b = str;
    }

    public int b() {
        return this.f17287d;
    }

    public int c() {
        return this.f17286c;
    }

    public int d() {
        return this.f17284a;
    }

    public String e() {
        return this.f17285b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f17284a + ", session_id='" + this.f17285b + "', offset=" + this.f17286c + ", expectWidth=" + this.f17287d + ", expectHeight=" + this.f17288e + '}';
    }

    public int a() {
        return this.f17288e;
    }

    public void b(int i10) {
        this.f17287d = i10;
    }

    public void c(int i10) {
        this.f17286c = i10;
    }

    public void d(int i10) {
        this.f17284a = i10;
    }

    public void a(int i10) {
        this.f17288e = i10;
    }
}
