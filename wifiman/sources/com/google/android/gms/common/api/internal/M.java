package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N3.l f34774a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f34775b;

    M(O o10, N3.l lVar) {
        this.f34775b = o10;
        this.f34774a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O.p0(this.f34775b, this.f34774a);
    }
}
