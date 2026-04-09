package com.yandex.mobile.ads.impl;

import b9.m;
import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class tf0 {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f33570b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33571c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Boolean> f33572a = f33570b;

    public final boolean a(int i, String host) {
        Object objA;
        kotlin.jvm.internal.l.f(host, "host");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.f33572a;
        Boolean boolValueOf = concurrentHashMap.get(host);
        if (boolValueOf == null) {
            j82.f29019a.getClass();
            try {
                objA = Boolean.valueOf(InetAddress.getByName(host).isReachable(i));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            Boolean bool = (Boolean) objA;
            boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Boolean boolPutIfAbsent = concurrentHashMap.putIfAbsent(host, boolValueOf);
            if (boolPutIfAbsent != null) {
                boolValueOf = boolPutIfAbsent;
            }
        }
        return boolValueOf.booleanValue();
    }
}
