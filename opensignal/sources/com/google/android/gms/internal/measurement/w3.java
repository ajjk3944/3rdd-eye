package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p.v2 f5244a;

    static {
        p.v2 v2Var;
        Uri uri = x3.f5255a;
        synchronized (y3.class) {
            try {
                if (y3.f5267a == null) {
                    p.v2 v2Var2 = new p.v2();
                    synchronized (y3.class) {
                        if (y3.f5267a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        y3.f5267a = v2Var2;
                    }
                }
                v2Var = y3.f5267a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f5244a = v2Var;
    }
}
