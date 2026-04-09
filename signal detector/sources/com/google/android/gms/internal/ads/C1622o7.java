package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622o7 {

    /* renamed from: a, reason: collision with root package name */
    public final X6 f15897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15898b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15899c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f15901e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f15900d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f15902f = new CountDownLatch(1);

    public C1622o7(X6 x6, String str, String str2, Class... clsArr) {
        this.f15897a = x6;
        this.f15898b = str;
        this.f15899c = str2;
        this.f15901e = clsArr;
        x6.f12376b.submit(new RunnableC1883t(7, this));
    }
}
