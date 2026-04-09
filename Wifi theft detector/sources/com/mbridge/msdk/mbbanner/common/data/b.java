package com.mbridge.msdk.mbbanner.common.data;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f15751a;

    /* renamed from: b, reason: collision with root package name */
    private String f15752b;

    /* renamed from: c, reason: collision with root package name */
    private String f15753c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f15754d;

    /* renamed from: e, reason: collision with root package name */
    private int f15755e;

    public b(String str, String str2, int i10, int i11) {
        this.f15751a = str;
        this.f15752b = str2;
        this.f15754d = i10;
        this.f15755e = i11;
    }

    public void a(int i10) {
        this.f15754d = i10;
    }

    public void b(String str) {
        this.f15752b = str;
    }

    public int c() {
        return this.f15754d;
    }

    public String d() {
        return this.f15752b;
    }

    public String a() {
        return this.f15753c;
    }

    public int b() {
        return this.f15755e;
    }

    public void a(String str) {
        this.f15753c = str;
    }
}
