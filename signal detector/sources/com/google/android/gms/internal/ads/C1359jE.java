package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.jE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1359jE extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f14918a;

    public C1359jE() {
        this.f14918a = 2008;
    }

    public C1359jE(String str, int i) {
        super(str);
        this.f14918a = i;
    }

    public C1359jE(String str, Exception exc, int i) {
        super(str, exc);
        this.f14918a = i;
    }

    public C1359jE(Exception exc, int i) {
        super(exc);
        this.f14918a = i;
    }
}
