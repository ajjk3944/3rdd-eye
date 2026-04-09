package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0490Ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0507Fi f7983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7985d;

    public /* synthetic */ RunnableC0490Ei(C0507Fi c0507Fi, int i, int i3, int i6) {
        this.f7982a = i6;
        this.f7983b = c0507Fi;
        this.f7984c = i;
        this.f7985d = i3;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f7982a) {
            case 0:
                C0507Fi c0507Fi = this.f7983b;
                c0507Fi.f8165b.execute(new RunnableC0490Ei(c0507Fi, this.f7984c, this.f7985d, 1));
                break;
            default:
                this.f7983b.c(this.f7984c - 1, this.f7985d);
                break;
        }
    }
}
