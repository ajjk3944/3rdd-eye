package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.wF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2061wF {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f17415a = Logger.getLogger(AbstractC2061wF.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f17416b = new AtomicBoolean(false);

    public static boolean a() {
        return f17416b.get();
    }
}
