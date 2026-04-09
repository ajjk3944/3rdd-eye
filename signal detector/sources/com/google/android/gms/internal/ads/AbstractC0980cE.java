package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.cE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0980cE {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f13543a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f13543a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        throw A.f.f(it);
    }
}
