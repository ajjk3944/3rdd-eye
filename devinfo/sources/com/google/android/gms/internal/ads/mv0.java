package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class mv0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14028a;

    /* renamed from: b, reason: collision with root package name */
    public int f14029b;

    public static String g(int i4) {
        char c9 = (char) ((i4 >> 24) & 255);
        char c10 = (char) ((i4 >> 16) & 255);
        char c11 = (char) ((i4 >> 8) & 255);
        char c12 = (char) (i4 & 255);
        StringBuilder sb2 = new StringBuilder(je.u.l(String.valueOf(c9).length(), String.valueOf(c10).length(), String.valueOf(c11).length(), String.valueOf(c12).length()));
        sb2.append(c9);
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        return sb2.toString();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public boolean f() {
        return h(1);
    }

    public boolean h(int i4) {
        return (this.f14029b & i4) == i4;
    }

    public String toString() {
        switch (this.f14028a) {
            case 0:
                return g(this.f14029b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mv0(int i4, int i10) {
        this.f14028a = i10;
        this.f14029b = i4;
    }
}
