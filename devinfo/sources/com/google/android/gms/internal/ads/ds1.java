package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ds1 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10546a;

    public ds1(LinkedHashMap linkedHashMap) {
        this.f10546a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }
}
