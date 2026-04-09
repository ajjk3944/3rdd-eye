package com.bytedance.sdk.component.pno.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class vt implements Comparable<vt>, Runnable {
    long fkw;

    /* renamed from: le, reason: collision with root package name */
    long f7613le;

    /* renamed from: lh, reason: collision with root package name */
    public int f7614lh;
    private Runnable ouw;
    long ra;
    public String yu;

    public vt(String str) {
        this.f7614lh = 5;
        this.yu = str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
        int i4 = this.f7614lh;
        int i10 = vtVar.f7614lh;
        if (i4 < i10) {
            return 1;
        }
        return i4 >= i10 ? -1 : 0;
    }

    public final Runnable ouw() {
        return this.ouw;
    }

    public vt(int i4, String str) {
        this.f7614lh = i4;
        this.yu = str;
    }

    public vt(String str, Runnable runnable) {
        this.f7614lh = 5;
        this.yu = str;
        this.ouw = runnable;
    }
}
