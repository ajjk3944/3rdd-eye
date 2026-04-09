package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24079f;

    public /* synthetic */ C1(Object obj, int i, int i10, long j4, int i11) {
        this.f24075b = i11;
        this.f24079f = obj;
        this.f24076c = i;
        this.f24077d = i10;
        this.f24078e = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24075b) {
            case 0:
                j60.a((j60) this.f24079f, this.f24076c, this.f24077d, this.f24078e);
                break;
            default:
                k60.a((k60) this.f24079f, this.f24076c, this.f24077d, this.f24078e);
                break;
        }
    }
}
