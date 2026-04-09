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

/* loaded from: classes.dex */
public abstract class VL {

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f11984b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11985a;

    public VL(int i) {
        switch (i) {
            case 5:
                this.f11985a = new U7();
                break;
            default:
                this.f11985a = new Object();
                break;
        }
    }

    public abstract int A1();

    public abstract int B1();

    public synchronized void C1(InterfaceC1223gl interfaceC1223gl) {
        for (Map.Entry entry : ((HashMap) this.f11985a).entrySet()) {
            ((Executor) entry.getValue()).execute(new CD(interfaceC1223gl, 20, entry.getKey()));
        }
    }

    public abstract long D1();

    public abstract long E1();

    public abstract boolean F1();

    public abstract int G1();

    public abstract long O();

    public abstract void Q(Object obj, long j6, byte b5);

    public MessageDigest S() {
        synchronized (this.f11985a) {
            MessageDigest messageDigest = f11984b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f11984b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f11984b;
        }
    }

    public abstract boolean U(long j6, Object obj);

    public abstract void X(int i, long j6);

    public abstract void Y(Object obj, long j6, boolean z6);

    public abstract float Z(long j6, Object obj);

    public abstract void i();

    public abstract int m();

    public abstract void m1(Object obj, long j6, float f2);

    public abstract double o1(long j6, Object obj);

    public abstract void p1(Object obj, long j6, double d6);

    public abstract byte q1(long j6);

    public abstract int r1();

    public abstract int s1();

    public abstract boolean t1();

    public abstract void u1();

    public abstract C2020vb v1();

    public synchronized void w1(C1922tl c1922tl) {
        z1(c1922tl.f16960a, c1922tl.f16961b);
    }

    public abstract AbstractC1353j8 y1();

    public synchronized void z1(Object obj, Executor executor) {
        ((HashMap) this.f11985a).put(obj, executor);
    }

    public VL(View view) {
        this.f11985a = new WeakReference(view);
    }

    public VL(Set set) {
        this.f11985a = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                w1((C1922tl) it.next());
            }
        }
    }
}
