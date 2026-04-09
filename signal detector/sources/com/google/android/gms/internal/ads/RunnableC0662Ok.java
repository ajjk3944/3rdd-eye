package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0662Ok implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10228a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f10229b;

    public /* synthetic */ RunnableC0662Ok(C0679Pk c0679Pk, int i) {
        this.f10228a = i;
        switch (i) {
            case 1:
                this.f10229b = new WeakReference(c0679Pk);
                break;
            default:
                this.f10229b = new WeakReference(c0679Pk);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10228a) {
            case 0:
                C0679Pk c0679Pk = (C0679Pk) this.f10229b.get();
                if (c0679Pk != null) {
                    c0679Pk.C1(C1652ok.M);
                    break;
                }
                break;
            default:
                C0679Pk c0679Pk2 = (C0679Pk) this.f10229b.get();
                if (c0679Pk2 != null) {
                    c0679Pk2.C1(C1652ok.f16033L);
                    break;
                }
                break;
        }
    }
}
