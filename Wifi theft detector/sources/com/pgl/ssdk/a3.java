package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class a3<T extends a2> {

    /* renamed from: a, reason: collision with root package name */
    private int f19795a;

    /* renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f19796b = new LinkedBlockingQueue();

    private a3(int i10) {
        this.f19795a = i10;
    }

    public static a3 a(int i10) {
        return new a3(i10);
    }

    public T a() {
        return this.f19796b.poll();
    }
}
