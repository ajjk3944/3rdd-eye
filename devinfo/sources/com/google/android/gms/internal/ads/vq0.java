package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17690c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17691d;

    public /* synthetic */ vq0(int i4, Object obj, boolean z3, boolean z10) {
        this.f17688a = i4;
        this.f17691d = obj;
        this.f17689b = z3;
        this.f17690c = z10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f17688a) {
            case 0:
                ((l90) ((ur0) this.f17691d).f17304d).t(this.f17689b, this.f17690c);
                break;
            default:
                ((fb.z) this.f17691d).d(this.f17689b, this.f17690c);
                break;
        }
    }
}
