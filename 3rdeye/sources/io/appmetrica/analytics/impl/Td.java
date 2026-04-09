package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes3.dex */
public final class Td implements Xk {

    /* renamed from: a, reason: collision with root package name */
    public final int f40177a;

    public Td(int i) {
        this.f40177a = i;
    }

    @Override // io.appmetrica.analytics.impl.Xk
    public final boolean a(String str) {
        return this.f40177a != Process.myPid();
    }
}
