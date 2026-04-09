package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class y5 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f18640a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f18641b = "media3.common";

    public static synchronized void a(String str) {
        if (f18640a.add(str)) {
            String str2 = f18641b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f18641b = sb2.toString();
        }
    }
}
