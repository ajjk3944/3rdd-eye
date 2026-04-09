package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a3<T extends a2> {

    /* renamed from: a, reason: collision with root package name */
    private int f21415a;

    /* renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f21416b = new LinkedBlockingQueue();

    private a3(int i4) {
        this.f21415a = i4;
    }

    public static a3 a(int i4) {
        return new a3(i4);
    }

    public T a() {
        return this.f21416b.poll();
    }
}
