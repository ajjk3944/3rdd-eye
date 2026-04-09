package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class a3<T extends a2> {

    /* renamed from: a, reason: collision with root package name */
    private int f19539a;

    /* renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f19540b = new LinkedBlockingQueue();

    private a3(int i) {
        this.f19539a = i;
    }

    public static a3 a(int i) {
        return new a3(i);
    }

    public T a() {
        return this.f19540b.poll();
    }
}
