package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class hp1 {

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f11936b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11937a;

    public hp1(int i4) {
        switch (i4) {
            case 5:
                this.f11937a = new fh();
                break;
            default:
                this.f11937a = new Object();
                break;
        }
    }

    public abstract void B1();

    public abstract long F();

    public abstract void G(Object obj, long j, byte b10);

    public MessageDigest H() {
        synchronized (this.f11937a) {
            MessageDigest messageDigest = f11936b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i4 = 0; i4 < 2; i4++) {
                try {
                    f11936b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f11936b;
        }
    }

    public abstract boolean I(Object obj, long j);

    public abstract void L(int i4, long j);

    public abstract void O(Object obj, long j, boolean z3);

    public abstract float Z0(Object obj, long j);

    public abstract void a1(Object obj, long j, float f10);

    public abstract double b1(Object obj, long j);

    public abstract void c1(Object obj, long j, double d10);

    public abstract byte d1(long j);

    public abstract int e1();

    public abstract int f1();

    public abstract boolean h1();

    public abstract void i1();

    public abstract go j1();

    public synchronized void k1(q80 q80Var) {
        m1(q80Var.f15257a, q80Var.f15258b);
    }

    public abstract uh l1();

    public synchronized void m1(Object obj, Executor executor) {
        ((HashMap) this.f11937a).put(obj, executor);
    }

    public abstract int n1();

    public abstract int o1();

    public synchronized void p1(c80 c80Var) {
        for (Map.Entry entry : ((HashMap) this.f11937a).entrySet()) {
            ((Executor) entry.getValue()).execute(new q81(19, c80Var, entry.getKey()));
        }
    }

    public abstract long q1();

    public abstract long r1();

    public abstract boolean s1();

    public abstract int t1();

    public abstract int z();

    public hp1(View view) {
        this.f11937a = new WeakReference(view);
    }

    public hp1(Set set) {
        this.f11937a = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                k1((q80) it.next());
            }
        }
    }
}
