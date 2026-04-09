package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    public final ff f18721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18723c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f18725e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f18724d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f18726f = new CountDownLatch(1);

    public yf(ff ffVar, String str, String str2, Class... clsArr) {
        this.f18721a = ffVar;
        this.f18722b = str;
        this.f18723c = str2;
        this.f18725e = clsArr;
        ffVar.f11117b.submit(new s(6, this));
    }
}
