package com.squareup.picasso;

import android.os.Message;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5915a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5916d;

    public /* synthetic */ k(int i10, Object obj) {
        this.f5915a = i10;
        this.f5916d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5915a) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + ((Message) this.f5916d).what);
            case 1:
                throw new AssertionError("Unhandled stats message." + ((Message) this.f5916d).what);
            default:
                throw new RuntimeException((Exception) this.f5916d);
        }
    }
}
