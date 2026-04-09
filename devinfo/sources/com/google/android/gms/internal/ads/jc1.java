package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class jc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f12714a = Logger.getLogger(jc1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f12715b = new AtomicBoolean(false);

    public static boolean a() {
        return f12715b.get();
    }
}
